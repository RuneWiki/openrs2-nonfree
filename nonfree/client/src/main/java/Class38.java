import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!rc")
public final class Class38 {

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
	private static int anInt870;

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
	private static int anInt871;

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "[Lclient!rc;")
	public static Class38[] aClass38Array1;

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
	private static int anInt872;

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "[I")
	private static int[] anIntArray234;

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "Ljava/lang/String;")
	private String aString29;

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
	private int anInt873;

	@OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
	private int anInt874;

	@OriginalMember(owner = "client!rc", name = "k", descriptor = "I")
	public int anInt875;

	@OriginalMember(owner = "client!rc", name = "m", descriptor = "I")
	private int anInt876;

	@OriginalMember(owner = "client!rc", name = "i", descriptor = "Z")
	private boolean aBoolean205 = false;

	@OriginalMember(owner = "client!rc", name = "j", descriptor = "Z")
	private boolean aBoolean206 = true;

	@OriginalMember(owner = "client!rc", name = "l", descriptor = "Z")
	private boolean aBoolean207 = false;

	@OriginalMember(owner = "client!rc", name = "n", descriptor = "Z")
	private boolean aBoolean208 = false;

	@OriginalMember(owner = "client!rc", name = "o", descriptor = "Z")
	private boolean aBoolean209 = false;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!yb;Z)V")
	public static void method541(@OriginalArg(0) Class48 arg0) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3(arg0.method678("varp.dat", null), 337);
			anInt872 = 0;
			anInt871 = local8.method500();
			if (aClass38Array1 == null) {
				aClass38Array1 = new Class38[anInt871];
			}
			if (anIntArray234 == null) {
				anIntArray234 = new int[anInt871];
			}
			for (@Pc(29) int local29 = 0; local29 < anInt871; local29++) {
				if (aClass38Array1[local29] == null) {
					aClass38Array1[local29] = new Class38();
				}
				aClass38Array1[local29].method542(local29, local8);
			}
			if (local8.anInt768 != local8.aByteArray9.length) {
				System.out.println("varptype load mismatch");
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("22422, " + arg0 + ", " + true + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "()V")
	private Class38() {
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IILclient!mb;)V")
	private void method542(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			while (true) {
				@Pc(10) int local10 = arg1.method498();
				if (local10 == 0) {
					return;
				}
				if (local10 == 1) {
					this.anInt873 = arg1.method498();
				} else if (local10 == 2) {
					this.anInt874 = arg1.method498();
				} else if (local10 == 3) {
					this.aBoolean205 = true;
					anIntArray234[anInt872++] = arg0;
				} else if (local10 == 4) {
					this.aBoolean206 = false;
				} else if (local10 == 5) {
					this.anInt875 = arg1.method500();
				} else if (local10 == 6) {
					this.aBoolean207 = true;
				} else if (local10 == 7) {
					this.anInt876 = arg1.method503();
				} else if (local10 == 8) {
					this.aBoolean208 = true;
					this.aBoolean209 = true;
				} else if (local10 == 10) {
					this.aString29 = arg1.method505();
				} else if (local10 == 11) {
					this.aBoolean209 = true;
				} else {
					System.out.println("Error unrecognised config code: " + local10);
				}
			}
		} catch (@Pc(120) RuntimeException local120) {
			signlink.reporterror("82180, " + -448 + ", " + arg0 + ", " + arg1 + ", " + local120.toString());
			throw new RuntimeException();
		}
	}
}
