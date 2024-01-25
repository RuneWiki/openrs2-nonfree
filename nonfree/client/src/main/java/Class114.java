import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gea")
public final class Class114 {

	@OriginalMember(owner = "client!gea", name = "n", descriptor = "[Lclient!q;")
	private Class34[] aClass34Array1;

	@OriginalMember(owner = "client!gea", name = "o", descriptor = "[I")
	public int[] anIntArray135;

	@OriginalMember(owner = "client!gea", name = "N", descriptor = "[I")
	public int[] anIntArray138;

	@OriginalMember(owner = "client!gea", name = "O", descriptor = "[[I")
	public int[][] anIntArrayArray10;

	@OriginalMember(owner = "client!gea", name = "j", descriptor = "I")
	public int anInt2991 = -1;

	@OriginalMember(owner = "client!gea", name = "i", descriptor = "I")
	public int anInt2990 = 0;

	@OriginalMember(owner = "client!gea", name = "f", descriptor = "Z")
	public boolean aBoolean222 = true;

	@OriginalMember(owner = "client!gea", name = "l", descriptor = "I")
	public int anInt2993 = -1;

	@OriginalMember(owner = "client!gea", name = "e", descriptor = "I")
	public int anInt2987 = -1;

	@OriginalMember(owner = "client!gea", name = "s", descriptor = "I")
	public int anInt2997 = -1;

	@OriginalMember(owner = "client!gea", name = "t", descriptor = "I")
	public int anInt2998 = -1;

	@OriginalMember(owner = "client!gea", name = "m", descriptor = "I")
	public int anInt2994 = -1;

	@OriginalMember(owner = "client!gea", name = "d", descriptor = "I")
	public int anInt2986 = -1;

	@OriginalMember(owner = "client!gea", name = "u", descriptor = "I")
	public int anInt2999 = 0;

	@OriginalMember(owner = "client!gea", name = "A", descriptor = "I")
	public int anInt3005 = -1;

	@OriginalMember(owner = "client!gea", name = "w", descriptor = "I")
	public int anInt3001 = 0;

	@OriginalMember(owner = "client!gea", name = "H", descriptor = "I")
	public int anInt3011 = -1;

	@OriginalMember(owner = "client!gea", name = "h", descriptor = "I")
	public int anInt2989 = -1;

	@OriginalMember(owner = "client!gea", name = "k", descriptor = "I")
	public int anInt2992 = -1;

	@OriginalMember(owner = "client!gea", name = "p", descriptor = "I")
	public int anInt2995 = 0;

	@OriginalMember(owner = "client!gea", name = "x", descriptor = "I")
	public int anInt3002 = -1;

	@OriginalMember(owner = "client!gea", name = "L", descriptor = "I")
	public int anInt3014 = 0;

	@OriginalMember(owner = "client!gea", name = "D", descriptor = "I")
	private int anInt3008 = 0;

	@OriginalMember(owner = "client!gea", name = "Q", descriptor = "I")
	public int anInt3017 = 0;

	@OriginalMember(owner = "client!gea", name = "P", descriptor = "I")
	public int anInt3016 = 0;

	@OriginalMember(owner = "client!gea", name = "G", descriptor = "I")
	public int anInt3010 = -1;

	@OriginalMember(owner = "client!gea", name = "I", descriptor = "I")
	public int anInt3012 = -1;

	@OriginalMember(owner = "client!gea", name = "T", descriptor = "I")
	public int anInt3020 = -1;

	@OriginalMember(owner = "client!gea", name = "S", descriptor = "I")
	public int anInt3019 = -1;

	@OriginalMember(owner = "client!gea", name = "W", descriptor = "I")
	public int anInt3023 = -1;

	@OriginalMember(owner = "client!gea", name = "b", descriptor = "I")
	public int anInt2984 = -1;

	@OriginalMember(owner = "client!gea", name = "M", descriptor = "I")
	public int anInt3015 = 0;

	@OriginalMember(owner = "client!gea", name = "K", descriptor = "I")
	public int anInt3013 = -1;

	@OriginalMember(owner = "client!gea", name = "g", descriptor = "I")
	public int anInt2988 = 0;

	@OriginalMember(owner = "client!gea", name = "R", descriptor = "I")
	public int anInt3018 = -1;

	@OriginalMember(owner = "client!gea", name = "C", descriptor = "I")
	public int anInt3007 = -1;

