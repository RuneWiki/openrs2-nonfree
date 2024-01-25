import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static612 {

	@OriginalMember(owner = "client!um", name = "a", descriptor = "I")
	private static int anInt9856 = 0;

	@OriginalMember(owner = "client!um", name = "b", descriptor = "Lclient!tm;")
	private static final Class338 aClass338_224 = new Class338();

	@OriginalMember(owner = "client!um", name = "c", descriptor = "Z")
	private static boolean aBoolean754 = false;

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(I)V")
	public static synchronized void method8675() {
		anInt9856--;
		if (anInt9856 == 0) {
			method8679();
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IZ)V")
	public static synchronized void method8676() {
		aBoolean754 = true;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Lclient!e;B)V")
	public static synchronized void method8677(@OriginalArg(0) Interface6 arg0) {
		if (aBoolean754) {
			return;
		}
		if (anInt9856 <= 0) {
			arg0.w(false);
		} else {
			@Pc(17) Class3_Sub32 local17 = new Class3_Sub32();
			local17.anInterface6_1 = arg0;
			aClass338_224.method8171(local17);
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(B)V")
	public static synchronized void method8678() {
		anInt9856++;
	}

	@OriginalMember(owner = "client!um", name = "b", descriptor = "(B)V")
	public static synchronized void method8679() {
		while (true) {
			@Pc(8) Class3_Sub32 local8 = (Class3_Sub32) aClass338_224.method8169();
			if (local8 == null) {
				return;
			}
			local8.anInterface6_1.w(true);
			local8.method9380();
		}
	}
}
