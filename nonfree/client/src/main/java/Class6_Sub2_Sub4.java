import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!d")
public final class Class6_Sub2_Sub4 extends Class6_Sub2 {

	@OriginalMember(owner = "client!d", name = "nb", descriptor = "[I")
	public int[] anIntArray48;

	@OriginalMember(owner = "client!d", name = "ob", descriptor = "I")
	public int anInt858;

	@OriginalMember(owner = "client!d", name = "qb", descriptor = "[I")
	private int[] anIntArray49;

	@OriginalMember(owner = "client!d", name = "wb", descriptor = "[I")
	private int[] anIntArray50;

	@OriginalMember(owner = "client!d", name = "Bb", descriptor = "[I")
	private int[] anIntArray51;

	@OriginalMember(owner = "client!d", name = "Xb", descriptor = "[I")
	private int[] anIntArray52;

	@OriginalMember(owner = "client!d", name = "cb", descriptor = "I")
	private int anInt853 = 128;

	@OriginalMember(owner = "client!d", name = "gb", descriptor = "Z")
	public boolean aBoolean37 = true;

	@OriginalMember(owner = "client!d", name = "db", descriptor = "I")
	private int anInt854 = 0;

	@OriginalMember(owner = "client!d", name = "tb", descriptor = "I")
	public int anInt861 = -1;

	@OriginalMember(owner = "client!d", name = "Ab", descriptor = "I")
	private int anInt864 = -1;

	@OriginalMember(owner = "client!d", name = "fb", descriptor = "Lclient!rc;")
	public Class55 aClass55_279 = Static111.aClass55_1329;

	@OriginalMember(owner = "client!d", name = "mb", descriptor = "I")
	public int anInt857 = 1;

	@OriginalMember(owner = "client!d", name = "xb", descriptor = "I")
	public int anInt863 = -1;

	@OriginalMember(owner = "client!d", name = "vb", descriptor = "I")
	public int anInt862 = -1;

	@OriginalMember(owner = "client!d", name = "Db", descriptor = "I")
	public int anInt866 = 32;

	@OriginalMember(owner = "client!d", name = "Mb", descriptor = "I")
	public int anInt873 = -1;

	@OriginalMember(owner = "client!d", name = "Nb", descriptor = "I")
	private int anInt874 = -1;

	@OriginalMember(owner = "client!d", name = "Qb", descriptor = "I")
	private int anInt875 = 128;

	@OriginalMember(owner = "client!d", name = "Kb", descriptor = "I")
	public int anInt871 = -1;

	@OriginalMember(owner = "client!d", name = "jb", descriptor = "Z")
	public boolean aBoolean38 = false;

	@OriginalMember(owner = "client!d", name = "Vb", descriptor = "I")
	private int anInt879 = 0;

	@OriginalMember(owner = "client!d", name = "Tb", descriptor = "I")
	public int anInt878 = -1;

	@OriginalMember(owner = "client!d", name = "Hb", descriptor = "I")
	public int anInt869 = -1;

	@OriginalMember(owner = "client!d", name = "Ub", descriptor = "Z")
	public boolean aBoolean39 = true;

	@OriginalMember(owner = "client!d", name = "eb", descriptor = "I")
	public int anInt855 = -1;

	@OriginalMember(owner = "client!d", name = "Yb", descriptor = "I")
	public int anInt880 = -1;

