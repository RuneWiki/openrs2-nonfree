import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static714 {

	@OriginalMember(owner = "client!wk", name = "Ib", descriptor = "I")
	public static int anInt11139;

	@OriginalMember(owner = "client!wk", name = "X", descriptor = "I")
	public static int anInt11150;

	@OriginalMember(owner = "client!wk", name = "Lb", descriptor = "I")
	public static int anInt11156;

	@OriginalMember(owner = "client!wk", name = "r", descriptor = "Lclient!ht;")
	public static Class161 aClass161_1;

	@OriginalMember(owner = "client!wk", name = "Ob", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_199 = new Class186(88, 6);

	@OriginalMember(owner = "client!wk", name = "Z", descriptor = "[I")
	public static final int[] anIntArray626 = new int[4096];

	@OriginalMember(owner = "client!wk", name = "pb", descriptor = "[Lclient!jj;")
	public static final Class187[] aClass187Array1 = new Class187[16];

	@OriginalMember(owner = "client!wk", name = "h", descriptor = "(I)V")
	public static void method9317() {
		@Pc(14) Class333 local14 = null;
		try {
			@Pc(20) Class201 local20 = Static310.aClass47_4.method939("2");
			while (local20.anInt5729 == 0) {
				Static564.method7845(1L);
			}
			if (local20.anInt5729 == 1) {
				local14 = (Class333) local20.anObject16;
				@Pc(51) byte[] local51 = new byte[(int) local14.method7954()];
				@Pc(66) int local66;
				for (@Pc(53) int local53 = 0; local53 < local51.length; local53 += local66) {
					local66 = local14.method7959(local53, local51.length - local53, local51);
					if (local66 == -1) {
						throw new IOException("EOF");
					}
				}
				Static3.method39(new Class3_Sub28(local51));
			}
		} catch (@Pc(97) Exception local97) {
		}
		try {
			if (local14 != null) {
				local14.method7955();
			}
		} catch (@Pc(104) Exception local104) {
		}
	}
}
