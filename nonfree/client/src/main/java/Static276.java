import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!jf", name = "y", descriptor = "I")
	public static int anInt5163 = -1;

	@OriginalMember(owner = "client!jf", name = "N", descriptor = "I")
	public static int anInt5173 = -1;

	@OriginalMember(owner = "client!jf", name = "O", descriptor = "I")
	public static int anInt5174 = 0;

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(Z)Lclient!eka;")
	public static Class3_Sub15 method4386() {
		@Pc(7) Class123 local7 = null;
		@Pc(13) Class3_Sub15 local13 = new Class3_Sub15(Static102.aClass181_38, 0);
		try {
			@Pc(19) Class129 local19 = Static499.aClass231_4.method5295("");
			while (local19.anInt3299 == 0) {
				Static365.method3472(1L);
			}
			if (local19.anInt3299 == 1) {
				local7 = (Class123) local19.anObject7;
				@Pc(47) byte[] local47 = new byte[(int) local7.method2762()];
				@Pc(62) int local62;
				for (@Pc(49) int local49 = 0; local49 < local47.length; local49 += local62) {
					local62 = local7.method2766(local47, local47.length - local49, local49);
					if (local62 == -1) {
						throw new IOException("EOF");
					}
				}
				local13 = new Class3_Sub15(new Class3_Sub17(local47), Static102.aClass181_38, 0);
			}
		} catch (@Pc(95) Exception local95) {
		}
		try {
			if (local7 != null) {
				local7.method2764();
			}
		} catch (@Pc(102) Exception local102) {
		}
		return local13;
	}

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "(B)V")
	public static void method4389() {
		@Pc(7) Class123 local7 = null;
		try {
			@Pc(13) Class129 local13 = Static499.aClass231_4.method5295("2");
			while (local13.anInt3299 == 0) {
				Static365.method3472(1L);
			}
			if (local13.anInt3299 == 1) {
				local7 = (Class123) local13.anObject7;
				@Pc(43) byte[] local43 = new byte[(int) local7.method2762()];
				@Pc(58) int local58;
				for (@Pc(45) int local45 = 0; local45 < local43.length; local45 += local58) {
					local58 = local7.method2766(local43, local43.length - local45, local45);
					if (local58 == -1) {
						throw new IOException("EOF");
					}
				}
				Static337.method5136(new Class3_Sub17(local43));
			}
		} catch (@Pc(87) Exception local87) {
		}
		try {
			if (local7 != null) {
				local7.method2764();
			}
		} catch (@Pc(94) Exception local94) {
		}
	}
}