	@OriginalMember(owner = "client!d", name = "Zb", descriptor = "[Lclient!rc;")
	public final Class55[] aClass55Array4 = new Class55[5];

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!b;Z)V")
	public void method535(@OriginalArg(0) Class6_Sub1 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1495();
			if (local5 == 0) {
				return;
			}
			this.method536(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IILclient!b;)V")
	private void method536(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub1 arg1) {
		@Pc(10) int local10;
		@Pc(16) int local16;
		if (arg0 == 1) {
			local10 = arg1.method1495();
			this.anIntArray49 = new int[local10];
			for (local16 = 0; local16 < local10; local16++) {
				this.anIntArray49[local16] = arg1.method1500();
			}
		} else if (arg0 == 2) {
			this.aClass55_279 = arg1.method1461();
		} else if (arg0 == 12) {
			this.anInt857 = arg1.method1495();
		} else if (arg0 == 13) {
			this.anInt855 = arg1.method1500();
		} else if (arg0 == 14) {
			this.anInt878 = arg1.method1500();
		} else if (arg0 == 15) {
			this.anInt862 = arg1.method1500();
		} else if (arg0 == 16) {
			this.anInt863 = arg1.method1500();
		} else if (arg0 == 17) {
			this.anInt878 = arg1.method1500();
			this.anInt873 = arg1.method1500();
			this.anInt861 = arg1.method1500();
			this.anInt880 = arg1.method1500();
		} else if (arg0 >= 30 && arg0 < 35) {
			this.aClass55Array4[arg0 - 30] = arg1.method1461();
			if (this.aClass55Array4[arg0 - 30].method1642(Static7.aClass55_124)) {
				this.aClass55Array4[arg0 - 30] = null;
			}
		} else if (arg0 == 40) {
			local10 = arg1.method1495();
			this.anIntArray51 = new int[local10];
			this.anIntArray50 = new int[local10];
			for (local16 = 0; local16 < local10; local16++) {
				this.anIntArray51[local16] = arg1.method1500();
				this.anIntArray50[local16] = arg1.method1500();
			}
		} else if (arg0 == 60) {
			local10 = arg1.method1495();
			this.anIntArray52 = new int[local10];
			for (local16 = 0; local16 < local10; local16++) {
				this.anIntArray52[local16] = arg1.method1500();
			}
		} else if (arg0 == 93) {
			this.aBoolean37 = false;
		} else if (arg0 == 95) {
			this.anInt869 = arg1.method1500();
		} else if (arg0 == 97) {
			this.anInt875 = arg1.method1500();
		} else if (arg0 == 98) {
			this.anInt853 = arg1.method1500();
		} else if (arg0 == 99) {
			this.aBoolean38 = true;
		} else if (arg0 == 100) {
			this.anInt879 = arg1.method1484();
		} else if (arg0 == 101) {
			this.anInt854 = arg1.method1484() * 5;
		} else if (arg0 == 102) {
			this.anInt871 = arg1.method1500();
		} else if (arg0 == 103) {
			this.anInt866 = arg1.method1500();
		} else if (arg0 == 106) {
			this.anInt864 = arg1.method1500();
			if (this.anInt864 == 65535) {
				this.anInt864 = -1;
			}
			this.anInt874 = arg1.method1500();
			if (this.anInt874 == 65535) {
				this.anInt874 = -1;
			}
			local10 = arg1.method1495();
			this.anIntArray48 = new int[local10 + 1];
			for (local16 = 0; local16 <= local10; local16++) {
				this.anIntArray48[local16] = arg1.method1500();
				if (this.anIntArray48[local16] == 65535) {
					this.anIntArray48[local16] = -1;
				}
			}
		} else if (arg0 == 107) {
			this.aBoolean39 = false;
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ILclient!tb;IILclient!tb;)Lclient!jb;")
	public Class6_Sub2_Sub3_Sub3 method537(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub2_Sub13 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class6_Sub2_Sub13 arg3) {
		if (this.anIntArray48 != null) {
			@Pc(17) Class6_Sub2_Sub4 local17 = this.method542();
			return local17 == null ? null : local17.method537(arg0, arg1, arg2, arg3);
		}
		@Pc(37) Class6_Sub2_Sub3_Sub3 local37 = (Class6_Sub2_Sub3_Sub3) Static41.aClass36_17.method1154((long) this.anInt858);
		if (local37 == null) {
			@Pc(41) boolean local41 = false;
			for (@Pc(43) int local43 = 0; local43 < this.anIntArray49.length; local43++) {
				if (!Static13.aClass40_13.method1223(this.anIntArray49[local43], 0)) {
					local41 = true;
				}
			}
			if (local41) {
				return null;
			}
			@Pc(71) Class6_Sub2_Sub3_Sub3[] local71 = new Class6_Sub2_Sub3_Sub3[this.anIntArray49.length];
			for (@Pc(73) int local73 = 0; local73 < this.anIntArray49.length; local73++) {
				local71[local73] = Static42.method974(Static13.aClass40_13, this.anIntArray49[local73]);
			}
			if (local71.length == 1) {
				local37 = local71[0];
			} else {
				local37 = new Class6_Sub2_Sub3_Sub3(local71, local71.length);
			}
			if (this.anIntArray51 != null) {
				for (@Pc(119) int local119 = 0; local119 < this.anIntArray51.length; local119++) {
					local37.method961(this.anIntArray51[local119], this.anIntArray50[local119]);
				}
			}
			local37.method978();
			local37.method965(this.anInt879 + 64, this.anInt854 + 850, -30, -50, -30, true);
			Static41.aClass36_17.method1161((long) this.anInt858, local37);
		}
		@Pc(173) Class6_Sub2_Sub3_Sub3 local173;
		if (arg3 != null && arg1 != null) {
			local173 = arg3.method1862(arg2, arg1, local37, arg0);
		} else if (arg3 != null) {
			local173 = arg3.method1857(arg2, local37);
		} else if (arg1 == null) {
			local173 = local37.method966(true);
		} else {
			local173 = arg1.method1857(arg0, local37);
		}
		if (this.anInt875 != 128 || this.anInt853 != 128) {
			local173.method957(this.anInt875, this.anInt853, this.anInt875);
		}
		return local173;
	}

	@OriginalMember(owner = "client!d", name = "d", descriptor = "(B)V")
	public void method538() {
	}

	@OriginalMember(owner = "client!d", name = "f", descriptor = "(I)Z")
	public boolean method541() {
		if (this.anIntArray48 == null) {
			return true;
		}
		@Pc(10) int local10 = -1;
		if (this.anInt864 != -1) {
			local10 = Static79.method1560(this.anInt864);
		} else if (this.anInt874 != -1) {
			local10 = Static11.anIntArray44[this.anInt874];
		}
		return local10 >= 0 && this.anIntArray48.length > local10 && this.anIntArray48[local10] != -1;
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(Z)Lclient!d;")
	public Class6_Sub2_Sub4 method542() {
		@Pc(10) int local10 = -1;
		if (this.anInt864 != -1) {
			local10 = Static79.method1560(this.anInt864);
		} else if (this.anInt874 != -1) {
			local10 = Static11.anIntArray44[this.anInt874];
		}
		return local10 < 0 || local10 >= this.anIntArray48.length || this.anIntArray48[local10] == -1 ? null : Static8.method326(this.anIntArray48[local10]);
	}

	@OriginalMember(owner = "client!d", name = "g", descriptor = "(I)Lclient!jb;")
	public Class6_Sub2_Sub3_Sub3 method543() {
		if (this.anIntArray48 != null) {
			@Pc(12) Class6_Sub2_Sub4 local12 = this.method542();
			return local12 == null ? null : local12.method543();
		} else if (this.anIntArray52 == null) {
			return null;
		} else {
			@Pc(27) boolean local27 = false;
			for (@Pc(34) int local34 = 0; local34 < this.anIntArray52.length; local34++) {
				if (!Static13.aClass40_13.method1223(this.anIntArray52[local34], 0)) {
					local27 = true;
				}
			}
			if (local27) {
				return null;
			}
			@Pc(62) Class6_Sub2_Sub3_Sub3[] local62 = new Class6_Sub2_Sub3_Sub3[this.anIntArray52.length];
			for (@Pc(64) int local64 = 0; local64 < this.anIntArray52.length; local64++) {
				local62[local64] = Static42.method974(Static13.aClass40_13, this.anIntArray52[local64]);
			}
			@Pc(99) Class6_Sub2_Sub3_Sub3 local99;
			if (local62.length == 1) {
				local99 = local62[0];
			} else {
				local99 = new Class6_Sub2_Sub3_Sub3(local62, local62.length);
			}
			if (this.anIntArray51 != null) {
				for (@Pc(110) int local110 = 0; local110 < this.anIntArray51.length; local110++) {
					local99.method961(this.anIntArray51[local110], this.anIntArray50[local110]);
				}
			}
			return local99;
		}
	}
}
