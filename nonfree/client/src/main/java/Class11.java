import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!FDNUHSLC")
public final class Class11 {

	@OriginalMember(owner = "client!FDNUHSLC", name = "e", descriptor = "I")
	public static int anInt215;

	@OriginalMember(owner = "client!FDNUHSLC", name = "f", descriptor = "[Lclient!FDNUHSLC;")
	public static Class11[] aClass11Array1;

	@OriginalMember(owner = "client!FDNUHSLC", name = "c", descriptor = "I")
	private int anInt213;

	@OriginalMember(owner = "client!FDNUHSLC", name = "h", descriptor = "[I")
	private int[] anIntArray55;

	@OriginalMember(owner = "client!FDNUHSLC", name = "a", descriptor = "Z")
	private boolean aBoolean46 = false;

	@OriginalMember(owner = "client!FDNUHSLC", name = "b", descriptor = "B")
	private byte aByte7 = -26;

	@OriginalMember(owner = "client!FDNUHSLC", name = "d", descriptor = "I")
	private int anInt214 = 616;

	@OriginalMember(owner = "client!FDNUHSLC", name = "g", descriptor = "I")
	public int anInt216 = -1;

	@OriginalMember(owner = "client!FDNUHSLC", name = "i", descriptor = "[I")
	private int[] anIntArray56 = new int[6];

	@OriginalMember(owner = "client!FDNUHSLC", name = "j", descriptor = "[I")
	private int[] anIntArray57 = new int[6];

	@OriginalMember(owner = "client!FDNUHSLC", name = "k", descriptor = "[I")
	private int[] anIntArray58 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!FDNUHSLC", name = "l", descriptor = "Z")
	public boolean aBoolean47 = false;

	@OriginalMember(owner = "client!FDNUHSLC", name = "a", descriptor = "(Lclient!LKPVZAQN;I)V")
	public static void method106(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(12) Class3_Sub3_Sub4 local12 = new Class3_Sub3_Sub4((byte) -115, arg0.method207("idk.dat", null));
			anInt215 = local12.method470();
			if (aClass11Array1 == null) {
				aClass11Array1 = new Class11[anInt215];
			}
			for (@Pc(22) int local22 = 0; local22 < anInt215; local22++) {
				if (aClass11Array1[local22] == null) {
					aClass11Array1[local22] = new Class11();
				}
				aClass11Array1[local22].method107(local12, 767);
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("16062, " + arg0 + ", " + arg1 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FDNUHSLC", name = "<init>", descriptor = "()V")
	private Class11() {
	}

	@OriginalMember(owner = "client!FDNUHSLC", name = "a", descriptor = "(Lclient!WBEWPIXO;I)V")
	private void method107(@OriginalArg(0) Class3_Sub3_Sub4 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(5) boolean local5 = false;
			while (true) {
				while (true) {
					@Pc(8) int local8 = arg0.method468();
					if (local8 == 0) {
						return;
					}
					if (local8 == 1) {
						this.anInt216 = arg0.method468();
					} else if (local8 == 2) {
						@Pc(26) int local26 = arg0.method468();
						this.anIntArray55 = new int[local26];
						for (@Pc(32) int local32 = 0; local32 < local26; local32++) {
							this.anIntArray55[local32] = arg0.method470();
						}
					} else if (local8 == 3) {
						this.aBoolean47 = true;
					} else if (local8 >= 40 && local8 < 50) {
						this.anIntArray56[local8 - 40] = arg0.method470();
					} else if (local8 >= 50 && local8 < 60) {
						this.anIntArray57[local8 - 50] = arg0.method470();
					} else if (local8 >= 60 && local8 < 70) {
						this.anIntArray58[local8 - 60] = arg0.method470();
					} else {
						System.out.println("Error unrecognised config code: " + local8);
					}
				}
			}
		} catch (@Pc(113) RuntimeException local113) {
			signlink.reporterror("544, " + arg0 + ", " + arg1 + ", " + local113.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FDNUHSLC", name = "a", descriptor = "(I)Z")
	public boolean method108(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != 3982) {
				this.anInt214 = -111;
			}
			if (this.anIntArray55 == null) {
				return true;
			}
			@Pc(12) boolean local12 = true;
			for (@Pc(14) int local14 = 0; local14 < this.anIntArray55.length; local14++) {
				if (!Class3_Sub3_Sub2_Sub3.method81(this.anIntArray55[local14])) {
					local12 = false;
				}
			}
			return local12;
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("41289, " + arg0 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FDNUHSLC", name = "a", descriptor = "(B)Lclient!FCIDIKVY;")
	public Class3_Sub3_Sub2_Sub3 method109() {
		try {
			if (this.aByte7 != -26) {
				this.aBoolean46 = !this.aBoolean46;
			}
			if (this.anIntArray55 == null) {
				return null;
			}
			@Pc(23) Class3_Sub3_Sub2_Sub3[] local23 = new Class3_Sub3_Sub2_Sub3[this.anIntArray55.length];
			for (@Pc(25) int local25 = 0; local25 < this.anIntArray55.length; local25++) {
				local23[local25] = Class3_Sub3_Sub2_Sub3.method80(this.anIntArray55[local25]);
			}
			@Pc(49) Class3_Sub3_Sub2_Sub3 local49;
			if (local23.length == 1) {
				local49 = local23[0];
			} else {
				local49 = new Class3_Sub3_Sub2_Sub3(local23.length, -23, local23);
			}
			for (@Pc(61) int local61 = 0; local61 < 6 && this.anIntArray56[local61] != 0; local61++) {
				local49.method94(this.anIntArray56[local61], this.anIntArray57[local61]);
			}
			return local49;
		} catch (@Pc(85) RuntimeException local85) {
			signlink.reporterror("47571, " + -26 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FDNUHSLC", name = "b", descriptor = "(I)Z")
	public boolean method110() {
		try {
			@Pc(1) boolean local1 = true;
			for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
				if (this.anIntArray58[local3] != -1 && !Class3_Sub3_Sub2_Sub3.method81(this.anIntArray58[local3])) {
					local1 = false;
				}
			}
			return local1;
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("36124, " + -452 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FDNUHSLC", name = "c", descriptor = "(I)Lclient!FCIDIKVY;")
	public Class3_Sub3_Sub2_Sub3 method111() {
		try {
			@Pc(4) Class3_Sub3_Sub2_Sub3[] local4 = new Class3_Sub3_Sub2_Sub3[5];
			@Pc(6) int local6 = 0;
			for (@Pc(8) int local8 = 0; local8 < 5; local8++) {
				if (this.anIntArray58[local8] != -1) {
					local4[local6++] = Class3_Sub3_Sub2_Sub3.method80(this.anIntArray58[local8]);
				}
			}
			@Pc(36) Class3_Sub3_Sub2_Sub3 local36 = new Class3_Sub3_Sub2_Sub3(local6, -23, local4);
			for (@Pc(38) int local38 = 0; local38 < 6 && this.anIntArray56[local38] != 0; local38++) {
				local36.method94(this.anIntArray56[local38], this.anIntArray57[local38]);
			}
			return local36;
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("56578, " + 3 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}
}
