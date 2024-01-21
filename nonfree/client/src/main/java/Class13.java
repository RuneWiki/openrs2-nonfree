import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gc")
public final class Class13 {

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "Z")
	private static boolean aBoolean81;

	@OriginalMember(owner = "client!gc", name = "b", descriptor = "Z")
	private static boolean aBoolean82;

	@OriginalMember(owner = "client!gc", name = "d", descriptor = "I")
	private static int anInt328;

	@OriginalMember(owner = "client!gc", name = "e", descriptor = "[Lclient!gc;")
	public static Class13[] aClass13Array1;

	@OriginalMember(owner = "client!gc", name = "c", descriptor = "B")
	private static byte aByte16 = 2;

	@OriginalMember(owner = "client!gc", name = "l", descriptor = "Lclient!r;")
	public static Class30 aClass30_3 = new Class30(-947, 30);

	@OriginalMember(owner = "client!gc", name = "f", descriptor = "I")
	private int anInt329;

	@OriginalMember(owner = "client!gc", name = "g", descriptor = "I")
	private int anInt330;

	@OriginalMember(owner = "client!gc", name = "h", descriptor = "Lclient!fc;")
	public Class11 aClass11_1;

	@OriginalMember(owner = "client!gc", name = "i", descriptor = "Z")
	public boolean aBoolean83 = false;

	@OriginalMember(owner = "client!gc", name = "j", descriptor = "[I")
	private int[] anIntArray130 = new int[6];

	@OriginalMember(owner = "client!gc", name = "k", descriptor = "[I")
	private int[] anIntArray131 = new int[6];

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(Lclient!tb;I)V")
	public static void method243(@OriginalArg(0) Class34 arg0) {
		@Pc(9) Class1_Sub3_Sub3 local9 = new Class1_Sub3_Sub3(arg0.method428(null, "spotanim.dat"), (byte) 63);
		anInt328 = local9.method333();
		if (aClass13Array1 == null) {
			aClass13Array1 = new Class13[anInt328];
		}
		for (@Pc(19) int local19 = 0; local19 < anInt328; local19++) {
			if (aClass13Array1[local19] == null) {
				aClass13Array1[local19] = new Class13();
			}
			aClass13Array1[local19].anInt329 = local19;
			aClass13Array1[local19].method244(local9);
		}
	}

	@OriginalMember(owner = "client!gc", name = "<init>", descriptor = "()V")
	private Class13() {
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(BLclient!jb;)V")
	private void method244(@OriginalArg(1) Class1_Sub3_Sub3 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method331();
			if (local15 == 0) {
				return;
			}
			if (local15 == 1) {
				this.anInt330 = arg0.method333();
			} else if (local15 == 2) {
				this.aClass11_1 = Class11.aClass11Array1[arg0.method333()];
			} else if (local15 == 3) {
				this.aBoolean83 = true;
			} else if (local15 >= 40 && local15 < 50) {
				this.anIntArray130[local15 - 40] = arg0.method333();
			} else if (local15 >= 50 && local15 < 60) {
				this.anIntArray131[local15 - 50] = arg0.method333();
			} else {
				System.out.println("Error unrecognised spotanim config code: " + local15);
			}
		}
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "()Lclient!db;")
	public Class1_Sub3_Sub1 method245() {
		@Pc(6) Class1_Sub3_Sub1 local6 = (Class1_Sub3_Sub1) aClass30_3.method419((long) this.anInt329);
		if (local6 != null) {
			return local6;
		}
		local6 = new Class1_Sub3_Sub1(this.anInt330, aBoolean82);
		for (@Pc(19) int local19 = 0; local19 < 6; local19++) {
			if (this.anIntArray130[0] != 0) {
				local6.method166(this.anIntArray130[local19], this.anIntArray131[local19]);
			}
		}
		aClass30_3.method420(local6, (long) this.anInt329, aByte16);
		return local6;
	}
}
