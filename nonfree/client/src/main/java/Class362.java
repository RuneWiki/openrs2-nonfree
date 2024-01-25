import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uq")
public final class Class362 {

	@OriginalMember(owner = "client!uq", name = "e", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!uq", name = "J", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray34;

	@OriginalMember(owner = "client!uq", name = "I", descriptor = "Lclient!wk;")
	private Class390 aClass390_2 = null;

	@OriginalMember(owner = "client!uq", name = "U", descriptor = "Z")
	private final boolean aBoolean716;

	@OriginalMember(owner = "client!uq", name = "j", descriptor = "Lclient!up;")
	private final Class229 aClass229_1;

	@OriginalMember(owner = "client!uq", name = "p", descriptor = "I")
	public int anInt10235;

	@OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(Lclient!up;ZI)V")
	public Class362(@OriginalArg(0) Class229 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (arg2 < 0 || arg2 > 2) {
			throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
		}
		this.aBoolean716 = arg1;
		this.aClass229_1 = arg0;
		this.anInt10235 = arg2;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(B)I")
	public int method8337() {
		if (!this.method8360()) {
			throw new IllegalStateException("");
		}
		return this.aClass390_2.anInt10822;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IB)Z")
	public boolean method8338(@OriginalArg(0) int arg0) {
		if (!this.method8345(arg0)) {
			return false;
		} else if (this.anObjectArray34[arg0] == null) {
			this.method8374(arg0);
			return this.anObjectArray34[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public boolean method8339(@OriginalArg(0) String arg0) {
		if (this.method8360()) {
			@Pc(20) String local20 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass390_2.aClass349_1.method7966(Static378.method7517(local20));
			return this.method8338(local29);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(II)V")
	private void method8340(@OriginalArg(1) int arg0) {
		this.aClass229_1.method5279(arg0);
	}

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "(B)Z")
	public boolean method8341() {
		if (!this.method8360()) {
			return false;
		}
		@Pc(13) boolean local13 = true;
		for (@Pc(15) int local15 = 0; local15 < this.aClass390_2.anIntArray623.length; local15++) {
			@Pc(23) int local23 = this.aClass390_2.anIntArray623[local15];
			if (this.anObjectArray34[local23] == null) {
				this.method8374(local23);
				if (this.anObjectArray34[local23] == null) {
					local13 = false;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "(IB)I")
	private int method8343(@OriginalArg(0) int arg0) {
		if (this.method8345(arg0)) {
			return this.anObjectArray34[arg0] == null ? this.aClass229_1.method5281(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(BI)Z")
	private boolean method8345(@OriginalArg(1) int arg0) {
		if (!this.method8360()) {
			return false;
		} else if (arg0 >= 0 && this.aClass390_2.anIntArray624.length > arg0 && this.aClass390_2.anIntArray624[arg0] != 0) {
			return true;
		} else if (Static447.aBoolean514) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIZ)Z")
	private boolean method8346(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method8360()) {
			return false;
		} else if (arg0 >= 0 && arg1 >= 0 && this.aClass390_2.anIntArray624.length > arg0 && arg1 < this.aClass390_2.anIntArray624[arg0]) {
			return true;
		} else if (Static447.aBoolean514) {
			throw new IllegalArgumentException(arg0 + "," + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(ZZI)V")
	public void method8349(@OriginalArg(0) boolean arg0) {
		if (!this.method8360()) {
			return;
		}
		this.aClass390_2.aClass349Array1 = null;
		this.aClass390_2.anIntArrayArray67 = null;
		if (arg0) {
			this.aClass390_2.anIntArray619 = null;
			this.aClass390_2.aClass349_1 = null;
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(I[III)Z")
	private boolean method8350(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		if (!this.method8345(arg2)) {
			return false;
		} else if (this.anObjectArray34[arg2] == null) {
			return false;
		} else {
			@Pc(25) int local25 = this.aClass390_2.anIntArray620[arg2];
			@Pc(31) int[] local31 = this.aClass390_2.anIntArrayArray66[arg2];
			if (this.anObjectArrayArray1[arg2] == null) {
				this.anObjectArrayArray1[arg2] = new Object[this.aClass390_2.anIntArray624[arg2]];
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
			@Pc(121) byte[] local121;
			if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
				local121 = Static553.method7314(this.anObjectArray34[arg2], false);
			} else {
				local121 = Static553.method7314(this.anObjectArray34[arg2], true);
				@Pc(126) Class3_Sub4 local126 = new Class3_Sub4(local121);
				local126.method7927(local126.aByteArray90.length, arg1);
			}
			@Pc(148) byte[] local148;
			try {
				local148 = Static152.method8487(local121);
			} catch (@Pc(150) RuntimeException local150) {
				throw Static384.method5379(local150, "T3 - " + (arg1 != null) + "," + arg2 + "," + local121.length + "," + Static516.method6720(local121, local121.length) + "," + Static516.method6720(local121, local121.length - 2) + "," + this.aClass390_2.anIntArray621[arg2] + "," + this.aClass390_2.anInt10822);
			}
			if (this.aBoolean716) {
				this.anObjectArray34[arg2] = null;
			}
			@Pc(222) int local222;
			if (local25 <= 1) {
				if (local31 == null) {
					local222 = 0;
				} else {
					local222 = local31[0];
				}
				if (this.anInt10235 == 0) {
					local51[local222] = Static360.method5206(local148);
				} else {
					local51[local222] = local148;
				}
			} else {
				@Pc(265) int local265;
				@Pc(278) Class3_Sub4 local278;
				@Pc(282) int local282;
				@Pc(287) int local287;
				@Pc(291) int local291;
				@Pc(293) int local293;
				@Pc(307) int local307;
				@Pc(356) int local356;
				@Pc(358) int local358;
				if (this.anInt10235 == 2) {
					local222 = local148.length;
					local222--;
					local265 = local148[local222] & 0xFF;
					local222 -= local25 * 4 * local265;
					local278 = new Class3_Sub4(local148);
					@Pc(280) int local280 = 0;
					local282 = 0;
					local278.anInt9739 = local222;
					for (local287 = 0; local287 < local265; local287++) {
						local291 = 0;
						for (local293 = 0; local293 < local25; local293++) {
							local291 += local278.method7895();
							if (local31 == null) {
								local307 = local293;
							} else {
								local307 = local31[local293];
							}
							if (arg0 == local307) {
								local280 += local291;
								local282 = local307;
							}
						}
					}
					if (local280 == 0) {
						return true;
					}
					@Pc(343) byte[] local343 = new byte[local280];
					local278.anInt9739 = local222;
					local280 = 0;
					local293 = 0;
					for (local307 = 0; local307 < local265; local307++) {
						local356 = 0;
						for (local358 = 0; local358 < local25; local358++) {
							local356 += local278.method7895();
							@Pc(372) int local372;
							if (local31 == null) {
								local372 = local358;
							} else {
								local372 = local31[local358];
							}
							if (local372 == arg0) {
								Static681.method4034(local148, local293, local343, local280, local356);
								local280 += local356;
							}
							local293 += local356;
						}
					}
					local51[local282] = local343;
				} else {
					local222 = local148.length;
					local222--;
					local265 = local148[local222] & 0xFF;
					local222 -= local25 * 4 * local265;
					local278 = new Class3_Sub4(local148);
					@Pc(441) int[] local441 = new int[local25];
					local278.anInt9739 = local222;
					for (local282 = 0; local282 < local265; local282++) {
						local287 = 0;
						for (local291 = 0; local291 < local25; local291++) {
							local287 += local278.method7895();
							local441[local291] += local287;
						}
					}
					@Pc(486) byte[][] local486 = new byte[local25][];
					for (local291 = 0; local291 < local25; local291++) {
						local486[local291] = new byte[local441[local291]];
						local441[local291] = 0;
					}
					local278.anInt9739 = local222;
					local293 = 0;
					for (local307 = 0; local307 < local265; local307++) {
						local356 = 0;
						for (local358 = 0; local358 < local25; local358++) {
							local356 += local278.method7895();
							Static681.method4034(local148, local293, local486[local358], local441[local358], local356);
							local293 += local356;
							local441[local358] += local356;
						}
					}
					for (local356 = 0; local356 < local25; local356++) {
						if (local31 == null) {
							local358 = local356;
						} else {
							local358 = local31[local356];
						}
						if (this.anInt10235 == 0) {
							local51[local358] = Static360.method5206(local486[local356]);
						} else {
							local51[local358] = local486[local356];
						}
					}
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method8352(@OriginalArg(0) String arg0) {
		if (this.method8360()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(27) int local27 = this.aClass390_2.aClass349_1.method7966(Static378.method7517(local12));
			return this.method8343(local27);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public int method8353(@OriginalArg(1) String arg0) {
		if (this.method8360()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass390_2.aClass349_1.method7966(Static378.method7517(local12));
			return this.method8345(local26) ? local26 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(III)Z")
	public boolean method8354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method8346(arg0, arg1)) {
			return false;
		} else if (this.anObjectArrayArray1[arg0] != null && this.anObjectArrayArray1[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray34[arg0] == null) {
			this.method8374(arg0);
			return this.anObjectArray34[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!uq", name = "c", descriptor = "(IB)I")
	public int method8355(@OriginalArg(0) int arg0) {
		return this.method8345(arg0) ? this.aClass390_2.anIntArray624[arg0] : 0;
	}

	@OriginalMember(owner = "client!uq", name = "d", descriptor = "(II)[B")
	public byte[] method8356(@OriginalArg(0) int arg0) {
		if (!this.method8360()) {
			return null;
		} else if (this.aClass390_2.anIntArray624.length == 1) {
			return this.method8368(0, arg0);
		} else if (!this.method8345(arg0)) {
			return null;
		} else if (this.aClass390_2.anIntArray624[arg0] == 1) {
			return this.method8368(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(I)V")
	public void method8357() {
		if (this.anObjectArray34 != null) {
			for (@Pc(16) int local16 = 0; local16 < this.anObjectArray34.length; local16++) {
				this.anObjectArray34[local16] = null;
			}
		}
	}

	@OriginalMember(owner = "client!uq", name = "d", descriptor = "(B)I")
	public int method8358() {
		if (!this.method8360()) {
			return 0;
		}
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anObjectArray34.length; local23++) {
			if (this.aClass390_2.anIntArray620[local23] > 0) {
				local19 += 100;
				local21 += this.method8343(local23);
			}
		}
		if (local19 == 0) {
			return 100;
		} else {
			return local21 * 100 / local19;
		}
	}

	@OriginalMember(owner = "client!uq", name = "e", descriptor = "(II)I")
	public int method8359(@OriginalArg(0) int arg0) {
		if (this.method8360()) {
			@Pc(16) int local16 = this.aClass390_2.aClass349_1.method7966(arg0);
			return this.method8345(local16) ? local16 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "(I)Z")
	private boolean method8360() {
		if (this.aClass390_2 == null) {
			this.aClass390_2 = this.aClass229_1.method5280();
			if (this.aClass390_2 == null) {
				return false;
			}
			this.anObjectArrayArray1 = new Object[this.aClass390_2.anInt10821][];
			this.anObjectArray34 = new Object[this.aClass390_2.anInt10821];
		}
		return true;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method8361(@OriginalArg(1) String arg0) {
		if (this.method8360()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass390_2.aClass349_1.method7966(Static378.method7517(local12));
			return local26 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!uq", name = "d", descriptor = "(IB)[I")
	public int[] method8362(@OriginalArg(0) int arg0) {
		if (!this.method8345(arg0)) {
			return null;
		}
		@Pc(18) int[] local18 = this.aClass390_2.anIntArrayArray66[arg0];
		if (local18 == null) {
			local18 = new int[this.aClass390_2.anIntArray620[arg0]];
			@Pc(45) int local45 = 0;
			while (local18.length > local45) {
				local18[local45] = local45++;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "([IIBI)[B")
	public byte[] method8363(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (!this.method8346(arg1, arg2)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg1] == null || this.anObjectArrayArray1[arg1][arg2] == null) {
			@Pc(30) boolean local30 = this.method8350(arg2, arg0, arg1);
			if (!local30) {
				this.method8374(arg1);
				local30 = this.method8350(arg2, arg0, arg1);
				if (!local30) {
					return null;
				}
			}
		}
		@Pc(65) byte[] local65 = Static553.method7314(this.anObjectArrayArray1[arg1][arg2], false);
		if (this.anInt10235 == 1) {
			this.anObjectArrayArray1[arg1][arg2] = null;
			if (this.aClass390_2.anIntArray624[arg1] == 1) {
				this.anObjectArrayArray1[arg1] = null;
			}
		} else if (this.anInt10235 == 2) {
			this.anObjectArrayArray1[arg1] = null;
		}
		return local65;
	}

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "(Ljava/lang/String;I)V")
	public void method8364(@OriginalArg(0) String arg0) {
		if (this.method8360()) {
			@Pc(11) String local11 = arg0.toLowerCase();
			@Pc(28) int local28 = this.aClass390_2.aClass349_1.method7966(Static378.method7517(local11));
			this.method8340(local28);
		}
	}

	@OriginalMember(owner = "client!uq", name = "f", descriptor = "(II)Z")
	public boolean method8365(@OriginalArg(0) int arg0) {
		if (!this.method8360()) {
			return false;
		} else if (this.aClass390_2.anIntArray624.length == 1) {
			return this.method8354(0, arg0);
		} else if (!this.method8345(arg0)) {
			return false;
		} else if (this.aClass390_2.anIntArray624[arg0] == 1) {
			return this.method8354(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "(ILjava/lang/String;)Z")
	public boolean method8366(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = this.method8353("");
		return local8 == -1 ? this.method8371(arg0, "") : this.method8371("", arg0);
	}

	@OriginalMember(owner = "client!uq", name = "c", descriptor = "(I)V")
	public void method8367() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(14) int local14 = 0; local14 < this.anObjectArrayArray1.length; local14++) {
				this.anObjectArrayArray1[local14] = null;
			}
		}
	}

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "(III)[B")
	public byte[] method8368(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.method8363((int[]) null, arg0, arg1);
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)[B")
	public byte[] method8369(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method8360()) {
			return null;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(15) String local15 = arg0.toLowerCase();
		@Pc(24) int local24 = this.aClass390_2.aClass349_1.method7966(Static378.method7517(local12));
		if (this.method8345(local24)) {
			@Pc(46) int local46 = this.aClass390_2.aClass349Array1[local24].method7966(Static378.method7517(local15));
			return this.method8368(local24, local46);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z")
	public boolean method8370(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method8360()) {
			return false;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(15) String local15 = arg0.toLowerCase();
		@Pc(24) int local24 = this.aClass390_2.aClass349_1.method7966(Static378.method7517(local12));
		if (local24 < 0) {
			return false;
		} else {
			@Pc(50) int local50 = this.aClass390_2.aClass349Array1[local24].method7966(Static378.method7517(local15));
			return local50 >= 0;
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)Z")
	private boolean method8371(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method8360()) {
			return false;
		}
		@Pc(20) String local20 = arg0.toLowerCase();
		@Pc(23) String local23 = arg1.toLowerCase();
		@Pc(32) int local32 = this.aClass390_2.aClass349_1.method7966(Static378.method7517(local20));
		if (this.method8345(local32)) {
			@Pc(50) int local50 = this.aClass390_2.aClass349Array1[local32].method7966(Static378.method7517(local23));
			return this.method8354(local32, local50);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "(BI)V")
	public void method8372(@OriginalArg(1) int arg0) {
		if (this.method8345(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Z)I")
	public int method8373() {
		return this.method8360() ? this.aClass390_2.anIntArray624.length : -1;
	}

	@OriginalMember(owner = "client!uq", name = "g", descriptor = "(II)V")
	private void method8374(@OriginalArg(1) int arg0) {
		if (this.aBoolean716) {
			this.anObjectArray34[arg0] = this.aClass229_1.method5278(arg0);
		} else {
			this.anObjectArray34[arg0] = Static360.method5206(this.aClass229_1.method5278(arg0));
		}
	}
}
