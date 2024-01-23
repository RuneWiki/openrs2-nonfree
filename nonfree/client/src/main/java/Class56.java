import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public final class Class56 {

	@OriginalMember(owner = "client!id", name = "a", descriptor = "J")
	private long aLong74;

	@OriginalMember(owner = "client!id", name = "b", descriptor = "[I")
	private int[] anIntArray202;

	@OriginalMember(owner = "client!id", name = "l", descriptor = "[I")
	private int[] anIntArray203;

	@OriginalMember(owner = "client!id", name = "r", descriptor = "I")
	public int anInt1979;

	@OriginalMember(owner = "client!id", name = "v", descriptor = "J")
	private long aLong75;

	@OriginalMember(owner = "client!id", name = "x", descriptor = "Z")
	public boolean aBoolean181;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(B)I")
	public int method1531() {
		return this.anInt1979 == -1 ? this.anIntArray203[1] + (this.anIntArray203[11] << 5) + (this.anIntArray202[4] << 20) + (this.anIntArray202[0] << 25) + (this.anIntArray203[0] << 15) + (this.anIntArray203[8] << 10) : 305419896 - -Static139.method2340(this.anInt1979).anInt964;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIILclient!qa;)Lclient!nb;")
	public Class5_Sub3 method1534(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class96 arg3) {
		@Pc(18) long local18 = (long) (arg1 << 16) | (long) arg0 << 32 | (long) arg0;
		@Pc(32) Class5_Sub3 local32 = (Class5_Sub3) Static192.aClass61_74.method1693(local18);
		if (local32 == null) {
			@Pc(37) Class5_Sub1[] local37 = new Class5_Sub1[2];
			@Pc(39) int local39 = 0;
			if (!Static230.method3726(arg0).method1588() || !Static230.method3726(arg1).method1588()) {
				return null;
			}
			@Pc(59) Class5_Sub1 local59 = Static230.method3726(arg0).method1579();
			if (local59 != null) {
				local39++;
				local37[0] = local59;
			}
			local59 = Static230.method3726(arg1).method1579();
			if (local59 != null) {
				local37[local39++] = local59;
			}
			local59 = new Class5_Sub1(local37, local39);
			for (@Pc(87) int local87 = 0; local87 < 5; local87++) {
				if (this.anIntArray202[local87] < Static49.aShortArrayArray3[local87].length) {
					local59.method271(Static62.aShortArray21[local87], Static49.aShortArrayArray3[local87][this.anIntArray202[local87]]);
				}
				if (Static161.aShortArrayArray8[local87].length > this.anIntArray202[local87]) {
					local59.method271(Static95.aShortArray28[local87], Static161.aShortArrayArray8[local87][this.anIntArray202[local87]]);
				}
			}
			local32 = local59.method274(64, 768, -50, -10, -50);
			Static192.aClass61_74.method1694(local18, local32);
		}
		if (arg3 != null) {
			local32 = arg3.method2701(arg2, local32);
		}
		return local32;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IB[I[IZ)V")
	public void method1535(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) boolean arg3) {
		if (arg2 == null) {
			arg2 = new int[12];
			for (@Pc(16) int local16 = 0; local16 < 7; local16++) {
				for (@Pc(20) int local20 = 0; local20 < Static224.anInt4886; local20++) {
					@Pc(26) Class58 local26 = Static230.method3726(local20);
					if (local26 != null && !local26.aBoolean185 && (arg3 ? 7 : 0) + local16 == local26.anInt2029) {
						arg2[Static177.anIntArray333[local16]] = local20 | Integer.MIN_VALUE;
						break;
					}
				}
			}
		}
		this.anIntArray203 = arg2;
		this.anInt1979 = arg0;
		this.aBoolean181 = arg3;
		this.anIntArray202 = arg1;
		this.method1543();
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ZI)V")
	public void method1537(@OriginalArg(0) boolean arg0) {
		this.aBoolean181 = arg0;
		this.method1543();
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!qa;II)Lclient!nb;")
	public Class5_Sub3 method1538(@OriginalArg(0) Class96 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt1979 != -1) {
			return Static139.method2340(this.anInt1979).method869(arg0, arg1);
		}
		@Pc(31) Class5_Sub3 local31 = (Class5_Sub3) Static192.aClass61_74.method1693(this.aLong75);
		if (local31 == null) {
			@Pc(35) boolean local35 = false;
			for (@Pc(37) int local37 = 0; local37 < 12; local37++) {
				@Pc(44) int local44 = this.anIntArray203[local37];
				if ((local44 & 0x40000000) == 0) {
					if ((local44 & Integer.MIN_VALUE) != 0 && !Static230.method3726(local44 & 0x3FFFFFFF).method1588()) {
						local35 = true;
					}
				} else if (!Static128.method2147(local44 & 0x3FFFFFFF).method2112(this.aBoolean181)) {
					local35 = true;
				}
			}
			if (local35) {
				return null;
			}
			@Pc(92) Class5_Sub1[] local92 = new Class5_Sub1[12];
			@Pc(94) int local94 = 0;
			for (@Pc(96) int local96 = 0; local96 < 12; local96++) {
				@Pc(103) int local103 = this.anIntArray203[local96];
				@Pc(122) Class5_Sub1 local122;
				if ((local103 & 0x40000000) != 0) {
					local122 = Static128.method2147(local103 & 0x3FFFFFFF).method2108(this.aBoolean181);
					if (local122 != null) {
						local92[local94++] = local122;
					}
				} else if ((Integer.MIN_VALUE & local103) != 0) {
					local122 = Static230.method3726(local103 & 0x3FFFFFFF).method1579();
					if (local122 != null) {
						local92[local94++] = local122;
					}
				}
			}
			@Pc(165) Class5_Sub1 local165 = new Class5_Sub1(local92, local94);
			for (@Pc(167) int local167 = 0; local167 < 5; local167++) {
				if (Static49.aShortArrayArray3[local167].length > this.anIntArray202[local167]) {
					local165.method271(Static62.aShortArray21[local167], Static49.aShortArrayArray3[local167][this.anIntArray202[local167]]);
				}
				if (this.anIntArray202[local167] < Static161.aShortArrayArray8[local167].length) {
					local165.method271(Static95.aShortArray28[local167], Static161.aShortArrayArray8[local167][this.anIntArray202[local167]]);
				}
			}
			local31 = local165.method274(64, 768, -50, -10, -50);
			Static192.aClass61_74.method1694(this.aLong75, local31);
		}
		if (arg0 != null) {
			local31 = arg0.method2701(arg1, local31);
		}
		return local31;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(BII)V")
	public void method1542(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray202[arg1] = arg0;
		this.method1543();
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Z)V")
	private void method1543() {
		@Pc(19) long local19 = this.aLong75;
		this.aLong75 = -1L;
		@Pc(24) long[] local24 = Class21.aLongArray2;
		for (@Pc(26) int local26 = 0; local26 < 12; local26++) {
			this.aLong75 = local24[(int) (((long) (this.anIntArray203[local26] >> 24) ^ this.aLong75) & 0xFFL)] ^ this.aLong75 >>> 8;
			this.aLong75 = local24[(int) ((this.aLong75 ^ (long) (this.anIntArray203[local26] >> 16)) & 0xFFL)] ^ this.aLong75 >>> 8;
			this.aLong75 = local24[(int) ((this.aLong75 ^ (long) (this.anIntArray203[local26] >> 8)) & 0xFFL)] ^ this.aLong75 >>> 8;
			this.aLong75 = local24[(int) (((long) this.anIntArray203[local26] ^ this.aLong75) & 0xFFL)] ^ this.aLong75 >>> 8;
		}
		for (@Pc(122) int local122 = 0; local122 < 5; local122++) {
			this.aLong75 = local24[(int) (((long) this.anIntArray202[local122] ^ this.aLong75) & 0xFFL)] ^ this.aLong75 >>> 8;
		}
		this.aLong75 = local24[(int) (((long) (this.aBoolean181 ? 1 : 0) ^ this.aLong75) & 0xFFL)] ^ this.aLong75 >>> 8;
		if (local19 != 0L && local19 != this.aLong75) {
			Static98.aClass61_36.method1696(local19);
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IBI)V")
	public void method1544(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) int local3 = Static177.anIntArray333[arg1];
		if (this.anIntArray203[local3] != 0 && Static230.method3726(arg0) != null) {
			this.anIntArray203[local3] = Integer.MIN_VALUE | arg0;
			this.method1543();
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IZLclient!qa;Lclient!qa;I)Lclient!nb;")
	public Class5_Sub3 method1545(@OriginalArg(0) int arg0, @OriginalArg(2) Class96 arg1, @OriginalArg(3) Class96 arg2, @OriginalArg(4) int arg3) {
		if (this.anInt1979 != -1) {
			return Static139.method2340(this.anInt1979).method874(arg2, arg1, arg0, arg3);
		}
		@Pc(24) long local24 = this.aLong75;
		@Pc(27) int[] local27 = this.anIntArray203;
		if (arg1 != null && (arg1.anInt3655 >= 0 || arg1.anInt3651 >= 0)) {
			local27 = new int[12];
			for (@Pc(43) int local43 = 0; local43 < 12; local43++) {
				local27[local43] = this.anIntArray203[local43];
			}
			if (arg1.anInt3655 >= 0) {
				if (arg1.anInt3655 == 65535) {
					local27[5] = 0;
					local24 ^= 0xFFFFFFFF00000000L;
				} else {
					local27[5] = arg1.anInt3655 | 0x40000000;
					local24 ^= (long) local27[5] << 32;
				}
			}
			if (arg1.anInt3651 >= 0) {
				if (arg1.anInt3651 == 65535) {
					local27[3] = 0;
					local24 ^= 0xFFFFFFFFL;
				} else {
					local27[3] = arg1.anInt3651 | 0x40000000;
					local24 ^= local27[3];
				}
			}
		}
		@Pc(126) Class5_Sub3 local126 = (Class5_Sub3) Static98.aClass61_36.method1693(local24);
		if (local126 == null) {
			@Pc(130) boolean local130 = false;
			for (@Pc(132) int local132 = 0; local132 < 12; local132++) {
				@Pc(138) int local138 = local27[local132];
				if ((local138 & 0x40000000) == 0) {
					if ((local138 & Integer.MIN_VALUE) != 0 && !Static230.method3726(local138 & 0x3FFFFFFF).method1581()) {
						local130 = true;
					}
				} else if (!Static128.method2147(local138 & 0x3FFFFFFF).method2115(this.aBoolean181)) {
					local130 = true;
				}
			}
			if (local130) {
				if (this.aLong74 != -1L) {
					local126 = (Class5_Sub3) Static98.aClass61_36.method1693(this.aLong74);
				}
				if (local126 == null) {
					return null;
				}
			}
			if (local126 == null) {
				@Pc(197) Class5_Sub1[] local197 = new Class5_Sub1[12];
				@Pc(199) int local199 = 0;
				@Pc(207) int local207;
				@Pc(229) Class5_Sub1 local229;
				for (@Pc(201) int local201 = 0; local201 < 12; local201++) {
					local207 = local27[local201];
					if ((local207 & 0x40000000) != 0) {
						local229 = Static128.method2147(local207 & 0x3FFFFFFF).method2111(this.aBoolean181);
						if (local229 != null) {
							local197[local199++] = local229;
						}
					} else if ((Integer.MIN_VALUE & local207) != 0) {
						local229 = Static230.method3726(local207 & 0x3FFFFFFF).method1590();
						if (local229 != null) {
							local197[local199++] = local229;
						}
					}
				}
				local207 = local27[0];
				@Pc(280) int local280;
				if ((local207 & 0x40000000) != 0) {
					@Pc(275) Class75 local275 = Static128.method2147(local207 & 0x3FFFFFFF);
					if (local275.anIntArrayArray29 != null) {
						for (local280 = 0; local280 < local275.anIntArrayArray29.length; local280++) {
							if (local275.anIntArrayArray29[local280] != null && local197[local280 + 1] != null) {
								@Pc(302) int local302 = local275.anIntArrayArray29[local280][1];
								@Pc(309) int local309 = local275.anIntArrayArray29[local280][3];
								@Pc(316) int local316 = local275.anIntArrayArray29[local280][2];
								@Pc(323) int local323 = local275.anIntArrayArray29[local280][5];
								@Pc(330) int local330 = local275.anIntArrayArray29[local280][4];
								@Pc(337) int local337 = local275.anIntArrayArray29[local280][0];
								local197[local280 + 1].method285(local337, local302, local316);
								local197[local280 + 1].method292(local309, local330, local323);
							}
						}
					}
				}
				local229 = new Class5_Sub1(local197, local199);
				for (local280 = 0; local280 < 5; local280++) {
					if (this.anIntArray202[local280] < Static49.aShortArrayArray3[local280].length) {
						local229.method271(Static62.aShortArray21[local280], Static49.aShortArrayArray3[local280][this.anIntArray202[local280]]);
					}
					if (this.anIntArray202[local280] < Static161.aShortArrayArray8[local280].length) {
						local229.method271(Static95.aShortArray28[local280], Static161.aShortArrayArray8[local280][this.anIntArray202[local280]]);
					}
				}
				local126 = local229.method274(64, 850, -30, -50, -30);
				Static98.aClass61_36.method1694(local24, local126);
				this.aLong74 = local24;
			}
		}
		if (arg1 == null && arg2 == null) {
			return local126;
		}
		@Pc(457) Class5_Sub3 local457;
		if (arg1 != null && arg2 != null) {
			local457 = arg1.method2695(arg0, arg3, arg2, local126);
		} else if (arg1 == null) {
			local457 = arg2.method2697(local126, arg3);
		} else {
			local457 = arg1.method2697(local126, arg0);
		}
		return local457;
	}
}
