import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "F")
	public static float aFloat93;

	@OriginalMember(owner = "client!hn", name = "d", descriptor = "I")
	public static int anInt3748 = -2;

	@OriginalMember(owner = "client!hn", name = "e", descriptor = "[Lclient!vda;")
	public static Class347[] aClass347Array1 = new Class347[50];

	@OriginalMember(owner = "client!hn", name = "f", descriptor = "I")
	public static final int anInt3749 = 1407;

	@OriginalMember(owner = "client!hn", name = "l", descriptor = "I")
	public static int anInt3753 = 0;

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IZI)V")
	public static void method3344(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(14) Class3_Sub45 local14 = Static162.method826(arg0, arg1);
		if (local14 != null) {
			for (@Pc(19) int local19 = 0; local19 < local14.anIntArray511.length; local19++) {
				local14.anIntArray511[local19] = -1;
				local14.anIntArray510[local19] = 0;
			}
		}
	}
}
