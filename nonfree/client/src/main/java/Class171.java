import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kr")
public final class Class171 {

	@OriginalMember(owner = "client!kr", name = "d", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray35;

	@OriginalMember(owner = "client!kr", name = "K", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!kr", name = "D", descriptor = "Lclient!tb;")
	private Class277 aClass277_1 = null;

	@OriginalMember(owner = "client!kr", name = "v", descriptor = "Lclient!i;")
	private final Class131 aClass131_1;

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "I")
	public int anInt4998;

	@OriginalMember(owner = "client!kr", name = "m", descriptor = "Z")
	private final boolean aBoolean352;

	@OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(Lclient!i;ZI)V")
	public Class171(@OriginalArg(0) Class131 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.aClass131_1 = arg0;
		this.anInt4998 = arg2;
		this.aBoolean352 = arg1;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(BI)Z")
	public boolean method4327(@OriginalArg(1) int arg0) {
		if (!this.method4354()) {
			return false;
		} else if (this.aClass277_1.anIntArray730.length == 1) {
			return this.method4336(arg0, 0);
		} else if (!this.method4359(arg0)) {
			return false;
		} else if (this.aClass277_1.anIntArray730[arg0] == 1) {
			return this.method4336(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public int method4329(@OriginalArg(0) String arg0) {
		if (this.method4354()) {
			@Pc(18) String local18 = arg0.toLowerCase();
			@Pc(27) int local27 = this.aClass277_1.aClass179_1.method4416(Static468.method6559(local18));
			return this.method4341(local27);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)[B")
	public byte[] method4330(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method4354()) {
			return null;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(15) String local15 = arg0.toLowerCase();
		@Pc(24) int local24 = this.aClass277_1.aClass179_1.method4416(Static468.method6559(local12));
		if (this.method4359(local24)) {
			@Pc(44) int local44 = this.aClass277_1.aClass179Array1[local24].method4416(Static468.method6559(local15));
			return this.method4339(local24, local44);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(B)I")
	public int method4331() {
		return this.method4354() ? this.aClass277_1.anIntArray730.length : -1;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "([IIII)Z")
	private boolean method4333(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (!this.method4359(arg2)) {
			return false;
		} else if (this.anObjectArray35[arg2] == null) {
			return false;
		} else {
			@Pc(23) int local23 = this.aClass277_1.anIntArray732[arg2];
			@Pc(34) int[] local34 = this.aClass277_1.anIntArrayArray101[arg2];
			if (this.anObjectArrayArray1[arg2] == null) {
				this.anObjectArrayArray1[arg2] = new Object[this.aClass277_1.anIntArray730[arg2]];
			}
			@Pc(54) Object[] local54 = this.anObjectArrayArray1[arg2];
			@Pc(56) boolean local56 = true;
			for (@Pc(58) int local58 = 0; local58 < local23; local58++) {
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
			@Pc(115) byte[] local115;
			if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
				local115 = Static236.method4130(this.anObjectArray35[arg2], false);
			} else {
				local115 = Static236.method4130(this.anObjectArray35[arg2], true);
				@Pc(120) Class1_Sub6 local120 = new Class1_Sub6(local115);
				local120.method3953(arg0, local120.aByteArray66.length);
			}
			@Pc(141) byte[] local141;
			try {
				local141 = Static404.method6675(local115);
			} catch (@Pc(143) RuntimeException local143) {
				throw Static512.method7100(local143, "T3 - " + (arg0 != null) + "," + arg2 + "," + local115.length + "," + Static31.method746(local115, local115.length) + "," + Static31.method746(local115, local115.length - 2) + "," + this.aClass277_1.anIntArray728[arg2] + "," + this.aClass277_1.anInt7781);
			}
			if (this.aBoolean352) {
				this.anObjectArray35[arg2] = null;
			}
			@Pc(215) int local215;
			if (local23 <= 1) {
				if (local34 == null) {
					local215 = 0;
				} else {
					local215 = local34[0];
				}
				if (this.anInt4998 == 0) {
					local54[local215] = Static489.method6710(local141);
				} else {
					local54[local215] = local141;
				}
			} else {
				@Pc(250) int local250;
				@Pc(263) Class1_Sub6 local263;
				@Pc(270) int local270;
				@Pc(272) int local272;
				@Pc(275) int local275;
				@Pc(277) int local277;
				@Pc(292) int local292;
				@Pc(334) int local334;
				@Pc(336) int local336;
				if (this.anInt4998 == 2) {
					local215 = local141.length;
					local215--;
					local250 = local141[local215] & 0xFF;
					local215 -= local23 * local250 * 4;
					local263 = new Class1_Sub6(local141);
					@Pc(265) int local265 = 0;
					local263.anInt4555 = local215;
					local270 = 0;
					for (local272 = 0; local272 < local250; local272++) {
						local275 = 0;
						for (local277 = 0; local277 < local23; local277++) {
							local275 += local263.method3925();
							if (local34 == null) {
								local292 = local277;
							} else {
								local292 = local34[local277];
							}
							if (local292 == arg1) {
								local265 += local275;
								local270 = local292;
							}
						}
					}
					if (local265 == 0) {
						return true;
					}
					@Pc(322) byte[] local322 = new byte[local265];
					local265 = 0;
					local263.anInt4555 = local215;
					local277 = 0;
					for (local292 = 0; local292 < local250; local292++) {
						local334 = 0;
						for (local336 = 0; local336 < local23; local336++) {
							local334 += local263.method3925();
							@Pc(349) int local349;
							if (local34 == null) {
								local349 = local336;
							} else {
								local349 = local34[local336];
							}
							if (arg1 == local349) {
								Static551.method3488(local141, local277, local322, local265, local334);
								local265 += local334;
							}
							local277 += local334;
						}
					}
					local54[local270] = local322;
				} else {
					local215 = local141.length;
					local215--;
					local250 = local141[local215] & 0xFF;
					local215 -= local23 * local250 * 4;
					local263 = new Class1_Sub6(local141);
					@Pc(412) int[] local412 = new int[local23];
					local263.anInt4555 = local215;
					for (local270 = 0; local270 < local250; local270++) {
						local272 = 0;
						for (local275 = 0; local275 < local23; local275++) {
							local272 += local263.method3925();
							local412[local275] += local272;
						}
					}
					@Pc(453) byte[][] local453 = new byte[local23][];
					for (local275 = 0; local275 < local23; local275++) {
						local453[local275] = new byte[local412[local275]];
						local412[local275] = 0;
					}
					local263.anInt4555 = local215;
					local277 = 0;
					for (local292 = 0; local292 < local250; local292++) {
						local334 = 0;
						for (local336 = 0; local336 < local23; local336++) {
							local334 += local263.method3925();
							Static551.method3488(local141, local277, local453[local336], local412[local336], local334);
							local412[local336] += local334;
							local277 += local334;
						}
					}
					for (local334 = 0; local334 < local23; local334++) {
						if (local34 == null) {
							local336 = local334;
						} else {
							local336 = local34[local334];
						}
						if (this.anInt4998 == 0) {
							local54[local336] = Static489.method6710(local453[local334]);
						} else {
							local54[local336] = local453[local334];
						}
					}
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "(Z)I")
	public int method4335() {
		if (!this.method4354()) {
			return 0;
		}
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anObjectArray35.length; local17++) {
			if (this.aClass277_1.anIntArray732[local17] > 0) {
				local15 += this.method4341(local17);
				local13 += 100;
			}
		}
		if (local13 == 0) {
			return 100;
		} else {
			return local15 * 100 / local13;
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(III)Z")
	public boolean method4336(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method4360(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray1[arg1] != null && this.anObjectArrayArray1[arg1][arg0] != null) {
			return true;
		} else if (this.anObjectArray35[arg1] == null) {
			this.method4348(arg1);
			return this.anObjectArray35[arg1] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(ZZI)V")
	public void method4337(@OriginalArg(1) boolean arg0) {
		if (!this.method4354()) {
			return;
		}
		if (arg0) {
			this.aClass277_1.aClass179_1 = null;
			this.aClass277_1.anIntArray731 = null;
		}
		this.aClass277_1.anIntArrayArray100 = null;
		this.aClass277_1.aClass179Array1 = null;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(BLjava/lang/String;)I")
	public int method4338(@OriginalArg(1) String arg0) {
		if (this.method4354()) {
			@Pc(20) String local20 = arg0.toLowerCase();
			@Pc(31) int local31 = this.aClass277_1.aClass179_1.method4416(Static468.method6559(local20));
			return this.method4359(local31) ? local31 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(ZII)[B")
	public byte[] method4339(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.method4356(arg1, arg0, null);
	}

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "(BI)Z")
	public boolean method4340(@OriginalArg(1) int arg0) {
		if (!this.method4359(arg0)) {
			return false;
		} else if (this.anObjectArray35[arg0] == null) {
			this.method4348(arg0);
			return this.anObjectArray35[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!kr", name = "c", descriptor = "(BI)I")
	private int method4341(@OriginalArg(1) int arg0) {
		if (this.method4359(arg0)) {
			return this.anObjectArray35[arg0] == null ? this.aClass131_1.method7004(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(II)I")
	public int method4342(@OriginalArg(0) int arg0) {
		if (this.method4354()) {
			@Pc(20) int local20 = this.aClass277_1.aClass179_1.method4416(arg0);
			return this.method4359(local20) ? local20 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "(II)V")
	public void method4343(@OriginalArg(0) int arg0) {
		if (this.method4359(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)Z")
	public boolean method4344() {
		if (!this.method4354()) {
			return false;
		}
		@Pc(11) boolean local11 = true;
		for (@Pc(13) int local13 = 0; local13 < this.aClass277_1.anIntArray727.length; local13++) {
			@Pc(24) int local24 = this.aClass277_1.anIntArray727[local13];
			if (this.anObjectArray35[local24] == null) {
				this.method4348(local24);
				if (this.anObjectArray35[local24] == null) {
					local11 = false;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z")
	public boolean method4345(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method4354()) {
			return false;
		}
		@Pc(20) String local20 = arg0.toLowerCase();
		@Pc(23) String local23 = arg1.toLowerCase();
		@Pc(32) int local32 = this.aClass277_1.aClass179_1.method4416(Static468.method6559(local20));
		if (this.method4359(local32)) {
			@Pc(50) int local50 = this.aClass277_1.aClass179Array1[local32].method4416(Static468.method6559(local23));
			return this.method4336(local50, local32);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(ILjava/lang/String;)V")
	public void method4346(@OriginalArg(1) String arg0) {
		if (this.method4354()) {
			@Pc(13) String local13 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass277_1.aClass179_1.method4416(Static468.method6559(local13));
			this.method4352(local29);
		}
	}

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "(I)V")
	public void method4347() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(18) int local18 = 0; local18 < this.anObjectArrayArray1.length; local18++) {
				this.anObjectArrayArray1[local18] = null;
			}
		}
	}

	@OriginalMember(owner = "client!kr", name = "c", descriptor = "(II)V")
	private void method4348(@OriginalArg(1) int arg0) {
		if (this.aBoolean352) {
			this.anObjectArray35[arg0] = this.aClass131_1.method7008(arg0);
		} else {
			this.anObjectArray35[arg0] = Static489.method6710(this.aClass131_1.method7008(arg0));
		}
	}

	@OriginalMember(owner = "client!kr", name = "d", descriptor = "(II)I")
	public int method4349(@OriginalArg(1) int arg0) {
		return this.method4359(arg0) ? this.aClass277_1.anIntArray730[arg0] : 0;
	}

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "(BLjava/lang/String;)Z")
	public boolean method4350(@OriginalArg(1) String arg0) {
		if (this.method4354()) {
			@Pc(19) String local19 = arg0.toLowerCase();
			@Pc(30) int local30 = this.aClass277_1.aClass179_1.method4416(Static468.method6559(local19));
			return local30 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!kr", name = "c", descriptor = "(B)I")
	public int method4351() {
		if (!this.method4354()) {
			throw new IllegalStateException("");
		}
		return this.aClass277_1.anInt7781;
	}

	@OriginalMember(owner = "client!kr", name = "e", descriptor = "(II)V")
	private void method4352(@OriginalArg(1) int arg0) {
		this.aClass131_1.method7006(arg0);
	}

	@OriginalMember(owner = "client!kr", name = "f", descriptor = "(II)[I")
	public int[] method4353(@OriginalArg(1) int arg0) {
		if (!this.method4359(arg0)) {
			return null;
		}
		@Pc(24) int[] local24 = this.aClass277_1.anIntArrayArray101[arg0];
		if (local24 == null) {
			local24 = new int[this.aClass277_1.anIntArray732[arg0]];
			@Pc(35) int local35 = 0;
			while (local35 < local24.length) {
				local24[local35] = local35++;
			}
		}
		return local24;
	}

	@OriginalMember(owner = "client!kr", name = "c", descriptor = "(I)Z")
	private boolean method4354() {
		if (this.aClass277_1 == null) {
			this.aClass277_1 = this.aClass131_1.method7010();
			if (this.aClass277_1 == null) {
				return false;
			}
			this.anObjectArray35 = new Object[this.aClass277_1.anInt7782];
			this.anObjectArrayArray1 = new Object[this.aClass277_1.anInt7782][];
		}
		return true;
	}

	@OriginalMember(owner = "client!kr", name = "d", descriptor = "(I)V")
	public void method4355() {
		if (this.anObjectArray35 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anObjectArray35.length; local6++) {
				this.anObjectArray35[local6] = null;
			}
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(IBI[I)[B")
	public byte[] method4356(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		if (!this.method4360(arg1, arg0)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg1] == null || this.anObjectArrayArray1[arg1][arg0] == null) {
			@Pc(30) boolean local30 = this.method4333(arg2, arg0, arg1);
			if (!local30) {
				this.method4348(arg1);
				local30 = this.method4333(arg2, arg0, arg1);
				if (!local30) {
					return null;
				}
			}
		}
		@Pc(63) byte[] local63 = Static236.method4130(this.anObjectArrayArray1[arg1][arg0], false);
		if (this.anInt4998 == 1) {
			this.anObjectArrayArray1[arg1][arg0] = null;
			if (this.aClass277_1.anIntArray730[arg1] == 1) {
				this.anObjectArrayArray1[arg1] = null;
			}
		} else if (this.anInt4998 == 2) {
			this.anObjectArrayArray1[arg1] = null;
		}
		return local63;
	}

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "(Ljava/lang/String;Z)Z")
	public boolean method4357(@OriginalArg(0) String arg0) {
		if (this.method4354()) {
			@Pc(17) String local17 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass277_1.aClass179_1.method4416(Static468.method6559(local17));
			return this.method4340(local26);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;)Z")
	public boolean method4358(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method4354()) {
			return false;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(15) String local15 = arg1.toLowerCase();
		@Pc(24) int local24 = this.aClass277_1.aClass179_1.method4416(Static468.method6559(local12));
		if (local24 < 0) {
			return false;
		} else {
			@Pc(42) int local42 = this.aClass277_1.aClass179Array1[local24].method4416(Static468.method6559(local15));
			return local42 >= 0;
		}
	}

	@OriginalMember(owner = "client!kr", name = "g", descriptor = "(II)Z")
	private boolean method4359(@OriginalArg(0) int arg0) {
		if (!this.method4354()) {
			return false;
		} else if (arg0 >= 0 && arg0 < this.aClass277_1.anIntArray730.length && this.aClass277_1.anIntArray730[arg0] != 0) {
			return true;
		} else if (Static119.aBoolean150) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(IIB)Z")
	private boolean method4360(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method4354()) {
			return false;
		} else if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aClass277_1.anIntArray730.length && arg1 < this.aClass277_1.anIntArray730[arg0]) {
			return true;
		} else if (Static119.aBoolean150) {
			throw new IllegalArgumentException(arg0 + "," + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!kr", name = "h", descriptor = "(II)[B")
	public byte[] method4361(@OriginalArg(1) int arg0) {
		if (!this.method4354()) {
			return null;
		} else if (this.aClass277_1.anIntArray730.length == 1) {
			return this.method4339(0, arg0);
		} else if (!this.method4359(arg0)) {
			return null;
		} else if (this.aClass277_1.anIntArray730[arg0] == 1) {
			return this.method4339(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}
}
