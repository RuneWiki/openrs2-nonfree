import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!GEKFXIMX")
public final class Class4_Sub1_Sub2_Sub2 extends Class4_Sub1_Sub2 {

	@OriginalMember(owner = "client!GEKFXIMX", name = "l", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!GEKFXIMX", name = "v", descriptor = "I")
	private int anInt118;

	@OriginalMember(owner = "client!GEKFXIMX", name = "w", descriptor = "I")
	private int anInt119;

	@OriginalMember(owner = "client!GEKFXIMX", name = "x", descriptor = "I")
	private int anInt120;

	@OriginalMember(owner = "client!GEKFXIMX", name = "m", descriptor = "I")
	private int anInt110;

	@OriginalMember(owner = "client!GEKFXIMX", name = "n", descriptor = "I")
	private int anInt111;

	@OriginalMember(owner = "client!GEKFXIMX", name = "o", descriptor = "I")
	private int anInt112;

	@OriginalMember(owner = "client!GEKFXIMX", name = "p", descriptor = "I")
	private int anInt113;

	@OriginalMember(owner = "client!GEKFXIMX", name = "u", descriptor = "Lclient!PQTJDTHH;")
	private Class27 aClass27_1;

	@OriginalMember(owner = "client!GEKFXIMX", name = "q", descriptor = "I")
	private int anInt114;

	@OriginalMember(owner = "client!GEKFXIMX", name = "t", descriptor = "I")
	private int anInt117;

	@OriginalMember(owner = "client!GEKFXIMX", name = "r", descriptor = "I")
	private int anInt115;

	@OriginalMember(owner = "client!GEKFXIMX", name = "s", descriptor = "I")
	private int anInt116;

	@OriginalMember(owner = "client!GEKFXIMX", name = "y", descriptor = "[I")
	private int[] anIntArray17;

	@OriginalMember(owner = "client!GEKFXIMX", name = "<init>", descriptor = "(IIIIIIIIIZ)V")
	public Class4_Sub1_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		try {
			this.anInt118 = arg0;
			this.anInt119 = arg3;
			this.anInt120 = arg7;
			this.anInt110 = arg2;
			this.anInt111 = arg1;
			this.anInt112 = arg6;
			this.anInt113 = arg5;
			if (arg4 != -1) {
				this.aClass27_1 = Class27.aClass27Array1[arg4];
				this.anInt114 = 0;
				this.anInt117 = client.anInt927 - 1;
				if (arg9 && this.aClass27_1.anInt367 != -1) {
					this.anInt114 = (int) (Math.random() * (double) this.aClass27_1.anInt366);
					this.anInt117 -= (int) (Math.random() * (double) this.aClass27_1.method330(this.anInt114));
				}
			}
			@Pc(73) Class28 local73 = Class28.method334(this.anInt118);
			this.anInt115 = local73.anInt380;
			this.anInt116 = local73.anInt388;
			this.anIntArray17 = local73.anIntArray104;
		} catch (@Pc(94) RuntimeException local94) {
			signlink.reporterror("7337, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local94.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GEKFXIMX", name = "a", descriptor = "(I)Lclient!PZYCJUKA;")
	private Class28 method146() {
		try {
			@Pc(8) int local8 = -1;
			if (this.anInt115 != -1) {
				@Pc(17) Class25 local17 = Class25.aClass25Array1[this.anInt115];
				@Pc(20) int local20 = local17.anInt320;
				@Pc(23) int local23 = local17.anInt321;
				@Pc(26) int local26 = local17.anInt322;
				@Pc(32) int local32 = client.anIntArray269[local26 - local23];
				local8 = aClient1.anIntArray276[local20] >> local23 & local32;
			} else if (this.anInt116 != -1) {
				local8 = aClient1.anIntArray276[this.anInt116];
			}
			return local8 < 0 || local8 >= this.anIntArray17.length || this.anIntArray17[local8] == -1 ? null : Class28.method334(this.anIntArray17[local8]);
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("2220, " + 1 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GEKFXIMX", name = "a", descriptor = "(B)Lclient!KUGNQTGL;")
	@Override
	protected Class4_Sub1_Sub2_Sub3 method575() {
		try {
			@Pc(3) int local3 = -1;
			if (this.aClass27_1 != null) {
				@Pc(11) int local11 = client.anInt927 - this.anInt117;
				if (local11 > 100 && this.aClass27_1.anInt367 > 0) {
					local11 = 100;
				}
				label43: {
					do {
						do {
							if (local11 <= this.aClass27_1.method330(this.anInt114)) {
								break label43;
							}
							local11 -= this.aClass27_1.method330(this.anInt114);
							this.anInt114++;
						} while (this.anInt114 < this.aClass27_1.anInt366);
						this.anInt114 -= this.aClass27_1.anInt367;
					} while (this.anInt114 >= 0 && this.anInt114 < this.aClass27_1.anInt366);
					this.aClass27_1 = null;
				}
				this.anInt117 = client.anInt927 - local11;
				if (this.aClass27_1 != null) {
					local3 = this.aClass27_1.anIntArray95[this.anInt114];
				}
			}
			@Pc(101) Class28 local101;
			if (this.anIntArray17 == null) {
				local101 = Class28.method334(this.anInt118);
			} else {
				local101 = this.method146();
			}
			return local101 == null ? null : local101.method338(this.anInt119, this.anInt120, this.anInt110, this.anInt111, this.anInt112, this.anInt113, local3);
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("93594, " + 0 + ", " + local130.toString());
			throw new RuntimeException();
		}
	}
}
