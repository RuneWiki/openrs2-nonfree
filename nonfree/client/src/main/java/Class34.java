import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bt")
public final class Class34 {

	@OriginalMember(owner = "client!bt", name = "d", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray1;

	@OriginalMember(owner = "client!bt", name = "F", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!bt", name = "B", descriptor = "Lclient!kd;")
	private Class191 aClass191_1 = null;

	@OriginalMember(owner = "client!bt", name = "O", descriptor = "Lclient!hs;")
	private final Class89 aClass89_1;

	@OriginalMember(owner = "client!bt", name = "H", descriptor = "Z")
	private final boolean aBoolean82;

	@OriginalMember(owner = "client!bt", name = "D", descriptor = "I")
	public int anInt1211;

	@OriginalMember(owner = "client!bt", name = "<init>", descriptor = "(Lclient!hs;ZI)V")
	public Class34(@OriginalArg(0) Class89 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (arg2 < 0 || arg2 > 2) {
			throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
		}
		this.aClass89_1 = arg0;
		this.aBoolean82 = arg1;
		this.anInt1211 = arg2;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(ILjava/lang/String;)V")
	public void method1226(@OriginalArg(1) String arg0) {
		if (this.method1254()) {
			@Pc(17) String local17 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass191_1.aClass348_1.method7595(Static7.method143(local17));
			this.method1258(local26);
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(II)I")
	private int method1227(@OriginalArg(0) int arg0) {
		if (this.method1232(arg0)) {
			return this.anObjectArray1[arg0] == null ? this.aClass89_1.method2234(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(I)V")
	public void method1228() {
		if (this.anObjectArray1 != null) {
			for (@Pc(19) int local19 = 0; local19 < this.anObjectArray1.length; local19++) {
				this.anObjectArray1[local19] = null;
			}
		}
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(I)I")
	public int method1229() {
		if (!this.method1254()) {
			throw new IllegalStateException("");
		}
		return this.aClass191_1.anInt4788;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(I[III)[B")
	public byte[] method1230(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		if (!this.method1244(arg2, arg0)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg2] == null || this.anObjectArrayArray1[arg2][arg0] == null) {
			@Pc(30) boolean local30 = this.method1236(arg2, arg1, arg0);
			if (!local30) {
				this.method1240(arg2);
				local30 = this.method1236(arg2, arg1, arg0);
				if (!local30) {
					return null;
				}
			}
		}
		@Pc(65) byte[] local65 = Static418.method5746(this.anObjectArrayArray1[arg2][arg0], false);
		if (this.anInt1211 == 1) {
			this.anObjectArrayArray1[arg2][arg0] = null;
			if (this.aClass191_1.anIntArray360[arg2] == 1) {
				this.anObjectArrayArray1[arg2] = null;
			}
		} else if (this.anInt1211 == 2) {
			this.anObjectArrayArray1[arg2] = null;
		}
		return local65;
	}

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(I)V")
	public void method1231() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(18) int local18 = 0; local18 < this.anObjectArrayArray1.length; local18++) {
				this.anObjectArrayArray1[local18] = null;
			}
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(ZI)Z")
	private boolean method1232(@OriginalArg(1) int arg0) {
		if (!this.method1254()) {
			return false;
		} else if (arg0 >= 0 && arg0 < this.aClass191_1.anIntArray360.length && this.aClass191_1.anIntArray360[arg0] != 0) {
			return true;
		} else if (Static308.aBoolean775) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(II)I")
	public int method1233(@OriginalArg(1) int arg0) {
		return this.method1232(arg0) ? this.aClass191_1.anIntArray360[arg0] : 0;
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(ZI)Z")
	public boolean method1234(@OriginalArg(1) int arg0) {
		if (!this.method1232(arg0)) {
			return false;
		} else if (this.anObjectArray1[arg0] == null) {
			this.method1240(arg0);
			return this.anObjectArray1[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(BI)Z")
	public boolean method1235(@OriginalArg(1) int arg0) {
		if (!this.method1254()) {
			return false;
		} else if (this.aClass191_1.anIntArray360.length == 1) {
			return this.method1245(arg0, 0);
		} else if (!this.method1232(arg0)) {
			return false;
		} else if (this.aClass191_1.anIntArray360[arg0] == 1) {
			return this.method1245(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(II[II)Z")
	private boolean method1236(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		if (!this.method1232(arg0)) {
			return false;
		} else if (this.anObjectArray1[arg0] == null) {
			return false;
		} else {
			@Pc(25) int local25 = this.aClass191_1.anIntArray359[arg0];
			@Pc(31) int[] local31 = this.aClass191_1.anIntArrayArray28[arg0];
			if (this.anObjectArrayArray1[arg0] == null) {
				this.anObjectArrayArray1[arg0] = new Object[this.aClass191_1.anIntArray360[arg0]];
			}
			@Pc(51) Object[] local51 = this.anObjectArrayArray1[arg0];
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
			if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
				local115 = Static418.method5746(this.anObjectArray1[arg0], false);
			} else {
				local115 = Static418.method5746(this.anObjectArray1[arg0], true);
				@Pc(120) Class4_Sub11 local120 = new Class4_Sub11(local115);
				local120.method8839(arg1, local120.aByteArray107.length);
			}
			@Pc(142) byte[] local142;
			try {
				local142 = Static540.method7233(local115);
			} catch (@Pc(144) RuntimeException local144) {
				throw Static343.method4658(local144, "T3 - " + (arg1 != null) + "," + arg0 + "," + local115.length + "," + Static303.method4270(local115, local115.length) + "," + Static303.method4270(local115, local115.length - 2) + "," + this.aClass191_1.anIntArray364[arg0] + "," + this.aClass191_1.anInt4788);
			}
			if (this.aBoolean82) {
				this.anObjectArray1[arg0] = null;
			}
			@Pc(219) int local219;
			if (local25 > 1) {
				@Pc(226) int local226;
				@Pc(239) Class4_Sub11 local239;
				@Pc(243) int local243;
				@Pc(248) int local248;
				@Pc(252) int local252;
				@Pc(254) int local254;
				@Pc(268) int local268;
				@Pc(309) int local309;
				@Pc(311) int local311;
				if (this.anInt1211 == 2) {
					local219 = local142.length;
					@Pc(221) int local221 = local219 - 1;
					local226 = local142[local221] & 0xFF;
					@Pc(234) int local234 = local221 - local25 * 4 * local226;
					local239 = new Class4_Sub11(local142);
					@Pc(241) int local241 = 0;
					local243 = 0;
					local239.anInt10466 = local234;
					for (local248 = 0; local248 < local226; local248++) {
						local252 = 0;
						for (local254 = 0; local254 < local25; local254++) {
							local252 += local239.method8850();
							if (local31 == null) {
								local268 = local254;
							} else {
								local268 = local31[local254];
							}
							if (arg2 == local268) {
								local241 += local252;
								local243 = local268;
							}
						}
					}
					if (local241 == 0) {
						return true;
					}
					@Pc(296) byte[] local296 = new byte[local241];
					local241 = 0;
					local239.anInt10466 = local234;
					local254 = 0;
					for (local268 = 0; local268 < local226; local268++) {
						local309 = 0;
						for (local311 = 0; local311 < local25; local311++) {
							local309 += local239.method8850();
							@Pc(323) int local323;
							if (local31 == null) {
								local323 = local311;
							} else {
								local323 = local31[local311];
							}
							if (arg2 == local323) {
								Static685.method6464(local142, local254, local296, local241, local309);
								local241 += local309;
							}
							local254 += local309;
						}
					}
					local51[local243] = local296;
				} else {
					local219 = local142.length;
					local219--;
					local226 = local142[local219] & 0xFF;
					local219 -= local226 * local25 * 4;
					local239 = new Class4_Sub11(local142);
					local239.anInt10466 = local219;
					@Pc(393) int[] local393 = new int[local25];
					for (local243 = 0; local243 < local226; local243++) {
						local248 = 0;
						for (local252 = 0; local252 < local25; local252++) {
							local248 += local239.method8850();
							local393[local252] += local248;
						}
					}
					@Pc(435) byte[][] local435 = new byte[local25][];
					for (local252 = 0; local252 < local25; local252++) {
						local435[local252] = new byte[local393[local252]];
						local393[local252] = 0;
					}
					local239.anInt10466 = local219;
					local254 = 0;
					for (local268 = 0; local268 < local226; local268++) {
						local309 = 0;
						for (local311 = 0; local311 < local25; local311++) {
							local309 += local239.method8850();
							Static685.method6464(local142, local254, local435[local311], local393[local311], local309);
							local254 += local309;
							local393[local311] += local309;
						}
					}
					for (local309 = 0; local309 < local25; local309++) {
						if (local31 == null) {
							local311 = local309;
						} else {
							local311 = local31[local309];
						}
						if (this.anInt1211 == 0) {
							local51[local311] = Static621.method8352(local435[local309]);
						} else {
							local51[local311] = local435[local309];
						}
					}
				}
			} else {
				if (local31 == null) {
					local219 = 0;
				} else {
					local219 = local31[0];
				}
				if (this.anInt1211 == 0) {
					local51[local219] = Static621.method8352(local142);
				} else {
					local51[local219] = local142;
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(ILjava/lang/String;)I")
	public int method1237(@OriginalArg(1) String arg0) {
		if (this.method1254()) {
			@Pc(16) String local16 = arg0.toLowerCase();
			@Pc(25) int local25 = this.aClass191_1.aClass348_1.method7595(Static7.method143(local16));
			return this.method1227(local25);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)[B")
	public byte[] method1238(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method1254()) {
			return null;
		}
		@Pc(14) String local14 = arg0.toLowerCase();
		@Pc(17) String local17 = arg1.toLowerCase();
		@Pc(28) int local28 = this.aClass191_1.aClass348_1.method7595(Static7.method143(local14));
		if (this.method1232(local28)) {
			@Pc(54) int local54 = this.aClass191_1.aClass348Array1[local28].method7595(Static7.method143(local17));
			return this.method1239(local28, local54);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IBI)[B")
	public byte[] method1239(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.method1230(arg1, (int[]) null, arg0);
	}

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(II)V")
	private void method1240(@OriginalArg(0) int arg0) {
		if (this.aBoolean82) {
			this.anObjectArray1[arg0] = this.aClass89_1.method2231(arg0);
		} else {
			this.anObjectArray1[arg0] = Static621.method8352(this.aClass89_1.method2231(arg0));
		}
	}

	@OriginalMember(owner = "client!bt", name = "d", descriptor = "(I)I")
	public int method1241() {
		if (!this.method1254()) {
			return 0;
		}
		@Pc(13) int local13 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anObjectArray1.length; local23++) {
			if (this.aClass191_1.anIntArray359[local23] > 0) {
				local21 += this.method1227(local23);
				local13 += 100;
			}
		}
		if (local13 == 0) {
			return 100;
		} else {
			return local21 * 100 / local13;
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method1242(@OriginalArg(0) String arg0) {
		if (this.method1254()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass191_1.aClass348_1.method7595(Static7.method143(local12));
			return local21 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bt", name = "d", descriptor = "(II)[I")
	public int[] method1243(@OriginalArg(0) int arg0) {
		if (!this.method1232(arg0)) {
			return null;
		}
		@Pc(23) int[] local23 = this.aClass191_1.anIntArrayArray28[arg0];
		if (local23 == null) {
			local23 = new int[this.aClass191_1.anIntArray359[arg0]];
			@Pc(34) int local34 = 0;
			while (local23.length > local34) {
				local23[local34] = local34++;
			}
		}
		return local23;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(III)Z")
	private boolean method1244(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method1254()) {
			return false;
		} else if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aClass191_1.anIntArray360.length && arg1 < this.aClass191_1.anIntArray360[arg0]) {
			return true;
		} else if (Static308.aBoolean775) {
			throw new IllegalArgumentException(arg0 + "," + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIZ)Z")
	public boolean method1245(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method1244(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray1[arg1] != null && this.anObjectArrayArray1[arg1][arg0] != null) {
			return true;
		} else if (this.anObjectArray1[arg1] == null) {
			this.method1240(arg1);
			return this.anObjectArray1[arg1] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public boolean method1246(@OriginalArg(1) String arg0) {
		if (this.method1254()) {
			@Pc(14) String local14 = arg0.toLowerCase();
			@Pc(30) int local30 = this.aClass191_1.aClass348_1.method7595(Static7.method143(local14));
			return this.method1234(local30);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bt", name = "e", descriptor = "(I)I")
	public int method1247() {
		return this.method1254() ? this.aClass191_1.anIntArray360.length : -1;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z")
	private boolean method1248(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method1254()) {
			return false;
		}
		@Pc(22) String local22 = arg1.toLowerCase();
		@Pc(25) String local25 = arg0.toLowerCase();
		@Pc(36) int local36 = this.aClass191_1.aClass348_1.method7595(Static7.method143(local22));
		if (this.method1232(local36)) {
			@Pc(56) int local56 = this.aClass191_1.aClass348Array1[local36].method7595(Static7.method143(local25));
			return this.method1245(local56, local36);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IB)I")
	public int method1249(@OriginalArg(0) int arg0) {
		if (this.method1254()) {
			@Pc(16) int local16 = this.aClass191_1.aClass348_1.method7595(arg0);
			return this.method1232(local16) ? local16 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(ZI)V")
	public void method1250(@OriginalArg(1) int arg0) {
		if (this.method1232(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(BLjava/lang/String;)I")
	public int method1252(@OriginalArg(1) String arg0) {
		if (this.method1254()) {
			@Pc(20) String local20 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass191_1.aClass348_1.method7595(Static7.method143(local20));
			return this.method1232(local29) ? local29 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z")
	public boolean method1253(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method1254()) {
			return false;
		}
		@Pc(17) String local17 = arg1.toLowerCase();
		@Pc(20) String local20 = arg0.toLowerCase();
		@Pc(31) int local31 = this.aClass191_1.aClass348_1.method7595(Static7.method143(local17));
		if (local31 < 0) {
			return false;
		} else {
			@Pc(46) int local46 = this.aClass191_1.aClass348Array1[local31].method7595(Static7.method143(local20));
			return local46 >= 0;
		}
	}

	@OriginalMember(owner = "client!bt", name = "f", descriptor = "(I)Z")
	private boolean method1254() {
		if (this.aClass191_1 == null) {
			this.aClass191_1 = this.aClass89_1.method2233();
			if (this.aClass191_1 == null) {
				return false;
			}
			this.anObjectArray1 = new Object[this.aClass191_1.anInt4782];
			this.anObjectArrayArray1 = new Object[this.aClass191_1.anInt4782][];
		}
		return true;
	}

	@OriginalMember(owner = "client!bt", name = "e", descriptor = "(II)[B")
	public byte[] method1255(@OriginalArg(0) int arg0) {
		if (!this.method1254()) {
			return null;
		} else if (this.aClass191_1.anIntArray360.length == 1) {
			return this.method1239(0, arg0);
		} else if (!this.method1232(arg0)) {
			return null;
		} else if (this.aClass191_1.anIntArray360[arg0] == 1) {
			return this.method1239(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bt", name = "g", descriptor = "(I)Z")
	public boolean method1257() {
		if (!this.method1254()) {
			return false;
		}
		@Pc(20) boolean local20 = true;
		for (@Pc(22) int local22 = 0; local22 < this.aClass191_1.anIntArray363.length; local22++) {
			@Pc(30) int local30 = this.aClass191_1.anIntArray363[local22];
			if (this.anObjectArray1[local30] == null) {
				this.method1240(local30);
				if (this.anObjectArray1[local30] == null) {
					local20 = false;
				}
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!bt", name = "g", descriptor = "(II)V")
	private void method1258(@OriginalArg(0) int arg0) {
		this.aClass89_1.method2235(arg0);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(ZZI)V")
	public void method1259(@OriginalArg(0) boolean arg0) {
		if (!this.method1254()) {
			return;
		}
		this.aClass191_1.aClass348Array1 = null;
		this.aClass191_1.anIntArrayArray29 = null;
		if (arg0) {
			this.aClass191_1.anIntArray361 = null;
			this.aClass191_1.aClass348_1 = null;
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public boolean method1261(@OriginalArg(0) String arg0) {
		@Pc(13) int local13 = this.method1252("");
		return local13 == -1 ? this.method1248("", arg0) : this.method1248(arg0, "");
	}
}
