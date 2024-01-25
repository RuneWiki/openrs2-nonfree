import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!op")
public final class Class156 {

	@OriginalMember(owner = "client!op", name = "b", descriptor = "Lclient!gk;")
	public Class76 aClass76_1;

	@OriginalMember(owner = "client!op", name = "c", descriptor = "[[I")
	public int[][] anIntArrayArray52;

	@OriginalMember(owner = "client!op", name = "e", descriptor = "[I")
	public int[] anIntArray421;

	@OriginalMember(owner = "client!op", name = "f", descriptor = "I")
	public int anInt4720;

	@OriginalMember(owner = "client!op", name = "j", descriptor = "[Lclient!gk;")
	public Class76[] aClass76Array1;

	@OriginalMember(owner = "client!op", name = "k", descriptor = "[I")
	public int[] anIntArray422;

	@OriginalMember(owner = "client!op", name = "l", descriptor = "[I")
	public int[] anIntArray423;

	@OriginalMember(owner = "client!op", name = "m", descriptor = "[I")
	public int[] anIntArray424;

	@OriginalMember(owner = "client!op", name = "n", descriptor = "I")
	public int anInt4723;

	@OriginalMember(owner = "client!op", name = "p", descriptor = "[[I")
	public int[][] anIntArrayArray53;

	@OriginalMember(owner = "client!op", name = "q", descriptor = "I")
	public int anInt4725;

	@OriginalMember(owner = "client!op", name = "r", descriptor = "[I")
	public int[] anIntArray425;

	@OriginalMember(owner = "client!op", name = "s", descriptor = "[I")
	public int[] anIntArray426;

	@OriginalMember(owner = "client!op", name = "o", descriptor = "I")
	public final int anInt4724;

	@OriginalMember(owner = "client!op", name = "<init>", descriptor = "([BI)V")
	public Class156(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt4724 = Static5.method192(arg0, arg0.length);
		if (this.anInt4724 != arg1) {
			throw new RuntimeException();
		}
		this.method4236(arg0);
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "([BB)V")
	private void method4236(@OriginalArg(0) byte[] arg0) {
		@Pc(12) Class1_Sub8 local12 = new Class1_Sub8(Static188.method3684(arg0));
		@Pc(16) int local16 = local12.method4532();
		if (local16 != 5 && local16 != 6) {
			throw new RuntimeException();
		}
		if (local16 < 6) {
			this.anInt4723 = 0;
		} else {
			this.anInt4723 = local12.method4545();
		}
		@Pc(47) int local47 = local12.method4532();
		this.anInt4720 = local12.method4556();
		@Pc(54) int local54 = 0;
		@Pc(56) int local56 = -1;
		this.anIntArray425 = new int[this.anInt4720];
		for (@Pc(69) int local69 = 0; local69 < this.anInt4720; local69++) {
			this.anIntArray425[local69] = local54 += local12.method4556();
			if (local56 < this.anIntArray425[local69]) {
				local56 = this.anIntArray425[local69];
			}
		}
		this.anInt4725 = local56 + 1;
		this.anIntArray421 = new int[this.anInt4725];
		this.anIntArray426 = new int[this.anInt4725];
		this.anIntArray424 = new int[this.anInt4725];
		this.anIntArray423 = new int[this.anInt4725];
		this.anIntArrayArray52 = new int[this.anInt4725][];
		@Pc(144) int local144;
		@Pc(162) int local162;
		if (local47 != 0) {
			this.anIntArray422 = new int[this.anInt4725];
			for (local144 = 0; local144 < this.anInt4725; local144++) {
				this.anIntArray422[local144] = -1;
			}
			for (local162 = 0; local162 < this.anInt4720; local162++) {
				this.anIntArray422[this.anIntArray425[local162]] = local12.method4545();
			}
			this.aClass76_1 = new Class76(this.anIntArray422);
		}
		for (local144 = 0; local144 < this.anInt4720; local144++) {
			this.anIntArray423[this.anIntArray425[local144]] = local12.method4545();
		}
		for (local162 = 0; local162 < this.anInt4720; local162++) {
			this.anIntArray421[this.anIntArray425[local162]] = local12.method4545();
		}
		for (@Pc(230) int local230 = 0; local230 < this.anInt4720; local230++) {
			this.anIntArray424[this.anIntArray425[local230]] = local12.method4556();
		}
		@Pc(256) int local256;
		@Pc(263) int local263;
		@Pc(271) int local271;
		@Pc(273) int local273;
		@Pc(290) int local290;
		for (@Pc(249) int local249 = 0; local249 < this.anInt4720; local249++) {
			local256 = this.anIntArray425[local249];
			local54 = 0;
			local263 = this.anIntArray424[local256];
			this.anIntArrayArray52[local256] = new int[local263];
			local271 = -1;
			for (local273 = 0; local273 < local263; local273++) {
				local290 = this.anIntArrayArray52[local256][local273] = local54 += local12.method4556();
				if (local271 < local290) {
					local271 = local290;
				}
			}
			this.anIntArray426[local256] = local271 + 1;
			if (local271 + 1 == local263) {
				this.anIntArrayArray52[local256] = null;
			}
		}
		if (local47 == 0) {
			return;
		}
		this.aClass76Array1 = new Class76[local56 + 1];
		this.anIntArrayArray53 = new int[local56 + 1][];
		for (local256 = 0; local256 < this.anInt4720; local256++) {
			local263 = this.anIntArray425[local256];
			local271 = this.anIntArray424[local263];
			this.anIntArrayArray53[local263] = new int[this.anIntArray426[local263]];
			for (local273 = 0; local273 < this.anIntArray426[local263]; local273++) {
				this.anIntArrayArray53[local263][local273] = -1;
			}
			for (local290 = 0; local290 < local271; local290++) {
				@Pc(408) int local408;
				if (this.anIntArrayArray52[local263] == null) {
					local408 = local290;
				} else {
					local408 = this.anIntArrayArray52[local263][local290];
				}
				this.anIntArrayArray53[local263][local408] = local12.method4545();
			}
			this.aClass76Array1[local263] = new Class76(this.anIntArrayArray53[local263]);
		}
	}
}
