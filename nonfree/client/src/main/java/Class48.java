import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ZWNTUTST")
public final class Class48 {

	@OriginalMember(owner = "client!ZWNTUTST", name = "a", descriptor = "I")
	private static int anInt808;

	@OriginalMember(owner = "client!ZWNTUTST", name = "b", descriptor = "[Lclient!ZWNTUTST;")
	public static Class48[] aClass48Array1;

	@OriginalMember(owner = "client!ZWNTUTST", name = "c", descriptor = "I")
	private static int anInt809;

	@OriginalMember(owner = "client!ZWNTUTST", name = "d", descriptor = "[I")
	private static int[] anIntArray191;

	@OriginalMember(owner = "client!ZWNTUTST", name = "e", descriptor = "Ljava/lang/String;")
	private String aString16;

	@OriginalMember(owner = "client!ZWNTUTST", name = "f", descriptor = "I")
	private int anInt810;

	@OriginalMember(owner = "client!ZWNTUTST", name = "g", descriptor = "I")
	private int anInt811;

	@OriginalMember(owner = "client!ZWNTUTST", name = "j", descriptor = "I")
	public int anInt812;

	@OriginalMember(owner = "client!ZWNTUTST", name = "l", descriptor = "I")
	private int anInt813;

	@OriginalMember(owner = "client!ZWNTUTST", name = "m", descriptor = "I")
	private int anInt814;

	@OriginalMember(owner = "client!ZWNTUTST", name = "h", descriptor = "Z")
	private boolean aBoolean205 = false;

	@OriginalMember(owner = "client!ZWNTUTST", name = "i", descriptor = "Z")
	private boolean aBoolean206 = true;

	@OriginalMember(owner = "client!ZWNTUTST", name = "k", descriptor = "Z")
	private boolean aBoolean207 = false;

	@OriginalMember(owner = "client!ZWNTUTST", name = "n", descriptor = "Z")
	public boolean aBoolean208 = false;

	@OriginalMember(owner = "client!ZWNTUTST", name = "o", descriptor = "I")
	private int anInt815 = -1;

	@OriginalMember(owner = "client!ZWNTUTST", name = "p", descriptor = "Z")
	private boolean aBoolean209 = true;

	@OriginalMember(owner = "client!ZWNTUTST", name = "a", descriptor = "(ILclient!QDHHNYHL;)V")
	public static void method568(@OriginalArg(1) Class32 arg0) {
		try {
			@Pc(10) Class4_Sub1_Sub4 local10 = new Class4_Sub1_Sub4(5, arg0.method426("varp.dat", null));
			anInt809 = 0;
			anInt808 = local10.method357();
			if (aClass48Array1 == null) {
				aClass48Array1 = new Class48[anInt808];
			}
			if (anIntArray191 == null) {
				anIntArray191 = new int[anInt808];
			}
			for (@Pc(27) int local27 = 0; local27 < anInt808; local27++) {
				if (aClass48Array1[local27] == null) {
					aClass48Array1[local27] = new Class48();
				}
				aClass48Array1[local27].method569(local10, local27);
			}
			if (local10.anInt506 != local10.aByteArray10.length) {
				System.out.println("varptype load mismatch");
			}
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("37945, " + 0 + ", " + arg0 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZWNTUTST", name = "<init>", descriptor = "()V")
	private Class48() {
	}

	@OriginalMember(owner = "client!ZWNTUTST", name = "a", descriptor = "(BLclient!PGNBHFUF;I)V")
	private void method569(@OriginalArg(1) Class4_Sub1_Sub4 arg0, @OriginalArg(2) int arg1) {
		try {
			while (true) {
				@Pc(8) int local8 = arg0.method355();
				if (local8 == 0) {
					return;
				}
				if (local8 == 1) {
					this.anInt810 = arg0.method355();
				} else if (local8 == 2) {
					this.anInt811 = arg0.method355();
				} else if (local8 == 3) {
					this.aBoolean205 = true;
					anIntArray191[anInt809++] = arg1;
				} else if (local8 == 4) {
					this.aBoolean206 = false;
				} else if (local8 == 5) {
					this.anInt812 = arg0.method357();
				} else if (local8 == 6) {
					this.aBoolean207 = true;
				} else if (local8 == 7) {
					this.anInt813 = arg0.method360();
				} else if (local8 == 8) {
					this.anInt814 = 1;
					this.aBoolean208 = true;
				} else if (local8 == 10) {
					this.aString16 = arg0.method362();
				} else if (local8 == 11) {
					this.aBoolean208 = true;
				} else if (local8 == 12) {
					this.anInt815 = arg0.method360();
				} else if (local8 == 13) {
					this.anInt814 = 2;
					this.aBoolean208 = true;
				} else if (local8 == 14) {
					this.aBoolean209 = false;
				} else {
					System.out.println("Error unrecognised config code: " + local8);
				}
			}
		} catch (@Pc(146) RuntimeException local146) {
			signlink.reporterror("22544, " + 8 + ", " + arg0 + ", " + arg1 + ", " + local146.toString());
			throw new RuntimeException();
		}
	}
}
