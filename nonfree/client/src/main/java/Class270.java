import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pu")
public final class Class270 {

	@OriginalMember(owner = "client!pu", name = "w", descriptor = "[I")
	public static final int[] anIntArray547 = new int[32];

	@OriginalMember(owner = "client!pu", name = "u", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray2;

	@OriginalMember(owner = "client!pu", name = "F", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!pu", name = "z", descriptor = "Lclient!ar;")
	private Class16 aClass16_1 = null;

	@OriginalMember(owner = "client!pu", name = "s", descriptor = "Lclient!bf;")
	private final Class29 aClass29_1;

	@OriginalMember(owner = "client!pu", name = "C", descriptor = "I")
	public int anInt7161;

	@OriginalMember(owner = "client!pu", name = "B", descriptor = "Z")
	private final boolean aBoolean571;

	static {
		@Pc(4) int local4 = 2;
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			anIntArray547[local6] = local4 - 1;
			local4 += local4;
		}
	}

	@OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(Lclient!bf;ZI)V")
	public Class270(@OriginalArg(0) Class29 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.aClass29_1 = arg0;
		this.anInt7161 = arg2;
		this.aBoolean571 = arg1;
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(II[II)[B")
	public byte[] method5670(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		if (!this.method5684(arg0, arg2)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg0] == null || this.anObjectArrayArray1[arg0][arg2] == null) {
			@Pc(30) boolean local30 = this.method5683(arg1, arg2, arg0);
			if (!local30) {
				this.method5686(arg0);
				local30 = this.method5683(arg1, arg2, arg0);
				if (!local30) {
					return null;
				}
			}
		}
		@Pc(62) byte[] local62 = Static437.method6088(false, this.anObjectArrayArray1[arg0][arg2]);
		if (this.anInt7161 == 1) {
			this.anObjectArrayArray1[arg0][arg2] = null;
			if (this.aClass16_1.anIntArray33[arg0] == 1) {
				this.anObjectArrayArray1[arg0] = null;
			}
		} else if (this.anInt7161 == 2) {
			this.anObjectArrayArray1[arg0] = null;
		}
		return local62;
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(I)Z")
	private boolean method5671() {
		if (this.aClass16_1 == null) {
			this.aClass16_1 = this.aClass29_1.method7185();
			if (this.aClass16_1 == null) {
				return false;
			}
			this.anObjectArray2 = new Object[this.aClass16_1.anInt298];
			this.anObjectArrayArray1 = new Object[this.aClass16_1.anInt298][];
		}
		return true;
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(II)I")
	public int method5672(@OriginalArg(1) int arg0) {
		if (this.method5671()) {
			@Pc(21) int local21 = this.aClass16_1.aClass174_1.method3675(arg0);
			return this.method5673(local21) ? local21 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(BI)Z")
	private boolean method5673(@OriginalArg(1) int arg0) {
		if (!this.method5671()) {
			return false;
		} else if (arg0 >= 0 && this.aClass16_1.anIntArray33.length > arg0 && this.aClass16_1.anIntArray33[arg0] != 0) {
			return true;
		} else if (Static454.aBoolean601) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(B)I")
	public int method5674() {
		return this.method5671() ? this.aClass16_1.anIntArray33.length : -1;
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)Z")
	public boolean method5675(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method5671()) {
			return false;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(15) String local15 = arg0.toLowerCase();
		@Pc(24) int local24 = this.aClass16_1.aClass174_1.method3675(Static47.method716(local12));
		if (local24 < 0) {
			return false;
		} else {
			@Pc(45) int local45 = this.aClass16_1.aClass174Array1[local24].method3675(Static47.method716(local15));
			return local45 >= 0;
		}
	}

	@OriginalMember(owner = "client!pu", name = "b", descriptor = "(I)I")
	public int method5676() {
		if (!this.method5671()) {
			throw new IllegalStateException("");
		}
		return this.aClass16_1.anInt296;
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method5677(@OriginalArg(1) String arg0) {
		if (this.method5671()) {
			@Pc(17) String local17 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass16_1.aClass174_1.method3675(Static47.method716(local17));
			return this.method5673(local26) ? local26 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!pu", name = "b", descriptor = "(BI)Z")
	public boolean method5679(@OriginalArg(1) int arg0) {
		if (!this.method5673(arg0)) {
			return false;
		} else if (this.anObjectArray2[arg0] == null) {
			this.method5686(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!pu", name = "b", descriptor = "(Ljava/lang/String;BLjava/lang/String;)Z")
	private boolean method5680(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method5671()) {
			return false;
		}
		@Pc(14) String local14 = arg0.toLowerCase();
		@Pc(17) String local17 = arg1.toLowerCase();
		@Pc(33) int local33 = this.aClass16_1.aClass174_1.method3675(Static47.method716(local14));
		if (this.method5673(local33)) {
			@Pc(51) int local51 = this.aClass16_1.aClass174Array1[local33].method3675(Static47.method716(local17));
			return this.method5688(local33, local51);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pu", name = "b", descriptor = "(II)I")
	private int method5681(@OriginalArg(1) int arg0) {
		if (this.method5673(arg0)) {
			return this.anObjectArray2[arg0] == null ? this.aClass29_1.method7183(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pu", name = "c", descriptor = "(II)V")
	private void method5682(@OriginalArg(1) int arg0) {
		this.aClass29_1.method7184(arg0);
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "([IIIB)Z")
	private boolean method5683(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.method5673(arg2)) {
			return false;
		} else if (this.anObjectArray2[arg2] == null) {
			return false;
		} else {
			@Pc(25) int local25 = this.aClass16_1.anIntArray32[arg2];
			@Pc(31) int[] local31 = this.aClass16_1.anIntArrayArray16[arg2];
			if (this.anObjectArrayArray1[arg2] == null) {
				this.anObjectArrayArray1[arg2] = new Object[this.aClass16_1.anIntArray33[arg2]];
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
			@Pc(124) byte[] local124;
			if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
				local124 = Static437.method6088(false, this.anObjectArray2[arg2]);
			} else {
				local124 = Static437.method6088(true, this.anObjectArray2[arg2]);
				@Pc(129) Class1_Sub35 local129 = new Class1_Sub35(local124);
				local129.method5754(arg0, local129.aByteArray85.length);
			}
			@Pc(151) byte[] local151;
			try {
				local151 = Static490.method6643(local124);
			} catch (@Pc(153) RuntimeException local153) {
				throw Static418.method5811(local153, "T3 - " + (arg0 != null) + "," + arg2 + "," + local124.length + "," + Static370.method4985(local124.length, local124) + "," + Static370.method4985(local124.length - 2, local124) + "," + this.aClass16_1.anIntArray31[arg2] + "," + this.aClass16_1.anInt296);
			}
			if (this.aBoolean571) {
				this.anObjectArray2[arg2] = null;
			}
			@Pc(230) int local230;
			if (local25 > 1) {
				@Pc(237) int local237;
				@Pc(250) Class1_Sub35 local250;
				@Pc(254) int local254;
				@Pc(259) int local259;
				@Pc(263) int local263;
				@Pc(265) int local265;
				@Pc(279) int local279;
				@Pc(323) int local323;
				@Pc(325) int local325;
				if (this.anInt7161 == 2) {
					local230 = local151.length;
					@Pc(233) int local233 = local230 - 1;
					local237 = local151[local233] & 0xFF;
					@Pc(245) int local245 = local233 - local237 * 4 * local25;
					local250 = new Class1_Sub35(local151);
					@Pc(252) int local252 = 0;
					local254 = 0;
					local250.anInt7214 = local245;
					for (local259 = 0; local259 < local237; local259++) {
						local263 = 0;
						for (local265 = 0; local265 < local25; local265++) {
							local263 += local250.method5804();
							if (local31 == null) {
								local279 = local265;
							} else {
								local279 = local31[local265];
							}
							if (local279 == arg1) {
								local254 = local279;
								local252 += local263;
							}
						}
					}
					if (local252 == 0) {
						return true;
					}
					@Pc(310) byte[] local310 = new byte[local252];
					local252 = 0;
					local250.anInt7214 = local245;
					local265 = 0;
					for (local279 = 0; local279 < local237; local279++) {
						local323 = 0;
						for (local325 = 0; local325 < local25; local325++) {
							local323 += local250.method5804();
							@Pc(339) int local339;
							if (local31 == null) {
								local339 = local325;
							} else {
								local339 = local31[local325];
							}
							if (local339 == arg1) {
								Static598.method1173(local151, local265, local310, local252, local323);
								local252 += local323;
							}
							local265 += local323;
						}
					}
					local51[local254] = local310;
				} else {
					local230 = local151.length;
					local230--;
					local237 = local151[local230] & 0xFF;
					local230 -= local25 * local237 * 4;
					local250 = new Class1_Sub35(local151);
					@Pc(408) int[] local408 = new int[local25];
					local250.anInt7214 = local230;
					for (local254 = 0; local254 < local237; local254++) {
						local259 = 0;
						for (local263 = 0; local263 < local25; local263++) {
							local259 += local250.method5804();
							local408[local263] += local259;
						}
					}
					@Pc(453) byte[][] local453 = new byte[local25][];
					for (local263 = 0; local263 < local25; local263++) {
						local453[local263] = new byte[local408[local263]];
						local408[local263] = 0;
					}
					local250.anInt7214 = local230;
					local265 = 0;
					for (local279 = 0; local279 < local237; local279++) {
						local323 = 0;
						for (local325 = 0; local325 < local25; local325++) {
							local323 += local250.method5804();
							Static598.method1173(local151, local265, local453[local325], local408[local325], local323);
							local265 += local323;
							local408[local325] += local323;
						}
					}
					for (local323 = 0; local323 < local25; local323++) {
						if (local31 == null) {
							local325 = local323;
						} else {
							local325 = local31[local323];
						}
						if (this.anInt7161 == 0) {
							local51[local325] = Static476.method6489(local453[local323]);
						} else {
							local51[local325] = local453[local323];
						}
					}
				}
			} else {
				if (local31 == null) {
					local230 = 0;
				} else {
					local230 = local31[0];
				}
				if (this.anInt7161 == 0) {
					local51[local230] = Static476.method6489(local151);
				} else {
					local51[local230] = local151;
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(IIB)Z")
	private boolean method5684(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method5671()) {
			return false;
		} else if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aClass16_1.anIntArray33.length && this.aClass16_1.anIntArray33[arg0] > arg1) {
			return true;
		} else if (Static454.aBoolean601) {
			throw new IllegalArgumentException(arg0 + "," + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pu", name = "d", descriptor = "(II)I")
	public int method5685(@OriginalArg(1) int arg0) {
		return this.method5673(arg0) ? this.aClass16_1.anIntArray33[arg0] : 0;
	}

	@OriginalMember(owner = "client!pu", name = "e", descriptor = "(II)V")
	private void method5686(@OriginalArg(0) int arg0) {
		if (this.aBoolean571) {
			this.anObjectArray2[arg0] = this.aClass29_1.method7181(arg0);
		} else {
			this.anObjectArray2[arg0] = Static476.method6489(this.aClass29_1.method7181(arg0));
		}
	}

	@OriginalMember(owner = "client!pu", name = "c", descriptor = "(I)I")
	public int method5687() {
		if (!this.method5671()) {
			return 0;
		}
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = 0;
		for (@Pc(22) int local22 = 0; local22 < this.anObjectArray2.length; local22++) {
			if (this.aClass16_1.anIntArray32[local22] > 0) {
				local18 += 100;
				local20 += this.method5681(local22);
			}
		}
		if (local18 == 0) {
			return 100;
		} else {
			return local20 * 100 / local18;
		}
	}

	@OriginalMember(owner = "client!pu", name = "b", descriptor = "(IIB)Z")
	public boolean method5688(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method5684(arg0, arg1)) {
			return false;
		} else if (this.anObjectArrayArray1[arg0] != null && this.anObjectArrayArray1[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray2[arg0] == null) {
			this.method5686(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public boolean method5689(@OriginalArg(1) String arg0) {
		if (this.method5671()) {
			@Pc(19) String local19 = arg0.toLowerCase();
			@Pc(28) int local28 = this.aClass16_1.aClass174_1.method3675(Static47.method716(local19));
			return local28 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pu", name = "d", descriptor = "(I)V")
	public void method5690() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anObjectArrayArray1.length; local6++) {
				this.anObjectArrayArray1[local6] = null;
			}
		}
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(IB)[B")
	public byte[] method5691(@OriginalArg(0) int arg0) {
		if (!this.method5671()) {
			return null;
		} else if (this.aClass16_1.anIntArray33.length == 1) {
			return this.method5704(0, arg0);
		} else if (!this.method5673(arg0)) {
			return null;
		} else if (this.aClass16_1.anIntArray33[arg0] == 1) {
			return this.method5704(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pu", name = "f", descriptor = "(II)V")
	public void method5692(@OriginalArg(0) int arg0) {
		if (this.method5673(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public int method5693(@OriginalArg(0) String arg0) {
		if (this.method5671()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass16_1.aClass174_1.method3675(Static47.method716(local12));
			return this.method5681(local26);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pu", name = "c", descriptor = "(BI)Z")
	public boolean method5694(@OriginalArg(1) int arg0) {
		if (!this.method5671()) {
			return false;
		} else if (this.aClass16_1.anIntArray33.length == 1) {
			return this.method5688(0, arg0);
		} else if (!this.method5673(arg0)) {
			return false;
		} else if (this.aClass16_1.anIntArray33[arg0] == 1) {
			return this.method5688(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pu", name = "c", descriptor = "(B)V")
	public void method5696() {
		if (this.anObjectArray2 != null) {
			for (@Pc(16) int local16 = 0; local16 < this.anObjectArray2.length; local16++) {
				this.anObjectArray2[local16] = null;
			}
		}
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(ZZB)V")
	public void method5697(@OriginalArg(1) boolean arg0) {
		if (!this.method5671()) {
			return;
		}
		this.aClass16_1.aClass174Array1 = null;
		this.aClass16_1.anIntArrayArray17 = null;
		if (arg0) {
			this.aClass16_1.aClass174_1 = null;
			this.aClass16_1.anIntArray34 = null;
		}
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
	public boolean method5698(@OriginalArg(0) String arg0) {
		if (this.method5671()) {
			@Pc(17) String local17 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass16_1.aClass174_1.method3675(Static47.method716(local17));
			return this.method5679(local26);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pu", name = "g", descriptor = "(II)[I")
	public int[] method5699(@OriginalArg(0) int arg0) {
		if (!this.method5673(arg0)) {
			return null;
		}
		@Pc(23) int[] local23 = this.aClass16_1.anIntArrayArray16[arg0];
		if (local23 == null) {
			local23 = new int[this.aClass16_1.anIntArray32[arg0]];
			@Pc(34) int local34 = 0;
			while (local23.length > local34) {
				local23[local34] = local34++;
			}
		}
		return local23;
	}

	@OriginalMember(owner = "client!pu", name = "e", descriptor = "(I)Z")
	public boolean method5701() {
		if (!this.method5671()) {
			return false;
		}
		@Pc(13) boolean local13 = true;
		for (@Pc(15) int local15 = 0; local15 < this.aClass16_1.anIntArray35.length; local15++) {
			@Pc(23) int local23 = this.aClass16_1.anIntArray35[local15];
			if (this.anObjectArray2[local23] == null) {
				this.method5686(local23);
				if (this.anObjectArray2[local23] == null) {
					local13 = false;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!pu", name = "b", descriptor = "(Ljava/lang/String;B)Z")
	public boolean method5703(@OriginalArg(0) String arg0) {
		@Pc(13) int local13 = this.method5677("");
		return local13 == -1 ? this.method5680(arg0, "") : this.method5680("", arg0);
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(III)[B")
	public byte[] method5704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method5670(arg0, null, arg1);
	}

	@OriginalMember(owner = "client!pu", name = "b", descriptor = "(BLjava/lang/String;)V")
	public void method5705(@OriginalArg(1) String arg0) {
		if (this.method5671()) {
			@Pc(15) String local15 = arg0.toLowerCase();
			@Pc(24) int local24 = this.aClass16_1.aClass174_1.method3675(Static47.method716(local15));
			this.method5682(local24);
		}
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B")
	public byte[] method5706(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method5671()) {
			return null;
		}
		@Pc(14) String local14 = arg1.toLowerCase();
		@Pc(17) String local17 = arg0.toLowerCase();
		@Pc(26) int local26 = this.aClass16_1.aClass174_1.method3675(Static47.method716(local14));
		if (this.method5673(local26)) {
			@Pc(48) int local48 = this.aClass16_1.aClass174Array1[local26].method3675(Static47.method716(local17));
			return this.method5704(local26, local48);
		} else {
			return null;
		}
	}
}
