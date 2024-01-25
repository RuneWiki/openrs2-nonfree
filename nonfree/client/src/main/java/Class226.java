import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sq")
public final class Class226 {

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "[I")
	public int[] anIntArray436;

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "Lclient!jc;")
	public Class121 aClass121_1;

	@OriginalMember(owner = "client!sq", name = "c", descriptor = "I")
	public int anInt6258;

	@OriginalMember(owner = "client!sq", name = "d", descriptor = "[I")
	public int[] anIntArray437;

	@OriginalMember(owner = "client!sq", name = "e", descriptor = "[Lclient!jc;")
	public Class121[] aClass121Array1;

	@OriginalMember(owner = "client!sq", name = "g", descriptor = "[I")
	public int[] anIntArray438;

	@OriginalMember(owner = "client!sq", name = "h", descriptor = "I")
	public int anInt6260;

	@OriginalMember(owner = "client!sq", name = "i", descriptor = "I")
	public int anInt6261;

	@OriginalMember(owner = "client!sq", name = "j", descriptor = "[I")
	public int[] anIntArray439;

	@OriginalMember(owner = "client!sq", name = "k", descriptor = "[[I")
	public int[][] anIntArrayArray55;

	@OriginalMember(owner = "client!sq", name = "o", descriptor = "[[I")
	public int[][] anIntArrayArray56;

	@OriginalMember(owner = "client!sq", name = "q", descriptor = "[I")
	public int[] anIntArray440;

	@OriginalMember(owner = "client!sq", name = "r", descriptor = "[I")
	public int[] anIntArray441;

	@OriginalMember(owner = "client!sq", name = "f", descriptor = "I")
	public final int anInt6259;

	@OriginalMember(owner = "client!sq", name = "<init>", descriptor = "([BI)V")
	public Class226(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt6259 = Static36.method616(arg0, arg0.length);
		if (arg1 != this.anInt6259) {
			throw new RuntimeException();
		}
		this.method4954(arg0);
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Z[B)V")
	private void method4954(@OriginalArg(1) byte[] arg0) {
		@Pc(12) Class5_Sub15 local12 = new Class5_Sub15(Static96.method1353(arg0));
		@Pc(16) int local16 = local12.method5539();
		if (local16 != 5 && local16 != 6) {
			throw new RuntimeException();
		}
		if (local16 < 6) {
			this.anInt6260 = 0;
		} else {
			this.anInt6260 = local12.method5603();
		}
		@Pc(45) int local45 = local12.method5539();
		this.anInt6261 = local12.method5598();
		@Pc(52) int local52 = 0;
		this.anIntArray436 = new int[this.anInt6261];
		@Pc(59) int local59 = -1;
		for (@Pc(61) int local61 = 0; local61 < this.anInt6261; local61++) {
			this.anIntArray436[local61] = local52 += local12.method5598();
			if (local59 < this.anIntArray436[local61]) {
				local59 = this.anIntArray436[local61];
			}
		}
		this.anInt6258 = local59 + 1;
		this.anIntArray439 = new int[this.anInt6258];
		this.anIntArrayArray56 = new int[this.anInt6258][];
		this.anIntArray440 = new int[this.anInt6258];
		this.anIntArray438 = new int[this.anInt6258];
		this.anIntArray441 = new int[this.anInt6258];
		@Pc(133) int local133;
		@Pc(147) int local147;
		if (local45 != 0) {
			this.anIntArray437 = new int[this.anInt6258];
			for (local133 = 0; local133 < this.anInt6258; local133++) {
				this.anIntArray437[local133] = -1;
			}
			for (local147 = 0; local147 < this.anInt6261; local147++) {
				this.anIntArray437[this.anIntArray436[local147]] = local12.method5603();
			}
			this.aClass121_1 = new Class121(this.anIntArray437);
		}
		for (local133 = 0; local133 < this.anInt6261; local133++) {
			this.anIntArray441[this.anIntArray436[local133]] = local12.method5603();
		}
		for (local147 = 0; local147 < this.anInt6261; local147++) {
			this.anIntArray440[this.anIntArray436[local147]] = local12.method5603();
		}
		for (@Pc(219) int local219 = 0; local219 < this.anInt6261; local219++) {
			this.anIntArray438[this.anIntArray436[local219]] = local12.method5598();
		}
		@Pc(245) int local245;
		@Pc(250) int local250;
		@Pc(260) int local260;
		@Pc(262) int local262;
		@Pc(279) int local279;
		for (@Pc(238) int local238 = 0; local238 < this.anInt6261; local238++) {
			local245 = this.anIntArray436[local238];
			local250 = this.anIntArray438[local245];
			local52 = 0;
			this.anIntArrayArray56[local245] = new int[local250];
			local260 = -1;
			for (local262 = 0; local262 < local250; local262++) {
				local279 = this.anIntArrayArray56[local245][local262] = local52 += local12.method5598();
				if (local279 > local260) {
					local260 = local279;
				}
			}
			this.anIntArray439[local245] = local260 + 1;
			if (local260 + 1 == local250) {
				this.anIntArrayArray56[local245] = null;
			}
		}
		if (local45 == 0) {
			return;
		}
		this.anIntArrayArray55 = new int[local59 + 1][];
		this.aClass121Array1 = new Class121[local59 + 1];
		for (local245 = 0; local245 < this.anInt6261; local245++) {
			local250 = this.anIntArray436[local245];
			local260 = this.anIntArray438[local250];
			this.anIntArrayArray55[local250] = new int[this.anIntArray439[local250]];
			for (local262 = 0; local262 < this.anIntArray439[local250]; local262++) {
				this.anIntArrayArray55[local250][local262] = -1;
			}
			for (local279 = 0; local279 < local260; local279++) {
				@Pc(391) int local391;
				if (this.anIntArrayArray56[local250] == null) {
					local391 = local279;
				} else {
					local391 = this.anIntArrayArray56[local250][local279];
				}
				this.anIntArrayArray55[local250][local391] = local12.method5603();
			}
			this.aClass121Array1[local250] = new Class121(this.anIntArrayArray55[local250]);
		}
	}
}
