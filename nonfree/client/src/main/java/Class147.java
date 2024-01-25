import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class147 {

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "[[I")
	public int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "Lclient!qk;")
	public Class199 aClass199_1;

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "[[I")
	public int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
	public int anInt3879;

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "[I")
	public int[] anIntArray303;

	@OriginalMember(owner = "client!lb", name = "g", descriptor = "[I")
	public int[] anIntArray304;

	@OriginalMember(owner = "client!lb", name = "i", descriptor = "[I")
	public int[] anIntArray305;

	@OriginalMember(owner = "client!lb", name = "k", descriptor = "[I")
	public int[] anIntArray306;

	@OriginalMember(owner = "client!lb", name = "l", descriptor = "I")
	public int anInt3881;

	@OriginalMember(owner = "client!lb", name = "m", descriptor = "[I")
	public int[] anIntArray307;

	@OriginalMember(owner = "client!lb", name = "n", descriptor = "[Lclient!qk;")
	public Class199[] aClass199Array1;

	@OriginalMember(owner = "client!lb", name = "q", descriptor = "I")
	public int anInt3883;

	@OriginalMember(owner = "client!lb", name = "r", descriptor = "[I")
	public int[] anIntArray308;

	@OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
	public final int anInt3880;

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "([BI)V")
	public Class147(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt3880 = Static302.method4113(arg0, arg0.length);
		if (this.anInt3880 != arg1) {
			throw new RuntimeException();
		}
		this.method3258(arg0);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "([BB)V")
	private void method3258(@OriginalArg(0) byte[] arg0) {
		@Pc(14) Class1_Sub14 local14 = new Class1_Sub14(Static171.method2646(arg0));
		@Pc(18) int local18 = local14.method4548();
		if (local18 != 5 && local18 != 6) {
			throw new RuntimeException();
		}
		if (local18 >= 6) {
			this.anInt3883 = local14.method4500();
		} else {
			this.anInt3883 = 0;
		}
		@Pc(51) int local51 = local14.method4548();
		this.anInt3879 = local14.method4498();
		@Pc(58) int local58 = 0;
		@Pc(60) int local60 = -1;
		this.anIntArray307 = new int[this.anInt3879];
		for (@Pc(67) int local67 = 0; local67 < this.anInt3879; local67++) {
			this.anIntArray307[local67] = local58 += local14.method4498();
			if (this.anIntArray307[local67] > local60) {
				local60 = this.anIntArray307[local67];
			}
		}
		this.anInt3881 = local60 + 1;
		this.anIntArray304 = new int[this.anInt3881];
		this.anIntArray306 = new int[this.anInt3881];
		this.anIntArrayArray25 = new int[this.anInt3881][];
		this.anIntArray308 = new int[this.anInt3881];
		this.anIntArray305 = new int[this.anInt3881];
		@Pc(143) int local143;
		@Pc(161) int local161;
		if (local51 != 0) {
			this.anIntArray303 = new int[this.anInt3881];
			for (local143 = 0; local143 < this.anInt3881; local143++) {
				this.anIntArray303[local143] = -1;
			}
			for (local161 = 0; local161 < this.anInt3879; local161++) {
				this.anIntArray303[this.anIntArray307[local161]] = local14.method4500();
			}
			this.aClass199_1 = new Class199(this.anIntArray303);
		}
		for (local143 = 0; local143 < this.anInt3879; local143++) {
			this.anIntArray308[this.anIntArray307[local143]] = local14.method4500();
		}
		for (local161 = 0; local161 < this.anInt3879; local161++) {
			this.anIntArray305[this.anIntArray307[local161]] = local14.method4500();
		}
		for (@Pc(237) int local237 = 0; local237 < this.anInt3879; local237++) {
			this.anIntArray304[this.anIntArray307[local237]] = local14.method4498();
		}
		@Pc(265) int local265;
		@Pc(272) int local272;
		@Pc(274) int local274;
		@Pc(282) int local282;
		@Pc(299) int local299;
		for (@Pc(258) int local258 = 0; local258 < this.anInt3879; local258++) {
			local265 = this.anIntArray307[local258];
			local58 = 0;
			local272 = this.anIntArray304[local265];
			local274 = -1;
			this.anIntArrayArray25[local265] = new int[local272];
			for (local282 = 0; local282 < local272; local282++) {
				local299 = this.anIntArrayArray25[local265][local282] = local58 += local14.method4498();
				if (local299 > local274) {
					local274 = local299;
				}
			}
			this.anIntArray306[local265] = local274 + 1;
			if (local274 + 1 == local272) {
				this.anIntArrayArray25[local265] = null;
			}
		}
		if (local51 == 0) {
			return;
		}
		this.aClass199Array1 = new Class199[local60 + 1];
		this.anIntArrayArray26 = new int[local60 + 1][];
		for (local265 = 0; local265 < this.anInt3879; local265++) {
			local272 = this.anIntArray307[local265];
			local274 = this.anIntArray304[local272];
			this.anIntArrayArray26[local272] = new int[this.anIntArray306[local272]];
			for (local282 = 0; local282 < this.anIntArray306[local272]; local282++) {
				this.anIntArrayArray26[local272][local282] = -1;
			}
			for (local299 = 0; local299 < local274; local299++) {
				@Pc(412) int local412;
				if (this.anIntArrayArray25[local272] == null) {
					local412 = local299;
				} else {
					local412 = this.anIntArrayArray25[local272][local299];
				}
				this.anIntArrayArray26[local272][local412] = local14.method4500();
			}
			this.aClass199Array1[local272] = new Class199(this.anIntArrayArray26[local272]);
		}
	}
}
