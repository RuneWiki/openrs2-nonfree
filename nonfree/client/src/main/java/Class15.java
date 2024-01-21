import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!GQDAZHGX")
public final class Class15 {

	@OriginalMember(owner = "client!GQDAZHGX", name = "b", descriptor = "I")
	private static int anInt271;

	@OriginalMember(owner = "client!GQDAZHGX", name = "c", descriptor = "[Lclient!GQDAZHGX;")
	public static Class15[] aClass15Array1;

	@OriginalMember(owner = "client!GQDAZHGX", name = "d", descriptor = "I")
	private static int anInt272;

	@OriginalMember(owner = "client!GQDAZHGX", name = "e", descriptor = "[I")
	private static int[] anIntArray34;

	@OriginalMember(owner = "client!GQDAZHGX", name = "f", descriptor = "Ljava/lang/String;")
	private String aString5;

	@OriginalMember(owner = "client!GQDAZHGX", name = "g", descriptor = "I")
	private int anInt273;

	@OriginalMember(owner = "client!GQDAZHGX", name = "h", descriptor = "I")
	private int anInt274;

	@OriginalMember(owner = "client!GQDAZHGX", name = "k", descriptor = "I")
	public int anInt275;

	@OriginalMember(owner = "client!GQDAZHGX", name = "m", descriptor = "I")
	private int anInt276;

	@OriginalMember(owner = "client!GQDAZHGX", name = "n", descriptor = "I")
	private int anInt277;

	@OriginalMember(owner = "client!GQDAZHGX", name = "a", descriptor = "I")
	private int anInt270 = 6;

	@OriginalMember(owner = "client!GQDAZHGX", name = "i", descriptor = "Z")
	private boolean aBoolean45 = false;

	@OriginalMember(owner = "client!GQDAZHGX", name = "j", descriptor = "Z")
	private boolean aBoolean46 = true;

	@OriginalMember(owner = "client!GQDAZHGX", name = "l", descriptor = "Z")
	private boolean aBoolean47 = false;

	@OriginalMember(owner = "client!GQDAZHGX", name = "o", descriptor = "Z")
	public boolean aBoolean48 = false;

	@OriginalMember(owner = "client!GQDAZHGX", name = "p", descriptor = "I")
	private int anInt278 = -1;

	@OriginalMember(owner = "client!GQDAZHGX", name = "q", descriptor = "Z")
	private boolean aBoolean49 = true;

	@OriginalMember(owner = "client!GQDAZHGX", name = "a", descriptor = "(Lclient!NXFIIFAD;I)V")
	public static void method124(@OriginalArg(0) Class31 arg0) {
		try {
			@Pc(8) Class1_Sub2_Sub3 local8 = new Class1_Sub2_Sub3(arg0.method352("varp.dat", null), -670);
			anInt272 = 0;
			anInt271 = local8.method309();
			if (aClass15Array1 == null) {
				aClass15Array1 = new Class15[anInt271];
			}
			if (anIntArray34 == null) {
				anIntArray34 = new int[anInt271];
			}
			for (@Pc(29) int local29 = 0; local29 < anInt271; local29++) {
				if (aClass15Array1[local29] == null) {
					aClass15Array1[local29] = new Class15();
				}
				aClass15Array1[local29].method125(local8, local29);
			}
			if (local8.anInt474 != local8.aByteArray10.length) {
				System.out.println("varptype load mismatch");
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("36340, " + arg0 + ", " + 24570 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GQDAZHGX", name = "<init>", descriptor = "()V")
	private Class15() {
	}

	@OriginalMember(owner = "client!GQDAZHGX", name = "a", descriptor = "(Lclient!MNKDCXXG;ZI)V")
	private void method125(@OriginalArg(0) Class1_Sub2_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			while (true) {
				@Pc(9) int local9 = arg0.method307();
				if (local9 == 0) {
					return;
				}
				if (local9 == 1) {
					this.anInt273 = arg0.method307();
				} else if (local9 == 2) {
					this.anInt274 = arg0.method307();
				} else if (local9 == 3) {
					this.aBoolean45 = true;
					anIntArray34[anInt272++] = arg1;
				} else if (local9 == 4) {
					this.aBoolean46 = false;
				} else if (local9 == 5) {
					this.anInt275 = arg0.method309();
				} else if (local9 == 6) {
					this.aBoolean47 = true;
				} else if (local9 == 7) {
					this.anInt276 = arg0.method312();
				} else if (local9 == 8) {
					this.anInt277 = 1;
					this.aBoolean48 = true;
				} else if (local9 == 10) {
					this.aString5 = arg0.method314();
				} else if (local9 == 11) {
					this.aBoolean48 = true;
				} else if (local9 == 12) {
					this.anInt278 = arg0.method312();
				} else if (local9 == 13) {
					this.anInt277 = 2;
					this.aBoolean48 = true;
				} else if (local9 == 14) {
					this.aBoolean49 = false;
				} else {
					System.out.println("Error unrecognised config code: " + local9);
				}
			}
		} catch (@Pc(147) RuntimeException local147) {
			signlink.reporterror("68010, " + arg0 + ", " + false + ", " + arg1 + ", " + local147.toString());
			throw new RuntimeException();
		}
	}
}
