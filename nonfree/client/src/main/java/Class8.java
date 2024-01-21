import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!DDXRHBHP")
public final class Class8 {

	@OriginalMember(owner = "client!DDXRHBHP", name = "b", descriptor = "I")
	private static int anInt202;

	@OriginalMember(owner = "client!DDXRHBHP", name = "c", descriptor = "[Lclient!DDXRHBHP;")
	public static Class8[] aClass8Array1;

	@OriginalMember(owner = "client!DDXRHBHP", name = "d", descriptor = "Ljava/lang/String;")
	private String aString3;

	@OriginalMember(owner = "client!DDXRHBHP", name = "e", descriptor = "I")
	public int anInt203;

	@OriginalMember(owner = "client!DDXRHBHP", name = "f", descriptor = "I")
	public int anInt204;

	@OriginalMember(owner = "client!DDXRHBHP", name = "g", descriptor = "I")
	public int anInt205;

	@OriginalMember(owner = "client!DDXRHBHP", name = "j", descriptor = "I")
	private int anInt207;

	@OriginalMember(owner = "client!DDXRHBHP", name = "a", descriptor = "Z")
	private boolean aBoolean52 = true;

	@OriginalMember(owner = "client!DDXRHBHP", name = "h", descriptor = "Z")
	private boolean aBoolean53 = false;

	@OriginalMember(owner = "client!DDXRHBHP", name = "i", descriptor = "I")
	private int anInt206 = -1;

	@OriginalMember(owner = "client!DDXRHBHP", name = "k", descriptor = "Z")
	private boolean aBoolean54 = true;

	@OriginalMember(owner = "client!DDXRHBHP", name = "a", descriptor = "(Lclient!VSUYIIVA;I)V")
	public static void method150(@OriginalArg(0) Class42 arg0) {
		try {
			@Pc(19) Class1_Sub1_Sub2 local19 = new Class1_Sub1_Sub2(arg0.method539("varbit.dat", null), 792);
			anInt202 = local19.method61();
			if (aClass8Array1 == null) {
				aClass8Array1 = new Class8[anInt202];
			}
			for (@Pc(29) int local29 = 0; local29 < anInt202; local29++) {
				if (aClass8Array1[local29] == null) {
					aClass8Array1[local29] = new Class8();
				}
				aClass8Array1[local29].method151(local29, local19);
				if (aClass8Array1[local29].aBoolean53) {
					Class33.aClass33Array1[aClass8Array1[local29].anInt203].aBoolean163 = true;
				}
			}
			if (local19.anInt153 != local19.aByteArray1.length) {
				System.out.println("varbit load mismatch");
			}
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("53156, " + arg0 + ", " + 236 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DDXRHBHP", name = "<init>", descriptor = "()V")
	private Class8() {
	}

	@OriginalMember(owner = "client!DDXRHBHP", name = "a", descriptor = "(IBLclient!CFARFRSG;)V")
	private void method151(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub2 arg1) {
		try {
			while (true) {
				@Pc(15) int local15 = arg1.method59();
				if (local15 == 0) {
					return;
				}
				if (local15 == 1) {
					this.anInt203 = arg1.method61();
					this.anInt204 = arg1.method59();
					this.anInt205 = arg1.method59();
				} else if (local15 == 10) {
					this.aString3 = arg1.method66();
				} else if (local15 == 2) {
					this.aBoolean53 = true;
				} else if (local15 == 3) {
					this.anInt206 = arg1.method64();
				} else if (local15 == 4) {
					this.anInt207 = arg1.method64();
				} else if (local15 == 5) {
					this.aBoolean54 = false;
				} else {
					System.out.println("Error unrecognised config code: " + local15);
				}
			}
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("26465, " + arg0 + ", " + 5 + ", " + arg1 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}
}
