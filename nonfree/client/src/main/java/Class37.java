import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!TGYZPJQJ")
public final class Class37 {

	@OriginalMember(owner = "client!TGYZPJQJ", name = "a", descriptor = "Z")
	private static boolean aBoolean150;

	@OriginalMember(owner = "client!TGYZPJQJ", name = "d", descriptor = "I")
	private static int anInt616;

	@OriginalMember(owner = "client!TGYZPJQJ", name = "e", descriptor = "[Lclient!TGYZPJQJ;")
	public static Class37[] aClass37Array1;

	@OriginalMember(owner = "client!TGYZPJQJ", name = "q", descriptor = "Lclient!ACKKZISC;")
	public static Class1 aClass1_7 = new Class1(false, 30);

	@OriginalMember(owner = "client!TGYZPJQJ", name = "b", descriptor = "I")
	private int anInt614;

	@OriginalMember(owner = "client!TGYZPJQJ", name = "c", descriptor = "I")
	private int anInt615;

	@OriginalMember(owner = "client!TGYZPJQJ", name = "f", descriptor = "I")
	private int anInt617;

	@OriginalMember(owner = "client!TGYZPJQJ", name = "g", descriptor = "I")
	private int anInt618;

	@OriginalMember(owner = "client!TGYZPJQJ", name = "i", descriptor = "Lclient!LZZHVUJR;")
	public Class23 aClass23_2;

	@OriginalMember(owner = "client!TGYZPJQJ", name = "n", descriptor = "I")
	public int anInt622;

	@OriginalMember(owner = "client!TGYZPJQJ", name = "o", descriptor = "I")
	public int anInt623;

	@OriginalMember(owner = "client!TGYZPJQJ", name = "p", descriptor = "I")
	public int anInt624;

	@OriginalMember(owner = "client!TGYZPJQJ", name = "h", descriptor = "I")
	private int anInt619 = -1;

	@OriginalMember(owner = "client!TGYZPJQJ", name = "j", descriptor = "[I")
	private int[] anIntArray123 = new int[6];

	@OriginalMember(owner = "client!TGYZPJQJ", name = "k", descriptor = "[I")
	private int[] anIntArray124 = new int[6];

	@OriginalMember(owner = "client!TGYZPJQJ", name = "l", descriptor = "I")
	public int anInt620 = 128;

	@OriginalMember(owner = "client!TGYZPJQJ", name = "m", descriptor = "I")
	public int anInt621 = 128;

	@OriginalMember(owner = "client!TGYZPJQJ", name = "a", descriptor = "(ZLclient!FXNTEMPE;)V")
	public static void method395(@OriginalArg(1) Class13 arg0) {
		try {
			@Pc(8) Class2_Sub1_Sub4 local8 = new Class2_Sub1_Sub4(arg0.method117("spotanim.dat", null), -46859);
			anInt616 = local8.method342();
			if (aClass37Array1 == null) {
				aClass37Array1 = new Class37[anInt616];
			}
			for (@Pc(26) int local26 = 0; local26 < anInt616; local26++) {
				if (aClass37Array1[local26] == null) {
					aClass37Array1[local26] = new Class37();
				}
				aClass37Array1[local26].anInt617 = local26;
				aClass37Array1[local26].method396(local8);
			}
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("14344, " + true + ", " + arg0 + ", " + local55.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TGYZPJQJ", name = "<init>", descriptor = "()V")
	private Class37() {
	}

	@OriginalMember(owner = "client!TGYZPJQJ", name = "a", descriptor = "(Lclient!RSWRPCHR;B)V")
	private void method396(@OriginalArg(0) Class2_Sub1_Sub4 arg0) {
		try {
			while (true) {
				@Pc(10) int local10 = arg0.method340();
				if (local10 == 0) {
					return;
				}
				if (local10 == 1) {
					this.anInt618 = arg0.method342();
				} else if (local10 == 2) {
					this.anInt619 = arg0.method342();
					if (Class23.aClass23Array1 != null) {
						this.aClass23_2 = Class23.aClass23Array1[this.anInt619];
					}
				} else if (local10 == 4) {
					this.anInt620 = arg0.method342();
				} else if (local10 == 5) {
					this.anInt621 = arg0.method342();
				} else if (local10 == 6) {
					this.anInt622 = arg0.method342();
				} else if (local10 == 7) {
					this.anInt623 = arg0.method340();
				} else if (local10 == 8) {
					this.anInt624 = arg0.method340();
				} else if (local10 >= 40 && local10 < 50) {
					this.anIntArray123[local10 - 40] = arg0.method342();
				} else if (local10 >= 50 && local10 < 60) {
					this.anIntArray124[local10 - 50] = arg0.method342();
				} else {
					System.out.println("Error unrecognised spotanim config code: " + local10);
				}
			}
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("28861, " + arg0 + ", " + 46 + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TGYZPJQJ", name = "a", descriptor = "()Lclient!WRJMHIDY;")
	public Class2_Sub1_Sub3_Sub5 method397() {
		@Pc(6) Class2_Sub1_Sub3_Sub5 local6 = (Class2_Sub1_Sub3_Sub5) aClass1_7.method1((long) this.anInt617);
		if (local6 != null) {
			return local6;
		}
		local6 = Class2_Sub1_Sub3_Sub5.method423(this.anInt618);
		if (local6 == null) {
			return null;
		}
		for (@Pc(20) int local20 = 0; local20 < 6; local20++) {
			if (this.anIntArray123[0] != 0) {
				local6.method437(this.anIntArray123[local20], this.anIntArray124[local20]);
			}
		}
		aClass1_7.method2(this.anInt614, (long) this.anInt617, local6);
		return local6;
	}
}
