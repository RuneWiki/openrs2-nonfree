import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class1_Sub10 extends Class1 {

	@OriginalMember(owner = "client!db", name = "o", descriptor = "[S")
	public short[] aShortArray19;

	@OriginalMember(owner = "client!db", name = "p", descriptor = "[Lclient!fv;")
	public Class1_Sub20_Sub1[] aClass1_Sub20_Sub1Array1;

	@OriginalMember(owner = "client!db", name = "q", descriptor = "[B")
	public byte[] aByteArray37;

	@OriginalMember(owner = "client!db", name = "r", descriptor = "[Lclient!nt;")
	public Class175[] aClass175Array1;

	@OriginalMember(owner = "client!db", name = "s", descriptor = "[I")
	private int[] anIntArray109;

	@OriginalMember(owner = "client!db", name = "u", descriptor = "[B")
	public byte[] aByteArray38;

	@OriginalMember(owner = "client!db", name = "A", descriptor = "[B")
	public byte[] aByteArray39;

	@OriginalMember(owner = "client!db", name = "C", descriptor = "I")
	public int anInt1561;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "()V")
	private Class1_Sub10() {
	}

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "([B)V")
	public Class1_Sub10(@OriginalArg(0) byte[] arg0) {
		this.aByteArray37 = new byte[128];
		this.aShortArray19 = new short[128];
		this.aClass175Array1 = new Class175[128];
		this.anIntArray109 = new int[128];
		this.aByteArray38 = new byte[128];
		this.aClass1_Sub20_Sub1Array1 = new Class1_Sub20_Sub1[128];
		this.aByteArray39 = new byte[128];
		@Pc(36) Class1_Sub5 local36 = new Class1_Sub5(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray89[local36.anInt6475 + local38] != 0; local38++) {
		}
		@Pc(53) byte[] local53 = new byte[local38];
		for (@Pc(55) int local55 = 0; local55 < local38; local55++) {
			local53[local55] = local36.method5416();
		}
		local36.anInt6475++;
		local38++;
		@Pc(81) int local81 = local36.anInt6475;
		local36.anInt6475 += local38;
		@Pc(89) int local89;
		for (local89 = 0; local36.aByteArray89[local36.anInt6475 + local89] != 0; local89++) {
		}
		@Pc(103) byte[] local103 = new byte[local89];
		for (@Pc(105) int local105 = 0; local105 < local89; local105++) {
			local103[local105] = local36.method5416();
		}
		local89++;
		local36.anInt6475++;
		@Pc(131) int local131 = local36.anInt6475;
		local36.anInt6475 += local89;
		@Pc(139) int local139;
		for (local139 = 0; local36.aByteArray89[local36.anInt6475 + local139] != 0; local139++) {
		}
		@Pc(154) byte[] local154 = new byte[local139];
		for (@Pc(156) int local156 = 0; local156 < local139; local156++) {
			local154[local156] = local36.method5416();
		}
		local36.anInt6475++;
		local139++;
		@Pc(178) byte[] local178 = new byte[local139];
		@Pc(187) int local187;
		@Pc(191) int local191;
		@Pc(197) int local197;
		if (local139 > 1) {
			local178[1] = 1;
			local187 = 2;
			@Pc(189) int local189 = 1;
			for (local191 = 2; local191 < local139; local191++) {
				local197 = local36.method5366();
				if (local197 == 0) {
					local189 = local187++;
				} else {
					if (local197 <= local189) {
						local197--;
					}
					local189 = local197;
				}
				local178[local191] = (byte) local189;
			}
		} else {
			local187 = local139;
		}
		@Pc(233) Class175[] local233 = new Class175[local187];
		for (local191 = 0; local191 < local233.length; local191++) {
			@Pc(245) Class175 local245 = local233[local191] = new Class175();
			@Pc(249) int local249 = local36.method5366();
			if (local249 > 0) {
				local245.aByteArray68 = new byte[local249 * 2];
			}
			local249 = local36.method5366();
			if (local249 > 0) {
				local245.aByteArray67 = new byte[local249 * 2 + 2];
				local245.aByteArray67[1] = 64;
			}
		}
		local197 = local36.method5366();
		@Pc(294) byte[] local294 = local197 > 0 ? new byte[local197 * 2] : null;
		local197 = local36.method5366();
		@Pc(307) byte[] local307 = local197 <= 0 ? null : new byte[local197 * 2];
		@Pc(309) int local309;
		for (local309 = 0; local36.aByteArray89[local36.anInt6475 + local309] != 0; local309++) {
		}
		@Pc(327) byte[] local327 = new byte[local309];
		for (@Pc(329) int local329 = 0; local329 < local309; local329++) {
			local327[local329] = local36.method5416();
		}
		local309++;
		local36.anInt6475++;
		@Pc(350) int local350 = 0;
		for (@Pc(352) int local352 = 0; local352 < 128; local352++) {
			local350 += local36.method5366();
			this.aShortArray19[local352] = (short) local350;
		}
		local350 = 0;
		for (@Pc(374) int local374 = 0; local374 < 128; local374++) {
			local350 += local36.method5366();
			this.aShortArray19[local374] = (short) (this.aShortArray19[local374] + (local350 << 8));
		}
		@Pc(401) int local401 = 0;
		@Pc(403) int local403 = 0;
		@Pc(405) int local405 = 0;
		for (@Pc(407) int local407 = 0; local407 < 128; local407++) {
			if (local401 == 0) {
				if (local403 < local327.length) {
					local401 = local327[local403++];
				} else {
					local401 = -1;
				}
				local405 = local36.method5377();
			}
			this.aShortArray19[local407] = (short) (this.aShortArray19[local407] + ((local405 - 1 & 0x2) << 14));
			this.anIntArray109[local407] = local405;
			local401--;
		}
		local401 = 0;
		local403 = 0;
		@Pc(468) int local468 = 0;
		for (@Pc(470) int local470 = 0; local470 < 128; local470++) {
			if (this.anIntArray109[local470] != 0) {
				if (local401 == 0) {
					if (local403 >= local53.length) {
						local401 = -1;
					} else {
						local401 = local53[local403++];
					}
					local468 = local36.aByteArray89[local81++] - 1;
				}
				local401--;
				this.aByteArray39[local470] = (byte) local468;
			}
		}
		local401 = 0;
		local403 = 0;
		@Pc(529) int local529 = 0;
		for (@Pc(531) int local531 = 0; local531 < 128; local531++) {
			if (this.anIntArray109[local531] != 0) {
				if (local401 == 0) {
					local529 = local36.aByteArray89[local131++] + 16 << 2;
					if (local403 < local103.length) {
						local401 = local103[local403++];
					} else {
						local401 = -1;
					}
				}
				this.aByteArray37[local531] = (byte) local529;
				local401--;
			}
		}
		local403 = 0;
		local401 = 0;
		@Pc(586) Class175 local586 = null;
		for (@Pc(588) int local588 = 0; local588 < 128; local588++) {
			if (this.anIntArray109[local588] != 0) {
				if (local401 == 0) {
					local586 = local233[local178[local403]];
					if (local403 >= local154.length) {
						local401 = -1;
					} else {
						local401 = local154[local403++];
					}
				}
				local401--;
				this.aClass175Array1[local588] = local586;
			}
		}
		local403 = 0;
		local401 = 0;
		@Pc(636) int local636 = 0;
		for (@Pc(638) int local638 = 0; local638 < 128; local638++) {
			if (local401 == 0) {
				if (local327.length > local403) {
					local401 = local327[local403++];
				} else {
					local401 = -1;
				}
				if (this.anIntArray109[local638] > 0) {
					local636 = local36.method5366() + 1;
				}
			}
			local401--;
			this.aByteArray38[local638] = (byte) local636;
		}
		this.anInt1561 = local36.method5366() + 1;
		@Pc(700) int local700;
		for (@Pc(689) int local689 = 0; local689 < local187; local689++) {
			@Pc(695) Class175 local695 = local233[local689];
			if (local695.aByteArray68 != null) {
				for (local700 = 1; local700 < local695.aByteArray68.length; local700 += 2) {
					local695.aByteArray68[local700] = local36.method5416();
				}
			}
			if (local695.aByteArray67 != null) {
				for (local700 = 3; local700 < local695.aByteArray67.length - 2; local700 += 2) {
					local695.aByteArray67[local700] = local36.method5416();
				}
			}
		}
		@Pc(753) int local753;
		if (local294 != null) {
			for (local753 = 1; local753 < local294.length; local753 += 2) {
				local294[local753] = local36.method5416();
			}
		}
		if (local307 != null) {
			for (local753 = 1; local753 < local307.length; local753 += 2) {
				local307[local753] = local36.method5416();
			}
		}
		@Pc(798) int local798;
		for (local753 = 0; local753 < local187; local753++) {
			@Pc(791) Class175 local791 = local233[local753];
			if (local791.aByteArray67 != null) {
				local350 = 0;
				for (local798 = 2; local798 < local791.aByteArray67.length; local798 += 2) {
					local350 = local36.method5366() + local350 + 1;
					local791.aByteArray67[local798] = (byte) local350;
				}
			}
		}
		@Pc(843) int local843;
		for (local700 = 0; local700 < local187; local700++) {
			@Pc(836) Class175 local836 = local233[local700];
			if (local836.aByteArray68 != null) {
				local350 = 0;
				for (local843 = 2; local843 < local836.aByteArray68.length; local843 += 2) {
					local350 = local350 + local36.method5366() + 1;
					local836.aByteArray68[local843] = (byte) local350;
				}
			}
		}
		@Pc(924) int local924;
		@Pc(951) int local951;
		@Pc(957) byte local957;
		@Pc(977) int local977;
		@Pc(979) int local979;
		@Pc(989) int local989;
		@Pc(918) byte local918;
		@Pc(1036) int local1036;
		if (local294 != null) {
			local350 = local36.method5366();
			local294[0] = (byte) local350;
			for (local798 = 2; local798 < local294.length; local798 += 2) {
				local350 = local36.method5366() + local350 + 1;
				local294[local798] = (byte) local350;
			}
			local918 = local294[0];
			@Pc(922) byte local922 = local294[1];
			for (local924 = 0; local924 < local918; local924++) {
				this.aByteArray38[local924] = (byte) (this.aByteArray38[local924] * local922 + 32 >> 6);
			}
			local951 = 2;
			while (local294.length > local951) {
				local957 = local294[local951];
				@Pc(963) byte local963 = local294[local951 + 1];
				local977 = (local957 - local918) * local922 + (local957 - local918) / 2;
				for (local979 = local918; local979 < local957; local979++) {
					local989 = Static163.method2641(local957 - local918, local977);
					local977 += local963 - local922;
					this.aByteArray38[local979] = (byte) (this.aByteArray38[local979] * local989 + 32 >> 6);
				}
				local918 = local957;
				local951 += 2;
				local922 = local963;
			}
			for (local1036 = local918; local1036 < 128; local1036++) {
				this.aByteArray38[local1036] = (byte) (local922 * this.aByteArray38[local1036] + 32 >> 6);
			}
		}
		@Pc(1100) int local1100;
		if (local307 != null) {
			local350 = local36.method5366();
			local307[0] = (byte) local350;
			for (local798 = 2; local798 < local307.length; local798 += 2) {
				local350 += local36.method5366() + 1;
				local307[local798] = (byte) local350;
			}
			local918 = local307[0];
			local1100 = local307[1] << 1;
			for (local924 = 0; local924 < local918; local924++) {
				local951 = (this.aByteArray37[local924] & 0xFF) + local1100;
				if (local951 < 0) {
					local951 = 0;
				}
				if (local951 > 128) {
					local951 = 128;
				}
				this.aByteArray37[local924] = (byte) local951;
			}
			@Pc(1154) int local1154;
			for (local951 = 2; local951 < local307.length; local951 += 2) {
				local957 = local307[local951];
				local1154 = local307[local951 + 1] << 1;
				local977 = (local957 - local918) * local1100 + (local957 - local918) / 2;
				for (local979 = local918; local979 < local957; local979++) {
					local989 = Static163.method2641(local957 - local918, local977);
					@Pc(1190) int local1190 = (this.aByteArray37[local979] & 0xFF) + local989;
					if (local1190 < 0) {
						local1190 = 0;
					}
					if (local1190 > 128) {
						local1190 = 128;
					}
					this.aByteArray37[local979] = (byte) local1190;
					local977 += local1154 - local1100;
				}
				local918 = local957;
				local1100 = local1154;
			}
			for (local1036 = local918; local1036 < 128; local1036++) {
				local1154 = (this.aByteArray37[local1036] & 0xFF) + local1100;
				if (local1154 < 0) {
					local1154 = 0;
				}
				if (local1154 > 128) {
					local1154 = 128;
				}
				this.aByteArray37[local1036] = (byte) local1154;
			}
		}
		for (local798 = 0; local798 < local187; local798++) {
			local233[local798].anInt4861 = local36.method5366();
		}
		for (local843 = 0; local843 < local187; local843++) {
			@Pc(1295) Class175 local1295 = local233[local843];
			if (local1295.aByteArray68 != null) {
				local1295.anInt4860 = local36.method5366();
			}
			if (local1295.aByteArray67 != null) {
				local1295.anInt4863 = local36.method5366();
			}
			if (local1295.anInt4861 > 0) {
				local1295.anInt4857 = local36.method5366();
			}
		}
		for (local1100 = 0; local1100 < local187; local1100++) {
			local233[local1100].anInt4862 = local36.method5366();
		}
		for (local924 = 0; local924 < local187; local924++) {
			@Pc(1353) Class175 local1353 = local233[local924];
			if (local1353.anInt4862 > 0) {
				local1353.anInt4858 = local36.method5366();
			}
		}
		for (local951 = 0; local951 < local187; local951++) {
			@Pc(1376) Class175 local1376 = local233[local951];
			if (local1376.anInt4858 > 0) {
				local1376.anInt4859 = local36.method5366();
			}
		}
	}

	@OriginalMember(owner = "client!db", name = "h", descriptor = "(I)V")
	public void method1382() {
		this.anIntArray109 = null;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I[ILclient!bk;[B)Z")
	public boolean method1383(@OriginalArg(1) int[] arg0, @OriginalArg(2) Class24 arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(11) Class1_Sub20_Sub1 local11 = null;
		for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
			if (arg2 == null || arg2[local18] != 0) {
				@Pc(30) int local30 = this.anIntArray109[local18];
				if (local30 != 0) {
					if (local30 != local9) {
						local9 = local30--;
						if ((local30 & 0x1) == 0) {
							local11 = arg1.method607(local30 >> 2, arg0);
						} else {
							local11 = arg1.method610(local30 >> 2, arg0);
						}
						if (local11 == null) {
							local7 = false;
						}
					}
					if (local11 != null) {
						this.aClass1_Sub20_Sub1Array1[local18] = local11;
						this.anIntArray109[local18] = 0;
					}
				}
			}
		}
		return local7;
	}
}
