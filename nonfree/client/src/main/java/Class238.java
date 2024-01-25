import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class238 {

	@OriginalMember(owner = "client!nd", name = "m", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray2;

	@OriginalMember(owner = "client!nd", name = "P", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!nd", name = "E", descriptor = "Lclient!rf;")
	private Class300 aClass300_2 = null;

	@OriginalMember(owner = "client!nd", name = "Q", descriptor = "Z")
	private final boolean aBoolean459;

	@OriginalMember(owner = "client!nd", name = "N", descriptor = "Lclient!dw;")
	private final Class87 aClass87_1;

	@OriginalMember(owner = "client!nd", name = "k", descriptor = "I")
	public int anInt6471;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(Lclient!dw;ZI)V")
	public Class238(@OriginalArg(0) Class87 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (arg2 < 0 || arg2 > 2) {
			throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
		}
		this.aBoolean459 = arg1;
		this.aClass87_1 = arg0;
		this.anInt6471 = arg2;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)Z")
	public boolean method5565(@OriginalArg(1) int arg0) {
		if (!this.method5573(arg0)) {
			return false;
		} else if (this.anObjectArray2[arg0] == null) {
			this.method5593(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(BLjava/lang/String;)I")
	public int method5566(@OriginalArg(1) String arg0) {
		if (this.method5589()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass300_2.aClass289_1.method6671(Static228.method3697(local12));
			return this.method5587(local26);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(III)[B")
	public byte[] method5567(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.method5597(arg1, arg0, (int[]) null);
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IB)Z")
	public boolean method5568(@OriginalArg(0) int arg0) {
		if (!this.method5589()) {
			return false;
		} else if (this.aClass300_2.anIntArray566.length == 1) {
			return this.method5571(arg0, 0);
		} else if (!this.method5573(arg0)) {
			return false;
		} else if (this.aClass300_2.anIntArray566[arg0] == 1) {
			return this.method5571(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)I")
	public int method5569() {
		return this.method5589() ? this.aClass300_2.anIntArray566.length : -1;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZLjava/lang/String;)Z")
	public boolean method5570(@OriginalArg(1) String arg0) {
		if (this.method5589()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass300_2.aClass289_1.method6671(Static228.method3697(local12));
			return this.method5565(local26);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(III)Z")
	public boolean method5571(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method5598(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray1[arg1] != null && this.anObjectArrayArray1[arg1][arg0] != null) {
			return true;
		} else if (this.anObjectArray2[arg1] == null) {
			this.method5593(arg1);
			return this.anObjectArray2[arg1] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)[B")
	public byte[] method5572(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method5589()) {
			return null;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(15) String local15 = arg1.toLowerCase();
		@Pc(30) int local30 = this.aClass300_2.aClass289_1.method6671(Static228.method3697(local12));
		if (this.method5573(local30)) {
			@Pc(48) int local48 = this.aClass300_2.aClass289Array1[local30].method6671(Static228.method3697(local15));
			return this.method5567(local48, local30);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(II)Z")
	private boolean method5573(@OriginalArg(0) int arg0) {
		if (!this.method5589()) {
			return false;
		} else if (arg0 >= 0 && arg0 < this.aClass300_2.anIntArray566.length && this.aClass300_2.anIntArray566[arg0] != 0) {
			return true;
		} else if (Static538.aBoolean619) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method5574(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = this.method5575("");
		return local8 == -1 ? this.method5585("", arg0) : this.method5585(arg0, "");
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(BLjava/lang/String;)I")
	public int method5575(@OriginalArg(1) String arg0) {
		if (this.method5589()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass300_2.aClass289_1.method6671(Static228.method3697(local12));
			return this.method5573(local26) ? local26 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(B)V")
	public void method5576() {
		if (this.anObjectArray2 != null) {
			for (@Pc(9) int local9 = 0; local9 < this.anObjectArray2.length; local9++) {
				this.anObjectArray2[local9] = null;
			}
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V")
	public void method5577() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(8) int local8 = 0; local8 < this.anObjectArrayArray1.length; local8++) {
				this.anObjectArrayArray1[local8] = null;
			}
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "([IIII)Z")
	private boolean method5578(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.method5573(arg2)) {
			return false;
		} else if (this.anObjectArray2[arg2] == null) {
			return false;
		} else {
			@Pc(23) int local23 = this.aClass300_2.anIntArray570[arg2];
			@Pc(29) int[] local29 = this.aClass300_2.anIntArrayArray95[arg2];
			if (this.anObjectArrayArray1[arg2] == null) {
				this.anObjectArrayArray1[arg2] = new Object[this.aClass300_2.anIntArray566[arg2]];
			}
			@Pc(49) Object[] local49 = this.anObjectArrayArray1[arg2];
			@Pc(51) boolean local51 = true;
			for (@Pc(61) int local61 = 0; local61 < local23; local61++) {
				@Pc(66) int local66;
				if (local29 == null) {
					local66 = local61;
				} else {
					local66 = local29[local61];
				}
				if (local49[local66] == null) {
					local51 = false;
					break;
				}
			}
			if (local51) {
				return true;
			}
			@Pc(118) byte[] local118;
			if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
				local118 = Static448.method6401(false, this.anObjectArray2[arg2]);
			} else {
				local118 = Static448.method6401(true, this.anObjectArray2[arg2]);
				@Pc(123) Class2_Sub17 local123 = new Class2_Sub17(local118);
				local123.method2850(local123.aByteArray26.length, arg0);
			}
			@Pc(144) byte[] local144;
			try {
				local144 = Static583.method8069(local118);
			} catch (@Pc(146) RuntimeException local146) {
				throw Static245.method4160(local146, "T3 - " + (arg0 != null) + "," + arg2 + "," + local118.length + "," + Static240.method8185(local118.length, local118) + "," + Static240.method8185(local118.length - 2, local118) + "," + this.aClass300_2.anIntArray567[arg2] + "," + this.aClass300_2.anInt7888);
			}
			if (this.aBoolean459) {
				this.anObjectArray2[arg2] = null;
			}
			@Pc(218) int local218;
			if (local23 <= 1) {
				if (local29 == null) {
					local218 = 0;
				} else {
					local218 = local29[0];
				}
				if (this.anInt6471 == 0) {
					local49[local218] = Static325.method4947(local144);
				} else {
					local49[local218] = local144;
				}
			} else {
				@Pc(253) int local253;
				@Pc(266) Class2_Sub17 local266;
				@Pc(274) int local274;
				@Pc(277) int local277;
				@Pc(279) int local279;
				@Pc(327) int local327;
				@Pc(329) int local329;
				@Pc(332) int local332;
				@Pc(334) int local334;
				if (this.anInt6471 == 2) {
					local218 = local144.length;
					local218--;
					local253 = local144[local218] & 0xFF;
					local218 -= local253 * local23 * 4;
					local266 = new Class2_Sub17(local144);
					@Pc(442) int local442 = 0;
					local266.anInt3378 = local218;
					local274 = 0;
					for (local277 = 0; local277 < local253; local277++) {
						local279 = 0;
						for (local327 = 0; local327 < local23; local327++) {
							local279 += local266.method2881();
							if (local29 == null) {
								local329 = local327;
							} else {
								local329 = local29[local327];
							}
							if (arg1 == local329) {
								local274 = local329;
								local442 += local279;
							}
						}
					}
					if (local442 == 0) {
						return true;
					}
					@Pc(502) byte[] local502 = new byte[local442];
					local266.anInt3378 = local218;
					local442 = 0;
					local327 = 0;
					for (local329 = 0; local329 < local253; local329++) {
						local332 = 0;
						for (local334 = 0; local334 < local23; local334++) {
							local332 += local266.method2881();
							@Pc(527) int local527;
							if (local29 == null) {
								local527 = local334;
							} else {
								local527 = local29[local334];
							}
							if (local527 == arg1) {
								Static650.method2274(local144, local327, local502, local442, local332);
								local442 += local332;
							}
							local327 += local332;
						}
					}
					local49[local274] = local502;
				} else {
					local218 = local144.length;
					local218--;
					local253 = local144[local218] & 0xFF;
					local218 -= local23 * 4 * local253;
					local266 = new Class2_Sub17(local144);
					@Pc(269) int[] local269 = new int[local23];
					local266.anInt3378 = local218;
					for (local274 = 0; local274 < local253; local274++) {
						local277 = 0;
						for (local279 = 0; local279 < local23; local279++) {
							local277 += local266.method2881();
							local269[local279] += local277;
						}
					}
					@Pc(304) byte[][] local304 = new byte[local23][];
					for (local279 = 0; local279 < local23; local279++) {
						local304[local279] = new byte[local269[local279]];
						local269[local279] = 0;
					}
					local266.anInt3378 = local218;
					local327 = 0;
					for (local329 = 0; local329 < local253; local329++) {
						local332 = 0;
						for (local334 = 0; local334 < local23; local334++) {
							local332 += local266.method2881();
							Static650.method2274(local144, local327, local304[local334], local269[local334], local332);
							local269[local334] += local332;
							local327 += local332;
						}
					}
					for (local332 = 0; local332 < local23; local332++) {
						if (local29 == null) {
							local334 = local332;
						} else {
							local334 = local29[local332];
						}
						if (this.anInt6471 == 0) {
							local49[local334] = Static325.method4947(local304[local332]);
						} else {
							local49[local334] = local304[local332];
						}
					}
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(BI)[B")
	public byte[] method5580(@OriginalArg(1) int arg0) {
		if (!this.method5589()) {
			return null;
		} else if (this.aClass300_2.anIntArray566.length == 1) {
			return this.method5567(arg0, 0);
		} else if (!this.method5573(arg0)) {
			return null;
		} else if (this.aClass300_2.anIntArray566[arg0] == 1) {
			return this.method5567(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(IB)V")
	public void method5581(@OriginalArg(0) int arg0) {
		if (this.method5573(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z")
	public boolean method5582(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method5589()) {
			return false;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(15) String local15 = arg0.toLowerCase();
		@Pc(26) int local26 = this.aClass300_2.aClass289_1.method6671(Static228.method3697(local12));
		if (local26 < 0) {
			return false;
		} else {
			@Pc(46) int local46 = this.aClass300_2.aClass289Array1[local26].method6671(Static228.method3697(local15));
			return local46 >= 0;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method5583(@OriginalArg(1) String arg0) {
		if (this.method5589()) {
			@Pc(16) String local16 = arg0.toLowerCase();
			@Pc(27) int local27 = this.aClass300_2.aClass289_1.method6671(Static228.method3697(local16));
			return local27 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "(B)I")
	public int method5584() {
		if (!this.method5589()) {
			return 0;
		}
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(27) int local27 = 0; local27 < this.anObjectArray2.length; local27++) {
			if (this.aClass300_2.anIntArray570[local27] > 0) {
				local13 += 100;
				local15 += this.method5587(local27);
			}
		}
		if (local13 == 0) {
			return 100;
		} else {
			return local15 * 100 / local13;
		}
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z")
	private boolean method5585(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method5589()) {
			return false;
		}
		@Pc(18) String local18 = arg1.toLowerCase();
		@Pc(21) String local21 = arg0.toLowerCase();
		@Pc(30) int local30 = this.aClass300_2.aClass289_1.method6671(Static228.method3697(local18));
		if (this.method5573(local30)) {
			@Pc(48) int local48 = this.aClass300_2.aClass289Array1[local30].method6671(Static228.method3697(local21));
			return this.method5571(local48, local30);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)Z")
	public boolean method5586() {
		if (!this.method5589()) {
			return false;
		}
		@Pc(13) boolean local13 = true;
		for (@Pc(15) int local15 = 0; local15 < this.aClass300_2.anIntArray568.length; local15++) {
			@Pc(23) int local23 = this.aClass300_2.anIntArray568[local15];
			if (this.anObjectArray2[local23] == null) {
				this.method5593(local23);
				if (this.anObjectArray2[local23] == null) {
					local13 = false;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "(II)I")
	private int method5587(@OriginalArg(0) int arg0) {
		if (this.method5573(arg0)) {
			return this.anObjectArray2[arg0] == null ? this.aClass87_1.method5174(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "(I)Z")
	private boolean method5589() {
		if (this.aClass300_2 == null) {
			this.aClass300_2 = this.aClass87_1.method5169();
			if (this.aClass300_2 == null) {
				return false;
			}
			this.anObjectArrayArray1 = new Object[this.aClass300_2.anInt7893][];
			this.anObjectArray2 = new Object[this.aClass300_2.anInt7893];
		}
		return true;
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(ILjava/lang/String;)V")
	public void method5590(@OriginalArg(1) String arg0) {
		if (this.method5589()) {
			@Pc(11) String local11 = arg0.toLowerCase();
			@Pc(28) int local28 = this.aClass300_2.aClass289_1.method6671(Static228.method3697(local11));
			this.method5591(local28);
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IZ)V")
	private void method5591(@OriginalArg(0) int arg0) {
		this.aClass87_1.method5172(arg0);
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(BI)I")
	public int method5592(@OriginalArg(1) int arg0) {
		return this.method5573(arg0) ? this.aClass300_2.anIntArray566[arg0] : 0;
	}

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "(IB)V")
	private void method5593(@OriginalArg(0) int arg0) {
		if (this.aBoolean459) {
			this.anObjectArray2[arg0] = this.aClass87_1.method5170(arg0);
		} else {
			this.anObjectArray2[arg0] = Static325.method4947(this.aClass87_1.method5170(arg0));
		}
	}

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "(BI)I")
	public int method5594(@OriginalArg(1) int arg0) {
		if (this.method5589()) {
			@Pc(18) int local18 = this.aClass300_2.aClass289_1.method6671(arg0);
			return this.method5573(local18) ? local18 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "(BI)[I")
	public int[] method5595(@OriginalArg(1) int arg0) {
		if (!this.method5573(arg0)) {
			return null;
		}
		@Pc(24) int[] local24 = this.aClass300_2.anIntArrayArray95[arg0];
		if (local24 == null) {
			local24 = new int[this.aClass300_2.anIntArray570[arg0]];
			@Pc(35) int local35 = 0;
			while (local24.length > local35) {
				local24[local35] = local35++;
			}
		}
		return local24;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZZI)V")
	public void method5596(@OriginalArg(0) boolean arg0) {
		if (!this.method5589()) {
			return;
		}
		if (arg0) {
			this.aClass300_2.aClass289_1 = null;
			this.aClass300_2.anIntArray571 = null;
		}
		this.aClass300_2.anIntArrayArray94 = null;
		this.aClass300_2.aClass289Array1 = null;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZII[I)[B")
	public byte[] method5597(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		if (!this.method5598(arg0, arg1)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg0] == null || this.anObjectArrayArray1[arg0][arg1] == null) {
			@Pc(30) boolean local30 = this.method5578(arg2, arg1, arg0);
			if (!local30) {
				this.method5593(arg0);
				local30 = this.method5578(arg2, arg1, arg0);
				if (!local30) {
					return null;
				}
			}
		}
		@Pc(57) byte[] local57 = Static448.method6401(false, this.anObjectArrayArray1[arg0][arg1]);
		if (this.anInt6471 == 1) {
			this.anObjectArrayArray1[arg0][arg1] = null;
			if (this.aClass300_2.anIntArray566[arg0] == 1) {
				this.anObjectArrayArray1[arg0] = null;
			}
		} else if (this.anInt6471 == 2) {
			this.anObjectArrayArray1[arg0] = null;
		}
		return local57;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIZ)Z")
	private boolean method5598(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method5589()) {
			return false;
		} else if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aClass300_2.anIntArray566.length && arg1 < this.aClass300_2.anIntArray566[arg0]) {
			return true;
		} else if (Static538.aBoolean619) {
			throw new IllegalArgumentException(arg0 + "," + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Z)I")
	public int method5599() {
		if (!this.method5589()) {
			throw new IllegalStateException("");
		}
		return this.aClass300_2.anInt7888;
	}
}
