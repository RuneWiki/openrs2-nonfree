import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!li")
public final class Class5_Sub31 extends Class5 {

	@OriginalMember(owner = "client!li", name = "t", descriptor = "[I")
	public int[] anIntArray327 = new int[1];

	@OriginalMember(owner = "client!li", name = "q", descriptor = "[I")
	public int[] anIntArray328 = new int[] { -1 };

	@OriginalMember(owner = "client!li", name = "a", descriptor = "([IZZ[II)J")
	private long method5030(@OriginalArg(0) int[] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		@Pc(14) long[] local14 = Class7.aLongArray3;
		@Pc(16) long local16 = -1L;
		@Pc(32) long local32 = local14[(int) (((long) (arg3 >> 8) ^ local16) & 0xFFL)] ^ local16 >>> 8;
		local16 = local14[(int) (((long) arg3 ^ local32) & 0xFFL)] ^ local32 >>> 8;
		for (@Pc(48) int local48 = 0; local48 < arg0.length; local48++) {
			local16 = local16 >>> 8 ^ local14[(int) ((local16 ^ (long) (arg0[local48] >> 24)) & 0xFFL)];
			local16 = local16 >>> 8 ^ local14[(int) ((local16 ^ (long) (arg0[local48] >> 16)) & 0xFFL)];
			local16 = local14[(int) ((local16 ^ (long) (arg0[local48] >> 8)) & 0xFFL)] ^ local16 >>> 8;
			local16 = local14[(int) (((long) arg0[local48] ^ local16) & 0xFFL)] ^ local16 >>> 8;
		}
		if (arg2 != null) {
			for (@Pc(133) int local133 = 0; local133 < 5; local133++) {
				local16 = local14[(int) (((long) arg2[local133] ^ local16) & 0xFFL)] ^ local16 >>> 8;
			}
		}
		return local16 >>> 8 ^ local14[(int) (((long) (arg1 ? 1 : 0) ^ local16) & 0xFFL)];
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IILclient!oe;IIZLclient!ha;IILclient!uaa;)Lclient!ka;")
	public Class43 method5031(@OriginalArg(1) int arg0, @OriginalArg(2) Class264 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class100 arg5, @OriginalArg(7) int arg6, @OriginalArg(9) Class359 arg7) {
		@Pc(15) Class43 local15 = null;
		@Pc(17) int local17 = 2048;
		@Pc(19) Class92 local19 = null;
		if (arg3 != -1) {
			local19 = Static591.aClass148_2.method3404(arg3);
		}
		@Pc(30) int[] local30 = this.anIntArray328;
		if (local19 != null && local19.anIntArray101 != null) {
			local30 = new int[local19.anIntArray101.length];
			for (@Pc(44) int local44 = 0; local44 < local19.anIntArray101.length; local44++) {
				@Pc(51) int local51 = local19.anIntArray101[local44];
				if (local51 >= 0 && this.anIntArray328.length > local51) {
					local30[local44] = this.anIntArray328[local51];
				} else {
					local30[local44] = -1;
				}
			}
		}
		@Pc(92) boolean local92 = false;
		@Pc(94) boolean local94 = false;
		@Pc(96) boolean local96 = false;
		@Pc(98) boolean local98 = false;
		@Pc(100) int local100 = -1;
		@Pc(102) int local102 = -1;
		@Pc(104) int local104 = 0;
		@Pc(106) Class5_Sub1_Sub21 local106 = null;
		@Pc(108) Class5_Sub1_Sub21 local108 = null;
		if (arg1 != null) {
			local100 = arg1.anIntArray423[arg0];
			local17 = 2080;
			@Pc(127) int local127 = local100 >>> 16;
			local106 = Static315.aClass14_1.method221(local127);
			local100 &= 0xFFFF;
			if (local106 != null) {
				local94 = local106.method8958(local100) | false;
				local92 = local106.method8965(local100) | false;
				local98 = local106.method8962(local100) | false;
				local96 = arg1.aBoolean468 | false;
			}
			if ((arg1.aBoolean467 || Static54.aBoolean77) && arg2 != -1 && arg1.anIntArray423.length > arg2) {
				local102 = arg1.anIntArray423[arg2];
				local104 = arg1.anIntArray425[arg0];
				@Pc(198) int local198 = local102 >>> 16;
				local102 &= 0xFFFF;
				if (local198 == local127) {
					local108 = local106;
				} else {
					local108 = Static315.aClass14_1.method221(local102 >>> 16);
				}
				if (local108 != null) {
					local94 |= local108.method8958(local102);
					local92 |= local108.method8965(local102);
					local98 |= local108.method8962(local102);
				}
			}
			if (local94) {
				local17 = 2208;
			}
			if (local92) {
				local17 |= 0x100;
			}
			if (local96) {
				local17 |= 0x200;
			}
			if (local98) {
				local17 |= 0x400;
			}
		}
		@Pc(280) long local280 = this.method5030(local30, arg4, arg7 == null ? null : arg7.anIntArray536, arg3);
		if (Static612.aClass168_88 != null) {
			local15 = (Class43) Static612.aClass168_88.method3860(local280);
		}
		if (local15 == null || arg5.method8628(local15.ua(), local17) != 0) {
			if (local15 != null) {
				local17 = arg5.method8665(local17, local15.ua());
			}
			@Pc(313) int local313 = local17;
			@Pc(315) boolean local315 = false;
			for (@Pc(317) int local317 = 0; local317 < local30.length; local317++) {
				if (local30[local317] != -1 && !Static82.aClass134_1.method3191(local30[local317]).method5693(arg4, (Class192) null)) {
					local315 = true;
				}
			}
			if (local315) {
				return null;
			}
			@Pc(364) Class197[] local364 = new Class197[local30.length];
			for (@Pc(366) int local366 = 0; local366 < local30.length; local366++) {
				if (local30[local366] != -1) {
					local364[local366] = Static82.aClass134_1.method3191(local30[local366]).method5692(arg4, (Class192) null);
				}
			}
			@Pc(438) int local438;
			@Pc(445) int local445;
			if (local19 != null && local19.anIntArrayArray16 != null) {
				for (@Pc(412) int local412 = 0; local412 < local19.anIntArrayArray16.length; local412++) {
					if (local19.anIntArrayArray16[local412] != null && local364[local412] != null) {
						local438 = local19.anIntArrayArray16[local412][0];
						local445 = local19.anIntArrayArray16[local412][1];
						@Pc(452) int local452 = local19.anIntArrayArray16[local412][2];
						@Pc(459) int local459 = local19.anIntArrayArray16[local412][3];
						@Pc(466) int local466 = local19.anIntArrayArray16[local412][4];
						@Pc(473) int local473 = local19.anIntArrayArray16[local412][5];
						if (local459 != 0 || local466 != 0 || local473 != 0) {
							local364[local412].method4594(local466, local473, local459);
						}
						if (local438 != 0 || local445 != 0 || local452 != 0) {
							local364[local412].method4600(local445, local438, local452);
						}
					}
				}
			}
			@Pc(534) Class197 local534 = new Class197(local364, local364.length);
			if (arg7 != null) {
				local313 = local17 | 0x4000;
			}
			local15 = arg5.method8588(local534, local313, Static78.anInt1381, 64, 850);
			if (arg7 != null) {
				for (local438 = 0; local438 < 5; local438++) {
					for (local445 = 0; local445 < Static467.aShortArrayArrayArray4.length; local445++) {
						if (arg7.anIntArray536[local438] < Static467.aShortArrayArrayArray4[local445][local438].length) {
							local15.ia(Static445.aShortArrayArray20[local445][local438], Static467.aShortArrayArrayArray4[local445][local438][arg7.anIntArray536[local438]]);
						}
					}
				}
			}
			if (Static612.aClass168_88 != null) {
				local15.s(local17);
				Static612.aClass168_88.method3853(local280, local15);
			}
		}
		if (arg1 == null || local106 == null) {
			return local15;
		} else {
			@Pc(642) Class43 local642 = local15.method8840((byte) 1, local17, true);
			local642.method8841(local108, local104, local106, arg1.aBoolean468, local100, 0, arg6 - 1, local102);
			return local642;
		}
	}
}
