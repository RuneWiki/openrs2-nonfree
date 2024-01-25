import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wm")
public final class Class390 {

	@OriginalMember(owner = "client!wm", name = "t", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray35;

	@OriginalMember(owner = "client!wm", name = "N", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!wm", name = "D", descriptor = "Lclient!oia;")
	private Class265 aClass265_2 = null;

	@OriginalMember(owner = "client!wm", name = "H", descriptor = "Lclient!sw;")
	private final Class210 aClass210_1;

	@OriginalMember(owner = "client!wm", name = "E", descriptor = "Z")
	private final boolean aBoolean908;

	@OriginalMember(owner = "client!wm", name = "C", descriptor = "I")
	public int anInt10731;

	@OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(Lclient!sw;ZI)V")
	public Class390(@OriginalArg(0) Class210 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (arg2 < 0 || arg2 > 2) {
			throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
		}
		this.aClass210_1 = arg0;
		this.aBoolean908 = arg1;
		this.anInt10731 = arg2;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IB)[I")
	public int[] method8900(@OriginalArg(0) int arg0) {
		if (!this.method8924(arg0)) {
			return null;
		}
		@Pc(16) int[] local16 = this.aClass265_2.anIntArrayArray38[arg0];
		if (local16 == null) {
			local16 = new int[this.aClass265_2.anIntArray424[arg0]];
			@Pc(27) int local27 = 0;
			while (local16.length > local27) {
				local16[local27] = local27++;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(B)Z")
	private boolean method8901() {
		if (this.aClass265_2 == null) {
			this.aClass265_2 = this.aClass210_1.method5142();
			if (this.aClass265_2 == null) {
				return false;
			}
			this.anObjectArray35 = new Object[this.aClass265_2.anInt7442];
			this.anObjectArrayArray1 = new Object[this.aClass265_2.anInt7442][];
		}
		return true;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(BII)Z")
	public boolean method8902(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method8903(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray1[arg0] != null && this.anObjectArrayArray1[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray35[arg0] == null) {
			this.method8936(arg0);
			return this.anObjectArray35[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IBI)Z")
	private boolean method8903(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method8901()) {
			return false;
		} else if (arg1 >= 0 && arg0 >= 0 && this.aClass265_2.anIntArray425.length > arg1 && this.aClass265_2.anIntArray425[arg1] > arg0) {
			return true;
		} else if (Static579.aBoolean802) {
			throw new IllegalArgumentException(arg1 + "," + arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(II)Z")
	public boolean method8905(@OriginalArg(1) int arg0) {
		if (!this.method8901()) {
			return false;
		} else if (this.aClass265_2.anIntArray425.length == 1) {
			return this.method8902(0, arg0);
		} else if (!this.method8924(arg0)) {
			return false;
		} else if (this.aClass265_2.anIntArray425[arg0] == 1) {
			return this.method8902(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(ZI)V")
	public void method8906(@OriginalArg(1) int arg0) {
		if (this.method8924(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)V")
	public void method8907() {
		if (this.anObjectArray35 != null) {
			for (@Pc(17) int local17 = 0; local17 < this.anObjectArray35.length; local17++) {
				this.anObjectArray35[local17] = null;
			}
		}
	}

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "(II)V")
	private void method8908(@OriginalArg(1) int arg0) {
		this.aClass210_1.method5146(arg0);
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "([IIBI)Z")
	private boolean method8909(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (!this.method8924(arg1)) {
			return false;
		} else if (this.anObjectArray35[arg1] == null) {
			return false;
		} else {
			@Pc(23) int local23 = this.aClass265_2.anIntArray424[arg1];
			@Pc(29) int[] local29 = this.aClass265_2.anIntArrayArray38[arg1];
			if (this.anObjectArrayArray1[arg1] == null) {
				this.anObjectArrayArray1[arg1] = new Object[this.aClass265_2.anIntArray425[arg1]];
			}
			@Pc(49) Object[] local49 = this.anObjectArrayArray1[arg1];
			@Pc(51) boolean local51 = true;
			for (@Pc(53) int local53 = 0; local53 < local23; local53++) {
				@Pc(68) int local68;
				if (local29 == null) {
					local68 = local53;
				} else {
					local68 = local29[local53];
				}
				if (local49[local68] == null) {
					local51 = false;
					break;
				}
			}
			if (local51) {
				return true;
			}
			@Pc(122) byte[] local122;
			if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
				local122 = Static549.method7639(this.anObjectArray35[arg1], false);
			} else {
				local122 = Static549.method7639(this.anObjectArray35[arg1], true);
				@Pc(136) Class5_Sub41 local136 = new Class5_Sub41(local122);
				local136.method7855(local136.aByteArray93.length, arg0);
			}
			@Pc(148) byte[] local148;
			try {
				local148 = Static21.method286(local122);
			} catch (@Pc(150) RuntimeException local150) {
				throw Static405.method7457(local150, "T3 - " + (arg0 != null) + "," + arg1 + "," + local122.length + "," + Static432.method6356(local122.length, local122) + "," + Static432.method6356(local122.length - 2, local122) + "," + this.aClass265_2.anIntArray421[arg1] + "," + this.aClass265_2.anInt7444);
			}
			if (this.aBoolean908) {
				this.anObjectArray35[arg1] = null;
			}
			@Pc(225) int local225;
			if (local23 > 1) {
				@Pc(232) int local232;
				@Pc(245) Class5_Sub41 local245;
				@Pc(253) int local253;
				@Pc(256) int local256;
				@Pc(258) int local258;
				@Pc(314) int local314;
				@Pc(316) int local316;
				@Pc(319) int local319;
				@Pc(321) int local321;
				if (this.anInt10731 == 2) {
					local225 = local148.length;
					local225--;
					local232 = local148[local225] & 0xFF;
					local225 -= local232 * 4 * local23;
					local245 = new Class5_Sub41(local148);
					@Pc(421) int local421 = 0;
					local245.anInt9230 = local225;
					local253 = 0;
					for (local256 = 0; local256 < local232; local256++) {
						local258 = 0;
						for (local314 = 0; local314 < local23; local314++) {
							local258 += local245.method7804();
							if (local29 == null) {
								local316 = local314;
							} else {
								local316 = local29[local314];
							}
							if (arg2 == local316) {
								local253 = local316;
								local421 += local258;
							}
						}
					}
					if (local421 == 0) {
						return true;
					}
					@Pc(488) byte[] local488 = new byte[local421];
					local421 = 0;
					local245.anInt9230 = local225;
					local314 = 0;
					for (local316 = 0; local316 < local232; local316++) {
						local319 = 0;
						for (local321 = 0; local321 < local23; local321++) {
							local319 += local245.method7804();
							@Pc(515) int local515;
							if (local29 == null) {
								local515 = local321;
							} else {
								local515 = local29[local321];
							}
							if (arg2 == local515) {
								Static686.method4972(local148, local314, local488, local421, local319);
								local421 += local319;
							}
							local314 += local319;
						}
					}
					local49[local253] = local488;
				} else {
					local225 = local148.length;
					@Pc(228) int local228 = local225 - 1;
					local232 = local148[local228] & 0xFF;
					@Pc(240) int local240 = local228 - local23 * local232 * 4;
					local245 = new Class5_Sub41(local148);
					local245.anInt9230 = local240;
					@Pc(251) int[] local251 = new int[local23];
					for (local253 = 0; local253 < local232; local253++) {
						local256 = 0;
						for (local258 = 0; local258 < local23; local258++) {
							local256 += local245.method7804();
							local251[local258] += local256;
						}
					}
					@Pc(287) byte[][] local287 = new byte[local23][];
					for (local258 = 0; local258 < local23; local258++) {
						local287[local258] = new byte[local251[local258]];
						local251[local258] = 0;
					}
					local245.anInt9230 = local240;
					local314 = 0;
					for (local316 = 0; local316 < local232; local316++) {
						local319 = 0;
						for (local321 = 0; local321 < local23; local321++) {
							local319 += local245.method7804();
							Static686.method4972(local148, local314, local287[local321], local251[local321], local319);
							local251[local321] += local319;
							local314 += local319;
						}
					}
					for (local319 = 0; local319 < local23; local319++) {
						if (local29 == null) {
							local321 = local319;
						} else {
							local321 = local29[local319];
						}
						if (this.anInt10731 == 0) {
							local49[local321] = Static249.method3855(local287[local319]);
						} else {
							local49[local321] = local287[local319];
						}
					}
				}
			} else {
				if (local29 == null) {
					local225 = 0;
				} else {
					local225 = local29[0];
				}
				if (this.anInt10731 == 0) {
					local49[local225] = Static249.method3855(local148);
				} else {
					local49[local225] = local148;
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method8910(@OriginalArg(1) String arg0) {
		if (this.method8901()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass265_2.aClass186_1.method4776(Static670.method8954(local12));
			return this.method8924(local21) ? local21 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "(IB)I")
	public int method8911(@OriginalArg(0) int arg0) {
		if (this.method8901()) {
			@Pc(21) int local21 = this.aClass265_2.aClass186_1.method4776(arg0);
			return this.method8924(local21) ? local21 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(BI)I")
	private int method8912(@OriginalArg(1) int arg0) {
		if (this.method8924(arg0)) {
			return this.anObjectArray35[arg0] == null ? this.aClass210_1.method5145(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!wm", name = "c", descriptor = "(II)I")
	public int method8913(@OriginalArg(1) int arg0) {
		return this.method8924(arg0) ? this.aClass265_2.anIntArray425[arg0] : 0;
	}

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "(IBI)[B")
	public byte[] method8914(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.method8927((int[]) null, arg0, arg1);
	}

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "(I)I")
	public int method8915() {
		if (!this.method8901()) {
			throw new IllegalStateException("");
		}
		return this.aClass265_2.anInt7444;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method8916(@OriginalArg(0) String arg0) {
		if (this.method8901()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass265_2.aClass186_1.method4776(Static670.method8954(local12));
			return this.method8931(local29);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)[B")
	public byte[] method8917(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method8901()) {
			return null;
		}
		@Pc(20) String local20 = arg0.toLowerCase();
		@Pc(23) String local23 = arg1.toLowerCase();
		@Pc(32) int local32 = this.aClass265_2.aClass186_1.method4776(Static670.method8954(local20));
		if (this.method8924(local32)) {
			@Pc(50) int local50 = this.aClass265_2.aClass186Array1[local32].method4776(Static670.method8954(local23));
			return this.method8914(local32, local50);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "(B)I")
	public int method8918() {
		return this.method8901() ? this.aClass265_2.anIntArray425.length : -1;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)Z")
	private boolean method8919(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method8901()) {
			return false;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(15) String local15 = arg0.toLowerCase();
		@Pc(24) int local24 = this.aClass265_2.aClass186_1.method4776(Static670.method8954(local12));
		if (this.method8924(local24)) {
			@Pc(46) int local46 = this.aClass265_2.aClass186Array1[local24].method4776(Static670.method8954(local15));
			return this.method8902(local24, local46);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public boolean method8921(@OriginalArg(0) String arg0) {
		@Pc(16) int local16 = this.method8910("");
		return local16 == -1 ? this.method8919("", arg0) : this.method8919(arg0, "");
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(BZZ)V")
	public void method8922(@OriginalArg(2) boolean arg0) {
		if (!this.method8901()) {
			return;
		}
		this.aClass265_2.anIntArrayArray37 = null;
		this.aClass265_2.aClass186Array1 = null;
		if (arg0) {
			this.aClass265_2.anIntArray426 = null;
			this.aClass265_2.aClass186_1 = null;
		}
	}

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "(BI)[B")
	public byte[] method8923(@OriginalArg(1) int arg0) {
		if (!this.method8901()) {
			return null;
		} else if (this.aClass265_2.anIntArray425.length == 1) {
			return this.method8914(0, arg0);
		} else if (!this.method8924(arg0)) {
			return null;
		} else if (this.aClass265_2.anIntArray425[arg0] == 1) {
			return this.method8914(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IZ)Z")
	private boolean method8924(@OriginalArg(0) int arg0) {
		if (!this.method8901()) {
			return false;
		} else if (arg0 >= 0 && this.aClass265_2.anIntArray425.length > arg0 && this.aClass265_2.anIntArray425[arg0] != 0) {
			return true;
		} else if (Static579.aBoolean802) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "(ILjava/lang/String;Ljava/lang/String;)Z")
	public boolean method8925(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method8901()) {
			return false;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(24) String local24 = arg0.toLowerCase();
		@Pc(33) int local33 = this.aClass265_2.aClass186_1.method4776(Static670.method8954(local12));
		if (local33 < 0) {
			return false;
		} else {
			@Pc(51) int local51 = this.aClass265_2.aClass186Array1[local33].method4776(Static670.method8954(local24));
			return local51 >= 0;
		}
	}

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "(Ljava/lang/String;I)I")
	public int method8926(@OriginalArg(0) String arg0) {
		if (this.method8901()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass265_2.aClass186_1.method4776(Static670.method8954(local12));
			return this.method8912(local26);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(I[III)[B")
	public byte[] method8927(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (!this.method8903(arg2, arg1)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg1] == null || this.anObjectArrayArray1[arg1][arg2] == null) {
			@Pc(38) boolean local38 = this.method8909(arg0, arg1, arg2);
			if (!local38) {
				this.method8936(arg1);
				local38 = this.method8909(arg0, arg1, arg2);
				if (!local38) {
					return null;
				}
			}
		}
		@Pc(65) byte[] local65 = Static549.method7639(this.anObjectArrayArray1[arg1][arg2], false);
		if (this.anInt10731 == 1) {
			this.anObjectArrayArray1[arg1][arg2] = null;
			if (this.aClass265_2.anIntArray425[arg1] == 1) {
				this.anObjectArrayArray1[arg1] = null;
			}
		} else if (this.anInt10731 == 2) {
			this.anObjectArrayArray1[arg1] = null;
		}
		return local65;
	}

	@OriginalMember(owner = "client!wm", name = "c", descriptor = "(Ljava/lang/String;I)V")
	public void method8929(@OriginalArg(0) String arg0) {
		if (this.method8901()) {
			@Pc(11) String local11 = arg0.toLowerCase();
			@Pc(20) int local20 = this.aClass265_2.aClass186_1.method4776(Static670.method8954(local11));
			this.method8908(local20);
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Z)V")
	public void method8930() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(8) int local8 = 0; local8 < this.anObjectArrayArray1.length; local8++) {
				this.anObjectArrayArray1[local8] = null;
			}
		}
	}

	@OriginalMember(owner = "client!wm", name = "d", descriptor = "(II)Z")
	public boolean method8931(@OriginalArg(1) int arg0) {
		if (!this.method8924(arg0)) {
			return false;
		} else if (this.anObjectArray35[arg0] == null) {
			this.method8936(arg0);
			return this.anObjectArray35[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!wm", name = "d", descriptor = "(I)Z")
	public boolean method8932() {
		if (!this.method8901()) {
			return false;
		}
		@Pc(13) boolean local13 = true;
		for (@Pc(20) int local20 = 0; local20 < this.aClass265_2.anIntArray422.length; local20++) {
			@Pc(28) int local28 = this.aClass265_2.anIntArray422[local20];
			if (this.anObjectArray35[local28] == null) {
				this.method8936(local28);
				if (this.anObjectArray35[local28] == null) {
					local13 = false;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!wm", name = "e", descriptor = "(I)I")
	public int method8934() {
		if (!this.method8901()) {
			return 0;
		}
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anObjectArray35.length; local17++) {
			if (this.aClass265_2.anIntArray424[local17] > 0) {
				local15 += this.method8912(local17);
				local13 += 100;
			}
		}
		if (local13 == 0) {
			return 100;
		} else {
			return local15 * 100 / local13;
		}
	}

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "(ILjava/lang/String;)Z")
	public boolean method8935(@OriginalArg(1) String arg0) {
		if (this.method8901()) {
			@Pc(17) String local17 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass265_2.aClass186_1.method4776(Static670.method8954(local17));
			return local26 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wm", name = "e", descriptor = "(II)V")
	private void method8936(@OriginalArg(1) int arg0) {
		if (this.aBoolean908) {
			this.anObjectArray35[arg0] = this.aClass210_1.method5144(arg0);
		} else {
			this.anObjectArray35[arg0] = Static249.method3855(this.aClass210_1.method5144(arg0));
		}
	}
}
