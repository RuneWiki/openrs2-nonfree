import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class2_Sub1_Sub8 extends Class2_Sub1 {

	@OriginalMember(owner = "client!jb", name = "S", descriptor = "[I")
	private int[] anIntArray188;

	@OriginalMember(owner = "client!jb", name = "T", descriptor = "[I")
	private int[] anIntArray189;

	@OriginalMember(owner = "client!jb", name = "U", descriptor = "[I")
	public int[] anIntArray190;

	@OriginalMember(owner = "client!jb", name = "bb", descriptor = "[I")
	private int[] anIntArray191;

	@OriginalMember(owner = "client!jb", name = "mb", descriptor = "[I")
	private int[] anIntArray192;

	@OriginalMember(owner = "client!jb", name = "Eb", descriptor = "I")
	public int anInt1389;

	@OriginalMember(owner = "client!jb", name = "X", descriptor = "I")
	public int anInt1369 = 1;

	@OriginalMember(owner = "client!jb", name = "kb", descriptor = "I")
	private int anInt1378 = 0;

	@OriginalMember(owner = "client!jb", name = "pb", descriptor = "I")
	public int anInt1379 = -1;

	@OriginalMember(owner = "client!jb", name = "tb", descriptor = "Z")
	public boolean aBoolean73 = true;

	@OriginalMember(owner = "client!jb", name = "eb", descriptor = "I")
	public int anInt1374 = 32;

	@OriginalMember(owner = "client!jb", name = "ib", descriptor = "I")
	public int anInt1377 = -1;

	@OriginalMember(owner = "client!jb", name = "rb", descriptor = "I")
	public int anInt1380 = -1;

	@OriginalMember(owner = "client!jb", name = "ob", descriptor = "Z")
	public boolean aBoolean72 = true;

	@OriginalMember(owner = "client!jb", name = "hb", descriptor = "I")
	public int anInt1376 = -1;

	@OriginalMember(owner = "client!jb", name = "Bb", descriptor = "I")
	public int anInt1387 = -1;

	@OriginalMember(owner = "client!jb", name = "sb", descriptor = "I")
	private int anInt1381 = -1;

	@OriginalMember(owner = "client!jb", name = "vb", descriptor = "Z")
	public boolean aBoolean74 = false;

	@OriginalMember(owner = "client!jb", name = "yb", descriptor = "I")
	public int anInt1384 = -1;

	@OriginalMember(owner = "client!jb", name = "qb", descriptor = "Lclient!ke;")
	public Class39 aClass39_619 = Static82.aClass39_1003;

	@OriginalMember(owner = "client!jb", name = "Hb", descriptor = "I")
	public int anInt1392 = -1;

	@OriginalMember(owner = "client!jb", name = "Ib", descriptor = "I")
	private int anInt1393 = 0;

	@OriginalMember(owner = "client!jb", name = "cb", descriptor = "I")
	public int anInt1372 = -1;

	@OriginalMember(owner = "client!jb", name = "zb", descriptor = "I")
	public int anInt1385 = -1;

	@OriginalMember(owner = "client!jb", name = "Lb", descriptor = "I")
	private int anInt1396 = 128;

	@OriginalMember(owner = "client!jb", name = "lb", descriptor = "[Lclient!ke;")
	public final Class39[] aClass39Array11 = new Class39[5];

	@OriginalMember(owner = "client!jb", name = "Jb", descriptor = "I")
	private int anInt1394 = 128;

	@OriginalMember(owner = "client!jb", name = "Kb", descriptor = "I")
	private int anInt1395 = -1;

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "(I)Lclient!jb;")
	public Class2_Sub1_Sub8 method941() {
		@Pc(5) int local5 = -1;
		if (this.anInt1381 != -1) {
			local5 = Static92.method1723(this.anInt1381);
		} else if (this.anInt1395 != -1) {
			local5 = Static28.anIntArray89[this.anInt1395];
		}
		return local5 < 0 || this.anIntArray190.length <= local5 || this.anIntArray190[local5] == -1 ? null : Static63.method1331(this.anIntArray190[local5]);
	}

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "(I)Lclient!ga;")
	public Class2_Sub1_Sub2_Sub2 method942() {
		if (this.anIntArray190 != null) {
			@Pc(12) Class2_Sub1_Sub8 local12 = this.method941();
			return local12 == null ? null : local12.method942();
		} else if (this.anIntArray189 == null) {
			return null;
		} else {
			@Pc(27) boolean local27 = false;
			for (@Pc(29) int local29 = 0; local29 < this.anIntArray189.length; local29++) {
				if (!Static12.aClass36_11.method1768(0, this.anIntArray189[local29])) {
					local27 = true;
				}
			}
			if (local27) {
				return null;
			}
			@Pc(57) Class2_Sub1_Sub2_Sub2[] local57 = new Class2_Sub1_Sub2_Sub2[this.anIntArray189.length];
			for (@Pc(59) int local59 = 0; local59 < this.anIntArray189.length; local59++) {
				local57[local59] = Static32.method722(Static12.aClass36_11, this.anIntArray189[local59]);
			}
			@Pc(88) Class2_Sub1_Sub2_Sub2 local88;
			if (local57.length == 1) {
				local88 = local57[0];
			} else {
				local88 = new Class2_Sub1_Sub2_Sub2(local57, local57.length);
			}
			if (this.anIntArray191 != null) {
				for (@Pc(99) int local99 = 0; local99 < this.anIntArray191.length; local99++) {
					local88.method716(this.anIntArray191[local99], this.anIntArray188[local99]);
				}
			}
			return local88;
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!g;B)V")
	public void method943(@OriginalArg(0) Class2_Sub5 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method1281();
			if (local13 == 0) {
				return;
			}
			this.method944(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILclient!g;I)V")
	private void method944(@OriginalArg(1) Class2_Sub5 arg0, @OriginalArg(2) int arg1) {
		@Pc(160) int local160;
		@Pc(168) int local168;
		if (arg1 == 1) {
			local160 = arg0.method1281();
			this.anIntArray192 = new int[local160];
			for (local168 = 0; local168 < local160; local168++) {
				this.anIntArray192[local168] = arg0.method1273();
			}
		} else if (arg1 == 2) {
			this.aClass39_619 = arg0.method1250();
		} else if (arg1 == 12) {
			this.anInt1369 = arg0.method1281();
		} else if (arg1 == 13) {
			this.anInt1384 = arg0.method1273();
		} else if (arg1 == 14) {
			this.anInt1392 = arg0.method1273();
		} else if (arg1 == 15) {
			this.anInt1379 = arg0.method1273();
		} else if (arg1 == 16) {
			this.anInt1377 = arg0.method1273();
		} else if (arg1 == 17) {
			this.anInt1392 = arg0.method1273();
			this.anInt1376 = arg0.method1273();
			this.anInt1385 = arg0.method1273();
			this.anInt1380 = arg0.method1273();
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass39Array11[arg1 - 30] = arg0.method1250();
			if (this.aClass39Array11[arg1 - 30].method1106(Static109.aClass39_1332)) {
				this.aClass39Array11[arg1 - 30] = null;
			}
		} else if (arg1 == 40) {
			local160 = arg0.method1281();
			this.anIntArray188 = new int[local160];
			this.anIntArray191 = new int[local160];
			for (local168 = 0; local168 < local160; local168++) {
				this.anIntArray191[local168] = arg0.method1273();
				this.anIntArray188[local168] = arg0.method1273();
			}
		} else if (arg1 == 60) {
			local160 = arg0.method1281();
			this.anIntArray189 = new int[local160];
			for (local168 = 0; local168 < local160; local168++) {
				this.anIntArray189[local168] = arg0.method1273();
			}
		} else if (arg1 == 93) {
			this.aBoolean73 = false;
		} else if (arg1 == 95) {
			this.anInt1387 = arg0.method1273();
		} else if (arg1 == 97) {
			this.anInt1394 = arg0.method1273();
		} else if (arg1 == 98) {
			this.anInt1396 = arg0.method1273();
		} else if (arg1 == 99) {
			this.aBoolean74 = true;
		} else if (arg1 == 100) {
			this.anInt1393 = arg0.method1254();
		} else if (arg1 == 101) {
			this.anInt1378 = arg0.method1254() * 5;
		} else if (arg1 == 102) {
			this.anInt1372 = arg0.method1273();
		} else if (arg1 == 103) {
			this.anInt1374 = arg0.method1273();
		} else if (arg1 == 106) {
			this.anInt1381 = arg0.method1273();
			if (this.anInt1381 == 65535) {
				this.anInt1381 = -1;
			}
			this.anInt1395 = arg0.method1273();
			if (this.anInt1395 == 65535) {
				this.anInt1395 = -1;
			}
			local160 = arg0.method1281();
			this.anIntArray190 = new int[local160 + 1];
			for (local168 = 0; local168 <= local160; local168++) {
				this.anIntArray190[local168] = arg0.method1273();
				if (this.anIntArray190[local168] == 65535) {
					this.anIntArray190[local168] = -1;
				}
			}
		} else if (arg1 == 107) {
			this.aBoolean72 = false;
		}
	}

	@OriginalMember(owner = "client!jb", name = "g", descriptor = "(I)Z")
	public boolean method946() {
		if (this.anIntArray190 == null) {
			return true;
		}
		@Pc(10) int local10 = -1;
		if (this.anInt1381 != -1) {
			local10 = Static92.method1723(this.anInt1381);
		} else if (this.anInt1395 != -1) {
			local10 = Static28.anIntArray89[this.anInt1395];
		}
		return local10 >= 0 && local10 < this.anIntArray190.length && this.anIntArray190[local10] != -1;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILclient!aa;IILclient!aa;)Lclient!ga;")
	public Class2_Sub1_Sub2_Sub2 method948(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub1_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class2_Sub1_Sub1 arg3) {
		if (this.anIntArray190 != null) {
			@Pc(12) Class2_Sub1_Sub8 local12 = this.method941();
			return local12 == null ? null : local12.method948(arg0, arg1, arg2, arg3);
		}
		@Pc(37) Class2_Sub1_Sub2_Sub2 local37 = (Class2_Sub1_Sub2_Sub2) Static50.aClass54_13.method1634((long) this.anInt1389);
		if (local37 == null) {
			@Pc(41) boolean local41 = false;
			for (@Pc(43) int local43 = 0; local43 < this.anIntArray192.length; local43++) {
				if (!Static12.aClass36_11.method1768(0, this.anIntArray192[local43])) {
					local41 = true;
				}
			}
			if (local41) {
				return null;
			}
			@Pc(71) Class2_Sub1_Sub2_Sub2[] local71 = new Class2_Sub1_Sub2_Sub2[this.anIntArray192.length];
			for (@Pc(73) int local73 = 0; local73 < this.anIntArray192.length; local73++) {
				local71[local73] = Static32.method722(Static12.aClass36_11, this.anIntArray192[local73]);
			}
			if (local71.length == 1) {
				local37 = local71[0];
			} else {
				local37 = new Class2_Sub1_Sub2_Sub2(local71, local71.length);
			}
			if (this.anIntArray191 != null) {
				for (@Pc(117) int local117 = 0; local117 < this.anIntArray191.length; local117++) {
					local37.method716(this.anIntArray191[local117], this.anIntArray188[local117]);
				}
			}
			local37.method693();
			local37.method712(this.anInt1393 + 64, 850 - -this.anInt1378, -30, -50, -30, true);
			Static50.aClass54_13.method1637((long) this.anInt1389, local37);
		}
		@Pc(171) Class2_Sub1_Sub2_Sub2 local171;
		if (arg1 != null && arg3 != null) {
			local171 = arg1.method54(local37, arg0, arg2, arg3);
		} else if (arg1 != null) {
			local171 = arg1.method58(arg2, local37);
		} else if (arg3 == null) {
			local171 = local37.method707(true);
		} else {
			local171 = arg3.method58(arg0, local37);
		}
		if (this.anInt1394 != 128 || this.anInt1396 != 128) {
			local171.method714(this.anInt1394, this.anInt1396, this.anInt1394);
		}
		return local171;
	}

	@OriginalMember(owner = "client!jb", name = "i", descriptor = "(I)V")
	public void method949() {
	}
}
