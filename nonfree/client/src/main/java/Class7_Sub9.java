import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!el")
public final class Class7_Sub9 extends Class7 {

	@OriginalMember(owner = "client!el", name = "v", descriptor = "[I")
	public int[] anIntArray262 = new int[] { -1 };

	@OriginalMember(owner = "client!el", name = "w", descriptor = "[I")
	public int[] anIntArray263 = new int[1];

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(ZLclient!pe;IBIILclient!we;Lclient!qi;II)Lclient!sj;")
	public Class31 method1499(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class89 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class214 arg5, @OriginalArg(7) Class170 arg6, @OriginalArg(8) int arg7) {
		@Pc(5) Class31 local5 = null;
		@Pc(7) int local7 = 1024;
		@Pc(9) Class79 local9 = null;
		if (arg4 != -1) {
			local9 = Static136.method2691(arg4);
		}
		@Pc(19) int[] local19 = this.anIntArray262;
		if (local9 != null && local9.anIntArray324 != null) {
			local19 = new int[local9.anIntArray324.length];
			for (@Pc(31) int local31 = 0; local31 < local9.anIntArray324.length; local31++) {
				@Pc(37) int local37 = local9.anIntArray324[local31];
				if (local37 >= 0 && this.anIntArray262.length > local37) {
					local19[local31] = this.anIntArray262[local37];
				} else {
					local19[local31] = -1;
				}
			}
		}
		@Pc(64) boolean local64 = false;
		@Pc(66) boolean local66 = false;
		@Pc(68) boolean local68 = false;
		@Pc(70) int local70 = -1;
		@Pc(72) int local72 = -1;
		@Pc(74) int local74 = 0;
		@Pc(85) Class7_Sub1_Sub14 local85 = null;
		@Pc(87) Class7_Sub1_Sub14 local87 = null;
		if (arg6 != null) {
			local70 = arg6.anIntArray652[arg7];
			local7 = 1056;
			@Pc(102) int local102 = local70 >>> 16;
			local85 = Static85.method1807(local102);
			local70 &= 0xFFFF;
			if (local85 != null) {
				local66 = local85.method4053(local70) | false;
				local64 = local85.method4058(local70) | false;
				local68 = arg6.aBoolean365 | false;
			}
			if ((arg6.aBoolean364 || Static214.aBoolean327) && arg2 != -1 && arg6.anIntArray652.length > arg2) {
				local74 = arg6.anIntArray650[arg7];
				local72 = arg6.anIntArray652[arg2];
				@Pc(163) int local163 = local72 >>> 16;
				local72 &= 0xFFFF;
				if (local102 == local163) {
					local87 = local85;
				} else {
					local87 = Static85.method1807(local72 >>> 16);
				}
				if (local87 != null) {
					local66 |= local87.method4053(local72);
					local64 |= local87.method4058(local72);
				}
			}
			if (local66) {
				local7 = 1184;
			}
			if (local64) {
				local7 |= 0x100;
			}
			if (local68) {
				local7 |= 0x200;
			}
		}
		@Pc(230) long local230 = this.method1505(local19, arg5 == null ? null : arg5.anIntArray832, arg0, arg4);
		if (Static216.aClass103_41 != null) {
			local5 = (Class31) Static216.aClass103_41.method2682(local230);
		}
		if (local5 == null || arg1.method5399(local5.method1912(), local7) != 0) {
			if (local5 != null) {
				local7 = arg1.method5435(local7, local5.method1912());
			}
			@Pc(256) int local256 = local7;
			@Pc(258) boolean local258 = false;
			for (@Pc(260) int local260 = 0; local260 < local19.length; local260++) {
				if (local19[local260] != -1 && !Static17.method4472(local19[local260]).method3594(arg0)) {
					local258 = true;
				}
			}
			if (local258) {
				return null;
			}
			@Pc(294) Class140[] local294 = new Class140[local19.length];
			for (@Pc(296) int local296 = 0; local296 < local19.length; local296++) {
				if (local19[local296] != -1) {
					local294[local296] = Static17.method4472(local19[local296]).method3585(arg0);
				}
			}
			@Pc(347) int local347;
			if (local9 != null && local9.anIntArrayArray21 != null) {
				for (@Pc(329) int local329 = 0; local329 < local9.anIntArrayArray21.length; local329++) {
					if (local9.anIntArrayArray21[local329] != null && local294[local329] != null) {
						local347 = local9.anIntArrayArray21[local329][0];
						@Pc(354) int local354 = local9.anIntArrayArray21[local329][1];
						@Pc(361) int local361 = local9.anIntArrayArray21[local329][2];
						@Pc(368) int local368 = local9.anIntArrayArray21[local329][3];
						@Pc(375) int local375 = local9.anIntArrayArray21[local329][4];
						@Pc(382) int local382 = local9.anIntArrayArray21[local329][5];
						if (local368 != 0 || local375 != 0 || local382 != 0) {
							local294[local329].method3682(local382, local375, local368);
						}
						if (local347 != 0 || local354 != 0 || local361 != 0) {
							local294[local329].method3684(local361, local347, local354);
						}
					}
				}
			}
			if (arg5 != null) {
				local256 = local7 | 0x2000;
			}
			@Pc(438) Class140 local438 = new Class140(local294, local294.length);
			local5 = arg1.method5475(local438, local256, Static183.anInt3716, 64, 850);
			if (arg5 != null) {
				for (local347 = 0; local347 < 5; local347++) {
					if (arg5.anIntArray832[local347] < Static314.aShortArrayArray7[local347].length) {
						local5.method1929(Static310.aShortArray112[local347], Static314.aShortArrayArray7[local347][arg5.anIntArray832[local347]]);
					}
					if (Static200.aShortArrayArray4[local347].length > arg5.anIntArray832[local347]) {
						local5.method1929(Static17.aShortArray110[local347], Static200.aShortArrayArray4[local347][arg5.anIntArray832[local347]]);
					}
				}
			}
			if (Static216.aClass103_41 != null) {
				local5.method1908(local7);
				Static216.aClass103_41.method2687(local5, local230);
			}
		}
		if (arg6 == null || local85 == null) {
			return local5;
		} else {
			@Pc(531) Class31 local531 = local5.method1917((byte) 1, local7, true);
			local531.method1931(arg3 - 1, local85, local74, local87, local72, local70, arg6.aBoolean365, 0);
			return local531;
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "([I[IZII)J")
	private long method1505(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(5) long[] local5 = Class22_Sub5.aLongArray10;
		@Pc(7) long local7 = -1L;
		@Pc(23) long local23 = local5[(int) ((local7 ^ (long) (arg3 >> 8)) & 0xFFL)] ^ local7 >>> 8;
		local7 = local5[(int) ((local23 ^ (long) arg3) & 0xFFL)] ^ local23 >>> 8;
		for (@Pc(39) int local39 = 0; local39 < arg0.length; local39++) {
			local7 = local7 >>> 8 ^ local5[(int) ((local7 ^ (long) (arg0[local39] >> 24)) & 0xFFL)];
			local7 = local7 >>> 8 ^ local5[(int) (((long) (arg0[local39] >> 16) ^ local7) & 0xFFL)];
			local7 = local5[(int) ((local7 ^ (long) (arg0[local39] >> 8)) & 0xFFL)] ^ local7 >>> 8;
			local7 = local7 >>> 8 ^ local5[(int) ((local7 ^ (long) arg0[local39]) & 0xFFL)];
		}
		if (arg1 != null) {
			for (@Pc(119) int local119 = 0; local119 < 5; local119++) {
				local7 = local7 >>> 8 ^ local5[(int) (((long) arg1[local119] ^ local7) & 0xFFL)];
			}
		}
		return local7 >>> 8 ^ local5[(int) (((long) (arg2 ? 1 : 0) ^ local7) & 0xFFL)];
	}
}
