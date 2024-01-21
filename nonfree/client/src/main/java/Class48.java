import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!YUTTZGSS")
public final class Class48 {

	@OriginalMember(owner = "client!YUTTZGSS", name = "c", descriptor = "I")
	public static int anInt779;

	@OriginalMember(owner = "client!YUTTZGSS", name = "d", descriptor = "[Lclient!YUTTZGSS;")
	public static Class48[] aClass48Array1;

	@OriginalMember(owner = "client!YUTTZGSS", name = "f", descriptor = "[I")
	private int[] anIntArray200;

	@OriginalMember(owner = "client!YUTTZGSS", name = "a", descriptor = "B")
	private byte aByte54 = -72;

	@OriginalMember(owner = "client!YUTTZGSS", name = "b", descriptor = "B")
	private byte aByte55 = 62;

	@OriginalMember(owner = "client!YUTTZGSS", name = "e", descriptor = "I")
	public int anInt780 = -1;

	@OriginalMember(owner = "client!YUTTZGSS", name = "g", descriptor = "[I")
	private int[] anIntArray201 = new int[6];

	@OriginalMember(owner = "client!YUTTZGSS", name = "h", descriptor = "[I")
	private int[] anIntArray202 = new int[6];

	@OriginalMember(owner = "client!YUTTZGSS", name = "i", descriptor = "[I")
	private int[] anIntArray203 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!YUTTZGSS", name = "j", descriptor = "Z")
	public boolean aBoolean188 = false;

	@OriginalMember(owner = "client!YUTTZGSS", name = "a", descriptor = "(BLclient!XOJZVVDK;)V")
	public static void method536(@OriginalArg(1) Class43 arg0) {
		try {
			@Pc(10) Class6_Sub1_Sub4 local10 = new Class6_Sub1_Sub4(888, arg0.method518("idk.dat", (byte[]) null));
			anInt779 = local10.method241();
			if (aClass48Array1 == null) {
				aClass48Array1 = new Class48[anInt779];
			}
			for (@Pc(30) int local30 = 0; local30 < anInt779; local30++) {
				if (aClass48Array1[local30] == null) {
					aClass48Array1[local30] = new Class48();
				}
				aClass48Array1[local30].method537(local10);
			}
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("36242, " + -82 + ", " + arg0 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YUTTZGSS", name = "<init>", descriptor = "()V")
	private Class48() {
	}

	@OriginalMember(owner = "client!YUTTZGSS", name = "a", descriptor = "(Lclient!PQBRPYKE;Z)V")
	private void method537(@OriginalArg(0) Class6_Sub1_Sub4 arg0) {
		try {
			while (true) {
				@Pc(10) int local10 = arg0.method239();
				if (local10 == 0) {
					return;
				}
				if (local10 == 1) {
					this.anInt780 = arg0.method239();
				} else if (local10 == 2) {
					@Pc(28) int local28 = arg0.method239();
					this.anIntArray200 = new int[local28];
					for (@Pc(34) int local34 = 0; local34 < local28; local34++) {
						this.anIntArray200[local34] = arg0.method241();
					}
				} else if (local10 == 3) {
					this.aBoolean188 = true;
				} else if (local10 >= 40 && local10 < 50) {
					this.anIntArray201[local10 - 40] = arg0.method241();
				} else if (local10 >= 50 && local10 < 60) {
					this.anIntArray202[local10 - 50] = arg0.method241();
				} else if (local10 >= 60 && local10 < 70) {
					this.anIntArray203[local10 - 60] = arg0.method241();
				} else {
					System.out.println("Error unrecognised config code: " + local10);
				}
			}
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("49238, " + arg0 + ", " + false + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YUTTZGSS", name = "a", descriptor = "(I)Z")
	public boolean method538() {
		try {
			if (this.anIntArray200 == null) {
				return true;
			}
			@Pc(8) boolean local8 = true;
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray200.length; local20++) {
				if (!Class6_Sub1_Sub2_Sub2.method87(this.anIntArray200[local20])) {
					local8 = false;
				}
			}
			return local8;
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("33453, " + -33860 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YUTTZGSS", name = "b", descriptor = "(I)Lclient!FLXAIVEA;")
	public Class6_Sub1_Sub2_Sub2 method539(@OriginalArg(0) int arg0) {
		try {
			if (this.anIntArray200 == null) {
				return null;
			}
			@Pc(11) Class6_Sub1_Sub2_Sub2[] local11 = new Class6_Sub1_Sub2_Sub2[this.anIntArray200.length];
			if (arg0 < 6 || arg0 > 6) {
				throw new NullPointerException();
			}
			for (@Pc(23) int local23 = 0; local23 < this.anIntArray200.length; local23++) {
				local11[local23] = Class6_Sub1_Sub2_Sub2.method86(this.anIntArray200[local23]);
			}
			@Pc(47) Class6_Sub1_Sub2_Sub2 local47;
			if (local11.length == 1) {
				local47 = local11[0];
			} else {
				local47 = new Class6_Sub1_Sub2_Sub2(local11.length, local11, this.aByte54);
			}
			for (@Pc(60) int local60 = 0; local60 < 6 && this.anIntArray201[local60] != 0; local60++) {
				local47.method100(this.anIntArray201[local60], this.anIntArray202[local60]);
			}
			return local47;
		} catch (@Pc(84) RuntimeException local84) {
			signlink.reporterror("77451, " + arg0 + ", " + local84.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YUTTZGSS", name = "a", descriptor = "(B)Z")
	public boolean method540() {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(5) int local5 = 0; local5 < 5; local5++) {
				if (this.anIntArray203[local5] != -1 && !Class6_Sub1_Sub2_Sub2.method87(this.anIntArray203[local5])) {
					local3 = false;
				}
			}
			if (62 != this.aByte55) {
				for (@Pc(31) int local31 = 1; local31 > 0; local31++) {
				}
			}
			return local3;
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("88235, " + 62 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YUTTZGSS", name = "a", descriptor = "(Z)Lclient!FLXAIVEA;")
	public Class6_Sub1_Sub2_Sub2 method541() {
		try {
			@Pc(4) Class6_Sub1_Sub2_Sub2[] local4 = new Class6_Sub1_Sub2_Sub2[5];
			@Pc(6) int local6 = 0;
			for (@Pc(8) int local8 = 0; local8 < 5; local8++) {
				if (this.anIntArray203[local8] != -1) {
					local4[local6++] = Class6_Sub1_Sub2_Sub2.method86(this.anIntArray203[local8]);
				}
			}
			@Pc(43) Class6_Sub1_Sub2_Sub2 local43 = new Class6_Sub1_Sub2_Sub2(local6, local4, this.aByte54);
			for (@Pc(45) int local45 = 0; local45 < 6 && this.anIntArray201[local45] != 0; local45++) {
				local43.method100(this.anIntArray201[local45], this.anIntArray202[local45]);
			}
			return local43;
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("18820, " + true + ", " + local69.toString());
			throw new RuntimeException();
		}
	}
}
