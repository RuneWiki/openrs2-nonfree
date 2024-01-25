import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!go", name = "a", descriptor = "Lclient!pj;")
	public static Class256 aClass256_1;

	@OriginalMember(owner = "client!go", name = "e", descriptor = "Lclient!mv;")
	public static Class216 aClass216_1;

	@OriginalMember(owner = "client!go", name = "b", descriptor = "I")
	public static int anInt3896 = -2;

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Ljava/net/Socket;ZI)Lclient!nr;")
	public static Class223 method3159(@OriginalArg(0) Socket arg0) throws IOException {
		return new Class223_Sub1(arg0, 7500);
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IB[Lclient!pca;)V")
	public static void method3160(@OriginalArg(0) int arg0, @OriginalArg(2) Class251[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			@Pc(13) Class251 local13 = arg1[local7];
			if (local13 != null) {
				if (local13.anInt7231 == 0) {
					if (local13.aClass251Array3 != null) {
						method3160(arg0, local13.aClass251Array3);
					}
					@Pc(37) Class3_Sub49 local37 = (Class3_Sub49) Static204.aClass297_16.method6531((long) local13.anInt7279);
					if (local37 != null) {
						Static51.method4569(arg0, local37.anInt9244);
					}
				}
				@Pc(58) Class3_Sub36 local58;
				if (arg0 == 0 && local13.anObjectArray12 != null) {
					local58 = new Class3_Sub36();
					local58.aClass251_8 = local13;
					local58.anObjectArray1 = local13.anObjectArray12;
					Static583.method7919(local58);
				}
				if (arg0 == 1 && local13.anObjectArray26 != null) {
					if (local13.anInt7268 >= 0) {
						@Pc(86) Class251 local86 = Static105.method2180(local13.anInt7279);
						if (local86 == null || local86.aClass251Array3 == null || local13.anInt7268 >= local86.aClass251Array3.length || local13 != local86.aClass251Array3[local13.anInt7268]) {
							continue;
						}
					}
					local58 = new Class3_Sub36();
					local58.anObjectArray1 = local13.anObjectArray26;
					local58.aClass251_8 = local13;
					Static583.method7919(local58);
				}
			}
		}
	}
}
