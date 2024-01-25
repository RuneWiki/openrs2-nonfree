import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qn")
public final class Class211 {

	@OriginalMember(owner = "client!qn", name = "s", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray35;

	@OriginalMember(owner = "client!qn", name = "M", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!qn", name = "j", descriptor = "Lclient!f;")
	private Class77 aClass77_1 = null;

	@OriginalMember(owner = "client!qn", name = "v", descriptor = "I")
	public int anInt5388;

	@OriginalMember(owner = "client!qn", name = "R", descriptor = "Z")
	private final boolean aBoolean382;

	@OriginalMember(owner = "client!qn", name = "h", descriptor = "Lclient!im;")
	private final Class124 aClass124_1;

	static {
		new Class15("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(Lclient!im;ZI)V")
	public Class211(@OriginalArg(0) Class124 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.anInt5388 = arg2;
		this.aBoolean382 = arg1;
		this.aClass124_1 = arg0;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IZ)V")
	private void method4351(@OriginalArg(0) int arg0) {
		if (this.aBoolean382) {
			this.anObjectArray35[arg0] = this.aClass124_1.method5839(arg0);
		} else {
			this.anObjectArray35[arg0] = Static4.method71(this.aClass124_1.method5839(arg0));
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IB)[I")
	public int[] method4352(@OriginalArg(0) int arg0) {
		if (!this.method4364(arg0)) {
			return null;
		}
		@Pc(18) int[] local18 = this.aClass77_1.anIntArrayArray22[arg0];
		if (local18 == null) {
			local18 = new int[this.aClass77_1.anIntArray135[arg0]];
			@Pc(29) int local29 = 0;
			while (local18.length > local29) {
				local18[local29] = local29++;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(II)[B")
	public byte[] method4353(@OriginalArg(0) int arg0) {
		if (!this.method4386()) {
			return null;
		} else if (this.aClass77_1.anIntArray138.length == 1) {
			return this.method4377(0, arg0);
		} else if (!this.method4364(arg0)) {
			return null;
		} else if (this.aClass77_1.anIntArray138[arg0] == 1) {
			return this.method4377(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method4355(@OriginalArg(0) String arg0) {
		if (this.method4386()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass77_1.aClass242_1.method5159(Static376.method4954(local12));
			return local29 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(III[I)Z")
	private boolean method4356(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		if (!this.method4364(arg0)) {
			return false;
		} else if (this.anObjectArray35[arg0] == null) {
			return false;
		} else {
			@Pc(25) int local25 = this.aClass77_1.anIntArray135[arg0];
			@Pc(31) int[] local31 = this.aClass77_1.anIntArrayArray22[arg0];
			if (this.anObjectArrayArray1[arg0] == null) {
				this.anObjectArrayArray1[arg0] = new Object[this.aClass77_1.anIntArray138[arg0]];
			}
			@Pc(51) Object[] local51 = this.anObjectArrayArray1[arg0];
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
			@Pc(133) byte[] local133;
			if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
				local133 = Static59.method427(false, this.anObjectArray35[arg0]);
			} else {
				local133 = Static59.method427(true, this.anObjectArray35[arg0]);
				@Pc(148) Class4_Sub9 local148 = new Class4_Sub9(local133);
				local148.method5041(local148.aByteArray81.length, arg2);
			}
			@Pc(160) byte[] local160;
			try {
				local160 = Static446.method5930(local133);
			} catch (@Pc(162) RuntimeException local162) {
				throw Static423.method5701(local162, "T3 - " + (arg2 != null) + "," + arg0 + "," + local133.length + "," + Static426.method3629(local133, local133.length) + "," + Static426.method3629(local133, local133.length - 2) + "," + this.aClass77_1.anIntArray141[arg0] + "," + this.aClass77_1.anInt1854);
			}
			if (this.aBoolean382) {
				this.anObjectArray35[arg0] = null;
			}
			@Pc(239) int local239;
			if (local25 > 1) {
				@Pc(246) int local246;
				@Pc(259) Class4_Sub9 local259;
				@Pc(263) int local263;
				@Pc(268) int local268;
				@Pc(272) int local272;
				@Pc(274) int local274;
				@Pc(286) int local286;
				@Pc(337) int local337;
				@Pc(339) int local339;
				if (this.anInt5388 == 2) {
					local239 = local160.length;
					@Pc(242) int local242 = local239 - 1;
					local246 = local160[local242] & 0xFF;
					@Pc(254) int local254 = local242 - local25 * 4 * local246;
					local259 = new Class4_Sub9(local160);
					@Pc(261) int local261 = 0;
					local263 = 0;
					local259.anInt6207 = local254;
					for (local268 = 0; local268 < local246; local268++) {
						local272 = 0;
						for (local274 = 0; local274 < local25; local274++) {
							local272 += local259.method4997();
							if (local31 == null) {
								local286 = local274;
							} else {
								local286 = local31[local274];
							}
							if (arg1 == local286) {
								local263 = local286;
								local261 += local272;
							}
						}
					}
					if (local261 == 0) {
						return true;
					}
					@Pc(324) byte[] local324 = new byte[local261];
					local261 = 0;
					local259.anInt6207 = local254;
					local274 = 0;
					for (local286 = 0; local286 < local246; local286++) {
						local337 = 0;
						for (local339 = 0; local339 < local25; local339++) {
							local337 += local259.method4997();
							@Pc(353) int local353;
							if (local31 == null) {
								local353 = local339;
							} else {
								local353 = local31[local339];
							}
							if (arg1 == local353) {
								Static461.method1985(local160, local274, local324, local261, local337);
								local261 += local337;
							}
							local274 += local337;
						}
					}
					local51[local263] = local324;
				} else {
					local239 = local160.length;
					local239--;
					local246 = local160[local239] & 0xFF;
					local239 -= local25 * local246 * 4;
					local259 = new Class4_Sub9(local160);
					@Pc(428) int[] local428 = new int[local25];
					local259.anInt6207 = local239;
					for (local263 = 0; local263 < local246; local263++) {
						local268 = 0;
						for (local272 = 0; local272 < local25; local272++) {
							local268 += local259.method4997();
							local428[local272] += local268;
						}
					}
					@Pc(469) byte[][] local469 = new byte[local25][];
					for (local272 = 0; local272 < local25; local272++) {
						local469[local272] = new byte[local428[local272]];
						local428[local272] = 0;
					}
					local259.anInt6207 = local239;
					local274 = 0;
					for (local286 = 0; local286 < local246; local286++) {
						local337 = 0;
						for (local339 = 0; local339 < local25; local339++) {
							local337 += local259.method4997();
							Static461.method1985(local160, local274, local469[local339], local428[local339], local337);
							local274 += local337;
							local428[local339] += local337;
						}
					}
					for (local337 = 0; local337 < local25; local337++) {
						if (local31 == null) {
							local339 = local337;
						} else {
							local339 = local31[local337];
						}
						if (this.anInt5388 == 0) {
							local51[local339] = Static4.method71(local469[local337]);
						} else {
							local51[local339] = local469[local337];
						}
					}
				}
			} else {
				if (local31 == null) {
					local239 = 0;
				} else {
					local239 = local31[0];
				}
				if (this.anInt5388 == 0) {
					local51[local239] = Static4.method71(local160);
				} else {
					local51[local239] = local160;
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)V")
	public void method4357() {
		if (this.anObjectArray35 != null) {
			for (@Pc(14) int local14 = 0; local14 < this.anObjectArray35.length; local14++) {
				this.anObjectArray35[local14] = null;
			}
		}
	}

	@OriginalMember(owner = "client!qn", name = "c", descriptor = "(I)I")
	public int method4359() {
		if (!this.method4386()) {
			return 0;
		}
		@Pc(21) int local21 = 0;
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < this.anObjectArray35.length; local25++) {
			if (this.aClass77_1.anIntArray135[local25] > 0) {
				local21 += 100;
				local23 += this.method4361(local25);
			}
		}
		if (local21 == 0) {
			return 100;
		} else {
			return local23 * 100 / local21;
		}
	}

	@OriginalMember(owner = "client!qn", name = "d", descriptor = "(I)Z")
	public boolean method4360() {
		if (!this.method4386()) {
			return false;
		}
		@Pc(21) boolean local21 = true;
		for (@Pc(23) int local23 = 0; local23 < this.aClass77_1.anIntArray137.length; local23++) {
			@Pc(31) int local31 = this.aClass77_1.anIntArray137[local23];
			if (this.anObjectArray35[local31] == null) {
				this.method4351(local31);
				if (this.anObjectArray35[local31] == null) {
					local21 = false;
				}
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(IB)I")
	private int method4361(@OriginalArg(0) int arg0) {
		if (this.method4364(arg0)) {
			return this.anObjectArray35[arg0] == null ? this.aClass124_1.method5837(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B")
	public byte[] method4362(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method4386()) {
			return null;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(23) String local23 = arg0.toLowerCase();
		@Pc(32) int local32 = this.aClass77_1.aClass242_1.method5159(Static376.method4954(local12));
		if (this.method4364(local32)) {
			@Pc(50) int local50 = this.aClass77_1.aClass242Array1[local32].method5159(Static376.method4954(local23));
			return this.method4377(local32, local50);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(Ljava/lang/String;I)V")
	public void method4363(@OriginalArg(0) String arg0) {
		if (this.method4386()) {
			@Pc(11) String local11 = arg0.toLowerCase();
			@Pc(25) int local25 = this.aClass77_1.aClass242_1.method5159(Static376.method4954(local11));
			this.method4371(local25);
		}
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(II)Z")
	private boolean method4364(@OriginalArg(0) int arg0) {
		if (!this.method4386()) {
			return false;
		} else if (arg0 >= 0 && arg0 < this.aClass77_1.anIntArray138.length && this.aClass77_1.anIntArray138[arg0] != 0) {
			return true;
		} else if (Static149.aBoolean186) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qn", name = "c", descriptor = "(II)I")
	public int method4365(@OriginalArg(1) int arg0) {
		return this.method4364(arg0) ? this.aClass77_1.anIntArray138[arg0] : 0;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IBI)Z")
	public boolean method4367(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method4373(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray1[arg0] != null && this.anObjectArrayArray1[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray35[arg0] == null) {
			this.method4351(arg0);
			return this.anObjectArray35[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(B)I")
	public int method4368() {
		return this.method4386() ? this.aClass77_1.anIntArray138.length : -1;
	}

	@OriginalMember(owner = "client!qn", name = "d", descriptor = "(II)V")
	public void method4369(@OriginalArg(1) int arg0) {
		if (this.method4364(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!qn", name = "c", descriptor = "(IB)I")
	public int method4370(@OriginalArg(0) int arg0) {
		if (this.method4386()) {
			@Pc(22) int local22 = this.aClass77_1.aClass242_1.method5159(arg0);
			return this.method4364(local22) ? local22 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!qn", name = "e", descriptor = "(II)V")
	private void method4371(@OriginalArg(1) int arg0) {
		this.aClass124_1.method5832(arg0);
	}

	@OriginalMember(owner = "client!qn", name = "f", descriptor = "(II)Z")
	public boolean method4372(@OriginalArg(0) int arg0) {
		if (!this.method4364(arg0)) {
			return false;
		} else if (this.anObjectArray35[arg0] == null) {
			this.method4351(arg0);
			return this.anObjectArray35[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(III)Z")
	private boolean method4373(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method4386()) {
			return false;
		} else if (arg1 >= 0 && arg0 >= 0 && this.aClass77_1.anIntArray138.length > arg1 && arg0 < this.aClass77_1.anIntArray138[arg1]) {
			return true;
		} else if (Static149.aBoolean186) {
			throw new IllegalArgumentException(arg1 + "," + arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qn", name = "e", descriptor = "(I)I")
	public int method4375() {
		if (!this.method4386()) {
			throw new IllegalStateException("");
		}
		return this.aClass77_1.anInt1854;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public boolean method4376(@OriginalArg(1) String arg0) {
		if (this.method4386()) {
			@Pc(17) String local17 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass77_1.aClass242_1.method5159(Static376.method4954(local17));
			return this.method4372(local26);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(III)[B")
	public byte[] method4377(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method4383(arg1, arg0, null);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z")
	public boolean method4378(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method4386()) {
			return false;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(15) String local15 = arg1.toLowerCase();
		@Pc(24) int local24 = this.aClass77_1.aClass242_1.method5159(Static376.method4954(local12));
		if (this.method4364(local24)) {
			@Pc(52) int local52 = this.aClass77_1.aClass242Array1[local24].method5159(Static376.method4954(local15));
			return this.method4367(local24, local52);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qn", name = "f", descriptor = "(I)V")
	public void method4379() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anObjectArrayArray1.length; local6++) {
				this.anObjectArrayArray1[local6] = null;
			}
		}
	}

	@OriginalMember(owner = "client!qn", name = "c", descriptor = "(Ljava/lang/String;I)I")
	public int method4380(@OriginalArg(0) String arg0) {
		if (this.method4386()) {
			@Pc(18) String local18 = arg0.toLowerCase();
			@Pc(27) int local27 = this.aClass77_1.aClass242_1.method5159(Static376.method4954(local18));
			return this.method4361(local27);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(ZI)Z")
	public boolean method4382(@OriginalArg(1) int arg0) {
		if (!this.method4386()) {
			return false;
		} else if (this.aClass77_1.anIntArray138.length == 1) {
			return this.method4367(0, arg0);
		} else if (!this.method4364(arg0)) {
			return false;
		} else if (this.aClass77_1.anIntArray138[arg0] == 1) {
			return this.method4367(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(II[II)[B")
	public byte[] method4383(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		if (!this.method4373(arg0, arg1)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg1] == null || this.anObjectArrayArray1[arg1][arg0] == null) {
			@Pc(30) boolean local30 = this.method4356(arg1, arg0, arg2);
			if (!local30) {
				this.method4351(arg1);
				local30 = this.method4356(arg1, arg0, arg2);
				if (!local30) {
					return null;
				}
			}
		}
		@Pc(59) byte[] local59 = Static59.method427(false, this.anObjectArrayArray1[arg1][arg0]);
		if (this.anInt5388 == 1) {
			this.anObjectArrayArray1[arg1][arg0] = null;
			if (this.aClass77_1.anIntArray138[arg1] == 1) {
				this.anObjectArrayArray1[arg1] = null;
			}
		} else if (this.anInt5388 == 2) {
			this.anObjectArrayArray1[arg1] = null;
		}
		return local59;
	}

	@OriginalMember(owner = "client!qn", name = "d", descriptor = "(Ljava/lang/String;I)I")
	public int method4384(@OriginalArg(0) String arg0) {
		if (this.method4386()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass77_1.aClass242_1.method5159(Static376.method4954(local12));
			return this.method4364(local21) ? local21 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(ZIZ)V")
	public void method4385(@OriginalArg(0) boolean arg0) {
		if (!this.method4386()) {
			return;
		}
		if (arg0) {
			this.aClass77_1.aClass242_1 = null;
			this.aClass77_1.anIntArray139 = null;
		}
		this.aClass77_1.anIntArrayArray21 = null;
		this.aClass77_1.aClass242Array1 = null;
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(B)Z")
	private boolean method4386() {
		if (this.aClass77_1 == null) {
			this.aClass77_1 = this.aClass124_1.method5834();
			if (this.aClass77_1 == null) {
				return false;
			}
			this.anObjectArray35 = new Object[this.aClass77_1.anInt1855];
			this.anObjectArrayArray1 = new Object[this.aClass77_1.anInt1855][];
		}
		return true;
	}
}
