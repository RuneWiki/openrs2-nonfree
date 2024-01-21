import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hc")
public final class Class15 {

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
	private static int anInt355;

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "[Lclient!hc;")
	public static Class15[] aClass15Array1;

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
	private static int anInt356;

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "[I")
	private static int[] anIntArray152;

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "Ljava/lang/String;")
	private String aString21;

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
	private int anInt357;

	@OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
	private int anInt358;

	@OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
	public int anInt359;

	@OriginalMember(owner = "client!hc", name = "h", descriptor = "Z")
	private boolean aBoolean88 = false;

	@OriginalMember(owner = "client!hc", name = "i", descriptor = "Z")
	private boolean aBoolean89 = true;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!tb;I)V")
	public static void method262(@OriginalArg(0) Class34 arg0) {
		@Pc(13) Class1_Sub3_Sub3 local13 = new Class1_Sub3_Sub3(arg0.method428(null, "varp.dat"), (byte) 63);
		anInt356 = 0;
		anInt355 = local13.method333();
		if (aClass15Array1 == null) {
			aClass15Array1 = new Class15[anInt355];
		}
		if (anIntArray152 == null) {
			anIntArray152 = new int[anInt355];
		}
		for (@Pc(30) int local30 = 0; local30 < anInt355; local30++) {
			if (aClass15Array1[local30] == null) {
				aClass15Array1[local30] = new Class15();
			}
			aClass15Array1[local30].method263(local13, local30);
		}
	}

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "()V")
	private Class15() {
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!jb;II)V")
	private void method263(@OriginalArg(0) Class1_Sub3_Sub3 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(7) int local7 = arg0.method331();
			if (local7 == 0) {
				return;
			}
			if (local7 == 1) {
				this.anInt357 = arg0.method331();
			} else if (local7 == 2) {
				this.anInt358 = arg0.method331();
			} else if (local7 == 3) {
				this.aBoolean88 = true;
				anIntArray152[anInt356++] = arg1;
			} else if (local7 == 4) {
				this.aBoolean89 = false;
			} else if (local7 == 5) {
				this.anInt359 = arg0.method333();
			} else if (local7 == 10) {
				this.aString21 = arg0.method338();
			} else {
				System.out.println("Error unrecognised config code: " + local7);
			}
		}
	}
}
