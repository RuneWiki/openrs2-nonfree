import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static329 {

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "I")
	public static int anInt5227 = 0;

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "I")
	public static int anInt5228 = 0;

	@OriginalMember(owner = "client!lq", name = "e", descriptor = "[Lclient!ec;")
	public static final Class81[] aClass81Array1 = new Class81[14];

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)V")
	public static void method4407() {
		@Pc(12) Class92 local12 = null;
		try {
			@Pc(18) Class108 local18 = Static452.aClass226_6.method4858("");
			while (local18.anInt2766 == 0) {
				Static444.method6061(1L);
			}
			if (local18.anInt2766 == 1) {
				local12 = (Class92) local18.anObject6;
				@Pc(41) Class2_Sub22 local41 = Static234.aClass2_Sub5_48.method178();
				local12.method1839(local41.aByteArray115, local41.anInt10247, 0);
			}
		} catch (@Pc(51) Exception local51) {
		}
		try {
			if (local12 != null) {
				local12.method1845();
			}
		} catch (@Pc(58) Exception local58) {
		}
	}
}
