import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!VXTLNFMD")
public final class Class2_Sub1_Sub1_Sub5 extends Class2_Sub1_Sub1 {

	@OriginalMember(owner = "client!VXTLNFMD", name = "z", descriptor = "Lclient!client;")
	public static client aClient3;

	@OriginalMember(owner = "client!VXTLNFMD", name = "s", descriptor = "I")
	private int anInt740;

	@OriginalMember(owner = "client!VXTLNFMD", name = "t", descriptor = "I")
	private int anInt741;

	@OriginalMember(owner = "client!VXTLNFMD", name = "u", descriptor = "I")
	private int anInt742;

	@OriginalMember(owner = "client!VXTLNFMD", name = "n", descriptor = "I")
	private int anInt735;

	@OriginalMember(owner = "client!VXTLNFMD", name = "o", descriptor = "I")
	private int anInt736;

	@OriginalMember(owner = "client!VXTLNFMD", name = "p", descriptor = "I")
	private int anInt737;

	@OriginalMember(owner = "client!VXTLNFMD", name = "w", descriptor = "I")
	private int anInt743;

	@OriginalMember(owner = "client!VXTLNFMD", name = "q", descriptor = "I")
	private int anInt738;

	@OriginalMember(owner = "client!VXTLNFMD", name = "v", descriptor = "Lclient!SPUHKLMC;")
	private Class33 aClass33_2;

	@OriginalMember(owner = "client!VXTLNFMD", name = "x", descriptor = "I")
	private int anInt744;

	@OriginalMember(owner = "client!VXTLNFMD", name = "r", descriptor = "I")
	private int anInt739;

	@OriginalMember(owner = "client!VXTLNFMD", name = "l", descriptor = "I")
	private int anInt733;

	@OriginalMember(owner = "client!VXTLNFMD", name = "m", descriptor = "I")
	private int anInt734;

	@OriginalMember(owner = "client!VXTLNFMD", name = "y", descriptor = "[I")
	private int[] anIntArray139;

	@OriginalMember(owner = "client!VXTLNFMD", name = "<init>", descriptor = "(IIIZIIIIII)V")
	public Class2_Sub1_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		try {
			this.anInt740 = arg1;
			this.anInt741 = arg8;
			this.anInt742 = arg5;
			this.anInt735 = arg4;
			this.anInt736 = arg6;
			this.anInt737 = arg7;
			if (arg2 != 7) {
				this.anInt743 = -429;
			}
			this.anInt738 = arg0;
			if (arg9 != -1) {
				this.aClass33_2 = Class33.aClass33Array1[arg9];
				this.anInt744 = 0;
				this.anInt739 = client.anInt1013;
				if (arg3 && this.aClass33_2.anInt649 != -1) {
					this.anInt744 = (int) (Math.random() * (double) this.aClass33_2.anInt648);
					this.anInt739 -= (int) (Math.random() * (double) this.aClass33_2.method461(this.anInt744));
				}
			}
			@Pc(77) Class46 local77 = Class46.method546(this.anInt740);
			this.anInt733 = local77.anInt786;
			this.anInt734 = local77.anInt787;
			this.anIntArray139 = local77.anIntArray203;
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("21911, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VXTLNFMD", name = "b", descriptor = "(B)Lclient!YCVHWRKK;")
	private Class46 method500() {
		try {
			@Pc(8) int local8 = -1;
			if (this.anInt733 != -1) {
				@Pc(17) Class36 local17 = Class36.aClass36Array1[this.anInt733];
				@Pc(20) int local20 = local17.anInt702;
				@Pc(23) int local23 = local17.anInt703;
				@Pc(26) int local26 = local17.anInt704;
				@Pc(32) int local32 = client.anIntArray232[local26 - local23];
				local8 = aClient3.anIntArray268[local20] >> local23 & local32;
			} else if (this.anInt734 != -1) {
				local8 = aClient3.anIntArray268[this.anInt734];
			}
			return local8 < 0 || local8 >= this.anIntArray139.length || this.anIntArray139[local8] == -1 ? null : Class46.method546(this.anIntArray139[local8]);
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("97480, " + -70 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VXTLNFMD", name = "a", descriptor = "(B)Lclient!XBVYIDUH;")
	@Override
	protected Class2_Sub1_Sub1_Sub6 method507(@OriginalArg(0) byte arg0) {
		try {
			@Pc(3) int local3 = -1;
			if (this.aClass33_2 != null) {
				@Pc(11) int local11 = client.anInt1013 - this.anInt739;
				if (local11 > 100 && this.aClass33_2.anInt649 > 0) {
					local11 = 100;
				}
				label43: {
					do {
						do {
							if (local11 <= this.aClass33_2.method461(this.anInt744)) {
								break label43;
							}
							local11 -= this.aClass33_2.method461(this.anInt744);
							this.anInt744++;
						} while (this.anInt744 < this.aClass33_2.anInt648);
						this.anInt744 -= this.aClass33_2.anInt649;
					} while (this.anInt744 >= 0 && this.anInt744 < this.aClass33_2.anInt648);
					this.aClass33_2 = null;
				}
				this.anInt739 = client.anInt1013 - local11;
				if (this.aClass33_2 != null) {
					local3 = this.aClass33_2.anIntArray115[this.anInt744];
				}
			}
			@Pc(95) Class46 local95;
			if (this.anIntArray139 == null) {
				local95 = Class46.method546(this.anInt740);
			} else {
				local95 = this.method500();
			}
			if (local95 == null) {
				return null;
			} else {
				@Pc(121) Class2_Sub1_Sub1_Sub6 local121 = local95.method551(this.anInt741, this.anInt742, this.anInt735, this.anInt736, this.anInt737, this.anInt738, local3);
				@Pc(126) boolean local126 = false;
				return local121;
			}
		} catch (@Pc(135) RuntimeException local135) {
			signlink.reporterror("78437, " + arg0 + ", " + local135.toString());
			throw new RuntimeException();
		}
	}
}
