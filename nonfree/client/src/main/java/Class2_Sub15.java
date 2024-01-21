import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public final class Class2_Sub15 extends Class2 {

	@OriginalMember(owner = "client!nc", name = "o", descriptor = "[Lclient!eh;")
	public final Class29[] aClass29Array1 = new Class29[128];

	@OriginalMember(owner = "client!nc", name = "p", descriptor = "[S")
	public final short[] aShortArray102 = new short[128];

	@OriginalMember(owner = "client!nc", name = "s", descriptor = "I")
	public final int anInt2826;

	@OriginalMember(owner = "client!nc", name = "t", descriptor = "[B")
	public final byte[] aByteArray30 = new byte[128];

	@OriginalMember(owner = "client!nc", name = "x", descriptor = "[B")
	public final byte[] aByteArray31 = new byte[128];

	@OriginalMember(owner = "client!nc", name = "y", descriptor = "[I")
	private int[] anIntArray252 = new int[128];

	@OriginalMember(owner = "client!nc", name = "C", descriptor = "[B")
	public final byte[] aByteArray32 = new byte[128];

	@OriginalMember(owner = "client!nc", name = "E", descriptor = "[Lclient!qc;")
	public final Class2_Sub20_Sub1[] aClass2_Sub20_Sub1Array1 = new Class2_Sub20_Sub1[128];

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "([B)V")
	public Class2_Sub15(@OriginalArg(0) byte[] arg0) {
		@Pc(33) int local33 = 0;
		@Pc(38) Class2_Sub11 local38 = new Class2_Sub11(arg0);
		while (local38.aByteArray26[local38.anInt2235 + local33] != 0) {
			local33++;
		}
		@Pc(56) byte[] local56 = new byte[local33];
		for (@Pc(58) int local58 = 0; local58 < local33; local58++) {
			local56[local58] = local38.method1552();
		}
		local38.anInt2235++;
		local33++;
		@Pc(84) int local84 = local38.anInt2235;
		@Pc(86) int local86 = 0;
		local38.anInt2235 += local33;
		while (local38.aByteArray26[local86 + local38.anInt2235] != 0) {
			local86++;
		}
		@Pc(109) byte[] local109 = new byte[local86];
		for (@Pc(111) int local111 = 0; local111 < local86; local111++) {
			local109[local111] = local38.method1552();
		}
		local86++;
		local38.anInt2235++;
		@Pc(136) int local136 = 0;
		@Pc(139) int local139 = local38.anInt2235;
		local38.anInt2235 += local86;
		while (local38.aByteArray26[local38.anInt2235 + local136] != 0) {
			local136++;
		}
		@Pc(160) byte[] local160 = new byte[local136];
		for (@Pc(162) int local162 = 0; local162 < local136; local162++) {
			local160[local162] = local38.method1552();
		}
		local38.anInt2235++;
		local136++;
		@Pc(184) byte[] local184 = new byte[local136];
		@Pc(189) int local189;
		@Pc(197) int local197;
		@Pc(203) int local203;
		if (local136 > 1) {
			local189 = 2;
			@Pc(191) int local191 = 1;
			local184[1] = 1;
			for (local197 = 2; local197 < local136; local197++) {
				local203 = local38.method1534();
				if (local203 == 0) {
					local191 = local189++;
				} else {
					if (local203 <= local191) {
						local203--;
					}
					local191 = local203;
				}
				local184[local197] = (byte) local191;
			}
		} else {
			local189 = local136;
		}
		@Pc(240) Class29[] local240 = new Class29[local189];
		for (local197 = 0; local197 < local240.length; local197++) {
			@Pc(252) Class29 local252 = local240[local197] = new Class29();
			@Pc(256) int local256 = local38.method1534();
			if (local256 > 0) {
				local252.aByteArray7 = new byte[local256 * 2];
			}
			local256 = local38.method1534();
			if (local256 > 0) {
				local252.aByteArray8 = new byte[local256 * 2 + 2];
				local252.aByteArray8[1] = 64;
			}
		}
		@Pc(293) int local293 = 0;
		local203 = local38.method1534();
		@Pc(306) byte[] local306 = local203 <= 0 ? null : new byte[local203 * 2];
		local203 = local38.method1534();
		@Pc(319) byte[] local319 = local203 > 0 ? new byte[local203 * 2] : null;
		while (local38.aByteArray26[local38.anInt2235 + local293] != 0) {
			local293++;
		}
		@Pc(334) byte[] local334 = new byte[local293];
		for (@Pc(336) int local336 = 0; local336 < local293; local336++) {
			local334[local336] = local38.method1552();
		}
		local38.anInt2235++;
		@Pc(356) int local356 = 0;
		for (@Pc(358) int local358 = 0; local358 < 128; local358++) {
			local356 += local38.method1534();
			this.aShortArray102[local358] = (short) local356;
		}
		local356 = 0;
		for (@Pc(382) int local382 = 0; local382 < 128; local382++) {
			local356 += local38.method1534();
			this.aShortArray102[local382] = (short) (this.aShortArray102[local382] + (local356 << 8));
		}
		local293++;
		@Pc(408) int local408 = 0;
		@Pc(410) int local410 = 0;
		@Pc(412) int local412 = 0;
		for (@Pc(414) int local414 = 0; local414 < 128; local414++) {
			if (local408 == 0) {
				if (local334.length <= local410) {
					local408 = -1;
				} else {
					local408 = local334[local410++];
				}
				local412 = local38.method1551();
			}
			local408--;
			this.aShortArray102[local414] = (short) (this.aShortArray102[local414] + ((local412 - 1 & 0x2) << 14));
			this.anIntArray252[local414] = local412;
		}
		local410 = 0;
		local408 = 0;
		@Pc(468) int local468 = 0;
		for (@Pc(470) int local470 = 0; local470 < 128; local470++) {
			if (this.anIntArray252[local470] != 0) {
				if (local408 == 0) {
					if (local410 < local56.length) {
						local408 = local56[local410++];
					} else {
						local408 = -1;
					}
					local468 = local38.aByteArray26[local84++] - 1;
				}
				local408--;
				this.aByteArray31[local470] = (byte) local468;
			}
		}
		local408 = 0;
		local410 = 0;
		@Pc(522) int local522 = 0;
		for (@Pc(524) int local524 = 0; local524 < 128; local524++) {
			if (this.anIntArray252[local524] != 0) {
				if (local408 == 0) {
					local522 = local38.aByteArray26[local139++] + 16 << 2;
					if (local109.length > local410) {
						local408 = local109[local410++];
					} else {
						local408 = -1;
					}
				}
				local408--;
				this.aByteArray32[local524] = (byte) local522;
			}
		}
		local408 = 0;
		local410 = 0;
		@Pc(583) Class29 local583 = null;
		for (@Pc(585) int local585 = 0; local585 < 128; local585++) {
			if (this.anIntArray252[local585] != 0) {
				if (local408 == 0) {
					local583 = local240[local184[local410]];
					if (local410 >= local160.length) {
						local408 = -1;
					} else {
						local408 = local160[local410++];
					}
				}
				this.aClass29Array1[local585] = local583;
				local408--;
			}
		}
		local408 = 0;
		local410 = 0;
		@Pc(631) int local631 = 0;
		for (@Pc(633) int local633 = 0; local633 < 128; local633++) {
			if (local408 == 0) {
				if (local410 >= local334.length) {
					local408 = -1;
				} else {
					local408 = local334[local410++];
				}
				if (this.anIntArray252[local633] > 0) {
					local631 = local38.method1534() + 1;
				}
			}
			this.aByteArray30[local633] = (byte) local631;
			local408--;
		}
		this.anInt2826 = local38.method1534() + 1;
		@Pc(701) int local701;
		for (@Pc(690) int local690 = 0; local690 < local189; local690++) {
			@Pc(696) Class29 local696 = local240[local690];
			if (local696.aByteArray7 != null) {
				for (local701 = 1; local701 < local696.aByteArray7.length; local701 += 2) {
					local696.aByteArray7[local701] = local38.method1552();
				}
			}
			if (local696.aByteArray8 != null) {
				for (local701 = 3; local701 < local696.aByteArray8.length - 2; local701 += 2) {
					local696.aByteArray8[local701] = local38.method1552();
				}
			}
		}
		@Pc(754) int local754;
		if (local306 != null) {
			for (local754 = 1; local754 < local306.length; local754 += 2) {
				local306[local754] = local38.method1552();
			}
		}
		if (local319 != null) {
			for (local754 = 1; local754 < local319.length; local754 += 2) {
				local319[local754] = local38.method1552();
			}
		}
		@Pc(799) int local799;
		for (local754 = 0; local754 < local189; local754++) {
			@Pc(792) Class29 local792 = local240[local754];
			if (local792.aByteArray8 != null) {
				local356 = 0;
				for (local799 = 2; local799 < local792.aByteArray8.length; local799 += 2) {
					local356 = local38.method1534() + local356 + 1;
					local792.aByteArray8[local799] = (byte) local356;
				}
			}
		}
		@Pc(840) int local840;
		for (local701 = 0; local701 < local189; local701++) {
			@Pc(833) Class29 local833 = local240[local701];
			if (local833.aByteArray7 != null) {
				local356 = 0;
				for (local840 = 2; local840 < local833.aByteArray7.length; local840 += 2) {
					local356 = local356 + local38.method1534() + 1;
					local833.aByteArray7[local840] = (byte) local356;
				}
			}
		}
		@Pc(910) int local910;
		@Pc(937) int local937;
		@Pc(943) byte local943;
		@Pc(957) int local957;
		@Pc(965) int local965;
		@Pc(975) int local975;
		@Pc(904) byte local904;
		@Pc(1015) int local1015;
		if (local306 != null) {
			local356 = local38.method1534();
			local306[0] = (byte) local356;
			for (local799 = 2; local799 < local306.length; local799 += 2) {
				local356 += local38.method1534() + 1;
				local306[local799] = (byte) local356;
			}
			local904 = local306[0];
			@Pc(908) byte local908 = local306[1];
			for (local910 = 0; local910 < local904; local910++) {
				this.aByteArray30[local910] = (byte) (this.aByteArray30[local910] * local908 + 32 >> 6);
			}
			local937 = 2;
			while (local937 < local306.length) {
				local943 = local306[local937];
				local957 = (local943 - local904) / 2 + (local943 - local904) * local908;
				@Pc(963) byte local963 = local306[local937 + 1];
				for (local965 = local904; local965 < local943; local965++) {
					local975 = Static157.method2316(local957, local943 - local904);
					local957 += local963 - local908;
					this.aByteArray30[local965] = (byte) (this.aByteArray30[local965] * local975 + 32 >> 6);
				}
				local937 += 2;
				local908 = local963;
				local904 = local943;
			}
			for (local1015 = local904; local1015 < 128; local1015++) {
				this.aByteArray30[local1015] = (byte) (this.aByteArray30[local1015] * local908 + 32 >> 6);
			}
		}
		@Pc(1087) int local1087;
		if (local319 != null) {
			local356 = local38.method1534();
			local319[0] = (byte) local356;
			for (local799 = 2; local799 < local319.length; local799 += 2) {
				local356 = local38.method1534() + local356 + 1;
				local319[local799] = (byte) local356;
			}
			local904 = local319[0];
			local1087 = local319[1] << 1;
			for (local910 = 0; local910 < local904; local910++) {
				local937 = local1087 + (this.aByteArray32[local910] & 0xFF);
				if (local937 < 0) {
					local937 = 0;
				}
				if (local937 > 128) {
					local937 = 128;
				}
				this.aByteArray32[local910] = (byte) local937;
			}
			local937 = 2;
			@Pc(1141) int local1141;
			while (local937 < local319.length) {
				local943 = local319[local937];
				local1141 = local319[local937 + 1] << 1;
				local957 = (local943 - local904) / 2 + local1087 * (local943 - local904);
				for (local965 = local904; local965 < local943; local965++) {
					local975 = Static157.method2316(local957, local943 - local904);
					@Pc(1175) int local1175 = (this.aByteArray32[local965] & 0xFF) + local975;
					if (local1175 < 0) {
						local1175 = 0;
					}
					if (local1175 > 128) {
						local1175 = 128;
					}
					this.aByteArray32[local965] = (byte) local1175;
					local957 += local1141 - local1087;
				}
				local1087 = local1141;
				local937 += 2;
				local904 = local943;
			}
			for (local1015 = local904; local1015 < 128; local1015++) {
				local1141 = (this.aByteArray32[local1015] & 0xFF) + local1087;
				if (local1141 < 0) {
					local1141 = 0;
				}
				if (local1141 > 128) {
					local1141 = 128;
				}
				this.aByteArray32[local1015] = (byte) local1141;
			}
		}
		for (local799 = 0; local799 < local189; local799++) {
			local240[local799].anInt1036 = local38.method1534();
		}
		for (local840 = 0; local840 < local189; local840++) {
			@Pc(1280) Class29 local1280 = local240[local840];
			if (local1280.aByteArray7 != null) {
				local1280.anInt1037 = local38.method1534();
			}
			if (local1280.aByteArray8 != null) {
				local1280.anInt1042 = local38.method1534();
			}
			if (local1280.anInt1036 > 0) {
				local1280.anInt1035 = local38.method1534();
			}
		}
		for (local1087 = 0; local1087 < local189; local1087++) {
			local240[local1087].anInt1038 = local38.method1534();
		}
		for (local910 = 0; local910 < local189; local910++) {
			@Pc(1335) Class29 local1335 = local240[local910];
			if (local1335.anInt1038 > 0) {
				local1335.anInt1040 = local38.method1534();
			}
		}
		for (local937 = 0; local937 < local189; local937++) {
			@Pc(1362) Class29 local1362 = local240[local937];
			if (local1362.anInt1040 > 0) {
				local1362.anInt1039 = local38.method1534();
			}
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZLclient!ei;[I[B)Z")
	public boolean method2003(@OriginalArg(1) Class30 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) Class2_Sub20_Sub1 local7 = null;
		@Pc(9) int local9 = 0;
		@Pc(11) boolean local11 = true;
		for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
			if (arg2 == null || arg2[local18] != 0) {
				@Pc(30) int local30 = this.anIntArray252[local18];
				if (local30 != 0) {
					if (local9 != local30) {
						local9 = local30--;
						if ((local30 & 0x1) == 0) {
							local7 = arg0.method729(arg1, local30 >> 2);
						} else {
							local7 = arg0.method733(local30 >> 2, arg1);
						}
						if (local7 == null) {
							local11 = false;
						}
					}
					if (local7 != null) {
						this.aClass2_Sub20_Sub1Array1[local18] = local7;
						this.anIntArray252[local18] = 0;
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Z)V")
	public void method2004() {
		this.anIntArray252 = null;
	}
}
