import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!WYAAPLJP")
public final class Class3_Sub1_Sub1_Sub6 extends Class3_Sub1_Sub1 {

	@OriginalMember(owner = "client!WYAAPLJP", name = "n", descriptor = "Lclient!client;")
	public static client aClient3;

	@OriginalMember(owner = "client!WYAAPLJP", name = "m", descriptor = "Z")
	private boolean aBoolean175 = false;

	@OriginalMember(owner = "client!WYAAPLJP", name = "w", descriptor = "I")
	private int anInt752;

	@OriginalMember(owner = "client!WYAAPLJP", name = "x", descriptor = "I")
	private int anInt753;

	@OriginalMember(owner = "client!WYAAPLJP", name = "y", descriptor = "I")
	private int anInt754;

	@OriginalMember(owner = "client!WYAAPLJP", name = "p", descriptor = "I")
	private int anInt745;

	@OriginalMember(owner = "client!WYAAPLJP", name = "q", descriptor = "I")
	private int anInt746;

	@OriginalMember(owner = "client!WYAAPLJP", name = "r", descriptor = "I")
	private int anInt747;

	@OriginalMember(owner = "client!WYAAPLJP", name = "s", descriptor = "I")
	private int anInt748;

	@OriginalMember(owner = "client!WYAAPLJP", name = "z", descriptor = "Lclient!VYCKCNXO;")
	private Class39 aClass39_2;

	@OriginalMember(owner = "client!WYAAPLJP", name = "t", descriptor = "I")
	private int anInt749;

	@OriginalMember(owner = "client!WYAAPLJP", name = "l", descriptor = "I")
	private int anInt744;

	@OriginalMember(owner = "client!WYAAPLJP", name = "u", descriptor = "I")
	private int anInt750;

	@OriginalMember(owner = "client!WYAAPLJP", name = "v", descriptor = "I")
	private int anInt751;

	@OriginalMember(owner = "client!WYAAPLJP", name = "o", descriptor = "[I")
	private int[] anIntArray190;

	@OriginalMember(owner = "client!WYAAPLJP", name = "<init>", descriptor = "(IIZIIIIIII)V")
	public Class3_Sub1_Sub1_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		try {
			this.anInt752 = arg1;
			this.anInt753 = arg7;
			this.anInt754 = arg4;
			this.anInt745 = arg6;
			this.anInt746 = arg3;
			this.anInt747 = arg0;
			this.anInt748 = arg9;
			if (arg8 != -1) {
				this.aClass39_2 = Class39.aClass39Array1[arg8];
				this.anInt749 = 0;
				this.anInt744 = client.anInt1003;
				if (arg2 && this.aClass39_2.anInt724 != -1) {
					this.anInt749 = (int) (Math.random() * (double) this.aClass39_2.anInt723);
					this.anInt744 -= (int) (Math.random() * (double) this.aClass39_2.method492(this.anInt749));
				}
			}
			@Pc(74) Class18 local74 = Class18.method278(this.anInt752);
			this.anInt750 = local74.anInt470;
			this.anInt751 = local74.anInt485;
			this.anIntArray190 = local74.anIntArray79;
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("95754, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WYAAPLJP", name = "b", descriptor = "(Z)Lclient!MKWUPJYP;")
	private Class18 method507(@OriginalArg(0) boolean arg0) {
		try {
			if (arg0) {
				this.aBoolean175 = !this.aBoolean175;
			}
			@Pc(11) int local11 = -1;
			if (this.anInt750 != -1) {
				@Pc(20) Class22 local20 = Class22.aClass22Array1[this.anInt750];
				@Pc(23) int local23 = local20.anInt529;
				@Pc(26) int local26 = local20.anInt530;
				@Pc(29) int local29 = local20.anInt531;
				@Pc(35) int local35 = client.anIntArray229[local29 - local26];
				local11 = aClient3.anIntArray272[local23] >> local26 & local35;
			} else if (this.anInt751 != -1) {
				local11 = aClient3.anIntArray272[this.anInt751];
			}
			return local11 < 0 || local11 >= this.anIntArray190.length || this.anIntArray190[local11] == -1 ? null : Class18.method278(this.anIntArray190[local11]);
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("70786, " + arg0 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WYAAPLJP", name = "a", descriptor = "(Z)Lclient!OQIGXOFQ;")
	@Override
	protected Class3_Sub1_Sub1_Sub3 method506() {
		try {
			@Pc(3) int local3 = -1;
			if (this.aClass39_2 != null) {
				@Pc(11) int local11 = client.anInt1003 - this.anInt744;
				if (local11 > 100 && this.aClass39_2.anInt724 > 0) {
					local11 = 100;
				}
				label43: {
					do {
						do {
							if (local11 <= this.aClass39_2.method492(this.anInt749)) {
								break label43;
							}
							local11 -= this.aClass39_2.method492(this.anInt749);
							this.anInt749++;
						} while (this.anInt749 < this.aClass39_2.anInt723);
						this.anInt749 -= this.aClass39_2.anInt724;
					} while (this.anInt749 >= 0 && this.anInt749 < this.aClass39_2.anInt723);
					this.aClass39_2 = null;
				}
				this.anInt744 = client.anInt1003 - local11;
				if (this.aClass39_2 != null) {
					local3 = this.aClass39_2.anIntArray183[this.anInt749];
				}
			}
			@Pc(96) Class18 local96;
			if (this.anIntArray190 == null) {
				local96 = Class18.method278(this.anInt752);
			} else {
				local96 = this.method507(this.aBoolean175);
			}
			return local96 == null ? null : local96.method274(this.anInt753, this.anInt754, this.anInt745, this.anInt746, this.anInt747, this.anInt748, local3);
		} catch (@Pc(131) RuntimeException local131) {
			signlink.reporterror("54996, " + false + ", " + local131.toString());
			throw new RuntimeException();
		}
	}
}
