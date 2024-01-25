import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static421 {

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "Lclient!mn;")
	public static Class2_Sub1_Sub4 aClass2_Sub1_Sub4_2;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IB)[B")
	public static synchronized byte[] method5326(@OriginalArg(0) int arg0) {
		@Pc(24) byte[] local24;
		if (arg0 == 100 && Static244.anInt3914 > 0) {
			local24 = Static417.aByteArrayArray57[--Static244.anInt3914];
			Static417.aByteArrayArray57[Static244.anInt3914] = null;
			return local24;
		} else if (arg0 == 5000 && Static456.anInt7291 > 0) {
			local24 = Static202.aByteArrayArray27[--Static456.anInt7291];
			Static202.aByteArrayArray27[Static456.anInt7291] = null;
			return local24;
		} else if (arg0 == 30000 && Static154.anInt2667 > 0) {
			local24 = Static371.aByteArrayArray50[--Static154.anInt2667];
			Static371.aByteArrayArray50[Static154.anInt2667] = null;
			return local24;
		} else {
			return new byte[arg0];
		}
	}
}
