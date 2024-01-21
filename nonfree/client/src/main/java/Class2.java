import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!AFWJXAMU")
public final class Class2 {

	@OriginalMember(owner = "client!AFWJXAMU", name = "b", descriptor = "I")
	private static int anInt2;

	@OriginalMember(owner = "client!AFWJXAMU", name = "c", descriptor = "[Lclient!AFWJXAMU;")
	public static Class2[] aClass2Array1;

	@OriginalMember(owner = "client!AFWJXAMU", name = "d", descriptor = "Ljava/lang/String;")
	private String aString1;

	@OriginalMember(owner = "client!AFWJXAMU", name = "e", descriptor = "I")
	public int anInt3;

	@OriginalMember(owner = "client!AFWJXAMU", name = "f", descriptor = "I")
	public int anInt4;

	@OriginalMember(owner = "client!AFWJXAMU", name = "g", descriptor = "I")
	public int anInt5;

	@OriginalMember(owner = "client!AFWJXAMU", name = "j", descriptor = "I")
	private int anInt7;

	@OriginalMember(owner = "client!AFWJXAMU", name = "a", descriptor = "Z")
	private boolean aBoolean2 = true;

	@OriginalMember(owner = "client!AFWJXAMU", name = "h", descriptor = "Z")
	private boolean aBoolean3 = false;

	@OriginalMember(owner = "client!AFWJXAMU", name = "i", descriptor = "I")
	private int anInt6 = -1;

	@OriginalMember(owner = "client!AFWJXAMU", name = "k", descriptor = "Z")
	private boolean aBoolean4 = true;

	@OriginalMember(owner = "client!AFWJXAMU", name = "a", descriptor = "(Lclient!BYZSQZUF;Z)V")
	public static void method6(@OriginalArg(0) Class5 arg0) {
		try {
			@Pc(11) Class3_Sub1_Sub3 local11 = new Class3_Sub1_Sub3(0, arg0.method66("varbit.dat", null));
			anInt2 = local11.method148();
			if (aClass2Array1 == null) {
				aClass2Array1 = new Class2[anInt2];
			}
			for (@Pc(21) int local21 = 0; local21 < anInt2; local21++) {
				if (aClass2Array1[local21] == null) {
					aClass2Array1[local21] = new Class2();
				}
				aClass2Array1[local21].method7(local11, local21);
				if (aClass2Array1[local21].aBoolean3) {
					Class38.aClass38Array1[aClass2Array1[local21].anInt3].aBoolean182 = true;
				}
			}
			if (local11.anInt243 != local11.aByteArray5.length) {
				System.out.println("varbit load mismatch");
			}
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("51041, " + arg0 + ", " + false + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AFWJXAMU", name = "<init>", descriptor = "()V")
	private Class2() {
	}

	@OriginalMember(owner = "client!AFWJXAMU", name = "a", descriptor = "(Lclient!IMUIZRAF;II)V")
	private void method7(@OriginalArg(0) Class3_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			while (true) {
				@Pc(14) int local14 = arg0.method146();
				if (local14 == 0) {
					return;
				}
				if (local14 == 1) {
					this.anInt3 = arg0.method148();
					this.anInt4 = arg0.method146();
					this.anInt5 = arg0.method146();
				} else if (local14 == 10) {
					this.aString1 = arg0.method153();
				} else if (local14 == 2) {
					this.aBoolean3 = true;
				} else if (local14 == 3) {
					this.anInt6 = arg0.method151();
				} else if (local14 == 4) {
					this.anInt7 = arg0.method151();
				} else if (local14 == 5) {
					this.aBoolean4 = false;
				} else {
					System.out.println("Error unrecognised config code: " + local14);
				}
			}
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("73340, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}
}
