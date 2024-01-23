import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ek")
public final class Class1_Sub8 extends Class1 {

	@OriginalMember(owner = "client!ek", name = "p", descriptor = "[Lclient!h;")
	public Class1_Sub11_Sub1[] aClass1_Sub11_Sub1Array1 = new Class1_Sub11_Sub1[128];

	@OriginalMember(owner = "client!ek", name = "u", descriptor = "[Lclient!bj;")
	public Class20[] aClass20Array1 = new Class20[128];

	@OriginalMember(owner = "client!ek", name = "v", descriptor = "[S")
	public short[] aShortArray54 = new short[128];

	@OriginalMember(owner = "client!ek", name = "y", descriptor = "[B")
	public byte[] aByteArray43 = new byte[128];

	@OriginalMember(owner = "client!ek", name = "z", descriptor = "[B")
	public byte[] aByteArray44 = new byte[128];

	@OriginalMember(owner = "client!ek", name = "B", descriptor = "[B")
	public byte[] aByteArray45 = new byte[128];

	@OriginalMember(owner = "client!ek", name = "C", descriptor = "I")
	public int anInt1386;

	@OriginalMember(owner = "client!ek", name = "D", descriptor = "[I")
	private int[] anIntArray166 = new int[128];

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "([B)V")
	public Class1_Sub8(@OriginalArg(0) byte[] arg0) {
		@Pc(33) int local33 = 0;
		@Pc(38) Class1_Sub14 local38 = new Class1_Sub14(arg0);
		while (local38.aByteArray55[local33 + local38.anInt3000] != 0) {
			local33++;
		}
		@Pc(55) byte[] local55 = new byte[local33];
		@Pc(57) int local57;
		for (local57 = 0; local57 < local33; local57++) {
			local55[local57] = local38.method2212();
		}
		local38.anInt3000++;
		local33++;
		local57 = local38.anInt3000;
		@Pc(85) int local85 = 0;
		local38.anInt3000 += local33;
		while (local38.aByteArray55[local38.anInt3000 + local85] != 0) {
			local85++;
		}
		@Pc(107) byte[] local107 = new byte[local85];
		@Pc(109) int local109;
		for (local109 = 0; local109 < local85; local109++) {
			local107[local109] = local38.method2212();
		}
		local85++;
		local38.anInt3000++;
		@Pc(134) int local134 = 0;
		local109 = local38.anInt3000;
		local38.anInt3000 += local85;
		while (local38.aByteArray55[local38.anInt3000 + local134] != 0) {
			local134++;
		}
		@Pc(161) byte[] local161 = new byte[local134];
		for (@Pc(163) int local163 = 0; local163 < local134; local163++) {
			local161[local163] = local38.method2212();
		}
		local134++;
		local38.anInt3000++;
		@Pc(189) byte[] local189 = new byte[local134];
		@Pc(194) int local194;
		@Pc(206) int local206;
		if (local134 <= 1) {
			local194 = local134;
		} else {
			local189[1] = 1;
			local194 = 2;
			@Pc(204) int local204 = 1;
			for (local206 = 2; local206 < local134; local206++) {
				@Pc(213) int local213 = local38.method2199();
				if (local213 == 0) {
					local204 = local194++;
				} else {
					if (local204 >= local213) {
						local213--;
					}
					local204 = local213;
				}
				local189[local206] = (byte) local204;
			}
		}
		@Pc(245) Class20[] local245 = new Class20[local194];
		for (local206 = 0; local206 < local245.length; local206++) {
			@Pc(263) Class20 local263 = local245[local206] = new Class20();
			@Pc(267) int local267 = local38.method2199();
			if (local267 > 0) {
				local263.aByteArray16 = new byte[local267 * 2];
			}
			local267 = local38.method2199();
			if (local267 > 0) {
				local263.aByteArray17 = new byte[local267 * 2 + 2];
				local263.aByteArray17[1] = 64;
			}
		}
		local206 = local38.method2199();
		@Pc(317) byte[] local317 = local206 <= 0 ? null : new byte[local206 * 2];
		local206 = local38.method2199();
		@Pc(333) byte[] local333 = local206 <= 0 ? null : new byte[local206 * 2];
		@Pc(335) int local335;
		for (local335 = 0; local38.aByteArray55[local38.anInt3000 + local335] != 0; local335++) {
		}
		@Pc(352) byte[] local352 = new byte[local335];
		@Pc(354) int local354;
		for (local354 = 0; local354 < local335; local354++) {
			local352[local354] = local38.method2212();
		}
		local38.anInt3000++;
		local335++;
		local354 = 0;
		@Pc(377) int local377;
		for (local377 = 0; local377 < 128; local377++) {
			local354 += local38.method2199();
			this.aShortArray54[local377] = (short) local354;
		}
		local354 = 0;
		for (local377 = 0; local377 < 128; local377++) {
			local354 += local38.method2199();
			this.aShortArray54[local377] = (short) (this.aShortArray54[local377] + (local354 << 8));
		}
		local377 = 0;
		@Pc(428) int local428 = 0;
		@Pc(430) int local430 = 0;
		@Pc(432) int local432;
		for (local432 = 0; local432 < 128; local432++) {
			if (local377 == 0) {
				if (local428 < local352.length) {
					local377 = local352[local428++];
				} else {
					local377 = -1;
				}
				local430 = local38.method2190();
			}
			this.aShortArray54[local432] = (short) (this.aShortArray54[local432] + ((local430 - 1 & 0x2) << 14));
			local377--;
			this.anIntArray166[local432] = local430;
		}
		local428 = 0;
		local377 = 0;
		local432 = 0;
		@Pc(494) int local494;
		for (local494 = 0; local494 < 128; local494++) {
			if (this.anIntArray166[local494] != 0) {
				if (local377 == 0) {
					local432 = local38.aByteArray55[local57++] - 1;
					if (local428 >= local55.length) {
						local377 = -1;
					} else {
						local377 = local55[local428++];
					}
				}
				this.aByteArray45[local494] = (byte) local432;
				local377--;
			}
		}
		local377 = 0;
		local428 = 0;
		local494 = 0;
		for (@Pc(551) int local551 = 0; local551 < 128; local551++) {
			if (this.anIntArray166[local551] != 0) {
				if (local377 == 0) {
					if (local107.length <= local428) {
						local377 = -1;
					} else {
						local377 = local107[local428++];
					}
					local494 = local38.aByteArray55[local109++] + 16 << 2;
				}
				this.aByteArray44[local551] = (byte) local494;
				local377--;
			}
		}
		local428 = 0;
		local377 = 0;
		@Pc(606) Class20 local606 = null;
		@Pc(608) int local608;
		for (local608 = 0; local608 < 128; local608++) {
			if (this.anIntArray166[local608] != 0) {
				if (local377 == 0) {
					local606 = local245[local189[local428]];
					if (local161.length <= local428) {
						local377 = -1;
					} else {
						local377 = local161[local428++];
					}
				}
				this.aClass20Array1[local608] = local606;
				local377--;
			}
		}
		local428 = 0;
		local608 = 0;
		local377 = 0;
		@Pc(665) int local665;
		for (local665 = 0; local665 < 128; local665++) {
			if (local377 == 0) {
				if (local352.length <= local428) {
					local377 = -1;
				} else {
					local377 = local352[local428++];
				}
				if (this.anIntArray166[local665] > 0) {
					local608 = local38.method2199() + 1;
				}
			}
			this.aByteArray43[local665] = (byte) local608;
			local377--;
		}
		this.anInt1386 = local38.method2199() + 1;
		@Pc(733) Class20 local733;
		@Pc(738) int local738;
		for (local665 = 0; local665 < local194; local665++) {
			local733 = local245[local665];
			if (local733.aByteArray16 != null) {
				for (local738 = 1; local738 < local733.aByteArray16.length; local738 += 2) {
					local733.aByteArray16[local738] = local38.method2212();
				}
			}
			if (local733.aByteArray17 != null) {
				for (local738 = 3; local738 < local733.aByteArray17.length - 2; local738 += 2) {
					local733.aByteArray17[local738] = local38.method2212();
				}
			}
		}
		if (local317 != null) {
			for (local665 = 1; local665 < local317.length; local665 += 2) {
				local317[local665] = local38.method2212();
			}
		}
		if (local333 != null) {
			for (local665 = 1; local665 < local333.length; local665 += 2) {
				local333[local665] = local38.method2212();
			}
		}
		for (local665 = 0; local665 < local194; local665++) {
			local733 = local245[local665];
			if (local733.aByteArray17 != null) {
				local354 = 0;
				for (local738 = 2; local738 < local733.aByteArray17.length; local738 += 2) {
					local354 = local38.method2199() + local354 + 1;
					local733.aByteArray17[local738] = (byte) local354;
				}
			}
		}
		for (local665 = 0; local665 < local194; local665++) {
			local733 = local245[local665];
			if (local733.aByteArray16 != null) {
				local354 = 0;
				for (local738 = 2; local738 < local733.aByteArray16.length; local738 += 2) {
					local354 = local38.method2199() + local354 + 1;
					local733.aByteArray16[local738] = (byte) local354;
				}
			}
		}
		@Pc(995) byte local995;
		@Pc(1010) int local1010;
		@Pc(1012) int local1012;
		@Pc(1022) int local1022;
		@Pc(1055) int local1055;
		@Pc(944) byte local944;
		if (local317 != null) {
			local354 = local38.method2199();
			local317[0] = (byte) local354;
			for (local665 = 2; local665 < local317.length; local665 += 2) {
				local354 = local38.method2199() + local354 + 1;
				local317[local665] = (byte) local354;
			}
			local944 = local317[0];
			@Pc(948) byte local948 = local317[1];
			for (local738 = 0; local738 < local944; local738++) {
				this.aByteArray43[local738] = (byte) (local948 * this.aByteArray43[local738] + 32 >> 6);
			}
			local738 = 2;
			while (local738 < local317.length) {
				@Pc(991) byte local991 = local317[local738 + 1];
				local995 = local317[local738];
				local738 += 2;
				local1010 = (local995 - local944) * local948 + (local995 - local944) / 2;
				for (local1012 = local944; local1012 < local995; local1012++) {
					local1022 = Static49.method974(local1010, local995 - local944);
					this.aByteArray43[local1012] = (byte) (local1022 * this.aByteArray43[local1012] + 32 >> 6);
					local1010 += local991 - local948;
				}
				local948 = local991;
				local944 = local995;
			}
			for (local1055 = local944; local1055 < 128; local1055++) {
				this.aByteArray43[local1055] = (byte) (this.aByteArray43[local1055] * local948 + 32 >> 6);
			}
		}
		if (local333 != null) {
			local354 = local38.method2199();
			local333[0] = (byte) local354;
			for (local665 = 2; local665 < local333.length; local665 += 2) {
				local354 = local38.method2199() + local354 + 1;
				local333[local665] = (byte) local354;
			}
			local944 = local333[0];
			@Pc(1129) int local1129 = local333[1] << 1;
			for (local738 = 0; local738 < local944; local738++) {
				local1055 = (this.aByteArray44[local738] & 0xFF) + local1129;
				if (local1055 < 0) {
					local1055 = 0;
				}
				if (local1055 > 128) {
					local1055 = 128;
				}
				this.aByteArray44[local738] = (byte) local1055;
			}
			local738 = 2;
			@Pc(1197) int local1197;
			while (local738 < local333.length) {
				local995 = local333[local738];
				local1010 = (local995 - local944) / 2 + local1129 * (local995 - local944);
				local1197 = local333[local738 + 1] << 1;
				for (local1012 = local944; local1012 < local995; local1012++) {
					local1022 = Static49.method974(local1010, local995 - local944);
					local1010 += local1197 - local1129;
					@Pc(1225) int local1225 = local1022 + (this.aByteArray44[local1012] & 0xFF);
					if (local1225 < 0) {
						local1225 = 0;
					}
					if (local1225 > 128) {
						local1225 = 128;
					}
					this.aByteArray44[local1012] = (byte) local1225;
				}
				local1129 = local1197;
				local738 += 2;
				local944 = local995;
			}
			for (local1055 = local944; local1055 < 128; local1055++) {
				local1197 = (this.aByteArray44[local1055] & 0xFF) + local1129;
				if (local1197 < 0) {
					local1197 = 0;
				}
				if (local1197 > 128) {
					local1197 = 128;
				}
				this.aByteArray44[local1055] = (byte) local1197;
			}
		}
		for (local665 = 0; local665 < local194; local665++) {
			local245[local665].anInt546 = local38.method2199();
		}
		for (local665 = 0; local665 < local194; local665++) {
			local733 = local245[local665];
			if (local733.aByteArray16 != null) {
				local733.anInt545 = local38.method2199();
			}
			if (local733.aByteArray17 != null) {
				local733.anInt544 = local38.method2199();
			}
			if (local733.anInt546 > 0) {
				local733.anInt539 = local38.method2199();
			}
		}
		for (local665 = 0; local665 < local194; local665++) {
			local245[local665].anInt542 = local38.method2199();
		}
		for (local665 = 0; local665 < local194; local665++) {
			local733 = local245[local665];
			if (local733.anInt542 > 0) {
				local733.anInt543 = local38.method2199();
			}
		}
		for (local665 = 0; local665 < local194; local665++) {
			local733 = local245[local665];
			if (local733.anInt543 > 0) {
				local733.anInt548 = local38.method2199();
			}
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "([B[IBLclient!jo;)Z")
	public boolean method1131(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) Class90 arg2) {
		@Pc(14) Class1_Sub11_Sub1 local14 = null;
		@Pc(16) boolean local16 = true;
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < 128; local20++) {
			if (arg0 == null || arg0[local20] != 0) {
				@Pc(40) int local40 = this.anIntArray166[local20];
				if (local40 != 0) {
					if (local18 != local40) {
						local18 = local40--;
						if ((local40 & 0x1) == 0) {
							local14 = arg2.method2300(local40 >> 2, arg1);
						} else {
							local14 = arg2.method2302(arg1, local40 >> 2);
						}
						if (local14 == null) {
							local16 = false;
						}
					}
					if (local14 != null) {
						this.aClass1_Sub11_Sub1Array1[local20] = local14;
						this.anIntArray166[local20] = 0;
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ek", name = "d", descriptor = "(I)V")
	public void method1136() {
		this.anIntArray166 = null;
	}
}
