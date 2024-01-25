import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!bs", name = "g", descriptor = "Lclient!lp;")
	public static final Class187 aClass187_1 = Static244.method3849();

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(ILjava/awt/Component;ILclient!k;I)Lclient!cl;")
	public static Class58 method1204(@OriginalArg(1) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class168 arg2, @OriginalArg(4) int arg3) {
		if (Static180.anInt3952 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(33) Class58 local33 = (Class58) Class.forName("Class58_Sub1").getDeclaredConstructor().newInstance();
			local33.anInt6616 = arg1;
			local33.anIntArray373 = new int[(Static102.aBoolean181 ? 2 : 1) * 256];
			local33.method5317(arg0);
			local33.anInt6612 = (-1024 & arg1) + 1024;
			if (local33.anInt6612 > 16384) {
				local33.anInt6612 = 16384;
			}
			local33.method5325(local33.anInt6612);
			if (Static62.anInt1682 > 0 && Static205.aClass295_1 == null) {
				Static205.aClass295_1 = new Class295();
				Static205.aClass295_1.aClass168_13 = arg2;
				arg2.method4091(Static205.aClass295_1, Static62.anInt1682);
			}
			if (Static205.aClass295_1 != null) {
				if (Static205.aClass295_1.aClass58Array1[arg3] != null) {
					throw new IllegalArgumentException();
				}
				Static205.aClass295_1.aClass58Array1[arg3] = local33;
			}
			return local33;
		} catch (@Pc(103) Throwable local103) {
			try {
				@Pc(109) Class58_Sub2 local109 = new Class58_Sub2(arg2, arg3);
				local109.anInt6616 = arg1;
				local109.anIntArray373 = new int[(Static102.aBoolean181 ? 2 : 1) * 256];
				local109.method5317(arg0);
				local109.anInt6612 = 16384;
				local109.method5325(local109.anInt6612);
				if (Static62.anInt1682 > 0 && Static205.aClass295_1 == null) {
					Static205.aClass295_1 = new Class295();
					Static205.aClass295_1.aClass168_13 = arg2;
					arg2.method4091(Static205.aClass295_1, Static62.anInt1682);
				}
				if (Static205.aClass295_1 != null) {
					if (Static205.aClass295_1.aClass58Array1[arg3] != null) {
						throw new IllegalArgumentException();
					}
					Static205.aClass295_1.aClass58Array1[arg3] = local109;
				}
				return local109;
			} catch (@Pc(171) Throwable local171) {
				return new Class58();
			}
		}
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(ZI)I")
	public static int method1209(@OriginalArg(1) int arg0) {
		@Pc(12) int local12 = arg0 >>> 1;
		@Pc(18) int local18 = local12 | local12 >>> 1;
		@Pc(24) int local24 = local18 | local18 >>> 2;
		@Pc(30) int local30 = local24 | local24 >>> 4;
		@Pc(36) int local36 = local30 | local30 >>> 8;
		@Pc(42) int local42 = local36 | local36 >>> 16;
		return arg0 & ~local42;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(III)Z")
	public static boolean method1210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return false;
	}
}
