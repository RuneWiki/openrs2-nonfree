import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!QORKDXHW")
public final class Class28 {

	@OriginalMember(owner = "client!QORKDXHW", name = "a", descriptor = "I")
	private static int anInt611;

	@OriginalMember(owner = "client!QORKDXHW", name = "b", descriptor = "[Lclient!QORKDXHW;")
	public static Class28[] aClass28Array1;

	@OriginalMember(owner = "client!QORKDXHW", name = "c", descriptor = "I")
	private static int anInt612;

	@OriginalMember(owner = "client!QORKDXHW", name = "d", descriptor = "[I")
	private static int[] anIntArray143;

	@OriginalMember(owner = "client!QORKDXHW", name = "e", descriptor = "Ljava/lang/String;")
	private String aString14;

	@OriginalMember(owner = "client!QORKDXHW", name = "f", descriptor = "I")
	private int anInt613;

	@OriginalMember(owner = "client!QORKDXHW", name = "g", descriptor = "I")
	private int anInt614;

	@OriginalMember(owner = "client!QORKDXHW", name = "j", descriptor = "I")
	public int anInt615;

	@OriginalMember(owner = "client!QORKDXHW", name = "l", descriptor = "I")
	private int anInt616;

	@OriginalMember(owner = "client!QORKDXHW", name = "m", descriptor = "I")
	private int anInt617;

	@OriginalMember(owner = "client!QORKDXHW", name = "h", descriptor = "Z")
	private boolean aBoolean143 = false;

	@OriginalMember(owner = "client!QORKDXHW", name = "i", descriptor = "Z")
	private boolean aBoolean144 = true;

	@OriginalMember(owner = "client!QORKDXHW", name = "k", descriptor = "Z")
	private boolean aBoolean145 = false;

	@OriginalMember(owner = "client!QORKDXHW", name = "n", descriptor = "Z")
	public boolean aBoolean146 = false;

	@OriginalMember(owner = "client!QORKDXHW", name = "o", descriptor = "I")
	private int anInt618 = -1;

	@OriginalMember(owner = "client!QORKDXHW", name = "p", descriptor = "Z")
	private boolean aBoolean147 = true;

	@OriginalMember(owner = "client!QORKDXHW", name = "a", descriptor = "(Lclient!DTIATKJO;I)V")
	public static void method410(@OriginalArg(0) Class7 arg0) {
		try {
			@Pc(23) Class3_Sub1_Sub2 local23 = new Class3_Sub1_Sub2(-527, arg0.method30("varp.dat", null));
			anInt612 = 0;
			anInt611 = local23.method91();
			if (aClass28Array1 == null) {
				aClass28Array1 = new Class28[anInt611];
			}
			if (anIntArray143 == null) {
				anIntArray143 = new int[anInt611];
			}
			for (@Pc(40) int local40 = 0; local40 < anInt611; local40++) {
				if (aClass28Array1[local40] == null) {
					aClass28Array1[local40] = new Class28();
				}
				aClass28Array1[local40].method411(95, local40, local23);
			}
			if (local23.anInt257 != local23.aByteArray3.length) {
				System.out.println("varptype load mismatch");
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("65256, " + arg0 + ", " + 1 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QORKDXHW", name = "<init>", descriptor = "()V")
	private Class28() {
	}

	@OriginalMember(owner = "client!QORKDXHW", name = "a", descriptor = "(IILclient!GHHPHSRU;)V")
	private void method411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub1_Sub2 arg2) {
		try {
			@Pc(5) boolean local5 = false;
			while (true) {
				@Pc(8) int local8 = arg2.method89();
				if (local8 == 0) {
					return;
				}
				if (local8 == 1) {
					this.anInt613 = arg2.method89();
				} else if (local8 == 2) {
					this.anInt614 = arg2.method89();
				} else if (local8 == 3) {
					this.aBoolean143 = true;
					anIntArray143[anInt612++] = arg1;
				} else if (local8 == 4) {
					this.aBoolean144 = false;
				} else if (local8 == 5) {
					this.anInt615 = arg2.method91();
				} else if (local8 == 6) {
					this.aBoolean145 = true;
				} else if (local8 == 7) {
					this.anInt616 = arg2.method94();
				} else if (local8 == 8) {
					this.anInt617 = 1;
					this.aBoolean146 = true;
				} else if (local8 == 10) {
					this.aString14 = arg2.method96();
				} else if (local8 == 11) {
					this.aBoolean146 = true;
				} else if (local8 == 12) {
					this.anInt618 = arg2.method94();
				} else if (local8 == 13) {
					this.anInt617 = 2;
					this.aBoolean146 = true;
				} else if (local8 == 14) {
					this.aBoolean147 = false;
				} else {
					System.out.println("Error unrecognised config code: " + local8);
				}
			}
		} catch (@Pc(146) RuntimeException local146) {
			signlink.reporterror("13906, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local146.toString());
			throw new RuntimeException();
		}
	}
}
