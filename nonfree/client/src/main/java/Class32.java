import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!pc")
public final class Class32 {

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
	private static int anInt856;

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "[Lclient!pc;")
	public static Class32[] aClass32Array1;

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
	private static int anInt857;

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "[I")
	private static int[] anIntArray232;

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "Ljava/lang/String;")
	private String aString28;

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
	private int anInt858;

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
	private int anInt859;

	@OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
	public int anInt860;

	@OriginalMember(owner = "client!pc", name = "l", descriptor = "I")
	private int anInt861;

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "Z")
	private boolean aBoolean190 = false;

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "Z")
	private boolean aBoolean191 = true;

	@OriginalMember(owner = "client!pc", name = "k", descriptor = "Z")
	private boolean aBoolean192 = false;

	@OriginalMember(owner = "client!pc", name = "m", descriptor = "Z")
	private boolean aBoolean193 = false;

	@OriginalMember(owner = "client!pc", name = "n", descriptor = "Z")
	private boolean aBoolean194 = false;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILclient!yb;)V")
	public static void method529(@OriginalArg(0) int arg0, @OriginalArg(1) Class46 arg1) {
		try {
			if (arg0 < 3 || arg0 > 3) {
				for (@Pc(9) int local9 = 1; local9 > 0; local9++) {
				}
			}
			@Pc(23) Class1_Sub1_Sub3 local23 = new Class1_Sub1_Sub3(arg1.method674("varp.dat", null), false);
			anInt857 = 0;
			anInt856 = local23.method498();
			if (aClass32Array1 == null) {
				aClass32Array1 = new Class32[anInt856];
			}
			if (anIntArray232 == null) {
				anIntArray232 = new int[anInt856];
			}
			for (@Pc(40) int local40 = 0; local40 < anInt856; local40++) {
				if (aClass32Array1[local40] == null) {
					aClass32Array1[local40] = new Class32();
				}
				aClass32Array1[local40].method530(local23, local40);
			}
			if (local23.anInt778 != local23.aByteArray9.length) {
				System.out.println("varptype load mismatch");
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("4382, " + arg0 + ", " + arg1 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "()V")
	private Class32() {
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(BLclient!mb;I)V")
	private void method530(@OriginalArg(1) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			while (true) {
				@Pc(13) int local13 = arg0.method496();
				if (local13 == 0) {
					return;
				}
				if (local13 == 1) {
					this.anInt858 = arg0.method496();
				} else if (local13 == 2) {
					this.anInt859 = arg0.method496();
				} else if (local13 == 3) {
					this.aBoolean190 = true;
					anIntArray232[anInt857++] = arg1;
				} else if (local13 == 4) {
					this.aBoolean191 = false;
				} else if (local13 == 5) {
					this.anInt860 = arg0.method498();
				} else if (local13 == 6) {
					this.aBoolean192 = true;
				} else if (local13 == 7) {
					this.anInt861 = arg0.method501();
				} else if (local13 == 8) {
					this.aBoolean193 = true;
					this.aBoolean194 = true;
				} else if (local13 == 10) {
					this.aString28 = arg0.method503();
				} else if (local13 == 11) {
					this.aBoolean194 = true;
				} else {
					System.out.println("Error unrecognised config code: " + local13);
				}
			}
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("33527, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local123.toString());
			throw new RuntimeException();
		}
	}
}
