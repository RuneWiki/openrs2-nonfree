import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!RLLHHJLC")
public final class Class30 {

	@OriginalMember(owner = "client!RLLHHJLC", name = "c", descriptor = "I")
	private static int anInt575;

	@OriginalMember(owner = "client!RLLHHJLC", name = "d", descriptor = "[Lclient!RLLHHJLC;")
	public static Class30[] aClass30Array1;

	@OriginalMember(owner = "client!RLLHHJLC", name = "a", descriptor = "I")
	private static int anInt573 = 536;

	@OriginalMember(owner = "client!RLLHHJLC", name = "b", descriptor = "I")
	private static int anInt574 = 3;

	@OriginalMember(owner = "client!RLLHHJLC", name = "e", descriptor = "Ljava/lang/String;")
	private String aString8;

	@OriginalMember(owner = "client!RLLHHJLC", name = "f", descriptor = "I")
	public int anInt576;

	@OriginalMember(owner = "client!RLLHHJLC", name = "g", descriptor = "I")
	public int anInt577;

	@OriginalMember(owner = "client!RLLHHJLC", name = "h", descriptor = "I")
	public int anInt578;

	@OriginalMember(owner = "client!RLLHHJLC", name = "k", descriptor = "I")
	private int anInt580;

	@OriginalMember(owner = "client!RLLHHJLC", name = "i", descriptor = "Z")
	private boolean aBoolean129 = false;

	@OriginalMember(owner = "client!RLLHHJLC", name = "j", descriptor = "I")
	private int anInt579 = -1;

	@OriginalMember(owner = "client!RLLHHJLC", name = "l", descriptor = "Z")
	private boolean aBoolean130 = true;

	@OriginalMember(owner = "client!RLLHHJLC", name = "a", descriptor = "(ILclient!UUIGNTAD;)V")
	public static void method382(@OriginalArg(1) Class38 arg0) {
		try {
			@Pc(10) Class1_Sub1_Sub3 local10 = new Class1_Sub1_Sub3(arg0.method512("varbit.dat", null), anInt573);
			anInt575 = local10.method57();
			if (aClass30Array1 == null) {
				aClass30Array1 = new Class30[anInt575];
			}
			for (@Pc(20) int local20 = 0; local20 < anInt575; local20++) {
				if (aClass30Array1[local20] == null) {
					aClass30Array1[local20] = new Class30();
				}
				aClass30Array1[local20].method383(local10, local20);
				if (aClass30Array1[local20].aBoolean129) {
					Class4.aClass4Array1[aClass30Array1[local20].anInt576].aBoolean13 = true;
				}
			}
			if (anInt574 != 3) {
				for (@Pc(61) int local61 = 1; local61 > 0; local61++) {
				}
			}
			if (local10.anInt78 != local10.aByteArray8.length) {
				System.out.println("varbit load mismatch");
			}
		} catch (@Pc(77) RuntimeException local77) {
			signlink.reporterror("51887, " + 3 + ", " + arg0 + ", " + local77.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RLLHHJLC", name = "<init>", descriptor = "()V")
	private Class30() {
	}

	@OriginalMember(owner = "client!RLLHHJLC", name = "a", descriptor = "(Lclient!CMGGUSPR;II)V")
	private void method383(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			while (true) {
				@Pc(13) int local13 = arg0.method55();
				if (local13 == 0) {
					return;
				}
				if (local13 == 1) {
					this.anInt576 = arg0.method57();
					this.anInt577 = arg0.method55();
					this.anInt578 = arg0.method55();
				} else if (local13 == 10) {
					this.aString8 = arg0.method62();
				} else if (local13 == 2) {
					this.aBoolean129 = true;
				} else if (local13 == 3) {
					this.anInt579 = arg0.method60();
				} else if (local13 == 4) {
					this.anInt580 = arg0.method60();
				} else if (local13 == 5) {
					this.aBoolean130 = false;
				} else {
					System.out.println("Error unrecognised config code: " + local13);
				}
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("79582, " + arg0 + ", " + 527 + ", " + arg1 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}
}
