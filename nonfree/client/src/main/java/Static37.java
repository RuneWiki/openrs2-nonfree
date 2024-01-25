import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!bo", name = "g", descriptor = "Z")
	public static boolean aBoolean81 = false;

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(I[B)[B")
	public static byte[] method494(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) byte[] local11 = new byte[arg0.length];
			Static471.method3062(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(II)V")
	public static void method495(@OriginalArg(0) int arg0) {
		@Pc(12) Class1_Sub3_Sub1 local12 = Static427.method5426(arg0, 6);
		local12.method385();
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(B)V")
	public static void method496() {
		for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
			Static269.aBooleanArray106[local3] = false;
		}
		Static139.anInt2147 = 1;
		Static366.anInt5957 = -1;
		Static319.anInt5270 = 0;
		Static320.anInt5279 = -1;
		Static57.anInt915 = 0;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)V")
	public static void method497() {
		if (Static397.aBoolean557) {
			return;
		}
		Static397.aBoolean557 = true;
		Static413.aBoolean582 = true;
		if (Static126.aClass19_Sub1_1.aBoolean382) {
			Static99.aFloat9 = (int) Static99.aFloat9 + 191 & 0xFFFFFF80;
		} else {
			Static392.aFloat81 += (24.0F - Static392.aFloat81) / 2.0F;
		}
	}
}
