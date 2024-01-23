import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pk")
public final class Class132 {

	@OriginalMember(owner = "client!pk", name = "z", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray2;

	@OriginalMember(owner = "client!pk", name = "K", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!pk", name = "T", descriptor = "Lclient!se;")
	private Class152 aClass152_2 = null;

	@OriginalMember(owner = "client!pk", name = "F", descriptor = "Z")
	private boolean aBoolean341;

	@OriginalMember(owner = "client!pk", name = "q", descriptor = "Lclient!wa;")
	private Class46 aClass46_1;

	@OriginalMember(owner = "client!pk", name = "u", descriptor = "Z")
	private boolean aBoolean339;

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Lclient!wa;ZZ)V")
	public Class132(@OriginalArg(0) Class46 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		this.aBoolean341 = arg2;
		this.aClass46_1 = arg0;
		this.aBoolean339 = arg1;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)[B")
	public byte[] method3162(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method3183()) {
			return null;
		}
		@Pc(19) String local19 = arg0.toLowerCase();
		@Pc(22) String local22 = arg1.toLowerCase();
		@Pc(31) int local31 = this.aClass152_2.aClass155_1.method3693(Static294.method4286(local19));
		if (this.method3174(local31)) {
			@Pc(49) int local49 = this.aClass152_2.aClass155Array1[local31].method3693(Static294.method4286(local22));
			return this.method3194(local31, local49);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "([IIII)[B")
	public byte[] method3163(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.method3172(arg1, arg2)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg1] == null || this.anObjectArrayArray1[arg1][arg2] == null) {
			@Pc(31) boolean local31 = this.method3186(arg1, arg0);
			if (!local31) {
				this.method3191(arg1);
				local31 = this.method3186(arg1, arg0);
				if (!local31) {
					return null;
				}
			}
		}
		@Pc(59) byte[] local59 = Static37.method3010(false, this.anObjectArrayArray1[arg1][arg2]);
		if (this.aBoolean341) {
			this.anObjectArrayArray1[arg1][arg2] = null;
			if (this.aClass152_2.anIntArray359[arg1] == 1) {
				this.anObjectArrayArray1[arg1] = null;
			}
		}
		return local59;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZBZ)V")
	public void method3164(@OriginalArg(2) boolean arg0) {
		if (!this.method3183()) {
			return;
		}
		if (arg0) {
			this.aClass152_2.aClass155_1 = null;
			this.aClass152_2.anIntArray363 = null;
		}
		this.aClass152_2.anIntArrayArray31 = null;
		this.aClass152_2.aClass155Array1 = null;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(BLjava/lang/String;)V")
	public void method3165(@OriginalArg(1) String arg0) {
		if (this.method3183()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass152_2.aClass155_1.method3693(Static294.method4286(local12));
			this.method3175(local21);
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(BI)Z")
	public boolean method3166(@OriginalArg(1) int arg0) {
		if (!this.method3183()) {
			return false;
		} else if (this.aClass152_2.anIntArray359.length == 1) {
			return this.method3180(arg0, 0);
		} else if (!this.method3174(arg0)) {
			return false;
		} else if (this.aClass152_2.anIntArray359[arg0] == 1) {
			return this.method3180(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IB)[I")
	public int[] method3167(@OriginalArg(0) int arg0) {
		if (!this.method3174(arg0)) {
			return null;
		}
		@Pc(17) int[] local17 = this.aClass152_2.anIntArrayArray32[arg0];
		if (local17 == null) {
			local17 = new int[this.aClass152_2.anIntArray361[arg0]];
			@Pc(37) int local37 = 0;
			while (local37 < local17.length) {
				local17[local37] = local37++;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(B)I")
	public int method3169() {
		if (!this.method3183()) {
			return 0;
		}
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		for (@Pc(24) int local24 = 0; local24 < this.anObjectArray2.length; local24++) {
			if (this.aClass152_2.anIntArray361[local24] > 0) {
				local16 += this.method3190(local24);
				local14 += 100;
			}
		}
		if (local14 == 0) {
			return 100;
		} else {
			return local16 * 100 / local14;
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZLjava/lang/String;)Z")
	public boolean method3170(@OriginalArg(1) String arg0) {
		if (this.method3183()) {
			@Pc(17) String local17 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass152_2.aClass155_1.method3693(Static294.method4286(local17));
			return local26 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(III)Z")
	private boolean method3172(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method3183()) {
			return false;
		} else if (arg0 >= 0 && arg1 >= 0 && this.aClass152_2.anIntArray359.length > arg0 && this.aClass152_2.anIntArray359[arg0] > arg1) {
			return true;
		} else if (Static204.aBoolean340) {
			throw new IllegalArgumentException(arg0 + "," + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "(B)I")
	public int method3173() {
		if (!this.method3183()) {
			throw new IllegalStateException("");
		}
		return this.aClass152_2.anInt4792;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(II)Z")
	private boolean method3174(@OriginalArg(0) int arg0) {
		if (!this.method3183()) {
			return false;
		} else if (arg0 >= 0 && this.aClass152_2.anIntArray359.length > arg0 && this.aClass152_2.anIntArray359[arg0] != 0) {
			return true;
		} else if (Static204.aBoolean340) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZI)V")
	private void method3175(@OriginalArg(1) int arg0) {
		this.aClass46_1.method972(arg0);
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IZ)V")
	public void method3176(@OriginalArg(0) int arg0) {
		if (this.method3174(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "(II)[B")
	public byte[] method3177(@OriginalArg(1) int arg0) {
		if (!this.method3183()) {
			return null;
		} else if (this.aClass152_2.anIntArray359.length == 1) {
			return this.method3194(0, arg0);
		} else if (!this.method3174(arg0)) {
			return null;
		} else if (this.aClass152_2.anIntArray359[arg0] == 1) {
			return this.method3194(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method3178(@OriginalArg(1) String arg0) {
		if (this.method3183()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(23) int local23 = this.aClass152_2.aClass155_1.method3693(Static294.method4286(local12));
			return this.method3192(local23);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z")
	public boolean method3179(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method3183()) {
			return false;
		}
		@Pc(21) String local21 = arg0.toLowerCase();
		@Pc(24) String local24 = arg1.toLowerCase();
		@Pc(33) int local33 = this.aClass152_2.aClass155_1.method3693(Static294.method4286(local21));
		if (this.method3174(local33)) {
			@Pc(52) int local52 = this.aClass152_2.aClass155Array1[local33].method3693(Static294.method4286(local24));
			return this.method3180(local52, local33);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIZ)Z")
	public boolean method3180(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method3172(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray1[arg1] != null && this.anObjectArrayArray1[arg1][arg0] != null) {
			return true;
		} else if (this.anObjectArray2[arg1] == null) {
			this.method3191(arg1);
			return this.anObjectArray2[arg1] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "(BLjava/lang/String;)I")
	public int method3182(@OriginalArg(1) String arg0) {
		if (this.method3183()) {
			@Pc(18) String local18 = arg0.toLowerCase();
			@Pc(27) int local27 = this.aClass152_2.aClass155_1.method3693(Static294.method4286(local18));
			return this.method3190(local27);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Z)Z")
	private boolean method3183() {
		if (this.aClass152_2 == null) {
			this.aClass152_2 = this.aClass46_1.method971();
			if (this.aClass152_2 == null) {
				return false;
			}
			this.anObjectArrayArray1 = new Object[this.aClass152_2.anInt4797][];
			this.anObjectArray2 = new Object[this.aClass152_2.anInt4797];
		}
		return true;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIB)[B")
	public byte[] method3184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method3172(arg0, arg1)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg0] == null || this.anObjectArrayArray1[arg0][arg1] == null) {
			@Pc(39) boolean local39 = this.method3186(arg0, null);
			if (!local39) {
				this.method3191(arg0);
				local39 = this.method3186(arg0, null);
				if (!local39) {
					return null;
				}
			}
		}
		return Static37.method3010(false, this.anObjectArrayArray1[arg0][arg1]);
	}

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "(ILjava/lang/String;)I")
	public int method3185(@OriginalArg(1) String arg0) {
		if (this.method3183()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass152_2.aClass155_1.method3693(Static294.method4286(local12));
			return this.method3174(local21) ? local21 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(I[II)Z")
	private boolean method3186(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (!this.method3174(arg0)) {
			return false;
		} else if (this.anObjectArray2[arg0] == null) {
			return false;
		} else {
			@Pc(25) int[] local25 = this.aClass152_2.anIntArrayArray32[arg0];
			@Pc(31) int local31 = this.aClass152_2.anIntArray361[arg0];
			if (this.anObjectArrayArray1[arg0] == null) {
				this.anObjectArrayArray1[arg0] = new Object[this.aClass152_2.anIntArray359[arg0]];
			}
			@Pc(52) Object[] local52 = this.anObjectArrayArray1[arg0];
			@Pc(54) boolean local54 = true;
			for (@Pc(56) int local56 = 0; local56 < local31; local56++) {
				@Pc(68) int local68;
				if (local25 == null) {
					local68 = local56;
				} else {
					local68 = local25[local56];
				}
				if (local52[local68] == null) {
					local54 = false;
					break;
				}
			}
			if (local54) {
				return true;
			}
			@Pc(122) byte[] local122;
			if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
				local122 = Static37.method3010(false, this.anObjectArray2[arg0]);
			} else {
				local122 = Static37.method3010(true, this.anObjectArray2[arg0]);
				@Pc(136) Class8_Sub2 local136 = new Class8_Sub2(local122);
				local136.method2373(local136.aByteArray24.length, arg1);
			}
			@Pc(155) byte[] local155;
			try {
				local155 = Static258.method3875(local122);
			} catch (@Pc(157) RuntimeException local157) {
				throw Static123.method1975(local157, "T3 - " + (arg1 != null) + "," + arg0 + "," + local122.length + "," + Static94.method1495(local122, local122.length) + "," + Static94.method1495(local122, local122.length - 2) + "," + this.aClass152_2.anIntArray362[arg0] + "," + this.aClass152_2.anInt4792);
			}
			if (this.aBoolean339) {
				this.anObjectArray2[arg0] = null;
			}
			@Pc(232) int local232;
			if (local31 <= 1) {
				if (local25 == null) {
					local232 = 0;
				} else {
					local232 = local25[0];
				}
				if (this.aBoolean341) {
					local52[local232] = local155;
				} else {
					local52[local232] = Static45.method4131(local155);
				}
			} else {
				local232 = local155.length;
				local232--;
				@Pc(261) int local261 = local155[local232] & 0xFF;
				local232 -= local261 * local31 * 4;
				@Pc(274) Class8_Sub2 local274 = new Class8_Sub2(local155);
				local274.anInt2955 = local232;
				@Pc(280) int[] local280 = new int[local31];
				@Pc(291) int local291;
				@Pc(293) int local293;
				for (@Pc(282) int local282 = 0; local282 < local261; local282++) {
					local291 = 0;
					for (local293 = 0; local293 < local31; local293++) {
						local291 += local274.method2352();
						local280[local293] += local291;
						if (local25 != null) {
						}
					}
				}
				@Pc(318) byte[][] local318 = new byte[local31][];
				for (local291 = 0; local291 < local31; local291++) {
					local318[local291] = new byte[local280[local291]];
					local280[local291] = 0;
				}
				local274.anInt2955 = local232;
				local291 = 0;
				@Pc(352) int local352;
				for (local293 = 0; local293 < local261; local293++) {
					local352 = 0;
					for (@Pc(354) int local354 = 0; local354 < local31; local354++) {
						local352 += local274.method2352();
						Static301.method502(local155, local291, local318[local354], local280[local354], local352);
						local280[local354] += local352;
						local291 += local352;
					}
				}
				for (local293 = 0; local293 < local31; local293++) {
					if (local25 == null) {
						local352 = local293;
					} else {
						local352 = local25[local293];
					}
					if (this.aBoolean341) {
						local52[local352] = local318[local293];
					} else {
						local52[local352] = Static45.method4131(local318[local293]);
					}
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!pk", name = "c", descriptor = "(B)Z")
	public boolean method3187() {
		if (!this.method3183()) {
			return false;
		}
		@Pc(14) boolean local14 = true;
		for (@Pc(16) int local16 = 0; local16 < this.aClass152_2.anIntArray360.length; local16++) {
			@Pc(35) int local35 = this.aClass152_2.anIntArray360[local16];
			if (this.anObjectArray2[local35] == null) {
				this.method3191(local35);
				if (this.anObjectArray2[local35] == null) {
					local14 = false;
				}
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!pk", name = "c", descriptor = "(I)V")
	public void method3188() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(7) int local7 = 0; local7 < this.anObjectArrayArray1.length; local7++) {
				this.anObjectArrayArray1[local7] = null;
			}
		}
	}

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "(BI)I")
	public int method3189(@OriginalArg(1) int arg0) {
		return this.method3174(arg0) ? this.aClass152_2.anIntArray359[arg0] : 0;
	}

	@OriginalMember(owner = "client!pk", name = "c", descriptor = "(II)I")
	private int method3190(@OriginalArg(1) int arg0) {
		if (this.method3174(arg0)) {
			return this.anObjectArray2[arg0] == null ? this.aClass46_1.method970(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pk", name = "d", descriptor = "(II)V")
	private void method3191(@OriginalArg(1) int arg0) {
		if (this.aBoolean339) {
			this.anObjectArray2[arg0] = this.aClass46_1.method969(arg0);
		} else {
			this.anObjectArray2[arg0] = Static45.method4131(this.aClass46_1.method969(arg0));
		}
	}

	@OriginalMember(owner = "client!pk", name = "e", descriptor = "(II)Z")
	public boolean method3192(@OriginalArg(0) int arg0) {
		if (!this.method3174(arg0)) {
			return false;
		} else if (this.anObjectArray2[arg0] == null) {
			this.method3191(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!pk", name = "d", descriptor = "(B)I")
	public int method3193() {
		return this.method3183() ? this.aClass152_2.anIntArray359.length : -1;
	}

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "(III)[B")
	public byte[] method3194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method3163(null, arg0, arg1);
	}
}
