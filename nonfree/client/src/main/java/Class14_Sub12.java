import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public final class Class14_Sub12 extends Class14 {

	@OriginalMember(owner = "client!df", name = "m", descriptor = "Z")
	public boolean aBoolean173;

	@OriginalMember(owner = "client!df", name = "n", descriptor = "I")
	public int anInt2109;

	@OriginalMember(owner = "client!df", name = "p", descriptor = "I")
	public final int anInt2110;

	@OriginalMember(owner = "client!df", name = "l", descriptor = "I")
	private final int anInt2108;

	@OriginalMember(owner = "client!df", name = "q", descriptor = "[I")
	private int[] anIntArray159;

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "(II[IZ)V")
	public Class14_Sub12(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) boolean arg3) {
		this.anInt2110 = arg0;
		this.anInt2108 = arg1;
		this.anIntArray159 = arg2;
		if (arg3) {
			@Pc(16) int[] local16 = new int[this.anInt2108];
			@Pc(20) int[] local20 = new int[this.anInt2108];
			@Pc(24) int[] local24 = new int[this.anInt2108];
			@Pc(28) int[] local28 = new int[this.anInt2108];
			if (Static98.anIntArray158 == null || Static98.anIntArray158.length != this.anIntArray159.length) {
				Static98.anIntArray158 = new int[this.anIntArray159.length];
			}
			@Pc(44) int local44 = this.anInt2108;
			@Pc(47) int local47 = this.anInt2108;
			@Pc(51) int local51 = local44 - 1;
			@Pc(55) int local55 = local47 - 1;
			@Pc(59) int local59 = local44 * local47;
			@Pc(62) int local62 = local44;
			@Pc(63) int local63 = local44;
			@Pc(68) int local68;
			for (@Pc(65) int local65 = 2; local65 >= 0; local65--) {
				for (local68 = local51; local68 >= 0; local68--) {
					local62--;
					@Pc(75) int local75 = this.anIntArray159[local62];
					local16[local68] += local75 >> 24 & 0xFF;
					local20[local68] += local75 >> 16 & 0xFF;
					local24[local68] += local75 >> 8 & 0xFF;
					local28[local68] += local75 & 0xFF;
				}
				if (local62 == 0) {
					local62 = local59;
				}
			}
			@Pc(129) int local129 = local59;
			for (@Pc(131) int local131 = local55; local131 >= 0; local131--) {
				@Pc(134) int local134 = 1;
				@Pc(136) int local136 = 1;
				@Pc(139) int local139 = 0;
				@Pc(141) int local141 = 0;
				@Pc(143) int local143 = 0;
				@Pc(144) int local144 = 0;
				for (local68 = 2; local68 >= 0; local68--) {
					local136--;
					local144 += local16[local136];
					local143 += local20[local136];
					local139 += local24[local136];
					local141 += local28[local136];
					if (local136 == 0) {
						local136 = local44;
					}
				}
				for (local68 = local51; local68 >= 0; local68--) {
					local136--;
					local134--;
					@Pc(188) int local188 = local144 / 9;
					@Pc(192) int local192 = local143 / 9;
					@Pc(196) int local196 = local139 / 9;
					@Pc(200) int local200 = local141 / 9;
					local129--;
					Static98.anIntArray158[local129] = local188 << 24 | local192 << 16 | local196 << 8 | local200;
					local144 += local16[local136] - local16[local134];
					local143 += local20[local136] - local20[local134];
					local141 += local28[local136] - local28[local134];
					local139 += local24[local136] - local24[local134];
					if (local136 == 0) {
						local136 = local44;
					}
					if (local134 == 0) {
						local134 = local44;
					}
				}
				for (local68 = local51; local68 >= 0; local68--) {
					local62--;
					@Pc(277) int local277 = this.anIntArray159[local62];
					local63--;
					@Pc(283) int local283 = this.anIntArray159[local63];
					local16[local68] += (local277 >> 24 & 0xFF) - (local283 >> 24 & 0xFF);
					local20[local68] += (local277 >> 16 & 0xFF) - (local283 >> 16 & 0xFF);
					local24[local68] += (local277 >> 8 & 0xFF) - (local283 >> 8 & 0xFF);
					local28[local68] += (local277 & 0xFF) - (local283 & 0xFF);
				}
				if (local62 == 0) {
					local62 = local59;
				}
				if (local63 == 0) {
					local63 = local59;
				}
			}
			@Pc(364) int[] local364 = this.anIntArray159;
			this.anIntArray159 = Static98.anIntArray158;
			Static98.anIntArray158 = local364;
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "()[I")
	public int[] method1781() {
		return this.anIntArray159;
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(II)V")
	public void method1782(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 0 && arg1 == 0) {
			return;
		}
		if (Static98.anIntArray158 == null || Static98.anIntArray158.length != this.anIntArray159.length) {
			Static98.anIntArray158 = new int[this.anIntArray159.length];
		}
		@Pc(21) int local21 = this.anIntArray159.length;
		@Pc(28) int local28 = this.anInt2108 - 1;
		@Pc(33) int local33 = this.anInt2108 * arg1;
		@Pc(37) int local37 = local21 - 1;
		for (@Pc(39) int local39 = 0; local39 < local21; local39 += this.anInt2108) {
			@Pc(46) int local46 = local39 + local33 & local37;
			for (@Pc(48) int local48 = 0; local48 < this.anInt2108; local48++) {
				@Pc(53) int local53 = local39 + local48;
				@Pc(61) int local61 = local46 + (local48 + arg0 & local28);
				Static98.anIntArray158[local53] = this.anIntArray159[local61];
			}
		}
		@Pc(84) int[] local84 = this.anIntArray159;
		this.anIntArray159 = Static98.anIntArray158;
		Static98.anIntArray158 = local84;
	}
}
