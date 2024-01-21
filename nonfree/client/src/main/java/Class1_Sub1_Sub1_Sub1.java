import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!FDWERTGB")
public final class Class1_Sub1_Sub1_Sub1 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!FDWERTGB", name = "m", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!FDWERTGB", name = "n", descriptor = "I")
	private int anInt112;

	@OriginalMember(owner = "client!FDWERTGB", name = "o", descriptor = "I")
	private int anInt113;

	@OriginalMember(owner = "client!FDWERTGB", name = "p", descriptor = "I")
	private int anInt114;

	@OriginalMember(owner = "client!FDWERTGB", name = "w", descriptor = "I")
	private int anInt119;

	@OriginalMember(owner = "client!FDWERTGB", name = "x", descriptor = "I")
	private int anInt120;

	@OriginalMember(owner = "client!FDWERTGB", name = "y", descriptor = "I")
	private int anInt121;

	@OriginalMember(owner = "client!FDWERTGB", name = "z", descriptor = "I")
	private int anInt122;

	@OriginalMember(owner = "client!FDWERTGB", name = "v", descriptor = "Lclient!XRDQTWLL;")
	private Class46 aClass46_1;

	@OriginalMember(owner = "client!FDWERTGB", name = "t", descriptor = "I")
	private int anInt118;

	@OriginalMember(owner = "client!FDWERTGB", name = "s", descriptor = "I")
	private int anInt117;

	@OriginalMember(owner = "client!FDWERTGB", name = "q", descriptor = "I")
	private int anInt115;

	@OriginalMember(owner = "client!FDWERTGB", name = "r", descriptor = "I")
	private int anInt116;

	@OriginalMember(owner = "client!FDWERTGB", name = "u", descriptor = "[I")
	private int[] anIntArray22;

	@OriginalMember(owner = "client!FDWERTGB", name = "<init>", descriptor = "(IIIIZIIIIZ)V")
	public Class1_Sub1_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		try {
			this.anInt112 = arg6;
			this.anInt113 = arg5;
			this.anInt114 = arg1;
			this.anInt119 = arg0;
			this.anInt120 = arg3;
			this.anInt121 = arg2;
			this.anInt122 = arg7;
			if (arg8 != -1) {
				this.aClass46_1 = Class46.aClass46Array1[arg8];
				this.anInt118 = 0;
				this.anInt117 = client.anInt1011;
				if (arg4 && this.aClass46_1.anInt772 != -1) {
					this.anInt118 = (int) (Math.random() * (double) this.aClass46_1.anInt771);
					this.anInt117 -= (int) (Math.random() * (double) this.aClass46_1.method550(this.anInt118));
				}
			}
			@Pc(77) Class48 local77 = Class48.method567(this.anInt112);
			this.anInt115 = local77.anInt795;
			this.anInt116 = local77.anInt805;
			this.anIntArray22 = local77.anIntArray206;
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("99633, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FDWERTGB", name = "a", descriptor = "(Z)Lclient!GCSAWSJV;")
	@Override
	protected Class1_Sub1_Sub1_Sub2 method555() {
		try {
			@Pc(9) int local9 = -1;
			if (this.aClass46_1 != null) {
				@Pc(17) int local17 = client.anInt1011 - this.anInt117;
				if (local17 > 100 && this.aClass46_1.anInt772 > 0) {
					local17 = 100;
				}
				label43: {
					do {
						do {
							if (local17 <= this.aClass46_1.method550(this.anInt118)) {
								break label43;
							}
							local17 -= this.aClass46_1.method550(this.anInt118);
							this.anInt118++;
						} while (this.anInt118 < this.aClass46_1.anInt771);
						this.anInt118 -= this.aClass46_1.anInt772;
					} while (this.anInt118 >= 0 && this.anInt118 < this.aClass46_1.anInt771);
					this.aClass46_1 = null;
				}
				this.anInt117 = client.anInt1011 - local17;
				if (this.aClass46_1 != null) {
					local9 = this.aClass46_1.anIntArray198[this.anInt118];
				}
			}
			@Pc(101) Class48 local101;
			if (this.anIntArray22 == null) {
				local101 = Class48.method567(this.anInt112);
			} else {
				local101 = this.method134();
			}
			return local101 == null ? null : local101.method558(this.anInt113, this.anInt114, this.anInt119, this.anInt120, this.anInt121, this.anInt122, local9);
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("5978, " + false + ", " + local130.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FDWERTGB", name = "a", descriptor = "(I)Lclient!YJMLCFGC;")
	private Class48 method134() {
		try {
			@Pc(1) int local1 = -1;
			if (this.anInt115 != -1) {
				@Pc(16) Class30 local16 = Class30.aClass30Array1[this.anInt115];
				@Pc(19) int local19 = local16.anInt576;
				@Pc(22) int local22 = local16.anInt577;
				@Pc(25) int local25 = local16.anInt578;
				@Pc(31) int local31 = client.anIntArray253[local25 - local22];
				local1 = aClient1.anIntArray232[local19] >> local22 & local31;
			} else if (this.anInt116 != -1) {
				local1 = aClient1.anIntArray232[this.anInt116];
			}
			return local1 < 0 || local1 >= this.anIntArray22.length || this.anIntArray22[local1] == -1 ? null : Class48.method567(this.anIntArray22[local1]);
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("1450, " + 825 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}
}
