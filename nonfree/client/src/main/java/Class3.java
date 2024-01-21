import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!BIGJGRMT")
public final class Class3 {

	@OriginalMember(owner = "client!BIGJGRMT", name = "a", descriptor = "I")
	private static int anInt57;

	@OriginalMember(owner = "client!BIGJGRMT", name = "b", descriptor = "[Lclient!BIGJGRMT;")
	public static Class3[] aClass3Array1;

	@OriginalMember(owner = "client!BIGJGRMT", name = "c", descriptor = "I")
	private static int anInt58;

	@OriginalMember(owner = "client!BIGJGRMT", name = "d", descriptor = "[I")
	private static int[] anIntArray9;

	@OriginalMember(owner = "client!BIGJGRMT", name = "e", descriptor = "Ljava/lang/String;")
	private String aString2;

	@OriginalMember(owner = "client!BIGJGRMT", name = "f", descriptor = "I")
	private int anInt59;

	@OriginalMember(owner = "client!BIGJGRMT", name = "g", descriptor = "I")
	private int anInt60;

	@OriginalMember(owner = "client!BIGJGRMT", name = "j", descriptor = "I")
	public int anInt61;

	@OriginalMember(owner = "client!BIGJGRMT", name = "l", descriptor = "I")
	private int anInt62;

	@OriginalMember(owner = "client!BIGJGRMT", name = "m", descriptor = "I")
	private int anInt63;

	@OriginalMember(owner = "client!BIGJGRMT", name = "h", descriptor = "Z")
	private boolean aBoolean11 = false;

	@OriginalMember(owner = "client!BIGJGRMT", name = "i", descriptor = "Z")
	private boolean aBoolean12 = true;

	@OriginalMember(owner = "client!BIGJGRMT", name = "k", descriptor = "Z")
	private boolean aBoolean13 = false;

	@OriginalMember(owner = "client!BIGJGRMT", name = "n", descriptor = "Z")
	public boolean aBoolean14 = false;

	@OriginalMember(owner = "client!BIGJGRMT", name = "o", descriptor = "I")
	private int anInt64 = -1;

	@OriginalMember(owner = "client!BIGJGRMT", name = "a", descriptor = "(ZLclient!XRWUKRPO;)V")
	public static void method27(@OriginalArg(1) Class45 arg0) {
		try {
			@Pc(8) Class8_Sub1_Sub3 local8 = new Class8_Sub1_Sub3(arg0.method553("varp.dat", null), -49015);
			anInt58 = 0;
			anInt57 = local8.method167();
			if (aClass3Array1 == null) {
				aClass3Array1 = new Class3[anInt57];
			}
			if (anIntArray9 == null) {
				anIntArray9 = new int[anInt57];
			}
			for (@Pc(28) int local28 = 0; local28 < anInt57; local28++) {
				if (aClass3Array1[local28] == null) {
					aClass3Array1[local28] = new Class3();
				}
				aClass3Array1[local28].method28(local28, local8);
			}
			if (local8.anInt253 != local8.aByteArray9.length) {
				System.out.println("varptype load mismatch");
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("17006, " + false + ", " + arg0 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BIGJGRMT", name = "<init>", descriptor = "()V")
	private Class3() {
	}

	@OriginalMember(owner = "client!BIGJGRMT", name = "a", descriptor = "(ZILclient!GLMIQHJI;)V")
	private void method28(@OriginalArg(1) int arg0, @OriginalArg(2) Class8_Sub1_Sub3 arg1) {
		try {
			while (true) {
				@Pc(13) int local13 = arg1.method165();
				if (local13 == 0) {
					return;
				}
				if (local13 == 1) {
					this.anInt59 = arg1.method165();
				} else if (local13 == 2) {
					this.anInt60 = arg1.method165();
				} else if (local13 == 3) {
					this.aBoolean11 = true;
					anIntArray9[anInt58++] = arg0;
				} else if (local13 == 4) {
					this.aBoolean12 = false;
				} else if (local13 == 5) {
					this.anInt61 = arg1.method167();
				} else if (local13 == 6) {
					this.aBoolean13 = true;
				} else if (local13 == 7) {
					this.anInt62 = arg1.method170();
				} else if (local13 == 8) {
					this.anInt63 = 1;
					this.aBoolean14 = true;
				} else if (local13 == 10) {
					this.aString2 = arg1.method172();
				} else if (local13 == 11) {
					this.aBoolean14 = true;
				} else if (local13 == 12) {
					this.anInt64 = arg1.method170();
				} else if (local13 == 13) {
					this.anInt63 = 2;
				} else {
					System.out.println("Error unrecognised config code: " + local13);
				}
			}
		} catch (@Pc(140) RuntimeException local140) {
			signlink.reporterror("11597, " + false + ", " + arg0 + ", " + arg1 + ", " + local140.toString());
			throw new RuntimeException();
		}
	}
}
