import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!EAOLBHVU")
public final class Class2_Sub1_Sub1_Sub3 extends Class2_Sub1_Sub1 {

	@OriginalMember(owner = "client!EAOLBHVU", name = "k", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!EAOLBHVU", name = "q", descriptor = "Z")
	private boolean aBoolean48 = false;

	@OriginalMember(owner = "client!EAOLBHVU", name = "s", descriptor = "I")
	private int anInt135 = 8;

	@OriginalMember(owner = "client!EAOLBHVU", name = "u", descriptor = "I")
	private int anInt137;

	@OriginalMember(owner = "client!EAOLBHVU", name = "v", descriptor = "I")
	private int anInt138;

	@OriginalMember(owner = "client!EAOLBHVU", name = "w", descriptor = "I")
	private int anInt139;

	@OriginalMember(owner = "client!EAOLBHVU", name = "m", descriptor = "I")
	private int anInt130;

	@OriginalMember(owner = "client!EAOLBHVU", name = "n", descriptor = "I")
	private int anInt131;

	@OriginalMember(owner = "client!EAOLBHVU", name = "o", descriptor = "I")
	private int anInt132;

	@OriginalMember(owner = "client!EAOLBHVU", name = "p", descriptor = "I")
	private int anInt133;

	@OriginalMember(owner = "client!EAOLBHVU", name = "l", descriptor = "Lclient!EHYLCNJX;")
	private Class10 aClass10_2;

	@OriginalMember(owner = "client!EAOLBHVU", name = "t", descriptor = "I")
	private int anInt136;

	@OriginalMember(owner = "client!EAOLBHVU", name = "r", descriptor = "I")
	private int anInt134;

	@OriginalMember(owner = "client!EAOLBHVU", name = "x", descriptor = "I")
	private int anInt140;

	@OriginalMember(owner = "client!EAOLBHVU", name = "y", descriptor = "I")
	private int anInt141;

	@OriginalMember(owner = "client!EAOLBHVU", name = "z", descriptor = "[I")
	private int[] anIntArray59;

	@OriginalMember(owner = "client!EAOLBHVU", name = "<init>", descriptor = "(IIIIIIZIIZ)V")
	public Class2_Sub1_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		try {
			this.anInt137 = arg7;
			this.anInt138 = arg5;
			this.anInt139 = arg3;
			this.anInt130 = arg4;
			this.anInt131 = arg0;
			this.anInt132 = arg8;
			this.anInt133 = arg2;
			if (arg1 != -1) {
				this.aClass10_2 = Class10.aClass10Array1[arg1];
				this.anInt136 = 0;
				this.anInt134 = client.anInt878;
				if (arg6 && this.aClass10_2.anInt199 != -1) {
					this.anInt136 = (int) (Math.random() * (double) this.aClass10_2.anInt198);
					this.anInt134 -= (int) (Math.random() * (double) this.aClass10_2.method160(this.anInt136));
				}
			}
			@Pc(82) Class24 local82 = Class24.method307(this.anInt137);
			this.anInt140 = local82.anInt307;
			this.anInt141 = local82.anInt297;
			this.anIntArray59 = local82.anIntArray96;
		} catch (@Pc(96) RuntimeException local96) {
			signlink.reporterror("87094, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local96.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EAOLBHVU", name = "a", descriptor = "(I)Lclient!LXNLNZCU;")
	private Class24 method122(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(5) int local5 = -1;
			if (this.anInt140 != -1) {
				@Pc(14) Class15 local14 = Class15.aClass15Array1[this.anInt140];
				@Pc(17) int local17 = local14.anInt239;
				@Pc(20) int local20 = local14.anInt240;
				@Pc(23) int local23 = local14.anInt241;
				@Pc(29) int local29 = client.anIntArray276[local23 - local20];
				local5 = aClient1.anIntArray253[local17] >> local20 & local29;
			} else if (this.anInt141 != -1) {
				local5 = aClient1.anIntArray253[this.anInt141];
			}
			return local5 < 0 || local5 >= this.anIntArray59.length || this.anIntArray59[local5] == -1 ? null : Class24.method307(this.anIntArray59[local5]);
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("13676, " + arg0 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EAOLBHVU", name = "a", descriptor = "(B)Lclient!CYPZUKMB;")
	@Override
	protected Class2_Sub1_Sub1_Sub2 method455() {
		try {
			@Pc(3) int local3 = -1;
			if (this.aClass10_2 != null) {
				@Pc(17) int local17 = client.anInt878 - this.anInt134;
				if (local17 > 100 && this.aClass10_2.anInt199 > 0) {
					local17 = 100;
				}
				label43: {
					do {
						do {
							if (local17 <= this.aClass10_2.method160(this.anInt136)) {
								break label43;
							}
							local17 -= this.aClass10_2.method160(this.anInt136);
							this.anInt136++;
						} while (this.anInt136 < this.aClass10_2.anInt198);
						this.anInt136 -= this.aClass10_2.anInt199;
					} while (this.anInt136 >= 0 && this.anInt136 < this.aClass10_2.anInt198);
					this.aClass10_2 = null;
				}
				this.anInt134 = client.anInt878 - local17;
				if (this.aClass10_2 != null) {
					local3 = this.aClass10_2.anIntArray68[this.anInt136];
				}
			}
			@Pc(101) Class24 local101;
			if (this.anIntArray59 == null) {
				local101 = Class24.method307(this.anInt137);
			} else {
				local101 = this.method122(453);
			}
			return local101 == null ? null : local101.method317(this.anInt138, this.anInt139, this.anInt130, this.anInt131, this.anInt132, this.anInt133, local3);
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("88879, " + -99 + ", " + local130.toString());
			throw new RuntimeException();
		}
	}
}
