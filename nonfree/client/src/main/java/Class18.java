import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!IEVJZYTE")
public final class Class18 {

	@OriginalMember(owner = "client!IEVJZYTE", name = "c", descriptor = "I")
	public static int anInt302;

	@OriginalMember(owner = "client!IEVJZYTE", name = "d", descriptor = "[Lclient!IEVJZYTE;")
	public static Class18[] aClass18Array1;

	@OriginalMember(owner = "client!IEVJZYTE", name = "a", descriptor = "I")
	private static int anInt301 = 974;

	@OriginalMember(owner = "client!IEVJZYTE", name = "f", descriptor = "[I")
	private int[] anIntArray50;

	@OriginalMember(owner = "client!IEVJZYTE", name = "e", descriptor = "I")
	public int anInt303 = -1;

	@OriginalMember(owner = "client!IEVJZYTE", name = "g", descriptor = "[I")
	private int[] anIntArray51 = new int[6];

	@OriginalMember(owner = "client!IEVJZYTE", name = "h", descriptor = "[I")
	private int[] anIntArray52 = new int[6];

	@OriginalMember(owner = "client!IEVJZYTE", name = "i", descriptor = "[I")
	private int[] anIntArray53 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!IEVJZYTE", name = "j", descriptor = "Z")
	public boolean aBoolean87 = false;

	static {
		aBoolean86 = true;
	}

	@OriginalMember(owner = "client!IEVJZYTE", name = "a", descriptor = "(ILclient!QDHHNYHL;)V")
	public static void method207(@OriginalArg(1) Class32 arg0) {
		try {
			@Pc(8) Class4_Sub1_Sub4 local8 = new Class4_Sub1_Sub4(5, arg0.method426("idk.dat", null));
			anInt302 = local8.method357();
			if (aClass18Array1 == null) {
				aClass18Array1 = new Class18[anInt302];
			}
			for (@Pc(18) int local18 = 0; local18 < anInt302; local18++) {
				if (aClass18Array1[local18] == null) {
					aClass18Array1[local18] = new Class18();
				}
				aClass18Array1[local18].method208(local8, anInt301);
			}
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("81232, " + 0 + ", " + arg0 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IEVJZYTE", name = "<init>", descriptor = "()V")
	private Class18() {
	}

	@OriginalMember(owner = "client!IEVJZYTE", name = "a", descriptor = "(Lclient!PGNBHFUF;I)V")
	private void method208(@OriginalArg(0) Class4_Sub1_Sub4 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(5) int local5;
			if (arg1 <= 0) {
				for (local5 = 1; local5 > 0; local5++) {
				}
			}
			while (true) {
				while (true) {
					local5 = arg0.method355();
					if (local5 == 0) {
						return;
					}
					if (local5 == 1) {
						this.anInt303 = arg0.method355();
					} else if (local5 == 2) {
						@Pc(31) int local31 = arg0.method355();
						this.anIntArray50 = new int[local31];
						for (@Pc(37) int local37 = 0; local37 < local31; local37++) {
							this.anIntArray50[local37] = arg0.method357();
						}
					} else if (local5 == 3) {
						this.aBoolean87 = true;
					} else if (local5 >= 40 && local5 < 50) {
						this.anIntArray51[local5 - 40] = arg0.method357();
					} else if (local5 >= 50 && local5 < 60) {
						this.anIntArray52[local5 - 50] = arg0.method357();
					} else if (local5 >= 60 && local5 < 70) {
						this.anIntArray53[local5 - 60] = arg0.method357();
					} else {
						System.out.println("Error unrecognised config code: " + local5);
					}
				}
			}
		} catch (@Pc(118) RuntimeException local118) {
			signlink.reporterror("16482, " + arg0 + ", " + arg1 + ", " + local118.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IEVJZYTE", name = "a", descriptor = "(I)Z")
	public boolean method209() {
		try {
			if (this.anIntArray50 == null) {
				return true;
			}
			@Pc(8) boolean local8 = true;
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray50.length; local20++) {
				if (!Class4_Sub1_Sub1_Sub4.method400(this.anIntArray50[local20])) {
					local8 = false;
				}
			}
			return local8;
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("65651, " + -139 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IEVJZYTE", name = "a", descriptor = "(Z)Lclient!POJFANDE;")
	public Class4_Sub1_Sub1_Sub4 method210() {
		try {
			if (this.anIntArray50 == null) {
				return null;
			}
			@Pc(17) Class4_Sub1_Sub1_Sub4[] local17 = new Class4_Sub1_Sub1_Sub4[this.anIntArray50.length];
			for (@Pc(19) int local19 = 0; local19 < this.anIntArray50.length; local19++) {
				local17[local19] = Class4_Sub1_Sub1_Sub4.method399(this.anIntArray50[local19]);
			}
			@Pc(43) Class4_Sub1_Sub1_Sub4 local43;
			if (local17.length == 1) {
				local43 = local17[0];
			} else {
				local43 = new Class4_Sub1_Sub1_Sub4(local17.length, -347, local17);
			}
			for (@Pc(55) int local55 = 0; local55 < 6 && this.anIntArray51[local55] != 0; local55++) {
				local43.method413(this.anIntArray51[local55], this.anIntArray52[local55]);
			}
			return local43;
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("19197, " + false + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IEVJZYTE", name = "b", descriptor = "(I)Z")
	public boolean method211() {
		try {
			@Pc(1) boolean local1 = true;
			for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
				if (this.anIntArray53[local3] != -1 && !Class4_Sub1_Sub1_Sub4.method400(this.anIntArray53[local3])) {
					local1 = false;
				}
			}
			return local1;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("60731, " + -44232 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IEVJZYTE", name = "a", descriptor = "(B)Lclient!POJFANDE;")
	public Class4_Sub1_Sub1_Sub4 method212() {
		try {
			@Pc(4) Class4_Sub1_Sub1_Sub4[] local4 = new Class4_Sub1_Sub1_Sub4[5];
			@Pc(6) int local6 = 0;
			for (@Pc(8) int local8 = 0; local8 < 5; local8++) {
				if (this.anIntArray53[local8] != -1) {
					local4[local6++] = Class4_Sub1_Sub1_Sub4.method399(this.anIntArray53[local8]);
				}
			}
			@Pc(36) Class4_Sub1_Sub1_Sub4 local36 = new Class4_Sub1_Sub1_Sub4(local6, -347, local4);
			for (@Pc(45) int local45 = 0; local45 < 6 && this.anIntArray51[local45] != 0; local45++) {
				local36.method413(this.anIntArray51[local45], this.anIntArray52[local45]);
			}
			return local36;
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("48504, " + -100 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}
}
