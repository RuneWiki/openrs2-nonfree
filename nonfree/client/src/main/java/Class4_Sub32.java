import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class Class4_Sub32 extends Class4 {

	@OriginalMember(owner = "client!pb", name = "o", descriptor = "I")
	public int anInt5609;

	@OriginalMember(owner = "client!pb", name = "p", descriptor = "[B")
	public byte[] aByteArray79;

	@OriginalMember(owner = "client!pb", name = "q", descriptor = "[B")
	public byte[] aByteArray80;

	@OriginalMember(owner = "client!pb", name = "s", descriptor = "[B")
	public byte[] aByteArray81;

	@OriginalMember(owner = "client!pb", name = "u", descriptor = "[I")
	private int[] anIntArray454;

	@OriginalMember(owner = "client!pb", name = "v", descriptor = "[Lclient!cv;")
	public Class4_Sub9_Sub1[] aClass4_Sub9_Sub1Array1;

	@OriginalMember(owner = "client!pb", name = "A", descriptor = "[Lclient!oh;")
	public Class183[] aClass183Array1;

	@OriginalMember(owner = "client!pb", name = "B", descriptor = "[S")
	public short[] aShortArray89;

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V")
	private Class4_Sub32() {
	}

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "([B)V")
	public Class4_Sub32(@OriginalArg(0) byte[] arg0) {
		this.aShortArray89 = new short[128];
		this.aByteArray80 = new byte[128];
		this.anIntArray454 = new int[128];
		this.aClass4_Sub9_Sub1Array1 = new Class4_Sub9_Sub1[128];
		this.aClass183Array1 = new Class183[128];
		this.aByteArray81 = new byte[128];
		this.aByteArray79 = new byte[128];
		@Pc(36) Class4_Sub20 local36 = new Class4_Sub20(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray77[local38 + local36.anInt5526] != 0; local38++) {
		}
		@Pc(55) byte[] local55 = new byte[local38];
		for (@Pc(57) int local57 = 0; local57 < local38; local57++) {
			local55[local57] = local36.method4576();
		}
		local36.anInt5526++;
		local38++;
		@Pc(83) int local83 = local36.anInt5526;
		local36.anInt5526 += local38;
		@Pc(91) int local91;
		for (local91 = 0; local36.aByteArray77[local36.anInt5526 + local91] != 0; local91++) {
		}
		@Pc(109) byte[] local109 = new byte[local91];
		for (@Pc(111) int local111 = 0; local111 < local91; local111++) {
			local109[local111] = local36.method4576();
		}
		local91++;
		local36.anInt5526++;
		@Pc(137) int local137 = local36.anInt5526;
		local36.anInt5526 += local91;
		@Pc(145) int local145;
		for (local145 = 0; local36.aByteArray77[local145 + local36.anInt5526] != 0; local145++) {
		}
		@Pc(162) byte[] local162 = new byte[local145];
		for (@Pc(164) int local164 = 0; local164 < local145; local164++) {
			local162[local164] = local36.method4576();
		}
		local145++;
		local36.anInt5526++;
		@Pc(190) byte[] local190 = new byte[local145];
		@Pc(201) int local201;
		@Pc(203) int local203;
		@Pc(209) int local209;
		if (local145 > 1) {
			local190[1] = 1;
			@Pc(199) int local199 = 1;
			local201 = 2;
			for (local203 = 2; local203 < local145; local203++) {
				local209 = local36.method4614();
				if (local209 == 0) {
					local199 = local201++;
				} else {
					if (local199 >= local209) {
						local209--;
					}
					local199 = local209;
				}
				local190[local203] = (byte) local199;
			}
		} else {
			local201 = local145;
		}
		@Pc(246) Class183[] local246 = new Class183[local201];
		for (local203 = 0; local203 < local246.length; local203++) {
			@Pc(258) Class183 local258 = local246[local203] = new Class183();
			@Pc(262) int local262 = local36.method4614();
			if (local262 > 0) {
				local258.aByteArray74 = new byte[local262 * 2];
			}
			local262 = local36.method4614();
			if (local262 > 0) {
				local258.aByteArray75 = new byte[local262 * 2 + 2];
				local258.aByteArray75[1] = 64;
			}
		}
		local209 = local36.method4614();
		@Pc(311) byte[] local311 = local209 > 0 ? new byte[local209 * 2] : null;
		local209 = local36.method4614();
		@Pc(324) byte[] local324 = local209 > 0 ? new byte[local209 * 2] : null;
		@Pc(326) int local326;
		for (local326 = 0; local36.aByteArray77[local36.anInt5526 + local326] != 0; local326++) {
		}
		@Pc(340) byte[] local340 = new byte[local326];
		for (@Pc(342) int local342 = 0; local342 < local326; local342++) {
			local340[local342] = local36.method4576();
		}
		local36.anInt5526++;
		local326++;
		@Pc(367) int local367 = 0;
		for (@Pc(369) int local369 = 0; local369 < 128; local369++) {
			local367 += local36.method4614();
			this.aShortArray89[local369] = (short) local367;
		}
		local367 = 0;
		for (@Pc(391) int local391 = 0; local391 < 128; local391++) {
			local367 += local36.method4614();
			this.aShortArray89[local391] = (short) (this.aShortArray89[local391] + (local367 << 8));
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
				local422 = local36.method4557();
			}
			this.aShortArray89[local424] = (short) (this.aShortArray89[local424] + ((local422 - 1 & 0x2) << 14));
			this.anIntArray454[local424] = local422;
			local418--;
		}
		local420 = 0;
		local418 = 0;
		@Pc(482) int local482 = 0;
		for (@Pc(484) int local484 = 0; local484 < 128; local484++) {
			if (this.anIntArray454[local484] != 0) {
				if (local418 == 0) {
					if (local420 < local55.length) {
						local418 = local55[local420++];
					} else {
						local418 = -1;
					}
					local482 = local36.aByteArray77[local83++] - 1;
				}
				local418--;
				this.aByteArray80[local484] = (byte) local482;
			}
		}
		local418 = 0;
		local420 = 0;
		@Pc(543) int local543 = 0;
		for (@Pc(545) int local545 = 0; local545 < 128; local545++) {
			if (this.anIntArray454[local545] != 0) {
				if (local418 == 0) {
					if (local420 < local109.length) {
						local418 = local109[local420++];
					} else {
						local418 = -1;
					}
					local543 = local36.aByteArray77[local137++] + 16 << 2;
				}
				this.aByteArray79[local545] = (byte) local543;
				local418--;
			}
		}
		local418 = 0;
		local420 = 0;
		@Pc(606) Class183 local606 = null;
		for (@Pc(608) int local608 = 0; local608 < 128; local608++) {
			if (this.anIntArray454[local608] != 0) {
				if (local418 == 0) {
					local606 = local246[local190[local420]];
					if (local420 >= local162.length) {
						local418 = -1;
					} else {
						local418 = local162[local420++];
					}
				}
				this.aClass183Array1[local608] = local606;
				local418--;
			}
		}
		local420 = 0;
		local418 = 0;
		@Pc(659) int local659 = 0;
		for (@Pc(661) int local661 = 0; local661 < 128; local661++) {
			if (local418 == 0) {
				if (local420 >= local340.length) {
					local418 = -1;
				} else {
					local418 = local340[local420++];
				}
				if (this.anIntArray454[local661] > 0) {
					local659 = local36.method4614() + 1;
				}
			}
			this.aByteArray81[local661] = (byte) local659;
			local418--;
		}
		this.anInt5609 = local36.method4614() + 1;
		@Pc(723) int local723;
		for (@Pc(712) int local712 = 0; local712 < local201; local712++) {
			@Pc(718) Class183 local718 = local246[local712];
			if (local718.aByteArray74 != null) {
				for (local723 = 1; local723 < local718.aByteArray74.length; local723 += 2) {
					local718.aByteArray74[local723] = local36.method4576();
				}
			}
			if (local718.aByteArray75 != null) {
				for (local723 = 3; local723 < local718.aByteArray75.length - 2; local723 += 2) {
					local718.aByteArray75[local723] = local36.method4576();
				}
			}
		}
		@Pc(772) int local772;
		if (local311 != null) {
			for (local772 = 1; local772 < local311.length; local772 += 2) {
				local311[local772] = local36.method4576();
			}
		}
		if (local324 != null) {
			for (local772 = 1; local772 < local324.length; local772 += 2) {
				local324[local772] = local36.method4576();
			}
		}
		@Pc(817) int local817;
		for (local772 = 0; local772 < local201; local772++) {
			@Pc(810) Class183 local810 = local246[local772];
			if (local810.aByteArray75 != null) {
				local367 = 0;
				for (local817 = 2; local817 < local810.aByteArray75.length; local817 += 2) {
					local367 = local367 + local36.method4614() + 1;
					local810.aByteArray75[local817] = (byte) local367;
				}
			}
		}
		@Pc(859) int local859;
		for (local723 = 0; local723 < local201; local723++) {
			@Pc(852) Class183 local852 = local246[local723];
			if (local852.aByteArray74 != null) {
				local367 = 0;
				for (local859 = 2; local859 < local852.aByteArray74.length; local859 += 2) {
					local367 = local367 + local36.method4614() + 1;
					local852.aByteArray74[local859] = (byte) local367;
				}
			}
		}
		@Pc(934) int local934;
		@Pc(961) int local961;
		@Pc(967) byte local967;
		@Pc(987) int local987;
		@Pc(989) int local989;
		@Pc(999) int local999;
		@Pc(928) byte local928;
		@Pc(1038) int local1038;
		if (local311 != null) {
			local367 = local36.method4614();
			local311[0] = (byte) local367;
			for (local817 = 2; local817 < local311.length; local817 += 2) {
				local367 = local367 + local36.method4614() + 1;
				local311[local817] = (byte) local367;
			}
			local928 = local311[0];
			@Pc(932) byte local932 = local311[1];
			for (local934 = 0; local934 < local928; local934++) {
				this.aByteArray81[local934] = (byte) (this.aByteArray81[local934] * local932 + 32 >> 6);
			}
			local961 = 2;
			while (local961 < local311.length) {
				local967 = local311[local961];
				@Pc(973) byte local973 = local311[local961 + 1];
				local987 = local932 * (local967 - local928) + (local967 - local928) / 2;
				for (local989 = local928; local989 < local967; local989++) {
					local999 = Static339.method4979(local967 - local928, local987);
					this.aByteArray81[local989] = (byte) (local999 * this.aByteArray81[local989] + 32 >> 6);
					local987 += local973 - local932;
				}
				local932 = local973;
				local961 += 2;
				local928 = local967;
			}
			for (local1038 = local928; local1038 < 128; local1038++) {
				this.aByteArray81[local1038] = (byte) (this.aByteArray81[local1038] * local932 + 32 >> 6);
			}
		}
		@Pc(1105) int local1105;
		if (local324 != null) {
			local367 = local36.method4614();
			local324[0] = (byte) local367;
			for (local817 = 2; local817 < local324.length; local817 += 2) {
				local367 = local367 + local36.method4614() + 1;
				local324[local817] = (byte) local367;
			}
			local928 = local324[0];
			local1105 = local324[1] << 1;
			for (local934 = 0; local934 < local928; local934++) {
				local961 = (this.aByteArray79[local934] & 0xFF) + local1105;
				if (local961 < 0) {
					local961 = 0;
				}
				if (local961 > 128) {
					local961 = 128;
				}
				this.aByteArray79[local934] = (byte) local961;
			}
			local961 = 2;
			@Pc(1156) int local1156;
			while (local961 < local324.length) {
				local967 = local324[local961];
				local1156 = local324[local961 + 1] << 1;
				local987 = (local967 - local928) * local1105 + (local967 - local928) / 2;
				for (local989 = local928; local989 < local967; local989++) {
					local999 = Static339.method4979(local967 - local928, local987);
					@Pc(1190) int local1190 = local999 + (this.aByteArray79[local989] & 0xFF);
					if (local1190 < 0) {
						local1190 = 0;
					}
					if (local1190 > 128) {
						local1190 = 128;
					}
					this.aByteArray79[local989] = (byte) local1190;
					local987 += local1156 - local1105;
				}
				local961 += 2;
				local928 = local967;
				local1105 = local1156;
			}
			for (local1038 = local928; local1038 < 128; local1038++) {
				local1156 = (this.aByteArray79[local1038] & 0xFF) + local1105;
				if (local1156 < 0) {
					local1156 = 0;
				}
				if (local1156 > 128) {
					local1156 = 128;
				}
				this.aByteArray79[local1038] = (byte) local1156;
			}
		}
		for (local817 = 0; local817 < local201; local817++) {
			local246[local817].anInt5289 = local36.method4614();
		}
		for (local859 = 0; local859 < local201; local859++) {
			@Pc(1288) Class183 local1288 = local246[local859];
			if (local1288.aByteArray74 != null) {
				local1288.anInt5287 = local36.method4614();
			}
			if (local1288.aByteArray75 != null) {
				local1288.anInt5294 = local36.method4614();
			}
			if (local1288.anInt5289 > 0) {
				local1288.anInt5292 = local36.method4614();
			}
		}
		for (local1105 = 0; local1105 < local201; local1105++) {
			local246[local1105].anInt5291 = local36.method4614();
		}
		for (local934 = 0; local934 < local201; local934++) {
			@Pc(1343) Class183 local1343 = local246[local934];
			if (local1343.anInt5291 > 0) {
				local1343.anInt5296 = local36.method4614();
			}
		}
		for (local961 = 0; local961 < local201; local961++) {
			@Pc(1363) Class183 local1363 = local246[local961];
			if (local1363.anInt5296 > 0) {
				local1363.anInt5293 = local36.method4614();
			}
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "([I[BILclient!tk;)Z")
	public boolean method4664(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) Class243 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(11) Class4_Sub9_Sub1 local11 = null;
		for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
			if (arg1 == null || arg1[local18] != 0) {
				@Pc(30) int local30 = this.anIntArray454[local18];
				if (local30 != 0) {
					if (local9 != local30) {
						local9 = local30--;
						if ((local30 & 0x1) == 0) {
							local11 = arg2.method5614(arg0, local30 >> 2);
						} else {
							local11 = arg2.method5611(arg0, local30 >> 2);
						}
						if (local11 == null) {
							local7 = false;
						}
					}
					if (local11 != null) {
						this.aClass4_Sub9_Sub1Array1[local18] = local11;
						this.anIntArray454[local18] = 0;
					}
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
	public void method4665() {
		this.anIntArray454 = null;
	}
}