	@OriginalMember(owner = "client!gea", name = "V", descriptor = "I")
	public int anInt3022 = -1;

	@OriginalMember(owner = "client!gea", name = "r", descriptor = "[I")
	public int[] anIntArray136 = null;

	@OriginalMember(owner = "client!gea", name = "F", descriptor = "[I")
	public int[] anIntArray137 = null;

	@OriginalMember(owner = "client!gea", name = "Y", descriptor = "I")
	public int anInt3024 = -1;

	@OriginalMember(owner = "client!gea", name = "v", descriptor = "I")
	public int anInt3000 = 0;

	@OriginalMember(owner = "client!gea", name = "B", descriptor = "I")
	public int anInt3006 = -1;

	@OriginalMember(owner = "client!gea", name = "E", descriptor = "I")
	public int anInt3009 = -1;

	@OriginalMember(owner = "client!gea", name = "cb", descriptor = "I")
	public int anInt3027 = 0;

	@OriginalMember(owner = "client!gea", name = "y", descriptor = "I")
	public int anInt3003 = 0;

	@OriginalMember(owner = "client!gea", name = "z", descriptor = "I")
	private final int anInt3004 = -1;

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(Lclient!ac;II)V")
	private void method2599(@OriginalArg(0) Class1_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt2991 = arg0.method7945();
			this.anInt2998 = arg0.method7945();
			if (this.anInt2991 == 65535) {
				this.anInt2991 = -1;
			}
			if (this.anInt2998 == 65535) {
				this.anInt2998 = -1;
			}
		} else if (arg1 == 2) {
			this.anInt3006 = arg0.method7945();
		} else if (arg1 == 3) {
			this.anInt2989 = arg0.method7945();
		} else if (arg1 == 4) {
			this.anInt3018 = arg0.method7945();
		} else if (arg1 == 5) {
			this.anInt3002 = arg0.method7945();
		} else if (arg1 == 6) {
			this.anInt2994 = arg0.method7945();
		} else if (arg1 == 7) {
			this.anInt3009 = arg0.method7945();
		} else if (arg1 == 8) {
			this.anInt2993 = arg0.method7945();
		} else if (arg1 == 9) {
			this.anInt3023 = arg0.method7945();
		} else if (arg1 == 26) {
			this.anInt2990 = (short) (arg0.method7974() * 4);
			this.anInt3017 = (short) (arg0.method7974() * 4);
		} else {
			@Pc(87) int local87;
			@Pc(354) int local354;
			if (arg1 == 27) {
				if (this.anIntArrayArray10 == null) {
					this.anIntArrayArray10 = new int[12][];
				}
				local87 = arg0.method7974();
				this.anIntArrayArray10[local87] = new int[6];
				for (local354 = 0; local354 < 6; local354++) {
					this.anIntArrayArray10[local87][local354] = arg0.method7975();
				}
			} else if (arg1 == 28) {
				this.anIntArray135 = new int[12];
				for (local87 = 0; local87 < 12; local87++) {
					this.anIntArray135[local87] = arg0.method7974();
					if (this.anIntArray135[local87] == 255) {
						this.anIntArray135[local87] = -1;
					}
				}
			} else if (arg1 == 29) {
				this.anInt3003 = arg0.method7974();
			} else if (arg1 == 30) {
				this.anInt3027 = arg0.method7945();
			} else if (arg1 == 31) {
				this.anInt3001 = arg0.method7974();
			} else if (arg1 == 32) {
				this.anInt2999 = arg0.method7945();
			} else if (arg1 == 33) {
				this.anInt3000 = arg0.method7975();
			} else if (arg1 == 34) {
				this.anInt2988 = arg0.method7974();
			} else if (arg1 == 35) {
				this.anInt3014 = arg0.method7945();
			} else if (arg1 == 36) {
				this.anInt2995 = arg0.method7975();
			} else if (arg1 == 37) {
				this.anInt2986 = arg0.method7974();
			} else if (arg1 == 38) {
				this.anInt3020 = arg0.method7945();
			} else if (arg1 == 39) {
				this.anInt3005 = arg0.method7945();
			} else if (arg1 == 40) {
				this.anInt2992 = arg0.method7945();
			} else if (arg1 == 41) {
				this.anInt3013 = arg0.method7945();
			} else if (arg1 == 42) {
				this.anInt2984 = arg0.method7945();
			} else if (arg1 == 43) {
				this.anInt3011 = arg0.method7945();
			} else if (arg1 == 44) {
				this.anInt3019 = arg0.method7945();
			} else if (arg1 == 45) {
				this.anInt3007 = arg0.method7945();
			} else if (arg1 == 46) {
				this.anInt3022 = arg0.method7945();
			} else if (arg1 == 47) {
				this.anInt3012 = arg0.method7945();
			} else if (arg1 == 48) {
				this.anInt2987 = arg0.method7945();
			} else if (arg1 == 49) {
				this.anInt2997 = arg0.method7945();
			} else if (arg1 == 50) {
				this.anInt3010 = arg0.method7945();
			} else if (arg1 == 51) {
				this.anInt3024 = arg0.method7945();
			} else if (arg1 == 52) {
				local87 = arg0.method7974();
				this.anIntArray136 = new int[local87];
				this.anIntArray137 = new int[local87];
				for (local354 = 0; local354 < local87; local354++) {
					this.anIntArray136[local354] = arg0.method7945();
					@Pc(367) int local367 = arg0.method7974();
					this.anIntArray137[local354] = local367;
					this.anInt3008 += local367;
				}
			} else if (arg1 == 53) {
				this.aBoolean222 = false;
			} else if (arg1 == 54) {
				this.anInt3015 = arg0.method7974() << 6;
				this.anInt3016 = arg0.method7974() << 6;
			} else if (arg1 == 55) {
				if (this.anIntArray138 == null) {
					this.anIntArray138 = new int[12];
				}
				local87 = arg0.method7974();
				this.anIntArray138[local87] = arg0.method7945();
			}
		}
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(I)I")
	public int method2600() {
		if (this.anInt2991 != -1) {
			return this.anInt2991;
		} else if (this.anIntArray136 == null) {
			return -1;
		} else {
			@Pc(22) int local22 = (int) ((double) this.anInt3008 * Math.random());
			@Pc(24) int local24;
			for (local24 = 0; local22 >= this.anIntArray137[local24]; local24++) {
				local22 -= this.anIntArray137[local24];
			}
			return this.anIntArray136[local24];
		}
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(Lclient!r;I)[Lclient!q;")
	public Class34[] method2601(@OriginalArg(0) Class78 arg0) {
		if (this.aClass34Array1 != null && this.anInt3004 == arg0.anInt8385) {
			return this.aClass34Array1;
		} else if (this.anIntArrayArray10 == null) {
			return null;
		} else {
			this.aClass34Array1 = new Class34[this.anIntArrayArray10.length];
			for (@Pc(39) int local39 = 0; local39 < this.anIntArrayArray10.length; local39++) {
				@Pc(43) int local43 = 0;
				@Pc(45) int local45 = 0;
				@Pc(47) int local47 = 0;
				@Pc(49) int local49 = 0;
				@Pc(51) int local51 = 0;
				@Pc(53) int local53 = 0;
				if (this.anIntArrayArray10[local39] != null) {
					local47 = this.anIntArrayArray10[local39][2];
					local51 = this.anIntArrayArray10[local39][4] << 3;
					local43 = this.anIntArrayArray10[local39][0];
					local53 = this.anIntArrayArray10[local39][5] << 3;
					local45 = this.anIntArrayArray10[local39][1];
					local49 = this.anIntArrayArray10[local39][3] << 3;
				}
				if (local43 != 0 || local45 != 0 || local47 != 0 || local49 != 0 || local51 != 0 || local53 != 0) {
					@Pc(129) Class34 local129 = this.aClass34Array1[local39] = arg0.method6833();
					if (local53 != 0) {
						local129.AA(local53);
					}
					if (local49 != 0) {
						local129.w(local49);
					}
					if (local51 != 0) {
						local129.ZA(local51);
					}
					local129.U(local43, local45, local47);
				}
			}
			return this.aClass34Array1;
		}
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(ZLclient!ac;)V")
	public void method2602(@OriginalArg(1) Class1_Sub3 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method7974();
			if (local15 == 0) {
				return;
			}
			this.method2599(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(IZ)Z")
	public boolean method2603(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (arg0 == this.anInt2991) {
			return true;
		} else {
			if (this.anIntArray136 != null) {
				for (@Pc(34) int local34 = 0; local34 < this.anIntArray136.length; local34++) {
					if (this.anIntArray136[local34] == arg0) {
						return true;
					}
				}
			}
			return false;
		}
	}
}
