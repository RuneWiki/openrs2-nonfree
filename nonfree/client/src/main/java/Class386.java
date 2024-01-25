import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wia")
public final class Class386 {

	@OriginalMember(owner = "client!wia", name = "w", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!wia", name = "C", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray34;

	@OriginalMember(owner = "client!wia", name = "y", descriptor = "Lclient!el;")
	private Class95 aClass95_2 = null;

	@OriginalMember(owner = "client!wia", name = "Q", descriptor = "I")
	public int anInt11070;

	@OriginalMember(owner = "client!wia", name = "e", descriptor = "Lclient!is;")
	private final Class167 aClass167_1;

	@OriginalMember(owner = "client!wia", name = "n", descriptor = "Z")
	private final boolean aBoolean761;

	@OriginalMember(owner = "client!wia", name = "<init>", descriptor = "(Lclient!is;ZI)V")
	public Class386(@OriginalArg(0) Class167 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (arg2 < 0 || arg2 > 2) {
			throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
		}
		this.anInt11070 = arg2;
		this.aClass167_1 = arg0;
		this.aBoolean761 = arg1;
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public boolean method9185(@OriginalArg(0) String arg0) {
		@Pc(13) int local13 = this.method9213("");
		return local13 == -1 ? this.method9188("", arg0) : this.method9188(arg0, "");
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(ZI)V")
	public void method9186(@OriginalArg(1) int arg0) {
		if (this.method9199(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(II)I")
	public int method9187(@OriginalArg(1) int arg0) {
		if (this.method9208()) {
			@Pc(24) int local24 = this.aClass95_2.aClass113_1.method2767(arg0);
			return this.method9199(local24) ? local24 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;)Z")
	private boolean method9188(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method9208()) {
			return false;
		}
		@Pc(20) String local20 = arg1.toLowerCase();
		@Pc(23) String local23 = arg0.toLowerCase();
		@Pc(32) int local32 = this.aClass95_2.aClass113_1.method2767(Static496.method7329(local20));
		if (this.method9199(local32)) {
			@Pc(50) int local50 = this.aClass95_2.aClass113Array1[local32].method2767(Static496.method7329(local23));
			return this.method9216(local32, local50);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(B)I")
	public int method9189() {
		return this.method9208() ? this.aClass95_2.anIntArray217.length : -1;
	}

	@OriginalMember(owner = "client!wia", name = "b", descriptor = "(II)I")
	private int method9190(@OriginalArg(1) int arg0) {
		if (this.method9199(arg0)) {
			return this.anObjectArray34[arg0] == null ? this.aClass167_1.method3699(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(BLjava/lang/String;)I")
	public int method9191(@OriginalArg(1) String arg0) {
		if (this.method9208()) {
			@Pc(17) String local17 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass95_2.aClass113_1.method2767(Static496.method7329(local17));
			return this.method9190(local26);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!wia", name = "c", descriptor = "(II)[B")
	public byte[] method9192(@OriginalArg(0) int arg0) {
		if (!this.method9208()) {
			return null;
		} else if (this.aClass95_2.anIntArray217.length == 1) {
			return this.method9196(arg0, 0);
		} else if (!this.method9199(arg0)) {
			return null;
		} else if (this.aClass95_2.anIntArray217[arg0] == 1) {
			return this.method9196(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(III[I)Z")
	private boolean method9193(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		if (!this.method9199(arg1)) {
			return false;
		} else if (this.anObjectArray34[arg1] == null) {
			return false;
		} else {
			@Pc(25) int local25 = this.aClass95_2.anIntArray218[arg1];
			@Pc(31) int[] local31 = this.aClass95_2.anIntArrayArray15[arg1];
			if (this.anObjectArrayArray1[arg1] == null) {
				this.anObjectArrayArray1[arg1] = new Object[this.aClass95_2.anIntArray217[arg1]];
			}
			@Pc(51) Object[] local51 = this.anObjectArrayArray1[arg1];
			@Pc(53) boolean local53 = true;
			for (@Pc(55) int local55 = 0; local55 < local25; local55++) {
				@Pc(63) int local63;
				if (local31 == null) {
					local63 = local55;
				} else {
					local63 = local31[local55];
				}
				if (local51[local63] == null) {
					local53 = false;
					break;
				}
			}
			if (local53) {
				return true;
			}
			@Pc(115) byte[] local115;
			if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
				local115 = Static9.method53(false, this.anObjectArray34[arg1]);
			} else {
				local115 = Static9.method53(true, this.anObjectArray34[arg1]);
				@Pc(120) Class14_Sub29 local120 = new Class14_Sub29(local115);
				local120.method5857(local120.aByteArray84.length, arg2);
			}
			@Pc(142) byte[] local142;
			try {
				local142 = Static69.method1359(local115);
			} catch (@Pc(152) RuntimeException local152) {
				throw Static324.method5107(local152, "T3 - " + (arg2 != null) + "," + arg1 + "," + local115.length + "," + Static315.method5003(local115, local115.length) + "," + Static315.method5003(local115, local115.length - 2) + "," + this.aClass95_2.anIntArray220[arg1] + "," + this.aClass95_2.anInt2654);
			}
			if (this.aBoolean761) {
				this.anObjectArray34[arg1] = null;
			}
			@Pc(224) int local224;
			if (local25 <= 1) {
				if (local31 == null) {
					local224 = 0;
				} else {
					local224 = local31[0];
				}
				if (this.anInt11070 == 0) {
					local51[local224] = Static508.method7427(local142);
				} else {
					local51[local224] = local142;
				}
			} else {
				@Pc(265) int local265;
				@Pc(278) Class14_Sub29 local278;
				@Pc(286) int local286;
				@Pc(290) int local290;
				@Pc(292) int local292;
				@Pc(350) int local350;
				@Pc(352) int local352;
				@Pc(356) int local356;
				@Pc(358) int local358;
				if (this.anInt11070 == 2) {
					local224 = local142.length;
					local224--;
					local265 = local142[local224] & 0xFF;
					local224 -= local265 * 4 * local25;
					local278 = new Class14_Sub29(local142);
					@Pc(468) int local468 = 0;
					local286 = 0;
					local278.anInt7264 = local224;
					for (local290 = 0; local290 < local265; local290++) {
						local292 = 0;
						for (local350 = 0; local350 < local25; local350++) {
							local292 += local278.method5878();
							if (local31 == null) {
								local352 = local350;
							} else {
								local352 = local31[local350];
							}
							if (arg0 == local352) {
								local286 = local352;
								local468 += local292;
							}
						}
					}
					if (local468 == 0) {
						return true;
					}
					@Pc(535) byte[] local535 = new byte[local468];
					local468 = 0;
					local278.anInt7264 = local224;
					local350 = 0;
					for (local352 = 0; local352 < local265; local352++) {
						local356 = 0;
						for (local358 = 0; local358 < local25; local358++) {
							local356 += local278.method5878();
							@Pc(562) int local562;
							if (local31 == null) {
								local562 = local358;
							} else {
								local562 = local31[local358];
							}
							if (arg0 == local562) {
								Static681.method2476(local142, local350, local535, local468, local356);
								local468 += local356;
							}
							local350 += local356;
						}
					}
					local51[local286] = local535;
				} else {
					local224 = local142.length;
					local224--;
					local265 = local142[local224] & 0xFF;
					local224 -= local265 * 4 * local25;
					local278 = new Class14_Sub29(local142);
					@Pc(281) int[] local281 = new int[local25];
					local278.anInt7264 = local224;
					for (local286 = 0; local286 < local265; local286++) {
						local290 = 0;
						for (local292 = 0; local292 < local25; local292++) {
							local290 += local278.method5878();
							local281[local292] += local290;
						}
					}
					@Pc(322) byte[][] local322 = new byte[local25][];
					for (local292 = 0; local292 < local25; local292++) {
						local322[local292] = new byte[local281[local292]];
						local281[local292] = 0;
					}
					local278.anInt7264 = local224;
					local350 = 0;
					for (local352 = 0; local352 < local265; local352++) {
						local356 = 0;
						for (local358 = 0; local358 < local25; local358++) {
							local356 += local278.method5878();
							Static681.method2476(local142, local350, local322[local358], local281[local358], local356);
							local281[local358] += local356;
							local350 += local356;
						}
					}
					for (local356 = 0; local356 < local25; local356++) {
						if (local31 == null) {
							local358 = local356;
						} else {
							local358 = local31[local356];
						}
						if (this.anInt11070 == 0) {
							local51[local358] = Static508.method7427(local322[local356]);
						} else {
							local51[local358] = local322[local356];
						}
					}
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method9194(@OriginalArg(1) String arg0) {
		if (this.method9208()) {
			@Pc(16) String local16 = arg0.toLowerCase();
			@Pc(25) int local25 = this.aClass95_2.aClass113_1.method2767(Static496.method7329(local16));
			return this.method9214(local25);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(III)[B")
	public byte[] method9196(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.method9212(arg1, arg0, (int[]) null);
	}

	@OriginalMember(owner = "client!wia", name = "b", descriptor = "(B)V")
	public void method9197() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anObjectArrayArray1.length; local6++) {
				this.anObjectArrayArray1[local6] = null;
			}
		}
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)Z")
	public boolean method9198(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method9208()) {
			return false;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(15) String local15 = arg0.toLowerCase();
		@Pc(32) int local32 = this.aClass95_2.aClass113_1.method2767(Static496.method7329(local12));
		if (local32 < 0) {
			return false;
		} else {
			@Pc(50) int local50 = this.aClass95_2.aClass113Array1[local32].method2767(Static496.method7329(local15));
			return local50 >= 0;
		}
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(BI)Z")
	private boolean method9199(@OriginalArg(1) int arg0) {
		if (!this.method9208()) {
			return false;
		} else if (arg0 >= 0 && this.aClass95_2.anIntArray217.length > arg0 && this.aClass95_2.anIntArray217[arg0] != 0) {
			return true;
		} else if (Static8.aBoolean4) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(IZZ)V")
	public void method9200(@OriginalArg(1) boolean arg0) {
		if (!this.method9208()) {
			return;
		}
		if (arg0) {
			this.aClass95_2.anIntArray222 = null;
			this.aClass95_2.aClass113_1 = null;
		}
		this.aClass95_2.anIntArrayArray14 = null;
		this.aClass95_2.aClass113Array1 = null;
	}

	@OriginalMember(owner = "client!wia", name = "b", descriptor = "(I)V")
	public void method9201() {
		if (this.anObjectArray34 != null) {
			for (@Pc(18) int local18 = 0; local18 < this.anObjectArray34.length; local18++) {
				this.anObjectArray34[local18] = null;
			}
		}
	}

	@OriginalMember(owner = "client!wia", name = "b", descriptor = "(ILjava/lang/String;)V")
	public void method9203(@OriginalArg(1) String arg0) {
		if (this.method9208()) {
			@Pc(19) String local19 = arg0.toLowerCase();
			@Pc(30) int local30 = this.aClass95_2.aClass113_1.method2767(Static496.method7329(local19));
			this.method9215(local30);
		}
	}

	@OriginalMember(owner = "client!wia", name = "c", descriptor = "(I)I")
	public int method9204() {
		if (!this.method9208()) {
			return 0;
		}
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anObjectArray34.length; local17++) {
			if (this.aClass95_2.anIntArray218[local17] > 0) {
				local13 += 100;
				local15 += this.method9190(local17);
			}
		}
		if (local13 == 0) {
			return 100;
		} else {
			return local15 * 100 / local13;
		}
	}

	@OriginalMember(owner = "client!wia", name = "b", descriptor = "(BI)[I")
	public int[] method9205(@OriginalArg(1) int arg0) {
		if (!this.method9199(arg0)) {
			return null;
		}
		@Pc(26) int[] local26 = this.aClass95_2.anIntArrayArray15[arg0];
		if (local26 == null) {
			local26 = new int[this.aClass95_2.anIntArray218[arg0]];
			@Pc(37) int local37 = 0;
			while (local26.length > local37) {
				local26[local37] = local37++;
			}
		}
		return local26;
	}

	@OriginalMember(owner = "client!wia", name = "c", descriptor = "(BI)Z")
	public boolean method9206(@OriginalArg(1) int arg0) {
		if (!this.method9208()) {
			return false;
		} else if (this.aClass95_2.anIntArray217.length == 1) {
			return this.method9216(0, arg0);
		} else if (!this.method9199(arg0)) {
			return false;
		} else if (this.aClass95_2.anIntArray217[arg0] == 1) {
			return this.method9216(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!wia", name = "d", descriptor = "(I)Z")
	public boolean method9207() {
		if (!this.method9208()) {
			return false;
		}
		@Pc(13) boolean local13 = true;
		for (@Pc(22) int local22 = 0; local22 < this.aClass95_2.anIntArray219.length; local22++) {
			@Pc(30) int local30 = this.aClass95_2.anIntArray219[local22];
			if (this.anObjectArray34[local30] == null) {
				this.method9211(local30);
				if (this.anObjectArray34[local30] == null) {
					local13 = false;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!wia", name = "e", descriptor = "(I)Z")
	private boolean method9208() {
		if (this.aClass95_2 == null) {
			this.aClass95_2 = this.aClass167_1.method3701();
			if (this.aClass95_2 == null) {
				return false;
			}
			this.anObjectArray34 = new Object[this.aClass95_2.anInt2650];
			this.anObjectArrayArray1 = new Object[this.aClass95_2.anInt2650][];
		}
		return true;
	}

	@OriginalMember(owner = "client!wia", name = "b", descriptor = "(BLjava/lang/String;)Z")
	public boolean method9209(@OriginalArg(1) String arg0) {
		if (this.method9208()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass95_2.aClass113_1.method2767(Static496.method7329(local12));
			return local21 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(IZ)I")
	public int method9210(@OriginalArg(0) int arg0) {
		return this.method9199(arg0) ? this.aClass95_2.anIntArray217[arg0] : 0;
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(IB)V")
	private void method9211(@OriginalArg(0) int arg0) {
		if (this.aBoolean761) {
			this.anObjectArray34[arg0] = this.aClass167_1.method3702(arg0);
		} else {
			this.anObjectArray34[arg0] = Static508.method7427(this.aClass167_1.method3702(arg0));
		}
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(IZI[I)[B")
	public byte[] method9212(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		if (!this.method9217(arg1, arg0)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg0] == null || this.anObjectArrayArray1[arg0][arg1] == null) {
			@Pc(30) boolean local30 = this.method9193(arg1, arg0, arg2);
			if (!local30) {
				this.method9211(arg0);
				local30 = this.method9193(arg1, arg0, arg2);
				if (!local30) {
					return null;
				}
			}
		}
		@Pc(57) byte[] local57 = Static9.method53(false, this.anObjectArrayArray1[arg0][arg1]);
		if (this.anInt11070 == 1) {
			this.anObjectArrayArray1[arg0][arg1] = null;
			if (this.aClass95_2.anIntArray217[arg0] == 1) {
				this.anObjectArrayArray1[arg0] = null;
			}
		} else if (this.anInt11070 == 2) {
			this.anObjectArrayArray1[arg0] = null;
		}
		return local57;
	}

	@OriginalMember(owner = "client!wia", name = "c", descriptor = "(ILjava/lang/String;)I")
	public int method9213(@OriginalArg(1) String arg0) {
		if (this.method9208()) {
			@Pc(17) String local17 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass95_2.aClass113_1.method2767(Static496.method7329(local17));
			return this.method9199(local26) ? local26 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!wia", name = "d", descriptor = "(II)Z")
	public boolean method9214(@OriginalArg(1) int arg0) {
		if (!this.method9199(arg0)) {
			return false;
		} else if (this.anObjectArray34[arg0] == null) {
			this.method9211(arg0);
			return this.anObjectArray34[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!wia", name = "e", descriptor = "(II)V")
	private void method9215(@OriginalArg(0) int arg0) {
		this.aClass167_1.method3704(arg0);
	}

	@OriginalMember(owner = "client!wia", name = "b", descriptor = "(III)Z")
	public boolean method9216(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method9217(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray1[arg0] != null && this.anObjectArrayArray1[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray34[arg0] == null) {
			this.method9211(arg0);
			return this.anObjectArray34[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(ZII)Z")
	private boolean method9217(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method9208()) {
			return false;
		} else if (arg1 >= 0 && arg0 >= 0 && arg1 < this.aClass95_2.anIntArray217.length && arg0 < this.aClass95_2.anIntArray217[arg1]) {
			return true;
		} else if (Static8.aBoolean4) {
			throw new IllegalArgumentException(arg1 + "," + arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wia", name = "c", descriptor = "(B)I")
	public int method9218() {
		if (!this.method9208()) {
			throw new IllegalStateException("");
		}
		return this.aClass95_2.anInt2654;
	}

	@OriginalMember(owner = "client!wia", name = "b", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)[B")
	public byte[] method9219(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method9208()) {
			return null;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(15) String local15 = arg0.toLowerCase();
		@Pc(32) int local32 = this.aClass95_2.aClass113_1.method2767(Static496.method7329(local12));
		if (this.method9199(local32)) {
			@Pc(50) int local50 = this.aClass95_2.aClass113Array1[local32].method2767(Static496.method7329(local15));
			return this.method9196(local50, local32);
		} else {
			return null;
		}
	}
}
