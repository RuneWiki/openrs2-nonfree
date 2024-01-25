import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ij")
public final class Class93 {

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray4;

	@OriginalMember(owner = "client!ij", name = "r", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!ij", name = "T", descriptor = "Lclient!jp;")
	private Class105 aClass105_2 = null;

	@OriginalMember(owner = "client!ij", name = "d", descriptor = "Z")
	private final boolean aBoolean205;

	@OriginalMember(owner = "client!ij", name = "L", descriptor = "I")
	public int anInt2609;

	@OriginalMember(owner = "client!ij", name = "l", descriptor = "Lclient!ig;")
	private final Class82 aClass82_1;

	static {
		new Class85("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
	}

	@OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(Lclient!ig;ZI)V")
	public Class93(@OriginalArg(0) Class82 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.aBoolean205 = arg1;
		this.anInt2609 = arg2;
		this.aClass82_1 = arg0;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)I")
	private int method2388(@OriginalArg(1) int arg0) {
		if (this.method2409(arg0)) {
			return this.anObjectArray4[arg0] == null ? this.aClass82_1.method1920(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)Z")
	public boolean method2389() {
		if (!this.method2421()) {
			return false;
		}
		@Pc(11) boolean local11 = true;
		for (@Pc(13) int local13 = 0; local13 < this.aClass105_2.anIntArray305.length; local13++) {
			@Pc(25) int local25 = this.aClass105_2.anIntArray305[local13];
			if (this.anObjectArray4[local25] == null) {
				this.method2398(local25);
				if (this.anObjectArray4[local25] == null) {
					local11 = false;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(III)Z")
	public boolean method2390(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method2399(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray1[arg1] != null && this.anObjectArrayArray1[arg1][arg0] != null) {
			return true;
		} else if (this.anObjectArray4[arg1] == null) {
			this.method2398(arg1);
			return this.anObjectArray4[arg1] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method2391(@OriginalArg(1) String arg0) {
		if (this.method2421()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass105_2.aClass135_1.method3710(Static145.method2664(local12));
			return local21 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(BI)[B")
	public byte[] method2392(@OriginalArg(1) int arg0) {
		if (!this.method2421()) {
			return null;
		} else if (this.aClass105_2.anIntArray303.length == 1) {
			return this.method2410(arg0, 0);
		} else if (!this.method2409(arg0)) {
			return null;
		} else if (this.aClass105_2.anIntArray303[arg0] == 1) {
			return this.method2410(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(ILjava/lang/String;)I")
	public int method2393(@OriginalArg(1) String arg0) {
		if (this.method2421()) {
			@Pc(14) String local14 = arg0.toLowerCase();
			@Pc(23) int local23 = this.aClass105_2.aClass135_1.method3710(Static145.method2664(local14));
			return this.method2409(local23) ? local23 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public int method2394(@OriginalArg(0) String arg0) {
		if (this.method2421()) {
			@Pc(17) String local17 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass105_2.aClass135_1.method3710(Static145.method2664(local17));
			return this.method2388(local26);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(I)I")
	public int method2395() {
		if (!this.method2421()) {
			throw new IllegalStateException("");
		}
		return this.aClass105_2.anInt3036;
	}

	@OriginalMember(owner = "client!ij", name = "c", descriptor = "(I)V")
	public void method2396() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(12) int local12 = 0; local12 < this.anObjectArrayArray1.length; local12++) {
				this.anObjectArrayArray1[local12] = null;
			}
		}
	}

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(II)V")
	private void method2398(@OriginalArg(1) int arg0) {
		if (this.aBoolean205) {
			this.anObjectArray4[arg0] = this.aClass82_1.method1926(arg0);
		} else {
			this.anObjectArray4[arg0] = Static72.method1331(this.aClass82_1.method1926(arg0));
		}
	}

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(III)Z")
	private boolean method2399(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method2421()) {
			return false;
		} else if (arg0 >= 0 && arg1 >= 0 && this.aClass105_2.anIntArray303.length > arg0 && this.aClass105_2.anIntArray303[arg0] > arg1) {
			return true;
		} else if (Static133.aBoolean204) {
			throw new IllegalArgumentException(arg0 + "," + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZZZ)V")
	public void method2401(@OriginalArg(1) boolean arg0) {
		if (!this.method2421()) {
			return;
		}
		this.aClass105_2.aClass135Array1 = null;
		this.aClass105_2.anIntArrayArray54 = null;
		if (arg0) {
			this.aClass105_2.aClass135_1 = null;
			this.aClass105_2.anIntArray304 = null;
		}
	}

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(BI)V")
	private void method2402(@OriginalArg(1) int arg0) {
		this.aClass82_1.method1928(arg0);
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IZ)Z")
	public boolean method2403(@OriginalArg(0) int arg0) {
		if (!this.method2409(arg0)) {
			return false;
		} else if (this.anObjectArray4[arg0] == null) {
			this.method2398(arg0);
			return this.anObjectArray4[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ij", name = "c", descriptor = "(II)V")
	public void method2404(@OriginalArg(1) int arg0) {
		if (this.method2409(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(Ljava/lang/String;B)Z")
	public boolean method2405(@OriginalArg(0) String arg0) {
		if (this.method2421()) {
			@Pc(20) String local20 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass105_2.aClass135_1.method3710(Static145.method2664(local20));
			return this.method2403(local29);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)[B")
	public byte[] method2406(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method2421()) {
			return null;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(15) String local15 = arg1.toLowerCase();
		@Pc(24) int local24 = this.aClass105_2.aClass135_1.method3710(Static145.method2664(local12));
		if (this.method2409(local24)) {
			@Pc(50) int local50 = this.aClass105_2.aClass135Array1[local24].method3710(Static145.method2664(local15));
			return this.method2410(local50, local24);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(BLjava/lang/String;)V")
	public void method2407(@OriginalArg(1) String arg0) {
		if (this.method2421()) {
			@Pc(19) String local19 = arg0.toLowerCase();
			@Pc(28) int local28 = this.aClass105_2.aClass135_1.method3710(Static145.method2664(local19));
			this.method2402(local28);
		}
	}

	@OriginalMember(owner = "client!ij", name = "d", descriptor = "(II)Z")
	private boolean method2409(@OriginalArg(1) int arg0) {
		if (!this.method2421()) {
			return false;
		} else if (arg0 >= 0 && this.aClass105_2.anIntArray303.length > arg0 && this.aClass105_2.anIntArray303[arg0] != 0) {
			return true;
		} else if (Static133.aBoolean204) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ij", name = "c", descriptor = "(III)[B")
	public byte[] method2410(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.method2413(arg1, null, arg0);
	}

	@OriginalMember(owner = "client!ij", name = "e", descriptor = "(I)I")
	public int method2411() {
		if (!this.method2421()) {
			return 0;
		}
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = 0;
		for (@Pc(19) int local19 = 0; local19 < this.anObjectArray4.length; local19++) {
			if (this.aClass105_2.anIntArray302[local19] > 0) {
				local17 += this.method2388(local19);
				local15 += 100;
			}
		}
		if (local15 == 0) {
			return 100;
		} else {
			return local17 * 100 / local15;
		}
	}

	@OriginalMember(owner = "client!ij", name = "f", descriptor = "(I)V")
	public void method2412() {
		if (this.anObjectArray4 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.anObjectArray4.length; local10++) {
				this.anObjectArray4[local10] = null;
			}
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(I[III)[B")
	public byte[] method2413(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		if (!this.method2399(arg0, arg2)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg0] == null || this.anObjectArrayArray1[arg0][arg2] == null) {
			@Pc(30) boolean local30 = this.method2419(arg0, arg1, arg2);
			if (!local30) {
				this.method2398(arg0);
				local30 = this.method2419(arg0, arg1, arg2);
				if (!local30) {
					return null;
				}
			}
		}
		@Pc(57) byte[] local57 = Static150.method2710(this.anObjectArrayArray1[arg0][arg2], false);
		if (this.anInt2609 == 1) {
			this.anObjectArrayArray1[arg0][arg2] = null;
			if (this.aClass105_2.anIntArray303[arg0] == 1) {
				this.anObjectArrayArray1[arg0] = null;
			}
		} else if (this.anInt2609 == 2) {
			this.anObjectArrayArray1[arg0] = null;
		}
		return local57;
	}

	@OriginalMember(owner = "client!ij", name = "c", descriptor = "(BI)Z")
	public boolean method2414(@OriginalArg(1) int arg0) {
		if (!this.method2421()) {
			return false;
		} else if (this.aClass105_2.anIntArray303.length == 1) {
			return this.method2390(arg0, 0);
		} else if (!this.method2409(arg0)) {
			return false;
		} else if (this.aClass105_2.anIntArray303[arg0] == 1) {
			return this.method2390(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ij", name = "d", descriptor = "(BI)I")
	public int method2415(@OriginalArg(1) int arg0) {
		if (this.method2421()) {
			@Pc(24) int local24 = this.aClass105_2.aClass135_1.method3710(arg0);
			return this.method2409(local24) ? local24 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)Z")
	public boolean method2416(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method2421()) {
			return false;
		}
		@Pc(14) String local14 = arg0.toLowerCase();
		@Pc(17) String local17 = arg1.toLowerCase();
		@Pc(26) int local26 = this.aClass105_2.aClass135_1.method3710(Static145.method2664(local14));
		if (this.method2409(local26)) {
			@Pc(46) int local46 = this.aClass105_2.aClass135Array1[local26].method3710(Static145.method2664(local17));
			return this.method2390(local46, local26);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ij", name = "g", descriptor = "(I)I")
	public int method2417() {
		return this.method2421() ? this.aClass105_2.anIntArray303.length : -1;
	}

	@OriginalMember(owner = "client!ij", name = "e", descriptor = "(BI)I")
	public int method2418(@OriginalArg(1) int arg0) {
		return this.method2409(arg0) ? this.aClass105_2.anIntArray303[arg0] : 0;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IB[II)Z")
	private boolean method2419(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		if (!this.method2409(arg0)) {
			return false;
		} else if (this.anObjectArray4[arg0] == null) {
			return false;
		} else {
			@Pc(31) int local31 = this.aClass105_2.anIntArray302[arg0];
			@Pc(37) int[] local37 = this.aClass105_2.anIntArrayArray53[arg0];
			if (this.anObjectArrayArray1[arg0] == null) {
				this.anObjectArrayArray1[arg0] = new Object[this.aClass105_2.anIntArray303[arg0]];
			}
			@Pc(57) Object[] local57 = this.anObjectArrayArray1[arg0];
			@Pc(59) boolean local59 = true;
			for (@Pc(61) int local61 = 0; local61 < local31; local61++) {
				@Pc(66) int local66;
				if (local37 == null) {
					local66 = local61;
				} else {
					local66 = local37[local61];
				}
				if (local57[local66] == null) {
					local59 = false;
					break;
				}
			}
			if (local59) {
				return true;
			}
			@Pc(121) byte[] local121;
			if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
				local121 = Static150.method2710(this.anObjectArray4[arg0], false);
			} else {
				local121 = Static150.method2710(this.anObjectArray4[arg0], true);
				@Pc(135) Class5_Sub12 local135 = new Class5_Sub12(local121);
				local135.method5116(arg1, local135.aByteArray90.length);
			}
			@Pc(147) byte[] local147;
			try {
				local147 = Static175.method2600(local121);
			} catch (@Pc(149) RuntimeException local149) {
				throw Static158.method4814(local149, "T3 - " + (arg1 != null) + "," + arg0 + "," + local121.length + "," + Static213.method3822(local121.length, local121) + "," + Static213.method3822(local121.length - 2, local121) + "," + this.aClass105_2.anIntArray306[arg0] + "," + this.aClass105_2.anInt3036);
			}
			if (this.aBoolean205) {
				this.anObjectArray4[arg0] = null;
			}
			@Pc(226) int local226;
			if (local31 > 1) {
				@Pc(233) int local233;
				@Pc(246) Class5_Sub12 local246;
				@Pc(254) int local254;
				@Pc(257) int local257;
				@Pc(259) int local259;
				@Pc(315) int local315;
				@Pc(317) int local317;
				@Pc(320) int local320;
				@Pc(322) int local322;
				if (this.anInt2609 == 2) {
					local226 = local147.length;
					local226--;
					local233 = local147[local226] & 0xFF;
					local226 -= local233 * 4 * local31;
					local246 = new Class5_Sub12(local147);
					@Pc(427) int local427 = 0;
					local254 = 0;
					local246.anInt5731 = local226;
					for (local257 = 0; local257 < local233; local257++) {
						local259 = 0;
						for (local315 = 0; local315 < local31; local315++) {
							local259 += local246.method5067();
							if (local37 == null) {
								local317 = local315;
							} else {
								local317 = local37[local315];
							}
							if (local317 == arg2) {
								local427 += local259;
								local254 = local317;
							}
						}
					}
					if (local427 == 0) {
						return true;
					}
					@Pc(483) byte[] local483 = new byte[local427];
					local427 = 0;
					local246.anInt5731 = local226;
					local315 = 0;
					for (local317 = 0; local317 < local233; local317++) {
						local320 = 0;
						for (local322 = 0; local322 < local31; local322++) {
							local320 += local246.method5067();
							@Pc(510) int local510;
							if (local37 == null) {
								local510 = local322;
							} else {
								local510 = local37[local322];
							}
							if (local510 == arg2) {
								Static368.method5429(local147, local315, local483, local427, local320);
								local427 += local320;
							}
							local315 += local320;
						}
					}
					local57[local254] = local483;
				} else {
					local226 = local147.length;
					@Pc(229) int local229 = local226 - 1;
					local233 = local147[local229] & 0xFF;
					@Pc(241) int local241 = local229 - local233 * local31 * 4;
					local246 = new Class5_Sub12(local147);
					local246.anInt5731 = local241;
					@Pc(252) int[] local252 = new int[local31];
					for (local254 = 0; local254 < local233; local254++) {
						local257 = 0;
						for (local259 = 0; local259 < local31; local259++) {
							local257 += local246.method5067();
							local252[local259] += local257;
						}
					}
					@Pc(288) byte[][] local288 = new byte[local31][];
					for (local259 = 0; local259 < local31; local259++) {
						local288[local259] = new byte[local252[local259]];
						local252[local259] = 0;
					}
					local246.anInt5731 = local241;
					local315 = 0;
					for (local317 = 0; local317 < local233; local317++) {
						local320 = 0;
						for (local322 = 0; local322 < local31; local322++) {
							local320 += local246.method5067();
							Static368.method5429(local147, local315, local288[local322], local252[local322], local320);
							local315 += local320;
							local252[local322] += local320;
						}
					}
					for (local320 = 0; local320 < local31; local320++) {
						if (local37 == null) {
							local322 = local320;
						} else {
							local322 = local37[local320];
						}
						if (this.anInt2609 == 0) {
							local57[local322] = Static72.method1331(local288[local320]);
						} else {
							local57[local322] = local288[local320];
						}
					}
				}
			} else {
				if (local37 == null) {
					local226 = 0;
				} else {
					local226 = local37[0];
				}
				if (this.anInt2609 == 0) {
					local57[local226] = Static72.method1331(local147);
				} else {
					local57[local226] = local147;
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!ij", name = "e", descriptor = "(II)[I")
	public int[] method2420(@OriginalArg(1) int arg0) {
		if (!this.method2409(arg0)) {
			return null;
		}
		@Pc(22) int[] local22 = this.aClass105_2.anIntArrayArray53[arg0];
		if (local22 == null) {
			local22 = new int[this.aClass105_2.anIntArray302[arg0]];
			@Pc(33) int local33 = 0;
			while (local22.length > local33) {
				local22[local33] = local33++;
			}
		}
		return local22;
	}

	@OriginalMember(owner = "client!ij", name = "h", descriptor = "(I)Z")
	private boolean method2421() {
		if (this.aClass105_2 == null) {
			this.aClass105_2 = this.aClass82_1.method1923();
			if (this.aClass105_2 == null) {
				return false;
			}
			this.anObjectArray4 = new Object[this.aClass105_2.anInt3033];
			this.anObjectArrayArray1 = new Object[this.aClass105_2.anInt3033][];
		}
		return true;
	}
}
