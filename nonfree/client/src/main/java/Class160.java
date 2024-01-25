import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kda")
public final class Class160 {

	@OriginalMember(owner = "client!kda", name = "H", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray4;

	@OriginalMember(owner = "client!kda", name = "K", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!kda", name = "F", descriptor = "Lclient!uo;")
	private Class293 aClass293_2 = null;

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "I")
	public int anInt4800;

	@OriginalMember(owner = "client!kda", name = "m", descriptor = "Lclient!nh;")
	private final Class87 aClass87_1;

	@OriginalMember(owner = "client!kda", name = "x", descriptor = "Z")
	private final boolean aBoolean290;

	@OriginalMember(owner = "client!kda", name = "<init>", descriptor = "(Lclient!nh;ZI)V")
	public Class160(@OriginalArg(0) Class87 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.anInt4800 = arg2;
		this.aClass87_1 = arg0;
		this.aBoolean290 = arg1;
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(B[III)Z")
	private boolean method4189(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (!this.method4210(arg2)) {
			return false;
		} else if (this.anObjectArray4[arg2] == null) {
			return false;
		} else {
			@Pc(28) int local28 = this.aClass293_2.anIntArray656[arg2];
			@Pc(34) int[] local34 = this.aClass293_2.anIntArrayArray78[arg2];
			if (this.anObjectArrayArray1[arg2] == null) {
				this.anObjectArrayArray1[arg2] = new Object[this.aClass293_2.anIntArray660[arg2]];
			}
			@Pc(54) Object[] local54 = this.anObjectArrayArray1[arg2];
			@Pc(56) boolean local56 = true;
			for (@Pc(58) int local58 = 0; local58 < local28; local58++) {
				@Pc(65) int local65;
				if (local34 == null) {
					local65 = local58;
				} else {
					local65 = local34[local58];
				}
				if (local54[local65] == null) {
					local56 = false;
					break;
				}
			}
			if (local56) {
				return true;
			}
			@Pc(114) byte[] local114;
			if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
				local114 = Static390.method5877(this.anObjectArray4[arg2], false);
			} else {
				local114 = Static390.method5877(this.anObjectArray4[arg2], true);
				@Pc(119) Class1_Sub13 local119 = new Class1_Sub13(local114);
				local119.method3054(arg0, local119.aByteArray45.length);
			}
			@Pc(140) byte[] local140;
			try {
				local140 = Static74.method1949(local114);
			} catch (@Pc(142) RuntimeException local142) {
				throw Static214.method3847(local142, "T3 - " + (arg0 != null) + "," + arg2 + "," + local114.length + "," + Static402.method7867(local114, local114.length) + "," + Static402.method7867(local114, local114.length - 2) + "," + this.aClass293_2.anIntArray659[arg2] + "," + this.aClass293_2.anInt8404);
			}
			if (this.aBoolean290) {
				this.anObjectArray4[arg2] = null;
			}
			@Pc(214) int local214;
			if (local28 <= 1) {
				if (local34 == null) {
					local214 = 0;
				} else {
					local214 = local34[0];
				}
				if (this.anInt4800 == 0) {
					local54[local214] = Static155.method3121(local140);
				} else {
					local54[local214] = local140;
				}
			} else {
				@Pc(247) int local247;
				@Pc(260) Class1_Sub13 local260;
				@Pc(264) int local264;
				@Pc(269) int local269;
				@Pc(272) int local272;
				@Pc(274) int local274;
				@Pc(289) int local289;
				@Pc(332) int local332;
				@Pc(334) int local334;
				if (this.anInt4800 == 2) {
					local214 = local140.length;
					local214--;
					local247 = local140[local214] & 0xFF;
					local214 -= local247 * 4 * local28;
					local260 = new Class1_Sub13(local140);
					@Pc(262) int local262 = 0;
					local264 = 0;
					local260.anInt3400 = local214;
					for (local269 = 0; local269 < local247; local269++) {
						local272 = 0;
						for (local274 = 0; local274 < local28; local274++) {
							local272 += local260.method3037();
							if (local34 == null) {
								local289 = local274;
							} else {
								local289 = local34[local274];
							}
							if (local289 == arg1) {
								local264 = local289;
								local262 += local272;
							}
						}
					}
					if (local262 == 0) {
						return true;
					}
					@Pc(320) byte[] local320 = new byte[local262];
					local262 = 0;
					local260.anInt3400 = local214;
					local274 = 0;
					for (local289 = 0; local289 < local247; local289++) {
						local332 = 0;
						for (local334 = 0; local334 < local28; local334++) {
							local332 += local260.method3037();
							@Pc(347) int local347;
							if (local34 == null) {
								local347 = local334;
							} else {
								local347 = local34[local334];
							}
							if (local347 == arg1) {
								Static555.method5095(local140, local274, local320, local262, local332);
								local262 += local332;
							}
							local274 += local332;
						}
					}
					local54[local264] = local320;
				} else {
					local214 = local140.length;
					local214--;
					local247 = local140[local214] & 0xFF;
					local214 -= local28 * 4 * local247;
					local260 = new Class1_Sub13(local140);
					@Pc(414) int[] local414 = new int[local28];
					local260.anInt3400 = local214;
					for (local264 = 0; local264 < local247; local264++) {
						local269 = 0;
						for (local272 = 0; local272 < local28; local272++) {
							local269 += local260.method3037();
							local414[local272] += local269;
						}
					}
					@Pc(453) byte[][] local453 = new byte[local28][];
					for (local272 = 0; local272 < local28; local272++) {
						local453[local272] = new byte[local414[local272]];
						local414[local272] = 0;
					}
					local260.anInt3400 = local214;
					local274 = 0;
					for (local289 = 0; local289 < local247; local289++) {
						local332 = 0;
						for (local334 = 0; local334 < local28; local334++) {
							local332 += local260.method3037();
							Static555.method5095(local140, local274, local453[local334], local414[local334], local332);
							local414[local334] += local332;
							local274 += local332;
						}
					}
					for (local332 = 0; local332 < local28; local332++) {
						if (local34 == null) {
							local334 = local332;
						} else {
							local334 = local34[local332];
						}
						if (this.anInt4800 == 0) {
							local54[local334] = Static155.method3121(local453[local332]);
						} else {
							local54[local334] = local453[local332];
						}
					}
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(III)Z")
	private boolean method4190(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method4218()) {
			return false;
		} else if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aClass293_2.anIntArray660.length && this.aClass293_2.anIntArray660[arg0] > arg1) {
			return true;
		} else if (Static355.aBoolean133) {
			throw new IllegalArgumentException(arg0 + "," + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(B)I")
	public int method4192() {
		if (!this.method4218()) {
			return 0;
		}
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anObjectArray4.length; local23++) {
			if (this.aClass293_2.anIntArray656[local23] > 0) {
				local13 += this.method4193(local23);
				local11 += 100;
			}
		}
		if (local11 == 0) {
			return 100;
		} else {
			return local13 * 100 / local11;
		}
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(IB)I")
	private int method4193(@OriginalArg(0) int arg0) {
		if (this.method4210(arg0)) {
			return this.anObjectArray4[arg0] == null ? this.aClass87_1.method2841(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method4194(@OriginalArg(1) String arg0) {
		if (this.method4218()) {
			@Pc(19) String local19 = arg0.toLowerCase();
			@Pc(30) int local30 = this.aClass293_2.aClass267_1.method6415(Static280.method4751(local19));
			return this.method4193(local30);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(II)V")
	private void method4197(@OriginalArg(0) int arg0) {
		this.aClass87_1.method2838(arg0);
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(IIZ)[B")
	public byte[] method4198(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method4224(null, arg1, arg0);
	}

	@OriginalMember(owner = "client!kda", name = "b", descriptor = "(ILjava/lang/String;)I")
	public int method4199(@OriginalArg(1) String arg0) {
		if (this.method4218()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass293_2.aClass267_1.method6415(Static280.method4751(local12));
			return this.method4210(local21) ? local21 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!kda", name = "b", descriptor = "(B)Z")
	public boolean method4200() {
		if (!this.method4218()) {
			return false;
		}
		@Pc(11) boolean local11 = true;
		for (@Pc(13) int local13 = 0; local13 < this.aClass293_2.anIntArray657.length; local13++) {
			@Pc(26) int local26 = this.aClass293_2.anIntArray657[local13];
			if (this.anObjectArray4[local26] == null) {
				this.method4211(local26);
				if (this.anObjectArray4[local26] == null) {
					local11 = false;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!kda", name = "b", descriptor = "(Z)V")
	public void method4201() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(8) int local8 = 0; local8 < this.anObjectArrayArray1.length; local8++) {
				this.anObjectArrayArray1[local8] = null;
			}
		}
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public boolean method4202(@OriginalArg(0) String arg0) {
		if (this.method4218()) {
			@Pc(20) String local20 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass293_2.aClass267_1.method6415(Static280.method4751(local20));
			return local29 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!kda", name = "b", descriptor = "(II)I")
	public int method4203(@OriginalArg(1) int arg0) {
		if (this.method4218()) {
			@Pc(24) int local24 = this.aClass293_2.aClass267_1.method6415(arg0);
			return this.method4210(local24) ? local24 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!kda", name = "b", descriptor = "(I)V")
	public void method4204() {
		if (this.anObjectArray4 != null) {
			for (@Pc(17) int local17 = 0; local17 < this.anObjectArray4.length; local17++) {
				this.anObjectArray4[local17] = null;
			}
		}
	}

	@OriginalMember(owner = "client!kda", name = "c", descriptor = "(I)I")
	public int method4206() {
		return this.method4218() ? this.aClass293_2.anIntArray660.length : -1;
	}

	@OriginalMember(owner = "client!kda", name = "c", descriptor = "(II)I")
	public int method4207(@OriginalArg(1) int arg0) {
		return this.method4210(arg0) ? this.aClass293_2.anIntArray660[arg0] : 0;
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(IZ)Z")
	public boolean method4208(@OriginalArg(0) int arg0) {
		if (!this.method4210(arg0)) {
			return false;
		} else if (this.anObjectArray4[arg0] == null) {
			this.method4211(arg0);
			return this.anObjectArray4[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)Z")
	public boolean method4209(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method4218()) {
			return false;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(15) String local15 = arg0.toLowerCase();
		@Pc(26) int local26 = this.aClass293_2.aClass267_1.method6415(Static280.method4751(local12));
		if (local26 < 0) {
			return false;
		} else {
			@Pc(50) int local50 = this.aClass293_2.aClass267Array1[local26].method6415(Static280.method4751(local15));
			return local50 >= 0;
		}
	}

	@OriginalMember(owner = "client!kda", name = "d", descriptor = "(II)Z")
	private boolean method4210(@OriginalArg(1) int arg0) {
		if (!this.method4218()) {
			return false;
		} else if (arg0 >= 0 && arg0 < this.aClass293_2.anIntArray660.length && this.aClass293_2.anIntArray660[arg0] != 0) {
			return true;
		} else if (Static355.aBoolean133) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!kda", name = "e", descriptor = "(II)V")
	private void method4211(@OriginalArg(0) int arg0) {
		if (this.aBoolean290) {
			this.anObjectArray4[arg0] = this.aClass87_1.method2836(arg0);
		} else {
			this.anObjectArray4[arg0] = Static155.method3121(this.aClass87_1.method2836(arg0));
		}
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(IIB)Z")
	public boolean method4212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method4190(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray1[arg1] != null && this.anObjectArrayArray1[arg1][arg0] != null) {
			return true;
		} else if (this.anObjectArray4[arg1] == null) {
			this.method4211(arg1);
			return this.anObjectArray4[arg1] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(ZI)Z")
	public boolean method4213(@OriginalArg(1) int arg0) {
		if (!this.method4218()) {
			return false;
		} else if (this.aClass293_2.anIntArray660.length == 1) {
			return this.method4212(arg0, 0);
		} else if (!this.method4210(arg0)) {
			return false;
		} else if (this.aClass293_2.anIntArray660[arg0] == 1) {
			return this.method4212(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(IZZ)V")
	public void method4214(@OriginalArg(1) boolean arg0) {
		if (!this.method4218()) {
			return;
		}
		if (arg0) {
			this.aClass293_2.aClass267_1 = null;
			this.aClass293_2.anIntArray655 = null;
		}
		this.aClass293_2.aClass267Array1 = null;
		this.aClass293_2.anIntArrayArray79 = null;
	}

	@OriginalMember(owner = "client!kda", name = "d", descriptor = "(I)I")
	public int method4215() {
		if (!this.method4218()) {
			throw new IllegalStateException("");
		}
		return this.aClass293_2.anInt8404;
	}

	@OriginalMember(owner = "client!kda", name = "f", descriptor = "(II)[B")
	public byte[] method4216(@OriginalArg(1) int arg0) {
		if (!this.method4218()) {
			return null;
		} else if (this.aClass293_2.anIntArray660.length == 1) {
			return this.method4198(arg0, 0);
		} else if (!this.method4210(arg0)) {
			return null;
		} else if (this.aClass293_2.anIntArray660[arg0] == 1) {
			return this.method4198(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kda", name = "e", descriptor = "(I)Z")
	private boolean method4218() {
		if (this.aClass293_2 == null) {
			this.aClass293_2 = this.aClass87_1.method2837();
			if (this.aClass293_2 == null) {
				return false;
			}
			this.anObjectArrayArray1 = new Object[this.aClass293_2.anInt8408][];
			this.anObjectArray4 = new Object[this.aClass293_2.anInt8408];
		}
		return true;
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public boolean method4219(@OriginalArg(1) String arg0) {
		if (this.method4218()) {
			@Pc(20) String local20 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass293_2.aClass267_1.method6415(Static280.method4751(local20));
			return this.method4208(local29);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z")
	public boolean method4221(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method4218()) {
			return false;
		}
		@Pc(20) String local20 = arg1.toLowerCase();
		@Pc(23) String local23 = arg0.toLowerCase();
		@Pc(32) int local32 = this.aClass293_2.aClass267_1.method6415(Static280.method4751(local20));
		if (this.method4210(local32)) {
			@Pc(50) int local50 = this.aClass293_2.aClass267Array1[local32].method6415(Static280.method4751(local23));
			return this.method4212(local50, local32);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!kda", name = "b", descriptor = "(Ljava/lang/String;ILjava/lang/String;)[B")
	public byte[] method4222(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method4218()) {
			return null;
		}
		@Pc(14) String local14 = arg1.toLowerCase();
		@Pc(17) String local17 = arg0.toLowerCase();
		@Pc(28) int local28 = this.aClass293_2.aClass267_1.method6415(Static280.method4751(local14));
		if (this.method4210(local28)) {
			@Pc(46) int local46 = this.aClass293_2.aClass267Array1[local28].method6415(Static280.method4751(local17));
			return this.method4198(local46, local28);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "([IIIB)[B")
	public byte[] method4224(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.method4190(arg1, arg2)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg1] == null || this.anObjectArrayArray1[arg1][arg2] == null) {
			@Pc(30) boolean local30 = this.method4189(arg0, arg2, arg1);
			if (!local30) {
				this.method4211(arg1);
				local30 = this.method4189(arg0, arg2, arg1);
				if (!local30) {
					return null;
				}
			}
		}
		@Pc(65) byte[] local65 = Static390.method5877(this.anObjectArrayArray1[arg1][arg2], false);
		if (this.anInt4800 == 1) {
			this.anObjectArrayArray1[arg1][arg2] = null;
			if (this.aClass293_2.anIntArray660[arg1] == 1) {
				this.anObjectArrayArray1[arg1] = null;
			}
		} else if (this.anInt4800 == 2) {
			this.anObjectArrayArray1[arg1] = null;
		}
		return local65;
	}

	@OriginalMember(owner = "client!kda", name = "b", descriptor = "(BI)V")
	public void method4225(@OriginalArg(1) int arg0) {
		if (this.method4210(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!kda", name = "g", descriptor = "(II)[I")
	public int[] method4226(@OriginalArg(1) int arg0) {
		if (!this.method4210(arg0)) {
			return null;
		}
		@Pc(24) int[] local24 = this.aClass293_2.anIntArrayArray78[arg0];
		if (local24 == null) {
			local24 = new int[this.aClass293_2.anIntArray656[arg0]];
			@Pc(35) int local35 = 0;
			while (local24.length > local35) {
				local24[local35] = local35++;
			}
		}
		return local24;
	}

	@OriginalMember(owner = "client!kda", name = "b", descriptor = "(BLjava/lang/String;)V")
	public void method4227(@OriginalArg(1) String arg0) {
		if (this.method4218()) {
			@Pc(17) String local17 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass293_2.aClass267_1.method6415(Static280.method4751(local17));
			this.method4197(local26);
		}
	}
}
