import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!XDAGNEWI")
public final class Class44 {

	@OriginalMember(owner = "client!XDAGNEWI", name = "b", descriptor = "I")
	private static int anInt764;

	@OriginalMember(owner = "client!XDAGNEWI", name = "c", descriptor = "[Lclient!XDAGNEWI;")
	public static Class44[] aClass44Array1;

	@OriginalMember(owner = "client!XDAGNEWI", name = "d", descriptor = "I")
	private static int anInt765;

	@OriginalMember(owner = "client!XDAGNEWI", name = "e", descriptor = "[I")
	private static int[] anIntArray197;

	@OriginalMember(owner = "client!XDAGNEWI", name = "a", descriptor = "I")
	private static int anInt763 = 6;

	@OriginalMember(owner = "client!XDAGNEWI", name = "f", descriptor = "Ljava/lang/String;")
	private String aString16;

	@OriginalMember(owner = "client!XDAGNEWI", name = "g", descriptor = "I")
	private int anInt766;

	@OriginalMember(owner = "client!XDAGNEWI", name = "h", descriptor = "I")
	private int anInt767;

	@OriginalMember(owner = "client!XDAGNEWI", name = "k", descriptor = "I")
	public int anInt768;

	@OriginalMember(owner = "client!XDAGNEWI", name = "m", descriptor = "I")
	private int anInt769;

	@OriginalMember(owner = "client!XDAGNEWI", name = "n", descriptor = "I")
	private int anInt770;

	@OriginalMember(owner = "client!XDAGNEWI", name = "i", descriptor = "Z")
	private boolean aBoolean172 = false;

	@OriginalMember(owner = "client!XDAGNEWI", name = "j", descriptor = "Z")
	private boolean aBoolean173 = true;

	@OriginalMember(owner = "client!XDAGNEWI", name = "l", descriptor = "Z")
	private boolean aBoolean174 = false;

	@OriginalMember(owner = "client!XDAGNEWI", name = "o", descriptor = "Z")
	public boolean aBoolean175 = false;

	@OriginalMember(owner = "client!XDAGNEWI", name = "p", descriptor = "I")
	private int anInt771 = -1;

	@OriginalMember(owner = "client!XDAGNEWI", name = "q", descriptor = "Z")
	private boolean aBoolean176 = true;

	@OriginalMember(owner = "client!XDAGNEWI", name = "a", descriptor = "(Lclient!LKPVZAQN;I)V")
	public static void method517(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(8) Class3_Sub3_Sub4 local8 = new Class3_Sub3_Sub4((byte) -115, arg0.method207("varp.dat", null));
			anInt765 = 0;
			@Pc(14) boolean local14 = false;
			anInt764 = local8.method470();
			if (aClass44Array1 == null) {
				aClass44Array1 = new Class44[anInt764];
			}
			if (anIntArray197 == null) {
				anIntArray197 = new int[anInt764];
			}
			for (@Pc(29) int local29 = 0; local29 < anInt764; local29++) {
				if (aClass44Array1[local29] == null) {
					aClass44Array1[local29] = new Class44();
				}
				aClass44Array1[local29].method518(local8, local29, anInt763);
			}
			if (local8.anInt738 != local8.aByteArray20.length) {
				System.out.println("varptype load mismatch");
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("88455, " + arg0 + ", " + arg1 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XDAGNEWI", name = "<init>", descriptor = "()V")
	private Class44() {
	}

	@OriginalMember(owner = "client!XDAGNEWI", name = "a", descriptor = "(Lclient!WBEWPIXO;II)V")
	private void method518(@OriginalArg(0) Class3_Sub3_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg2 < 6 || arg2 > 6) {
				anInt763 = -498;
			}
			while (true) {
				@Pc(12) int local12 = arg0.method468();
				if (local12 == 0) {
					return;
				}
				if (local12 == 1) {
					this.anInt766 = arg0.method468();
				} else if (local12 == 2) {
					this.anInt767 = arg0.method468();
				} else if (local12 == 3) {
					this.aBoolean172 = true;
					anIntArray197[anInt765++] = arg1;
				} else if (local12 == 4) {
					this.aBoolean173 = false;
				} else if (local12 == 5) {
					this.anInt768 = arg0.method470();
				} else if (local12 == 6) {
					this.aBoolean174 = true;
				} else if (local12 == 7) {
					this.anInt769 = arg0.method473();
				} else if (local12 == 8) {
					this.anInt770 = 1;
					this.aBoolean175 = true;
				} else if (local12 == 10) {
					this.aString16 = arg0.method475();
				} else if (local12 == 11) {
					this.aBoolean175 = true;
				} else if (local12 == 12) {
					this.anInt771 = arg0.method473();
				} else if (local12 == 13) {
					this.anInt770 = 2;
					this.aBoolean175 = true;
				} else if (local12 == 14) {
					this.aBoolean176 = false;
				} else {
					System.out.println("Error unrecognised config code: " + local12);
				}
			}
		} catch (@Pc(150) RuntimeException local150) {
			signlink.reporterror("23247, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local150.toString());
			throw new RuntimeException();
		}
	}
}
