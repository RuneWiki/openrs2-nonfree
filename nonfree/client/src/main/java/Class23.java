import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!lc")
public final class Class23 {

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
	public static int anInt753;

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "[Lclient!lc;")
	public static Class23[] aClass23Array1;

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "[I")
	private int[] anIntArray221;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "Z")
	private boolean aBoolean203 = true;

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "Z")
	private boolean aBoolean204 = true;

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
	public int anInt754 = -1;

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "[I")
	private int[] anIntArray222 = new int[6];

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "[I")
	private int[] anIntArray223 = new int[6];

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "[I")
	private int[] anIntArray224 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!lc", name = "j", descriptor = "Z")
	public boolean aBoolean205 = false;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZLclient!yb;)V")
	public static void method477(@OriginalArg(1) Class48 arg0) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3(16, arg0.method678("idk.dat", null));
			anInt753 = local8.method500();
			if (aClass23Array1 == null) {
				aClass23Array1 = new Class23[anInt753];
			}
			for (@Pc(21) int local21 = 0; local21 < anInt753; local21++) {
				if (aClass23Array1[local21] == null) {
					aClass23Array1[local21] = new Class23();
				}
				aClass23Array1[local21].method478(891, local8);
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("30252, " + true + ", " + arg0 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V")
	private Class23() {
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILclient!mb;)V")
	private void method478(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			@Pc(5) boolean local5 = false;
			while (true) {
				while (true) {
					@Pc(8) int local8 = arg1.method498();
					if (local8 == 0) {
						return;
					}
					if (local8 == 1) {
						this.anInt754 = arg1.method498();
					} else if (local8 == 2) {
						@Pc(26) int local26 = arg1.method498();
						this.anIntArray221 = new int[local26];
						for (@Pc(32) int local32 = 0; local32 < local26; local32++) {
							this.anIntArray221[local32] = arg1.method500();
						}
					} else if (local8 == 3) {
						this.aBoolean205 = true;
					} else if (local8 >= 40 && local8 < 50) {
						this.anIntArray222[local8 - 40] = arg1.method500();
					} else if (local8 >= 50 && local8 < 60) {
						this.anIntArray223[local8 - 50] = arg1.method500();
					} else if (local8 >= 60 && local8 < 70) {
						this.anIntArray224[local8 - 60] = arg1.method500();
					} else {
						System.out.println("Error unrecognised config code: " + local8);
					}
				}
			}
		} catch (@Pc(113) RuntimeException local113) {
			signlink.reporterror("70540, " + arg0 + ", " + arg1 + ", " + local113.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)Z")
	public boolean method479(@OriginalArg(0) byte arg0) {
		try {
			if (this.anIntArray221 == null) {
				return true;
			}
			@Pc(8) boolean local8 = true;
			@Pc(13) boolean local13 = false;
			for (@Pc(21) int local21 = 0; local21 < this.anIntArray221.length; local21++) {
				if (!Class1_Sub1_Sub1_Sub5.method289(this.anIntArray221[local21])) {
					local8 = false;
				}
			}
			return local8;
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("27005, " + arg0 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)Lclient!fb;")
	public Class1_Sub1_Sub1_Sub5 method480() {
		try {
			if (this.anIntArray221 == null) {
				return null;
			}
			@Pc(21) Class1_Sub1_Sub1_Sub5[] local21 = new Class1_Sub1_Sub1_Sub5[this.anIntArray221.length];
			for (@Pc(23) int local23 = 0; local23 < this.anIntArray221.length; local23++) {
				local21[local23] = Class1_Sub1_Sub1_Sub5.method288(this.aBoolean203, this.anIntArray221[local23]);
			}
			@Pc(49) Class1_Sub1_Sub1_Sub5 local49;
			if (local21.length == 1) {
				local49 = local21[0];
			} else {
				local49 = new Class1_Sub1_Sub1_Sub5(local21, local21.length, (byte) 2);
			}
			for (@Pc(61) int local61 = 0; local61 < 6 && this.anIntArray222[local61] != 0; local61++) {
				local49.method302(this.anIntArray222[local61], this.anIntArray223[local61]);
			}
			return local49;
		} catch (@Pc(85) RuntimeException local85) {
			signlink.reporterror("44422, " + -84 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)Z")
	public boolean method481() {
		try {
			@Pc(1) boolean local1 = true;
			for (@Pc(13) int local13 = 0; local13 < 5; local13++) {
				if (this.anIntArray224[local13] != -1 && !Class1_Sub1_Sub1_Sub5.method289(this.anIntArray224[local13])) {
					local1 = false;
				}
			}
			return local1;
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("1528, " + 0 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "(I)Lclient!fb;")
	public Class1_Sub1_Sub1_Sub5 method482() {
		try {
			@Pc(4) Class1_Sub1_Sub1_Sub5[] local4 = new Class1_Sub1_Sub1_Sub5[5];
			@Pc(6) int local6 = 0;
			for (@Pc(18) int local18 = 0; local18 < 5; local18++) {
				if (this.anIntArray224[local18] != -1) {
					local4[local6++] = Class1_Sub1_Sub1_Sub5.method288(this.aBoolean203, this.anIntArray224[local18]);
				}
			}
			@Pc(48) Class1_Sub1_Sub1_Sub5 local48 = new Class1_Sub1_Sub1_Sub5(local4, local6, (byte) 2);
			for (@Pc(50) int local50 = 0; local50 < 6 && this.anIntArray222[local50] != 0; local50++) {
				local48.method302(this.anIntArray222[local50], this.anIntArray223[local50]);
			}
			return local48;
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("61164, " + 8 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}
}
