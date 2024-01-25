import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ct")
public final class Class30 {

	@OriginalMember(owner = "client!ct", name = "x", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray1;

	@OriginalMember(owner = "client!ct", name = "y", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!ct", name = "D", descriptor = "Lclient!mc;")
	private Class131 aClass131_1 = null;

	@OriginalMember(owner = "client!ct", name = "J", descriptor = "Lclient!wa;")
	private final Class51 aClass51_1;

	@OriginalMember(owner = "client!ct", name = "B", descriptor = "I")
	public int anInt1229;

	@OriginalMember(owner = "client!ct", name = "h", descriptor = "Z")
	private final boolean aBoolean84;

	@OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(Lclient!wa;ZI)V")
	public Class30(@OriginalArg(0) Class51 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.aClass51_1 = arg0;
		this.anInt1229 = arg2;
		this.aBoolean84 = arg1;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(ZIZ)V")
	public void method1148(@OriginalArg(2) boolean arg0) {
		if (!this.method1173()) {
			return;
		}
		this.aClass131_1.anIntArrayArray33 = null;
		this.aClass131_1.aClass82Array1 = null;
		if (arg0) {
			this.aClass131_1.aClass82_1 = null;
			this.aClass131_1.anIntArray297 = null;
		}
	}

	@OriginalMember(owner = "client!ct", name = "b", descriptor = "(B)V")
	public void method1149() {
		if (this.anObjectArray1 != null) {
			for (@Pc(14) int local14 = 0; local14 < this.anObjectArray1.length; local14++) {
				this.anObjectArray1[local14] = null;
			}
		}
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(II[II)Z")
	private boolean method1150(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		if (!this.method1163(arg0)) {
			return false;
		} else if (this.anObjectArray1[arg0] == null) {
			return false;
		} else {
			@Pc(25) int local25 = this.aClass131_1.anIntArray296[arg0];
			@Pc(31) int[] local31 = this.aClass131_1.anIntArrayArray32[arg0];
			if (this.anObjectArrayArray1[arg0] == null) {
				this.anObjectArrayArray1[arg0] = new Object[this.aClass131_1.anIntArray294[arg0]];
			}
			@Pc(59) Object[] local59 = this.anObjectArrayArray1[arg0];
			@Pc(61) boolean local61 = true;
			for (@Pc(63) int local63 = 0; local63 < local25; local63++) {
				@Pc(71) int local71;
				if (local31 == null) {
					local71 = local63;
				} else {
					local71 = local31[local63];
				}
				if (local59[local71] == null) {
					local61 = false;
					break;
				}
			}
			if (local61) {
				return true;
			}
			@Pc(124) byte[] local124;
			if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
				local124 = Static131.method2686(this.anObjectArray1[arg0], false);
			} else {
				local124 = Static131.method2686(this.anObjectArray1[arg0], true);
				@Pc(129) Class1_Sub7 local129 = new Class1_Sub7(local124);
				local129.method2108(arg1, local129.aByteArray41.length);
			}
			@Pc(151) byte[] local151;
			try {
				local151 = Static87.method1815(local124);
			} catch (@Pc(153) RuntimeException local153) {
				throw Static232.method4303(local153, "T3 - " + (arg1 != null) + "," + arg0 + "," + local124.length + "," + Static37.method929(local124.length, local124) + "," + Static37.method929(local124.length - 2, local124) + "," + this.aClass131_1.anIntArray295[arg0] + "," + this.aClass131_1.anInt3879);
			}
			if (this.aBoolean84) {
				this.anObjectArray1[arg0] = null;
			}
			@Pc(230) int local230;
			if (local25 > 1) {
				@Pc(237) int local237;
				@Pc(250) Class1_Sub7 local250;
				@Pc(258) int local258;
				@Pc(262) int local262;
				@Pc(264) int local264;
				@Pc(318) int local318;
				@Pc(320) int local320;
				@Pc(324) int local324;
				@Pc(326) int local326;
				if (this.anInt1229 == 2) {
					local230 = local151.length;
					local230--;
					local237 = local151[local230] & 0xFF;
					local230 -= local237 * local25 * 4;
					local250 = new Class1_Sub7(local151);
					@Pc(432) int local432 = 0;
					local250.anInt2219 = local230;
					local258 = 0;
					for (local262 = 0; local262 < local237; local262++) {
						local264 = 0;
						for (local318 = 0; local318 < local25; local318++) {
							local264 += local250.method2140();
							if (local31 == null) {
								local320 = local318;
							} else {
								local320 = local31[local318];
							}
							if (arg2 == local320) {
								local432 += local264;
								local258 = local320;
							}
						}
					}
					if (local432 == 0) {
						return true;
					}
					@Pc(498) byte[] local498 = new byte[local432];
					local432 = 0;
					local250.anInt2219 = local230;
					local318 = 0;
					for (local320 = 0; local320 < local237; local320++) {
						local324 = 0;
						for (local326 = 0; local326 < local25; local326++) {
							local324 += local250.method2140();
							@Pc(525) int local525;
							if (local31 == null) {
								local525 = local326;
							} else {
								local525 = local31[local326];
							}
							if (arg2 == local525) {
								Static374.method2826(local151, local318, local498, local432, local324);
								local432 += local324;
							}
							local318 += local324;
						}
					}
					local59[local258] = local498;
				} else {
					local230 = local151.length;
					@Pc(233) int local233 = local230 - 1;
					local237 = local151[local233] & 0xFF;
					@Pc(245) int local245 = local233 - local237 * 4 * local25;
					local250 = new Class1_Sub7(local151);
					local250.anInt2219 = local245;
					@Pc(256) int[] local256 = new int[local25];
					for (local258 = 0; local258 < local237; local258++) {
						local262 = 0;
						for (local264 = 0; local264 < local25; local264++) {
							local262 += local250.method2140();
							local256[local264] += local262;
						}
					}
					@Pc(294) byte[][] local294 = new byte[local25][];
					for (local264 = 0; local264 < local25; local264++) {
						local294[local264] = new byte[local256[local264]];
						local256[local264] = 0;
					}
					local250.anInt2219 = local245;
					local318 = 0;
					for (local320 = 0; local320 < local237; local320++) {
						local324 = 0;
						for (local326 = 0; local326 < local25; local326++) {
							local324 += local250.method2140();
							Static374.method2826(local151, local318, local294[local326], local256[local326], local324);
							local256[local326] += local324;
							local318 += local324;
						}
					}
					for (local324 = 0; local324 < local25; local324++) {
						if (local31 == null) {
							local326 = local324;
						} else {
							local326 = local31[local324];
						}
						if (this.anInt1229 == 0) {
							local59[local326] = Static313.method5414(local294[local324]);
						} else {
							local59[local326] = local294[local324];
						}
					}
				}
			} else {
				if (local31 == null) {
					local230 = 0;
				} else {
					local230 = local31[0];
				}
				if (this.anInt1229 == 0) {
					local59[local230] = Static313.method5414(local151);
				} else {
					local59[local230] = local151;
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(IIB[I)[B")
	public byte[] method1151(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		if (!this.method1157(arg1, arg0)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg0] == null || this.anObjectArrayArray1[arg0][arg1] == null) {
			@Pc(30) boolean local30 = this.method1150(arg0, arg2, arg1);
			if (!local30) {
				this.method1165(arg0);
				local30 = this.method1150(arg0, arg2, arg1);
				if (!local30) {
					return null;
				}
			}
		}
		@Pc(63) byte[] local63 = Static131.method2686(this.anObjectArrayArray1[arg0][arg1], false);
		if (this.anInt1229 == 1) {
			this.anObjectArrayArray1[arg0][arg1] = null;
			if (this.aClass131_1.anIntArray294[arg0] == 1) {
				this.anObjectArrayArray1[arg0] = null;
			}
		} else if (this.anInt1229 == 2) {
			this.anObjectArrayArray1[arg0] = null;
		}
		return local63;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(IB)Z")
	public boolean method1152(@OriginalArg(0) int arg0) {
		if (!this.method1163(arg0)) {
			return false;
		} else if (this.anObjectArray1[arg0] == null) {
			this.method1165(arg0);
			return this.anObjectArray1[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method1153(@OriginalArg(1) String arg0) {
		if (this.method1173()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(31) int local31 = this.aClass131_1.aClass82_1.method2547(Static298.method5712(local12));
			return this.method1163(local31) ? local31 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ct", name = "b", descriptor = "(IB)Z")
	public boolean method1154(@OriginalArg(0) int arg0) {
		if (!this.method1173()) {
			return false;
		} else if (this.aClass131_1.anIntArray294.length == 1) {
			return this.method1162(arg0, 0);
		} else if (!this.method1163(arg0)) {
			return false;
		} else if (this.aClass131_1.anIntArray294[arg0] == 1) {
			return this.method1162(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ct", name = "c", descriptor = "(IB)[I")
	public int[] method1156(@OriginalArg(0) int arg0) {
		if (!this.method1163(arg0)) {
			return null;
		}
		@Pc(23) int[] local23 = this.aClass131_1.anIntArrayArray32[arg0];
		if (local23 == null) {
			local23 = new int[this.aClass131_1.anIntArray296[arg0]];
			@Pc(34) int local34 = 0;
			while (local23.length > local34) {
				local23[local34] = local34++;
			}
		}
		return local23;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(III)Z")
	private boolean method1157(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method1173()) {
			return false;
		} else if (arg1 >= 0 && arg0 >= 0 && this.aClass131_1.anIntArray294.length > arg1 && arg0 < this.aClass131_1.anIntArray294[arg1]) {
			return true;
		} else if (Static223.aBoolean331) {
			throw new IllegalArgumentException(arg1 + "," + arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(Z)I")
	public int method1158() {
		return this.method1173() ? this.aClass131_1.anIntArray294.length : -1;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public void method1159(@OriginalArg(0) String arg0) {
		if (this.method1173()) {
			@Pc(11) String local11 = arg0.toLowerCase();
			@Pc(20) int local20 = this.aClass131_1.aClass82_1.method2547(Static298.method5712(local11));
			this.method1160(local20);
		}
	}

	@OriginalMember(owner = "client!ct", name = "b", descriptor = "(II)V")
	private void method1160(@OriginalArg(0) int arg0) {
		this.aClass51_1.method1729(arg0);
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(IBI)[B")
	public byte[] method1161(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.method1151(arg1, arg0, null);
	}

	@OriginalMember(owner = "client!ct", name = "b", descriptor = "(III)Z")
	public boolean method1162(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method1157(arg0, arg1)) {
			return false;
		} else if (this.anObjectArrayArray1[arg1] != null && this.anObjectArrayArray1[arg1][arg0] != null) {
			return true;
		} else if (this.anObjectArray1[arg1] == null) {
			this.method1165(arg1);
			return this.anObjectArray1[arg1] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ct", name = "c", descriptor = "(II)Z")
	private boolean method1163(@OriginalArg(0) int arg0) {
		if (!this.method1173()) {
			return false;
		} else if (arg0 >= 0 && this.aClass131_1.anIntArray294.length > arg0 && this.aClass131_1.anIntArray294[arg0] != 0) {
			return true;
		} else if (Static223.aBoolean331) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ct", name = "b", descriptor = "(Z)Z")
	public boolean method1164() {
		if (!this.method1173()) {
			return false;
		}
		@Pc(13) boolean local13 = true;
		for (@Pc(15) int local15 = 0; local15 < this.aClass131_1.anIntArray292.length; local15++) {
			@Pc(23) int local23 = this.aClass131_1.anIntArray292[local15];
			if (this.anObjectArray1[local23] == null) {
				this.method1165(local23);
				if (this.anObjectArray1[local23] == null) {
					local13 = false;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!ct", name = "d", descriptor = "(II)V")
	private void method1165(@OriginalArg(0) int arg0) {
		if (this.aBoolean84) {
			this.anObjectArray1[arg0] = this.aClass51_1.method1732(arg0);
		} else {
			this.anObjectArray1[arg0] = Static313.method5414(this.aClass51_1.method1732(arg0));
		}
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(I)V")
	public void method1166() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.anObjectArrayArray1.length; local10++) {
				this.anObjectArrayArray1[local10] = null;
			}
		}
	}

	@OriginalMember(owner = "client!ct", name = "b", descriptor = "(I)I")
	public int method1169() {
		if (!this.method1173()) {
			throw new IllegalStateException("");
		}
		return this.aClass131_1.anInt3879;
	}

	@OriginalMember(owner = "client!ct", name = "e", descriptor = "(II)I")
	public int method1170(@OriginalArg(0) int arg0) {
		if (this.method1173()) {
			@Pc(24) int local24 = this.aClass131_1.aClass82_1.method2547(arg0);
			return this.method1163(local24) ? local24 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ct", name = "c", descriptor = "(Z)Z")
	private boolean method1173() {
		if (this.aClass131_1 == null) {
			this.aClass131_1 = this.aClass51_1.method1728();
			if (this.aClass131_1 == null) {
				return false;
			}
			this.anObjectArrayArray1 = new Object[this.aClass131_1.anInt3881][];
			this.anObjectArray1 = new Object[this.aClass131_1.anInt3881];
		}
		return true;
	}

	@OriginalMember(owner = "client!ct", name = "d", descriptor = "(B)I")
	public int method1176() {
		if (!this.method1173()) {
			return 0;
		}
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < this.anObjectArray1.length; local26++) {
			if (this.aClass131_1.anIntArray296[local26] > 0) {
				local24 += this.method1177(local26);
				local22 += 100;
			}
		}
		if (local22 == 0) {
			return 100;
		} else {
			return local24 * 100 / local22;
		}
	}

	@OriginalMember(owner = "client!ct", name = "f", descriptor = "(II)I")
	private int method1177(@OriginalArg(1) int arg0) {
		if (this.method1163(arg0)) {
			return this.anObjectArray1[arg0] == null ? this.aClass51_1.method1730(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)Z")
	public boolean method1178(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method1173()) {
			return false;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(15) String local15 = arg1.toLowerCase();
		@Pc(29) int local29 = this.aClass131_1.aClass82_1.method2547(Static298.method5712(local12));
		if (this.method1163(local29)) {
			@Pc(49) int local49 = this.aClass131_1.aClass82Array1[local29].method2547(Static298.method5712(local15));
			return this.method1162(local49, local29);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ct", name = "g", descriptor = "(II)[B")
	public byte[] method1179(@OriginalArg(1) int arg0) {
		if (!this.method1173()) {
			return null;
		} else if (this.aClass131_1.anIntArray294.length == 1) {
			return this.method1161(arg0, 0);
		} else if (!this.method1163(arg0)) {
			return null;
		} else if (this.aClass131_1.anIntArray294[arg0] == 1) {
			return this.method1161(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ct", name = "h", descriptor = "(II)I")
	public int method1180(@OriginalArg(1) int arg0) {
		return this.method1163(arg0) ? this.aClass131_1.anIntArray294[arg0] : 0;
	}

	@OriginalMember(owner = "client!ct", name = "b", descriptor = "(ILjava/lang/String;)Z")
	public boolean method1181(@OriginalArg(1) String arg0) {
		if (this.method1173()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass131_1.aClass82_1.method2547(Static298.method5712(local12));
			return local21 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ct", name = "c", descriptor = "(ILjava/lang/String;)Z")
	public boolean method1182(@OriginalArg(1) String arg0) {
		if (this.method1173()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass131_1.aClass82_1.method2547(Static298.method5712(local12));
			return this.method1152(local21);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ct", name = "b", descriptor = "(BI)V")
	public void method1183(@OriginalArg(1) int arg0) {
		if (this.method1163(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!ct", name = "b", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)[B")
	public byte[] method1184(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method1173()) {
			return null;
		}
		@Pc(17) String local17 = arg0.toLowerCase();
		@Pc(20) String local20 = arg1.toLowerCase();
		@Pc(29) int local29 = this.aClass131_1.aClass82_1.method2547(Static298.method5712(local17));
		if (this.method1163(local29)) {
			@Pc(47) int local47 = this.aClass131_1.aClass82Array1[local29].method2547(Static298.method5712(local20));
			return this.method1161(local47, local29);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public int method1185(@OriginalArg(0) String arg0) {
		if (this.method1173()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass131_1.aClass82_1.method2547(Static298.method5712(local12));
			return this.method1177(local21);
		} else {
			return 0;
		}
	}
}
