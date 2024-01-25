import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static404 {

	@OriginalMember(owner = "client!un", name = "T", descriptor = "I")
	public static int anInt6738;

	@OriginalMember(owner = "client!un", name = "I", descriptor = "Lclient!ar;")
	public static final Class14 aClass14_44 = new Class14();

	@OriginalMember(owner = "client!un", name = "O", descriptor = "Lclient!di;")
	public static final Class54 aClass54_98 = new Class54(80, -1);

	@OriginalMember(owner = "client!un", name = "P", descriptor = "I")
	public static int anInt6735 = 0;

	@OriginalMember(owner = "client!un", name = "S", descriptor = "Z")
	public static volatile boolean aBoolean456 = true;

	@OriginalMember(owner = "client!un", name = "U", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_24 = new Class214(14, 7);

	@OriginalMember(owner = "client!un", name = "e", descriptor = "(II)V")
	public static void method5328(@OriginalArg(1) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static157.anInt3179 = arg0;
	}

	@OriginalMember(owner = "client!un", name = "g", descriptor = "(I)V")
	public static void method5329() {
		if (Static275.anInt5055 == 0) {
			return;
		}
		try {
			if (++Static127.anInt2764 > 1500) {
				if (Static34.aClass34_2 != null) {
					Static34.aClass34_2.method610();
					Static34.aClass34_2 = null;
				}
				if (Static248.anInt4700 >= 1) {
					Static275.anInt5055 = 0;
					Static378.anInt6415 = -5;
					return;
				}
				if (Static420.anInt7047 == Static370.anInt6355) {
					Static370.anInt6355 = Static188.anInt3651;
				} else {
					Static370.anInt6355 = Static420.anInt7047;
				}
				Static275.anInt5055 = 1;
				Static127.anInt2764 = 0;
				Static248.anInt4700++;
			}
			if (Static275.anInt5055 == 1) {
				Static145.aClass138_5 = Static43.aClass59_5.method1353(Static370.anInt6355, Static227.aString45);
				Static275.anInt5055 = 2;
			}
			@Pc(109) int local109;
			if (Static275.anInt5055 == 2) {
				if (Static145.aClass138_5.anInt3723 == 2) {
					throw new IOException();
				}
				if (Static145.aClass138_5.anInt3723 != 1) {
					return;
				}
				Static34.aClass34_2 = new Class34((Socket) Static145.aClass138_5.anObject7, Static43.aClass59_5);
				Static145.aClass138_5 = null;
				Static34.aClass34_2.method606(Static424.aClass2_Sub23_Sub2_1.anInt6952, Static424.aClass2_Sub23_Sub2_1.aByteArray130);
				Static148.method2441();
				local109 = Static34.aClass34_2.method615();
				Static148.method2441();
				if (local109 != 101) {
					Static378.anInt6415 = local109;
					Static275.anInt5055 = 0;
					Static34.aClass34_2.method610();
					Static34.aClass34_2 = null;
					return;
				}
				Static275.anInt5055 = 3;
			}
			if (Static275.anInt5055 == 3 && Static34.aClass34_2.method613() >= 2) {
				local109 = Static34.aClass34_2.method615() << 8 | Static34.aClass34_2.method615();
				Static224.method3519(local109);
				if (Static375.anInt5832 == -1) {
					Static378.anInt6415 = 6;
					Static275.anInt5055 = 0;
					Static34.aClass34_2.method610();
					Static34.aClass34_2 = null;
				} else {
					Static275.anInt5055 = 0;
					Static34.aClass34_2.method610();
					Static34.aClass34_2 = null;
					Static54.method892();
				}
			}
		} catch (@Pc(181) IOException local181) {
			if (Static34.aClass34_2 != null) {
				Static34.aClass34_2.method610();
				Static34.aClass34_2 = null;
			}
			if (Static248.anInt4700 < 1) {
				Static275.anInt5055 = 1;
				Static127.anInt2764 = 0;
				Static248.anInt4700++;
				if (Static420.anInt7047 == Static370.anInt6355) {
					Static370.anInt6355 = Static188.anInt3651;
				} else {
					Static370.anInt6355 = Static420.anInt7047;
				}
			} else {
				Static275.anInt5055 = 0;
				Static378.anInt6415 = -4;
			}
		}
	}
}
