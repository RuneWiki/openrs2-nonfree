import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class221 {

	@OriginalMember(owner = "client!lb", name = "o", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!lb", name = "M", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray36;

	@OriginalMember(owner = "client!lb", name = "n", descriptor = "Lclient!c;")
	private Class41 aClass41_2 = null;

	@OriginalMember(owner = "client!lb", name = "K", descriptor = "Z")
	private final boolean aBoolean478;

	@OriginalMember(owner = "client!lb", name = "t", descriptor = "I")
	public int anInt5968;

	@OriginalMember(owner = "client!lb", name = "q", descriptor = "Lclient!vl;")
	private final Class171 aClass171_1;

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lclient!vl;ZI)V")
	public Class221(@OriginalArg(0) Class171 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (arg2 < 0 || arg2 > 2) {
			throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
		}
		this.aBoolean478 = arg1;
		this.anInt5968 = arg2;
		this.aClass171_1 = arg0;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "([IIII)[B")
	public byte[] method5063(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (!this.method5087(arg1, arg2)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg2] == null || this.anObjectArrayArray1[arg2][arg1] == null) {
			@Pc(41) boolean local41 = this.method5078(arg1, arg0, arg2);
			if (!local41) {
				this.method5084(arg2);
				local41 = this.method5078(arg1, arg0, arg2);
				if (!local41) {
					return null;
				}
			}
		}
		@Pc(71) byte[] local71 = Static543.method7616(this.anObjectArrayArray1[arg2][arg1], false);
		if (this.anInt5968 == 1) {
			this.anObjectArrayArray1[arg2][arg1] = null;
			if (this.aClass41_2.anIntArray70[arg2] == 1) {
				this.anObjectArrayArray1[arg2] = null;
			}
		} else if (this.anInt5968 == 2) {
			this.anObjectArrayArray1[arg2] = null;
		}
		return local71;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IZ)Z")
	public boolean method5064(@OriginalArg(0) int arg0) {
		if (!this.method5070(arg0)) {
			return false;
		} else if (this.anObjectArray36[arg0] == null) {
			this.method5084(arg0);
			return this.anObjectArray36[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(ZI)I")
	public int method5065(@OriginalArg(1) int arg0) {
		return this.method5070(arg0) ? this.aClass41_2.anIntArray70[arg0] : 0;
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(II)V")
	public void method5066(@OriginalArg(1) int arg0) {
		if (this.method5070(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)Z")
	public boolean method5067(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method5071()) {
			return false;
		}
		@Pc(13) String local13 = arg0.toLowerCase();
		@Pc(16) String local16 = arg1.toLowerCase();
		@Pc(25) int local25 = this.aClass41_2.aClass163_1.method4011(Static537.method7559(local13));
		if (local25 < 0) {
			return false;
		} else {
			@Pc(44) int local44 = this.aClass41_2.aClass163Array1[local25].method4011(Static537.method7559(local16));
			return local44 >= 0;
		}
	}

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "(BI)Z")
	public boolean method5068(@OriginalArg(1) int arg0) {
		if (!this.method5071()) {
			return false;
		} else if (this.aClass41_2.anIntArray70.length == 1) {
			return this.method5093(arg0, 0);
		} else if (!this.method5070(arg0)) {
			return false;
		} else if (this.aClass41_2.anIntArray70[arg0] == 1) {
			return this.method5093(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method5069(@OriginalArg(1) String arg0) {
		if (this.method5071()) {
			@Pc(23) String local23 = arg0.toLowerCase();
			@Pc(32) int local32 = this.aClass41_2.aClass163_1.method4011(Static537.method7559(local23));
			return this.method5082(local32);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "(BI)Z")
	private boolean method5070(@OriginalArg(1) int arg0) {
		if (!this.method5071()) {
			return false;
		} else if (arg0 >= 0 && arg0 < this.aClass41_2.anIntArray70.length && this.aClass41_2.anIntArray70[arg0] != 0) {
			return true;
		} else if (Static6.aBoolean5) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "(B)Z")
	private boolean method5071() {
		if (this.aClass41_2 == null) {
			this.aClass41_2 = this.aClass171_1.method4217();
			if (this.aClass41_2 == null) {
				return false;
			}
			this.anObjectArrayArray1 = new Object[this.aClass41_2.anInt1031][];
			this.anObjectArray36 = new Object[this.aClass41_2.anInt1031];
		}
		return true;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public void method5073(@OriginalArg(0) String arg0) {
		if (this.method5071()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(31) int local31 = this.aClass41_2.aClass163_1.method4011(Static537.method7559(local12));
			this.method5086(local31);
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZZI)V")
	public void method5074(@OriginalArg(0) boolean arg0) {
		if (!this.method5071()) {
			return;
		}
		this.aClass41_2.aClass163Array1 = null;
		this.aClass41_2.anIntArrayArray5 = null;
		if (arg0) {
			this.aClass41_2.aClass163_1 = null;
			this.aClass41_2.anIntArray71 = null;
		}
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)I")
	public int method5075() {
		if (!this.method5071()) {
			return 0;
		}
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < this.anObjectArray36.length; local18++) {
			if (this.aClass41_2.anIntArray75[local18] > 0) {
				local14 += 100;
				local16 += this.method5082(local18);
			}
		}
		if (local14 == 0) {
			return 100;
		} else {
			return local16 * 100 / local14;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;)[B")
	public byte[] method5076(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method5071()) {
			return null;
		}
		@Pc(13) String local13 = arg1.toLowerCase();
		@Pc(16) String local16 = arg0.toLowerCase();
		@Pc(32) int local32 = this.aClass41_2.aClass163_1.method4011(Static537.method7559(local13));
		if (this.method5070(local32)) {
			@Pc(51) int local51 = this.aClass41_2.aClass163Array1[local32].method4011(Static537.method7559(local16));
			return this.method5089(local51, local32);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(BI)[B")
	public byte[] method5077(@OriginalArg(1) int arg0) {
		if (!this.method5071()) {
			return null;
		} else if (this.aClass41_2.anIntArray70.length == 1) {
			return this.method5089(arg0, 0);
		} else if (!this.method5070(arg0)) {
			return null;
		} else if (this.aClass41_2.anIntArray70[arg0] == 1) {
			return this.method5089(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I[IIB)Z")
	private boolean method5078(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		if (!this.method5070(arg2)) {
			return false;
		} else if (this.anObjectArray36[arg2] == null) {
			return false;
		} else {
			@Pc(33) int local33 = this.aClass41_2.anIntArray75[arg2];
			@Pc(39) int[] local39 = this.aClass41_2.anIntArrayArray6[arg2];
			if (this.anObjectArrayArray1[arg2] == null) {
				this.anObjectArrayArray1[arg2] = new Object[this.aClass41_2.anIntArray70[arg2]];
			}
			@Pc(61) Object[] local61 = this.anObjectArrayArray1[arg2];
			@Pc(63) boolean local63 = true;
			for (@Pc(65) int local65 = 0; local65 < local33; local65++) {
				@Pc(75) int local75;
				if (local39 == null) {
					local75 = local65;
				} else {
					local75 = local39[local65];
				}
				if (local61[local75] == null) {
					local63 = false;
					break;
				}
			}
			if (local63) {
				return true;
			}
			@Pc(154) byte[] local154;
			if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
				local154 = Static543.method7616(this.anObjectArray36[arg2], false);
			} else {
				local154 = Static543.method7616(this.anObjectArray36[arg2], true);
				@Pc(169) Class3_Sub28 local169 = new Class3_Sub28(local154);
				local169.method5279(local169.aByteArray50.length, arg1);
			}
			@Pc(181) byte[] local181;
			try {
				local181 = Static133.method2921(local154);
			} catch (@Pc(183) RuntimeException local183) {
				throw Static479.method7003(local183, "T3 - " + (arg1 != null) + "," + arg2 + "," + local154.length + "," + Static425.method6268(local154, local154.length) + "," + Static425.method6268(local154, local154.length - 2) + "," + this.aClass41_2.anIntArray72[arg2] + "," + this.aClass41_2.anInt1029);
			}
			if (this.aBoolean478) {
				this.anObjectArray36[arg2] = null;
			}
			@Pc(260) int local260;
			if (local33 <= 1) {
				if (local39 == null) {
					local260 = 0;
				} else {
					local260 = local39[0];
				}
				if (this.anInt5968 == 0) {
					local61[local260] = Static710.method9254(local181);
				} else {
					local61[local260] = local181;
				}
			} else {
				@Pc(306) int local306;
				@Pc(319) Class3_Sub28 local319;
				@Pc(326) int local326;
				@Pc(328) int local328;
				@Pc(334) int local334;
				@Pc(336) int local336;
				@Pc(348) int local348;
				@Pc(415) int local415;
				@Pc(417) int local417;
				if (this.anInt5968 == 2) {
					local260 = local181.length;
					local260--;
					local306 = local181[local260] & 0xFF;
					local260 -= local33 * 4 * local306;
					local319 = new Class3_Sub28(local181);
					@Pc(321) int local321 = 0;
					local319.anInt6241 = local260;
					local326 = 0;
					for (local328 = 0; local328 < local306; local328++) {
						local334 = 0;
						for (local336 = 0; local336 < local33; local336++) {
							local334 += local319.method5312();
							if (local39 == null) {
								local348 = local336;
							} else {
								local348 = local39[local336];
							}
							if (local348 == arg0) {
								local321 += local334;
								local326 = local348;
							}
						}
					}
					if (local321 == 0) {
						return true;
					}
					@Pc(402) byte[] local402 = new byte[local321];
					local319.anInt6241 = local260;
					local321 = 0;
					local336 = 0;
					for (local348 = 0; local348 < local306; local348++) {
						local415 = 0;
						for (local417 = 0; local417 < local33; local417++) {
							local415 += local319.method5312();
							@Pc(433) int local433;
							if (local39 == null) {
								local433 = local417;
							} else {
								local433 = local39[local417];
							}
							if (local433 == arg0) {
								Static735.method9185(local181, local336, local402, local321, local415);
								local321 += local415;
							}
							local336 += local415;
						}
					}
					local61[local326] = local402;
				} else {
					local260 = local181.length;
					local260--;
					local306 = local181[local260] & 0xFF;
					local260 -= local306 * local33 * 4;
					local319 = new Class3_Sub28(local181);
					local319.anInt6241 = local260;
					@Pc(511) int[] local511 = new int[local33];
					for (local326 = 0; local326 < local306; local326++) {
						local328 = 0;
						for (local334 = 0; local334 < local33; local334++) {
							local328 += local319.method5312();
							local511[local334] += local328;
						}
					}
					@Pc(555) byte[][] local555 = new byte[local33][];
					for (local334 = 0; local334 < local33; local334++) {
						local555[local334] = new byte[local511[local334]];
						local511[local334] = 0;
					}
					local319.anInt6241 = local260;
					local336 = 0;
					for (local348 = 0; local348 < local306; local348++) {
						local415 = 0;
						for (local417 = 0; local417 < local33; local417++) {
							local415 += local319.method5312();
							Static735.method9185(local181, local336, local555[local417], local511[local417], local415);
							local336 += local415;
							local511[local417] += local415;
						}
					}
					for (local415 = 0; local415 < local33; local415++) {
						if (local39 == null) {
							local417 = local415;
						} else {
							local417 = local39[local415];
						}
						if (this.anInt5968 == 0) {
							local61[local417] = Static710.method9254(local555[local415]);
						} else {
							local61[local417] = local555[local415];
						}
					}
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method5079(@OriginalArg(0) String arg0) {
		if (this.method5071()) {
			@Pc(13) String local13 = arg0.toLowerCase();
			@Pc(24) int local24 = this.aClass41_2.aClass163_1.method4011(Static537.method7559(local13));
			return local24 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)I")
	public int method5080() {
		return this.method5071() ? this.aClass41_2.anIntArray70.length : -1;
	}

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "(II)I")
	public int method5081(@OriginalArg(0) int arg0) {
		if (this.method5071()) {
			@Pc(17) int local17 = this.aClass41_2.aClass163_1.method4011(arg0);
			return this.method5070(local17) ? local17 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZI)I")
	private int method5082(@OriginalArg(1) int arg0) {
		if (this.method5070(arg0)) {
			return this.anObjectArray36[arg0] == null ? this.aClass171_1.method4219(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)Z")
	private boolean method5083(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method5071()) {
			return false;
		}
		@Pc(13) String local13 = arg1.toLowerCase();
		@Pc(16) String local16 = arg0.toLowerCase();
		@Pc(25) int local25 = this.aClass41_2.aClass163_1.method4011(Static537.method7559(local13));
		if (this.method5070(local25)) {
			@Pc(44) int local44 = this.aClass41_2.aClass163Array1[local25].method4011(Static537.method7559(local16));
			return this.method5093(local44, local25);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)V")
	private void method5084(@OriginalArg(1) int arg0) {
		if (this.aBoolean478) {
			this.anObjectArray36[arg0] = this.aClass171_1.method4216(arg0);
		} else {
			this.anObjectArray36[arg0] = Static710.method9254(this.aClass171_1.method4216(arg0));
		}
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "(II)[I")
	public int[] method5085(@OriginalArg(1) int arg0) {
		if (!this.method5070(arg0)) {
			return null;
		}
		@Pc(27) int[] local27 = this.aClass41_2.anIntArrayArray6[arg0];
		if (local27 == null) {
			local27 = new int[this.aClass41_2.anIntArray75[arg0]];
			@Pc(38) int local38 = 0;
			while (local38 < local27.length) {
				local27[local38] = local38++;
			}
		}
		return local27;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BI)V")
	private void method5086(@OriginalArg(1) int arg0) {
		this.aClass171_1.method4214(arg0);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BII)Z")
	private boolean method5087(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method5071()) {
			return false;
		} else if (arg1 >= 0 && arg0 >= 0 && this.aClass41_2.anIntArray70.length > arg1 && this.aClass41_2.anIntArray70[arg1] > arg0) {
			return true;
		} else if (Static6.aBoolean5) {
			throw new IllegalArgumentException(arg1 + "," + arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "(I)I")
	public int method5088() {
		if (!this.method5071()) {
			throw new IllegalStateException("");
		}
		return this.aClass41_2.anInt1029;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(III)[B")
	public byte[] method5089(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.method5063((int[]) null, arg0, arg1);
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "(I)V")
	public void method5090() {
		if (this.anObjectArray36 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anObjectArray36.length; local6++) {
				this.anObjectArray36[local6] = null;
			}
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)Z")
	public boolean method5091() {
		if (!this.method5071()) {
			return false;
		}
		@Pc(14) boolean local14 = true;
		for (@Pc(26) int local26 = 0; local26 < this.aClass41_2.anIntArray73.length; local26++) {
			@Pc(36) int local36 = this.aClass41_2.anIntArray73[local26];
			if (this.anObjectArray36[local36] == null) {
				this.method5084(local36);
				if (this.anObjectArray36[local36] == null) {
					local14 = false;
				}
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(Ljava/lang/String;B)Z")
	public boolean method5092(@OriginalArg(0) String arg0) {
		@Pc(16) int local16 = this.method5096("");
		return local16 == -1 ? this.method5083("", arg0) : this.method5083(arg0, "");
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZII)Z")
	public boolean method5093(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method5087(arg0, arg1)) {
			return false;
		} else if (this.anObjectArrayArray1[arg1] != null && this.anObjectArrayArray1[arg1][arg0] != null) {
			return true;
		} else if (this.anObjectArray36[arg1] == null) {
			this.method5084(arg1);
			return this.anObjectArray36[arg1] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public boolean method5094(@OriginalArg(0) String arg0) {
		if (this.method5071()) {
			@Pc(13) String local13 = arg0.toLowerCase();
			@Pc(22) int local22 = this.aClass41_2.aClass163_1.method4011(Static537.method7559(local13));
			return this.method5064(local22);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)V")
	public void method5095() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(11) int local11 = 0; local11 < this.anObjectArrayArray1.length; local11++) {
				this.anObjectArrayArray1[local11] = null;
			}
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BLjava/lang/String;)I")
	public int method5096(@OriginalArg(1) String arg0) {
		if (this.method5071()) {
			@Pc(23) String local23 = arg0.toLowerCase();
			@Pc(32) int local32 = this.aClass41_2.aClass163_1.method4011(Static537.method7559(local23));
			return this.method5070(local32) ? local32 : -1;
		} else {
			return -1;
		}
	}
}
