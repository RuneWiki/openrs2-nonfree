import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tg")
public final class Class3_Sub21 extends Class3 {

	@OriginalMember(owner = "client!tg", name = "v", descriptor = "[I")
	private int[] anIntArray637 = new int[128];

	@OriginalMember(owner = "client!tg", name = "y", descriptor = "[Lclient!le;")
	public final Class3_Sub13_Sub1[] aClass3_Sub13_Sub1Array1 = new Class3_Sub13_Sub1[128];

	@OriginalMember(owner = "client!tg", name = "z", descriptor = "I")
	public final int anInt3781;

	@OriginalMember(owner = "client!tg", name = "A", descriptor = "[B")
	public final byte[] aByteArray36 = new byte[128];

	@OriginalMember(owner = "client!tg", name = "C", descriptor = "[S")
	public final short[] aShortArray35 = new short[128];

	@OriginalMember(owner = "client!tg", name = "G", descriptor = "[B")
	public final byte[] aByteArray37 = new byte[128];

	@OriginalMember(owner = "client!tg", name = "L", descriptor = "[Lclient!dc;")
	public final Class18[] aClass18Array1 = new Class18[128];

	@OriginalMember(owner = "client!tg", name = "P", descriptor = "[B")
	public final byte[] aByteArray38 = new byte[128];

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "([B)V")
	public Class3_Sub21(@OriginalArg(0) byte[] arg0) {
		@Pc(33) int local33 = 0;
		@Pc(38) Class3_Sub8 local38 = new Class3_Sub8(arg0);
		while (local38.aByteArray19[local38.anInt1948 + local33] != 0) {
			local33++;
		}
		@Pc(55) byte[] local55 = new byte[local33];
		for (@Pc(57) int local57 = 0; local57 < local33; local57++) {
			local55[local57] = local38.method1508();
		}
		local38.anInt1948++;
		@Pc(77) int local77 = 0;
		@Pc(80) int local80 = local38.anInt1948;
		local33++;
		local38.anInt1948 += local33;
		while (local38.aByteArray19[local38.anInt1948 + local77] != 0) {
			local77++;
		}
		@Pc(104) byte[] local104 = new byte[local77];
		for (@Pc(106) int local106 = 0; local106 < local77; local106++) {
			local104[local106] = local38.method1508();
		}
		local77++;
		local38.anInt1948++;
		@Pc(132) int local132 = local38.anInt1948;
		@Pc(134) int local134 = 0;
		local38.anInt1948 += local77;
		while (local38.aByteArray19[local38.anInt1948 + local134] != 0) {
			local134++;
		}
		@Pc(155) byte[] local155 = new byte[local134];
		for (@Pc(157) int local157 = 0; local157 < local134; local157++) {
			local155[local157] = local38.method1508();
		}
		local134++;
		local38.anInt1948++;
		@Pc(179) byte[] local179 = new byte[local134];
		@Pc(188) int local188;
		@Pc(192) int local192;
		@Pc(198) int local198;
		if (local134 > 1) {
			local179[1] = 1;
			local188 = 2;
			@Pc(190) int local190 = 1;
			for (local192 = 2; local192 < local134; local192++) {
				local198 = local38.method1545();
				if (local198 == 0) {
					local190 = local188++;
				} else {
					if (local198 <= local190) {
						local198--;
					}
					local190 = local198;
				}
				local179[local192] = (byte) local190;
			}
		} else {
			local188 = local134;
		}
		@Pc(235) Class18[] local235 = new Class18[local188];
		for (local192 = 0; local192 < local235.length; local192++) {
			@Pc(247) Class18 local247 = local235[local192] = new Class18();
			@Pc(251) int local251 = local38.method1545();
			if (local251 > 0) {
				local247.aByteArray8 = new byte[local251 * 2];
			}
			local251 = local38.method1545();
			if (local251 > 0) {
				local247.aByteArray9 = new byte[local251 * 2 + 2];
				local247.aByteArray9[1] = 64;
			}
		}
		local198 = local38.method1545();
		@Pc(299) byte[] local299 = local198 <= 0 ? null : new byte[local198 * 2];
		local198 = local38.method1545();
		@Pc(305) int local305;
		for (local305 = 0; local38.aByteArray19[local305 + local38.anInt1948] != 0; local305++) {
		}
		@Pc(322) byte[] local322 = new byte[local305];
		for (@Pc(324) int local324 = 0; local324 < local305; local324++) {
			local322[local324] = local38.method1508();
		}
		local38.anInt1948++;
		local305++;
		@Pc(349) int local349 = 0;
		for (@Pc(351) int local351 = 0; local351 < 128; local351++) {
			local349 += local38.method1545();
			this.aShortArray35[local351] = (short) local349;
		}
		@Pc(380) byte[] local380 = local198 > 0 ? new byte[local198 * 2] : null;
		local349 = 0;
		for (@Pc(384) int local384 = 0; local384 < 128; local384++) {
			local349 += local38.method1545();
			this.aShortArray35[local384] = (short) (this.aShortArray35[local384] + (local349 << 8));
		}
		@Pc(409) int local409 = 0;
		@Pc(411) int local411 = 0;
		@Pc(413) int local413 = 0;
		for (@Pc(415) int local415 = 0; local415 < 128; local415++) {
			if (local409 == 0) {
				if (local322.length > local413) {
					local409 = local322[local413++];
				} else {
					local409 = -1;
				}
				local411 = local38.method1519();
			}
			this.aShortArray35[local415] = (short) (this.aShortArray35[local415] + ((local411 - 1 & 0x2) << 14));
			this.anIntArray637[local415] = local411;
			local409--;
		}
		local413 = 0;
		local409 = 0;
		@Pc(467) int local467 = 0;
		for (@Pc(469) int local469 = 0; local469 < 128; local469++) {
			if (this.anIntArray637[local469] != 0) {
				if (local409 == 0) {
					local467 = local38.aByteArray19[local80++] - 1;
					if (local55.length <= local413) {
						local409 = -1;
					} else {
						local409 = local55[local413++];
					}
				}
				local409--;
				this.aByteArray38[local469] = (byte) local467;
			}
		}
		local409 = 0;
		local413 = 0;
		@Pc(525) int local525 = 0;
		for (@Pc(527) int local527 = 0; local527 < 128; local527++) {
			if (this.anIntArray637[local527] != 0) {
				if (local409 == 0) {
					local525 = local38.aByteArray19[local132++] + 16 << 2;
					if (local413 >= local104.length) {
						local409 = -1;
					} else {
						local409 = local104[local413++];
					}
				}
				local409--;
				this.aByteArray36[local527] = (byte) local525;
			}
		}
		local413 = 0;
		@Pc(583) Class18 local583 = null;
		local409 = 0;
		for (@Pc(587) int local587 = 0; local587 < 128; local587++) {
			if (this.anIntArray637[local587] != 0) {
				if (local409 == 0) {
					local583 = local235[local179[local413]];
					if (local413 < local155.length) {
						local409 = local155[local413++];
					} else {
						local409 = -1;
					}
				}
				local409--;
				this.aClass18Array1[local587] = local583;
			}
		}
		local409 = 0;
		local413 = 0;
		@Pc(633) int local633 = 0;
		for (@Pc(635) int local635 = 0; local635 < 128; local635++) {
			if (local409 == 0) {
				if (local413 < local322.length) {
					local409 = local322[local413++];
				} else {
					local409 = -1;
				}
				if (this.anIntArray637[local635] > 0) {
					local633 = local38.method1545() + 1;
				}
			}
			local409--;
			this.aByteArray37[local635] = (byte) local633;
		}
		this.anInt3781 = local38.method1545() + 1;
		@Pc(701) int local701;
		for (@Pc(690) int local690 = 0; local690 < local188; local690++) {
			@Pc(696) Class18 local696 = local235[local690];
			if (local696.aByteArray8 != null) {
				for (local701 = 1; local701 < local696.aByteArray8.length; local701 += 2) {
					local696.aByteArray8[local701] = local38.method1508();
				}
			}
			if (local696.aByteArray9 != null) {
				for (local701 = 3; local701 < local696.aByteArray9.length - 2; local701 += 2) {
					local696.aByteArray9[local701] = local38.method1508();
				}
			}
		}
		@Pc(754) int local754;
		if (local299 != null) {
			for (local754 = 1; local754 < local299.length; local754 += 2) {
				local299[local754] = local38.method1508();
			}
		}
		if (local380 != null) {
			for (local754 = 1; local754 < local380.length; local754 += 2) {
				local380[local754] = local38.method1508();
			}
		}
		@Pc(799) int local799;
		for (local754 = 0; local754 < local188; local754++) {
			@Pc(792) Class18 local792 = local235[local754];
			if (local792.aByteArray9 != null) {
				local349 = 0;
				for (local799 = 2; local799 < local792.aByteArray9.length; local799 += 2) {
					local349 = local349 + local38.method1545() + 1;
					local792.aByteArray9[local799] = (byte) local349;
				}
			}
		}
		@Pc(841) int local841;
		for (local701 = 0; local701 < local188; local701++) {
			@Pc(834) Class18 local834 = local235[local701];
			if (local834.aByteArray8 != null) {
				local349 = 0;
				for (local841 = 2; local841 < local834.aByteArray8.length; local841 += 2) {
					local349 += local38.method1545() + 1;
					local834.aByteArray8[local841] = (byte) local349;
				}
			}
		}
		@Pc(914) int local914;
		@Pc(941) int local941;
		@Pc(953) byte local953;
		@Pc(968) int local968;
		@Pc(971) int local971;
		@Pc(981) int local981;
		@Pc(908) byte local908;
		@Pc(1022) int local1022;
		if (local299 != null) {
			local349 = local38.method1545();
			local299[0] = (byte) local349;
			for (local799 = 2; local799 < local299.length; local799 += 2) {
				local349 = local349 + local38.method1545() + 1;
				local299[local799] = (byte) local349;
			}
			local908 = local299[0];
			@Pc(912) byte local912 = local299[1];
			for (local914 = 0; local914 < local908; local914++) {
				this.aByteArray37[local914] = (byte) (this.aByteArray37[local914] * local912 + 32 >> 6);
			}
			local941 = 2;
			while (local941 < local299.length) {
				@Pc(949) byte local949 = local299[local941 + 1];
				local953 = local299[local941];
				local968 = local912 * (local953 - local908) + (local953 - local908) / 2;
				local941 += 2;
				for (local971 = local908; local971 < local953; local971++) {
					local981 = Static93.method2070(local953 - local908, local968);
					local968 += local949 - local912;
					this.aByteArray37[local971] = (byte) (local981 * this.aByteArray37[local971] + 32 >> 6);
				}
				local912 = local949;
				local908 = local953;
			}
			for (local1022 = local908; local1022 < 128; local1022++) {
				this.aByteArray37[local1022] = (byte) (local912 * this.aByteArray37[local1022] + 32 >> 6);
			}
		}
		@Pc(1086) int local1086;
		if (local380 != null) {
			local349 = local38.method1545();
			local380[0] = (byte) local349;
			for (local799 = 2; local799 < local380.length; local799 += 2) {
				local349 = local349 + local38.method1545() + 1;
				local380[local799] = (byte) local349;
			}
			local908 = local380[0];
			local1086 = local380[1] << 1;
			for (local914 = 0; local914 < local908; local914++) {
				local941 = local1086 + (this.aByteArray36[local914] & 0xFF);
				if (local941 < 0) {
					local941 = 0;
				}
				if (local941 > 128) {
					local941 = 128;
				}
				this.aByteArray36[local914] = (byte) local941;
			}
			local941 = 2;
			@Pc(1133) int local1133;
			while (local941 < local380.length) {
				local1133 = local380[local941 + 1] << 1;
				local953 = local380[local941];
				local968 = local1086 * (local953 - local908) + (local953 - local908) / 2;
				for (local971 = local908; local971 < local953; local971++) {
					local981 = Static93.method2070(local953 - local908, local968);
					local968 += local1133 - local1086;
					@Pc(1179) int local1179 = (this.aByteArray36[local971] & 0xFF) + local981;
					if (local1179 < 0) {
						local1179 = 0;
					}
					if (local1179 > 128) {
						local1179 = 128;
					}
					this.aByteArray36[local971] = (byte) local1179;
				}
				local1086 = local1133;
				local941 += 2;
				local908 = local953;
			}
			for (local1022 = local908; local1022 < 128; local1022++) {
				local1133 = local1086 + (this.aByteArray36[local1022] & 0xFF);
				if (local1133 < 0) {
					local1133 = 0;
				}
				if (local1133 > 128) {
					local1133 = 128;
				}
				this.aByteArray36[local1022] = (byte) local1133;
			}
		}
		for (local799 = 0; local799 < local188; local799++) {
			local235[local799].anInt896 = local38.method1545();
		}
		for (local841 = 0; local841 < local188; local841++) {
			@Pc(1272) Class18 local1272 = local235[local841];
			if (local1272.aByteArray8 != null) {
				local1272.anInt903 = local38.method1545();
			}
			if (local1272.aByteArray9 != null) {
				local1272.anInt897 = local38.method1545();
			}
			if (local1272.anInt896 > 0) {
				local1272.anInt902 = local38.method1545();
			}
		}
		for (local1086 = 0; local1086 < local188; local1086++) {
			local235[local1086].anInt898 = local38.method1545();
		}
		for (local914 = 0; local914 < local188; local914++) {
			@Pc(1330) Class18 local1330 = local235[local914];
			if (local1330.anInt898 > 0) {
				local1330.anInt895 = local38.method1545();
			}
		}
		for (local941 = 0; local941 < local188; local941++) {
			@Pc(1353) Class18 local1353 = local235[local941];
			if (local1353.anInt895 > 0) {
				local1353.anInt899 = local38.method1545();
			}
		}
	}

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "(I)V")
	public void method2891() {
		this.anIntArray637 = null;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(I[ILclient!qd;[B)Z")
	public boolean method2894(@OriginalArg(1) int[] arg0, @OriginalArg(2) Class66 arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(3) boolean local3 = true;
		@Pc(14) Class3_Sub13_Sub1 local14 = null;
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
			if (arg2 == null || arg2[local18] != 0) {
				@Pc(30) int local30 = this.anIntArray637[local18];
				if (local30 != 0) {
					if (local30 != local16) {
						local16 = local30--;
						if ((local30 & 0x1) == 0) {
							local14 = arg1.method2520(local30 >> 2, arg0);
						} else {
							local14 = arg1.method2513(arg0, local30 >> 2);
						}
						if (local14 == null) {
							local3 = false;
						}
					}
					if (local14 != null) {
						this.aClass3_Sub13_Sub1Array1[local18] = local14;
						this.anIntArray637[local18] = 0;
					}
				}
			}
		}
		return local3;
	}
}
