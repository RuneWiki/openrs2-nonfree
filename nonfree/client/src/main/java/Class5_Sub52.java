import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public final class Class5_Sub52 extends Class5 {

	@OriginalMember(owner = "client!va", name = "m", descriptor = "I")
	public int anInt10181;

	@OriginalMember(owner = "client!va", name = "l", descriptor = "Z")
	public boolean aBoolean760;

	@OriginalMember(owner = "client!va", name = "j", descriptor = "I")
	public final int anInt10182;

	@OriginalMember(owner = "client!va", name = "k", descriptor = "I")
	private final int anInt10183;

	@OriginalMember(owner = "client!va", name = "o", descriptor = "[I")
	private int[] anIntArray565;

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "(II[IZ)V")
	public Class5_Sub52(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) boolean arg3) {
		this.anInt10182 = arg0;
		this.anInt10183 = arg1;
		this.anIntArray565 = arg2;
		if (arg3) {
			@Pc(16) int[] local16 = new int[this.anInt10183];
			@Pc(20) int[] local20 = new int[this.anInt10183];
			@Pc(24) int[] local24 = new int[this.anInt10183];
			@Pc(28) int[] local28 = new int[this.anInt10183];
			if (Static621.anIntArray566 == null || Static621.anIntArray566.length != this.anIntArray565.length) {
				Static621.anIntArray566 = new int[this.anIntArray565.length];
			}
			@Pc(44) int local44 = this.anInt10183;
			@Pc(47) int local47 = this.anInt10183;
			@Pc(51) int local51 = local44 - 1;
			@Pc(55) int local55 = local47 - 1;
			@Pc(59) int local59 = local44 * local47;
			@Pc(62) int local62 = local44;
			@Pc(63) int local63 = local44;
			@Pc(68) int local68;
			for (@Pc(65) int local65 = 2; local65 >= 0; local65--) {
				for (local68 = local51; local68 >= 0; local68--) {
					local62--;
					@Pc(75) int local75 = this.anIntArray565[local62];
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
					Static621.anIntArray566[local129] = local188 << 24 | local192 << 16 | local196 << 8 | local200;
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
					@Pc(277) int local277 = this.anIntArray565[local62];
					local63--;
					@Pc(283) int local283 = this.anIntArray565[local63];
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
			@Pc(364) int[] local364 = this.anIntArray565;
			this.anIntArray565 = Static621.anIntArray566;
			Static621.anIntArray566 = local364;
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(II)V")
	public void method8757(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 0 && arg1 == 0) {
			return;
		}
		if (Static621.anIntArray566 == null || Static621.anIntArray566.length != this.anIntArray565.length) {
			Static621.anIntArray566 = new int[this.anIntArray565.length];
		}
		@Pc(21) int local21 = this.anIntArray565.length;
		@Pc(28) int local28 = this.anInt10183 - 1;
		@Pc(33) int local33 = this.anInt10183 * arg1;
		@Pc(37) int local37 = local21 - 1;
		for (@Pc(39) int local39 = 0; local39 < local21; local39 += this.anInt10183) {
			@Pc(46) int local46 = local39 + local33 & local37;
			for (@Pc(48) int local48 = 0; local48 < this.anInt10183; local48++) {
				@Pc(53) int local53 = local39 + local48;
				@Pc(61) int local61 = local46 + (local48 + arg0 & local28);
				Static621.anIntArray566[local53] = this.anIntArray565[local61];
			}
		}
		@Pc(84) int[] local84 = this.anIntArray565;
		this.anIntArray565 = Static621.anIntArray566;
		Static621.anIntArray566 = local84;
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "()[I")
	public int[] method8759() {
		return this.anIntArray565;
	}
}
