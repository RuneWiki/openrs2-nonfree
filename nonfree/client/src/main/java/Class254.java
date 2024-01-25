import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class254 {

	@OriginalMember(owner = "client!pe", name = "j", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!pe", name = "J", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray5;

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "Lclient!tb;")
	private Class304 aClass304_2 = null;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "Z")
	private final boolean aBoolean653;

	@OriginalMember(owner = "client!pe", name = "y", descriptor = "Lclient!ss;")
	private final Class62 aClass62_1;

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
	public int anInt7731;

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Lclient!ss;ZI)V")
	public Class254(@OriginalArg(0) Class62 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.aBoolean653 = arg1;
		this.aClass62_1 = arg0;
		this.anInt7731 = arg2;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
	public void method6392() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(4) int local4 = 0; local4 < this.anObjectArrayArray1.length; local4++) {
				this.anObjectArrayArray1[local4] = null;
			}
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IB)V")
	private void method6393(@OriginalArg(0) int arg0) {
		if (this.aBoolean653) {
			this.anObjectArray5[arg0] = this.aClass62_1.method2078(arg0);
		} else {
			this.anObjectArray5[arg0] = Static499.method7539(this.aClass62_1.method2078(arg0));
		}
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)I")
	public int method6394() {
		if (!this.method6405()) {
			throw new IllegalStateException("");
		}
		return this.aClass304_2.anInt9147;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)Z")
	private boolean method6395(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method6405()) {
			return false;
		}
		@Pc(17) String local17 = arg1.toLowerCase();
		@Pc(20) String local20 = arg0.toLowerCase();
		@Pc(29) int local29 = this.aClass304_2.aClass181_1.method4717(Static512.method7665(local17));
		if (this.method6416(local29)) {
			@Pc(49) int local49 = this.aClass304_2.aClass181Array1[local29].method4717(Static512.method7665(local20));
			return this.method6398(local29, local49);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)I")
	public int method6396(@OriginalArg(0) int arg0) {
		return this.method6416(arg0) ? this.aClass304_2.anIntArray593[arg0] : 0;
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(II)Z")
	public boolean method6397(@OriginalArg(0) int arg0) {
		if (!this.method6416(arg0)) {
			return false;
		} else if (this.anObjectArray5[arg0] == null) {
			this.method6393(arg0);
			return this.anObjectArray5[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIB)Z")
	public boolean method6398(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method6419(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray1[arg0] != null && this.anObjectArrayArray1[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray5[arg0] == null) {
			this.method6393(arg0);
			return this.anObjectArray5[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "([IZII)[B")
	public byte[] method6399(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (!this.method6419(arg2, arg1)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg1] == null || this.anObjectArrayArray1[arg1][arg2] == null) {
			@Pc(30) boolean local30 = this.method6423(arg2, arg1, arg0);
			if (!local30) {
				this.method6393(arg1);
				local30 = this.method6423(arg2, arg1, arg0);
				if (!local30) {
					return null;
				}
			}
		}
		@Pc(57) byte[] local57 = Static135.method2792(false, this.anObjectArrayArray1[arg1][arg2]);
		if (this.anInt7731 == 1) {
			this.anObjectArrayArray1[arg1][arg2] = null;
			if (this.aClass304_2.anIntArray593[arg1] == 1) {
				this.anObjectArrayArray1[arg1] = null;
			}
		} else if (this.anInt7731 == 2) {
			this.anObjectArrayArray1[arg1] = null;
		}
		return local57;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public void method6400(@OriginalArg(0) String arg0) {
		if (this.method6405()) {
			@Pc(17) String local17 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass304_2.aClass181_1.method4717(Static512.method7665(local17));
			this.method6408(local26);
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(III)[B")
	public byte[] method6401(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.method6399(null, arg0, arg1);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(BLjava/lang/String;)I")
	public int method6402(@OriginalArg(1) String arg0) {
		if (this.method6405()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(31) int local31 = this.aClass304_2.aClass181_1.method4717(Static512.method7665(local12));
			return this.method6411(local31);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZI)I")
	public int method6403(@OriginalArg(1) int arg0) {
		if (this.method6405()) {
			@Pc(26) int local26 = this.aClass304_2.aClass181_1.method4717(arg0);
			return this.method6416(local26) ? local26 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Z)I")
	public int method6404() {
		if (!this.method6405()) {
			return 0;
		}
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anObjectArray5.length; local17++) {
			if (this.aClass304_2.anIntArray590[local17] > 0) {
				local15 += this.method6411(local17);
				local13 += 100;
			}
		}
		if (local13 == 0) {
			return 100;
		} else {
			return local15 * 100 / local13;
		}
	}

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "(I)Z")
	private boolean method6405() {
		if (this.aClass304_2 == null) {
			this.aClass304_2 = this.aClass62_1.method2080();
			if (this.aClass304_2 == null) {
				return false;
			}
			this.anObjectArrayArray1 = new Object[this.aClass304_2.anInt9149][];
			this.anObjectArray5 = new Object[this.aClass304_2.anInt9149];
		}
		return true;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)Z")
	public boolean method6406(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method6405()) {
			return false;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(23) String local23 = arg0.toLowerCase();
		@Pc(32) int local32 = this.aClass304_2.aClass181_1.method4717(Static512.method7665(local12));
		if (local32 < 0) {
			return false;
		} else {
			@Pc(47) int local47 = this.aClass304_2.aClass181Array1[local32].method4717(Static512.method7665(local23));
			return local47 >= 0;
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method6407(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = this.method6414("");
		return local8 == -1 ? this.method6395("", arg0) : this.method6395(arg0, "");
	}

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "(II)V")
	private void method6408(@OriginalArg(0) int arg0) {
		this.aClass62_1.method2073(arg0);
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method6409(@OriginalArg(0) String arg0) {
		if (this.method6405()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass304_2.aClass181_1.method4717(Static512.method7665(local12));
			return local21 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(ILjava/lang/String;Ljava/lang/String;)[B")
	public byte[] method6410(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method6405()) {
			return null;
		}
		@Pc(18) String local18 = arg1.toLowerCase();
		@Pc(21) String local21 = arg0.toLowerCase();
		@Pc(30) int local30 = this.aClass304_2.aClass181_1.method4717(Static512.method7665(local18));
		if (this.method6416(local30)) {
			@Pc(50) int local50 = this.aClass304_2.aClass181Array1[local30].method4717(Static512.method7665(local21));
			return this.method6401(local30, local50);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IZ)I")
	private int method6411(@OriginalArg(0) int arg0) {
		if (this.method6416(arg0)) {
			return this.anObjectArray5[arg0] == null ? this.aClass62_1.method2074(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "(I)Z")
	public boolean method6412() {
		if (!this.method6405()) {
			return false;
		}
		@Pc(13) boolean local13 = true;
		for (@Pc(15) int local15 = 0; local15 < this.aClass304_2.anIntArray592.length; local15++) {
			@Pc(23) int local23 = this.aClass304_2.anIntArray592[local15];
			if (this.anObjectArray5[local23] == null) {
				this.method6393(local23);
				if (this.anObjectArray5[local23] == null) {
					local13 = false;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public int method6414(@OriginalArg(0) String arg0) {
		if (this.method6405()) {
			@Pc(20) String local20 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass304_2.aClass181_1.method4717(Static512.method7665(local20));
			return this.method6416(local29) ? local29 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(ZI)V")
	public void method6415(@OriginalArg(1) int arg0) {
		if (this.method6416(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "(II)Z")
	private boolean method6416(@OriginalArg(1) int arg0) {
		if (!this.method6405()) {
			return false;
		} else if (arg0 >= 0 && arg0 < this.aClass304_2.anIntArray593.length && this.aClass304_2.anIntArray593[arg0] != 0) {
			return true;
		} else if (Static492.aBoolean760) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "(II)Z")
	public boolean method6417(@OriginalArg(0) int arg0) {
		if (!this.method6405()) {
			return false;
		} else if (this.aClass304_2.anIntArray593.length == 1) {
			return this.method6398(0, arg0);
		} else if (!this.method6416(arg0)) {
			return false;
		} else if (this.aClass304_2.anIntArray593[arg0] == 1) {
			return this.method6398(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZIZ)V")
	public void method6418(@OriginalArg(0) boolean arg0) {
		if (!this.method6405()) {
			return;
		}
		if (arg0) {
			this.aClass304_2.anIntArray595 = null;
			this.aClass304_2.aClass181_1 = null;
		}
		this.aClass304_2.anIntArrayArray76 = null;
		this.aClass304_2.aClass181Array1 = null;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IBI)Z")
	private boolean method6419(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method6405()) {
			return false;
		} else if (arg1 >= 0 && arg0 >= 0 && arg1 < this.aClass304_2.anIntArray593.length && this.aClass304_2.anIntArray593[arg1] > arg0) {
			return true;
		} else if (Static492.aBoolean760) {
			throw new IllegalArgumentException(arg1 + "," + arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(IB)[B")
	public byte[] method6420(@OriginalArg(0) int arg0) {
		if (!this.method6405()) {
			return null;
		} else if (this.aClass304_2.anIntArray593.length == 1) {
			return this.method6401(0, arg0);
		} else if (!this.method6416(arg0)) {
			return null;
		} else if (this.aClass304_2.anIntArray593[arg0] == 1) {
			return this.method6401(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "(I)I")
	public int method6421() {
		return this.method6405() ? this.aClass304_2.anIntArray593.length : -1;
	}

	@OriginalMember(owner = "client!pe", name = "f", descriptor = "(I)V")
	public void method6422() {
		if (this.anObjectArray5 != null) {
			for (@Pc(4) int local4 = 0; local4 < this.anObjectArray5.length; local4++) {
				this.anObjectArray5[local4] = null;
			}
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(III[I)Z")
	private boolean method6423(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		if (!this.method6416(arg1)) {
			return false;
		} else if (this.anObjectArray5[arg1] == null) {
			return false;
		} else {
			@Pc(23) int local23 = this.aClass304_2.anIntArray590[arg1];
			@Pc(29) int[] local29 = this.aClass304_2.anIntArrayArray75[arg1];
			if (this.anObjectArrayArray1[arg1] == null) {
				this.anObjectArrayArray1[arg1] = new Object[this.aClass304_2.anIntArray593[arg1]];
			}
			@Pc(49) Object[] local49 = this.anObjectArrayArray1[arg1];
			@Pc(51) boolean local51 = true;
			for (@Pc(53) int local53 = 0; local53 < local23; local53++) {
				@Pc(60) int local60;
				if (local29 == null) {
					local60 = local53;
				} else {
					local60 = local29[local53];
				}
				if (local49[local60] == null) {
					local51 = false;
					break;
				}
			}
			if (local51) {
				return true;
			}
			@Pc(113) byte[] local113;
			if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
				local113 = Static135.method2792(false, this.anObjectArray5[arg1]);
			} else {
				local113 = Static135.method2792(true, this.anObjectArray5[arg1]);
				@Pc(118) Class3_Sub7 local118 = new Class3_Sub7(local113);
				local118.method6508(arg2, local118.aByteArray86.length);
			}
			@Pc(139) byte[] local139;
			try {
				local139 = Static548.method8014(local113);
			} catch (@Pc(141) RuntimeException local141) {
				throw Static105.method2238(local141, "T3 - " + (arg2 != null) + "," + arg1 + "," + local113.length + "," + Static182.method3231(local113, local113.length) + "," + Static182.method3231(local113, local113.length - 2) + "," + this.aClass304_2.anIntArray591[arg1] + "," + this.aClass304_2.anInt9147);
			}
			if (this.aBoolean653) {
				this.anObjectArray5[arg1] = null;
			}
			@Pc(213) int local213;
			if (local23 <= 1) {
				if (local29 == null) {
					local213 = 0;
				} else {
					local213 = local29[0];
				}
				if (this.anInt7731 == 0) {
					local49[local213] = Static499.method7539(local139);
				} else {
					local49[local213] = local139;
				}
			} else {
				@Pc(251) int local251;
				@Pc(264) Class3_Sub7 local264;
				@Pc(272) int local272;
				@Pc(275) int local275;
				@Pc(277) int local277;
				@Pc(333) int local333;
				@Pc(335) int local335;
				@Pc(338) int local338;
				@Pc(340) int local340;
				if (this.anInt7731 == 2) {
					local213 = local139.length;
					local213--;
					local251 = local139[local213] & 0xFF;
					local213 -= local251 * local23 * 4;
					local264 = new Class3_Sub7(local139);
					@Pc(448) int local448 = 0;
					local272 = 0;
					local264.anInt7869 = local213;
					for (local275 = 0; local275 < local251; local275++) {
						local277 = 0;
						for (local333 = 0; local333 < local23; local333++) {
							local277 += local264.method6497();
							if (local29 == null) {
								local335 = local333;
							} else {
								local335 = local29[local333];
							}
							if (arg0 == local335) {
								local448 += local277;
								local272 = local335;
							}
						}
					}
					if (local448 == 0) {
						return true;
					}
					@Pc(507) byte[] local507 = new byte[local448];
					local448 = 0;
					local264.anInt7869 = local213;
					local333 = 0;
					for (local335 = 0; local335 < local251; local335++) {
						local338 = 0;
						for (local340 = 0; local340 < local23; local340++) {
							local338 += local264.method6497();
							@Pc(532) int local532;
							if (local29 == null) {
								local532 = local340;
							} else {
								local532 = local29[local340];
							}
							if (arg0 == local532) {
								Static602.method4666(local139, local333, local507, local448, local338);
								local448 += local338;
							}
							local333 += local338;
						}
					}
					local49[local272] = local507;
				} else {
					local213 = local139.length;
					local213--;
					local251 = local139[local213] & 0xFF;
					local213 -= local251 * 4 * local23;
					local264 = new Class3_Sub7(local139);
					local264.anInt7869 = local213;
					@Pc(270) int[] local270 = new int[local23];
					for (local272 = 0; local272 < local251; local272++) {
						local275 = 0;
						for (local277 = 0; local277 < local23; local277++) {
							local275 += local264.method6497();
							local270[local277] += local275;
						}
					}
					@Pc(306) byte[][] local306 = new byte[local23][];
					for (local277 = 0; local277 < local23; local277++) {
						local306[local277] = new byte[local270[local277]];
						local270[local277] = 0;
					}
					local264.anInt7869 = local213;
					local333 = 0;
					for (local335 = 0; local335 < local251; local335++) {
						local338 = 0;
						for (local340 = 0; local340 < local23; local340++) {
							local338 += local264.method6497();
							Static602.method4666(local139, local333, local306[local340], local270[local340], local338);
							local333 += local338;
							local270[local340] += local338;
						}
					}
					for (local338 = 0; local338 < local23; local338++) {
						if (local29 == null) {
							local340 = local338;
						} else {
							local340 = local29[local338];
						}
						if (this.anInt7731 == 0) {
							local49[local340] = Static499.method7539(local306[local338]);
						} else {
							local49[local340] = local306[local338];
						}
					}
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(BI)[I")
	public int[] method6424(@OriginalArg(1) int arg0) {
		if (!this.method6416(arg0)) {
			return null;
		}
		@Pc(16) int[] local16 = this.aClass304_2.anIntArrayArray75[arg0];
		if (local16 == null) {
			local16 = new int[this.aClass304_2.anIntArray590[arg0]];
			@Pc(27) int local27 = 0;
			while (local27 < local16.length) {
				local16[local27] = local27++;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method6425(@OriginalArg(0) String arg0) {
		if (this.method6405()) {
			@Pc(14) String local14 = arg0.toLowerCase();
			@Pc(23) int local23 = this.aClass304_2.aClass181_1.method4717(Static512.method7665(local14));
			return this.method6397(local23);
		} else {
			return false;
		}
	}
}
