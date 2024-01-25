import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
	public static int anInt993;

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
	public static int anInt995;

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_6 = new Class187(16);

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_7 = new Class187(8);

	@OriginalMember(owner = "client!bf", name = "h", descriptor = "J")
	public static long aLong23 = -1L;

	@OriginalMember(owner = "client!bf", name = "i", descriptor = "I")
	public static int anInt996 = 0;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)V")
	public static void method847() {
		Static4.anInt29 = 0;
		Static178.aClass393Array1 = new Class393[50];
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(B)Lclient!gn;")
	public static Class14_Sub22 method848() {
		@Pc(7) Class285 local7 = null;
		@Pc(13) Class14_Sub22 local13 = new Class14_Sub22(Static630.aClass77_8, 0);
		try {
			@Pc(19) Class150 local19 = Static234.aClass333_5.method8140("");
			while (local19.anInt4247 == 0) {
				Static20.method9254(1L);
			}
			if (local19.anInt4247 == 1) {
				local7 = (Class285) local19.anObject8;
				@Pc(43) byte[] local43 = new byte[(int) local7.method7147()];
				@Pc(57) int local57;
				for (@Pc(45) int local45 = 0; local45 < local43.length; local45 += local57) {
					local57 = local7.method7141(local43, local43.length - local45, local45);
					if (local57 == -1) {
						throw new IOException("EOF");
					}
				}
				local13 = new Class14_Sub22(new Class14_Sub29(local43), Static630.aClass77_8, 0);
			}
		} catch (@Pc(90) Exception local90) {
		}
		try {
			if (local7 != null) {
				local7.method7142();
			}
		} catch (@Pc(102) Exception local102) {
		}
		return local13;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V")
	public static void method849() {
		Static8.aClass96_1.method3589();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static399.aLongArray16[local10] = 0L;
		}
		for (@Pc(29) int local29 = 0; local29 < 32; local29++) {
			Static331.aLongArray13[local29] = 0L;
		}
		Static643.anInt10753 = 0;
	}
}
