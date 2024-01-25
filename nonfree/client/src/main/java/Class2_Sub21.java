import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!in")
public final class Class2_Sub21 extends Class2 {

	@OriginalMember(owner = "client!in", name = "q", descriptor = "[I")
	public int[] anIntArray245 = new int[] { -1 };

	@OriginalMember(owner = "client!in", name = "u", descriptor = "[I")
	public int[] anIntArray247 = new int[1];

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IILclient!dr;ZIBLclient!we;Lclient!gr;II)Lclient!wp;")
	public Class49 method2729(@OriginalArg(0) int arg0, @OriginalArg(2) Class37 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(6) Class217 arg4, @OriginalArg(7) Class84 arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7) {
		@Pc(7) Class49 local7 = null;
		@Pc(9) int local9 = 1024;
		@Pc(11) Class142 local11 = null;
		if (arg6 != -1) {
			local11 = Static64.method1322(arg6);
		}
		@Pc(21) int[] local21 = this.anIntArray245;
		if (local11 != null && local11.anIntArray357 != null) {
			local21 = new int[local11.anIntArray357.length];
			for (@Pc(33) int local33 = 0; local33 < local11.anIntArray357.length; local33++) {
				@Pc(40) int local40 = local11.anIntArray357[local33];
				if (local40 >= 0 && local40 < this.anIntArray245.length) {
					local21[local33] = this.anIntArray245[local40];
				} else {
					local21[local33] = -1;
				}
			}
		}
		@Pc(68) boolean local68 = false;
		@Pc(70) boolean local70 = false;
		@Pc(72) boolean local72 = false;
		@Pc(74) int local74 = -1;
		@Pc(76) int local76 = -1;
		@Pc(78) int local78 = 0;
		@Pc(80) Class2_Sub9_Sub2 local80 = null;
		@Pc(82) Class2_Sub9_Sub2 local82 = null;
		if (arg5 != null) {
			local74 = arg5.anIntArray197[arg7];
			local9 = 1056;
			@Pc(97) int local97 = local74 >>> 16;
			local74 &= 0xFFFF;
			local80 = Static276.method4760(local97);
			if (local80 != null) {
				local70 = local80.method1315(local74) | false;
				local68 = local80.method1314(local74) | false;
				local72 = arg5.aBoolean233 | false;
			}
			if ((arg5.aBoolean235 || Static263.aBoolean483) && arg0 != -1 && arg0 < arg5.anIntArray197.length) {
				local78 = arg5.anIntArray198[arg7];
				local76 = arg5.anIntArray197[arg0];
				@Pc(158) int local158 = local76 >>> 16;
				local76 &= 0xFFFF;
				if (local97 == local158) {
					local82 = local80;
				} else {
					local82 = Static276.method4760(local76 >>> 16);
				}
				if (local82 != null) {
					local70 |= local82.method1315(local76);
					local68 |= local82.method1314(local76);
				}
			}
			if (local70) {
				local9 = 1184;
			}
			if (local68) {
				local9 |= 0x100;
			}
			if (local72) {
				local9 |= 0x200;
			}
		}
		@Pc(232) long local232 = this.method2733(arg2, local21, arg6, arg4 == null ? null : arg4.anIntArray521);
		if (Static291.aClass107_34 != null) {
			local7 = (Class49) Static291.aClass107_34.method3021(local232);
		}
		if (local7 == null || arg1.method3686(local7.method5820(), local9) != 0) {
			if (local7 != null) {
				local9 = arg1.method3685(local9, local7.method5820());
			}
			@Pc(258) int local258 = local9;
			@Pc(260) boolean local260 = false;
			for (@Pc(262) int local262 = 0; local262 < local21.length; local262++) {
				if (local21[local262] != -1 && !Static310.aClass184_2.method5040(local21[local262]).method3408(arg2)) {
					local260 = true;
				}
			}
			if (local260) {
				return null;
			}
			@Pc(294) Class111[] local294 = new Class111[local21.length];
			for (@Pc(296) int local296 = 0; local296 < local21.length; local296++) {
				if (local21[local296] != -1) {
					local294[local296] = Static310.aClass184_2.method5040(local21[local296]).method3404(arg2);
				}
			}
			@Pc(348) int local348;
			if (local11 != null && local11.anIntArrayArray43 != null) {
				for (@Pc(328) int local328 = 0; local328 < local11.anIntArrayArray43.length; local328++) {
					if (local11.anIntArrayArray43[local328] != null && local294[local328] != null) {
						local348 = local11.anIntArrayArray43[local328][0];
						@Pc(355) int local355 = local11.anIntArrayArray43[local328][1];
						@Pc(362) int local362 = local11.anIntArrayArray43[local328][2];
						@Pc(369) int local369 = local11.anIntArrayArray43[local328][3];
						@Pc(376) int local376 = local11.anIntArrayArray43[local328][4];
						@Pc(383) int local383 = local11.anIntArrayArray43[local328][5];
						if (local369 != 0 || local376 != 0 || local383 != 0) {
							local294[local328].method3248(local376, local383, local369);
						}
						if (local348 != 0 || local355 != 0 || local362 != 0) {
							local294[local328].method3250(local348, local355, local362);
						}
					}
				}
			}
			if (arg4 != null) {
				local258 = local9 | 0x2000;
			}
			@Pc(437) Class111 local437 = new Class111(local294, local294.length);
			local7 = arg1.method3667(local437, local258, Static301.anInt5990, 64, 850);
			if (arg4 != null) {
				for (local348 = 0; local348 < 5; local348++) {
					if (Static26.aShortArrayArray12[local348].length > arg4.anIntArray521[local348]) {
						local7.method5850(Static298.aShortArray101[local348], Static26.aShortArrayArray12[local348][arg4.anIntArray521[local348]]);
					}
					if (Static103.aShortArrayArray11[local348].length > arg4.anIntArray521[local348]) {
						local7.method5850(Static195.aShortArray78[local348], Static103.aShortArrayArray11[local348][arg4.anIntArray521[local348]]);
					}
				}
			}
			if (Static291.aClass107_34 != null) {
				local7.method5854(local9);
				Static291.aClass107_34.method3018(local232, local7);
			}
		}
		if (arg5 == null || local80 == null) {
			return local7;
		} else {
			@Pc(529) Class49 local529 = local7.method5810((byte) 1, local9, true);
			local529.method5848(local78, local76, 0, local82, arg3 - 1, local80, arg5.aBoolean233, local74);
			return local529;
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(Z[IIB[I)J")
	private long method2733(@OriginalArg(0) boolean arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3) {
		@Pc(7) long[] local7 = Class117.aLongArray5;
		@Pc(9) long local9 = -1L;
		@Pc(25) long local25 = local7[(int) ((local9 ^ (long) (arg2 >> 8)) & 0xFFL)] ^ local9 >>> 8;
		local9 = local25 >>> 8 ^ local7[(int) (((long) arg2 ^ local25) & 0xFFL)];
		for (@Pc(57) int local57 = 0; local57 < arg1.length; local57++) {
			local9 = local7[(int) (((long) (arg1[local57] >> 24) ^ local9) & 0xFFL)] ^ local9 >>> 8;
			local9 = local7[(int) ((local9 ^ (long) (arg1[local57] >> 16)) & 0xFFL)] ^ local9 >>> 8;
			local9 = local7[(int) ((local9 ^ (long) (arg1[local57] >> 8)) & 0xFFL)] ^ local9 >>> 8;
			local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) arg1[local57]) & 0xFFL)];
		}
		if (arg3 != null) {
			for (@Pc(138) int local138 = 0; local138 < 5; local138++) {
				local9 = local7[(int) (((long) arg3[local138] ^ local9) & 0xFFL)] ^ local9 >>> 8;
			}
		}
		return local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg0 ? 1 : 0)) & 0xFFL)];
	}
}
