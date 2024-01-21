import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!BVXCTZVJ")
public final class Class5 {

	@OriginalMember(owner = "client!BVXCTZVJ", name = "a", descriptor = "I")
	private static int anInt217;

	@OriginalMember(owner = "client!BVXCTZVJ", name = "b", descriptor = "[Lclient!BVXCTZVJ;")
	public static Class5[] aClass5Array1;

	@OriginalMember(owner = "client!BVXCTZVJ", name = "c", descriptor = "Ljava/lang/String;")
	private String aString4;

	@OriginalMember(owner = "client!BVXCTZVJ", name = "d", descriptor = "I")
	public int anInt218;

	@OriginalMember(owner = "client!BVXCTZVJ", name = "e", descriptor = "I")
	public int anInt219;

	@OriginalMember(owner = "client!BVXCTZVJ", name = "f", descriptor = "I")
	public int anInt220;

	@OriginalMember(owner = "client!BVXCTZVJ", name = "i", descriptor = "I")
	private int anInt222;

	@OriginalMember(owner = "client!BVXCTZVJ", name = "g", descriptor = "Z")
	private boolean aBoolean36 = false;

	@OriginalMember(owner = "client!BVXCTZVJ", name = "h", descriptor = "I")
	private int anInt221 = -1;

	@OriginalMember(owner = "client!BVXCTZVJ", name = "j", descriptor = "Z")
	private boolean aBoolean37 = true;

	@OriginalMember(owner = "client!BVXCTZVJ", name = "a", descriptor = "(Lclient!HBJEXSJX;Z)V")
	public static void method91(@OriginalArg(0) Class13 arg0) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3(arg0.method278("varbit.dat", null), 0);
			anInt217 = local8.method157();
			if (aClass5Array1 == null) {
				aClass5Array1 = new Class5[anInt217];
			}
			for (@Pc(21) int local21 = 0; local21 < anInt217; local21++) {
				if (aClass5Array1[local21] == null) {
					aClass5Array1[local21] = new Class5();
				}
				aClass5Array1[local21].method92(local21, local8);
				if (aClass5Array1[local21].aBoolean36) {
					Class34.aClass34Array1[aClass5Array1[local21].anInt218].aBoolean141 = true;
				}
			}
			if (local8.anInt301 != local8.aByteArray2.length) {
				System.out.println("varbit load mismatch");
			}
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("35621, " + arg0 + ", " + true + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BVXCTZVJ", name = "<init>", descriptor = "()V")
	private Class5() {
	}

	@OriginalMember(owner = "client!BVXCTZVJ", name = "a", descriptor = "(ILclient!EYMNCFMK;I)V")
	private void method92(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			while (true) {
				@Pc(8) int local8 = arg1.method155();
				if (local8 == 0) {
					return;
				}
				if (local8 == 1) {
					this.anInt218 = arg1.method157();
					this.anInt219 = arg1.method155();
					this.anInt220 = arg1.method155();
				} else if (local8 == 10) {
					this.aString4 = arg1.method162();
				} else if (local8 == 2) {
					this.aBoolean36 = true;
				} else if (local8 == 3) {
					this.anInt221 = arg1.method160();
				} else if (local8 == 4) {
					this.anInt222 = arg1.method160();
				} else if (local8 == 5) {
					this.aBoolean37 = false;
				} else {
					System.out.println("Error unrecognised config code: " + local8);
				}
			}
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("20976, " + arg0 + ", " + arg1 + ", " + 24145 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}
}
