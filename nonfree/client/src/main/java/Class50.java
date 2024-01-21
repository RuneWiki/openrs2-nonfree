import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ZQTIEXZH")
public final class Class50 {

	@OriginalMember(owner = "client!ZQTIEXZH", name = "b", descriptor = "I")
	private static int anInt799;

	@OriginalMember(owner = "client!ZQTIEXZH", name = "c", descriptor = "[Lclient!ZQTIEXZH;")
	public static Class50[] aClass50Array1;

	@OriginalMember(owner = "client!ZQTIEXZH", name = "a", descriptor = "I")
	private int anInt798;

	@OriginalMember(owner = "client!ZQTIEXZH", name = "d", descriptor = "Ljava/lang/String;")
	private String aString16;

	@OriginalMember(owner = "client!ZQTIEXZH", name = "e", descriptor = "I")
	public int anInt800;

	@OriginalMember(owner = "client!ZQTIEXZH", name = "f", descriptor = "I")
	public int anInt801;

	@OriginalMember(owner = "client!ZQTIEXZH", name = "g", descriptor = "I")
	public int anInt802;

	@OriginalMember(owner = "client!ZQTIEXZH", name = "j", descriptor = "I")
	private int anInt804;

	@OriginalMember(owner = "client!ZQTIEXZH", name = "h", descriptor = "Z")
	private boolean aBoolean209 = false;

	@OriginalMember(owner = "client!ZQTIEXZH", name = "i", descriptor = "I")
	private int anInt803 = -1;

	@OriginalMember(owner = "client!ZQTIEXZH", name = "k", descriptor = "Z")
	private boolean aBoolean210 = true;

	@OriginalMember(owner = "client!ZQTIEXZH", name = "a", descriptor = "(Lclient!ATJMVOZR;I)V")
	public static void method574(@OriginalArg(0) Class2 arg0) {
		try {
			@Pc(8) Class10_Sub1_Sub3 local8 = new Class10_Sub1_Sub3(true, arg0.method2("varbit.dat", null));
			anInt799 = local8.method313();
			if (aClass50Array1 == null) {
				aClass50Array1 = new Class50[anInt799];
			}
			for (@Pc(22) int local22 = 0; local22 < anInt799; local22++) {
				if (aClass50Array1[local22] == null) {
					aClass50Array1[local22] = new Class50();
				}
				aClass50Array1[local22].method575(local22, local8);
				if (aClass50Array1[local22].aBoolean209) {
					Class44.aClass44Array1[aClass50Array1[local22].anInt800].aBoolean150 = true;
				}
			}
			if (local8.anInt428 != local8.aByteArray12.length) {
				System.out.println("varbit load mismatch");
			}
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("77123, " + arg0 + ", " + 36135 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZQTIEXZH", name = "<init>", descriptor = "()V")
	private Class50() {
	}

	@OriginalMember(owner = "client!ZQTIEXZH", name = "a", descriptor = "(IILclient!MFMVIYHT;)V")
	private void method575(@OriginalArg(1) int arg0, @OriginalArg(2) Class10_Sub1_Sub3 arg1) {
		try {
			while (true) {
				@Pc(9) int local9 = arg1.method311();
				if (local9 == 0) {
					return;
				}
				if (local9 == 1) {
					this.anInt800 = arg1.method313();
					this.anInt801 = arg1.method311();
					this.anInt802 = arg1.method311();
				} else if (local9 == 10) {
					this.aString16 = arg1.method318();
				} else if (local9 == 2) {
					this.aBoolean209 = true;
				} else if (local9 == 3) {
					this.anInt803 = arg1.method316();
				} else if (local9 == 4) {
					this.anInt804 = arg1.method316();
				} else if (local9 == 5) {
					this.aBoolean210 = false;
				} else {
					System.out.println("Error unrecognised config code: " + local9);
				}
			}
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("90774, " + -954 + ", " + arg0 + ", " + arg1 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}
}
