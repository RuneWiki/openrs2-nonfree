import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eq")
public final class Class97 {

	@OriginalMember(owner = "client!eq", name = "p", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray32;

	@OriginalMember(owner = "client!eq", name = "y", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!eq", name = "e", descriptor = "Lclient!sv;")
	private Class312 aClass312_1 = null;

	@OriginalMember(owner = "client!eq", name = "H", descriptor = "Z")
	private final boolean aBoolean257;

	@OriginalMember(owner = "client!eq", name = "q", descriptor = "Lclient!iu;")
	private final Class167 aClass167_1;

	@OriginalMember(owner = "client!eq", name = "x", descriptor = "I")
	public int anInt3014;

	@OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(Lclient!iu;ZI)V")
	public Class97(@OriginalArg(0) Class167 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (arg2 < 0 || arg2 > 2) {
			throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
		}
		this.aBoolean257 = arg1;
		this.aClass167_1 = arg0;
		this.anInt3014 = arg2;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(II)V")
	private void method2541(@OriginalArg(0) int arg0) {
		this.aClass167_1.method6957(arg0);
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(ZZZ)V")
	public void method2542(@OriginalArg(1) boolean arg0) {
		if (!this.method2549()) {
			return;
		}
		this.aClass312_1.anIntArrayArray82 = null;
		this.aClass312_1.aClass361Array1 = null;
		if (arg0) {
			this.aClass312_1.anIntArray616 = null;
			this.aClass312_1.aClass361_1 = null;
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z")
	public boolean method2543(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method2549()) {
			return false;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(15) String local15 = arg1.toLowerCase();
		@Pc(24) int local24 = this.aClass312_1.aClass361_1.method8286(Static593.method8173(local12));
		if (local24 < 0) {
			return false;
		} else {
			@Pc(48) int local48 = this.aClass312_1.aClass361Array1[local24].method8286(Static593.method8173(local15));
			return local48 >= 0;
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(ILjava/lang/String;)V")
	public void method2544(@OriginalArg(1) String arg0) {
		if (this.method2549()) {
			@Pc(11) String local11 = arg0.toLowerCase();
			@Pc(25) int local25 = this.aClass312_1.aClass361_1.method8286(Static593.method8173(local11));
			this.method2541(local25);
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(III)[B")
	public byte[] method2545(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.method2565(arg1, null, arg0);
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(I)I")
	public int method2546() {
		return this.method2549() ? this.aClass312_1.anIntArray617.length : -1;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Z)I")
	public int method2547() {
		if (!this.method2549()) {
			throw new IllegalStateException("");
		}
		return this.aClass312_1.anInt8898;
	}

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(Z)V")
	public void method2548() {
		if (this.anObjectArray32 != null) {
			for (@Pc(4) int local4 = 0; local4 < this.anObjectArray32.length; local4++) {
				this.anObjectArray32[local4] = null;
			}
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(B)Z")
	private boolean method2549() {
		if (this.aClass312_1 == null) {
			this.aClass312_1 = this.aClass167_1.method6953();
			if (this.aClass312_1 == null) {
				return false;
			}
			this.anObjectArrayArray1 = new Object[this.aClass312_1.anInt8892][];
			this.anObjectArray32 = new Object[this.aClass312_1.anInt8892];
		}
		return true;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(BI)Z")
	public boolean method2550(@OriginalArg(1) int arg0) {
		if (!this.method2573(arg0)) {
			return false;
		} else if (this.anObjectArray32[arg0] == null) {
			this.method2563(arg0);
			return this.anObjectArray32[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(II)I")
	private int method2551(@OriginalArg(1) int arg0) {
		if (this.method2573(arg0)) {
			return this.anObjectArray32[arg0] == null ? this.aClass167_1.method6954(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public int method2552(@OriginalArg(0) String arg0) {
		if (this.method2549()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass312_1.aClass361_1.method8286(Static593.method8173(local12));
			return this.method2551(local21);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(I)Z")
	public boolean method2553() {
		if (!this.method2549()) {
			return false;
		}
		@Pc(11) boolean local11 = true;
		for (@Pc(13) int local13 = 0; local13 < this.aClass312_1.anIntArray615.length; local13++) {
			@Pc(20) int local20 = this.aClass312_1.anIntArray615[local13];
			if (this.anObjectArray32[local20] == null) {
				this.method2563(local20);
				if (this.anObjectArray32[local20] == null) {
					local11 = false;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!eq", name = "c", descriptor = "(I)I")
	public int method2554() {
		if (!this.method2549()) {
			return 0;
		}
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < this.anObjectArray32.length; local15++) {
			if (this.aClass312_1.anIntArray620[local15] > 0) {
				local13 += this.method2551(local15);
				local11 += 100;
			}
		}
		if (local11 == 0) {
			return 100;
		} else {
			return local13 * 100 / local11;
		}
	}

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(Ljava/lang/String;B)Z")
	public boolean method2555(@OriginalArg(0) String arg0) {
		if (this.method2549()) {
			@Pc(17) String local17 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass312_1.aClass361_1.method8286(Static593.method8173(local17));
			return local26 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(B)V")
	public void method2556() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(12) int local12 = 0; local12 < this.anObjectArrayArray1.length; local12++) {
				this.anObjectArrayArray1[local12] = null;
			}
		}
	}

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(ILjava/lang/String;)Z")
	public boolean method2557(@OriginalArg(1) String arg0) {
		@Pc(12) int local12 = this.method2574("");
		return local12 == -1 ? this.method2575(arg0, "") : this.method2575("", arg0);
	}

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(III)Z")
	private boolean method2558(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method2549()) {
			return false;
		} else if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aClass312_1.anIntArray617.length && this.aClass312_1.anIntArray617[arg0] > arg1) {
			return true;
		} else if (Static284.aBoolean736) {
			throw new IllegalArgumentException(arg0 + "," + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(II[II)Z")
	private boolean method2559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		if (!this.method2573(arg0)) {
			return false;
		} else if (this.anObjectArray32[arg0] == null) {
			return false;
		} else {
			@Pc(28) int local28 = this.aClass312_1.anIntArray620[arg0];
			@Pc(34) int[] local34 = this.aClass312_1.anIntArrayArray81[arg0];
			if (this.anObjectArrayArray1[arg0] == null) {
				this.anObjectArrayArray1[arg0] = new Object[this.aClass312_1.anIntArray617[arg0]];
			}
			@Pc(54) Object[] local54 = this.anObjectArrayArray1[arg0];
			@Pc(56) boolean local56 = true;
			for (@Pc(58) int local58 = 0; local58 < local28; local58++) {
				@Pc(63) int local63;
				if (local34 == null) {
					local63 = local58;
				} else {
					local63 = local34[local58];
				}
				if (local54[local63] == null) {
					local56 = false;
					break;
				}
			}
			if (local56) {
				return true;
			}
			@Pc(109) byte[] local109;
			if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
				local109 = Static187.method3389(this.anObjectArray32[arg0], false);
			} else {
				local109 = Static187.method3389(this.anObjectArray32[arg0], true);
				@Pc(123) Class2_Sub34 local123 = new Class2_Sub34(local109);
				local123.method6855(local123.aByteArray77.length, arg2);
			}
			@Pc(135) byte[] local135;
			try {
				local135 = Static77.method1460(local109);
			} catch (@Pc(137) RuntimeException local137) {
				throw Static137.method2621(local137, "T3 - " + (arg2 != null) + "," + arg0 + "," + local109.length + "," + Static342.method5240(local109.length, local109) + "," + Static342.method5240(local109.length - 2, local109) + "," + this.aClass312_1.anIntArray619[arg0] + "," + this.aClass312_1.anInt8898);
			}
			if (this.aBoolean257) {
				this.anObjectArray32[arg0] = null;
			}
			@Pc(209) int local209;
			if (local28 <= 1) {
				if (local34 == null) {
					local209 = 0;
				} else {
					local209 = local34[0];
				}
				if (this.anInt3014 == 0) {
					local54[local209] = Static609.method8332(local135);
				} else {
					local54[local209] = local135;
				}
			} else {
				@Pc(244) int local244;
				@Pc(257) Class2_Sub34 local257;
				@Pc(261) int local261;
				@Pc(266) int local266;
				@Pc(269) int local269;
				@Pc(271) int local271;
				@Pc(284) int local284;
				@Pc(331) int local331;
				@Pc(333) int local333;
				if (this.anInt3014 == 2) {
					local209 = local135.length;
					local209--;
					local244 = local135[local209] & 0xFF;
					local209 -= local244 * 4 * local28;
					local257 = new Class2_Sub34(local135);
					@Pc(259) int local259 = 0;
					local261 = 0;
					local257.anInt8188 = local209;
					for (local266 = 0; local266 < local244; local266++) {
						local269 = 0;
						for (local271 = 0; local271 < local28; local271++) {
							local269 += local257.method6865();
							if (local34 == null) {
								local284 = local271;
							} else {
								local284 = local34[local271];
							}
							if (local284 == arg1) {
								local261 = local284;
								local259 += local269;
							}
						}
					}
					if (local259 == 0) {
						return true;
					}
					@Pc(319) byte[] local319 = new byte[local259];
					local257.anInt8188 = local209;
					local259 = 0;
					local271 = 0;
					for (local284 = 0; local284 < local244; local284++) {
						local331 = 0;
						for (local333 = 0; local333 < local28; local333++) {
							local331 += local257.method6865();
							@Pc(346) int local346;
							if (local34 == null) {
								local346 = local333;
							} else {
								local346 = local34[local333];
							}
							if (local346 == arg1) {
								Static649.method4863(local135, local271, local319, local259, local331);
								local259 += local331;
							}
							local271 += local331;
						}
					}
					local54[local261] = local319;
				} else {
					local209 = local135.length;
					local209--;
					local244 = local135[local209] & 0xFF;
					local209 -= local28 * local244 * 4;
					local257 = new Class2_Sub34(local135);
					local257.anInt8188 = local209;
					@Pc(412) int[] local412 = new int[local28];
					for (local261 = 0; local261 < local244; local261++) {
						local266 = 0;
						for (local269 = 0; local269 < local28; local269++) {
							local266 += local257.method6865();
							local412[local269] += local266;
						}
					}
					@Pc(452) byte[][] local452 = new byte[local28][];
					for (local269 = 0; local269 < local28; local269++) {
						local452[local269] = new byte[local412[local269]];
						local412[local269] = 0;
					}
					local257.anInt8188 = local209;
					local271 = 0;
					for (local284 = 0; local284 < local244; local284++) {
						local331 = 0;
						for (local333 = 0; local333 < local28; local333++) {
							local331 += local257.method6865();
							Static649.method4863(local135, local271, local452[local333], local412[local333], local331);
							local271 += local331;
							local412[local333] += local331;
						}
					}
					for (local331 = 0; local331 < local28; local331++) {
						if (local34 == null) {
							local333 = local331;
						} else {
							local333 = local34[local331];
						}
						if (this.anInt3014 == 0) {
							local54[local333] = Static609.method8332(local452[local331]);
						} else {
							local54[local333] = local452[local331];
						}
					}
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(BII)Z")
	public boolean method2561(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method2558(arg0, arg1)) {
			return false;
		} else if (this.anObjectArrayArray1[arg0] != null && this.anObjectArrayArray1[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray32[arg0] == null) {
			this.method2563(arg0);
			return this.anObjectArray32[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method2562(@OriginalArg(0) String arg0) {
		if (this.method2549()) {
			@Pc(17) String local17 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass312_1.aClass361_1.method8286(Static593.method8173(local17));
			return this.method2550(local26);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(BI)V")
	private void method2563(@OriginalArg(1) int arg0) {
		if (this.aBoolean257) {
			this.anObjectArray32[arg0] = this.aClass167_1.method6955(arg0);
		} else {
			this.anObjectArray32[arg0] = Static609.method8332(this.aClass167_1.method6955(arg0));
		}
	}

	@OriginalMember(owner = "client!eq", name = "d", descriptor = "(II)Z")
	public boolean method2564(@OriginalArg(1) int arg0) {
		if (!this.method2549()) {
			return false;
		} else if (this.aClass312_1.anIntArray617.length == 1) {
			return this.method2561(0, arg0);
		} else if (!this.method2573(arg0)) {
			return false;
		} else if (this.aClass312_1.anIntArray617[arg0] == 1) {
			return this.method2561(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IZ[II)[B")
	public byte[] method2565(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		if (!this.method2558(arg0, arg2)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg0] == null || this.anObjectArrayArray1[arg0][arg2] == null) {
			@Pc(36) boolean local36 = this.method2559(arg0, arg2, arg1);
			if (!local36) {
				this.method2563(arg0);
				local36 = this.method2559(arg0, arg2, arg1);
				if (!local36) {
					return null;
				}
			}
		}
		@Pc(63) byte[] local63 = Static187.method3389(this.anObjectArrayArray1[arg0][arg2], false);
		if (this.anInt3014 == 1) {
			this.anObjectArrayArray1[arg0][arg2] = null;
			if (this.aClass312_1.anIntArray617[arg0] == 1) {
				this.anObjectArrayArray1[arg0] = null;
			}
		} else if (this.anInt3014 == 2) {
			this.anObjectArrayArray1[arg0] = null;
		}
		return local63;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)[B")
	public byte[] method2567(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method2549()) {
			return null;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(15) String local15 = arg0.toLowerCase();
		@Pc(29) int local29 = this.aClass312_1.aClass361_1.method8286(Static593.method8173(local12));
		if (this.method2573(local29)) {
			@Pc(47) int local47 = this.aClass312_1.aClass361Array1[local29].method8286(Static593.method8173(local15));
			return this.method2545(local47, local29);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IB)I")
	public int method2568(@OriginalArg(0) int arg0) {
		if (this.method2549()) {
			@Pc(24) int local24 = this.aClass312_1.aClass361_1.method8286(arg0);
			return this.method2573(local24) ? local24 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!eq", name = "e", descriptor = "(II)I")
	public int method2569(@OriginalArg(1) int arg0) {
		return this.method2573(arg0) ? this.aClass312_1.anIntArray617[arg0] : 0;
	}

	@OriginalMember(owner = "client!eq", name = "c", descriptor = "(BI)[B")
	public byte[] method2570(@OriginalArg(1) int arg0) {
		if (!this.method2549()) {
			return null;
		} else if (this.aClass312_1.anIntArray617.length == 1) {
			return this.method2545(arg0, 0);
		} else if (!this.method2573(arg0)) {
			return null;
		} else if (this.aClass312_1.anIntArray617[arg0] == 1) {
			return this.method2545(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!eq", name = "f", descriptor = "(II)[I")
	public int[] method2571(@OriginalArg(0) int arg0) {
		if (!this.method2573(arg0)) {
			return null;
		}
		@Pc(21) int[] local21 = this.aClass312_1.anIntArrayArray81[arg0];
		if (local21 == null) {
			local21 = new int[this.aClass312_1.anIntArray620[arg0]];
			@Pc(32) int local32 = 0;
			while (local21.length > local32) {
				local21[local32] = local32++;
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(IB)V")
	public void method2572(@OriginalArg(0) int arg0) {
		if (this.method2573(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!eq", name = "c", descriptor = "(IB)Z")
	private boolean method2573(@OriginalArg(0) int arg0) {
		if (!this.method2549()) {
			return false;
		} else if (arg0 >= 0 && arg0 < this.aClass312_1.anIntArray617.length && this.aClass312_1.anIntArray617[arg0] != 0) {
			return true;
		} else if (Static284.aBoolean736) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!eq", name = "c", descriptor = "(ILjava/lang/String;)I")
	public int method2574(@OriginalArg(1) String arg0) {
		if (this.method2549()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(28) int local28 = this.aClass312_1.aClass361_1.method8286(Static593.method8173(local12));
			return this.method2573(local28) ? local28 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z")
	private boolean method2575(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method2549()) {
			return false;
		}
		@Pc(21) String local21 = arg0.toLowerCase();
		@Pc(24) String local24 = arg1.toLowerCase();
		@Pc(33) int local33 = this.aClass312_1.aClass361_1.method8286(Static593.method8173(local21));
		if (this.method2573(local33)) {
			@Pc(51) int local51 = this.aClass312_1.aClass361Array1[local33].method8286(Static593.method8173(local24));
			return this.method2561(local33, local51);
		} else {
			return false;
		}
	}
}
