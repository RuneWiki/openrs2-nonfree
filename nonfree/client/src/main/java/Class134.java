import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lm")
public final class Class134 {

	@OriginalMember(owner = "client!lm", name = "r", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!lm", name = "N", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray2;

	@OriginalMember(owner = "client!lm", name = "e", descriptor = "Lclient!og;")
	private Class150 aClass150_1 = null;

	@OriginalMember(owner = "client!lm", name = "c", descriptor = "Z")
	private final boolean aBoolean272;

	@OriginalMember(owner = "client!lm", name = "E", descriptor = "I")
	public int anInt3576;

	@OriginalMember(owner = "client!lm", name = "j", descriptor = "Lclient!jd;")
	private final Class113 aClass113_1;

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lclient!jd;ZI)V")
	public Class134(@OriginalArg(0) Class113 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.aBoolean272 = arg1;
		this.anInt3576 = arg2;
		this.aClass113_1 = arg0;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(II)[I")
	public int[] method3001(@OriginalArg(0) int arg0) {
		if (!this.method3019(arg0)) {
			return null;
		}
		@Pc(24) int[] local24 = this.aClass150_1.anIntArrayArray36[arg0];
		if (local24 == null) {
			local24 = new int[this.aClass150_1.anIntArray416[arg0]];
			@Pc(35) int local35 = 0;
			while (local24.length > local35) {
				local24[local35] = local35++;
			}
		}
		return local24;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(BII)Z")
	private boolean method3002(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method3010()) {
			return false;
		} else if (arg1 >= 0 && arg0 >= 0 && this.aClass150_1.anIntArray420.length > arg1 && this.aClass150_1.anIntArray420[arg1] > arg0) {
			return true;
		} else if (Static151.aBoolean238) {
			throw new IllegalArgumentException(arg1 + "," + arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IB)Z")
	public boolean method3003(@OriginalArg(0) int arg0) {
		if (!this.method3019(arg0)) {
			return false;
		} else if (this.anObjectArray2[arg0] == null) {
			this.method3004(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(II)V")
	private void method3004(@OriginalArg(1) int arg0) {
		if (this.aBoolean272) {
			this.anObjectArray2[arg0] = this.aClass113_1.method4971(arg0);
		} else {
			this.anObjectArray2[arg0] = Static214.method3961(this.aClass113_1.method4971(arg0));
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(ZI)Z")
	public boolean method3005(@OriginalArg(1) int arg0) {
		if (!this.method3010()) {
			return false;
		} else if (this.aClass150_1.anIntArray420.length == 1) {
			return this.method3011(0, arg0);
		} else if (!this.method3019(arg0)) {
			return false;
		} else if (this.aClass150_1.anIntArray420[arg0] == 1) {
			return this.method3011(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)I")
	public int method3006() {
		if (!this.method3010()) {
			return 0;
		}
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anObjectArray2.length; local17++) {
			if (this.aClass150_1.anIntArray416[local17] > 0) {
				local13 += 100;
				local15 += this.method3036(local17);
			}
		}
		if (local13 == 0) {
			return 100;
		} else {
			return local15 * 100 / local13;
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method3007(@OriginalArg(1) String arg0) {
		if (this.method3010()) {
			@Pc(14) String local14 = arg0.toLowerCase();
			@Pc(23) int local23 = this.aClass150_1.aClass124_1.method2688(Static173.method3115(local14));
			return local23 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(III)[B")
	public byte[] method3009(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method3026(arg0, null, arg1);
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(I)Z")
	private boolean method3010() {
		if (this.aClass150_1 == null) {
			this.aClass150_1 = this.aClass113_1.method4966();
			if (this.aClass150_1 == null) {
				return false;
			}
			this.anObjectArray2 = new Object[this.aClass150_1.anInt4533];
			this.anObjectArrayArray1 = new Object[this.aClass150_1.anInt4533][];
		}
		return true;
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(III)Z")
	public boolean method3011(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method3002(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray1[arg0] != null && this.anObjectArrayArray1[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray2[arg0] == null) {
			this.method3004(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z")
	public boolean method3012(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method3010()) {
			return false;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(15) String local15 = arg0.toLowerCase();
		@Pc(24) int local24 = this.aClass150_1.aClass124_1.method2688(Static173.method3115(local12));
		if (this.method3019(local24)) {
			@Pc(47) int local47 = this.aClass150_1.aClass124Array1[local24].method2688(Static173.method3115(local15));
			return this.method3011(local24, local47);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(B)V")
	public void method3013() {
		if (this.anObjectArray2 != null) {
			for (@Pc(14) int local14 = 0; local14 < this.anObjectArray2.length; local14++) {
				this.anObjectArray2[local14] = null;
			}
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(BI)[B")
	public byte[] method3014(@OriginalArg(1) int arg0) {
		if (!this.method3010()) {
			return null;
		} else if (this.aClass150_1.anIntArray420.length == 1) {
			return this.method3009(arg0, 0);
		} else if (!this.method3019(arg0)) {
			return null;
		} else if (this.aClass150_1.anIntArray420[arg0] == 1) {
			return this.method3009(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(BI)I")
	public int method3015(@OriginalArg(1) int arg0) {
		if (this.method3010()) {
			@Pc(23) int local23 = this.aClass150_1.aClass124_1.method2688(arg0);
			return this.method3019(local23) ? local23 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!lm", name = "c", descriptor = "(B)I")
	public int method3016() {
		return this.method3010() ? this.aClass150_1.anIntArray420.length : -1;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public int method3018(@OriginalArg(0) String arg0) {
		if (this.method3010()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass150_1.aClass124_1.method2688(Static173.method3115(local12));
			return this.method3019(local21) ? local21 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(IB)Z")
	private boolean method3019(@OriginalArg(0) int arg0) {
		if (!this.method3010()) {
			return false;
		} else if (arg0 >= 0 && arg0 < this.aClass150_1.anIntArray420.length && this.aClass150_1.anIntArray420[arg0] != 0) {
			return true;
		} else if (Static151.aBoolean238) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lm", name = "d", descriptor = "(II)I")
	public int method3020(@OriginalArg(1) int arg0) {
		return this.method3019(arg0) ? this.aClass150_1.anIntArray420[arg0] : 0;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(ZZI)V")
	public void method3021(@OriginalArg(0) boolean arg0) {
		if (!this.method3010()) {
			return;
		}
		if (arg0) {
			this.aClass150_1.anIntArray422 = null;
			this.aClass150_1.aClass124_1 = null;
		}
		this.aClass150_1.anIntArrayArray37 = null;
		this.aClass150_1.aClass124Array1 = null;
	}

	@OriginalMember(owner = "client!lm", name = "d", descriptor = "(B)V")
	public void method3022() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(14) int local14 = 0; local14 < this.anObjectArrayArray1.length; local14++) {
				this.anObjectArrayArray1[local14] = null;
			}
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method3023(@OriginalArg(0) String arg0) {
		if (this.method3010()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass150_1.aClass124_1.method2688(Static173.method3115(local12));
			return this.method3036(local26);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(ILjava/lang/String;)V")
	public void method3024(@OriginalArg(1) String arg0) {
		if (this.method3010()) {
			@Pc(11) String local11 = arg0.toLowerCase();
			@Pc(20) int local20 = this.aClass150_1.aClass124_1.method2688(Static173.method3115(local11));
			this.method3032(local20);
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IB[II)Z")
	private boolean method3025(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		if (!this.method3019(arg2)) {
			return false;
		} else if (this.anObjectArray2[arg2] == null) {
			return false;
		} else {
			@Pc(25) int local25 = this.aClass150_1.anIntArray416[arg2];
			@Pc(31) int[] local31 = this.aClass150_1.anIntArrayArray36[arg2];
			if (this.anObjectArrayArray1[arg2] == null) {
				this.anObjectArrayArray1[arg2] = new Object[this.aClass150_1.anIntArray420[arg2]];
			}
			@Pc(51) Object[] local51 = this.anObjectArrayArray1[arg2];
			@Pc(53) boolean local53 = true;
			for (@Pc(55) int local55 = 0; local55 < local25; local55++) {
				@Pc(61) int local61;
				if (local31 == null) {
					local61 = local55;
				} else {
					local61 = local31[local55];
				}
				if (local51[local61] == null) {
					local53 = false;
					break;
				}
			}
			if (local53) {
				return true;
			}
			@Pc(127) byte[] local127;
			if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
				local127 = Static261.method4721(this.anObjectArray2[arg2], false);
			} else {
				local127 = Static261.method4721(this.anObjectArray2[arg2], true);
				@Pc(132) Class1_Sub21 local132 = new Class1_Sub21(local127);
				local132.method5697(local132.aByteArray82.length, arg1);
			}
			@Pc(154) byte[] local154;
			try {
				local154 = Static99.method1590(local127);
			} catch (@Pc(156) RuntimeException local156) {
				throw Static18.method321(local156, "T3 - " + (arg1 != null) + "," + arg2 + "," + local127.length + "," + Static111.method1800(local127, local127.length) + "," + Static111.method1800(local127, local127.length - 2) + "," + this.aClass150_1.anIntArray417[arg2] + "," + this.aClass150_1.anInt4536);
			}
			if (this.aBoolean272) {
				this.anObjectArray2[arg2] = null;
			}
			@Pc(226) int local226;
			if (local25 <= 1) {
				if (local31 == null) {
					local226 = 0;
				} else {
					local226 = local31[0];
				}
				if (this.anInt3576 == 0) {
					local51[local226] = Static214.method3961(local154);
				} else {
					local51[local226] = local154;
				}
			} else {
				@Pc(266) int local266;
				@Pc(279) Class1_Sub21 local279;
				@Pc(287) int local287;
				@Pc(291) int local291;
				@Pc(293) int local293;
				@Pc(347) int local347;
				@Pc(349) int local349;
				@Pc(353) int local353;
				@Pc(355) int local355;
				if (this.anInt3576 == 2) {
					local226 = local154.length;
					local226--;
					local266 = local154[local226] & 0xFF;
					local226 -= local266 * local25 * 4;
					local279 = new Class1_Sub21(local154);
					@Pc(465) int local465 = 0;
					local279.anInt6611 = local226;
					local287 = 0;
					for (local291 = 0; local291 < local266; local291++) {
						local293 = 0;
						for (local347 = 0; local347 < local25; local347++) {
							local293 += local279.method5716();
							if (local31 == null) {
								local349 = local347;
							} else {
								local349 = local31[local347];
							}
							if (arg0 == local349) {
								local287 = local349;
								local465 += local293;
							}
						}
					}
					if (local465 == 0) {
						return true;
					}
					@Pc(524) byte[] local524 = new byte[local465];
					local279.anInt6611 = local226;
					local465 = 0;
					local347 = 0;
					for (local349 = 0; local349 < local266; local349++) {
						local353 = 0;
						for (local355 = 0; local355 < local25; local355++) {
							local353 += local279.method5716();
							@Pc(553) int local553;
							if (local31 == null) {
								local553 = local355;
							} else {
								local553 = local31[local355];
							}
							if (local553 == arg0) {
								Static361.method1853(local154, local347, local524, local465, local353);
								local465 += local353;
							}
							local347 += local353;
						}
					}
					local51[local287] = local524;
				} else {
					local226 = local154.length;
					local226--;
					local266 = local154[local226] & 0xFF;
					local226 -= local266 * local25 * 4;
					local279 = new Class1_Sub21(local154);
					@Pc(282) int[] local282 = new int[local25];
					local279.anInt6611 = local226;
					for (local287 = 0; local287 < local266; local287++) {
						local291 = 0;
						for (local293 = 0; local293 < local25; local293++) {
							local291 += local279.method5716();
							local282[local293] += local291;
						}
					}
					@Pc(323) byte[][] local323 = new byte[local25][];
					for (local293 = 0; local293 < local25; local293++) {
						local323[local293] = new byte[local282[local293]];
						local282[local293] = 0;
					}
					local279.anInt6611 = local226;
					local347 = 0;
					for (local349 = 0; local349 < local266; local349++) {
						local353 = 0;
						for (local355 = 0; local355 < local25; local355++) {
							local353 += local279.method5716();
							Static361.method1853(local154, local347, local323[local355], local282[local355], local353);
							local282[local355] += local353;
							local347 += local353;
						}
					}
					for (local353 = 0; local353 < local25; local353++) {
						if (local31 == null) {
							local355 = local353;
						} else {
							local355 = local31[local353];
						}
						if (this.anInt3576 == 0) {
							local51[local355] = Static214.method3961(local323[local353]);
						} else {
							local51[local355] = local323[local353];
						}
					}
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(II[II)[B")
	public byte[] method3026(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		if (!this.method3002(arg0, arg2)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg2] == null || this.anObjectArrayArray1[arg2][arg0] == null) {
			@Pc(30) boolean local30 = this.method3025(arg0, arg1, arg2);
			if (!local30) {
				this.method3004(arg2);
				local30 = this.method3025(arg0, arg1, arg2);
				if (!local30) {
					return null;
				}
			}
		}
		@Pc(57) byte[] local57 = Static261.method4721(this.anObjectArrayArray1[arg2][arg0], false);
		if (this.anInt3576 == 1) {
			this.anObjectArrayArray1[arg2][arg0] = null;
			if (this.aClass150_1.anIntArray420[arg2] == 1) {
				this.anObjectArrayArray1[arg2] = null;
			}
		} else if (this.anInt3576 == 2) {
			this.anObjectArrayArray1[arg2] = null;
		}
		return local57;
	}

	@OriginalMember(owner = "client!lm", name = "c", descriptor = "(I)I")
	public int method3028() {
		if (!this.method3010()) {
			throw new IllegalStateException("");
		}
		return this.aClass150_1.anInt4536;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)[B")
	public byte[] method3029(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method3010()) {
			return null;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(15) String local15 = arg0.toLowerCase();
		@Pc(24) int local24 = this.aClass150_1.aClass124_1.method2688(Static173.method3115(local12));
		if (this.method3019(local24)) {
			@Pc(48) int local48 = this.aClass150_1.aClass124Array1[local24].method2688(Static173.method3115(local15));
			return this.method3009(local48, local24);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(Ljava/lang/String;B)Z")
	public boolean method3030(@OriginalArg(0) String arg0) {
		if (this.method3010()) {
			@Pc(18) String local18 = arg0.toLowerCase();
			@Pc(27) int local27 = this.aClass150_1.aClass124_1.method2688(Static173.method3115(local18));
			return this.method3003(local27);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lm", name = "e", descriptor = "(B)Z")
	public boolean method3031() {
		if (!this.method3010()) {
			return false;
		}
		@Pc(13) boolean local13 = true;
		for (@Pc(15) int local15 = 0; local15 < this.aClass150_1.anIntArray418.length; local15++) {
			@Pc(23) int local23 = this.aClass150_1.anIntArray418[local15];
			if (this.anObjectArray2[local23] == null) {
				this.method3004(local23);
				if (this.anObjectArray2[local23] == null) {
					local13 = false;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!lm", name = "e", descriptor = "(II)V")
	private void method3032(@OriginalArg(0) int arg0) {
		this.aClass113_1.method4968(arg0);
	}

	@OriginalMember(owner = "client!lm", name = "c", descriptor = "(IB)V")
	public void method3034(@OriginalArg(0) int arg0) {
		if (this.method3019(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!lm", name = "d", descriptor = "(IB)I")
	private int method3036(@OriginalArg(0) int arg0) {
		if (this.method3019(arg0)) {
			return this.anObjectArray2[arg0] == null ? this.aClass113_1.method4964(arg0) : 100;
		} else {
			return 0;
		}
	}
}
