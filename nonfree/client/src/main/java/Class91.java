import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class91 {

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "Z")
	public boolean aBoolean263;

	@OriginalMember(owner = "client!tb", name = "g", descriptor = "[I")
	private int[] anIntArray439;

	@OriginalMember(owner = "client!tb", name = "k", descriptor = "[I")
	private int[] anIntArray440;

	@OriginalMember(owner = "client!tb", name = "s", descriptor = "J")
	private long aLong131;

	@OriginalMember(owner = "client!tb", name = "t", descriptor = "I")
	private int anInt4252;

	@OriginalMember(owner = "client!tb", name = "w", descriptor = "J")
	private long aLong132;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)I")
	public int method2927() {
		return this.anInt4252 == -1 ? (this.anIntArray440[11] << 5) + (this.anIntArray439[0] << 25) + (this.anIntArray439[4] << 20) + (this.anIntArray440[0] << 15) + (this.anIntArray440[8] << 10) + this.anIntArray440[1] : 305419896 - -Static132.method2097(this.anInt4252).anInt2653;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(BLclient!k;I)Lclient!cg;")
	public Class12_Sub2 method2928(@OriginalArg(1) Class2_Sub2_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt4252 != -1) {
			return Static132.method2097(this.anInt4252).method1904(arg1, arg0);
		}
		@Pc(33) Class12_Sub2 local33 = (Class12_Sub2) Static127.aClass16_8.method437(this.aLong131);
		if (local33 == null) {
			@Pc(37) boolean local37 = false;
			for (@Pc(39) int local39 = 0; local39 < 12; local39++) {
				@Pc(46) int local46 = this.anIntArray440[local39];
				if ((local46 & 0x40000000) == 0) {
					if ((local46 & Integer.MIN_VALUE) != 0 && !Static90.method1573(local46 & 0x3FFFFFFF).method3168()) {
						local37 = true;
					}
				} else if (!Static63.method1158(local46 & 0x3FFFFFFF).method2147(this.aBoolean263)) {
					local37 = true;
				}
			}
			if (local37) {
				return null;
			}
			@Pc(91) int local91 = 0;
			@Pc(94) Class12_Sub6[] local94 = new Class12_Sub6[12];
			for (@Pc(96) int local96 = 0; local96 < 12; local96++) {
				@Pc(103) int local103 = this.anIntArray440[local96];
				@Pc(125) Class12_Sub6 local125;
				if ((local103 & 0x40000000) != 0) {
					local125 = Static63.method1158(local103 & 0x3FFFFFFF).method2148(this.aBoolean263);
					if (local125 != null) {
						local94[local91++] = local125;
					}
				} else if ((local103 & Integer.MIN_VALUE) != 0) {
					local125 = Static90.method1573(local103 & 0x3FFFFFFF).method3166();
					if (local125 != null) {
						local94[local91++] = local125;
					}
				}
			}
			@Pc(163) Class12_Sub6 local163 = new Class12_Sub6(local94, local91);
			for (@Pc(165) int local165 = 0; local165 < 5; local165++) {
				if (this.anIntArray439[local165] < Static6.aShortArrayArray1[local165].length) {
					local163.method1332(Static13.aShortArray12[local165], Static6.aShortArrayArray1[local165][this.anIntArray439[local165]]);
				}
				if (this.anIntArray439[local165] < Static76.aShortArrayArray3[local165].length) {
					local163.method1332(Static131.aShortArray90[local165], Static76.aShortArrayArray3[local165][this.anIntArray439[local165]]);
				}
			}
			local33 = local163.method1315(64, 768, -50, -10, -50);
			Static127.aClass16_8.method432(this.aLong131, local33);
		}
		if (arg0 != null) {
			local33 = arg0.method1669(arg1, local33);
		}
		return local33;
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)V")
	private void method2929() {
		@Pc(8) long local8 = this.aLong131;
		this.aLong131 = -1L;
		@Pc(13) long[] local13 = Class64.aLongArray8;
		for (@Pc(15) int local15 = 0; local15 < 12; local15++) {
			this.aLong131 = local13[(int) (((long) (this.anIntArray440[local15] >> 24) ^ this.aLong131) & 0xFFL)] ^ this.aLong131 >>> 8;
			this.aLong131 = this.aLong131 >>> 8 ^ local13[(int) (((long) (this.anIntArray440[local15] >> 16) ^ this.aLong131) & 0xFFL)];
			this.aLong131 = this.aLong131 >>> 8 ^ local13[(int) (((long) (this.anIntArray440[local15] >> 8) ^ this.aLong131) & 0xFFL)];
			this.aLong131 = this.aLong131 >>> 8 ^ local13[(int) (((long) this.anIntArray440[local15] ^ this.aLong131) & 0xFFL)];
		}
		for (@Pc(109) int local109 = 0; local109 < 5; local109++) {
			this.aLong131 = local13[(int) (((long) this.anIntArray439[local109] ^ this.aLong131) & 0xFFL)] ^ this.aLong131 >>> 8;
		}
		this.aLong131 = local13[(int) ((this.aLong131 ^ (long) (this.aBoolean263 ? 1 : 0)) & 0xFFL)] ^ this.aLong131 >>> 8;
		if (local8 != 0L && local8 != this.aLong131) {
			Static81.aClass16_4.method435(local8);
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!k;IIILclient!k;)Lclient!cg;")
	public Class12_Sub2 method2930(@OriginalArg(0) Class2_Sub2_Sub9 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2_Sub2_Sub9 arg3) {
		if (this.anInt4252 != -1) {
			return Static132.method2097(this.anInt4252).method1905(arg0, arg2, arg1, arg3);
		}
		@Pc(23) long local23 = this.aLong131;
		@Pc(26) int[] local26 = this.anIntArray440;
		if (arg3 != null && (arg3.anInt2361 >= 0 || arg3.anInt2344 >= 0)) {
			local26 = new int[12];
			for (@Pc(45) int local45 = 0; local45 < 12; local45++) {
				local26[local45] = this.anIntArray440[local45];
			}
			if (arg3.anInt2361 >= 0) {
				if (arg3.anInt2361 == 65535) {
					local26[5] = 0;
					local23 ^= 0xFFFFFFFF00000000L;
				} else {
					local26[5] = arg3.anInt2361 | 0x40000000;
					local23 ^= (long) local26[5] << 32;
				}
			}
			if (arg3.anInt2344 >= 0) {
				if (arg3.anInt2344 == 65535) {
					local26[3] = 0;
					local23 ^= 0xFFFFFFFFL;
				} else {
					local26[3] = arg3.anInt2344 | 0x40000000;
					local23 ^= local26[3];
				}
			}
		}
		@Pc(131) Class12_Sub2 local131 = (Class12_Sub2) Static81.aClass16_4.method437(local23);
		if (local131 == null) {
			@Pc(135) boolean local135 = false;
			for (@Pc(137) int local137 = 0; local137 < 12; local137++) {
				@Pc(143) int local143 = local26[local137];
				if ((local143 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local143) != 0 && !Static90.method1573(local143 & 0x3FFFFFFF).method3170()) {
						local135 = true;
					}
				} else if (!Static63.method1158(local143 & 0x3FFFFFFF).method2154(this.aBoolean263)) {
					local135 = true;
				}
			}
			if (local135) {
				if (this.aLong132 != -1L) {
					local131 = (Class12_Sub2) Static81.aClass16_4.method437(this.aLong132);
				}
				if (local131 == null) {
					return null;
				}
			}
			if (local131 == null) {
				@Pc(212) Class12_Sub6[] local212 = new Class12_Sub6[12];
				@Pc(214) int local214 = 0;
				@Pc(222) int local222;
				@Pc(236) Class12_Sub6 local236;
				for (@Pc(216) int local216 = 0; local216 < 12; local216++) {
					local222 = local26[local216];
					if ((local222 & 0x40000000) != 0) {
						local236 = Static63.method1158(local222 & 0x3FFFFFFF).method2143(this.aBoolean263);
						if (local236 != null) {
							local212[local214++] = local236;
						}
					} else if ((Integer.MIN_VALUE & local222) != 0) {
						local236 = Static90.method1573(local222 & 0x3FFFFFFF).method3163();
						if (local236 != null) {
							local212[local214++] = local236;
						}
					}
				}
				local222 = local26[0];
				@Pc(292) int local292;
				if ((local222 & 0x40000000) != 0) {
					@Pc(287) Class2_Sub2_Sub15 local287 = Static63.method1158(local222 & 0x3FFFFFFF);
					if (local287.anIntArrayArray26 != null) {
						for (local292 = 0; local292 < local287.anIntArrayArray26.length; local292++) {
							@Pc(301) int local301 = local287.anIntArrayArray26[local292][1];
							@Pc(308) int local308 = local287.anIntArrayArray26[local292][3];
							@Pc(315) int local315 = local287.anIntArrayArray26[local292][0];
							@Pc(322) int local322 = local287.anIntArrayArray26[local292][2];
							@Pc(329) int local329 = local287.anIntArrayArray26[local292][4];
							@Pc(336) int local336 = local287.anIntArrayArray26[local292][5];
							local212[local292 + 1].method1318(local315, local301, local322);
							local212[local292 + 1].method1333(local308, local329, local336);
						}
					}
				}
				local236 = new Class12_Sub6(local212, local214);
				for (local292 = 0; local292 < 5; local292++) {
					if (this.anIntArray439[local292] < Static6.aShortArrayArray1[local292].length) {
						local236.method1332(Static13.aShortArray12[local292], Static6.aShortArrayArray1[local292][this.anIntArray439[local292]]);
					}
					if (Static76.aShortArrayArray3[local292].length > this.anIntArray439[local292]) {
						local236.method1332(Static131.aShortArray90[local292], Static76.aShortArrayArray3[local292][this.anIntArray439[local292]]);
					}
				}
				local131 = local236.method1315(64, 850, -30, -50, -30);
				Static81.aClass16_4.method432(local23, local131);
				this.aLong132 = local23;
			}
		}
		if (arg3 == null && arg0 == null) {
			return local131;
		}
		@Pc(460) Class12_Sub2 local460;
		if (arg3 != null && arg0 != null) {
			local460 = arg3.method1665(arg1, arg0, arg2, local131);
		} else if (arg3 == null) {
			local460 = arg0.method1661(arg2, local131);
		} else {
			local460 = arg3.method1661(arg1, local131);
		}
		return local460;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IZ[I[IZ)V")
	public void method2931(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) boolean arg3) {
		if (arg1 == null) {
			arg1 = new int[12];
			for (@Pc(8) int local8 = 0; local8 < 7; local8++) {
				for (@Pc(12) int local12 = 0; local12 < Static21.anInt4636; local12++) {
					@Pc(18) Class2_Sub2_Sub25 local18 = Static90.method1573(local12);
					if (local18 != null && !local18.aBoolean282 && local8 + (arg3 ? 7 : 0) == local18.anInt4577) {
						arg1[Static50.anIntArray206[local8]] = local12 | Integer.MIN_VALUE;
						break;
					}
				}
			}
		}
		this.anIntArray440 = arg1;
		this.anIntArray439 = arg2;
		this.aBoolean263 = arg3;
		this.anInt4252 = arg0;
		this.method2929();
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(BII)V")
	public void method2932(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray439[arg1] = arg0;
		this.method2929();
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IZ)V")
	public void method2934(@OriginalArg(1) boolean arg0) {
		this.aBoolean263 = arg0;
		this.method2929();
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IBI)V")
	public void method2935(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) int local3 = Static50.anIntArray206[arg0];
		if (this.anIntArray440[local3] != 0 && Static90.method1573(arg1) != null) {
			this.anIntArray440[local3] = Integer.MIN_VALUE | arg1;
			this.method2929();
		}
	}
}
