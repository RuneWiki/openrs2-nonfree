import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!UGUHDANY")
public final class Class37 {

	@OriginalMember(owner = "client!UGUHDANY", name = "d", descriptor = "I")
	public static int anInt632;

	@OriginalMember(owner = "client!UGUHDANY", name = "e", descriptor = "[Lclient!UGUHDANY;")
	public static Class37[] aClass37Array1;

	@OriginalMember(owner = "client!UGUHDANY", name = "g", descriptor = "[I")
	private int[] anIntArray179;

	@OriginalMember(owner = "client!UGUHDANY", name = "a", descriptor = "Z")
	private boolean aBoolean154 = true;

	@OriginalMember(owner = "client!UGUHDANY", name = "b", descriptor = "Z")
	private boolean aBoolean155 = true;

	@OriginalMember(owner = "client!UGUHDANY", name = "c", descriptor = "I")
	private int anInt631 = 3;

	@OriginalMember(owner = "client!UGUHDANY", name = "f", descriptor = "I")
	public int anInt633 = -1;

	@OriginalMember(owner = "client!UGUHDANY", name = "h", descriptor = "[I")
	private int[] anIntArray180 = new int[6];

	@OriginalMember(owner = "client!UGUHDANY", name = "i", descriptor = "[I")
	private int[] anIntArray181 = new int[6];

	@OriginalMember(owner = "client!UGUHDANY", name = "j", descriptor = "[I")
	private int[] anIntArray182 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!UGUHDANY", name = "k", descriptor = "Z")
	public boolean aBoolean156 = false;

	@OriginalMember(owner = "client!UGUHDANY", name = "a", descriptor = "(Lclient!WEMOPWVJ;I)V")
	public static void method440(@OriginalArg(0) Class43 arg0) {
		try {
			@Pc(8) Class1_Sub1_Sub4 local8 = new Class1_Sub1_Sub4(arg0.method515("idk.dat", null), true);
			anInt632 = local8.method407();
			if (aClass37Array1 == null) {
				aClass37Array1 = new Class37[anInt632];
			}
			for (@Pc(18) int local18 = 0; local18 < anInt632; local18++) {
				if (aClass37Array1[local18] == null) {
					aClass37Array1[local18] = new Class37();
				}
				aClass37Array1[local18].method441(local8);
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("44101, " + arg0 + ", " + 24414 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UGUHDANY", name = "<init>", descriptor = "()V")
	private Class37() {
	}

	@OriginalMember(owner = "client!UGUHDANY", name = "a", descriptor = "(ILclient!SVWJKJVI;)V")
	private void method441(@OriginalArg(1) Class1_Sub1_Sub4 arg0) {
		try {
			while (true) {
				@Pc(11) int local11 = arg0.method405();
				if (local11 == 0) {
					return;
				}
				if (local11 == 1) {
					this.anInt633 = arg0.method405();
				} else if (local11 == 2) {
					@Pc(29) int local29 = arg0.method405();
					this.anIntArray179 = new int[local29];
					for (@Pc(35) int local35 = 0; local35 < local29; local35++) {
						this.anIntArray179[local35] = arg0.method407();
					}
				} else if (local11 == 3) {
					this.aBoolean156 = true;
				} else if (local11 >= 40 && local11 < 50) {
					this.anIntArray180[local11 - 40] = arg0.method407();
				} else if (local11 >= 50 && local11 < 60) {
					this.anIntArray181[local11 - 50] = arg0.method407();
				} else if (local11 >= 60 && local11 < 70) {
					this.anIntArray182[local11 - 60] = arg0.method407();
				} else {
					System.out.println("Error unrecognised config code: " + local11);
				}
			}
		} catch (@Pc(116) RuntimeException local116) {
			signlink.reporterror("94071, " + -13096 + ", " + arg0 + ", " + local116.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UGUHDANY", name = "a", descriptor = "(I)Z")
	public boolean method442() {
		try {
			if (this.anIntArray179 == null) {
				return true;
			}
			@Pc(15) boolean local15 = true;
			for (@Pc(17) int local17 = 0; local17 < this.anIntArray179.length; local17++) {
				if (!Class1_Sub1_Sub1_Sub3.method148(this.anIntArray179[local17])) {
					local15 = false;
				}
			}
			return local15;
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("9091, " + -303 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UGUHDANY", name = "b", descriptor = "(I)Lclient!IYSWJGDE;")
	public Class1_Sub1_Sub1_Sub3 method443() {
		try {
			if (this.anIntArray179 == null) {
				return null;
			}
			@Pc(11) Class1_Sub1_Sub1_Sub3[] local11 = new Class1_Sub1_Sub1_Sub3[this.anIntArray179.length];
			for (@Pc(13) int local13 = 0; local13 < this.anIntArray179.length; local13++) {
				local11[local13] = Class1_Sub1_Sub1_Sub3.method147(this.anIntArray179[local13]);
			}
			@Pc(37) Class1_Sub1_Sub1_Sub3 local37;
			if (local11.length == 1) {
				local37 = local11[0];
			} else {
				local37 = new Class1_Sub1_Sub1_Sub3((byte) 9, local11.length, local11);
			}
			for (@Pc(49) int local49 = 0; local49 < 6 && this.anIntArray180[local49] != 0; local49++) {
				local37.method161(this.anIntArray180[local49], this.anIntArray181[local49]);
			}
			return local37;
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("17539, " + -413 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UGUHDANY", name = "c", descriptor = "(I)Z")
	public boolean method444() {
		try {
			@Pc(1) boolean local1 = true;
			for (@Pc(13) int local13 = 0; local13 < 5; local13++) {
				if (this.anIntArray182[local13] != -1 && !Class1_Sub1_Sub1_Sub3.method148(this.anIntArray182[local13])) {
					local1 = false;
				}
			}
			return local1;
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("13760, " + 3 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UGUHDANY", name = "d", descriptor = "(I)Lclient!IYSWJGDE;")
	public Class1_Sub1_Sub1_Sub3 method445() {
		try {
			@Pc(4) Class1_Sub1_Sub1_Sub3[] local4 = new Class1_Sub1_Sub1_Sub3[5];
			@Pc(6) int local6 = 0;
			for (@Pc(8) int local8 = 0; local8 < 5; local8++) {
				if (this.anIntArray182[local8] != -1) {
					local4[local6++] = Class1_Sub1_Sub1_Sub3.method147(this.anIntArray182[local8]);
				}
			}
			@Pc(36) Class1_Sub1_Sub1_Sub3 local36 = new Class1_Sub1_Sub1_Sub3((byte) 9, local6, local4);
			for (@Pc(48) int local48 = 0; local48 < 6 && this.anIntArray180[local48] != 0; local48++) {
				local36.method161(this.anIntArray180[local48], this.anIntArray181[local48]);
			}
			return local36;
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("53495, " + -619 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}
}
