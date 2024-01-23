import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ak")
public final class Class7 {

	@OriginalMember(owner = "client!ak", name = "u", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray1;

	@OriginalMember(owner = "client!ak", name = "N", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!ak", name = "e", descriptor = "Lclient!wm;")
	private Class181 aClass181_1 = null;

	@OriginalMember(owner = "client!ak", name = "n", descriptor = "Lclient!rk;")
	private Class143 aClass143_1;

	@OriginalMember(owner = "client!ak", name = "w", descriptor = "Z")
	private boolean aBoolean25;

	@OriginalMember(owner = "client!ak", name = "y", descriptor = "Z")
	private boolean aBoolean26;

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(Lclient!rk;ZZ)V")
	public Class7(@OriginalArg(0) Class143 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		this.aClass143_1 = arg0;
		this.aBoolean25 = arg1;
		this.aBoolean26 = arg2;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIB)Z")
	public boolean method235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method250(arg0, arg1)) {
			return false;
		} else if (this.anObjectArrayArray1[arg1] != null && this.anObjectArrayArray1[arg1][arg0] != null) {
			return true;
		} else if (this.anObjectArray1[arg1] == null) {
			this.method263(arg1);
			return this.anObjectArray1[arg1] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)I")
	public int method236() {
		if (!this.method267()) {
			return 0;
		}
		@Pc(14) int local14 = 0;
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < this.anObjectArray1.length; local25++) {
			if (this.aClass181_1.anIntArray695[local25] > 0) {
				local23 += this.method256(local25);
				local14 += 100;
			}
		}
		if (local14 == 0) {
			return 100;
		} else {
			return local23 * 100 / local14;
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(ZBZ)V")
	public void method237(@OriginalArg(2) boolean arg0) {
		if (!this.method267()) {
			return;
		}
		if (arg0) {
			this.aClass181_1.anIntArray696 = null;
			this.aClass181_1.aClass165_1 = null;
		}
		this.aClass181_1.anIntArrayArray47 = null;
		this.aClass181_1.aClass165Array1 = null;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(III)[B")
	public byte[] method238(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method250(arg1, arg0)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg0] == null || this.anObjectArrayArray1[arg0][arg1] == null) {
			@Pc(32) boolean local32 = this.method241(arg0, null);
			if (!local32) {
				this.method263(arg0);
				local32 = this.method241(arg0, null);
				if (!local32) {
					return null;
				}
			}
		}
		return Static245.method1017(false, this.anObjectArrayArray1[arg0][arg1]);
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(I[IIB)[B")
	public byte[] method239(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		if (!this.method250(arg2, arg0)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg0] == null || this.anObjectArrayArray1[arg0][arg2] == null) {
			@Pc(40) boolean local40 = this.method241(arg0, arg1);
			if (!local40) {
				this.method263(arg0);
				local40 = this.method241(arg0, arg1);
				if (!local40) {
					return null;
				}
			}
		}
		@Pc(68) byte[] local68 = Static245.method1017(false, this.anObjectArrayArray1[arg0][arg2]);
		if (this.aBoolean26) {
			this.anObjectArrayArray1[arg0][arg2] = null;
			if (this.aClass181_1.anIntArray697[arg0] == 1) {
				this.anObjectArrayArray1[arg0] = null;
			}
		}
		return local68;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(II[I)Z")
	private boolean method241(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		if (!this.method245(arg0)) {
			return false;
		} else if (this.anObjectArray1[arg0] == null) {
			return false;
		} else {
			@Pc(28) int local28 = this.aClass181_1.anIntArray695[arg0];
			@Pc(34) int[] local34 = this.aClass181_1.anIntArrayArray46[arg0];
			@Pc(43) boolean local43 = true;
			if (this.anObjectArrayArray1[arg0] == null) {
				this.anObjectArrayArray1[arg0] = new Object[this.aClass181_1.anIntArray697[arg0]];
			}
			@Pc(63) Object[] local63 = this.anObjectArrayArray1[arg0];
			for (@Pc(65) int local65 = 0; local65 < local28; local65++) {
				@Pc(72) int local72;
				if (local34 == null) {
					local72 = local65;
				} else {
					local72 = local34[local65];
				}
				if (local63[local72] == null) {
					local43 = false;
					break;
				}
			}
			if (local43) {
				return true;
			}
			@Pc(128) byte[] local128;
			if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
				local128 = Static245.method1017(false, this.anObjectArray1[arg0]);
			} else {
				local128 = Static245.method1017(true, this.anObjectArray1[arg0]);
				@Pc(142) Class1_Sub18 local142 = new Class1_Sub18(local128);
				local142.method3121(arg1, local142.aByteArray71.length);
			}
			@Pc(154) byte[] local154;
			try {
				local154 = Static283.method4318(local128);
			} catch (@Pc(156) RuntimeException local156) {
				throw Static251.method3951(local156, "T3 - " + (arg1 != null) + "," + arg0 + "," + local128.length + "," + Static122.method1908(local128.length, local128) + "," + Static122.method1908(local128.length - 2, local128) + "," + this.aClass181_1.anIntArray698[arg0] + "," + this.aClass181_1.anInt5905);
			}
			if (this.aBoolean25) {
				this.anObjectArray1[arg0] = null;
			}
			@Pc(228) int local228;
			if (local28 > 1) {
				local228 = local154.length;
				@Pc(230) int local230 = local228 - 1;
				@Pc(235) int local235 = local154[local230] & 0xFF;
				@Pc(240) Class1_Sub18 local240 = new Class1_Sub18(local154);
				@Pc(243) int[] local243 = new int[local28];
				@Pc(251) int local251 = local230 - local235 * 4 * local28;
				local240.anInt3911 = local251;
				@Pc(265) int local265;
				@Pc(267) int local267;
				for (@Pc(256) int local256 = 0; local256 < local235; local256++) {
					local265 = 0;
					for (local267 = 0; local267 < local28; local267++) {
						if (local34 != null) {
						}
						local265 += local240.method3074();
						local243[local267] += local265;
					}
				}
				@Pc(299) byte[][] local299 = new byte[local28][];
				for (local265 = 0; local265 < local28; local265++) {
					local299[local265] = new byte[local243[local265]];
					local243[local265] = 0;
				}
				local240.anInt3911 = local251;
				local265 = 0;
				@Pc(330) int local330;
				for (local267 = 0; local267 < local235; local267++) {
					local330 = 0;
					for (@Pc(332) int local332 = 0; local332 < local28; local332++) {
						local330 += local240.method3074();
						Static300.method484(local154, local265, local299[local332], local243[local332], local330);
						local265 += local330;
						local243[local332] += local330;
					}
				}
				for (local267 = 0; local267 < local28; local267++) {
					if (local34 == null) {
						local330 = local267;
					} else {
						local330 = local34[local267];
					}
					if (this.aBoolean26) {
						local63[local330] = local299[local267];
					} else {
						local63[local330] = Static166.method2531(local299[local267]);
					}
				}
			} else {
				if (local34 == null) {
					local228 = 0;
				} else {
					local228 = local34[0];
				}
				if (this.aBoolean26) {
					local63[local228] = local154;
				} else {
					local63[local228] = Static166.method2531(local154);
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)Z")
	public boolean method242(@OriginalArg(0) int arg0) {
		if (!this.method267()) {
			return false;
		} else if (this.aClass181_1.anIntArray697.length == 1) {
			return this.method235(arg0, 0);
		} else if (!this.method245(arg0)) {
			return false;
		} else if (this.aClass181_1.anIntArray697[arg0] == 1) {
			return this.method235(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(II)V")
	public void method243(@OriginalArg(0) int arg0) {
		if (this.method245(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(ILjava/lang/String;)Z")
	public boolean method244(@OriginalArg(1) String arg0) {
		if (this.method267()) {
			@Pc(13) String local13 = arg0.toLowerCase();
			@Pc(22) int local22 = this.aClass181_1.aClass165_1.method4183(Static264.method1813(local13));
			return local22 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ak", name = "c", descriptor = "(II)Z")
	private boolean method245(@OriginalArg(1) int arg0) {
		if (!this.method267()) {
			return false;
		} else if (arg0 >= 0 && arg0 < this.aClass181_1.anIntArray697.length && this.aClass181_1.anIntArray697[arg0] != 0) {
			return true;
		} else if (Static72.aBoolean109) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(BI)Z")
	public boolean method246(@OriginalArg(1) int arg0) {
		if (!this.method245(arg0)) {
			return false;
		} else if (this.anObjectArray1[arg0] == null) {
			this.method263(arg0);
			return this.anObjectArray1[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ak", name = "d", descriptor = "(II)V")
	private void method247(@OriginalArg(1) int arg0) {
		this.aClass143_1.method3815(arg0);
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(I)V")
	public void method248() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(11) int local11 = 0; local11 < this.anObjectArrayArray1.length; local11++) {
				this.anObjectArrayArray1[local11] = null;
			}
		}
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(III)Z")
	private boolean method250(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method267()) {
			return false;
		} else if (arg1 >= 0 && arg0 >= 0 && arg1 < this.aClass181_1.anIntArray697.length && this.aClass181_1.anIntArray697[arg1] > arg0) {
			return true;
		} else if (Static72.aBoolean109) {
			throw new IllegalArgumentException(arg1 + "," + arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
	public boolean method251(@OriginalArg(0) String arg0) {
		if (this.method267()) {
			@Pc(13) String local13 = arg0.toLowerCase();
			@Pc(22) int local22 = this.aClass181_1.aClass165_1.method4183(Static264.method1813(local13));
			return this.method246(local22);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public void method252(@OriginalArg(0) String arg0) {
		if (this.method267()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass181_1.aClass165_1.method4183(Static264.method1813(local12));
			this.method247(local29);
		}
	}

	@OriginalMember(owner = "client!ak", name = "c", descriptor = "(III)[B")
	public byte[] method253(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method239(arg1, null, arg0);
	}

	@OriginalMember(owner = "client!ak", name = "d", descriptor = "(I)I")
	public int method254() {
		if (!this.method267()) {
			throw new IllegalStateException("");
		}
		return this.aClass181_1.anInt5905;
	}

	@OriginalMember(owner = "client!ak", name = "c", descriptor = "(ILjava/lang/String;)I")
	public int method255(@OriginalArg(1) String arg0) {
		if (this.method267()) {
			@Pc(17) String local17 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass181_1.aClass165_1.method4183(Static264.method1813(local17));
			return this.method256(local26);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IB)I")
	private int method256(@OriginalArg(0) int arg0) {
		if (this.method245(arg0)) {
			return this.anObjectArray1[arg0] == null ? this.aClass143_1.method3813(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ak", name = "e", descriptor = "(I)I")
	public int method257() {
		return this.method267() ? this.aClass181_1.anIntArray697.length : -1;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(ZI)[B")
	public byte[] method258(@OriginalArg(1) int arg0) {
		if (!this.method267()) {
			return null;
		} else if (this.aClass181_1.anIntArray697.length == 1) {
			return this.method253(arg0, 0);
		} else if (!this.method245(arg0)) {
			return null;
		} else if (this.aClass181_1.anIntArray697[arg0] == 1) {
			return this.method253(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)Z")
	public boolean method259(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method267()) {
			return false;
		}
		@Pc(21) String local21 = arg1.toLowerCase();
		@Pc(24) String local24 = arg0.toLowerCase();
		@Pc(33) int local33 = this.aClass181_1.aClass165_1.method4183(Static264.method1813(local21));
		if (this.method245(local33)) {
			@Pc(52) int local52 = this.aClass181_1.aClass165Array1[local33].method4183(Static264.method1813(local24));
			return this.method235(local52, local33);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)[B")
	public byte[] method260(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method267()) {
			return null;
		}
		@Pc(19) String local19 = arg1.toLowerCase();
		@Pc(22) String local22 = arg0.toLowerCase();
		@Pc(31) int local31 = this.aClass181_1.aClass165_1.method4183(Static264.method1813(local19));
		if (this.method245(local31)) {
			@Pc(49) int local49 = this.aClass181_1.aClass165Array1[local31].method4183(Static264.method1813(local22));
			return this.method253(local49, local31);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ak", name = "f", descriptor = "(I)Z")
	public boolean method261() {
		if (!this.method267()) {
			return false;
		}
		@Pc(13) boolean local13 = true;
		for (@Pc(15) int local15 = 0; local15 < this.aClass181_1.anIntArray693.length; local15++) {
			@Pc(27) int local27 = this.aClass181_1.anIntArray693[local15];
			if (this.anObjectArray1[local27] == null) {
				this.method263(local27);
				if (this.anObjectArray1[local27] == null) {
					local13 = false;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!ak", name = "e", descriptor = "(II)V")
	private void method263(@OriginalArg(1) int arg0) {
		if (this.aBoolean25) {
			this.anObjectArray1[arg0] = this.aClass143_1.method3820(arg0);
		} else {
			this.anObjectArray1[arg0] = Static166.method2531(this.aClass143_1.method3820(arg0));
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(BLjava/lang/String;)I")
	public int method264(@OriginalArg(1) String arg0) {
		if (this.method267()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass181_1.aClass165_1.method4183(Static264.method1813(local12));
			return this.method245(local29) ? local29 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(IB)I")
	public int method265(@OriginalArg(0) int arg0) {
		return this.method245(arg0) ? this.aClass181_1.anIntArray697[arg0] : 0;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IZ)[I")
	public int[] method266(@OriginalArg(0) int arg0) {
		if (!this.method245(arg0)) {
			return null;
		}
		@Pc(30) int[] local30 = this.aClass181_1.anIntArrayArray46[arg0];
		if (local30 == null) {
			local30 = new int[this.aClass181_1.anIntArray695[arg0]];
			@Pc(41) int local41 = 0;
			while (local41 < local30.length) {
				local30[local41] = local41++;
			}
		}
		return local30;
	}

	@OriginalMember(owner = "client!ak", name = "h", descriptor = "(I)Z")
	private boolean method267() {
		if (this.aClass181_1 == null) {
			this.aClass181_1 = this.aClass143_1.method3816();
			if (this.aClass181_1 == null) {
				return false;
			}
			this.anObjectArrayArray1 = new Object[this.aClass181_1.anInt5906][];
			this.anObjectArray1 = new Object[this.aClass181_1.anInt5906];
		}
		return true;
	}
}
