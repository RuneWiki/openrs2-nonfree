import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!RIRWXSOT")
public final class Class36 {

	@OriginalMember(owner = "client!RIRWXSOT", name = "a", descriptor = "I")
	private static int anInt667;

	@OriginalMember(owner = "client!RIRWXSOT", name = "b", descriptor = "[Lclient!RIRWXSOT;")
	public static Class36[] aClass36Array1;

	@OriginalMember(owner = "client!RIRWXSOT", name = "c", descriptor = "I")
	private static int anInt668;

	@OriginalMember(owner = "client!RIRWXSOT", name = "d", descriptor = "[I")
	private static int[] anIntArray165;

	@OriginalMember(owner = "client!RIRWXSOT", name = "e", descriptor = "Ljava/lang/String;")
	private String aString15;

	@OriginalMember(owner = "client!RIRWXSOT", name = "f", descriptor = "I")
	private int anInt669;

	@OriginalMember(owner = "client!RIRWXSOT", name = "g", descriptor = "I")
	private int anInt670;

	@OriginalMember(owner = "client!RIRWXSOT", name = "j", descriptor = "I")
	public int anInt671;

	@OriginalMember(owner = "client!RIRWXSOT", name = "l", descriptor = "I")
	private int anInt672;

	@OriginalMember(owner = "client!RIRWXSOT", name = "m", descriptor = "I")
	private int anInt673;

	@OriginalMember(owner = "client!RIRWXSOT", name = "h", descriptor = "Z")
	private boolean aBoolean137 = false;

	@OriginalMember(owner = "client!RIRWXSOT", name = "i", descriptor = "Z")
	private boolean aBoolean138 = true;

	@OriginalMember(owner = "client!RIRWXSOT", name = "k", descriptor = "Z")
	private boolean aBoolean139 = false;

	@OriginalMember(owner = "client!RIRWXSOT", name = "n", descriptor = "Z")
	public boolean aBoolean140 = false;

	@OriginalMember(owner = "client!RIRWXSOT", name = "o", descriptor = "I")
	private int anInt674 = -1;

	@OriginalMember(owner = "client!RIRWXSOT", name = "p", descriptor = "Z")
	private boolean aBoolean141 = true;

	@OriginalMember(owner = "client!RIRWXSOT", name = "a", descriptor = "(BLclient!IEMHZJLX;)V")
	public static void method445(@OriginalArg(0) byte arg0, @OriginalArg(1) Class15 arg1) {
		try {
			@Pc(10) Class1_Sub1_Sub4 local10 = new Class1_Sub1_Sub4(0, arg1.method181("varp.dat", null));
			anInt668 = 0;
			anInt667 = local10.method296();
			@Pc(20) boolean local20 = false;
			if (aClass36Array1 == null) {
				aClass36Array1 = new Class36[anInt667];
			}
			if (anIntArray165 == null) {
				anIntArray165 = new int[anInt667];
			}
			for (@Pc(41) int local41 = 0; local41 < anInt667; local41++) {
				if (aClass36Array1[local41] == null) {
					aClass36Array1[local41] = new Class36();
				}
				aClass36Array1[local41].method446(local41, local10);
			}
			if (local10.anInt529 != local10.aByteArray14.length) {
				System.out.println("varptype load mismatch");
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("93582, " + arg0 + ", " + arg1 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RIRWXSOT", name = "<init>", descriptor = "()V")
	private Class36() {
	}

	@OriginalMember(owner = "client!RIRWXSOT", name = "a", descriptor = "(ILclient!MVHXDWGI;B)V")
	private void method446(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub4 arg1) {
		try {
			while (true) {
				@Pc(14) int local14 = arg1.method294();
				if (local14 == 0) {
					return;
				}
				if (local14 == 1) {
					this.anInt669 = arg1.method294();
				} else if (local14 == 2) {
					this.anInt670 = arg1.method294();
				} else if (local14 == 3) {
					this.aBoolean137 = true;
					anIntArray165[anInt668++] = arg0;
				} else if (local14 == 4) {
					this.aBoolean138 = false;
				} else if (local14 == 5) {
					this.anInt671 = arg1.method296();
				} else if (local14 == 6) {
					this.aBoolean139 = true;
				} else if (local14 == 7) {
					this.anInt672 = arg1.method299();
				} else if (local14 == 8) {
					this.anInt673 = 1;
					this.aBoolean140 = true;
				} else if (local14 == 10) {
					this.aString15 = arg1.method301();
				} else if (local14 == 11) {
					this.aBoolean140 = true;
				} else if (local14 == 12) {
					this.anInt674 = arg1.method299();
				} else if (local14 == 13) {
					this.anInt673 = 2;
					this.aBoolean140 = true;
				} else if (local14 == 14) {
					this.aBoolean141 = false;
				} else {
					System.out.println("Error unrecognised config code: " + local14);
				}
			}
		} catch (@Pc(152) RuntimeException local152) {
			signlink.reporterror("42830, " + arg0 + ", " + arg1 + ", " + 1 + ", " + local152.toString());
			throw new RuntimeException();
		}
	}
}
