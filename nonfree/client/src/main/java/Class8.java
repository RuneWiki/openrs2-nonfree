import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class8 {

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!ae", name = "J", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray1;

	@OriginalMember(owner = "client!ae", name = "p", descriptor = "Lclient!oga;")
	private Class254 aClass254_1 = null;

	@OriginalMember(owner = "client!ae", name = "e", descriptor = "Lclient!sia;")
	private final Class222 aClass222_1;

	@OriginalMember(owner = "client!ae", name = "u", descriptor = "Z")
	private final boolean aBoolean20;

	@OriginalMember(owner = "client!ae", name = "H", descriptor = "I")
	public int anInt268;

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(Lclient!sia;ZI)V")
	public Class8(@OriginalArg(0) Class222 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (arg2 < 0 || arg2 > 2) {
			throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
		}
		this.aClass222_1 = arg0;
		this.aBoolean20 = arg1;
		this.anInt268 = arg2;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
	public void method249() {
		if (this.anObjectArray1 != null) {
			for (@Pc(13) int local13 = 0; local13 < this.anObjectArray1.length; local13++) {
				this.anObjectArray1[local13] = null;
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public boolean method250(@OriginalArg(1) String arg0) {
		if (this.method253()) {
			@Pc(19) String local19 = arg0.toLowerCase();
			@Pc(28) int local28 = this.aClass254_1.aClass175_1.method4069(Static429.method8203(local19));
			return this.method278(local28);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)Z")
	private boolean method251(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method253()) {
			return false;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(23) String local23 = arg1.toLowerCase();
		@Pc(32) int local32 = this.aClass254_1.aClass175_1.method4069(Static429.method8203(local12));
		if (this.method268(local32)) {
			@Pc(50) int local50 = this.aClass254_1.aClass175Array1[local32].method4069(Static429.method8203(local23));
			return this.method275(local50, local32);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method252(@OriginalArg(1) String arg0) {
		if (this.method253()) {
			@Pc(18) String local18 = arg0.toLowerCase();
			@Pc(27) int local27 = this.aClass254_1.aClass175_1.method4069(Static429.method8203(local18));
			return this.method268(local27) ? local27 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)Z")
	private boolean method253() {
		if (this.aClass254_1 == null) {
			this.aClass254_1 = this.aClass222_1.method5285();
			if (this.aClass254_1 == null) {
				return false;
			}
			this.anObjectArray1 = new Object[this.aClass254_1.anInt7291];
			this.anObjectArrayArray1 = new Object[this.aClass254_1.anInt7291][];
		}
		return true;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(BI)I")
	public int method254(@OriginalArg(1) int arg0) {
		if (this.method253()) {
			@Pc(26) int local26 = this.aClass254_1.aClass175_1.method4069(arg0);
			return this.method268(local26) ? local26 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZI)V")
	private void method255(@OriginalArg(1) int arg0) {
		if (this.aBoolean20) {
			this.anObjectArray1[arg0] = this.aClass222_1.method5283(arg0);
		} else {
			this.anObjectArray1[arg0] = Static486.method7063(this.aClass222_1.method5283(arg0));
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(I[III)Z")
	private boolean method256(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		if (!this.method268(arg0)) {
			return false;
		} else if (this.anObjectArray1[arg0] == null) {
			return false;
		} else {
			@Pc(25) int local25 = this.aClass254_1.anIntArray450[arg0];
			@Pc(31) int[] local31 = this.aClass254_1.anIntArrayArray38[arg0];
			if (this.anObjectArrayArray1[arg0] == null) {
				this.anObjectArrayArray1[arg0] = new Object[this.aClass254_1.anIntArray446[arg0]];
			}
			@Pc(57) Object[] local57 = this.anObjectArrayArray1[arg0];
			@Pc(59) boolean local59 = true;
			for (@Pc(61) int local61 = 0; local61 < local25; local61++) {
				@Pc(69) int local69;
				if (local31 == null) {
					local69 = local61;
				} else {
					local69 = local31[local61];
				}
				if (local57[local69] == null) {
					local59 = false;
					break;
				}
			}
			if (local59) {
				return true;
			}
			@Pc(119) byte[] local119;
			if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
				local119 = Static519.method7337(this.anObjectArray1[arg0], false);
			} else {
				local119 = Static519.method7337(this.anObjectArray1[arg0], true);
				@Pc(124) Class6_Sub23 local124 = new Class6_Sub23(local119);
				local124.method8355(local124.aByteArray101.length, arg1);
			}
			@Pc(146) byte[] local146;
			try {
				local146 = Static75.method1314(local119);
			} catch (@Pc(148) RuntimeException local148) {
				throw Static329.method5409(local148, "T3 - " + (arg1 != null) + "," + arg0 + "," + local119.length + "," + Static332.method6605(local119, local119.length) + "," + Static332.method6605(local119, local119.length - 2) + "," + this.aClass254_1.anIntArray451[arg0] + "," + this.aClass254_1.anInt7289);
			}
			if (this.aBoolean20) {
				this.anObjectArray1[arg0] = null;
			}
			@Pc(220) int local220;
			if (local25 <= 1) {
				if (local31 == null) {
					local220 = 0;
				} else {
					local220 = local31[0];
				}
				if (this.anInt268 == 0) {
					local57[local220] = Static486.method7063(local146);
				} else {
					local57[local220] = local146;
				}
			} else {
				@Pc(261) int local261;
				@Pc(274) Class6_Sub23 local274;
				@Pc(281) int local281;
				@Pc(283) int local283;
				@Pc(287) int local287;
				@Pc(289) int local289;
				@Pc(303) int local303;
				@Pc(351) int local351;
				@Pc(353) int local353;
				if (this.anInt268 == 2) {
					local220 = local146.length;
					local220--;
					local261 = local146[local220] & 0xFF;
					local220 -= local261 * 4 * local25;
					local274 = new Class6_Sub23(local146);
					@Pc(276) int local276 = 0;
					local274.anInt9901 = local220;
					local281 = 0;
					for (local283 = 0; local283 < local261; local283++) {
						local287 = 0;
						for (local289 = 0; local289 < local25; local289++) {
							local287 += local274.method8369();
							if (local31 == null) {
								local303 = local289;
							} else {
								local303 = local31[local289];
							}
							if (local303 == arg2) {
								local276 += local287;
								local281 = local303;
							}
						}
					}
					if (local276 == 0) {
						return true;
					}
					@Pc(338) byte[] local338 = new byte[local276];
					local274.anInt9901 = local220;
					local276 = 0;
					local289 = 0;
					for (local303 = 0; local303 < local261; local303++) {
						local351 = 0;
						for (local353 = 0; local353 < local25; local353++) {
							local351 += local274.method8369();
							@Pc(365) int local365;
							if (local31 == null) {
								local365 = local353;
							} else {
								local365 = local31[local353];
							}
							if (local365 == arg2) {
								Static679.method1563(local146, local289, local338, local276, local351);
								local276 += local351;
							}
							local289 += local351;
						}
					}
					local57[local281] = local338;
				} else {
					local220 = local146.length;
					local220--;
					local261 = local146[local220] & 0xFF;
					local220 -= local261 * 4 * local25;
					local274 = new Class6_Sub23(local146);
					@Pc(428) int[] local428 = new int[local25];
					local274.anInt9901 = local220;
					for (local281 = 0; local281 < local261; local281++) {
						local283 = 0;
						for (local287 = 0; local287 < local25; local287++) {
							local283 += local274.method8369();
							local428[local287] += local283;
						}
					}
					@Pc(469) byte[][] local469 = new byte[local25][];
					for (local287 = 0; local287 < local25; local287++) {
						local469[local287] = new byte[local428[local287]];
						local428[local287] = 0;
					}
					local274.anInt9901 = local220;
					local289 = 0;
					for (local303 = 0; local303 < local261; local303++) {
						local351 = 0;
						for (local353 = 0; local353 < local25; local353++) {
							local351 += local274.method8369();
							Static679.method1563(local146, local289, local469[local353], local428[local353], local351);
							local428[local353] += local351;
							local289 += local351;
						}
					}
					for (local351 = 0; local351 < local25; local351++) {
						if (local31 == null) {
							local353 = local351;
						} else {
							local353 = local31[local351];
						}
						if (this.anInt268 == 0) {
							local57[local353] = Static486.method7063(local469[local351]);
						} else {
							local57[local353] = local469[local351];
						}
					}
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)V")
	public void method257() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.anObjectArrayArray1.length; local10++) {
				this.anObjectArrayArray1[local10] = null;
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(BLjava/lang/String;)Z")
	public boolean method258(@OriginalArg(1) String arg0) {
		if (this.method253()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass254_1.aClass175_1.method4069(Static429.method8203(local12));
			return local29 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;)Z")
	public boolean method259(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method253()) {
			return false;
		}
		@Pc(20) String local20 = arg1.toLowerCase();
		@Pc(23) String local23 = arg0.toLowerCase();
		@Pc(32) int local32 = this.aClass254_1.aClass175_1.method4069(Static429.method8203(local20));
		if (local32 < 0) {
			return false;
		} else {
			@Pc(47) int local47 = this.aClass254_1.aClass175Array1[local32].method4069(Static429.method8203(local23));
			return local47 >= 0;
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIB)Z")
	private boolean method260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method253()) {
			return false;
		} else if (arg0 >= 0 && arg1 >= 0 && this.aClass254_1.anIntArray446.length > arg0 && arg1 < this.aClass254_1.anIntArray446[arg0]) {
			return true;
		} else if (Static159.aBoolean165) {
			throw new IllegalArgumentException(arg0 + "," + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IB[II)[B")
	public byte[] method261(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		if (!this.method260(arg0, arg2)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg0] == null || this.anObjectArrayArray1[arg0][arg2] == null) {
			@Pc(35) boolean local35 = this.method256(arg0, arg1, arg2);
			if (!local35) {
				this.method255(arg0);
				local35 = this.method256(arg0, arg1, arg2);
				if (!local35) {
					return null;
				}
			}
		}
		@Pc(62) byte[] local62 = Static519.method7337(this.anObjectArrayArray1[arg0][arg2], false);
		if (this.anInt268 == 1) {
			this.anObjectArrayArray1[arg0][arg2] = null;
			if (this.aClass254_1.anIntArray446[arg0] == 1) {
				this.anObjectArrayArray1[arg0] = null;
			}
		} else if (this.anInt268 == 2) {
			this.anObjectArrayArray1[arg0] = null;
		}
		return local62;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IBI)[B")
	public byte[] method262(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.method261(arg1, (int[]) null, arg0);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)[I")
	public int[] method263(@OriginalArg(0) int arg0) {
		if (!this.method268(arg0)) {
			return null;
		}
		@Pc(25) int[] local25 = this.aClass254_1.anIntArrayArray38[arg0];
		if (local25 == null) {
			local25 = new int[this.aClass254_1.anIntArray450[arg0]];
			@Pc(36) int local36 = 0;
			while (local36 < local25.length) {
				local25[local36] = local36++;
			}
		}
		return local25;
	}

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "(I)Z")
	public boolean method264() {
		if (!this.method253()) {
			return false;
		}
		@Pc(13) boolean local13 = true;
		for (@Pc(15) int local15 = 0; local15 < this.aClass254_1.anIntArray447.length; local15++) {
			@Pc(23) int local23 = this.aClass254_1.anIntArray447[local15];
			if (this.anObjectArray1[local23] == null) {
				this.method255(local23);
				if (this.anObjectArray1[local23] == null) {
					local13 = false;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "(I)I")
	public int method265() {
		if (!this.method253()) {
			throw new IllegalStateException("");
		}
		return this.aClass254_1.anInt7289;
	}

	@OriginalMember(owner = "client!ae", name = "e", descriptor = "(I)I")
	public int method266() {
		if (!this.method253()) {
			return 0;
		}
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anObjectArray1.length; local17++) {
			if (this.aClass254_1.anIntArray450[local17] > 0) {
				local15 += this.method269(local17);
				local13 += 100;
			}
		}
		if (local13 == 0) {
			return 100;
		} else {
			return local15 * 100 / local13;
		}
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(II)[B")
	public byte[] method267(@OriginalArg(1) int arg0) {
		if (!this.method253()) {
			return null;
		} else if (this.aClass254_1.anIntArray446.length == 1) {
			return this.method262(arg0, 0);
		} else if (!this.method268(arg0)) {
			return null;
		} else if (this.aClass254_1.anIntArray446[arg0] == 1) {
			return this.method262(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "(II)Z")
	private boolean method268(@OriginalArg(0) int arg0) {
		if (!this.method253()) {
			return false;
		} else if (arg0 >= 0 && this.aClass254_1.anIntArray446.length > arg0 && this.aClass254_1.anIntArray446[arg0] != 0) {
			return true;
		} else if (Static159.aBoolean165) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "(II)I")
	private int method269(@OriginalArg(1) int arg0) {
		if (this.method268(arg0)) {
			return this.anObjectArray1[arg0] == null ? this.aClass222_1.method5284(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ae", name = "e", descriptor = "(II)V")
	public void method270(@OriginalArg(0) int arg0) {
		if (this.method268(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public void method271(@OriginalArg(0) String arg0) {
		if (this.method253()) {
			@Pc(11) String local11 = arg0.toLowerCase();
			@Pc(20) int local20 = this.aClass254_1.aClass175_1.method4069(Static429.method8203(local11));
			this.method276(local20);
		}
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(ILjava/lang/String;)Z")
	public boolean method272(@OriginalArg(1) String arg0) {
		@Pc(14) int local14 = this.method252("");
		return local14 == -1 ? this.method251(arg0, "") : this.method251("", arg0);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IB)Z")
	public boolean method273(@OriginalArg(0) int arg0) {
		if (!this.method253()) {
			return false;
		} else if (this.aClass254_1.anIntArray446.length == 1) {
			return this.method275(arg0, 0);
		} else if (!this.method268(arg0)) {
			return false;
		} else if (this.aClass254_1.anIntArray446[arg0] == 1) {
			return this.method275(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/String;)[B")
	public byte[] method274(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method253()) {
			return null;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(15) String local15 = arg1.toLowerCase();
		@Pc(29) int local29 = this.aClass254_1.aClass175_1.method4069(Static429.method8203(local12));
		if (this.method268(local29)) {
			@Pc(47) int local47 = this.aClass254_1.aClass175Array1[local29].method4069(Static429.method8203(local15));
			return this.method262(local47, local29);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(III)Z")
	public boolean method275(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method260(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray1[arg1] != null && this.anObjectArrayArray1[arg1][arg0] != null) {
			return true;
		} else if (this.anObjectArray1[arg1] == null) {
			this.method255(arg1);
			return this.anObjectArray1[arg1] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(BI)V")
	private void method276(@OriginalArg(1) int arg0) {
		this.aClass222_1.method5287(arg0);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZZI)V")
	public void method277(@OriginalArg(1) boolean arg0) {
		if (!this.method253()) {
			return;
		}
		if (arg0) {
			this.aClass254_1.anIntArray449 = null;
			this.aClass254_1.aClass175_1 = null;
		}
		this.aClass254_1.anIntArrayArray37 = null;
		this.aClass254_1.aClass175Array1 = null;
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(IB)Z")
	public boolean method278(@OriginalArg(0) int arg0) {
		if (!this.method268(arg0)) {
			return false;
		} else if (this.anObjectArray1[arg0] == null) {
			this.method255(arg0);
			return this.anObjectArray1[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(B)I")
	public int method279() {
		return this.method253() ? this.aClass254_1.anIntArray446.length : -1;
	}

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "(IB)I")
	public int method280(@OriginalArg(0) int arg0) {
		return this.method268(arg0) ? this.aClass254_1.anIntArray446[arg0] : 0;
	}

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "(ILjava/lang/String;)I")
	public int method281(@OriginalArg(1) String arg0) {
		if (this.method253()) {
			@Pc(17) String local17 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass254_1.aClass175_1.method4069(Static429.method8203(local17));
			return this.method269(local26);
		} else {
			return 0;
		}
	}
}
