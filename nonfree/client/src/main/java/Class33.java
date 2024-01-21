import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!QMAVGSSV")
public final class Class33 {

	@OriginalMember(owner = "client!QMAVGSSV", name = "a", descriptor = "I")
	private static int anInt642;

	@OriginalMember(owner = "client!QMAVGSSV", name = "b", descriptor = "[Lclient!QMAVGSSV;")
	public static Class33[] aClass33Array1;

	@OriginalMember(owner = "client!QMAVGSSV", name = "c", descriptor = "Ljava/lang/String;")
	private String aString14;

	@OriginalMember(owner = "client!QMAVGSSV", name = "d", descriptor = "I")
	public int anInt643;

	@OriginalMember(owner = "client!QMAVGSSV", name = "e", descriptor = "I")
	public int anInt644;

	@OriginalMember(owner = "client!QMAVGSSV", name = "f", descriptor = "I")
	public int anInt645;

	@OriginalMember(owner = "client!QMAVGSSV", name = "i", descriptor = "I")
	private int anInt647;

	@OriginalMember(owner = "client!QMAVGSSV", name = "g", descriptor = "Z")
	private boolean aBoolean132 = false;

	@OriginalMember(owner = "client!QMAVGSSV", name = "h", descriptor = "I")
	private int anInt646 = -1;

	@OriginalMember(owner = "client!QMAVGSSV", name = "j", descriptor = "Z")
	private boolean aBoolean133 = true;

	@OriginalMember(owner = "client!QMAVGSSV", name = "a", descriptor = "(BLclient!IEMHZJLX;)V")
	public static void method434(@OriginalArg(1) Class15 arg0) {
		try {
			@Pc(10) Class1_Sub1_Sub4 local10 = new Class1_Sub1_Sub4(0, arg0.method181("varbit.dat", null));
			anInt642 = local10.method296();
			if (aClass33Array1 == null) {
				aClass33Array1 = new Class33[anInt642];
			}
			for (@Pc(20) int local20 = 0; local20 < anInt642; local20++) {
				if (aClass33Array1[local20] == null) {
					aClass33Array1[local20] = new Class33();
				}
				aClass33Array1[local20].method435(local20, local10, (byte) 1);
				if (aClass33Array1[local20].aBoolean132) {
					Class36.aClass36Array1[aClass33Array1[local20].anInt643].aBoolean140 = true;
				}
			}
			if (local10.anInt529 != local10.aByteArray14.length) {
				System.out.println("varbit load mismatch");
			}
		} catch (@Pc(77) RuntimeException local77) {
			signlink.reporterror("48707, " + 8 + ", " + arg0 + ", " + local77.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QMAVGSSV", name = "<init>", descriptor = "()V")
	private Class33() {
	}

	@OriginalMember(owner = "client!QMAVGSSV", name = "a", descriptor = "(ILclient!MVHXDWGI;B)V")
	private void method435(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub4 arg1, @OriginalArg(2) byte arg2) {
		try {
			@Pc(6) boolean local6 = false;
			while (true) {
				@Pc(12) int local12 = arg1.method294();
				if (local12 == 0) {
					return;
				}
				if (local12 == 1) {
					this.anInt643 = arg1.method296();
					this.anInt644 = arg1.method294();
					this.anInt645 = arg1.method294();
				} else if (local12 == 10) {
					this.aString14 = arg1.method301();
				} else if (local12 == 2) {
					this.aBoolean132 = true;
				} else if (local12 == 3) {
					this.anInt646 = arg1.method299();
				} else if (local12 == 4) {
					this.anInt647 = arg1.method299();
				} else if (local12 == 5) {
					this.aBoolean133 = false;
				} else {
					System.out.println("Error unrecognised config code: " + local12);
				}
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("14652, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}
}
