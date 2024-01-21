import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ATLVWFDY")
public final class Class5 {

	@OriginalMember(owner = "client!ATLVWFDY", name = "a", descriptor = "I")
	private static int anInt29;

	@OriginalMember(owner = "client!ATLVWFDY", name = "b", descriptor = "[Lclient!ATLVWFDY;")
	public static Class5[] aClass5Array1;

	@OriginalMember(owner = "client!ATLVWFDY", name = "c", descriptor = "Ljava/lang/String;")
	private String aString1;

	@OriginalMember(owner = "client!ATLVWFDY", name = "d", descriptor = "I")
	public int anInt30;

	@OriginalMember(owner = "client!ATLVWFDY", name = "e", descriptor = "I")
	public int anInt31;

	@OriginalMember(owner = "client!ATLVWFDY", name = "f", descriptor = "I")
	public int anInt32;

	@OriginalMember(owner = "client!ATLVWFDY", name = "i", descriptor = "I")
	private int anInt34;

	@OriginalMember(owner = "client!ATLVWFDY", name = "g", descriptor = "Z")
	private boolean aBoolean6 = false;

	@OriginalMember(owner = "client!ATLVWFDY", name = "h", descriptor = "I")
	private int anInt33 = -1;

	@OriginalMember(owner = "client!ATLVWFDY", name = "j", descriptor = "Z")
	private boolean aBoolean7 = true;

	@OriginalMember(owner = "client!ATLVWFDY", name = "a", descriptor = "(BLclient!SXKKBWPU;)V")
	public static void method24(@OriginalArg(1) Class35 arg0) {
		try {
			@Pc(8) Class8_Sub1_Sub3 local8 = new Class8_Sub1_Sub3(arg0.method364("varbit.dat", null), -631);
			anInt29 = local8.method408();
			if (aClass5Array1 == null) {
				aClass5Array1 = new Class5[anInt29];
			}
			for (@Pc(22) int local22 = 0; local22 < anInt29; local22++) {
				if (aClass5Array1[local22] == null) {
					aClass5Array1[local22] = new Class5();
				}
				aClass5Array1[local22].method25(local22, local8);
				if (aClass5Array1[local22].aBoolean6) {
					Class23.aClass23Array1[aClass5Array1[local22].anInt30].aBoolean90 = true;
				}
			}
			if (local8.anInt620 != local8.aByteArray13.length) {
				System.out.println("varbit load mismatch");
			}
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("7926, " + -109 + ", " + arg0 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ATLVWFDY", name = "<init>", descriptor = "()V")
	private Class5() {
	}

	@OriginalMember(owner = "client!ATLVWFDY", name = "a", descriptor = "(IILclient!TQYMAXSO;)V")
	private void method25(@OriginalArg(0) int arg0, @OriginalArg(2) Class8_Sub1_Sub3 arg1) {
		try {
			while (true) {
				@Pc(13) int local13 = arg1.method406();
				if (local13 == 0) {
					return;
				}
				if (local13 == 1) {
					this.anInt30 = arg1.method408();
					this.anInt31 = arg1.method406();
					this.anInt32 = arg1.method406();
				} else if (local13 == 10) {
					this.aString1 = arg1.method413();
				} else if (local13 == 2) {
					this.aBoolean6 = true;
				} else if (local13 == 3) {
					this.anInt33 = arg1.method411();
				} else if (local13 == 4) {
					this.anInt34 = arg1.method411();
				} else if (local13 == 5) {
					this.aBoolean7 = false;
				} else {
					System.out.println("Error unrecognised config code: " + local13);
				}
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("13415, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}
}
