import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!AUPOWMGG")
public final class Class1 {

	@OriginalMember(owner = "client!AUPOWMGG", name = "c", descriptor = "I")
	private int anInt2;

	@OriginalMember(owner = "client!AUPOWMGG", name = "d", descriptor = "[I")
	private int[] anIntArray1;

	@OriginalMember(owner = "client!AUPOWMGG", name = "e", descriptor = "[I")
	private int[] anIntArray2;

	@OriginalMember(owner = "client!AUPOWMGG", name = "f", descriptor = "I")
	public int anInt3;

	@OriginalMember(owner = "client!AUPOWMGG", name = "g", descriptor = "I")
	public int anInt4;

	@OriginalMember(owner = "client!AUPOWMGG", name = "h", descriptor = "I")
	public int anInt5;

	@OriginalMember(owner = "client!AUPOWMGG", name = "i", descriptor = "I")
	private int anInt6;

	@OriginalMember(owner = "client!AUPOWMGG", name = "j", descriptor = "I")
	private int anInt7;

	@OriginalMember(owner = "client!AUPOWMGG", name = "k", descriptor = "I")
	private int anInt8;

	@OriginalMember(owner = "client!AUPOWMGG", name = "l", descriptor = "I")
	private int anInt9;

	@OriginalMember(owner = "client!AUPOWMGG", name = "m", descriptor = "I")
	private int anInt10;

	@OriginalMember(owner = "client!AUPOWMGG", name = "a", descriptor = "I")
	private int anInt1 = -17039;

	@OriginalMember(owner = "client!AUPOWMGG", name = "b", descriptor = "Z")
	private boolean aBoolean1 = true;

	@OriginalMember(owner = "client!AUPOWMGG", name = "a", descriptor = "(ZLclient!NHEPCMLW;)V")
	public void method1(@OriginalArg(1) Class3_Sub1_Sub3 arg0) {
		try {
			this.anInt5 = arg0.method274();
			this.anInt3 = arg0.method279();
			this.anInt4 = arg0.method279();
			this.method2(arg0);
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("73063, " + false + ", " + arg0 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AUPOWMGG", name = "a", descriptor = "(Lclient!NHEPCMLW;B)V")
	public void method2(@OriginalArg(0) Class3_Sub1_Sub3 arg0) {
		try {
			this.anInt2 = arg0.method274();
			this.anIntArray1 = new int[this.anInt2];
			this.anIntArray2 = new int[this.anInt2];
			for (@Pc(26) int local26 = 0; local26 < this.anInt2; local26++) {
				this.anIntArray1[local26] = arg0.method276();
				this.anIntArray2[local26] = arg0.method276();
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("12420, " + arg0 + ", " + 7 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AUPOWMGG", name = "a", descriptor = "(B)V")
	public void method3() {
		try {
			this.anInt6 = 0;
			this.anInt7 = 0;
			this.anInt8 = 0;
			this.anInt9 = 0;
			this.anInt10 = 0;
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("25492, " + 1 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AUPOWMGG", name = "a", descriptor = "(ZI)I")
	public int method4(@OriginalArg(1) int arg0) {
		try {
			if (this.anInt10 >= this.anInt6) {
				this.anInt9 = this.anIntArray2[this.anInt7++] << 15;
				if (this.anInt7 >= this.anInt2) {
					this.anInt7 = this.anInt2 - 1;
				}
				this.anInt6 = (int) ((double) this.anIntArray1[this.anInt7] / 65536.0D * (double) arg0);
				if (this.anInt6 > this.anInt10) {
					this.anInt8 = ((this.anIntArray2[this.anInt7] << 15) - this.anInt9) / (this.anInt6 - this.anInt10);
				}
			}
			this.anInt9 += this.anInt8;
			this.anInt10++;
			return this.anInt9 - this.anInt8 >> 15;
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("40442, " + false + ", " + arg0 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}
}
