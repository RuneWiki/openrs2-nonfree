import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dn")
public final class Class56 {

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray3;

	@OriginalMember(owner = "client!dn", name = "H", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!dn", name = "j", descriptor = "Lclient!jc;")
	private Class118 aClass118_1 = null;

	@OriginalMember(owner = "client!dn", name = "d", descriptor = "Lclient!dh;")
	private final Class50 aClass50_1;

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "Z")
	private final boolean aBoolean136;

	@OriginalMember(owner = "client!dn", name = "o", descriptor = "I")
	public int anInt1678;

	@OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(Lclient!dh;ZI)V")
	public Class56(@OriginalArg(0) Class50 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.aClass50_1 = arg0;
		this.aBoolean136 = arg1;
		this.anInt1678 = arg2;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(BI)V")
	public void method1362(@OriginalArg(1) int arg0) {
		if (this.method1372(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(II)[I")
	public int[] method1363(@OriginalArg(1) int arg0) {
		if (!this.method1372(arg0)) {
			return null;
		}
		@Pc(21) int[] local21 = this.aClass118_1.anIntArrayArray31[arg0];
		if (local21 == null) {
			local21 = new int[this.aClass118_1.anIntArray287[arg0]];
			@Pc(32) int local32 = 0;
			while (local32 < local21.length) {
				local21[local32] = local32++;
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method1364(@OriginalArg(0) String arg0) {
		if (this.method1386()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(27) int local27 = this.aClass118_1.aClass140_1.method3500(Static217.method3475(local12));
			return local27 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IB)Z")
	public boolean method1365(@OriginalArg(0) int arg0) {
		if (!this.method1386()) {
			return false;
		} else if (this.aClass118_1.anIntArray288.length == 1) {
			return this.method1388(0, arg0);
		} else if (!this.method1372(arg0)) {
			return false;
		} else if (this.aClass118_1.anIntArray288[arg0] == 1) {
			return this.method1388(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "(BI)I")
	public int method1366(@OriginalArg(1) int arg0) {
		if (this.method1386()) {
			@Pc(25) int local25 = this.aClass118_1.aClass140_1.method3500(arg0);
			return this.method1372(local25) ? local25 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "(Ljava/lang/String;I)I")
	public int method1368(@OriginalArg(0) String arg0) {
		if (this.method1386()) {
			@Pc(20) String local20 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass118_1.aClass140_1.method3500(Static217.method3475(local20));
			return this.method1372(local29) ? local29 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(III[I)Z")
	private boolean method1369(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		if (!this.method1372(arg1)) {
			return false;
		} else if (this.anObjectArray3[arg1] == null) {
			return false;
		} else {
			@Pc(23) int local23 = this.aClass118_1.anIntArray287[arg1];
			@Pc(29) int[] local29 = this.aClass118_1.anIntArrayArray31[arg1];
			if (this.anObjectArrayArray1[arg1] == null) {
				this.anObjectArrayArray1[arg1] = new Object[this.aClass118_1.anIntArray288[arg1]];
			}
			@Pc(54) Object[] local54 = this.anObjectArrayArray1[arg1];
			@Pc(56) boolean local56 = true;
			for (@Pc(58) int local58 = 0; local58 < local23; local58++) {
				@Pc(65) int local65;
				if (local29 == null) {
					local65 = local58;
				} else {
					local65 = local29[local58];
				}
				if (local54[local65] == null) {
					local56 = false;
					break;
				}
			}
			if (local56) {
				return true;
			}
			@Pc(115) byte[] local115;
			if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
				local115 = Static206.method3379(this.anObjectArray3[arg1], false);
			} else {
				local115 = Static206.method3379(this.anObjectArray3[arg1], true);
				@Pc(120) Class3_Sub2 local120 = new Class3_Sub2(local115);
				local120.method5994(arg2, local120.aByteArray95.length);
			}
			@Pc(141) byte[] local141;
			try {
				local141 = Static333.method4851(local115);
			} catch (@Pc(143) RuntimeException local143) {
				throw Static218.method3491(local143, "T3 - " + (arg2 != null) + "," + arg1 + "," + local115.length + "," + Static399.method5379(local115.length, local115) + "," + Static399.method5379(local115.length - 2, local115) + "," + this.aClass118_1.anIntArray286[arg1] + "," + this.aClass118_1.anInt3746);
			}
			if (this.aBoolean136) {
				this.anObjectArray3[arg1] = null;
			}
			@Pc(213) int local213;
			if (local23 <= 1) {
				if (local29 == null) {
					local213 = 0;
				} else {
					local213 = local29[0];
				}
				if (this.anInt1678 == 0) {
					local54[local213] = Static17.method517(local141);
				} else {
					local54[local213] = local141;
				}
			} else {
				@Pc(250) int local250;
				@Pc(263) Class3_Sub2 local263;
				@Pc(271) int local271;
				@Pc(274) int local274;
				@Pc(276) int local276;
				@Pc(332) int local332;
				@Pc(334) int local334;
				@Pc(337) int local337;
				@Pc(339) int local339;
				if (this.anInt1678 == 2) {
					local213 = local141.length;
					local213--;
					local250 = local141[local213] & 0xFF;
					local213 -= local23 * 4 * local250;
					local263 = new Class3_Sub2(local141);
					@Pc(440) int local440 = 0;
					local271 = 0;
					local263.anInt7620 = local213;
					for (local274 = 0; local274 < local250; local274++) {
						local276 = 0;
						for (local332 = 0; local332 < local23; local332++) {
							local276 += local263.method6014();
							if (local29 == null) {
								local334 = local332;
							} else {
								local334 = local29[local332];
							}
							if (local334 == arg0) {
								local440 += local276;
								local271 = local334;
							}
						}
					}
					if (local440 == 0) {
						return true;
					}
					@Pc(500) byte[] local500 = new byte[local440];
					local440 = 0;
					local263.anInt7620 = local213;
					local332 = 0;
					for (local334 = 0; local334 < local250; local334++) {
						local337 = 0;
						for (local339 = 0; local339 < local23; local339++) {
							local337 += local263.method6014();
							@Pc(525) int local525;
							if (local29 == null) {
								local525 = local339;
							} else {
								local525 = local29[local339];
							}
							if (local525 == arg0) {
								Static464.method5797(local141, local332, local500, local440, local337);
								local440 += local337;
							}
							local332 += local337;
						}
					}
					local54[local271] = local500;
				} else {
					local213 = local141.length;
					local213--;
					local250 = local141[local213] & 0xFF;
					local213 -= local250 * 4 * local23;
					local263 = new Class3_Sub2(local141);
					local263.anInt7620 = local213;
					@Pc(269) int[] local269 = new int[local23];
					for (local271 = 0; local271 < local250; local271++) {
						local274 = 0;
						for (local276 = 0; local276 < local23; local276++) {
							local274 += local263.method6014();
							local269[local276] += local274;
						}
					}
					@Pc(305) byte[][] local305 = new byte[local23][];
					for (local276 = 0; local276 < local23; local276++) {
						local305[local276] = new byte[local269[local276]];
						local269[local276] = 0;
					}
					local263.anInt7620 = local213;
					local332 = 0;
					for (local334 = 0; local334 < local250; local334++) {
						local337 = 0;
						for (local339 = 0; local339 < local23; local339++) {
							local337 += local263.method6014();
							Static464.method5797(local141, local332, local305[local339], local269[local339], local337);
							local332 += local337;
							local269[local339] += local337;
						}
					}
					for (local337 = 0; local337 < local23; local337++) {
						if (local29 == null) {
							local339 = local337;
						} else {
							local339 = local29[local337];
						}
						if (this.anInt1678 == 0) {
							local54[local339] = Static17.method517(local305[local337]);
						} else {
							local54[local339] = local305[local337];
						}
					}
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(ZI)V")
	private void method1370(@OriginalArg(1) int arg0) {
		this.aClass50_1.method1828(arg0);
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)[B")
	public byte[] method1371(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method1386()) {
			return null;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(20) String local20 = arg1.toLowerCase();
		@Pc(29) int local29 = this.aClass118_1.aClass140_1.method3500(Static217.method3475(local12));
		if (this.method1372(local29)) {
			@Pc(47) int local47 = this.aClass118_1.aClass140Array1[local29].method3500(Static217.method3475(local20));
			return this.method1384(local29, local47);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "(BI)Z")
	private boolean method1372(@OriginalArg(1) int arg0) {
		if (!this.method1386()) {
			return false;
		} else if (arg0 >= 0 && this.aClass118_1.anIntArray288.length > arg0 && this.aClass118_1.anIntArray288[arg0] != 0) {
			return true;
		} else if (Static454.aBoolean527) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "(II)I")
	public int method1373(@OriginalArg(1) int arg0) {
		return this.method1372(arg0) ? this.aClass118_1.anIntArray288[arg0] : 0;
	}

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method1374(@OriginalArg(0) String arg0) {
		if (this.method1386()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass118_1.aClass140_1.method3500(Static217.method3475(local12));
			return this.method1379(local26);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)V")
	public void method1375() {
		if (this.anObjectArray3 != null) {
			for (@Pc(4) int local4 = 0; local4 < this.anObjectArray3.length; local4++) {
				this.anObjectArray3[local4] = null;
			}
		}
	}

	@OriginalMember(owner = "client!dn", name = "d", descriptor = "(Ljava/lang/String;I)V")
	public void method1376(@OriginalArg(0) String arg0) {
		if (this.method1386()) {
			@Pc(13) String local13 = arg0.toLowerCase();
			@Pc(22) int local22 = this.aClass118_1.aClass140_1.method3500(Static217.method3475(local13));
			this.method1370(local22);
		}
	}

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "(I)I")
	public int method1377() {
		if (!this.method1386()) {
			return 0;
		}
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anObjectArray3.length; local17++) {
			if (this.aClass118_1.anIntArray287[local17] > 0) {
				local15 += this.method1381(local17);
				local13 += 100;
			}
		}
		if (local13 == 0) {
			return 100;
		} else {
			return local15 * 100 / local13;
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(ZIZ)V")
	public void method1378(@OriginalArg(0) boolean arg0) {
		if (!this.method1386()) {
			return;
		}
		if (arg0) {
			this.aClass118_1.anIntArray289 = null;
			this.aClass118_1.aClass140_1 = null;
		}
		this.aClass118_1.aClass140Array1 = null;
		this.aClass118_1.anIntArrayArray32 = null;
	}

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "(IB)Z")
	public boolean method1379(@OriginalArg(0) int arg0) {
		if (!this.method1372(arg0)) {
			return false;
		} else if (this.anObjectArray3[arg0] == null) {
			this.method1389(arg0);
			return this.anObjectArray3[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "(B)I")
	public int method1380() {
		return this.method1386() ? this.aClass118_1.anIntArray288.length : -1;
	}

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "(II)I")
	private int method1381(@OriginalArg(1) int arg0) {
		if (this.method1372(arg0)) {
			return this.anObjectArray3[arg0] == null ? this.aClass50_1.method1826(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "(B)Z")
	public boolean method1382() {
		if (!this.method1386()) {
			return false;
		}
		@Pc(13) boolean local13 = true;
		for (@Pc(23) int local23 = 0; local23 < this.aClass118_1.anIntArray290.length; local23++) {
			@Pc(31) int local31 = this.aClass118_1.anIntArray290[local23];
			if (this.anObjectArray3[local31] == null) {
				this.method1389(local31);
				if (this.anObjectArray3[local31] == null) {
					local13 = false;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "(I)I")
	public int method1383() {
		if (!this.method1386()) {
			throw new IllegalStateException("");
		}
		return this.aClass118_1.anInt3746;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(BII)[B")
	public byte[] method1384(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.method1392(arg0, arg1, null);
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(III)Z")
	private boolean method1385(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method1386()) {
			return false;
		} else if (arg0 >= 0 && arg1 >= 0 && this.aClass118_1.anIntArray288.length > arg0 && arg1 < this.aClass118_1.anIntArray288[arg0]) {
			return true;
		} else if (Static454.aBoolean527) {
			throw new IllegalArgumentException(arg0 + "," + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!dn", name = "d", descriptor = "(I)Z")
	private boolean method1386() {
		if (this.aClass118_1 == null) {
			this.aClass118_1 = this.aClass50_1.method1829();
			if (this.aClass118_1 == null) {
				return false;
			}
			this.anObjectArray3 = new Object[this.aClass118_1.anInt3747];
			this.anObjectArrayArray1 = new Object[this.aClass118_1.anInt3747][];
		}
		return true;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z")
	public boolean method1387(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method1386()) {
			return false;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(15) String local15 = arg0.toLowerCase();
		@Pc(26) int local26 = this.aClass118_1.aClass140_1.method3500(Static217.method3475(local12));
		if (this.method1372(local26)) {
			@Pc(46) int local46 = this.aClass118_1.aClass140Array1[local26].method3500(Static217.method3475(local15));
			return this.method1388(local26, local46);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "(III)Z")
	public boolean method1388(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method1385(arg0, arg1)) {
			return false;
		} else if (this.anObjectArrayArray1[arg0] != null && this.anObjectArrayArray1[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray3[arg0] == null) {
			this.method1389(arg0);
			return this.anObjectArray3[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!dn", name = "d", descriptor = "(II)V")
	private void method1389(@OriginalArg(1) int arg0) {
		if (this.aBoolean136) {
			this.anObjectArray3[arg0] = this.aClass50_1.method1825(arg0);
		} else {
			this.anObjectArray3[arg0] = Static17.method517(this.aClass50_1.method1825(arg0));
		}
	}

	@OriginalMember(owner = "client!dn", name = "e", descriptor = "(I)V")
	public void method1390() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(8) int local8 = 0; local8 < this.anObjectArrayArray1.length; local8++) {
				this.anObjectArrayArray1[local8] = null;
			}
		}
	}

	@OriginalMember(owner = "client!dn", name = "e", descriptor = "(II)[B")
	public byte[] method1391(@OriginalArg(0) int arg0) {
		if (!this.method1386()) {
			return null;
		} else if (this.aClass118_1.anIntArray288.length == 1) {
			return this.method1384(0, arg0);
		} else if (!this.method1372(arg0)) {
			return null;
		} else if (this.aClass118_1.anIntArray288[arg0] == 1) {
			return this.method1384(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(BII[I)[B")
	public byte[] method1392(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		if (!this.method1385(arg0, arg1)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg0] == null || this.anObjectArrayArray1[arg0][arg1] == null) {
			@Pc(32) boolean local32 = this.method1369(arg1, arg0, arg2);
			if (!local32) {
				this.method1389(arg0);
				local32 = this.method1369(arg1, arg0, arg2);
				if (!local32) {
					return null;
				}
			}
		}
		@Pc(67) byte[] local67 = Static206.method3379(this.anObjectArrayArray1[arg0][arg1], false);
		if (this.anInt1678 == 1) {
			this.anObjectArrayArray1[arg0][arg1] = null;
			if (this.aClass118_1.anIntArray288[arg0] == 1) {
				this.anObjectArrayArray1[arg0] = null;
			}
		} else if (this.anInt1678 == 2) {
			this.anObjectArrayArray1[arg0] = null;
		}
		return local67;
	}

	@OriginalMember(owner = "client!dn", name = "e", descriptor = "(Ljava/lang/String;I)I")
	public int method1393(@OriginalArg(0) String arg0) {
		if (this.method1386()) {
			@Pc(20) String local20 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass118_1.aClass140_1.method3500(Static217.method3475(local20));
			return this.method1381(local29);
		} else {
			return 0;
		}
	}
}
