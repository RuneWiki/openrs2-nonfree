import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!OHEMVFER")
public final class Class28 {

	@OriginalMember(owner = "client!OHEMVFER", name = "b", descriptor = "I")
	private static int anInt471;

	@OriginalMember(owner = "client!OHEMVFER", name = "c", descriptor = "[Lclient!OHEMVFER;")
	public static Class28[] aClass28Array1;

	@OriginalMember(owner = "client!OHEMVFER", name = "d", descriptor = "Ljava/lang/String;")
	private String aString13;

	@OriginalMember(owner = "client!OHEMVFER", name = "e", descriptor = "I")
	public int anInt472;

	@OriginalMember(owner = "client!OHEMVFER", name = "f", descriptor = "I")
	public int anInt473;

	@OriginalMember(owner = "client!OHEMVFER", name = "g", descriptor = "I")
	public int anInt474;

	@OriginalMember(owner = "client!OHEMVFER", name = "j", descriptor = "I")
	private int anInt476;

	@OriginalMember(owner = "client!OHEMVFER", name = "a", descriptor = "I")
	private int anInt470 = 3;

	@OriginalMember(owner = "client!OHEMVFER", name = "h", descriptor = "Z")
	private boolean aBoolean129 = false;

	@OriginalMember(owner = "client!OHEMVFER", name = "i", descriptor = "I")
	private int anInt475 = -1;

	@OriginalMember(owner = "client!OHEMVFER", name = "k", descriptor = "Z")
	private boolean aBoolean130 = true;

	@OriginalMember(owner = "client!OHEMVFER", name = "a", descriptor = "(ILclient!INOFEYKQ;)V")
	public static void method332(@OriginalArg(1) Class14 arg0) {
		try {
			@Pc(15) Class3_Sub1_Sub3 local15 = new Class3_Sub1_Sub3((byte) -103, arg0.method202("varbit.dat", (byte[]) null));
			anInt471 = local15.method276();
			if (aClass28Array1 == null) {
				aClass28Array1 = new Class28[anInt471];
			}
			for (@Pc(25) int local25 = 0; local25 < anInt471; local25++) {
				if (aClass28Array1[local25] == null) {
					aClass28Array1[local25] = new Class28();
				}
				aClass28Array1[local25].method333(local15, local25);
				if (aClass28Array1[local25].aBoolean129) {
					Class24.aClass24Array1[aClass28Array1[local25].anInt472].aBoolean105 = true;
				}
			}
			if (local15.anInt441 != local15.aByteArray5.length) {
				System.out.println("varbit load mismatch");
			}
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("53592, " + -351 + ", " + arg0 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OHEMVFER", name = "<init>", descriptor = "()V")
	private Class28() {
	}

	@OriginalMember(owner = "client!OHEMVFER", name = "a", descriptor = "(ILclient!NHEPCMLW;I)V")
	private void method333(@OriginalArg(1) Class3_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			while (true) {
				@Pc(9) int local9 = arg0.method274();
				if (local9 == 0) {
					return;
				}
				if (local9 == 1) {
					this.anInt472 = arg0.method276();
					this.anInt473 = arg0.method274();
					this.anInt474 = arg0.method274();
				} else if (local9 == 10) {
					this.aString13 = arg0.method281();
				} else if (local9 == 2) {
					this.aBoolean129 = true;
				} else if (local9 == 3) {
					this.anInt475 = arg0.method279();
				} else if (local9 == 4) {
					this.anInt476 = arg0.method279();
				} else if (local9 == 5) {
					this.aBoolean130 = false;
				} else {
					System.out.println("Error unrecognised config code: " + local9);
				}
			}
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("83158, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}
}
