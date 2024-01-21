import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!GLRCYUHA")
public final class Class14 {

	@OriginalMember(owner = "client!GLRCYUHA", name = "c", descriptor = "I")
	public static int anInt171;

	@OriginalMember(owner = "client!GLRCYUHA", name = "d", descriptor = "[Lclient!GLRCYUHA;")
	public static Class14[] aClass14Array1;

	@OriginalMember(owner = "client!GLRCYUHA", name = "f", descriptor = "[I")
	private int[] anIntArray39;

	@OriginalMember(owner = "client!GLRCYUHA", name = "a", descriptor = "I")
	private int anInt170 = -26531;

	@OriginalMember(owner = "client!GLRCYUHA", name = "b", descriptor = "Z")
	private boolean aBoolean75 = true;

	@OriginalMember(owner = "client!GLRCYUHA", name = "e", descriptor = "I")
	public int anInt172 = -1;

	@OriginalMember(owner = "client!GLRCYUHA", name = "g", descriptor = "[I")
	private int[] anIntArray40 = new int[6];

	@OriginalMember(owner = "client!GLRCYUHA", name = "h", descriptor = "[I")
	private int[] anIntArray41 = new int[6];

	@OriginalMember(owner = "client!GLRCYUHA", name = "i", descriptor = "[I")
	private int[] anIntArray42 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!GLRCYUHA", name = "j", descriptor = "Z")
	public boolean aBoolean76 = false;

	@OriginalMember(owner = "client!GLRCYUHA", name = "a", descriptor = "(Lclient!SMIVAFST;I)V")
	public static void method218(@OriginalArg(0) Class35 arg0) {
		try {
			@Pc(8) Class2_Sub1_Sub2 local8 = new Class2_Sub1_Sub2(arg0.method485("idk.dat", null), (byte) 3);
			anInt171 = local8.method96();
			if (aClass14Array1 == null) {
				aClass14Array1 = new Class14[anInt171];
			}
			for (@Pc(22) int local22 = 0; local22 < anInt171; local22++) {
				if (aClass14Array1[local22] == null) {
					aClass14Array1[local22] = new Class14();
				}
				aClass14Array1[local22].method219(local8);
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("53940, " + arg0 + ", " + -29636 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GLRCYUHA", name = "<init>", descriptor = "()V")
	private Class14() {
	}

	@OriginalMember(owner = "client!GLRCYUHA", name = "a", descriptor = "(ILclient!BSNPYLEV;)V")
	private void method219(@OriginalArg(1) Class2_Sub1_Sub2 arg0) {
		try {
			while (true) {
				@Pc(14) int local14 = arg0.method94();
				if (local14 == 0) {
					return;
				}
				if (local14 == 1) {
					this.anInt172 = arg0.method94();
				} else if (local14 == 2) {
					@Pc(32) int local32 = arg0.method94();
					this.anIntArray39 = new int[local32];
					for (@Pc(38) int local38 = 0; local38 < local32; local38++) {
						this.anIntArray39[local38] = arg0.method96();
					}
				} else if (local14 == 3) {
					this.aBoolean76 = true;
				} else if (local14 >= 40 && local14 < 50) {
					this.anIntArray40[local14 - 40] = arg0.method96();
				} else if (local14 >= 50 && local14 < 60) {
					this.anIntArray41[local14 - 50] = arg0.method96();
				} else if (local14 >= 60 && local14 < 70) {
					this.anIntArray42[local14 - 60] = arg0.method96();
				} else {
					System.out.println("Error unrecognised config code: " + local14);
				}
			}
		} catch (@Pc(119) RuntimeException local119) {
			signlink.reporterror("21816, " + 7 + ", " + arg0 + ", " + local119.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GLRCYUHA", name = "a", descriptor = "(I)Z")
	public boolean method220() {
		try {
			if (this.anIntArray39 == null) {
				return true;
			}
			@Pc(6) boolean local6 = true;
			for (@Pc(14) int local14 = 0; local14 < this.anIntArray39.length; local14++) {
				if (!Class2_Sub1_Sub3_Sub4.method432(this.anIntArray39[local14])) {
					local6 = false;
				}
			}
			return local6;
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("11243, " + 539 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GLRCYUHA", name = "a", descriptor = "(Z)Lclient!RMLAXPMV;")
	public Class2_Sub1_Sub3_Sub4 method221() {
		try {
			if (this.anIntArray39 == null) {
				return null;
			}
			@Pc(11) Class2_Sub1_Sub3_Sub4[] local11 = new Class2_Sub1_Sub3_Sub4[this.anIntArray39.length];
			for (@Pc(19) int local19 = 0; local19 < this.anIntArray39.length; local19++) {
				local11[local19] = Class2_Sub1_Sub3_Sub4.method431(this.anIntArray39[local19]);
			}
			@Pc(43) Class2_Sub1_Sub3_Sub4 local43;
			if (local11.length == 1) {
				local43 = local11[0];
			} else {
				local43 = new Class2_Sub1_Sub3_Sub4(local11.length, local11, 118);
			}
			for (@Pc(55) int local55 = 0; local55 < 6 && this.anIntArray40[local55] != 0; local55++) {
				local43.method445(this.anIntArray40[local55], this.anIntArray41[local55]);
			}
			return local43;
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("49409, " + true + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GLRCYUHA", name = "b", descriptor = "(I)Z")
	public boolean method222() {
		try {
			@Pc(1) boolean local1 = true;
			for (@Pc(14) int local14 = 0; local14 < 5; local14++) {
				if (this.anIntArray42[local14] != -1 && !Class2_Sub1_Sub3_Sub4.method432(this.anIntArray42[local14])) {
					local1 = false;
				}
			}
			return local1;
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("95132, " + -32142 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GLRCYUHA", name = "c", descriptor = "(I)Lclient!RMLAXPMV;")
	public Class2_Sub1_Sub3_Sub4 method223() {
		try {
			@Pc(4) Class2_Sub1_Sub3_Sub4[] local4 = new Class2_Sub1_Sub3_Sub4[5];
			if (this.anInt170 != -26531) {
				this.anInt170 = -210;
			}
			@Pc(13) int local13 = 0;
			for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
				if (this.anIntArray42[local15] != -1) {
					local4[local13++] = Class2_Sub1_Sub3_Sub4.method431(this.anIntArray42[local15]);
				}
			}
			@Pc(43) Class2_Sub1_Sub3_Sub4 local43 = new Class2_Sub1_Sub3_Sub4(local13, local4, 118);
			for (@Pc(45) int local45 = 0; local45 < 6 && this.anIntArray40[local45] != 0; local45++) {
				local43.method445(this.anIntArray40[local45], this.anIntArray41[local45]);
			}
			return local43;
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("7584, " + -26531 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}
}
