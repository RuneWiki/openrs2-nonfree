import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!GJIMXWNM")
public final class Class15 {

	@OriginalMember(owner = "client!GJIMXWNM", name = "a", descriptor = "I")
	private static int anInt238;

	@OriginalMember(owner = "client!GJIMXWNM", name = "b", descriptor = "[Lclient!GJIMXWNM;")
	public static Class15[] aClass15Array1;

	@OriginalMember(owner = "client!GJIMXWNM", name = "c", descriptor = "Ljava/lang/String;")
	private String aString3;

	@OriginalMember(owner = "client!GJIMXWNM", name = "d", descriptor = "I")
	public int anInt239;

	@OriginalMember(owner = "client!GJIMXWNM", name = "e", descriptor = "I")
	public int anInt240;

	@OriginalMember(owner = "client!GJIMXWNM", name = "f", descriptor = "I")
	public int anInt241;

	@OriginalMember(owner = "client!GJIMXWNM", name = "i", descriptor = "I")
	private int anInt243;

	@OriginalMember(owner = "client!GJIMXWNM", name = "g", descriptor = "Z")
	private boolean aBoolean71 = false;

	@OriginalMember(owner = "client!GJIMXWNM", name = "h", descriptor = "I")
	private int anInt242 = -1;

	@OriginalMember(owner = "client!GJIMXWNM", name = "j", descriptor = "Z")
	private boolean aBoolean72 = true;

	@OriginalMember(owner = "client!GJIMXWNM", name = "a", descriptor = "(Lclient!FUZJMGZB;I)V")
	public static void method193(@OriginalArg(0) Class13 arg0) {
		try {
			@Pc(8) Class2_Sub1_Sub3 local8 = new Class2_Sub1_Sub3((byte) 114, arg0.method186("varbit.dat", null));
			anInt238 = local8.method269();
			if (aClass15Array1 == null) {
				aClass15Array1 = new Class15[anInt238];
			}
			for (@Pc(22) int local22 = 0; local22 < anInt238; local22++) {
				if (aClass15Array1[local22] == null) {
					aClass15Array1[local22] = new Class15();
				}
				aClass15Array1[local22].method194(local8, local22);
				if (aClass15Array1[local22].aBoolean71) {
					Class23.aClass23Array1[aClass15Array1[local22].anInt239].aBoolean88 = true;
				}
			}
			if (local8.anInt283 != local8.aByteArray7.length) {
				System.out.println("varbit load mismatch");
			}
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("42930, " + arg0 + ", " + 5 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GJIMXWNM", name = "<init>", descriptor = "()V")
	private Class15() {
	}

	@OriginalMember(owner = "client!GJIMXWNM", name = "a", descriptor = "(ZLclient!LBBVYYXO;I)V")
	private void method194(@OriginalArg(1) Class2_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			while (true) {
				@Pc(7) int local7 = arg0.method267();
				if (local7 == 0) {
					return;
				}
				if (local7 == 1) {
					this.anInt239 = arg0.method269();
					this.anInt240 = arg0.method267();
					this.anInt241 = arg0.method267();
				} else if (local7 == 10) {
					this.aString3 = arg0.method274();
				} else if (local7 == 2) {
					this.aBoolean71 = true;
				} else if (local7 == 3) {
					this.anInt242 = arg0.method272();
				} else if (local7 == 4) {
					this.anInt243 = arg0.method272();
				} else if (local7 == 5) {
					this.aBoolean72 = false;
				} else {
					System.out.println("Error unrecognised config code: " + local7);
				}
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("14146, " + false + ", " + arg0 + ", " + arg1 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}
}
