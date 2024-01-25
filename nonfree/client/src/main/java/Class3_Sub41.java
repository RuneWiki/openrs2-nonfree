import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qt")
public final class Class3_Sub41 extends Class3 {

	@OriginalMember(owner = "client!qt", name = "m", descriptor = "I")
	public int anInt7461;

	@OriginalMember(owner = "client!qt", name = "n", descriptor = "Z")
	public boolean aBoolean521;

	@OriginalMember(owner = "client!qt", name = "k", descriptor = "I")
	public final int anInt7460;

	@OriginalMember(owner = "client!qt", name = "j", descriptor = "I")
	private final int anInt7459;

	@OriginalMember(owner = "client!qt", name = "o", descriptor = "[I")
	private int[] anIntArray656;

	@OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(II[IZ)V")
	public Class3_Sub41(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) boolean arg3) {
		this.anInt7460 = arg0;
		this.anInt7459 = arg1;
		this.anIntArray656 = arg2;
		if (arg3) {
			@Pc(16) int[] local16 = new int[this.anInt7459];
			@Pc(20) int[] local20 = new int[this.anInt7459];
			@Pc(24) int[] local24 = new int[this.anInt7459];
			if (Static406.anIntArray655 == null || Static406.anIntArray655.length < this.anIntArray656.length) {
				Static406.anIntArray655 = new int[this.anIntArray656.length];
			}
			@Pc(40) int local40 = this.anInt7459;
			@Pc(43) int local43 = this.anInt7459;
			@Pc(47) int local47 = local40 - 1;
			@Pc(51) int local51 = local43 - 1;
			@Pc(55) int local55 = local40 * local43;
			@Pc(58) int local58 = local40;
			@Pc(59) int local59 = local40;
			@Pc(64) int local64;
			for (@Pc(61) int local61 = 2; local61 >= 0; local61--) {
				for (local64 = local47; local64 >= 0; local64--) {
					local58--;
					@Pc(71) int local71 = this.anIntArray656[local58];
					local16[local64] += local71 >> 16 & 0xFF;
					local20[local64] += local71 >> 8 & 0xFF;
					local24[local64] += local71 & 0xFF;
				}
				if (local58 == 0) {
					local58 = local55;
				}
			}
			@Pc(114) int local114 = local55;
			for (@Pc(116) int local116 = local51; local116 >= 0; local116--) {
				@Pc(119) int local119 = 1;
				@Pc(121) int local121 = 1;
				@Pc(124) int local124 = 0;
				@Pc(126) int local126 = 0;
				@Pc(127) int local127 = 0;
				for (local64 = 2; local64 >= 0; local64--) {
					local121--;
					local127 += local16[local121];
					local124 += local20[local121];
					local126 += local24[local121];
					if (local121 == 0) {
						local121 = local40;
					}
				}
				for (local64 = local47; local64 >= 0; local64--) {
					local121--;
					local119--;
					@Pc(165) int local165 = local127 / 9;
					@Pc(169) int local169 = local124 / 9;
					@Pc(173) int local173 = local126 / 9;
					local114--;
					Static406.anIntArray655[local114] = local165 << 16 | local169 << 8 | local173;
					local127 += local16[local121] - local16[local119];
					local126 += local24[local121] - local24[local119];
					local124 += local20[local121] - local20[local119];
					if (local121 == 0) {
						local121 = local40;
					}
					if (local119 == 0) {
						local119 = local40;
					}
				}
				for (local64 = local47; local64 >= 0; local64--) {
					local58--;
					@Pc(236) int local236 = this.anIntArray656[local58];
					local59--;
					@Pc(242) int local242 = this.anIntArray656[local59];
					local16[local64] += (local236 >> 16 & 0xFF) - (local242 >> 16 & 0xFF);
					local20[local64] += (local236 >> 8 & 0xFF) - (local242 >> 8 & 0xFF);
					local24[local64] += (local236 & 0xFF) - (local242 & 0xFF);
				}
				if (local58 == 0) {
					local58 = local55;
				}
				if (local59 == 0) {
					local59 = local55;
				}
			}
			@Pc(306) int[] local306 = this.anIntArray656;
			this.anIntArray656 = Static406.anIntArray655;
			Static406.anIntArray655 = local306;
		}
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "()[I")
	public int[] method6154() {
		return this.anIntArray656;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(II)V")
	public void method6155(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 0 && arg1 == 0) {
			return;
		}
		if (Static406.anIntArray655 == null || Static406.anIntArray655.length != this.anIntArray656.length) {
			Static406.anIntArray655 = new int[this.anIntArray656.length];
		}
		@Pc(21) int local21 = this.anIntArray656.length;
		@Pc(28) int local28 = this.anInt7459 - 1;
		@Pc(33) int local33 = this.anInt7459 * arg1;
		@Pc(37) int local37 = local21 - 1;
		for (@Pc(39) int local39 = 0; local39 < local21; local39 += this.anInt7459) {
			@Pc(46) int local46 = local39 + local33 & local37;
			for (@Pc(48) int local48 = 0; local48 < this.anInt7459; local48++) {
				@Pc(53) int local53 = local39 + local48;
				@Pc(61) int local61 = local46 + (local48 + arg0 & local28);
				Static406.anIntArray655[local53] = this.anIntArray656[local61];
			}
		}
		@Pc(84) int[] local84 = this.anIntArray656;
		this.anIntArray656 = Static406.anIntArray655;
		Static406.anIntArray655 = local84;
	}
}
