import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pq")
public final class Class251 {

	@OriginalMember(owner = "client!pq", name = "g", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!pq", name = "E", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray36;

	@OriginalMember(owner = "client!pq", name = "C", descriptor = "Lclient!naa;")
	private Class207 aClass207_2 = null;

	@OriginalMember(owner = "client!pq", name = "w", descriptor = "Z")
	private final boolean aBoolean491;

	@OriginalMember(owner = "client!pq", name = "h", descriptor = "Lclient!fd;")
	private final Class98 aClass98_1;

	@OriginalMember(owner = "client!pq", name = "e", descriptor = "I")
	public int anInt6998;

	@OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(Lclient!fd;ZI)V")
	public Class251(@OriginalArg(0) Class98 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.aBoolean491 = arg1;
		this.aClass98_1 = arg0;
		this.anInt6998 = arg2;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(III)Z")
	private boolean method5829(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method5862()) {
			return false;
		} else if (arg1 >= 0 && arg0 >= 0 && this.aClass207_2.anIntArray526.length > arg1 && arg0 < this.aClass207_2.anIntArray526[arg1]) {
			return true;
		} else if (Static553.aBoolean649) {
			throw new IllegalArgumentException(arg1 + "," + arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public void method5830(@OriginalArg(0) String arg0) {
		if (this.method5862()) {
			@Pc(11) String local11 = arg0.toLowerCase();
			@Pc(28) int local28 = this.aClass207_2.aClass48_1.method743(Static415.method6085(local11));
			this.method5851(local28);
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Z)V")
	public void method5831() {
		if (this.anObjectArray36 != null) {
			for (@Pc(12) int local12 = 0; local12 < this.anObjectArray36.length; local12++) {
				this.anObjectArray36[local12] = null;
			}
		}
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(Z)I")
	public int method5832() {
		if (!this.method5862()) {
			throw new IllegalStateException("");
		}
		return this.aClass207_2.anInt5828;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(I)V")
	public void method5833() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(19) int local19 = 0; local19 < this.anObjectArrayArray1.length; local19++) {
				this.anObjectArrayArray1[local19] = null;
			}
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method5835(@OriginalArg(1) String arg0) {
		if (this.method5862()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass207_2.aClass48_1.method743(Static415.method6085(local12));
			return local21 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B")
	public byte[] method5836(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method5862()) {
			return null;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(15) String local15 = arg1.toLowerCase();
		@Pc(31) int local31 = this.aClass207_2.aClass48_1.method743(Static415.method6085(local12));
		if (this.method5838(local31)) {
			@Pc(49) int local49 = this.aClass207_2.aClass48Array1[local31].method743(Static415.method6085(local15));
			return this.method5860(local31, local49);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)Z")
	public boolean method5837(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method5862()) {
			return false;
		}
		@Pc(19) String local19 = arg1.toLowerCase();
		@Pc(22) String local22 = arg0.toLowerCase();
		@Pc(31) int local31 = this.aClass207_2.aClass48_1.method743(Static415.method6085(local19));
		if (local31 < 0) {
			return false;
		} else {
			@Pc(46) int local46 = this.aClass207_2.aClass48Array1[local31].method743(Static415.method6085(local22));
			return local46 >= 0;
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(II)Z")
	private boolean method5838(@OriginalArg(0) int arg0) {
		if (!this.method5862()) {
			return false;
		} else if (arg0 >= 0 && this.aClass207_2.anIntArray526.length > arg0 && this.aClass207_2.anIntArray526[arg0] != 0) {
			return true;
		} else if (Static553.aBoolean649) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z")
	public boolean method5839(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method5862()) {
			return false;
		}
		@Pc(20) String local20 = arg0.toLowerCase();
		@Pc(23) String local23 = arg1.toLowerCase();
		@Pc(34) int local34 = this.aClass207_2.aClass48_1.method743(Static415.method6085(local20));
		if (this.method5838(local34)) {
			@Pc(54) int local54 = this.aClass207_2.aClass48Array1[local34].method743(Static415.method6085(local23));
			return this.method5854(local34, local54);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IZ[II)Z")
	private boolean method5840(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		if (!this.method5838(arg0)) {
			return false;
		} else if (this.anObjectArray36[arg0] == null) {
			return false;
		} else {
			@Pc(25) int local25 = this.aClass207_2.anIntArray524[arg0];
			@Pc(31) int[] local31 = this.aClass207_2.anIntArrayArray69[arg0];
			if (this.anObjectArrayArray1[arg0] == null) {
				this.anObjectArrayArray1[arg0] = new Object[this.aClass207_2.anIntArray526[arg0]];
			}
			@Pc(60) Object[] local60 = this.anObjectArrayArray1[arg0];
			@Pc(62) boolean local62 = true;
			for (@Pc(64) int local64 = 0; local64 < local25; local64++) {
				@Pc(72) int local72;
				if (local31 == null) {
					local72 = local64;
				} else {
					local72 = local31[local64];
				}
				if (local60[local72] == null) {
					local62 = false;
					break;
				}
			}
			if (local62) {
				return true;
			}
			@Pc(125) byte[] local125;
			if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
				local125 = Static143.method6505(this.anObjectArray36[arg0], false);
			} else {
				local125 = Static143.method6505(this.anObjectArray36[arg0], true);
				@Pc(130) Class6_Sub14 local130 = new Class6_Sub14(local125);
				local130.method5993(local130.aByteArray88.length, arg1);
			}
			@Pc(152) byte[] local152;
			try {
				local152 = Static444.method6389(local125);
			} catch (@Pc(154) RuntimeException local154) {
				throw Static10.method2064(local154, "T3 - " + (arg1 != null) + "," + arg0 + "," + local125.length + "," + Static127.method3634(local125, local125.length) + "," + Static127.method3634(local125, local125.length - 2) + "," + this.aClass207_2.anIntArray525[arg0] + "," + this.aClass207_2.anInt5828);
			}
			if (this.aBoolean491) {
				this.anObjectArray36[arg0] = null;
			}
			@Pc(226) int local226;
			if (local25 <= 1) {
				if (local31 == null) {
					local226 = 0;
				} else {
					local226 = local31[0];
				}
				if (this.anInt6998 == 0) {
					local60[local226] = Static78.method1178(local152);
				} else {
					local60[local226] = local152;
				}
			} else {
				@Pc(262) int local262;
				@Pc(275) Class6_Sub14 local275;
				@Pc(283) int local283;
				@Pc(287) int local287;
				@Pc(289) int local289;
				@Pc(347) int local347;
				@Pc(349) int local349;
				@Pc(353) int local353;
				@Pc(355) int local355;
				if (this.anInt6998 == 2) {
					local226 = local152.length;
					local226--;
					local262 = local152[local226] & 0xFF;
					local226 -= local262 * local25 * 4;
					local275 = new Class6_Sub14(local152);
					@Pc(468) int local468 = 0;
					local283 = 0;
					local275.anInt7244 = local226;
					for (local287 = 0; local287 < local262; local287++) {
						local289 = 0;
						for (local347 = 0; local347 < local25; local347++) {
							local289 += local275.method6027();
							if (local31 == null) {
								local349 = local347;
							} else {
								local349 = local31[local347];
							}
							if (local349 == arg2) {
								local468 += local289;
								local283 = local349;
							}
						}
					}
					if (local468 == 0) {
						return true;
					}
					@Pc(534) byte[] local534 = new byte[local468];
					local275.anInt7244 = local226;
					local468 = 0;
					local347 = 0;
					for (local349 = 0; local349 < local262; local349++) {
						local353 = 0;
						for (local355 = 0; local355 < local25; local355++) {
							local353 += local275.method6027();
							@Pc(563) int local563;
							if (local31 == null) {
								local563 = local355;
							} else {
								local563 = local31[local355];
							}
							if (arg2 == local563) {
								Static585.method3080(local152, local347, local534, local468, local353);
								local468 += local353;
							}
							local347 += local353;
						}
					}
					local60[local283] = local534;
				} else {
					local226 = local152.length;
					local226--;
					local262 = local152[local226] & 0xFF;
					local226 -= local262 * 4 * local25;
					local275 = new Class6_Sub14(local152);
					@Pc(278) int[] local278 = new int[local25];
					local275.anInt7244 = local226;
					for (local283 = 0; local283 < local262; local283++) {
						local287 = 0;
						for (local289 = 0; local289 < local25; local289++) {
							local287 += local275.method6027();
							local278[local289] += local287;
						}
					}
					@Pc(319) byte[][] local319 = new byte[local25][];
					for (local289 = 0; local289 < local25; local289++) {
						local319[local289] = new byte[local278[local289]];
						local278[local289] = 0;
					}
					local275.anInt7244 = local226;
					local347 = 0;
					for (local349 = 0; local349 < local262; local349++) {
						local353 = 0;
						for (local355 = 0; local355 < local25; local355++) {
							local353 += local275.method6027();
							Static585.method3080(local152, local347, local319[local355], local278[local355], local353);
							local347 += local353;
							local278[local355] += local353;
						}
					}
					for (local353 = 0; local353 < local25; local353++) {
						if (local31 == null) {
							local355 = local353;
						} else {
							local355 = local31[local353];
						}
						if (this.anInt6998 == 0) {
							local60[local355] = Static78.method1178(local319[local353]);
						} else {
							local60[local355] = local319[local353];
						}
					}
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(II)Z")
	public boolean method5842(@OriginalArg(1) int arg0) {
		if (!this.method5838(arg0)) {
			return false;
		} else if (this.anObjectArray36[arg0] == null) {
			this.method5848(arg0);
			return this.anObjectArray36[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!pq", name = "c", descriptor = "(I)I")
	public int method5843() {
		if (!this.method5862()) {
			return 0;
		}
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anObjectArray36.length; local17++) {
			if (this.aClass207_2.anIntArray524[local17] > 0) {
				local15 += this.method5850(local17);
				local13 += 100;
			}
		}
		if (local13 == 0) {
			return 100;
		} else {
			return local15 * 100 / local13;
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IB)V")
	public void method5844(@OriginalArg(0) int arg0) {
		if (this.method5838(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(ZBZ)V")
	public void method5845(@OriginalArg(0) boolean arg0) {
		if (!this.method5862()) {
			return;
		}
		if (arg0) {
			this.aClass207_2.anIntArray521 = null;
			this.aClass207_2.aClass48_1 = null;
		}
		this.aClass207_2.anIntArrayArray68 = null;
		this.aClass207_2.aClass48Array1 = null;
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(ILjava/lang/String;)I")
	public int method5846(@OriginalArg(1) String arg0) {
		if (this.method5862()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(23) int local23 = this.aClass207_2.aClass48_1.method743(Static415.method6085(local12));
			return this.method5850(local23);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(B)I")
	public int method5847() {
		return this.method5862() ? this.aClass207_2.anIntArray526.length : -1;
	}

	@OriginalMember(owner = "client!pq", name = "c", descriptor = "(II)V")
	private void method5848(@OriginalArg(1) int arg0) {
		if (this.aBoolean491) {
			this.anObjectArray36[arg0] = this.aClass98_1.method4067(arg0);
		} else {
			this.anObjectArray36[arg0] = Static78.method1178(this.aClass98_1.method4067(arg0));
		}
	}

	@OriginalMember(owner = "client!pq", name = "d", descriptor = "(II)I")
	public int method5849(@OriginalArg(0) int arg0) {
		return this.method5838(arg0) ? this.aClass207_2.anIntArray526[arg0] : 0;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(BI)I")
	private int method5850(@OriginalArg(1) int arg0) {
		if (this.method5838(arg0)) {
			return this.anObjectArray36[arg0] == null ? this.aClass98_1.method4071(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pq", name = "e", descriptor = "(II)V")
	private void method5851(@OriginalArg(1) int arg0) {
		this.aClass98_1.method4073(arg0);
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIB[I)[B")
	public byte[] method5853(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		if (!this.method5829(arg0, arg1)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg1] == null || this.anObjectArrayArray1[arg1][arg0] == null) {
			@Pc(30) boolean local30 = this.method5840(arg1, arg2, arg0);
			if (!local30) {
				this.method5848(arg1);
				local30 = this.method5840(arg1, arg2, arg0);
				if (!local30) {
					return null;
				}
			}
		}
		@Pc(65) byte[] local65 = Static143.method6505(this.anObjectArrayArray1[arg1][arg0], false);
		if (this.anInt6998 == 1) {
			this.anObjectArrayArray1[arg1][arg0] = null;
			if (this.aClass207_2.anIntArray526[arg1] == 1) {
				this.anObjectArrayArray1[arg1] = null;
			}
		} else if (this.anInt6998 == 2) {
			this.anObjectArrayArray1[arg1] = null;
		}
		return local65;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(BII)Z")
	public boolean method5854(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method5829(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray1[arg0] != null && this.anObjectArrayArray1[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray36[arg0] == null) {
			this.method5848(arg0);
			return this.anObjectArray36[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(BI)[B")
	public byte[] method5855(@OriginalArg(1) int arg0) {
		if (!this.method5862()) {
			return null;
		} else if (this.aClass207_2.anIntArray526.length == 1) {
			return this.method5860(0, arg0);
		} else if (!this.method5838(arg0)) {
			return null;
		} else if (this.aClass207_2.anIntArray526[arg0] == 1) {
			return this.method5860(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pq", name = "c", descriptor = "(ILjava/lang/String;)Z")
	public boolean method5856(@OriginalArg(1) String arg0) {
		if (this.method5862()) {
			@Pc(19) String local19 = arg0.toLowerCase();
			@Pc(28) int local28 = this.aClass207_2.aClass48_1.method743(Static415.method6085(local19));
			return this.method5842(local28);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pq", name = "c", descriptor = "(BI)[I")
	public int[] method5857(@OriginalArg(1) int arg0) {
		if (!this.method5838(arg0)) {
			return null;
		}
		@Pc(26) int[] local26 = this.aClass207_2.anIntArrayArray69[arg0];
		if (local26 == null) {
			local26 = new int[this.aClass207_2.anIntArray524[arg0]];
			@Pc(37) int local37 = 0;
			while (local37 < local26.length) {
				local26[local37] = local37++;
			}
		}
		return local26;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(ZI)I")
	public int method5858(@OriginalArg(1) int arg0) {
		if (this.method5862()) {
			@Pc(21) int local21 = this.aClass207_2.aClass48_1.method743(arg0);
			return this.method5838(local21) ? local21 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!pq", name = "d", descriptor = "(BI)Z")
	public boolean method5859(@OriginalArg(1) int arg0) {
		if (!this.method5862()) {
			return false;
		} else if (this.aClass207_2.anIntArray526.length == 1) {
			return this.method5854(0, arg0);
		} else if (!this.method5838(arg0)) {
			return false;
		} else if (this.aClass207_2.anIntArray526[arg0] == 1) {
			return this.method5854(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(III)[B")
	public byte[] method5860(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method5853(arg1, arg0, null);
	}

	@OriginalMember(owner = "client!pq", name = "d", descriptor = "(I)Z")
	public boolean method5861() {
		if (!this.method5862()) {
			return false;
		}
		@Pc(13) boolean local13 = true;
		for (@Pc(15) int local15 = 0; local15 < this.aClass207_2.anIntArray522.length; local15++) {
			@Pc(23) int local23 = this.aClass207_2.anIntArray522[local15];
			if (this.anObjectArray36[local23] == null) {
				this.method5848(local23);
				if (this.anObjectArray36[local23] == null) {
					local13 = false;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(B)Z")
	private boolean method5862() {
		if (this.aClass207_2 == null) {
			this.aClass207_2 = this.aClass98_1.method4070();
			if (this.aClass207_2 == null) {
				return false;
			}
			this.anObjectArrayArray1 = new Object[this.aClass207_2.anInt5826][];
			this.anObjectArray36 = new Object[this.aClass207_2.anInt5826];
		}
		return true;
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(Ljava/lang/String;B)I")
	public int method5863(@OriginalArg(0) String arg0) {
		if (this.method5862()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass207_2.aClass48_1.method743(Static415.method6085(local12));
			return this.method5838(local21) ? local21 : -1;
		} else {
			return -1;
		}
	}
}
