import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jo")
public final class Class168 {

	@OriginalMember(owner = "client!jo", name = "r", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray34;

	@OriginalMember(owner = "client!jo", name = "L", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!jo", name = "p", descriptor = "Lclient!hc;")
	private Class129 aClass129_2 = null;

	@OriginalMember(owner = "client!jo", name = "n", descriptor = "Z")
	private final boolean aBoolean388;

	@OriginalMember(owner = "client!jo", name = "h", descriptor = "I")
	public int anInt5130;

	@OriginalMember(owner = "client!jo", name = "v", descriptor = "Lclient!tv;")
	private final Class164 aClass164_1;

	@OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(Lclient!tv;ZI)V")
	public Class168(@OriginalArg(0) Class164 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.aBoolean388 = arg1;
		this.anInt5130 = arg2;
		this.aClass164_1 = arg0;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IZ)I")
	private int method4423(@OriginalArg(0) int arg0) {
		if (this.method4445(arg0)) {
			return this.anObjectArray34[arg0] == null ? this.aClass164_1.method4265(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IB)[I")
	public int[] method4424(@OriginalArg(0) int arg0) {
		if (!this.method4445(arg0)) {
			return null;
		}
		@Pc(18) int[] local18 = this.aClass129_2.anIntArrayArray27[arg0];
		if (local18 == null) {
			local18 = new int[this.aClass129_2.anIntArray267[arg0]];
			@Pc(34) int local34 = 0;
			while (local34 < local18.length) {
				local18[local34] = local34++;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(II[IB)[B")
	public byte[] method4425(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		if (!this.method4441(arg0, arg1)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg0] == null || this.anObjectArrayArray1[arg0][arg1] == null) {
			@Pc(39) boolean local39 = this.method4439(arg1, arg0, arg2);
			if (!local39) {
				this.method4428(arg0);
				local39 = this.method4439(arg1, arg0, arg2);
				if (!local39) {
					return null;
				}
			}
		}
		@Pc(68) byte[] local68 = Static439.method6701(false, this.anObjectArrayArray1[arg0][arg1]);
		if (this.anInt5130 == 1) {
			this.anObjectArrayArray1[arg0][arg1] = null;
			if (this.aClass129_2.anIntArray266[arg0] == 1) {
				this.anObjectArrayArray1[arg0] = null;
			}
		} else if (this.anInt5130 == 2) {
			this.anObjectArrayArray1[arg0] = null;
		}
		return local68;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(II)V")
	public void method4426(@OriginalArg(1) int arg0) {
		if (this.method4445(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(II)Z")
	public boolean method4427(@OriginalArg(0) int arg0) {
		if (!this.method4434()) {
			return false;
		} else if (this.aClass129_2.anIntArray266.length == 1) {
			return this.method4455(0, arg0);
		} else if (!this.method4445(arg0)) {
			return false;
		} else if (this.aClass129_2.anIntArray266[arg0] == 1) {
			return this.method4455(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jo", name = "c", descriptor = "(II)V")
	private void method4428(@OriginalArg(1) int arg0) {
		if (this.aBoolean388) {
			this.anObjectArray34[arg0] = this.aClass164_1.method4267(arg0);
		} else {
			this.anObjectArray34[arg0] = Static399.method8034(this.aClass164_1.method4267(arg0));
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method4429(@OriginalArg(0) String arg0) {
		if (this.method4434()) {
			@Pc(14) String local14 = arg0.toLowerCase();
			@Pc(23) int local23 = this.aClass129_2.aClass75_1.method2143(Static578.method8146(local14));
			return local23 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)I")
	public int method4431() {
		if (!this.method4434()) {
			return 0;
		}
		@Pc(21) int local21 = 0;
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < this.anObjectArray34.length; local25++) {
			if (this.aClass129_2.anIntArray267[local25] > 0) {
				local21 += 100;
				local23 += this.method4423(local25);
			}
		}
		if (local21 == 0) {
			return 100;
		} else {
			return local23 * 100 / local21;
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public int method4432(@OriginalArg(1) String arg0) {
		if (this.method4434()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(30) int local30 = this.aClass129_2.aClass75_1.method2143(Static578.method8146(local12));
			return this.method4445(local30) ? local30 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(I)Z")
	private boolean method4434() {
		if (this.aClass129_2 == null) {
			this.aClass129_2 = this.aClass164_1.method4266();
			if (this.aClass129_2 == null) {
				return false;
			}
			this.anObjectArrayArray1 = new Object[this.aClass129_2.anInt4117][];
			this.anObjectArray34 = new Object[this.aClass129_2.anInt4117];
		}
		return true;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(III)[B")
	public byte[] method4435(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method4425(arg1, arg0, null);
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(ILjava/lang/String;)V")
	public void method4436(@OriginalArg(1) String arg0) {
		if (this.method4434()) {
			@Pc(11) String local11 = arg0.toLowerCase();
			@Pc(20) int local20 = this.aClass129_2.aClass75_1.method2143(Static578.method8146(local11));
			this.method4449(local20);
		}
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method4437(@OriginalArg(0) String arg0) {
		if (this.method4434()) {
			@Pc(18) String local18 = arg0.toLowerCase();
			@Pc(27) int local27 = this.aClass129_2.aClass75_1.method2143(Static578.method8146(local18));
			return this.method4446(local27);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jo", name = "d", descriptor = "(II)[B")
	public byte[] method4438(@OriginalArg(0) int arg0) {
		if (!this.method4434()) {
			return null;
		} else if (this.aClass129_2.anIntArray266.length == 1) {
			return this.method4435(arg0, 0);
		} else if (!this.method4445(arg0)) {
			return null;
		} else if (this.aClass129_2.anIntArray266[arg0] == 1) {
			return this.method4435(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(II[II)Z")
	private boolean method4439(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		if (!this.method4445(arg1)) {
			return false;
		} else if (this.anObjectArray34[arg1] == null) {
			return false;
		} else {
			@Pc(25) int local25 = this.aClass129_2.anIntArray267[arg1];
			@Pc(31) int[] local31 = this.aClass129_2.anIntArrayArray27[arg1];
			if (this.anObjectArrayArray1[arg1] == null) {
				this.anObjectArrayArray1[arg1] = new Object[this.aClass129_2.anIntArray266[arg1]];
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
			@Pc(123) byte[] local123;
			if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
				local123 = Static439.method6701(false, this.anObjectArray34[arg1]);
			} else {
				local123 = Static439.method6701(true, this.anObjectArray34[arg1]);
				@Pc(138) Class6_Sub26 local138 = new Class6_Sub26(local123);
				local138.method4986(arg2, local138.aByteArray65.length);
			}
			@Pc(150) byte[] local150;
			try {
				local150 = Static483.method7335(local123);
			} catch (@Pc(152) RuntimeException local152) {
				throw Static459.method3945(local152, "T3 - " + (arg2 != null) + "," + arg1 + "," + local123.length + "," + Static104.method6574(local123, local123.length) + "," + Static104.method6574(local123, local123.length - 2) + "," + this.aClass129_2.anIntArray270[arg1] + "," + this.aClass129_2.anInt4112);
			}
			if (this.aBoolean388) {
				this.anObjectArray34[arg1] = null;
			}
			@Pc(225) int local225;
			if (local25 > 1) {
				@Pc(232) int local232;
				@Pc(245) Class6_Sub26 local245;
				@Pc(253) int local253;
				@Pc(257) int local257;
				@Pc(259) int local259;
				@Pc(313) int local313;
				@Pc(315) int local315;
				@Pc(319) int local319;
				@Pc(321) int local321;
				if (this.anInt5130 == 2) {
					local225 = local150.length;
					local225--;
					local232 = local150[local225] & 0xFF;
					local225 -= local232 * 4 * local25;
					local245 = new Class6_Sub26(local150);
					@Pc(430) int local430 = 0;
					local253 = 0;
					local245.anInt5769 = local225;
					for (local257 = 0; local257 < local232; local257++) {
						local259 = 0;
						for (local313 = 0; local313 < local25; local313++) {
							local259 += local245.method5000();
							if (local31 == null) {
								local315 = local313;
							} else {
								local315 = local31[local313];
							}
							if (arg0 == local315) {
								local253 = local315;
								local430 += local259;
							}
						}
					}
					if (local430 == 0) {
						return true;
					}
					@Pc(492) byte[] local492 = new byte[local430];
					local245.anInt5769 = local225;
					local430 = 0;
					local313 = 0;
					for (local315 = 0; local315 < local232; local315++) {
						local319 = 0;
						for (local321 = 0; local321 < local25; local321++) {
							local319 += local245.method5000();
							@Pc(521) int local521;
							if (local31 == null) {
								local521 = local321;
							} else {
								local521 = local31[local321];
							}
							if (local521 == arg0) {
								Static589.method5382(local150, local313, local492, local430, local319);
								local430 += local319;
							}
							local313 += local319;
						}
					}
					local51[local253] = local492;
				} else {
					local225 = local150.length;
					@Pc(227) int local227 = local225 - 1;
					local232 = local150[local227] & 0xFF;
					@Pc(240) int local240 = local227 - local232 * 4 * local25;
					local245 = new Class6_Sub26(local150);
					local245.anInt5769 = local240;
					@Pc(251) int[] local251 = new int[local25];
					for (local253 = 0; local253 < local232; local253++) {
						local257 = 0;
						for (local259 = 0; local259 < local25; local259++) {
							local257 += local245.method5000();
							local251[local259] += local257;
						}
					}
					@Pc(285) byte[][] local285 = new byte[local25][];
					for (local259 = 0; local259 < local25; local259++) {
						local285[local259] = new byte[local251[local259]];
						local251[local259] = 0;
					}
					local245.anInt5769 = local240;
					local313 = 0;
					for (local315 = 0; local315 < local232; local315++) {
						local319 = 0;
						for (local321 = 0; local321 < local25; local321++) {
							local319 += local245.method5000();
							Static589.method5382(local150, local313, local285[local321], local251[local321], local319);
							local313 += local319;
							local251[local321] += local319;
						}
					}
					for (local319 = 0; local319 < local25; local319++) {
						if (local31 == null) {
							local321 = local319;
						} else {
							local321 = local31[local319];
						}
						if (this.anInt5130 == 0) {
							local51[local321] = Static399.method8034(local285[local319]);
						} else {
							local51[local321] = local285[local319];
						}
					}
				}
			} else {
				if (local31 == null) {
					local225 = 0;
				} else {
					local225 = local31[0];
				}
				if (this.anInt5130 == 0) {
					local51[local225] = Static399.method8034(local150);
				} else {
					local51[local225] = local150;
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)Z")
	public boolean method4440(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method4434()) {
			return false;
		}
		@Pc(17) String local17 = arg0.toLowerCase();
		@Pc(20) String local20 = arg1.toLowerCase();
		@Pc(29) int local29 = this.aClass129_2.aClass75_1.method2143(Static578.method8146(local17));
		if (local29 < 0) {
			return false;
		} else {
			@Pc(47) int local47 = this.aClass129_2.aClass75Array1[local29].method2143(Static578.method8146(local20));
			return local47 >= 0;
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IZI)Z")
	private boolean method4441(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method4434()) {
			return false;
		} else if (arg0 >= 0 && arg1 >= 0 && this.aClass129_2.anIntArray266.length > arg0 && this.aClass129_2.anIntArray266[arg0] > arg1) {
			return true;
		} else if (Static21.aBoolean76) {
			throw new IllegalArgumentException(arg0 + "," + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(Z)Z")
	public boolean method4442() {
		if (!this.method4434()) {
			return false;
		}
		@Pc(11) boolean local11 = true;
		for (@Pc(13) int local13 = 0; local13 < this.aClass129_2.anIntArray269.length; local13++) {
			@Pc(24) int local24 = this.aClass129_2.anIntArray269[local13];
			if (this.anObjectArray34[local24] == null) {
				this.method4428(local24);
				if (this.anObjectArray34[local24] == null) {
					local11 = false;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!jo", name = "e", descriptor = "(II)I")
	public int method4443(@OriginalArg(1) int arg0) {
		return this.method4445(arg0) ? this.aClass129_2.anIntArray266[arg0] : 0;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z")
	public boolean method4444(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method4434()) {
			return false;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(15) String local15 = arg1.toLowerCase();
		@Pc(26) int local26 = this.aClass129_2.aClass75_1.method2143(Static578.method8146(local12));
		if (this.method4445(local26)) {
			@Pc(48) int local48 = this.aClass129_2.aClass75Array1[local26].method2143(Static578.method8146(local15));
			return this.method4455(local26, local48);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jo", name = "f", descriptor = "(II)Z")
	private boolean method4445(@OriginalArg(1) int arg0) {
		if (!this.method4434()) {
			return false;
		} else if (arg0 >= 0 && this.aClass129_2.anIntArray266.length > arg0 && this.aClass129_2.anIntArray266[arg0] != 0) {
			return true;
		} else if (Static21.aBoolean76) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(BI)Z")
	public boolean method4446(@OriginalArg(1) int arg0) {
		if (!this.method4445(arg0)) {
			return false;
		} else if (this.anObjectArray34[arg0] == null) {
			this.method4428(arg0);
			return this.anObjectArray34[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(B)V")
	public void method4447() {
		if (this.anObjectArray34 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anObjectArray34.length; local6++) {
				this.anObjectArray34[local6] = null;
			}
		}
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(Z)V")
	public void method4448() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(12) int local12 = 0; local12 < this.anObjectArrayArray1.length; local12++) {
				this.anObjectArrayArray1[local12] = null;
			}
		}
	}

	@OriginalMember(owner = "client!jo", name = "g", descriptor = "(II)V")
	private void method4449(@OriginalArg(0) int arg0) {
		this.aClass164_1.method4263(arg0);
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)[B")
	public byte[] method4450(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method4434()) {
			return null;
		}
		@Pc(18) String local18 = arg1.toLowerCase();
		@Pc(21) String local21 = arg0.toLowerCase();
		@Pc(32) int local32 = this.aClass129_2.aClass75_1.method2143(Static578.method8146(local18));
		if (this.method4445(local32)) {
			@Pc(54) int local54 = this.aClass129_2.aClass75Array1[local32].method2143(Static578.method8146(local21));
			return this.method4435(local54, local32);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(ZBZ)V")
	public void method4451(@OriginalArg(0) boolean arg0) {
		if (!this.method4434()) {
			return;
		}
		this.aClass129_2.anIntArrayArray28 = null;
		this.aClass129_2.aClass75Array1 = null;
		if (arg0) {
			this.aClass129_2.anIntArray268 = null;
			this.aClass129_2.aClass75_1 = null;
		}
	}

	@OriginalMember(owner = "client!jo", name = "h", descriptor = "(II)I")
	public int method4452(@OriginalArg(0) int arg0) {
		if (this.method4434()) {
			@Pc(16) int local16 = this.aClass129_2.aClass75_1.method2143(arg0);
			return this.method4445(local16) ? local16 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!jo", name = "c", descriptor = "(Z)I")
	public int method4453() {
		if (!this.method4434()) {
			throw new IllegalStateException("");
		}
		return this.aClass129_2.anInt4112;
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(III)Z")
	public boolean method4455(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method4441(arg0, arg1)) {
			return false;
		} else if (this.anObjectArrayArray1[arg0] != null && this.anObjectArrayArray1[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray34[arg0] == null) {
			this.method4428(arg0);
			return this.anObjectArray34[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(B)I")
	public int method4456() {
		return this.method4434() ? this.aClass129_2.anIntArray266.length : -1;
	}

	@OriginalMember(owner = "client!jo", name = "c", descriptor = "(Ljava/lang/String;I)I")
	public int method4457(@OriginalArg(0) String arg0) {
		if (this.method4434()) {
			@Pc(18) String local18 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass129_2.aClass75_1.method2143(Static578.method8146(local18));
			return this.method4423(local29);
		} else {
			return 0;
		}
	}
}
