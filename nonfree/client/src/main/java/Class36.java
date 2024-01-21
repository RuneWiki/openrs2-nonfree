import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!SECEMLXT")
public final class Class36 {

	@OriginalMember(owner = "client!SECEMLXT", name = "c", descriptor = "I")
	public static int anInt522;

	@OriginalMember(owner = "client!SECEMLXT", name = "d", descriptor = "[Lclient!SECEMLXT;")
	public static Class36[] aClass36Array1;

	@OriginalMember(owner = "client!SECEMLXT", name = "b", descriptor = "I")
	private int anInt521;

	@OriginalMember(owner = "client!SECEMLXT", name = "f", descriptor = "[I")
	private int[] anIntArray115;

	@OriginalMember(owner = "client!SECEMLXT", name = "a", descriptor = "Z")
	private boolean aBoolean115 = false;

	@OriginalMember(owner = "client!SECEMLXT", name = "e", descriptor = "I")
	public int anInt523 = -1;

	@OriginalMember(owner = "client!SECEMLXT", name = "g", descriptor = "[I")
	private int[] anIntArray116 = new int[6];

	@OriginalMember(owner = "client!SECEMLXT", name = "h", descriptor = "[I")
	private int[] anIntArray117 = new int[6];

	@OriginalMember(owner = "client!SECEMLXT", name = "i", descriptor = "[I")
	private int[] anIntArray118 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!SECEMLXT", name = "j", descriptor = "Z")
	public boolean aBoolean116 = false;

	@OriginalMember(owner = "client!SECEMLXT", name = "a", descriptor = "(BLclient!RPFMUSNN;)V")
	public static void method342(@OriginalArg(1) Class35 arg0) {
		try {
			@Pc(12) Class3_Sub1_Sub4 local12 = new Class3_Sub1_Sub4((byte) -58, arg0.method341("idk.dat", null));
			anInt522 = local12.method460();
			if (aClass36Array1 == null) {
				aClass36Array1 = new Class36[anInt522];
			}
			for (@Pc(22) int local22 = 0; local22 < anInt522; local22++) {
				if (aClass36Array1[local22] == null) {
					aClass36Array1[local22] = new Class36();
				}
				aClass36Array1[local22].method343(local12);
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("44273, " + -114 + ", " + arg0 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SECEMLXT", name = "<init>", descriptor = "()V")
	private Class36() {
	}

	@OriginalMember(owner = "client!SECEMLXT", name = "a", descriptor = "(ILclient!WNCFPLWV;)V")
	private void method343(@OriginalArg(1) Class3_Sub1_Sub4 arg0) {
		try {
			while (true) {
				@Pc(10) int local10 = arg0.method458();
				if (local10 == 0) {
					return;
				}
				if (local10 == 1) {
					this.anInt523 = arg0.method458();
				} else if (local10 == 2) {
					@Pc(28) int local28 = arg0.method458();
					this.anIntArray115 = new int[local28];
					for (@Pc(34) int local34 = 0; local34 < local28; local34++) {
						this.anIntArray115[local34] = arg0.method460();
					}
				} else if (local10 == 3) {
					this.aBoolean116 = true;
				} else if (local10 >= 40 && local10 < 50) {
					this.anIntArray116[local10 - 40] = arg0.method460();
				} else if (local10 >= 50 && local10 < 60) {
					this.anIntArray117[local10 - 50] = arg0.method460();
				} else if (local10 >= 60 && local10 < 70) {
					this.anIntArray118[local10 - 60] = arg0.method460();
				} else {
					System.out.println("Error unrecognised config code: " + local10);
				}
			}
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("64216, " + -934 + ", " + arg0 + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SECEMLXT", name = "a", descriptor = "(Z)Z")
	public boolean method344() {
		try {
			if (this.anIntArray115 == null) {
				return true;
			}
			@Pc(6) boolean local6 = true;
			for (@Pc(14) int local14 = 0; local14 < this.anIntArray115.length; local14++) {
				if (!Class3_Sub1_Sub1_Sub5.method397(this.anIntArray115[local14])) {
					local6 = false;
				}
			}
			return local6;
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("29800, " + false + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SECEMLXT", name = "a", descriptor = "(I)Lclient!UNLYQRUD;")
	public Class3_Sub1_Sub1_Sub5 method345() {
		try {
			if (this.anIntArray115 == null) {
				return null;
			}
			@Pc(11) Class3_Sub1_Sub1_Sub5[] local11 = new Class3_Sub1_Sub1_Sub5[this.anIntArray115.length];
			for (@Pc(19) int local19 = 0; local19 < this.anIntArray115.length; local19++) {
				local11[local19] = Class3_Sub1_Sub1_Sub5.method396(this.anIntArray115[local19]);
			}
			@Pc(43) Class3_Sub1_Sub1_Sub5 local43;
			if (local11.length == 1) {
				local43 = local11[0];
			} else {
				local43 = new Class3_Sub1_Sub1_Sub5(local11.length, local11, 0);
			}
			for (@Pc(55) int local55 = 0; local55 < 6 && this.anIntArray116[local55] != 0; local55++) {
				local43.method410(this.anIntArray116[local55], this.anIntArray117[local55]);
			}
			return local43;
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("58147, " + 691 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SECEMLXT", name = "b", descriptor = "(Z)Z")
	public boolean method346() {
		try {
			@Pc(1) boolean local1 = true;
			for (@Pc(13) int local13 = 0; local13 < 5; local13++) {
				if (this.anIntArray118[local13] != -1 && !Class3_Sub1_Sub1_Sub5.method397(this.anIntArray118[local13])) {
					local1 = false;
				}
			}
			return local1;
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("63685, " + false + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SECEMLXT", name = "b", descriptor = "(I)Lclient!UNLYQRUD;")
	public Class3_Sub1_Sub1_Sub5 method347() {
		try {
			@Pc(4) Class3_Sub1_Sub1_Sub5[] local4 = new Class3_Sub1_Sub1_Sub5[5];
			@Pc(11) int local11 = 0;
			for (@Pc(13) int local13 = 0; local13 < 5; local13++) {
				if (this.anIntArray118[local13] != -1) {
					local4[local11++] = Class3_Sub1_Sub1_Sub5.method396(this.anIntArray118[local13]);
				}
			}
			@Pc(41) Class3_Sub1_Sub1_Sub5 local41 = new Class3_Sub1_Sub1_Sub5(local11, local4, 0);
			for (@Pc(43) int local43 = 0; local43 < 6 && this.anIntArray116[local43] != 0; local43++) {
				local41.method410(this.anIntArray116[local43], this.anIntArray117[local43]);
			}
			return local41;
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("94555, " + 0 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}
}
