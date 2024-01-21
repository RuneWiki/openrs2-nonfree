import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!TDXKKGZV")
public final class Class39 {

	@OriginalMember(owner = "client!TDXKKGZV", name = "b", descriptor = "I")
	private int anInt624;

	@OriginalMember(owner = "client!TDXKKGZV", name = "c", descriptor = "[I")
	private int[] anIntArray138;

	@OriginalMember(owner = "client!TDXKKGZV", name = "d", descriptor = "[I")
	private int[] anIntArray139;

	@OriginalMember(owner = "client!TDXKKGZV", name = "e", descriptor = "I")
	public int anInt625;

	@OriginalMember(owner = "client!TDXKKGZV", name = "f", descriptor = "I")
	public int anInt626;

	@OriginalMember(owner = "client!TDXKKGZV", name = "g", descriptor = "I")
	public int anInt627;

	@OriginalMember(owner = "client!TDXKKGZV", name = "h", descriptor = "I")
	private int anInt628;

	@OriginalMember(owner = "client!TDXKKGZV", name = "i", descriptor = "I")
	private int anInt629;

	@OriginalMember(owner = "client!TDXKKGZV", name = "j", descriptor = "I")
	private int anInt630;

	@OriginalMember(owner = "client!TDXKKGZV", name = "k", descriptor = "I")
	private int anInt631;

	@OriginalMember(owner = "client!TDXKKGZV", name = "l", descriptor = "I")
	private int anInt632;

	@OriginalMember(owner = "client!TDXKKGZV", name = "a", descriptor = "Z")
	private boolean aBoolean189 = false;

	@OriginalMember(owner = "client!TDXKKGZV", name = "a", descriptor = "(ILclient!IMUIZRAF;)V")
	public void method422(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub1_Sub3 arg1) {
		try {
			this.anInt627 = arg1.method146();
			this.anInt625 = arg1.method151();
			this.anInt626 = arg1.method151();
			this.method423(arg1);
			if (arg0 != 8) {
				this.aBoolean189 = !this.aBoolean189;
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("56948, " + arg0 + ", " + arg1 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TDXKKGZV", name = "a", descriptor = "(ZLclient!IMUIZRAF;)V")
	public void method423(@OriginalArg(1) Class3_Sub1_Sub3 arg0) {
		try {
			this.anInt624 = arg0.method146();
			this.anIntArray138 = new int[this.anInt624];
			this.anIntArray139 = new int[this.anInt624];
			for (@Pc(18) int local18 = 0; local18 < this.anInt624; local18++) {
				this.anIntArray138[local18] = arg0.method148();
				this.anIntArray139[local18] = arg0.method148();
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("10961, " + false + ", " + arg0 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TDXKKGZV", name = "a", descriptor = "(I)V")
	public void method424() {
		try {
			this.anInt628 = 0;
			this.anInt629 = 0;
			this.anInt630 = 0;
			this.anInt631 = 0;
			this.anInt632 = 0;
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("80783, " + 4 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TDXKKGZV", name = "a", descriptor = "(II)I")
	public int method425(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt632 >= this.anInt628) {
				this.anInt631 = this.anIntArray139[this.anInt629++] << 15;
				if (this.anInt629 >= this.anInt624) {
					this.anInt629 = this.anInt624 - 1;
				}
				this.anInt628 = (int) ((double) this.anIntArray138[this.anInt629] / 65536.0D * (double) arg0);
				if (this.anInt628 > this.anInt632) {
					this.anInt630 = ((this.anIntArray139[this.anInt629] << 15) - this.anInt631) / (this.anInt628 - this.anInt632);
				}
			}
			this.anInt631 += this.anInt630;
			this.anInt632++;
			return this.anInt631 - this.anInt630 >> 15;
		} catch (@Pc(97) RuntimeException local97) {
			signlink.reporterror("18810, " + arg0 + ", " + -344 + ", " + local97.toString());
			throw new RuntimeException();
		}
	}
}
