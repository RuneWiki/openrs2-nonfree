import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!li")
public final class Class1_Sub14 extends Class1 {

	@OriginalMember(owner = "client!li", name = "s", descriptor = "[Lclient!ti;")
	public final Class1_Sub9_Sub1[] aClass1_Sub9_Sub1Array1 = new Class1_Sub9_Sub1[128];

	@OriginalMember(owner = "client!li", name = "v", descriptor = "I")
	public final int anInt2580;

	@OriginalMember(owner = "client!li", name = "w", descriptor = "[S")
	public final short[] aShortArray30 = new short[128];

	@OriginalMember(owner = "client!li", name = "z", descriptor = "[Lclient!hi;")
	public final Class43[] aClass43Array1 = new Class43[128];

	@OriginalMember(owner = "client!li", name = "A", descriptor = "[B")
	public final byte[] aByteArray25 = new byte[128];

	@OriginalMember(owner = "client!li", name = "F", descriptor = "[B")
	public final byte[] aByteArray26 = new byte[128];

	@OriginalMember(owner = "client!li", name = "G", descriptor = "[B")
	public final byte[] aByteArray27 = new byte[128];

	@OriginalMember(owner = "client!li", name = "I", descriptor = "[I")
	private int[] anIntArray204 = new int[128];

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "([B)V")
	public Class1_Sub14(@OriginalArg(0) byte[] arg0) {
		@Pc(36) Class1_Sub7 local36 = new Class1_Sub7(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray38[local38 + local36.anInt3592] != 0; local38++) {
		}
		@Pc(55) byte[] local55 = new byte[local38];
		for (@Pc(57) int local57 = 0; local57 < local38; local57++) {
			local55[local57] = local36.method2770();
		}
		local36.anInt3592++;
		local38++;
		@Pc(79) int local79 = local36.anInt3592;
		local36.anInt3592 += local38;
		@Pc(87) int local87;
		for (local87 = 0; local36.aByteArray38[local87 + local36.anInt3592] != 0; local87++) {
		}
		@Pc(104) byte[] local104 = new byte[local87];
		for (@Pc(106) int local106 = 0; local106 < local87; local106++) {
			local104[local106] = local36.method2770();
		}
		local87++;
		local36.anInt3592++;
		@Pc(128) int local128 = local36.anInt3592;
		@Pc(130) int local130 = 0;
		local36.anInt3592 += local87;
		while (local36.aByteArray38[local36.anInt3592 + local130] != 0) {
			local130++;
		}
		@Pc(154) byte[] local154 = new byte[local130];
		for (@Pc(156) int local156 = 0; local156 < local130; local156++) {
			local154[local156] = local36.method2770();
		}
		local130++;
		@Pc(172) byte[] local172 = new byte[local130];
		local36.anInt3592++;
		@Pc(183) int local183;
		@Pc(191) int local191;
		@Pc(197) int local197;
		if (local130 > 1) {
			local183 = 2;
			local172[1] = 1;
			@Pc(189) int local189 = 1;
			for (local191 = 2; local191 < local130; local191++) {
				local197 = local36.method2771();
				if (local197 == 0) {
					local189 = local183++;
				} else {
					if (local197 <= local189) {
						local197--;
					}
					local189 = local197;
				}
				local172[local191] = (byte) local189;
			}
		} else {
			local183 = local130;
		}
		@Pc(229) Class43[] local229 = new Class43[local183];
		for (local191 = 0; local191 < local229.length; local191++) {
			@Pc(241) Class43 local241 = local229[local191] = new Class43();
			@Pc(245) int local245 = local36.method2771();
			if (local245 > 0) {
				local241.aByteArray19 = new byte[local245 * 2];
			}
			local245 = local36.method2771();
			if (local245 > 0) {
				local241.aByteArray20 = new byte[local245 * 2 + 2];
				local241.aByteArray20[1] = 64;
			}
		}
		local197 = local36.method2771();
		@Pc(293) int local293 = 0;
		@Pc(305) byte[] local305 = local197 > 0 ? new byte[local197 * 2] : null;
		local197 = local36.method2771();
		while (local36.aByteArray38[local36.anInt3592 + local293] != 0) {
			local293++;
		}
		@Pc(335) byte[] local335 = local197 > 0 ? new byte[local197 * 2] : null;
		@Pc(338) byte[] local338 = new byte[local293];
		for (@Pc(340) int local340 = 0; local340 < local293; local340++) {
			local338[local340] = local36.method2770();
		}
		@Pc(358) int local358 = 0;
		local36.anInt3592++;
		local293++;
		for (@Pc(367) int local367 = 0; local367 < 128; local367++) {
			local358 += local36.method2771();
			this.aShortArray30[local367] = (short) local358;
		}
		local358 = 0;
		for (@Pc(389) int local389 = 0; local389 < 128; local389++) {
			local358 += local36.method2771();
			this.aShortArray30[local389] = (short) (this.aShortArray30[local389] + (local358 << 8));
		}
		@Pc(416) int local416 = 0;
		@Pc(418) int local418 = 0;
		@Pc(420) int local420 = 0;
		for (@Pc(422) int local422 = 0; local422 < 128; local422++) {
			if (local416 == 0) {
				if (local418 >= local338.length) {
					local416 = -1;
				} else {
					local416 = local338[local418++];
				}
				local420 = local36.method2766();
			}
			this.aShortArray30[local422] = (short) (this.aShortArray30[local422] + ((local420 - 1 & 0x2) << 14));
			local416--;
			this.anIntArray204[local422] = local420;
		}
		local418 = 0;
		@Pc(478) int local478 = 0;
		local416 = 0;
		for (@Pc(482) int local482 = 0; local482 < 128; local482++) {
			if (this.anIntArray204[local482] != 0) {
				if (local416 == 0) {
					local478 = local36.aByteArray38[local79++] - 1;
					if (local418 < local55.length) {
						local416 = local55[local418++];
					} else {
						local416 = -1;
					}
				}
				local416--;
				this.aByteArray27[local482] = (byte) local478;
			}
		}
		local416 = 0;
		local418 = 0;
		@Pc(529) int local529 = 0;
		for (@Pc(531) int local531 = 0; local531 < 128; local531++) {
			if (this.anIntArray204[local531] != 0) {
				if (local416 == 0) {
					if (local418 >= local104.length) {
						local416 = -1;
					} else {
						local416 = local104[local418++];
					}
					local529 = local36.aByteArray38[local128++] + 16 << 2;
				}
				this.aByteArray25[local531] = (byte) local529;
				local416--;
			}
		}
		local416 = 0;
		local418 = 0;
		@Pc(590) Class43 local590 = null;
		for (@Pc(592) int local592 = 0; local592 < 128; local592++) {
			if (this.anIntArray204[local592] != 0) {
				if (local416 == 0) {
					local590 = local229[local172[local418]];
					if (local418 >= local154.length) {
						local416 = -1;
					} else {
						local416 = local154[local418++];
					}
				}
				local416--;
				this.aClass43Array1[local592] = local590;
			}
		}
		local418 = 0;
		local416 = 0;
		@Pc(639) int local639 = 0;
		for (@Pc(641) int local641 = 0; local641 < 128; local641++) {
			if (local416 == 0) {
				if (local338.length <= local418) {
					local416 = -1;
				} else {
					local416 = local338[local418++];
				}
				if (this.anIntArray204[local641] > 0) {
					local639 = local36.method2771() + 1;
				}
			}
			this.aByteArray26[local641] = (byte) local639;
			local416--;
		}
		this.anInt2580 = local36.method2771() + 1;
		@Pc(710) int local710;
		for (@Pc(699) int local699 = 0; local699 < local183; local699++) {
			@Pc(705) Class43 local705 = local229[local699];
			if (local705.aByteArray19 != null) {
				for (local710 = 1; local710 < local705.aByteArray19.length; local710 += 2) {
					local705.aByteArray19[local710] = local36.method2770();
				}
			}
			if (local705.aByteArray20 != null) {
				for (local710 = 3; local710 < local705.aByteArray20.length - 2; local710 += 2) {
					local705.aByteArray20[local710] = local36.method2770();
				}
			}
		}
		@Pc(767) int local767;
		if (local305 != null) {
			for (local767 = 1; local767 < local305.length; local767 += 2) {
				local305[local767] = local36.method2770();
			}
		}
		if (local335 != null) {
			for (local767 = 1; local767 < local335.length; local767 += 2) {
				local335[local767] = local36.method2770();
			}
		}
		@Pc(816) int local816;
		for (local767 = 0; local767 < local183; local767++) {
			@Pc(809) Class43 local809 = local229[local767];
			if (local809.aByteArray20 != null) {
				local358 = 0;
				for (local816 = 2; local816 < local809.aByteArray20.length; local816 += 2) {
					local358 = local358 + local36.method2771() + 1;
					local809.aByteArray20[local816] = (byte) local358;
				}
			}
		}
		@Pc(861) int local861;
		for (local710 = 0; local710 < local183; local710++) {
			@Pc(854) Class43 local854 = local229[local710];
			if (local854.aByteArray19 != null) {
				local358 = 0;
				for (local861 = 2; local861 < local854.aByteArray19.length; local861 += 2) {
					local358 = local36.method2771() + local358 + 1;
					local854.aByteArray19[local861] = (byte) local358;
				}
			}
		}
		@Pc(931) int local931;
		@Pc(958) int local958;
		@Pc(964) byte local964;
		@Pc(979) int local979;
		@Pc(987) int local987;
		@Pc(997) int local997;
		@Pc(925) byte local925;
		@Pc(1037) int local1037;
		if (local305 != null) {
			local358 = local36.method2771();
			local305[0] = (byte) local358;
			for (local816 = 2; local816 < local305.length; local816 += 2) {
				local358 = local358 + local36.method2771() + 1;
				local305[local816] = (byte) local358;
			}
			local925 = local305[0];
			@Pc(929) byte local929 = local305[1];
			for (local931 = 0; local931 < local925; local931++) {
				this.aByteArray26[local931] = (byte) (local929 * this.aByteArray26[local931] + 32 >> 6);
			}
			local958 = 2;
			while (local305.length > local958) {
				local964 = local305[local958];
				local979 = local929 * (local964 - local925) + (local964 - local925) / 2;
				@Pc(985) byte local985 = local305[local958 + 1];
				for (local987 = local925; local987 < local964; local987++) {
					local997 = Static56.method1095(local964 - local925, local979);
					this.aByteArray26[local987] = (byte) (this.aByteArray26[local987] * local997 + 32 >> 6);
					local979 += local985 - local929;
				}
				local958 += 2;
				local929 = local985;
				local925 = local964;
			}
			for (local1037 = local925; local1037 < 128; local1037++) {
				this.aByteArray26[local1037] = (byte) (this.aByteArray26[local1037] * local929 + 32 >> 6);
			}
		}
		@Pc(1105) int local1105;
		if (local335 != null) {
			local358 = local36.method2771();
			local335[0] = (byte) local358;
			for (local816 = 2; local816 < local335.length; local816 += 2) {
				local358 = local36.method2771() + local358 + 1;
				local335[local816] = (byte) local358;
			}
			local925 = local335[0];
			local1105 = local335[1] << 1;
			for (local931 = 0; local931 < local925; local931++) {
				local958 = (this.aByteArray25[local931] & 0xFF) + local1105;
				if (local958 < 0) {
					local958 = 0;
				}
				if (local958 > 128) {
					local958 = 128;
				}
				this.aByteArray25[local931] = (byte) local958;
			}
			local958 = 2;
			@Pc(1157) int local1157;
			while (local335.length > local958) {
				local1157 = local335[local958 + 1] << 1;
				local964 = local335[local958];
				local979 = local1105 * (local964 - local925) + (local964 - local925) / 2;
				local958 += 2;
				for (local987 = local925; local987 < local964; local987++) {
					local997 = Static56.method1095(local964 - local925, local979);
					local979 += local1157 - local1105;
					@Pc(1204) int local1204 = local997 + (this.aByteArray25[local987] & 0xFF);
					if (local1204 < 0) {
						local1204 = 0;
					}
					if (local1204 > 128) {
						local1204 = 128;
					}
					this.aByteArray25[local987] = (byte) local1204;
				}
				local1105 = local1157;
				local925 = local964;
			}
			for (local1037 = local925; local1037 < 128; local1037++) {
				local1157 = local1105 + (this.aByteArray25[local1037] & 0xFF);
				if (local1157 < 0) {
					local1157 = 0;
				}
				if (local1157 > 128) {
					local1157 = 128;
				}
				this.aByteArray25[local1037] = (byte) local1157;
			}
		}
		for (local816 = 0; local816 < local183; local816++) {
			local229[local816].anInt1883 = local36.method2771();
		}
		for (local861 = 0; local861 < local183; local861++) {
			@Pc(1301) Class43 local1301 = local229[local861];
			if (local1301.aByteArray19 != null) {
				local1301.anInt1887 = local36.method2771();
			}
			if (local1301.aByteArray20 != null) {
				local1301.anInt1881 = local36.method2771();
			}
			if (local1301.anInt1883 > 0) {
				local1301.anInt1880 = local36.method2771();
			}
		}
		for (local1105 = 0; local1105 < local183; local1105++) {
			local229[local1105].anInt1882 = local36.method2771();
		}
		for (local931 = 0; local931 < local183; local931++) {
			@Pc(1355) Class43 local1355 = local229[local931];
			if (local1355.anInt1882 > 0) {
				local1355.anInt1888 = local36.method2771();
			}
		}
		for (local958 = 0; local958 < local183; local958++) {
			@Pc(1375) Class43 local1375 = local229[local958];
			if (local1375.anInt1888 > 0) {
				local1375.anInt1884 = local36.method2771();
			}
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "([BZ[ILclient!c;)Z")
	public boolean method1984(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class14 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(11) Class1_Sub9_Sub1 local11 = null;
		for (@Pc(13) int local13 = 0; local13 < 128; local13++) {
			if (arg0 == null || arg0[local13] != 0) {
				@Pc(25) int local25 = this.anIntArray204[local13];
				if (local25 != 0) {
					if (local9 != local25) {
						local9 = local25--;
						if ((local25 & 0x1) == 0) {
							local11 = arg2.method437(local25 >> 2, arg1);
						} else {
							local11 = arg2.method434(local25 >> 2, arg1);
						}
						if (local11 == null) {
							local7 = false;
						}
					}
					if (local11 != null) {
						this.aClass1_Sub9_Sub1Array1[local13] = local11;
						this.anIntArray204[local13] = 0;
					}
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!li", name = "c", descriptor = "(I)V")
	public void method1985() {
		this.anIntArray204 = null;
	}
}
