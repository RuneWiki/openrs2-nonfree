import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!ra", name = "T", descriptor = "I")
	public static int anInt3546;

	@OriginalMember(owner = "client!ra", name = "Y", descriptor = "I")
	public static int anInt3548;

	@OriginalMember(owner = "client!ra", name = "bb", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1035 = Static81.method1507("");

	@OriginalMember(owner = "client!ra", name = "Q", descriptor = "Lclient!dj;")
	public static Class24 aClass24_1029 = aClass24_1035;

	@OriginalMember(owner = "client!ra", name = "R", descriptor = "Lclient!dj;")
	public static Class24 aClass24_1030 = aClass24_1035;

	@OriginalMember(owner = "client!ra", name = "U", descriptor = "Lclient!dj;")
	public static Class24 aClass24_1031 = aClass24_1035;

	@OriginalMember(owner = "client!ra", name = "gb", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_1038 = Static81.method1507("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

	@OriginalMember(owner = "client!ra", name = "V", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1032 = aClass24_1038;

	@OriginalMember(owner = "client!ra", name = "X", descriptor = "Lclient!dj;")
	public static Class24 aClass24_1033 = aClass24_1035;

	@OriginalMember(owner = "client!ra", name = "Z", descriptor = "Lclient!dj;")
	public static Class24 aClass24_1034 = aClass24_1035;

	@OriginalMember(owner = "client!ra", name = "eb", descriptor = "Lclient!dj;")
	public static Class24 aClass24_1036 = aClass24_1035;

	@OriginalMember(owner = "client!ra", name = "fb", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1037 = Static81.method1507("Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(BLclient!fj;)V")
	public static void method2711(@OriginalArg(1) Class1_Sub7 arg0) {
		@Pc(13) byte[] local13 = new byte[24];
		if (Static210.aClass10_5 != null) {
			@Pc(25) int local25;
			try {
				Static210.aClass10_5.method312(0L);
				Static210.aClass10_5.method316(local13);
				for (local25 = 0; local25 < 24 && local13[local25] == 0; local25++) {
				}
				if (local25 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(47) Exception local47) {
				for (local25 = 0; local25 < 24; local25++) {
					local13[local25] = -1;
				}
			}
		}
		arg0.method2763(local13, 24);
	}
}
