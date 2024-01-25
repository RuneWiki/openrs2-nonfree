import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oh")
public final class Class237 {

	@OriginalMember(owner = "client!oh", name = "l", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!oh", name = "H", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray1;

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "Lclient!hq;")
	private Class137 aClass137_2 = null;

	@OriginalMember(owner = "client!oh", name = "A", descriptor = "Lclient!rw;")
	private final Class210 aClass210_1;

	@OriginalMember(owner = "client!oh", name = "F", descriptor = "Z")
	private final boolean aBoolean552;

	@OriginalMember(owner = "client!oh", name = "G", descriptor = "I")
	public int anInt7642;

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lclient!rw;ZI)V")
	public Class237(@OriginalArg(0) Class210 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (arg2 < 0 || arg2 > 2) {
			throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
		}
		this.aClass210_1 = arg0;
		this.aBoolean552 = arg1;
		this.anInt7642 = arg2;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z")
	private boolean method6293(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method6301()) {
			return false;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(23) String local23 = arg0.toLowerCase();
		@Pc(32) int local32 = this.aClass137_2.aClass312_1.method7424(Static180.method3452(local12));
		if (this.method6316(local32)) {
			@Pc(50) int local50 = this.aClass137_2.aClass312Array1[local32].method7424(Static180.method3452(local23));
			return this.method6326(local32, local50);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(B[III)Z")
	private boolean method6294(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (!this.method6316(arg1)) {
			return false;
		} else if (this.anObjectArray1[arg1] == null) {
			return false;
		} else {
			@Pc(25) int local25 = this.aClass137_2.anIntArray266[arg1];
			@Pc(31) int[] local31 = this.aClass137_2.anIntArrayArray27[arg1];
			if (this.anObjectArrayArray1[arg1] == null) {
				this.anObjectArrayArray1[arg1] = new Object[this.aClass137_2.anIntArray271[arg1]];
			}
			@Pc(51) Object[] local51 = this.anObjectArrayArray1[arg1];
			@Pc(53) boolean local53 = true;
			for (@Pc(63) int local63 = 0; local63 < local25; local63++) {
				@Pc(69) int local69;
				if (local31 == null) {
					local69 = local63;
				} else {
					local69 = local31[local63];
				}
				if (local51[local69] == null) {
					local53 = false;
					break;
				}
			}
			if (local53) {
				return true;
			}
			@Pc(124) byte[] local124;
			if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
				local124 = Static565.method3489(this.anObjectArray1[arg1], false);
			} else {
				local124 = Static565.method3489(this.anObjectArray1[arg1], true);
				@Pc(139) Class8_Sub8 local139 = new Class8_Sub8(local124);
				local139.method8522(arg0, local139.aByteArray107.length);
			}
			@Pc(151) byte[] local151;
			try {
				local151 = Static215.method4067(local124);
			} catch (@Pc(153) RuntimeException local153) {
				throw Static377.method5853(local153, "T3 - " + (arg0 != null) + "," + arg1 + "," + local124.length + "," + Static292.method4863(local124, local124.length) + "," + Static292.method4863(local124, local124.length - 2) + "," + this.aClass137_2.anIntArray268[arg1] + "," + this.aClass137_2.anInt4972);
			}
			if (this.aBoolean552) {
				this.anObjectArray1[arg1] = null;
			}
			@Pc(226) int local226;
			if (local25 > 1) {
				@Pc(233) int local233;
				@Pc(246) Class8_Sub8 local246;
				@Pc(253) int local253;
				@Pc(255) int local255;
				@Pc(259) int local259;
				@Pc(261) int local261;
				@Pc(273) int local273;
				@Pc(324) int local324;
				@Pc(326) int local326;
				if (this.anInt7642 == 2) {
					local226 = local151.length;
					@Pc(229) int local229 = local226 - 1;
					local233 = local151[local229] & 0xFF;
					@Pc(241) int local241 = local229 - local25 * local233 * 4;
					local246 = new Class8_Sub8(local151);
					@Pc(248) int local248 = 0;
					local246.anInt10588 = local241;
					local253 = 0;
					for (local255 = 0; local255 < local233; local255++) {
						local259 = 0;
						for (local261 = 0; local261 < local25; local261++) {
							local259 += local246.method8540();
							if (local31 == null) {
								local273 = local261;
							} else {
								local273 = local31[local261];
							}
							if (arg2 == local273) {
								local248 += local259;
								local253 = local273;
							}
						}
					}
					if (local248 == 0) {
						return true;
					}
					@Pc(311) byte[] local311 = new byte[local248];
					local246.anInt10588 = local241;
					local248 = 0;
					local261 = 0;
					for (local273 = 0; local273 < local233; local273++) {
						local324 = 0;
						for (local326 = 0; local326 < local25; local326++) {
							local324 += local246.method8540();
							@Pc(340) int local340;
							if (local31 == null) {
								local340 = local326;
							} else {
								local340 = local31[local326];
							}
							if (local340 == arg2) {
								Static649.method5532(local151, local261, local311, local248, local324);
								local248 += local324;
							}
							local261 += local324;
						}
					}
					local51[local253] = local311;
				} else {
					local226 = local151.length;
					local226--;
					local233 = local151[local226] & 0xFF;
					local226 -= local233 * 4 * local25;
					local246 = new Class8_Sub8(local151);
					@Pc(409) int[] local409 = new int[local25];
					local246.anInt10588 = local226;
					for (local253 = 0; local253 < local233; local253++) {
						local255 = 0;
						for (local259 = 0; local259 < local25; local259++) {
							local255 += local246.method8540();
							local409[local259] += local255;
						}
					}
					@Pc(446) byte[][] local446 = new byte[local25][];
					for (local259 = 0; local259 < local25; local259++) {
						local446[local259] = new byte[local409[local259]];
						local409[local259] = 0;
					}
					local246.anInt10588 = local226;
					local261 = 0;
					for (local273 = 0; local273 < local233; local273++) {
						local324 = 0;
						for (local326 = 0; local326 < local25; local326++) {
							local324 += local246.method8540();
							Static649.method5532(local151, local261, local446[local326], local409[local326], local324);
							local409[local326] += local324;
							local261 += local324;
						}
					}
					for (local324 = 0; local324 < local25; local324++) {
						if (local31 == null) {
							local326 = local324;
						} else {
							local326 = local31[local324];
						}
						if (this.anInt7642 == 0) {
							local51[local326] = Static550.method8311(local446[local324]);
						} else {
							local51[local326] = local446[local324];
						}
					}
				}
			} else {
				if (local31 == null) {
					local226 = 0;
				} else {
					local226 = local31[0];
				}
				if (this.anInt7642 == 0) {
					local51[local226] = Static550.method8311(local151);
				} else {
					local51[local226] = local151;
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z")
	public boolean method6295(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method6301()) {
			return false;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(15) String local15 = arg1.toLowerCase();
		@Pc(24) int local24 = this.aClass137_2.aClass312_1.method7424(Static180.method3452(local12));
		if (local24 < 0) {
			return false;
		} else {
			@Pc(41) int local41 = this.aClass137_2.aClass312Array1[local24].method7424(Static180.method3452(local15));
			return local41 >= 0;
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(BI)Z")
	public boolean method6296(@OriginalArg(1) int arg0) {
		if (!this.method6301()) {
			return false;
		} else if (this.aClass137_2.anIntArray271.length == 1) {
			return this.method6326(0, arg0);
		} else if (!this.method6316(arg0)) {
			return false;
		} else if (this.aClass137_2.anIntArray271[arg0] == 1) {
			return this.method6326(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(BLjava/lang/String;)V")
	public void method6297(@OriginalArg(1) String arg0) {
		if (this.method6301()) {
			@Pc(17) String local17 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass137_2.aClass312_1.method7424(Static180.method3452(local17));
			this.method6298(local26);
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)V")
	private void method6298(@OriginalArg(1) int arg0) {
		this.aClass210_1.method5506(arg0);
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method6299(@OriginalArg(0) String arg0) {
		if (this.method6301()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(27) int local27 = this.aClass137_2.aClass312_1.method7424(Static180.method3452(local12));
			return this.method6324(local27);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(II)V")
	private void method6300(@OriginalArg(0) int arg0) {
		if (this.aBoolean552) {
			this.anObjectArray1[arg0] = this.aClass210_1.method5503(arg0);
		} else {
			this.anObjectArray1[arg0] = Static550.method8311(this.aClass210_1.method5503(arg0));
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)Z")
	private boolean method6301() {
		if (this.aClass137_2 == null) {
			this.aClass137_2 = this.aClass210_1.method5501();
			if (this.aClass137_2 == null) {
				return false;
			}
			this.anObjectArrayArray1 = new Object[this.aClass137_2.anInt4973][];
			this.anObjectArray1 = new Object[this.aClass137_2.anInt4973];
		}
		return true;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method6302(@OriginalArg(1) String arg0) {
		if (this.method6301()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass137_2.aClass312_1.method7424(Static180.method3452(local12));
			return local21 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(BI)[I")
	public int[] method6303(@OriginalArg(1) int arg0) {
		if (!this.method6316(arg0)) {
			return null;
		}
		@Pc(26) int[] local26 = this.aClass137_2.anIntArrayArray27[arg0];
		if (local26 == null) {
			local26 = new int[this.aClass137_2.anIntArray266[arg0]];
			@Pc(37) int local37 = 0;
			while (local26.length > local37) {
				local26[local37] = local37++;
			}
		}
		return local26;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;)[B")
	public byte[] method6304(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method6301()) {
			return null;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(15) String local15 = arg1.toLowerCase();
		@Pc(30) int local30 = this.aClass137_2.aClass312_1.method7424(Static180.method3452(local12));
		if (this.method6316(local30)) {
			@Pc(48) int local48 = this.aClass137_2.aClass312Array1[local30].method7424(Static180.method3452(local15));
			return this.method6314(local30, local48);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZI)[B")
	public byte[] method6305(@OriginalArg(1) int arg0) {
		if (!this.method6301()) {
			return null;
		} else if (this.aClass137_2.anIntArray271.length == 1) {
			return this.method6314(0, arg0);
		} else if (!this.method6316(arg0)) {
			return null;
		} else if (this.aClass137_2.anIntArray271[arg0] == 1) {
			return this.method6314(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(BLjava/lang/String;)Z")
	public boolean method6306(@OriginalArg(1) String arg0) {
		@Pc(13) int local13 = this.method6307("");
		return local13 == -1 ? this.method6293("", arg0) : this.method6293(arg0, "");
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(ILjava/lang/String;)I")
	public int method6307(@OriginalArg(1) String arg0) {
		if (this.method6301()) {
			@Pc(20) String local20 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass137_2.aClass312_1.method7424(Static180.method3452(local20));
			return this.method6316(local29) ? local29 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "(II)I")
	private int method6308(@OriginalArg(1) int arg0) {
		if (this.method6316(arg0)) {
			return this.anObjectArray1[arg0] == null ? this.aClass210_1.method5502(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public int method6309(@OriginalArg(1) String arg0) {
		if (this.method6301()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass137_2.aClass312_1.method7424(Static180.method3452(local12));
			return this.method6308(local29);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)I")
	public int method6311() {
		return this.method6301() ? this.aClass137_2.anIntArray271.length : -1;
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(B)Z")
	public boolean method6312() {
		if (!this.method6301()) {
			return false;
		}
		@Pc(21) boolean local21 = true;
		for (@Pc(23) int local23 = 0; local23 < this.aClass137_2.anIntArray270.length; local23++) {
			@Pc(31) int local31 = this.aClass137_2.anIntArray270[local23];
			if (this.anObjectArray1[local31] == null) {
				this.method6300(local31);
				if (this.anObjectArray1[local31] == null) {
					local21 = false;
				}
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!oh", name = "d", descriptor = "(II)I")
	public int method6313(@OriginalArg(1) int arg0) {
		if (this.method6301()) {
			@Pc(16) int local16 = this.aClass137_2.aClass312_1.method7424(arg0);
			return this.method6316(local16) ? local16 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIB)[B")
	public byte[] method6314(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method6323(arg1, arg0, null);
	}

	@OriginalMember(owner = "client!oh", name = "e", descriptor = "(II)I")
	public int method6315(@OriginalArg(1) int arg0) {
		return this.method6316(arg0) ? this.aClass137_2.anIntArray271[arg0] : 0;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IB)Z")
	private boolean method6316(@OriginalArg(0) int arg0) {
		if (!this.method6301()) {
			return false;
		} else if (arg0 >= 0 && this.aClass137_2.anIntArray271.length > arg0 && this.aClass137_2.anIntArray271[arg0] != 0) {
			return true;
		} else if (Static344.aBoolean464) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(ZI)V")
	public void method6317(@OriginalArg(1) int arg0) {
		if (this.method6316(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZZB)V")
	public void method6318(@OriginalArg(0) boolean arg0) {
		if (!this.method6301()) {
			return;
		}
		this.aClass137_2.aClass312Array1 = null;
		this.aClass137_2.anIntArrayArray26 = null;
		if (arg0) {
			this.aClass137_2.anIntArray269 = null;
			this.aClass137_2.aClass312_1 = null;
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(III)Z")
	private boolean method6319(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method6301()) {
			return false;
		} else if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aClass137_2.anIntArray271.length && this.aClass137_2.anIntArray271[arg0] > arg1) {
			return true;
		} else if (Static344.aBoolean464) {
			throw new IllegalArgumentException(arg0 + "," + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)I")
	public int method6320() {
		if (!this.method6301()) {
			return 0;
		}
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = 0;
		for (@Pc(22) int local22 = 0; local22 < this.anObjectArray1.length; local22++) {
			if (this.aClass137_2.anIntArray266[local22] > 0) {
				local20 += this.method6308(local22);
				local18 += 100;
			}
		}
		if (local18 == 0) {
			return 100;
		} else {
			return local20 * 100 / local18;
		}
	}

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "(I)V")
	public void method6321() {
		if (this.anObjectArray1 != null) {
			for (@Pc(17) int local17 = 0; local17 < this.anObjectArray1.length; local17++) {
				this.anObjectArray1[local17] = null;
			}
		}
	}

	@OriginalMember(owner = "client!oh", name = "d", descriptor = "(I)I")
	public int method6322() {
		if (!this.method6301()) {
			throw new IllegalStateException("");
		}
		return this.aClass137_2.anInt4972;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(III[I)[B")
	public byte[] method6323(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		if (!this.method6319(arg1, arg0)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg1] == null || this.anObjectArrayArray1[arg1][arg0] == null) {
			@Pc(30) boolean local30 = this.method6294(arg2, arg1, arg0);
			if (!local30) {
				this.method6300(arg1);
				local30 = this.method6294(arg2, arg1, arg0);
				if (!local30) {
					return null;
				}
			}
		}
		@Pc(57) byte[] local57 = Static565.method3489(this.anObjectArrayArray1[arg1][arg0], false);
		if (this.anInt7642 == 1) {
			this.anObjectArrayArray1[arg1][arg0] = null;
			if (this.aClass137_2.anIntArray271[arg1] == 1) {
				this.anObjectArrayArray1[arg1] = null;
			}
		} else if (this.anInt7642 == 2) {
			this.anObjectArrayArray1[arg1] = null;
		}
		return local57;
	}

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "(BI)Z")
	public boolean method6324(@OriginalArg(1) int arg0) {
		if (!this.method6316(arg0)) {
			return false;
		} else if (this.anObjectArray1[arg0] == null) {
			this.method6300(arg0);
			return this.anObjectArray1[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "(B)V")
	public void method6325() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(20) int local20 = 0; local20 < this.anObjectArrayArray1.length; local20++) {
				this.anObjectArrayArray1[local20] = null;
			}
		}
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(IIB)Z")
	public boolean method6326(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method6319(arg0, arg1)) {
			return false;
		} else if (this.anObjectArrayArray1[arg0] != null && this.anObjectArrayArray1[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray1[arg0] == null) {
			this.method6300(arg0);
			return this.anObjectArray1[arg0] != null;
		} else {
			return true;
		}
	}
}
