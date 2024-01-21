import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!RPRWOACX")
public final class Class34 {

	@OriginalMember(owner = "client!RPRWOACX", name = "b", descriptor = "I")
	public static int anInt544;

	@OriginalMember(owner = "client!RPRWOACX", name = "c", descriptor = "[Lclient!RPRWOACX;")
	public static Class34[] aClass34Array1;

	@OriginalMember(owner = "client!RPRWOACX", name = "a", descriptor = "I")
	private static int anInt543 = -584;

	@OriginalMember(owner = "client!RPRWOACX", name = "e", descriptor = "[I")
	private int[] anIntArray154;

	@OriginalMember(owner = "client!RPRWOACX", name = "d", descriptor = "I")
	public int anInt545 = -1;

	@OriginalMember(owner = "client!RPRWOACX", name = "f", descriptor = "[I")
	private int[] anIntArray155 = new int[6];

	@OriginalMember(owner = "client!RPRWOACX", name = "g", descriptor = "[I")
	private int[] anIntArray156 = new int[6];

	@OriginalMember(owner = "client!RPRWOACX", name = "h", descriptor = "[I")
	private int[] anIntArray157 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!RPRWOACX", name = "i", descriptor = "Z")
	public boolean aBoolean141 = false;

	@OriginalMember(owner = "client!RPRWOACX", name = "a", descriptor = "(ILclient!INOFEYKQ;)V")
	public static void method348(@OriginalArg(1) Class14 arg0) {
		try {
			@Pc(10) Class3_Sub1_Sub3 local10 = new Class3_Sub1_Sub3((byte) -103, arg0.method202("idk.dat", (byte[]) null));
			anInt544 = local10.method276();
			if (aClass34Array1 == null) {
				aClass34Array1 = new Class34[anInt544];
			}
			for (@Pc(26) int local26 = 0; local26 < anInt544; local26++) {
				if (aClass34Array1[local26] == null) {
					aClass34Array1[local26] = new Class34();
				}
				aClass34Array1[local26].method349(local10);
			}
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("37572, " + -351 + ", " + arg0 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RPRWOACX", name = "<init>", descriptor = "()V")
	private Class34() {
	}

	@OriginalMember(owner = "client!RPRWOACX", name = "a", descriptor = "(ZLclient!NHEPCMLW;)V")
	private void method349(@OriginalArg(1) Class3_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(10) int local10 = arg0.method274();
				if (local10 == 0) {
					return;
				}
				if (local10 == 1) {
					this.anInt545 = arg0.method274();
				} else if (local10 == 2) {
					@Pc(28) int local28 = arg0.method274();
					this.anIntArray154 = new int[local28];
					for (@Pc(34) int local34 = 0; local34 < local28; local34++) {
						this.anIntArray154[local34] = arg0.method276();
					}
				} else if (local10 == 3) {
					this.aBoolean141 = true;
				} else if (local10 >= 40 && local10 < 50) {
					this.anIntArray155[local10 - 40] = arg0.method276();
				} else if (local10 >= 50 && local10 < 60) {
					this.anIntArray156[local10 - 50] = arg0.method276();
				} else if (local10 >= 60 && local10 < 70) {
					this.anIntArray157[local10 - 60] = arg0.method276();
				} else {
					System.out.println("Error unrecognised config code: " + local10);
				}
			}
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("10995, " + false + ", " + arg0 + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RPRWOACX", name = "a", descriptor = "(I)Z")
	public boolean method350() {
		try {
			if (this.anIntArray154 == null) {
				return true;
			}
			@Pc(8) boolean local8 = true;
			for (@Pc(16) int local16 = 0; local16 < this.anIntArray154.length; local16++) {
				if (!Class3_Sub1_Sub1_Sub1.method34(this.anIntArray154[local16])) {
					local8 = false;
				}
			}
			return local8;
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("62028, " + -793 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RPRWOACX", name = "b", descriptor = "(I)Lclient!CSGBDGDY;")
	public Class3_Sub1_Sub1_Sub1 method351(@OriginalArg(0) int arg0) {
		try {
			if (this.anIntArray154 == null) {
				return null;
			}
			@Pc(11) Class3_Sub1_Sub1_Sub1[] local11 = new Class3_Sub1_Sub1_Sub1[this.anIntArray154.length];
			@Pc(15) boolean local15 = false;
			for (@Pc(17) int local17 = 0; local17 < this.anIntArray154.length; local17++) {
				local11[local17] = Class3_Sub1_Sub1_Sub1.method33(this.anIntArray154[local17]);
			}
			@Pc(41) Class3_Sub1_Sub1_Sub1 local41;
			if (local11.length == 1) {
				local41 = local11[0];
			} else {
				local41 = new Class3_Sub1_Sub1_Sub1(local11.length, -39808, local11);
			}
			for (@Pc(53) int local53 = 0; local53 < 6 && this.anIntArray155[local53] != 0; local53++) {
				local41.method47(this.anIntArray155[local53], this.anIntArray156[local53]);
			}
			return local41;
		} catch (@Pc(77) RuntimeException local77) {
			signlink.reporterror("98354, " + arg0 + ", " + local77.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RPRWOACX", name = "c", descriptor = "(I)Z")
	public boolean method352() {
		try {
			@Pc(11) boolean local11 = true;
			for (@Pc(13) int local13 = 0; local13 < 5; local13++) {
				if (this.anIntArray157[local13] != -1 && !Class3_Sub1_Sub1_Sub1.method34(this.anIntArray157[local13])) {
					local11 = false;
				}
			}
			return local11;
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("76080, " + 3 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RPRWOACX", name = "a", descriptor = "(Z)Lclient!CSGBDGDY;")
	public Class3_Sub1_Sub1_Sub1 method353() {
		try {
			@Pc(4) Class3_Sub1_Sub1_Sub1[] local4 = new Class3_Sub1_Sub1_Sub1[5];
			@Pc(6) int local6 = 0;
			for (@Pc(8) int local8 = 0; local8 < 5; local8++) {
				if (this.anIntArray157[local8] != -1) {
					local4[local6++] = Class3_Sub1_Sub1_Sub1.method33(this.anIntArray157[local8]);
				}
			}
			@Pc(36) Class3_Sub1_Sub1_Sub1 local36 = new Class3_Sub1_Sub1_Sub1(local6, -39808, local4);
			for (@Pc(44) int local44 = 0; local44 < 6 && this.anIntArray155[local44] != 0; local44++) {
				local36.method47(this.anIntArray155[local44], this.anIntArray156[local44]);
			}
			return local36;
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("83968, " + false + ", " + local68.toString());
			throw new RuntimeException();
		}
	}
}
