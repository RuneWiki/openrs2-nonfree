import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!HALGFRSE")
public final class Class1_Sub1_Sub2_Sub3 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!HALGFRSE", name = "q", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!HALGFRSE", name = "s", descriptor = "Z")
	private boolean aBoolean65 = false;

	@OriginalMember(owner = "client!HALGFRSE", name = "z", descriptor = "I")
	private int anInt286 = 6;

	@OriginalMember(owner = "client!HALGFRSE", name = "A", descriptor = "Z")
	private boolean aBoolean66 = false;

	@OriginalMember(owner = "client!HALGFRSE", name = "n", descriptor = "I")
	private int anInt276;

	@OriginalMember(owner = "client!HALGFRSE", name = "o", descriptor = "I")
	private int anInt277;

	@OriginalMember(owner = "client!HALGFRSE", name = "p", descriptor = "I")
	private int anInt278;

	@OriginalMember(owner = "client!HALGFRSE", name = "t", descriptor = "I")
	private int anInt280;

	@OriginalMember(owner = "client!HALGFRSE", name = "u", descriptor = "I")
	private int anInt281;

	@OriginalMember(owner = "client!HALGFRSE", name = "v", descriptor = "I")
	private int anInt282;

	@OriginalMember(owner = "client!HALGFRSE", name = "w", descriptor = "I")
	private int anInt283;

	@OriginalMember(owner = "client!HALGFRSE", name = "l", descriptor = "Lclient!LCRVYGCP;")
	private Class23 aClass23_1;

	@OriginalMember(owner = "client!HALGFRSE", name = "r", descriptor = "I")
	private int anInt279;

	@OriginalMember(owner = "client!HALGFRSE", name = "B", descriptor = "I")
	private int anInt287;

	@OriginalMember(owner = "client!HALGFRSE", name = "x", descriptor = "I")
	private int anInt284;

	@OriginalMember(owner = "client!HALGFRSE", name = "y", descriptor = "I")
	private int anInt285;

	@OriginalMember(owner = "client!HALGFRSE", name = "m", descriptor = "[I")
	private int[] anIntArray48;

	@OriginalMember(owner = "client!HALGFRSE", name = "<init>", descriptor = "(IIIIIIIIZI)V")
	public Class1_Sub1_Sub2_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		try {
			this.anInt276 = arg3;
			this.anInt277 = arg0;
			this.anInt278 = arg1;
			this.anInt280 = arg9;
			this.anInt281 = arg2;
			this.anInt282 = arg7;
			this.anInt283 = arg6;
			if (arg5 != -1) {
				this.aClass23_1 = Class23.aClass23Array1[arg5];
				this.anInt279 = 0;
				this.anInt287 = client.anInt907;
				if (arg8 && this.aClass23_1.anInt388 != -1) {
					this.anInt279 = (int) (Math.random() * (double) this.aClass23_1.anInt387);
					this.anInt287 -= (int) (Math.random() * (double) this.aClass23_1.method293(this.anInt286, this.anInt279));
				}
			}
			@Pc(81) Class41 local81 = Class41.method452(this.anInt276);
			this.anInt284 = local81.anInt659;
			this.anInt285 = local81.anInt645;
			this.anIntArray48 = local81.anIntArray161;
		} catch (@Pc(105) RuntimeException local105) {
			signlink.reporterror("70799, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local105.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HALGFRSE", name = "a", descriptor = "(I)Lclient!RTQSBWRH;")
	@Override
	protected Class1_Sub1_Sub2_Sub6 method410() {
		try {
			@Pc(3) int local3 = -1;
			if (this.aClass23_1 != null) {
				@Pc(11) int local11 = client.anInt907 - this.anInt287;
				if (local11 > 100 && this.aClass23_1.anInt388 > 0) {
					local11 = 100;
				}
				label43: {
					do {
						do {
							if (local11 <= this.aClass23_1.method293(this.anInt286, this.anInt279)) {
								break label43;
							}
							local11 -= this.aClass23_1.method293(this.anInt286, this.anInt279);
							this.anInt279++;
						} while (this.anInt279 < this.aClass23_1.anInt387);
						this.anInt279 -= this.aClass23_1.anInt388;
					} while (this.anInt279 >= 0 && this.anInt279 < this.aClass23_1.anInt387);
					this.aClass23_1 = null;
				}
				this.anInt287 = client.anInt907 - local11;
				if (this.aClass23_1 != null) {
					local3 = this.aClass23_1.anIntArray76[this.anInt279];
				}
			}
			@Pc(97) Class41 local97;
			if (this.anIntArray48 == null) {
				local97 = Class41.method452(this.anInt276);
			} else {
				local97 = this.method211();
			}
			return local97 == null ? null : local97.method447(this.anInt277, this.anInt278, this.anInt280, this.anInt281, this.anInt282, this.anInt283, local3);
		} catch (@Pc(131) RuntimeException local131) {
			signlink.reporterror("57267, " + -704 + ", " + local131.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HALGFRSE", name = "a", descriptor = "(Z)Lclient!SYTHBZWG;")
	private Class41 method211() {
		try {
			@Pc(7) int local7 = -1;
			if (this.anInt284 != -1) {
				@Pc(16) Class2 local16 = Class2.aClass2Array1[this.anInt284];
				@Pc(19) int local19 = local16.anInt3;
				@Pc(22) int local22 = local16.anInt4;
				@Pc(25) int local25 = local16.anInt5;
				@Pc(31) int local31 = client.anIntArray271[local25 - local22];
				local7 = aClient1.anIntArray263[local19] >> local22 & local31;
			} else if (this.anInt285 != -1) {
				local7 = aClient1.anIntArray263[this.anInt285];
			}
			return local7 < 0 || local7 >= this.anIntArray48.length || this.anIntArray48[local7] == -1 ? null : Class41.method452(this.anIntArray48[local7]);
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("12885, " + false + ", " + local74.toString());
			throw new RuntimeException();
		}
	}
}
