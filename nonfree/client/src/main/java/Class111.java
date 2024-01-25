import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public final class Class111 {

	@OriginalMember(owner = "client!ga", name = "E", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray2;

	@OriginalMember(owner = "client!ga", name = "G", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!ga", name = "i", descriptor = "Lclient!km;")
	private Class191 aClass191_1 = null;

	@OriginalMember(owner = "client!ga", name = "O", descriptor = "Z")
	private final boolean aBoolean209;

	@OriginalMember(owner = "client!ga", name = "g", descriptor = "I")
	public int anInt2898;

	@OriginalMember(owner = "client!ga", name = "o", descriptor = "Lclient!pe;")
	private final Class252 aClass252_1;

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lclient!pe;ZI)V")
	public Class111(@OriginalArg(0) Class252 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.aBoolean209 = arg1;
		this.anInt2898 = arg2;
		this.aClass252_1 = arg0;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)Z")
	public boolean method2434(@OriginalArg(1) int arg0) {
		if (!this.method2452()) {
			return false;
		} else if (this.aClass191_1.anIntArray310.length == 1) {
			return this.method2465(arg0, 0);
		} else if (!this.method2453(arg0)) {
			return false;
		} else if (this.aClass191_1.anIntArray310[arg0] == 1) {
			return this.method2465(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(II)V")
	private void method2435(@OriginalArg(0) int arg0) {
		if (this.aBoolean209) {
			this.anObjectArray2[arg0] = this.aClass252_1.method7922(arg0);
		} else {
			this.anObjectArray2[arg0] = Static183.method3216(this.aClass252_1.method7922(arg0));
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)I")
	public int method2436() {
		return this.method2452() ? this.aClass191_1.anIntArray310.length : -1;
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)I")
	public int method2438() {
		if (!this.method2452()) {
			return 0;
		}
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anObjectArray2.length; local17++) {
			if (this.aClass191_1.anIntArray308[local17] > 0) {
				local13 += 100;
				local15 += this.method2451(local17);
			}
		}
		if (local13 == 0) {
			return 100;
		} else {
			return local15 * 100 / local13;
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(I[III)Z")
	private boolean method2439(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		if (!this.method2453(arg2)) {
			return false;
		} else if (this.anObjectArray2[arg2] == null) {
			return false;
		} else {
			@Pc(25) int local25 = this.aClass191_1.anIntArray308[arg2];
			@Pc(31) int[] local31 = this.aClass191_1.anIntArrayArray34[arg2];
			if (this.anObjectArrayArray1[arg2] == null) {
				this.anObjectArrayArray1[arg2] = new Object[this.aClass191_1.anIntArray310[arg2]];
			}
			@Pc(51) Object[] local51 = this.anObjectArrayArray1[arg2];
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
				local115 = Static114.method1984(this.anObjectArray2[arg2], false);
			} else {
				local115 = Static114.method1984(this.anObjectArray2[arg2], true);
				@Pc(130) Class1_Sub20 local130 = new Class1_Sub20(local115);
				local130.method4429(arg1, local130.aByteArray52.length);
			}
			@Pc(144) byte[] local144;
			try {
				local144 = Static264.method4167(local115);
			} catch (@Pc(146) RuntimeException local146) {
				throw Static416.method5832(local146, "T3 - " + (arg1 != null) + "," + arg2 + "," + local115.length + "," + Static252.method7833(local115, local115.length) + "," + Static252.method7833(local115, local115.length - 2) + "," + this.aClass191_1.anIntArray305[arg2] + "," + this.aClass191_1.anInt5091);
			}
			if (this.aBoolean209) {
				this.anObjectArray2[arg2] = null;
			}
			@Pc(219) int local219;
			if (local25 > 1) {
				@Pc(226) int local226;
				@Pc(239) Class1_Sub20 local239;
				@Pc(247) int local247;
				@Pc(251) int local251;
				@Pc(253) int local253;
				@Pc(307) int local307;
				@Pc(309) int local309;
				@Pc(313) int local313;
				@Pc(315) int local315;
				if (this.anInt2898 == 2) {
					local219 = local144.length;
					local219--;
					local226 = local144[local219] & 0xFF;
					local219 -= local226 * 4 * local25;
					local239 = new Class1_Sub20(local144);
					@Pc(424) int local424 = 0;
					local247 = 0;
					local239.anInt5238 = local219;
					for (local251 = 0; local251 < local226; local251++) {
						local253 = 0;
						for (local307 = 0; local307 < local25; local307++) {
							local253 += local239.method4371();
							if (local31 == null) {
								local309 = local307;
							} else {
								local309 = local31[local307];
							}
							if (local309 == arg0) {
								local247 = local309;
								local424 += local253;
							}
						}
					}
					if (local424 == 0) {
						return true;
					}
					@Pc(490) byte[] local490 = new byte[local424];
					local239.anInt5238 = local219;
					local424 = 0;
					local307 = 0;
					for (local309 = 0; local309 < local226; local309++) {
						local313 = 0;
						for (local315 = 0; local315 < local25; local315++) {
							local313 += local239.method4371();
							@Pc(519) int local519;
							if (local31 == null) {
								local519 = local315;
							} else {
								local519 = local31[local315];
							}
							if (arg0 == local519) {
								Static600.method3768(local144, local307, local490, local424, local313);
								local424 += local313;
							}
							local307 += local313;
						}
					}
					local51[local247] = local490;
				} else {
					local219 = local144.length;
					@Pc(221) int local221 = local219 - 1;
					local226 = local144[local221] & 0xFF;
					@Pc(234) int local234 = local221 - local226 * 4 * local25;
					local239 = new Class1_Sub20(local144);
					local239.anInt5238 = local234;
					@Pc(245) int[] local245 = new int[local25];
					for (local247 = 0; local247 < local226; local247++) {
						local251 = 0;
						for (local253 = 0; local253 < local25; local253++) {
							local251 += local239.method4371();
							local245[local253] += local251;
						}
					}
					@Pc(283) byte[][] local283 = new byte[local25][];
					for (local253 = 0; local253 < local25; local253++) {
						local283[local253] = new byte[local245[local253]];
						local245[local253] = 0;
					}
					local239.anInt5238 = local234;
					local307 = 0;
					for (local309 = 0; local309 < local226; local309++) {
						local313 = 0;
						for (local315 = 0; local315 < local25; local315++) {
							local313 += local239.method4371();
							Static600.method3768(local144, local307, local283[local315], local245[local315], local313);
							local245[local315] += local313;
							local307 += local313;
						}
					}
					for (local313 = 0; local313 < local25; local313++) {
						if (local31 == null) {
							local315 = local313;
						} else {
							local315 = local31[local313];
						}
						if (this.anInt2898 == 0) {
							local51[local315] = Static183.method3216(local283[local313]);
						} else {
							local51[local315] = local283[local313];
						}
					}
				}
			} else {
				if (local31 == null) {
					local219 = 0;
				} else {
					local219 = local31[0];
				}
				if (this.anInt2898 == 0) {
					local51[local219] = Static183.method3216(local144);
				} else {
					local51[local219] = local144;
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "([IIII)[B")
	public byte[] method2440(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.method2455(arg2, arg1)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg1] == null || this.anObjectArrayArray1[arg1][arg2] == null) {
			@Pc(30) boolean local30 = this.method2439(arg2, arg0, arg1);
			if (!local30) {
				this.method2435(arg1);
				local30 = this.method2439(arg2, arg0, arg1);
				if (!local30) {
					return null;
				}
			}
		}
		@Pc(57) byte[] local57 = Static114.method1984(this.anObjectArrayArray1[arg1][arg2], false);
		if (this.anInt2898 == 1) {
			this.anObjectArrayArray1[arg1][arg2] = null;
			if (this.aClass191_1.anIntArray310[arg1] == 1) {
				this.anObjectArrayArray1[arg1] = null;
			}
		} else if (this.anInt2898 == 2) {
			this.anObjectArrayArray1[arg1] = null;
		}
		return local57;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(III)[B")
	public byte[] method2441(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method2440(null, arg1, arg0);
	}

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "(II)I")
	public int method2442(@OriginalArg(1) int arg0) {
		return this.method2453(arg0) ? this.aClass191_1.anIntArray310[arg0] : 0;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(BLjava/lang/String;)V")
	public void method2443(@OriginalArg(1) String arg0) {
		if (this.method2452()) {
			@Pc(11) String local11 = arg0.toLowerCase();
			@Pc(20) int local20 = this.aClass191_1.aClass262_1.method5805(Static293.method4617(local11));
			this.method2444(local20);
		}
	}

	@OriginalMember(owner = "client!ga", name = "d", descriptor = "(II)V")
	private void method2444(@OriginalArg(0) int arg0) {
		this.aClass252_1.method7926(arg0);
	}

	@OriginalMember(owner = "client!ga", name = "e", descriptor = "(II)I")
	public int method2445(@OriginalArg(1) int arg0) {
		if (this.method2452()) {
			@Pc(16) int local16 = this.aClass191_1.aClass262_1.method5805(arg0);
			return this.method2453(local16) ? local16 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method2446(@OriginalArg(0) String arg0) {
		if (this.method2452()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass191_1.aClass262_1.method5805(Static293.method4617(local12));
			return local21 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZBZ)V")
	public void method2447(@OriginalArg(0) boolean arg0) {
		if (!this.method2452()) {
			return;
		}
		this.aClass191_1.aClass262Array1 = null;
		this.aClass191_1.anIntArrayArray35 = null;
		if (arg0) {
			this.aClass191_1.aClass262_1 = null;
			this.aClass191_1.anIntArray306 = null;
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z")
	public boolean method2448(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method2452()) {
			return false;
		}
		@Pc(18) String local18 = arg1.toLowerCase();
		@Pc(21) String local21 = arg0.toLowerCase();
		@Pc(30) int local30 = this.aClass191_1.aClass262_1.method5805(Static293.method4617(local18));
		if (local30 < 0) {
			return false;
		} else {
			@Pc(48) int local48 = this.aClass191_1.aClass262Array1[local30].method5805(Static293.method4617(local21));
			return local48 >= 0;
		}
	}

	@OriginalMember(owner = "client!ga", name = "f", descriptor = "(II)[B")
	public byte[] method2449(@OriginalArg(1) int arg0) {
		if (!this.method2452()) {
			return null;
		} else if (this.aClass191_1.anIntArray310.length == 1) {
			return this.method2441(arg0, 0);
		} else if (!this.method2453(arg0)) {
			return null;
		} else if (this.aClass191_1.anIntArray310[arg0] == 1) {
			return this.method2441(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)[B")
	public byte[] method2450(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method2452()) {
			return null;
		}
		@Pc(21) String local21 = arg1.toLowerCase();
		@Pc(24) String local24 = arg0.toLowerCase();
		@Pc(33) int local33 = this.aClass191_1.aClass262_1.method5805(Static293.method4617(local21));
		if (this.method2453(local33)) {
			@Pc(51) int local51 = this.aClass191_1.aClass262Array1[local33].method5805(Static293.method4617(local24));
			return this.method2441(local51, local33);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ga", name = "g", descriptor = "(II)I")
	private int method2451(@OriginalArg(0) int arg0) {
		if (this.method2453(arg0)) {
			return this.anObjectArray2[arg0] == null ? this.aClass252_1.method7923(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Z)Z")
	private boolean method2452() {
		if (this.aClass191_1 == null) {
			this.aClass191_1 = this.aClass252_1.method7921();
			if (this.aClass191_1 == null) {
				return false;
			}
			this.anObjectArrayArray1 = new Object[this.aClass191_1.anInt5084][];
			this.anObjectArray2 = new Object[this.aClass191_1.anInt5084];
		}
		return true;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IB)Z")
	private boolean method2453(@OriginalArg(0) int arg0) {
		if (!this.method2452()) {
			return false;
		} else if (arg0 >= 0 && this.aClass191_1.anIntArray310.length > arg0 && this.aClass191_1.anIntArray310[arg0] != 0) {
			return true;
		} else if (Static526.aBoolean634) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "(I)V")
	public void method2454() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anObjectArrayArray1.length; local6++) {
				this.anObjectArrayArray1[local6] = null;
			}
		}
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(III)Z")
	private boolean method2455(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method2452()) {
			return false;
		} else if (arg1 >= 0 && arg0 >= 0 && this.aClass191_1.anIntArray310.length > arg1 && arg0 < this.aClass191_1.anIntArray310[arg1]) {
			return true;
		} else if (Static526.aBoolean634) {
			throw new IllegalArgumentException(arg1 + "," + arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ga", name = "d", descriptor = "(I)Z")
	public boolean method2456() {
		if (!this.method2452()) {
			return false;
		}
		@Pc(21) boolean local21 = true;
		for (@Pc(23) int local23 = 0; local23 < this.aClass191_1.anIntArray307.length; local23++) {
			@Pc(31) int local31 = this.aClass191_1.anIntArray307[local23];
			if (this.anObjectArray2[local31] == null) {
				this.method2435(local31);
				if (this.anObjectArray2[local31] == null) {
					local21 = false;
				}
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!ga", name = "h", descriptor = "(II)[I")
	public int[] method2457(@OriginalArg(1) int arg0) {
		if (!this.method2453(arg0)) {
			return null;
		}
		@Pc(23) int[] local23 = this.aClass191_1.anIntArrayArray34[arg0];
		if (local23 == null) {
			local23 = new int[this.aClass191_1.anIntArray308[arg0]];
			@Pc(34) int local34 = 0;
			while (local34 < local23.length) {
				local23[local34] = local34++;
			}
		}
		return local23;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z")
	private boolean method2458(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method2452()) {
			return false;
		}
		@Pc(20) String local20 = arg0.toLowerCase();
		@Pc(23) String local23 = arg1.toLowerCase();
		@Pc(32) int local32 = this.aClass191_1.aClass262_1.method5805(Static293.method4617(local20));
		if (this.method2453(local32)) {
			@Pc(50) int local50 = this.aClass191_1.aClass262Array1[local32].method5805(Static293.method4617(local23));
			return this.method2465(local50, local32);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ga", name = "e", descriptor = "(I)I")
	public int method2459() {
		if (!this.method2452()) {
			throw new IllegalStateException("");
		}
		return this.aClass191_1.anInt5091;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(BI)V")
	public void method2460(@OriginalArg(1) int arg0) {
		if (this.method2453(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!ga", name = "f", descriptor = "(I)V")
	public void method2461() {
		if (this.anObjectArray2 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anObjectArray2.length; local6++) {
				this.anObjectArray2[local6] = null;
			}
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method2462(@OriginalArg(1) String arg0) {
		if (this.method2452()) {
			@Pc(17) String local17 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass191_1.aClass262_1.method5805(Static293.method4617(local17));
			return this.method2453(local26) ? local26 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(BI)Z")
	public boolean method2463(@OriginalArg(1) int arg0) {
		if (!this.method2453(arg0)) {
			return false;
		} else if (this.anObjectArray2[arg0] == null) {
			this.method2435(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
	public boolean method2464(@OriginalArg(0) String arg0) {
		if (this.method2452()) {
			@Pc(17) String local17 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass191_1.aClass262_1.method5805(Static293.method4617(local17));
			return this.method2463(local26);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "(III)Z")
	public boolean method2465(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method2455(arg0, arg1)) {
			return false;
		} else if (this.anObjectArrayArray1[arg1] != null && this.anObjectArrayArray1[arg1][arg0] != null) {
			return true;
		} else if (this.anObjectArray2[arg1] == null) {
			this.method2435(arg1);
			return this.anObjectArray2[arg1] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(ILjava/lang/String;)Z")
	public boolean method2466(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = this.method2462("");
		return local8 == -1 ? this.method2458(arg0, "") : this.method2458("", arg0);
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public int method2467(@OriginalArg(0) String arg0) {
		if (this.method2452()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass191_1.aClass262_1.method5805(Static293.method4617(local12));
			return this.method2451(local26);
		} else {
			return 0;
		}
	}
}
