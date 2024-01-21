import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!PTMGRPAM")
public final class Class35 {

	@OriginalMember(owner = "client!PTMGRPAM", name = "d", descriptor = "I")
	public static int anInt636;

	@OriginalMember(owner = "client!PTMGRPAM", name = "e", descriptor = "[Lclient!PTMGRPAM;")
	public static Class35[] aClass35Array1;

	@OriginalMember(owner = "client!PTMGRPAM", name = "b", descriptor = "I")
	private int anInt635;

	@OriginalMember(owner = "client!PTMGRPAM", name = "g", descriptor = "[I")
	private int[] anIntArray149;

	@OriginalMember(owner = "client!PTMGRPAM", name = "a", descriptor = "I")
	private int anInt634 = 22486;

	@OriginalMember(owner = "client!PTMGRPAM", name = "c", descriptor = "Z")
	private boolean aBoolean165 = false;

	@OriginalMember(owner = "client!PTMGRPAM", name = "f", descriptor = "I")
	public int anInt637 = -1;

	@OriginalMember(owner = "client!PTMGRPAM", name = "h", descriptor = "[I")
	private int[] anIntArray150 = new int[6];

	@OriginalMember(owner = "client!PTMGRPAM", name = "i", descriptor = "[I")
	private int[] anIntArray151 = new int[6];

	@OriginalMember(owner = "client!PTMGRPAM", name = "j", descriptor = "[I")
	private int[] anIntArray152 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!PTMGRPAM", name = "k", descriptor = "Z")
	public boolean aBoolean166 = false;

	@OriginalMember(owner = "client!PTMGRPAM", name = "a", descriptor = "(Lclient!VSUYIIVA;I)V")
	public static void method419(@OriginalArg(0) Class42 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(8) Class1_Sub1_Sub2 local8 = new Class1_Sub1_Sub2(arg0.method539("idk.dat", null), 792);
			anInt636 = local8.method61();
			@Pc(15) boolean local15 = false;
			if (aClass35Array1 == null) {
				aClass35Array1 = new Class35[anInt636];
			}
			for (@Pc(22) int local22 = 0; local22 < anInt636; local22++) {
				if (aClass35Array1[local22] == null) {
					aClass35Array1[local22] = new Class35();
				}
				aClass35Array1[local22].method420(local8);
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("75828, " + arg0 + ", " + arg1 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PTMGRPAM", name = "<init>", descriptor = "()V")
	private Class35() {
	}

	@OriginalMember(owner = "client!PTMGRPAM", name = "a", descriptor = "(Lclient!CFARFRSG;I)V")
	private void method420(@OriginalArg(0) Class1_Sub1_Sub2 arg0) {
		try {
			if (this.anInt634 != 22486) {
				throw new NullPointerException();
			}
			while (true) {
				while (true) {
					@Pc(12) int local12 = arg0.method59();
					if (local12 == 0) {
						return;
					}
					if (local12 == 1) {
						this.anInt637 = arg0.method59();
					} else if (local12 == 2) {
						@Pc(30) int local30 = arg0.method59();
						this.anIntArray149 = new int[local30];
						for (@Pc(36) int local36 = 0; local36 < local30; local36++) {
							this.anIntArray149[local36] = arg0.method61();
						}
					} else if (local12 == 3) {
						this.aBoolean166 = true;
					} else if (local12 >= 40 && local12 < 50) {
						this.anIntArray150[local12 - 40] = arg0.method61();
					} else if (local12 >= 50 && local12 < 60) {
						this.anIntArray151[local12 - 50] = arg0.method61();
					} else if (local12 >= 60 && local12 < 70) {
						this.anIntArray152[local12 - 60] = arg0.method61();
					} else {
						System.out.println("Error unrecognised config code: " + local12);
					}
				}
			}
		} catch (@Pc(117) RuntimeException local117) {
			signlink.reporterror("54769, " + arg0 + ", " + 22486 + ", " + local117.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PTMGRPAM", name = "a", descriptor = "(I)Z")
	public boolean method421(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			if (this.anIntArray149 == null) {
				return true;
			}
			@Pc(10) boolean local10 = true;
			for (@Pc(12) int local12 = 0; local12 < this.anIntArray149.length; local12++) {
				if (!Class1_Sub1_Sub1_Sub4.method303(this.anIntArray149[local12])) {
					local10 = false;
				}
			}
			return local10;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("19894, " + arg0 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PTMGRPAM", name = "b", descriptor = "(I)Lclient!LFTMDGKK;")
	public Class1_Sub1_Sub1_Sub4 method422() {
		try {
			if (this.anIntArray149 == null) {
				return null;
			}
			@Pc(22) Class1_Sub1_Sub1_Sub4[] local22 = new Class1_Sub1_Sub1_Sub4[this.anIntArray149.length];
			for (@Pc(24) int local24 = 0; local24 < this.anIntArray149.length; local24++) {
				local22[local24] = Class1_Sub1_Sub1_Sub4.method302(this.anIntArray149[local24], this.anInt635);
			}
			@Pc(50) Class1_Sub1_Sub1_Sub4 local50;
			if (local22.length == 1) {
				local50 = local22[0];
			} else {
				local50 = new Class1_Sub1_Sub1_Sub4(local22.length, 698, local22);
			}
			for (@Pc(62) int local62 = 0; local62 < 6 && this.anIntArray150[local62] != 0; local62++) {
				local50.method316(this.anIntArray150[local62], this.anIntArray151[local62]);
			}
			return local50;
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("50558, " + 18165 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PTMGRPAM", name = "c", descriptor = "(I)Z")
	public boolean method423() {
		try {
			@Pc(1) boolean local1 = true;
			for (@Pc(17) int local17 = 0; local17 < 5; local17++) {
				if (this.anIntArray152[local17] != -1 && !Class1_Sub1_Sub1_Sub4.method303(this.anIntArray152[local17])) {
					local1 = false;
				}
			}
			return local1;
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("44645, " + 7 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PTMGRPAM", name = "a", descriptor = "(B)Lclient!LFTMDGKK;")
	public Class1_Sub1_Sub1_Sub4 method424() {
		try {
			@Pc(4) Class1_Sub1_Sub1_Sub4[] local4 = new Class1_Sub1_Sub1_Sub4[5];
			@Pc(6) int local6 = 0;
			for (@Pc(8) int local8 = 0; local8 < 5; local8++) {
				if (this.anIntArray152[local8] != -1) {
					local4[local6++] = Class1_Sub1_Sub1_Sub4.method302(this.anIntArray152[local8], this.anInt635);
				}
			}
			@Pc(38) Class1_Sub1_Sub1_Sub4 local38 = new Class1_Sub1_Sub1_Sub4(local6, 698, local4);
			for (@Pc(40) int local40 = 0; local40 < 6 && this.anIntArray150[local40] != 0; local40++) {
				local38.method316(this.anIntArray150[local40], this.anIntArray151[local40]);
			}
			return local38;
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("91868, " + 113 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}
}
