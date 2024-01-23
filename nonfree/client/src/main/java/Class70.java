import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public abstract class Class70 {

	@OriginalMember(owner = "client!mb", name = "n", descriptor = "[I")
	public static int[] anIntArray336 = new int[99];

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "[I")
	private int[] anIntArray335;

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "[Ljava/lang/Object;")
	protected Object[] anObjectArray33;

	@OriginalMember(owner = "client!mb", name = "q", descriptor = "Lclient!g;")
	private Class44 aClass44_2;

	@OriginalMember(owner = "client!mb", name = "t", descriptor = "[I")
	protected int[] anIntArray337;

	@OriginalMember(owner = "client!mb", name = "v", descriptor = "[[I")
	private int[][] anIntArrayArray34;

	@OriginalMember(owner = "client!mb", name = "w", descriptor = "[Lclient!g;")
	private Class44[] aClass44Array2;

	@OriginalMember(owner = "client!mb", name = "y", descriptor = "[I")
	protected int[] anIntArray338;

	@OriginalMember(owner = "client!mb", name = "D", descriptor = "[I")
	protected int[] anIntArray339;

	@OriginalMember(owner = "client!mb", name = "H", descriptor = "[[I")
	private int[][] anIntArrayArray35;

	@OriginalMember(owner = "client!mb", name = "K", descriptor = "I")
	public int anInt4539;

	@OriginalMember(owner = "client!mb", name = "M", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray2;

	@OriginalMember(owner = "client!mb", name = "N", descriptor = "I")
	private int anInt4541;

	@OriginalMember(owner = "client!mb", name = "P", descriptor = "[I")
	private int[] anIntArray340;

	@OriginalMember(owner = "client!mb", name = "Z", descriptor = "[I")
	private int[] anIntArray341;

	@OriginalMember(owner = "client!mb", name = "R", descriptor = "Z")
	private boolean aBoolean204;

	@OriginalMember(owner = "client!mb", name = "l", descriptor = "Z")
	private boolean aBoolean203;

	static {
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < 99; local6++) {
			@Pc(11) int local11 = local6 + 1;
			@Pc(24) int local24 = (int) ((double) local11 + Math.pow(2.0D, (double) local11 / 7.0D) * 300.0D);
			local4 += local24;
			anIntArray336[local6] = local4 / 4;
		}
	}

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(ZZ)V")
	protected Class70(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean204 = arg1;
		this.aBoolean203 = arg0;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
	public final void method3508() {
		for (@Pc(3) int local3 = 0; local3 < this.anObjectArrayArray2.length; local3++) {
			this.anObjectArrayArray2[local3] = null;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(III)[B")
	public final byte[] method3509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method3522(arg0, arg1, null);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!ia;I)I")
	public final int method3510(@OriginalArg(0) Class51 arg0) {
		@Pc(8) Class51 local8 = arg0.method1430();
		@Pc(16) int local16 = this.aClass44_2.method1083(local8.method1416());
		return this.method3512(local16);
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(II)I")
	protected int method3512(@OriginalArg(0) int arg0) {
		if (this.method3531(arg0)) {
			return this.anObjectArray33[arg0] == null ? 0 : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)I")
	public final int method3513() {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < this.anObjectArray33.length; local11++) {
			if (this.anIntArray337[local11] > 0) {
				local9 += this.method3512(local11);
				local7 += 100;
			}
		}
		if (local7 == 0) {
			return 100;
		} else {
			return local9 * 100 / local7;
		}
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)I")
	public final int method3514() {
		return this.anIntArray341.length;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILclient!ia;Lclient!ia;)Z")
	public final boolean method3515(@OriginalArg(1) Class51 arg0, @OriginalArg(2) Class51 arg1) {
		@Pc(3) Class51 local3 = arg1.method1430();
		@Pc(18) Class51 local18 = arg0.method1430();
		@Pc(26) int local26 = this.aClass44_2.method1083(local3.method1416());
		if (this.method3531(local26)) {
			@Pc(47) int local47 = this.aClass44Array2[local26].method1083(local18.method1416());
			return this.method3535(local47, local26);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(III)Z")
	private boolean method3516(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 >= 0 && arg0 >= 0 && arg1 < this.anIntArray341.length && arg0 < this.anIntArray341[arg1]) {
			return true;
		} else if (Static187.aBoolean186) {
			throw new IllegalArgumentException(arg1 + "," + arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IZ)V")
	protected void method3517(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IB)Z")
	public final boolean method3519(@OriginalArg(0) int arg0) {
		if (this.anIntArray341.length == 1) {
			return this.method3535(arg0, 0);
		} else if (!this.method3531(arg0)) {
			return false;
		} else if (this.anIntArray341[arg0] == 1) {
			return this.method3535(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BLclient!ia;)Z")
	public final boolean method3520(@OriginalArg(1) Class51 arg0) {
		@Pc(12) Class51 local12 = arg0.method1430();
		@Pc(20) int local20 = this.aClass44_2.method1083(local12.method1416());
		return this.method3534(local20);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "([III)Z")
	private boolean method3521(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		if (!this.method3531(arg1)) {
			return false;
		} else if (this.anObjectArray33[arg1] == null) {
			return false;
		} else {
			@Pc(24) int local24 = this.anIntArray337[arg1];
			@Pc(29) int[] local29 = this.anIntArrayArray35[arg1];
			if (this.anObjectArrayArray2[arg1] == null) {
				this.anObjectArrayArray2[arg1] = new Object[this.anIntArray341[arg1]];
			}
			@Pc(45) boolean local45 = true;
			@Pc(50) Object[] local50 = this.anObjectArrayArray2[arg1];
			for (@Pc(57) int local57 = 0; local57 < local24; local57++) {
				@Pc(63) int local63;
				if (local29 == null) {
					local63 = local57;
				} else {
					local63 = local29[local57];
				}
				if (local50[local63] == null) {
					local45 = false;
					break;
				}
			}
			if (local45) {
				return true;
			}
			@Pc(118) byte[] local118;
			if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
				local118 = Static68.method1189(this.anObjectArray33[arg1], false);
			} else {
				local118 = Static68.method1189(this.anObjectArray33[arg1], true);
				@Pc(123) Class1_Sub16 local123 = new Class1_Sub16(local118);
				local123.method3768(arg0, local123.aByteArray62.length);
			}
			@Pc(145) byte[] local145;
			try {
				local145 = Static108.method1838(local118);
			} catch (@Pc(147) RuntimeException local147) {
				throw Static157.method2683(local147, "T3 - " + (arg0 != null) + "," + arg1 + "," + local118.length + "," + Static192.method3226(local118.length, local118) + "," + Static192.method3226(local118.length - 2, local118) + "," + this.anIntArray338[arg1] + "," + this.anInt4539);
			}
			if (this.aBoolean203) {
				this.anObjectArray33[arg1] = null;
			}
			@Pc(214) int local214;
			if (local24 > 1) {
				local214 = local145.length;
				@Pc(217) int local217 = local214 - 1;
				@Pc(221) int local221 = local145[local217] & 0xFF;
				@Pc(226) Class1_Sub16 local226 = new Class1_Sub16(local145);
				@Pc(229) int[] local229 = new int[local24];
				@Pc(237) int local237 = local217 - local24 * local221 * 4;
				local226.anInt4860 = local237;
				@Pc(248) int local248;
				for (@Pc(242) int local242 = 0; local242 < local221; local242++) {
					@Pc(246) int local246 = 0;
					for (local248 = 0; local248 < local24; local248++) {
						local246 += local226.method3784();
						local229[local248] += local246;
					}
				}
				@Pc(278) byte[][] local278 = new byte[local24][];
				for (local248 = 0; local248 < local24; local248++) {
					local278[local248] = new byte[local229[local248]];
					local229[local248] = 0;
				}
				@Pc(303) int local303 = 0;
				local226.anInt4860 = local237;
				@Pc(312) int local312;
				@Pc(314) int local314;
				for (@Pc(308) int local308 = 0; local308 < local221; local308++) {
					local312 = 0;
					for (local314 = 0; local314 < local24; local314++) {
						local312 += local226.method3784();
						Static233.method868(local145, local303, local278[local314], local229[local314], local312);
						local229[local314] += local312;
						local303 += local312;
					}
				}
				for (local312 = 0; local312 < local24; local312++) {
					if (local29 == null) {
						local314 = local312;
					} else {
						local314 = local29[local312];
					}
					if (this.aBoolean204) {
						local50[local314] = local278[local312];
					} else {
						local50[local314] = Static6.method99(local278[local312]);
					}
				}
			} else {
				if (local29 == null) {
					local214 = 0;
				} else {
					local214 = local29[0];
				}
				if (this.aBoolean204) {
					local50[local214] = local145;
				} else {
					local50[local214] = Static6.method99(local145);
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IBI[I)[B")
	public final byte[] method3522(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		if (!this.method3516(arg0, arg1)) {
			return null;
		}
		if (this.anObjectArrayArray2[arg1] == null || this.anObjectArrayArray2[arg1][arg0] == null) {
			@Pc(29) boolean local29 = this.method3521(arg2, arg1);
			if (!local29) {
				this.method3517(arg1);
				local29 = this.method3521(arg2, arg1);
				if (!local29) {
					return null;
				}
			}
		}
		@Pc(55) byte[] local55 = Static68.method1189(this.anObjectArrayArray2[arg1][arg0], false);
		if (this.aBoolean204) {
			this.anObjectArrayArray2[arg1][arg0] = null;
			if (this.anIntArray341[arg1] == 1) {
				this.anObjectArrayArray2[arg1] = null;
			}
		}
		return local55;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!ia;B)I")
	public final int method3523(@OriginalArg(0) Class51 arg0) {
		@Pc(8) Class51 local8 = arg0.method1430();
		@Pc(20) int local20 = this.aClass44_2.method1083(local8.method1416());
		return this.method3531(local20) ? local20 : -1;
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(II)[B")
	public final byte[] method3524(@OriginalArg(1) int arg0) {
		if (this.anIntArray341.length == 1) {
			return this.method3509(arg0, 0);
		} else if (!this.method3531(arg0)) {
			return null;
		} else if (this.anIntArray341[arg0] == 1) {
			return this.method3509(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!ia;Lclient!ia;I)[B")
	public final byte[] method3525(@OriginalArg(0) Class51 arg0, @OriginalArg(1) Class51 arg1) {
		@Pc(12) Class51 local12 = arg1.method1430();
		@Pc(16) Class51 local16 = arg0.method1430();
		@Pc(26) int local26 = this.aClass44_2.method1083(local12.method1416());
		if (this.method3531(local26)) {
			@Pc(45) int local45 = this.aClass44Array2[local26].method1083(local16.method1416());
			return this.method3509(local45, local26);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZIZ)V")
	public final void method3526(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.anIntArray335 = null;
			this.aClass44_2 = null;
		}
		this.anIntArrayArray34 = null;
		this.aClass44Array2 = null;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIB)[B")
	public final byte[] method3528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method3516(arg1, arg0)) {
			return null;
		}
		if (this.anObjectArrayArray2[arg0] == null || this.anObjectArrayArray2[arg0][arg1] == null) {
			@Pc(31) boolean local31 = this.method3521(null, arg0);
			if (!local31) {
				this.method3517(arg0);
				local31 = this.method3521(null, arg0);
				if (!local31) {
					return null;
				}
			}
		}
		return Static68.method1189(this.anObjectArrayArray2[arg0][arg1], false);
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(IB)V")
	public final void method3530(@OriginalArg(0) int arg0) {
		if (this.method3531(arg0)) {
			this.anObjectArrayArray2[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "(II)Z")
	protected final boolean method3531(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < this.anIntArray341.length && this.anIntArray341[arg0] != 0) {
			return true;
		} else if (Static187.aBoolean186) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BI)I")
	public final int method3532(@OriginalArg(1) int arg0) {
		return this.method3531(arg0) ? this.anIntArray341[arg0] : 0;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(BI)Z")
	public final boolean method3534(@OriginalArg(1) int arg0) {
		if (!this.method3531(arg0)) {
			return false;
		} else if (this.anObjectArray33[arg0] == null) {
			this.method3517(arg0);
			return this.anObjectArray33[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "(III)Z")
	public final boolean method3535(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method3516(arg0, arg1)) {
			return false;
		} else if (this.anObjectArrayArray2[arg1] != null && this.anObjectArrayArray2[arg1][arg0] != null) {
			return true;
		} else if (this.anObjectArray33[arg1] == null) {
			this.method3517(arg1);
			return this.anObjectArray33[arg1] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!ia;Z)V")
	public final void method3536(@OriginalArg(0) Class51 arg0) {
		@Pc(12) Class51 local12 = arg0.method1430();
		@Pc(20) int local20 = this.aClass44_2.method1083(local12.method1416());
		this.method3537(local20);
	}

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "(II)V")
	protected void method3537(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(IB)[I")
	public final int[] method3538(@OriginalArg(0) int arg0) {
		if (!this.method3531(arg0)) {
			return null;
		}
		@Pc(23) int[] local23 = this.anIntArrayArray35[arg0];
		if (local23 == null) {
			local23 = new int[this.anIntArray337[arg0]];
			@Pc(33) int local33 = 0;
			while (local33 < local23.length) {
				local23[local33] = local33++;
			}
		}
		return local23;
	}

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "(I)Z")
	public final boolean method3539() {
		@Pc(7) boolean local7 = true;
		for (@Pc(9) int local9 = 0; local9 < this.anIntArray340.length; local9++) {
			@Pc(16) int local16 = this.anIntArray340[local9];
			if (this.anObjectArray33[local16] == null) {
				this.method3517(local16);
				if (this.anObjectArray33[local16] == null) {
					local7 = false;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "([BZ)V")
	protected final void method3540(@OriginalArg(0) byte[] arg0) {
		this.anInt4539 = Static192.method3226(arg0.length, arg0);
		@Pc(23) Class1_Sub16 local23 = new Class1_Sub16(Static108.method1838(arg0));
		@Pc(27) int local27 = local23.method3793();
		if (local27 != 5 && local27 != 6) {
			throw new RuntimeException("Incorrect JS5 protocol number: " + local27);
		}
		@Pc(48) int local48 = 0;
		if (local27 >= 6) {
			local23.method3784();
		}
		@Pc(59) int local59 = -1;
		@Pc(63) int local63 = local23.method3793();
		this.anInt4541 = local23.method3805();
		this.anIntArray340 = new int[this.anInt4541];
		for (@Pc(75) int local75 = 0; local75 < this.anInt4541; local75++) {
			this.anIntArray340[local75] = local48 += local23.method3805();
			if (this.anIntArray340[local75] > local59) {
				local59 = this.anIntArray340[local75];
			}
		}
		this.anIntArrayArray35 = new int[local59 + 1][];
		this.anIntArray337 = new int[local59 + 1];
		this.anObjectArrayArray2 = new Object[local59 + 1][];
		this.anIntArray339 = new int[local59 + 1];
		this.anIntArray338 = new int[local59 + 1];
		this.anObjectArray33 = new Object[local59 + 1];
		this.anIntArray341 = new int[local59 + 1];
		@Pc(159) int local159;
		@Pc(174) int local174;
		if (local63 != 0) {
			this.anIntArray335 = new int[local59 + 1];
			for (local159 = 0; local159 < local59 + 1; local159++) {
				this.anIntArray335[local159] = -1;
			}
			for (local174 = 0; local174 < this.anInt4541; local174++) {
				this.anIntArray335[this.anIntArray340[local174]] = local23.method3784();
			}
			this.aClass44_2 = new Class44(this.anIntArray335);
		}
		for (local159 = 0; local159 < this.anInt4541; local159++) {
			this.anIntArray338[this.anIntArray340[local159]] = local23.method3784();
		}
		for (local174 = 0; local174 < this.anInt4541; local174++) {
			this.anIntArray339[this.anIntArray340[local174]] = local23.method3784();
		}
		for (@Pc(242) int local242 = 0; local242 < this.anInt4541; local242++) {
			this.anIntArray337[this.anIntArray340[local242]] = local23.method3805();
		}
		@Pc(272) int local272;
		@Pc(279) int local279;
		@Pc(287) int local287;
		@Pc(289) int local289;
		@Pc(306) int local306;
		for (@Pc(265) int local265 = 0; local265 < this.anInt4541; local265++) {
			local272 = this.anIntArray340[local265];
			local48 = 0;
			local279 = this.anIntArray337[local272];
			this.anIntArrayArray35[local272] = new int[local279];
			local287 = -1;
			for (local289 = 0; local289 < local279; local289++) {
				local306 = this.anIntArrayArray35[local272][local289] = local48 += local23.method3805();
				if (local306 > local287) {
					local287 = local306;
				}
			}
			this.anIntArray341[local272] = local287 + 1;
			if (local279 == local287 + 1) {
				this.anIntArrayArray35[local272] = null;
			}
		}
		if (local63 == 0) {
			return;
		}
		this.anIntArrayArray34 = new int[local59 + 1][];
		this.aClass44Array2 = new Class44[local59 + 1];
		for (local272 = 0; local272 < this.anInt4541; local272++) {
			local279 = this.anIntArray340[local272];
			local287 = this.anIntArray337[local279];
			this.anIntArrayArray34[local279] = new int[this.anIntArray341[local279]];
			for (local289 = 0; local289 < this.anIntArray341[local279]; local289++) {
				this.anIntArrayArray34[local279][local289] = -1;
			}
			for (local306 = 0; local306 < local287; local306++) {
				@Pc(411) int local411;
				if (this.anIntArrayArray35[local279] == null) {
					local411 = local306;
				} else {
					local411 = this.anIntArrayArray35[local279][local306];
				}
				this.anIntArrayArray34[local279][local411] = local23.method3784();
			}
			this.aClass44Array2[local279] = new Class44(this.anIntArrayArray34[local279]);
		}
	}
}
