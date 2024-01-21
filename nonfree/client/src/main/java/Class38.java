import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!SXXYSOJW")
public final class Class38 {

	@OriginalMember(owner = "client!SXXYSOJW", name = "b", descriptor = "I")
	private static int anInt600;

	@OriginalMember(owner = "client!SXXYSOJW", name = "c", descriptor = "[Lclient!SXXYSOJW;")
	public static Class38[] aClass38Array1;

	@OriginalMember(owner = "client!SXXYSOJW", name = "d", descriptor = "I")
	private static int anInt601;

	@OriginalMember(owner = "client!SXXYSOJW", name = "e", descriptor = "[I")
	private static int[] anIntArray131;

	@OriginalMember(owner = "client!SXXYSOJW", name = "a", descriptor = "I")
	private int anInt599;

	@OriginalMember(owner = "client!SXXYSOJW", name = "f", descriptor = "Ljava/lang/String;")
	private String aString14;

	@OriginalMember(owner = "client!SXXYSOJW", name = "g", descriptor = "I")
	private int anInt602;

	@OriginalMember(owner = "client!SXXYSOJW", name = "h", descriptor = "I")
	private int anInt603;

	@OriginalMember(owner = "client!SXXYSOJW", name = "k", descriptor = "I")
	public int anInt604;

	@OriginalMember(owner = "client!SXXYSOJW", name = "m", descriptor = "I")
	private int anInt605;

	@OriginalMember(owner = "client!SXXYSOJW", name = "n", descriptor = "I")
	private int anInt606;

	@OriginalMember(owner = "client!SXXYSOJW", name = "i", descriptor = "Z")
	private boolean aBoolean179 = false;

	@OriginalMember(owner = "client!SXXYSOJW", name = "j", descriptor = "Z")
	private boolean aBoolean180 = true;

	@OriginalMember(owner = "client!SXXYSOJW", name = "l", descriptor = "Z")
	private boolean aBoolean181 = false;

	@OriginalMember(owner = "client!SXXYSOJW", name = "o", descriptor = "Z")
	public boolean aBoolean182 = false;

	@OriginalMember(owner = "client!SXXYSOJW", name = "p", descriptor = "I")
	private int anInt607 = -1;

	@OriginalMember(owner = "client!SXXYSOJW", name = "q", descriptor = "Z")
	private boolean aBoolean183 = true;

	@OriginalMember(owner = "client!SXXYSOJW", name = "a", descriptor = "(Lclient!BYZSQZUF;Z)V")
	public static void method398(@OriginalArg(0) Class5 arg0) {
		try {
			@Pc(8) Class3_Sub1_Sub3 local8 = new Class3_Sub1_Sub3(0, arg0.method66("varp.dat", null));
			anInt601 = 0;
			anInt600 = local8.method148();
			if (aClass38Array1 == null) {
				aClass38Array1 = new Class38[anInt600];
			}
			if (anIntArray131 == null) {
				anIntArray131 = new int[anInt600];
			}
			for (@Pc(28) int local28 = 0; local28 < anInt600; local28++) {
				if (aClass38Array1[local28] == null) {
					aClass38Array1[local28] = new Class38();
				}
				aClass38Array1[local28].method399(local8, local28);
			}
			if (local8.anInt243 != local8.aByteArray5.length) {
				System.out.println("varptype load mismatch");
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("39161, " + arg0 + ", " + false + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SXXYSOJW", name = "<init>", descriptor = "()V")
	private Class38() {
	}

	@OriginalMember(owner = "client!SXXYSOJW", name = "a", descriptor = "(Lclient!IMUIZRAF;II)V")
	private void method399(@OriginalArg(0) Class3_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			while (true) {
				@Pc(9) int local9 = arg0.method146();
				if (local9 == 0) {
					return;
				}
				if (local9 == 1) {
					this.anInt602 = arg0.method146();
				} else if (local9 == 2) {
					this.anInt603 = arg0.method146();
				} else if (local9 == 3) {
					this.aBoolean179 = true;
					anIntArray131[anInt601++] = arg1;
				} else if (local9 == 4) {
					this.aBoolean180 = false;
				} else if (local9 == 5) {
					this.anInt604 = arg0.method148();
				} else if (local9 == 6) {
					this.aBoolean181 = true;
				} else if (local9 == 7) {
					this.anInt605 = arg0.method151();
				} else if (local9 == 8) {
					this.anInt606 = 1;
					this.aBoolean182 = true;
				} else if (local9 == 10) {
					this.aString14 = arg0.method153();
				} else if (local9 == 11) {
					this.aBoolean182 = true;
				} else if (local9 == 12) {
					this.anInt607 = arg0.method151();
				} else if (local9 == 13) {
					this.anInt606 = 2;
				} else if (local9 == 14) {
					this.aBoolean183 = false;
				} else {
					System.out.println("Error unrecognised config code: " + local9);
				}
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("48063, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}
}
