import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hq")
public final class Class2_Sub25 extends Class2 {

	@OriginalMember(owner = "client!hq", name = "h", descriptor = "[S")
	public short[] aShortArray56;

	@OriginalMember(owner = "client!hq", name = "j", descriptor = "[I")
	private int[] anIntArray312;

	@OriginalMember(owner = "client!hq", name = "k", descriptor = "[B")
	public byte[] aByteArray42;

	@OriginalMember(owner = "client!hq", name = "l", descriptor = "[Lclient!km;")
	public Class194[] aClass194Array1;

	@OriginalMember(owner = "client!hq", name = "m", descriptor = "I")
	public int anInt4546;

	@OriginalMember(owner = "client!hq", name = "n", descriptor = "[B")
	public byte[] aByteArray43;

	@OriginalMember(owner = "client!hq", name = "s", descriptor = "[Lclient!cj;")
	public Class2_Sub12_Sub1[] aClass2_Sub12_Sub1Array1;

	@OriginalMember(owner = "client!hq", name = "t", descriptor = "[B")
	public byte[] aByteArray44;

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "()V")
	private Class2_Sub25() {
	}

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "([B)V")
	public Class2_Sub25(@OriginalArg(0) byte[] arg0) {
		this.aByteArray44 = new byte[128];
		this.aByteArray43 = new byte[128];
		this.aShortArray56 = new short[128];
		this.aClass194Array1 = new Class194[128];
		this.aByteArray42 = new byte[128];
		this.anIntArray312 = new int[128];
		this.aClass2_Sub12_Sub1Array1 = new Class2_Sub12_Sub1[128];
		@Pc(36) Class2_Sub34 local36 = new Class2_Sub34(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray77[local36.anInt8188 + local38] != 0; local38++) {
		}
		@Pc(53) byte[] local53 = new byte[local38];
		for (@Pc(55) int local55 = 0; local55 < local38; local55++) {
			local53[local55] = local36.method6908();
		}
		local38++;
		local36.anInt8188++;
		@Pc(81) int local81 = local36.anInt8188;
		local36.anInt8188 += local38;
		@Pc(89) int local89;
		for (local89 = 0; local36.aByteArray77[local89 + local36.anInt8188] != 0; local89++) {
		}
		@Pc(103) byte[] local103 = new byte[local89];
		for (@Pc(105) int local105 = 0; local105 < local89; local105++) {
			local103[local105] = local36.method6908();
		}
		local36.anInt8188++;
		local89++;
		@Pc(131) int local131 = local36.anInt8188;
		local36.anInt8188 += local89;
		@Pc(139) int local139;
		for (local139 = 0; local36.aByteArray77[local139 + local36.anInt8188] != 0; local139++) {
		}
		@Pc(153) byte[] local153 = new byte[local139];
		for (@Pc(155) int local155 = 0; local155 < local139; local155++) {
			local153[local155] = local36.method6908();
		}
		local139++;
		local36.anInt8188++;
		@Pc(177) byte[] local177 = new byte[local139];
		@Pc(188) int local188;
		@Pc(192) int local192;
		@Pc(198) int local198;
		if (local139 > 1) {
			local177[1] = 1;
			local188 = 2;
			@Pc(190) int local190 = 1;
			for (local192 = 2; local192 < local139; local192++) {
				local198 = local36.method6904();
				if (local198 == 0) {
					local190 = local188++;
				} else {
					if (local190 >= local198) {
						local198--;
					}
					local190 = local198;
				}
				local177[local192] = (byte) local190;
			}
		} else {
			local188 = local139;
		}
		@Pc(231) Class194[] local231 = new Class194[local188];
		for (local192 = 0; local192 < local231.length; local192++) {
			@Pc(243) Class194 local243 = local231[local192] = new Class194();
			@Pc(247) int local247 = local36.method6904();
			if (local247 > 0) {
				local243.aByteArray58 = new byte[local247 * 2];
			}
			local247 = local36.method6904();
			if (local247 > 0) {
				local243.aByteArray57 = new byte[local247 * 2 + 2];
				local243.aByteArray57[1] = 64;
			}
		}
		local198 = local36.method6904();
		@Pc(295) byte[] local295 = local198 <= 0 ? null : new byte[local198 * 2];
		local198 = local36.method6904();
		@Pc(308) byte[] local308 = local198 <= 0 ? null : new byte[local198 * 2];
		@Pc(310) int local310;
		for (local310 = 0; local36.aByteArray77[local310 + local36.anInt8188] != 0; local310++) {
		}
		@Pc(327) byte[] local327 = new byte[local310];
		for (@Pc(329) int local329 = 0; local329 < local310; local329++) {
			local327[local329] = local36.method6908();
		}
		local310++;
		local36.anInt8188++;
		@Pc(354) int local354 = 0;
		for (@Pc(356) int local356 = 0; local356 < 128; local356++) {
			local354 += local36.method6904();
			this.aShortArray56[local356] = (short) local354;
		}
		local354 = 0;
		for (@Pc(380) int local380 = 0; local380 < 128; local380++) {
			local354 += local36.method6904();
			this.aShortArray56[local380] = (short) (this.aShortArray56[local380] + (local354 << 8));
		}
		@Pc(405) int local405 = 0;
		@Pc(407) int local407 = 0;
		@Pc(409) int local409 = 0;
		for (@Pc(411) int local411 = 0; local411 < 128; local411++) {
			if (local405 == 0) {
				if (local407 >= local327.length) {
					local405 = -1;
				} else {
					local405 = local327[local407++];
				}
				local409 = local36.method6913();
			}
			this.aShortArray56[local411] = (short) (this.aShortArray56[local411] + ((local409 - 1 & 0x2) << 14));
			this.anIntArray312[local411] = local409;
			local405--;
		}
		local405 = 0;
		local407 = 0;
		@Pc(470) int local470 = 0;
		for (@Pc(472) int local472 = 0; local472 < 128; local472++) {
			if (this.anIntArray312[local472] != 0) {
				if (local405 == 0) {
					local470 = local36.aByteArray77[local81++] - 1;
					if (local53.length > local407) {
						local405 = local53[local407++];
					} else {
						local405 = -1;
					}
				}
				this.aByteArray43[local472] = (byte) local470;
				local405--;
			}
		}
		local407 = 0;
		local405 = 0;
		@Pc(522) int local522 = 0;
		for (@Pc(524) int local524 = 0; local524 < 128; local524++) {
			if (this.anIntArray312[local524] != 0) {
				if (local405 == 0) {
					if (local407 < local103.length) {
						local405 = local103[local407++];
					} else {
						local405 = -1;
					}
					local522 = local36.aByteArray77[local131++] + 16 << 2;
				}
				local405--;
				this.aByteArray42[local524] = (byte) local522;
			}
		}
		local407 = 0;
		local405 = 0;
		@Pc(585) Class194 local585 = null;
		for (@Pc(587) int local587 = 0; local587 < 128; local587++) {
			if (this.anIntArray312[local587] != 0) {
				if (local405 == 0) {
					local585 = local231[local177[local407]];
					if (local153.length <= local407) {
						local405 = -1;
					} else {
						local405 = local153[local407++];
					}
				}
				this.aClass194Array1[local587] = local585;
				local405--;
			}
		}
		local407 = 0;
		local405 = 0;
		@Pc(633) int local633 = 0;
		for (@Pc(635) int local635 = 0; local635 < 128; local635++) {
			if (local405 == 0) {
				if (local407 >= local327.length) {
					local405 = -1;
				} else {
					local405 = local327[local407++];
				}
				if (this.anIntArray312[local635] > 0) {
					local633 = local36.method6904() + 1;
				}
			}
			local405--;
			this.aByteArray44[local635] = (byte) local633;
		}
		this.anInt4546 = local36.method6904() + 1;
		@Pc(697) int local697;
		for (@Pc(686) int local686 = 0; local686 < local188; local686++) {
			@Pc(692) Class194 local692 = local231[local686];
			if (local692.aByteArray58 != null) {
				for (local697 = 1; local697 < local692.aByteArray58.length; local697 += 2) {
					local692.aByteArray58[local697] = local36.method6908();
				}
			}
			if (local692.aByteArray57 != null) {
				for (local697 = 3; local697 < local692.aByteArray57.length - 2; local697 += 2) {
					local692.aByteArray57[local697] = local36.method6908();
				}
			}
		}
		@Pc(746) int local746;
		if (local295 != null) {
			for (local746 = 1; local746 < local295.length; local746 += 2) {
				local295[local746] = local36.method6908();
			}
		}
		if (local308 != null) {
			for (local746 = 1; local746 < local308.length; local746 += 2) {
				local308[local746] = local36.method6908();
			}
		}
		@Pc(791) int local791;
		for (local746 = 0; local746 < local188; local746++) {
			@Pc(784) Class194 local784 = local231[local746];
			if (local784.aByteArray57 != null) {
				local354 = 0;
				for (local791 = 2; local791 < local784.aByteArray57.length; local791 += 2) {
					local354 = local36.method6904() + local354 + 1;
					local784.aByteArray57[local791] = (byte) local354;
				}
			}
		}
		@Pc(840) int local840;
		for (local697 = 0; local697 < local188; local697++) {
			@Pc(833) Class194 local833 = local231[local697];
			if (local833.aByteArray58 != null) {
				local354 = 0;
				for (local840 = 2; local840 < local833.aByteArray58.length; local840 += 2) {
					local354 = local36.method6904() + local354 + 1;
					local833.aByteArray58[local840] = (byte) local354;
				}
			}
		}
		@Pc(913) int local913;
		@Pc(936) int local936;
		@Pc(942) byte local942;
		@Pc(961) int local961;
		@Pc(963) int local963;
		@Pc(972) int local972;
		@Pc(907) byte local907;
		@Pc(1016) int local1016;
		if (local295 != null) {
			local354 = local36.method6904();
			local295[0] = (byte) local354;
			for (local791 = 2; local791 < local295.length; local791 += 2) {
				local354 = local36.method6904() + local354 + 1;
				local295[local791] = (byte) local354;
			}
			local907 = local295[0];
			@Pc(911) byte local911 = local295[1];
			for (local913 = 0; local913 < local907; local913++) {
				this.aByteArray44[local913] = (byte) (local911 * this.aByteArray44[local913] + 32 >> 6);
			}
			local936 = 2;
			while (local295.length > local936) {
				local942 = local295[local936];
				@Pc(948) byte local948 = local295[local936 + 1];
				local961 = (local942 - local907) / 2 + local911 * (local942 - local907);
				for (local963 = local907; local963 < local942; local963++) {
					local972 = Static427.method6425(local942 - local907, local961);
					local961 += local948 - local911;
					this.aByteArray44[local963] = (byte) (this.aByteArray44[local963] * local972 + 32 >> 6);
				}
				local907 = local942;
				local936 += 2;
				local911 = local948;
			}
			for (local1016 = local907; local1016 < 128; local1016++) {
				this.aByteArray44[local1016] = (byte) (this.aByteArray44[local1016] * local911 + 32 >> 6);
			}
		}
		@Pc(1086) int local1086;
		if (local308 != null) {
			local354 = local36.method6904();
			local308[0] = (byte) local354;
			for (local791 = 2; local791 < local308.length; local791 += 2) {
				local354 += local36.method6904() + 1;
				local308[local791] = (byte) local354;
			}
			local907 = local308[0];
			local1086 = local308[1] << 1;
			for (local913 = 0; local913 < local907; local913++) {
				local936 = local1086 + (this.aByteArray42[local913] & 0xFF);
				if (local936 < 0) {
					local936 = 0;
				}
				if (local936 > 128) {
					local936 = 128;
				}
				this.aByteArray42[local913] = (byte) local936;
			}
			local936 = 2;
			@Pc(1143) int local1143;
			while (local308.length > local936) {
				local942 = local308[local936];
				local1143 = local308[local936 + 1] << 1;
				local961 = (local942 - local907) / 2 + (local942 - local907) * local1086;
				for (local963 = local907; local963 < local942; local963++) {
					local972 = Static427.method6425(local942 - local907, local961);
					@Pc(1177) int local1177 = (this.aByteArray42[local963] & 0xFF) + local972;
					if (local1177 < 0) {
						local1177 = 0;
					}
					if (local1177 > 128) {
						local1177 = 128;
					}
					this.aByteArray42[local963] = (byte) local1177;
					local961 += local1143 - local1086;
				}
				local907 = local942;
				local936 += 2;
				local1086 = local1143;
			}
			for (local1016 = local907; local1016 < 128; local1016++) {
				local1143 = local1086 + (this.aByteArray42[local1016] & 0xFF);
				if (local1143 < 0) {
					local1143 = 0;
				}
				if (local1143 > 128) {
					local1143 = 128;
				}
				this.aByteArray42[local1016] = (byte) local1143;
			}
		}
		for (local791 = 0; local791 < local188; local791++) {
			local231[local791].anInt5582 = local36.method6904();
		}
		for (local840 = 0; local840 < local188; local840++) {
			@Pc(1282) Class194 local1282 = local231[local840];
			if (local1282.aByteArray58 != null) {
				local1282.anInt5588 = local36.method6904();
			}
			if (local1282.aByteArray57 != null) {
				local1282.anInt5586 = local36.method6904();
			}
			if (local1282.anInt5582 > 0) {
				local1282.anInt5589 = local36.method6904();
			}
		}
		for (local1086 = 0; local1086 < local188; local1086++) {
			local231[local1086].anInt5587 = local36.method6904();
		}
		for (local913 = 0; local913 < local188; local913++) {
			@Pc(1344) Class194 local1344 = local231[local913];
			if (local1344.anInt5587 > 0) {
				local1344.anInt5584 = local36.method6904();
			}
		}
		for (local936 = 0; local936 < local188; local936++) {
			@Pc(1371) Class194 local1371 = local231[local936];
			if (local1371.anInt5584 > 0) {
				local1371.anInt5583 = local36.method6904();
			}
		}
	}

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "(I)V")
	public void method3761() {
		this.anIntArray312 = null;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lclient!nc;I[B[I)Z")
	public boolean method3763(@OriginalArg(0) Class229 arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(18) Class2_Sub12_Sub1 local18 = null;
		for (@Pc(20) int local20 = 0; local20 < 128; local20++) {
			if (arg1 == null || arg1[local20] != 0) {
				@Pc(32) int local32 = this.anIntArray312[local20];
				if (local32 != 0) {
					if (local32 != local9) {
						local9 = local32--;
						if ((local32 & 0x1) == 0) {
							local18 = arg0.method5560(local32 >> 2, arg2);
						} else {
							local18 = arg0.method5563(local32 >> 2, arg2);
						}
						if (local18 == null) {
							local7 = false;
						}
					}
					if (local18 != null) {
						this.aClass2_Sub12_Sub1Array1[local20] = local18;
						this.anIntArray312[local20] = 0;
					}
				}
			}
		}
		return local7;
	}
}
