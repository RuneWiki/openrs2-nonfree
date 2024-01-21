import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!rc")
public final class Class38 {

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
	private static int anInt902;

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "[Lclient!rc;")
	public static Class38[] aClass38Array1;

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
	private static int anInt903;

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "[I")
	private static int[] anIntArray234;

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "Ljava/lang/String;")
	private String aString29;

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
	private int anInt904;

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
	private int anInt905;

	@OriginalMember(owner = "client!rc", name = "j", descriptor = "I")
	public int anInt906;

	@OriginalMember(owner = "client!rc", name = "l", descriptor = "I")
	private int anInt907;

	@OriginalMember(owner = "client!rc", name = "h", descriptor = "Z")
	private boolean aBoolean203 = false;

	@OriginalMember(owner = "client!rc", name = "i", descriptor = "Z")
	private boolean aBoolean204 = true;

	@OriginalMember(owner = "client!rc", name = "k", descriptor = "Z")
	private boolean aBoolean205 = false;

	@OriginalMember(owner = "client!rc", name = "m", descriptor = "Z")
	private boolean aBoolean206 = false;

	@OriginalMember(owner = "client!rc", name = "n", descriptor = "Z")
	private boolean aBoolean207 = false;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!yb;I)V")
	public static void method541(@OriginalArg(0) Class48 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3(45427, arg0.method678("varp.dat", null));
			anInt903 = 0;
			anInt902 = local8.method500();
			if (aClass38Array1 == null) {
				aClass38Array1 = new Class38[anInt902];
			}
			if (anIntArray234 == null) {
				anIntArray234 = new int[anInt902];
			}
			for (@Pc(25) int local25 = 0; local25 < anInt902; local25++) {
				if (aClass38Array1[local25] == null) {
					aClass38Array1[local25] = new Class38();
				}
				aClass38Array1[local25].method542(local8, local25, 312);
			}
			@Pc(52) boolean local52 = false;
			if (local8.anInt796 != local8.aByteArray9.length) {
				System.out.println("varptype load mismatch");
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("71836, " + arg0 + ", " + arg1 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "()V")
	private Class38() {
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!mb;II)V")
	private void method542(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(5) boolean local5 = false;
			while (true) {
				@Pc(8) int local8 = arg0.method498();
				if (local8 == 0) {
					return;
				}
				if (local8 == 1) {
					this.anInt904 = arg0.method498();
				} else if (local8 == 2) {
					this.anInt905 = arg0.method498();
				} else if (local8 == 3) {
					this.aBoolean203 = true;
					anIntArray234[anInt903++] = arg1;
				} else if (local8 == 4) {
					this.aBoolean204 = false;
				} else if (local8 == 5) {
					this.anInt906 = arg0.method500();
				} else if (local8 == 6) {
					this.aBoolean205 = true;
				} else if (local8 == 7) {
					this.anInt907 = arg0.method503();
				} else if (local8 == 8) {
					this.aBoolean206 = true;
					this.aBoolean207 = true;
				} else if (local8 == 10) {
					this.aString29 = arg0.method505();
				} else if (local8 == 11) {
					this.aBoolean207 = true;
				} else {
					System.out.println("Error unrecognised config code: " + local8);
				}
			}
		} catch (@Pc(118) RuntimeException local118) {
			signlink.reporterror("3622, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local118.toString());
			throw new RuntimeException();
		}
	}
}
