import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static541 {

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
	public static int anInt9362 = -1;

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray6 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
	public static void method7640() {
		@Pc(5) Class360 local5 = null;
		try {
			@Pc(13) Class159 local13 = Static496.aClass104_4.method3144("");
			while (local13.anInt5910 == 0) {
				Static344.method5698(1L);
			}
			if (local13.anInt5910 == 1) {
				local5 = (Class360) local13.anObject13;
				@Pc(39) Class6_Sub8 local39 = Static87.aClass6_Sub33_6.method4999();
				local5.method8361(local39.aByteArray102, 0, local39.anInt10061);
			}
		} catch (@Pc(49) Exception local49) {
		}
		try {
			if (local5 != null) {
				local5.method8359();
			}
		} catch (@Pc(56) Exception local56) {
		}
	}
}
