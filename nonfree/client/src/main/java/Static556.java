import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static556 {

	@OriginalMember(owner = "client!vda", name = "I", descriptor = "[Lclient!f;")
	public static Class38[] aClass38Array27;

	@OriginalMember(owner = "client!vda", name = "E", descriptor = "Lclient!wca;")
	public static final Class359 aClass359_1 = new Class359();

	@OriginalMember(owner = "client!vda", name = "H", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_153 = new Class349(49, 14);

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(II)V")
	public static void method7281() {
		Static124.aClass21_95.method323(5);
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(ILclient!gk;)Lclient!lea;")
	public static Class205 method7282(@OriginalArg(1) Class2_Sub7 arg0) {
		@Pc(12) Class205 local12 = new Class205();
		local12.anInt5024 = arg0.method4518();
		local12.aClass2_Sub2_Sub13_1 = Static330.aClass227_2.method4797(local12.anInt5024);
		return local12;
	}
}
