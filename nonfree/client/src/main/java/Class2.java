import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ANPSASQF")
public final class Class2 {

	@OriginalMember(owner = "client!ANPSASQF", name = "d", descriptor = "I")
	private int anInt22;

	@OriginalMember(owner = "client!ANPSASQF", name = "e", descriptor = "[I")
	private int[] anIntArray1;

	@OriginalMember(owner = "client!ANPSASQF", name = "f", descriptor = "[I")
	private int[] anIntArray2;

	@OriginalMember(owner = "client!ANPSASQF", name = "g", descriptor = "I")
	public int anInt23;

	@OriginalMember(owner = "client!ANPSASQF", name = "h", descriptor = "I")
	public int anInt24;

	@OriginalMember(owner = "client!ANPSASQF", name = "i", descriptor = "I")
	public int anInt25;

	@OriginalMember(owner = "client!ANPSASQF", name = "j", descriptor = "I")
	private int anInt26;

	@OriginalMember(owner = "client!ANPSASQF", name = "k", descriptor = "I")
	private int anInt27;

	@OriginalMember(owner = "client!ANPSASQF", name = "l", descriptor = "I")
	private int anInt28;

	@OriginalMember(owner = "client!ANPSASQF", name = "m", descriptor = "I")
	private int anInt29;

	@OriginalMember(owner = "client!ANPSASQF", name = "n", descriptor = "I")
	private int anInt30;

	@OriginalMember(owner = "client!ANPSASQF", name = "a", descriptor = "Z")
	private boolean aBoolean8 = false;

	@OriginalMember(owner = "client!ANPSASQF", name = "b", descriptor = "I")
	private int anInt20 = 159;

	@OriginalMember(owner = "client!ANPSASQF", name = "c", descriptor = "I")
	private int anInt21 = 5230;

	@OriginalMember(owner = "client!ANPSASQF", name = "a", descriptor = "(BLclient!EYMNCFMK;)V")
	public void method13(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			this.anInt25 = arg0.method155();
			this.anInt23 = arg0.method160();
			this.anInt24 = arg0.method160();
			this.method14(arg0, this.anInt21);
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("83606, " + 5 + ", " + arg0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ANPSASQF", name = "a", descriptor = "(Lclient!EYMNCFMK;I)V")
	public void method14(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 != 5230) {
				this.anInt20 = 469;
			}
			this.anInt22 = arg0.method155();
			this.anIntArray1 = new int[this.anInt22];
			this.anIntArray2 = new int[this.anInt22];
			for (@Pc(21) int local21 = 0; local21 < this.anInt22; local21++) {
				this.anIntArray1[local21] = arg0.method157();
				this.anIntArray2[local21] = arg0.method157();
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("54938, " + arg0 + ", " + arg1 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ANPSASQF", name = "a", descriptor = "(I)V")
	public void method15() {
		try {
			this.anInt26 = 0;
			this.anInt27 = 0;
			this.anInt28 = 0;
			this.anInt29 = 0;
			this.anInt30 = 0;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("72161, " + 3 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ANPSASQF", name = "a", descriptor = "(BI)I")
	public int method16(@OriginalArg(1) int arg0) {
		try {
			if (this.anInt30 >= this.anInt26) {
				this.anInt29 = this.anIntArray2[this.anInt27++] << 15;
				if (this.anInt27 >= this.anInt22) {
					this.anInt27 = this.anInt22 - 1;
				}
				this.anInt26 = (int) ((double) this.anIntArray1[this.anInt27] / 65536.0D * (double) arg0);
				if (this.anInt26 > this.anInt30) {
					this.anInt28 = ((this.anIntArray2[this.anInt27] << 15) - this.anInt29) / (this.anInt26 - this.anInt30);
				}
			}
			this.anInt29 += this.anInt28;
			this.anInt30++;
			return this.anInt29 - this.anInt28 >> 15;
		} catch (@Pc(94) RuntimeException local94) {
			signlink.reporterror("69038, " + 75 + ", " + arg0 + ", " + local94.toString());
			throw new RuntimeException();
		}
	}
}
