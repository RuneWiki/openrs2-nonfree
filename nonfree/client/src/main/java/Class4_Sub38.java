import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public final class Class4_Sub38 extends Class4 {

	@OriginalMember(owner = "client!qh", name = "m", descriptor = "[B")
	public byte[] aByteArray70;

	@OriginalMember(owner = "client!qh", name = "o", descriptor = "[I")
	private int[] anIntArray393;

	@OriginalMember(owner = "client!qh", name = "q", descriptor = "[B")
	public byte[] aByteArray71;

	@OriginalMember(owner = "client!qh", name = "r", descriptor = "[B")
	public byte[] aByteArray72;

	@OriginalMember(owner = "client!qh", name = "t", descriptor = "[Lclient!js;")
	public Class4_Sub4_Sub1[] aClass4_Sub4_Sub1Array1;

	@OriginalMember(owner = "client!qh", name = "w", descriptor = "I")
	public int anInt5637;

	@OriginalMember(owner = "client!qh", name = "x", descriptor = "[S")
	public short[] aShortArray192;

	@OriginalMember(owner = "client!qh", name = "y", descriptor = "[Lclient!vg;")
	public Class252[] aClass252Array1;

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "()V")
	private Class4_Sub38() {
	}

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "([B)V")
	public Class4_Sub38(@OriginalArg(0) byte[] arg0) {
		this.aShortArray192 = new short[128];
		this.aByteArray71 = new byte[128];
		this.aClass4_Sub4_Sub1Array1 = new Class4_Sub4_Sub1[128];
		this.aByteArray70 = new byte[128];
		this.aClass252Array1 = new Class252[128];
		this.anIntArray393 = new int[128];
		this.aByteArray72 = new byte[128];
		@Pc(36) Class4_Sub12 local36 = new Class4_Sub12(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray36[local36.anInt2997 + local38] != 0; local38++) {
		}
		@Pc(56) byte[] local56 = new byte[local38];
		for (@Pc(58) int local58 = 0; local58 < local38; local58++) {
			local56[local58] = local36.method2542();
		}
		local38++;
		local36.anInt2997++;
		@Pc(80) int local80 = local36.anInt2997;
		local36.anInt2997 += local38;
		@Pc(88) int local88;
		for (local88 = 0; local36.aByteArray36[local88 + local36.anInt2997] != 0; local88++) {
		}
		@Pc(105) byte[] local105 = new byte[local88];
		for (@Pc(107) int local107 = 0; local107 < local88; local107++) {
			local105[local107] = local36.method2542();
		}
		local36.anInt2997++;
		local88++;
		@Pc(133) int local133 = local36.anInt2997;
		local36.anInt2997 += local88;
		@Pc(141) int local141;
		for (local141 = 0; local36.aByteArray36[local36.anInt2997 + local141] != 0; local141++) {
		}
		@Pc(159) byte[] local159 = new byte[local141];
		for (@Pc(161) int local161 = 0; local161 < local141; local161++) {
			local159[local161] = local36.method2542();
		}
		local36.anInt2997++;
		local141++;
		@Pc(187) byte[] local187 = new byte[local141];
		@Pc(200) int local200;
		@Pc(202) int local202;
		@Pc(208) int local208;
		if (local141 > 1) {
			local187[1] = 1;
			@Pc(198) int local198 = 1;
			local200 = 2;
			for (local202 = 2; local202 < local141; local202++) {
				local208 = local36.method2490();
				if (local208 == 0) {
					local198 = local200++;
				} else {
					if (local208 <= local198) {
						local208--;
					}
					local198 = local208;
				}
				local187[local202] = (byte) local198;
			}
		} else {
			local200 = local141;
		}
		@Pc(241) Class252[] local241 = new Class252[local200];
		for (local202 = 0; local202 < local241.length; local202++) {
			@Pc(253) Class252 local253 = local241[local202] = new Class252();
			@Pc(257) int local257 = local36.method2490();
			if (local257 > 0) {
				local253.aByteArray100 = new byte[local257 * 2];
			}
			local257 = local36.method2490();
			if (local257 > 0) {
				local253.aByteArray101 = new byte[local257 * 2 + 2];
				local253.aByteArray101[1] = 64;
			}
		}
		local208 = local36.method2490();
		@Pc(308) byte[] local308 = local208 <= 0 ? null : new byte[local208 * 2];
		local208 = local36.method2490();
		@Pc(321) byte[] local321 = local208 <= 0 ? null : new byte[local208 * 2];
		@Pc(323) int local323;
		for (local323 = 0; local36.aByteArray36[local323 + local36.anInt2997] != 0; local323++) {
		}
		@Pc(340) byte[] local340 = new byte[local323];
		for (@Pc(342) int local342 = 0; local342 < local323; local342++) {
			local340[local342] = local36.method2542();
		}
		local323++;
		local36.anInt2997++;
		@Pc(367) int local367 = 0;
		for (@Pc(369) int local369 = 0; local369 < 128; local369++) {
			local367 += local36.method2490();
			this.aShortArray192[local369] = (short) local367;
		}
		local367 = 0;
		for (@Pc(391) int local391 = 0; local391 < 128; local391++) {
			local367 += local36.method2490();
			this.aShortArray192[local391] = (short) (this.aShortArray192[local391] + (local367 << 8));
		}
		@Pc(418) int local418 = 0;
		@Pc(420) int local420 = 0;
		@Pc(422) int local422 = 0;
		for (@Pc(424) int local424 = 0; local424 < 128; local424++) {
			if (local418 == 0) {
				if (local420 >= local340.length) {
					local418 = -1;
				} else {
					local418 = local340[local420++];
				}
				local422 = local36.method2528();
			}
			this.aShortArray192[local424] = (short) (this.aShortArray192[local424] + ((local422 - 1 & 0x2) << 14));
			this.anIntArray393[local424] = local422;
			local418--;
		}
		local420 = 0;
		local418 = 0;
		@Pc(482) int local482 = 0;
		for (@Pc(484) int local484 = 0; local484 < 128; local484++) {
			if (this.anIntArray393[local484] != 0) {
				if (local418 == 0) {
					local482 = local36.aByteArray36[local80++] - 1;
					if (local420 >= local56.length) {
						local418 = -1;
					} else {
						local418 = local56[local420++];
					}
				}
				this.aByteArray72[local484] = (byte) local482;
				local418--;
			}
		}
		local420 = 0;
		local418 = 0;
		@Pc(536) int local536 = 0;
		for (@Pc(538) int local538 = 0; local538 < 128; local538++) {
			if (this.anIntArray393[local538] != 0) {
				if (local418 == 0) {
					local536 = local36.aByteArray36[local133++] + 16 << 2;
					if (local420 >= local105.length) {
						local418 = -1;
					} else {
						local418 = local105[local420++];
					}
				}
				local418--;
				this.aByteArray71[local538] = (byte) local536;
			}
		}
		local418 = 0;
		local420 = 0;
		@Pc(597) Class252 local597 = null;
		for (@Pc(599) int local599 = 0; local599 < 128; local599++) {
			if (this.anIntArray393[local599] != 0) {
				if (local418 == 0) {
					local597 = local241[local187[local420]];
					if (local159.length <= local420) {
						local418 = -1;
					} else {
						local418 = local159[local420++];
					}
				}
				local418--;
				this.aClass252Array1[local599] = local597;
			}
		}
		local418 = 0;
		local420 = 0;
		@Pc(645) int local645 = 0;
		for (@Pc(647) int local647 = 0; local647 < 128; local647++) {
			if (local418 == 0) {
				if (local420 >= local340.length) {
					local418 = -1;
				} else {
					local418 = local340[local420++];
				}
				if (this.anIntArray393[local647] > 0) {
					local645 = local36.method2490() + 1;
				}
			}
			this.aByteArray70[local647] = (byte) local645;
			local418--;
		}
		this.anInt5637 = local36.method2490() + 1;
		@Pc(713) int local713;
		for (@Pc(702) int local702 = 0; local702 < local200; local702++) {
			@Pc(708) Class252 local708 = local241[local702];
			if (local708.aByteArray100 != null) {
				for (local713 = 1; local713 < local708.aByteArray100.length; local713 += 2) {
					local708.aByteArray100[local713] = local36.method2542();
				}
			}
			if (local708.aByteArray101 != null) {
				for (local713 = 3; local713 < local708.aByteArray101.length - 2; local713 += 2) {
					local708.aByteArray101[local713] = local36.method2542();
				}
			}
		}
		@Pc(758) int local758;
		if (local308 != null) {
			for (local758 = 1; local758 < local308.length; local758 += 2) {
				local308[local758] = local36.method2542();
			}
		}
		if (local321 != null) {
			for (local758 = 1; local758 < local321.length; local758 += 2) {
				local321[local758] = local36.method2542();
			}
		}
		@Pc(807) int local807;
		for (local758 = 0; local758 < local200; local758++) {
			@Pc(800) Class252 local800 = local241[local758];
			if (local800.aByteArray101 != null) {
				local367 = 0;
				for (local807 = 2; local807 < local800.aByteArray101.length; local807 += 2) {
					local367 = local367 + local36.method2490() + 1;
					local800.aByteArray101[local807] = (byte) local367;
				}
			}
		}
		@Pc(852) int local852;
		for (local713 = 0; local713 < local200; local713++) {
			@Pc(845) Class252 local845 = local241[local713];
			if (local845.aByteArray100 != null) {
				local367 = 0;
				for (local852 = 2; local852 < local845.aByteArray100.length; local852 += 2) {
					local367 += local36.method2490() + 1;
					local845.aByteArray100[local852] = (byte) local367;
				}
			}
		}
		@Pc(929) int local929;
		@Pc(956) int local956;
		@Pc(962) byte local962;
		@Pc(980) int local980;
		@Pc(982) int local982;
		@Pc(992) int local992;
		@Pc(923) byte local923;
		@Pc(1035) int local1035;
		if (local308 != null) {
			local367 = local36.method2490();
			local308[0] = (byte) local367;
			for (local807 = 2; local807 < local308.length; local807 += 2) {
				local367 = local367 + local36.method2490() + 1;
				local308[local807] = (byte) local367;
			}
			local923 = local308[0];
			@Pc(927) byte local927 = local308[1];
			for (local929 = 0; local929 < local923; local929++) {
				this.aByteArray70[local929] = (byte) (local927 * this.aByteArray70[local929] + 32 >> 6);
			}
			local956 = 2;
			while (local308.length > local956) {
				local962 = local308[local956];
				@Pc(968) byte local968 = local308[local956 + 1];
				local980 = (local962 - local923) * local927 + (local962 - local923) / 2;
				for (local982 = local923; local982 < local962; local982++) {
					local992 = Static190.method2976(local980, local962 - local923);
					this.aByteArray70[local982] = (byte) (this.aByteArray70[local982] * local992 + 32 >> 6);
					local980 += local968 - local927;
				}
				local956 += 2;
				local927 = local968;
				local923 = local962;
			}
			for (local1035 = local923; local1035 < 128; local1035++) {
				this.aByteArray70[local1035] = (byte) (this.aByteArray70[local1035] * local927 + 32 >> 6);
			}
		}
		@Pc(1105) int local1105;
		if (local321 != null) {
			local367 = local36.method2490();
			local321[0] = (byte) local367;
			for (local807 = 2; local807 < local321.length; local807 += 2) {
				local367 = local367 + local36.method2490() + 1;
				local321[local807] = (byte) local367;
			}
			local923 = local321[0];
			local1105 = local321[1] << 1;
			for (local929 = 0; local929 < local923; local929++) {
				local956 = local1105 + (this.aByteArray71[local929] & 0xFF);
				if (local956 < 0) {
					local956 = 0;
				}
				if (local956 > 128) {
					local956 = 128;
				}
				this.aByteArray71[local929] = (byte) local956;
			}
			local956 = 2;
			@Pc(1153) int local1153;
			while (local321.length > local956) {
				local962 = local321[local956];
				local1153 = local321[local956 + 1] << 1;
				local980 = (local962 - local923) / 2 + (local962 - local923) * local1105;
				for (local982 = local923; local982 < local962; local982++) {
					local992 = Static190.method2976(local980, local962 - local923);
					@Pc(1187) int local1187 = local992 + (this.aByteArray71[local982] & 0xFF);
					if (local1187 < 0) {
						local1187 = 0;
					}
					if (local1187 > 128) {
						local1187 = 128;
					}
					local980 += local1153 - local1105;
					this.aByteArray71[local982] = (byte) local1187;
				}
				local923 = local962;
				local956 += 2;
				local1105 = local1153;
			}
			for (local1035 = local923; local1035 < 128; local1035++) {
				local1153 = (this.aByteArray71[local1035] & 0xFF) + local1105;
				if (local1153 < 0) {
					local1153 = 0;
				}
				if (local1153 > 128) {
					local1153 = 128;
				}
				this.aByteArray71[local1035] = (byte) local1153;
			}
		}
		for (local807 = 0; local807 < local200; local807++) {
			local241[local807].anInt6937 = local36.method2490();
		}
		for (local852 = 0; local852 < local200; local852++) {
			@Pc(1294) Class252 local1294 = local241[local852];
			if (local1294.aByteArray100 != null) {
				local1294.anInt6943 = local36.method2490();
			}
			if (local1294.aByteArray101 != null) {
				local1294.anInt6941 = local36.method2490();
			}
			if (local1294.anInt6937 > 0) {
				local1294.anInt6938 = local36.method2490();
			}
		}
		for (local1105 = 0; local1105 < local200; local1105++) {
			local241[local1105].anInt6939 = local36.method2490();
		}
		for (local929 = 0; local929 < local200; local929++) {
			@Pc(1345) Class252 local1345 = local241[local929];
			if (local1345.anInt6939 > 0) {
				local1345.anInt6940 = local36.method2490();
			}
		}
		for (local956 = 0; local956 < local200; local956++) {
			@Pc(1365) Class252 local1365 = local241[local956];
			if (local1365.anInt6940 > 0) {
				local1365.anInt6944 = local36.method2490();
			}
		}
	}

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "(I)V")
	public void method4393() {
		this.anIntArray393 = null;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lclient!oj;I[B[I)Z")
	public boolean method4398(@OriginalArg(0) Class171 arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int[] arg2) {
		@Pc(16) boolean local16 = true;
		@Pc(18) int local18 = 0;
		@Pc(20) Class4_Sub4_Sub1 local20 = null;
		for (@Pc(22) int local22 = 0; local22 < 128; local22++) {
			if (arg1 == null || arg1[local22] != 0) {
				@Pc(37) int local37 = this.anIntArray393[local22];
				if (local37 != 0) {
					if (local37 != local18) {
						local18 = local37--;
						if ((local37 & 0x1) == 0) {
							local20 = arg0.method3976(arg2, local37 >> 2);
						} else {
							local20 = arg0.method3973(arg2, local37 >> 2);
						}
						if (local20 == null) {
							local16 = false;
						}
					}
					if (local20 != null) {
						this.aClass4_Sub4_Sub1Array1[local22] = local20;
						this.anIntArray393[local22] = 0;
					}
				}
			}
		}
		return local16;
	}
}
