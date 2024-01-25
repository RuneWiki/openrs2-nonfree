import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gn")
public final class Class2_Sub18 extends Class2 {

	@OriginalMember(owner = "client!gn", name = "q", descriptor = "[S")
	public short[] aShortArray31;

	@OriginalMember(owner = "client!gn", name = "u", descriptor = "[B")
	public byte[] aByteArray36;

	@OriginalMember(owner = "client!gn", name = "v", descriptor = "[B")
	public byte[] aByteArray37;

	@OriginalMember(owner = "client!gn", name = "w", descriptor = "I")
	public int anInt2421;

	@OriginalMember(owner = "client!gn", name = "y", descriptor = "[B")
	public byte[] aByteArray38;

	@OriginalMember(owner = "client!gn", name = "z", descriptor = "[I")
	private int[] anIntArray462;

	@OriginalMember(owner = "client!gn", name = "C", descriptor = "[Lclient!ig;")
	public Class104[] aClass104Array1;

	@OriginalMember(owner = "client!gn", name = "J", descriptor = "[Lclient!qq;")
	public Class2_Sub15_Sub1[] aClass2_Sub15_Sub1Array1;

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "()V")
	private Class2_Sub18() {
	}

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "([B)V")
	public Class2_Sub18(@OriginalArg(0) byte[] arg0) {
		this.anIntArray462 = new int[128];
		this.aByteArray36 = new byte[128];
		this.aByteArray38 = new byte[128];
		this.aByteArray37 = new byte[128];
		this.aClass2_Sub15_Sub1Array1 = new Class2_Sub15_Sub1[128];
		this.aClass104Array1 = new Class104[128];
		this.aShortArray31 = new short[128];
		@Pc(36) Class2_Sub16 local36 = new Class2_Sub16(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray112[local38 + local36.anInt6145] != 0; local38++) {
		}
		@Pc(52) byte[] local52 = new byte[local38];
		for (@Pc(54) int local54 = 0; local54 < local38; local54++) {
			local52[local54] = local36.method5330();
		}
		local36.anInt6145++;
		local38++;
		@Pc(76) int local76 = local36.anInt6145;
		local36.anInt6145 += local38;
		@Pc(84) int local84;
		for (local84 = 0; local36.aByteArray112[local36.anInt6145 + local84] != 0; local84++) {
		}
		@Pc(101) byte[] local101 = new byte[local84];
		for (@Pc(103) int local103 = 0; local103 < local84; local103++) {
			local101[local103] = local36.method5330();
		}
		local36.anInt6145++;
		local84++;
		@Pc(125) int local125 = local36.anInt6145;
		local36.anInt6145 += local84;
		@Pc(133) int local133;
		for (local133 = 0; local36.aByteArray112[local133 + local36.anInt6145] != 0; local133++) {
		}
		@Pc(150) byte[] local150 = new byte[local133];
		for (@Pc(152) int local152 = 0; local152 < local133; local152++) {
			local150[local152] = local36.method5330();
		}
		local133++;
		local36.anInt6145++;
		@Pc(174) byte[] local174 = new byte[local133];
		@Pc(181) int local181;
		@Pc(193) int local193;
		@Pc(199) int local199;
		if (local133 <= 1) {
			local181 = local133;
		} else {
			local174[1] = 1;
			local181 = 2;
			@Pc(191) int local191 = 1;
			for (local193 = 2; local193 < local133; local193++) {
				local199 = local36.method5350();
				if (local199 == 0) {
					local191 = local181++;
				} else {
					if (local191 >= local199) {
						local199--;
					}
					local191 = local199;
				}
				local174[local193] = (byte) local191;
			}
		}
		@Pc(232) Class104[] local232 = new Class104[local181];
		for (local193 = 0; local193 < local232.length; local193++) {
			@Pc(244) Class104 local244 = local232[local193] = new Class104();
			@Pc(248) int local248 = local36.method5350();
			if (local248 > 0) {
				local244.aByteArray43 = new byte[local248 * 2];
			}
			local248 = local36.method5350();
			if (local248 > 0) {
				local244.aByteArray44 = new byte[local248 * 2 + 2];
				local244.aByteArray44[1] = 64;
			}
		}
		local199 = local36.method5350();
		@Pc(303) byte[] local303 = local199 <= 0 ? null : new byte[local199 * 2];
		local199 = local36.method5350();
		@Pc(316) byte[] local316 = local199 <= 0 ? null : new byte[local199 * 2];
		@Pc(318) int local318;
		for (local318 = 0; local36.aByteArray112[local36.anInt6145 + local318] != 0; local318++) {
		}
		@Pc(333) byte[] local333 = new byte[local318];
		for (@Pc(335) int local335 = 0; local335 < local318; local335++) {
			local333[local335] = local36.method5330();
		}
		local318++;
		local36.anInt6145++;
		@Pc(356) int local356 = 0;
		for (@Pc(358) int local358 = 0; local358 < 128; local358++) {
			local356 += local36.method5350();
			this.aShortArray31[local358] = (short) local356;
		}
		local356 = 0;
		for (@Pc(380) int local380 = 0; local380 < 128; local380++) {
			local356 += local36.method5350();
			this.aShortArray31[local380] = (short) (this.aShortArray31[local380] + (local356 << 8));
		}
		@Pc(405) int local405 = 0;
		@Pc(407) int local407 = 0;
		@Pc(409) int local409 = 0;
		for (@Pc(411) int local411 = 0; local411 < 128; local411++) {
			if (local405 == 0) {
				if (local407 >= local333.length) {
					local405 = -1;
				} else {
					local405 = local333[local407++];
				}
				local409 = local36.method5329();
			}
			this.aShortArray31[local411] = (short) (this.aShortArray31[local411] + ((local409 - 1 & 0x2) << 14));
			this.anIntArray462[local411] = local409;
			local405--;
		}
		local407 = 0;
		local405 = 0;
		@Pc(469) int local469 = 0;
		for (@Pc(471) int local471 = 0; local471 < 128; local471++) {
			if (this.anIntArray462[local471] != 0) {
				if (local405 == 0) {
					local469 = local36.aByteArray112[local76++] - 1;
					if (local52.length > local407) {
						local405 = local52[local407++];
					} else {
						local405 = -1;
					}
				}
				local405--;
				this.aByteArray37[local471] = (byte) local469;
			}
		}
		local407 = 0;
		local405 = 0;
		@Pc(530) int local530 = 0;
		for (@Pc(532) int local532 = 0; local532 < 128; local532++) {
			if (this.anIntArray462[local532] != 0) {
				if (local405 == 0) {
					if (local407 < local101.length) {
						local405 = local101[local407++];
					} else {
						local405 = -1;
					}
					local530 = local36.aByteArray112[local125++] + 16 << 2;
				}
				local405--;
				this.aByteArray38[local532] = (byte) local530;
			}
		}
		local407 = 0;
		local405 = 0;
		@Pc(589) Class104 local589 = null;
		for (@Pc(591) int local591 = 0; local591 < 128; local591++) {
			if (this.anIntArray462[local591] != 0) {
				if (local405 == 0) {
					local589 = local232[local174[local407]];
					if (local407 >= local150.length) {
						local405 = -1;
					} else {
						local405 = local150[local407++];
					}
				}
				this.aClass104Array1[local591] = local589;
				local405--;
			}
		}
		local407 = 0;
		local405 = 0;
		@Pc(641) int local641 = 0;
		for (@Pc(643) int local643 = 0; local643 < 128; local643++) {
			if (local405 == 0) {
				if (local333.length > local407) {
					local405 = local333[local407++];
				} else {
					local405 = -1;
				}
				if (this.anIntArray462[local643] > 0) {
					local641 = local36.method5350() + 1;
				}
			}
			this.aByteArray36[local643] = (byte) local641;
			local405--;
		}
		this.anInt2421 = local36.method5350() + 1;
		@Pc(710) int local710;
		for (@Pc(699) int local699 = 0; local699 < local181; local699++) {
			@Pc(705) Class104 local705 = local232[local699];
			if (local705.aByteArray43 != null) {
				for (local710 = 1; local710 < local705.aByteArray43.length; local710 += 2) {
					local705.aByteArray43[local710] = local36.method5330();
				}
			}
			if (local705.aByteArray44 != null) {
				for (local710 = 3; local710 < local705.aByteArray44.length - 2; local710 += 2) {
					local705.aByteArray44[local710] = local36.method5330();
				}
			}
		}
		@Pc(763) int local763;
		if (local303 != null) {
			for (local763 = 1; local763 < local303.length; local763 += 2) {
				local303[local763] = local36.method5330();
			}
		}
		if (local316 != null) {
			for (local763 = 1; local763 < local316.length; local763 += 2) {
				local316[local763] = local36.method5330();
			}
		}
		@Pc(808) int local808;
		for (local763 = 0; local763 < local181; local763++) {
			@Pc(801) Class104 local801 = local232[local763];
			if (local801.aByteArray44 != null) {
				local356 = 0;
				for (local808 = 2; local808 < local801.aByteArray44.length; local808 += 2) {
					local356 = local36.method5350() + local356 + 1;
					local801.aByteArray44[local808] = (byte) local356;
				}
			}
		}
		@Pc(849) int local849;
		for (local710 = 0; local710 < local181; local710++) {
			@Pc(842) Class104 local842 = local232[local710];
			if (local842.aByteArray43 != null) {
				local356 = 0;
				for (local849 = 2; local849 < local842.aByteArray43.length; local849 += 2) {
					local356 += local36.method5350() + 1;
					local842.aByteArray43[local849] = (byte) local356;
				}
			}
		}
		@Pc(918) int local918;
		@Pc(941) int local941;
		@Pc(947) byte local947;
		@Pc(967) int local967;
		@Pc(969) int local969;
		@Pc(978) int local978;
		@Pc(912) byte local912;
		@Pc(1019) int local1019;
		if (local303 != null) {
			local356 = local36.method5350();
			local303[0] = (byte) local356;
			for (local808 = 2; local808 < local303.length; local808 += 2) {
				local356 = local36.method5350() + local356 + 1;
				local303[local808] = (byte) local356;
			}
			local912 = local303[0];
			@Pc(916) byte local916 = local303[1];
			for (local918 = 0; local918 < local912; local918++) {
				this.aByteArray36[local918] = (byte) (local916 * this.aByteArray36[local918] + 32 >> 6);
			}
			local941 = 2;
			while (local303.length > local941) {
				local947 = local303[local941];
				@Pc(953) byte local953 = local303[local941 + 1];
				local967 = (local947 - local912) * local916 + (local947 - local912) / 2;
				for (local969 = local912; local969 < local947; local969++) {
					local978 = Static62.method1039(local947 - local912, local967);
					local967 += local953 - local916;
					this.aByteArray36[local969] = (byte) (local978 * this.aByteArray36[local969] + 32 >> 6);
				}
				local916 = local953;
				local941 += 2;
				local912 = local947;
			}
			for (local1019 = local912; local1019 < 128; local1019++) {
				this.aByteArray36[local1019] = (byte) (this.aByteArray36[local1019] * local916 + 32 >> 6);
			}
		}
		@Pc(1090) int local1090;
		if (local316 != null) {
			local356 = local36.method5350();
			local316[0] = (byte) local356;
			for (local808 = 2; local808 < local316.length; local808 += 2) {
				local356 = local356 + local36.method5350() + 1;
				local316[local808] = (byte) local356;
			}
			local912 = local316[0];
			local1090 = local316[1] << 1;
			for (local918 = 0; local918 < local912; local918++) {
				local941 = local1090 + (this.aByteArray38[local918] & 0xFF);
				if (local941 < 0) {
					local941 = 0;
				}
				if (local941 > 128) {
					local941 = 128;
				}
				this.aByteArray38[local918] = (byte) local941;
			}
			local941 = 2;
			@Pc(1142) int local1142;
			while (local941 < local316.length) {
				local947 = local316[local941];
				local1142 = local316[local941 + 1] << 1;
				local967 = (local947 - local912) * local1090 + (local947 - local912) / 2;
				for (local969 = local912; local969 < local947; local969++) {
					local978 = Static62.method1039(local947 - local912, local967);
					@Pc(1178) int local1178 = local978 + (this.aByteArray38[local969] & 0xFF);
					if (local1178 < 0) {
						local1178 = 0;
					}
					if (local1178 > 128) {
						local1178 = 128;
					}
					this.aByteArray38[local969] = (byte) local1178;
					local967 += local1142 - local1090;
				}
				local941 += 2;
				local912 = local947;
				local1090 = local1142;
			}
			for (local1019 = local912; local1019 < 128; local1019++) {
				local1142 = local1090 + (this.aByteArray38[local1019] & 0xFF);
				if (local1142 < 0) {
					local1142 = 0;
				}
				if (local1142 > 128) {
					local1142 = 128;
				}
				this.aByteArray38[local1019] = (byte) local1142;
			}
		}
		for (local808 = 0; local808 < local181; local808++) {
			local232[local808].anInt2850 = local36.method5350();
		}
		for (local849 = 0; local849 < local181; local849++) {
			@Pc(1285) Class104 local1285 = local232[local849];
			if (local1285.aByteArray43 != null) {
				local1285.anInt2854 = local36.method5350();
			}
			if (local1285.aByteArray44 != null) {
				local1285.anInt2852 = local36.method5350();
			}
			if (local1285.anInt2850 > 0) {
				local1285.anInt2855 = local36.method5350();
			}
		}
		for (local1090 = 0; local1090 < local181; local1090++) {
			local232[local1090].anInt2861 = local36.method5350();
		}
		for (local918 = 0; local918 < local181; local918++) {
			@Pc(1340) Class104 local1340 = local232[local918];
			if (local1340.anInt2861 > 0) {
				local1340.anInt2857 = local36.method5350();
			}
		}
		for (local941 = 0; local941 < local181; local941++) {
			@Pc(1363) Class104 local1363 = local232[local941];
			if (local1363.anInt2857 > 0) {
				local1363.anInt2853 = local36.method5350();
			}
		}
	}

	@OriginalMember(owner = "client!gn", name = "d", descriptor = "(I)V")
	public void method2346() {
		this.anIntArray462 = null;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lclient!tb;[II[B)Z")
	public boolean method2350(@OriginalArg(0) Class220 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(12) boolean local12 = true;
		@Pc(14) int local14 = 0;
		@Pc(16) Class2_Sub15_Sub1 local16 = null;
		for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
			if (arg2 == null || arg2[local18] != 0) {
				@Pc(33) int local33 = this.anIntArray462[local18];
				if (local33 != 0) {
					if (local33 != local14) {
						local14 = local33--;
						if ((local33 & 0x1) == 0) {
							local16 = arg0.method4786(local33 >> 2, arg1);
						} else {
							local16 = arg0.method4785(arg1, local33 >> 2);
						}
						if (local16 == null) {
							local12 = false;
						}
					}
					if (local16 != null) {
						this.aClass2_Sub15_Sub1Array1[local18] = local16;
						this.anIntArray462[local18] = 0;
					}
				}
			}
		}
		return local12;
	}
}
