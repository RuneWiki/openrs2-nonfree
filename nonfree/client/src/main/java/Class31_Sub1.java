import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qba")
public final class Class31_Sub1 extends Class31 {

	@OriginalMember(owner = "client!qba", name = "<init>", descriptor = "(Lclient!la;Lclient!la;Lclient!ir;)V")
	public Class31_Sub1(@OriginalArg(0) Class207 arg0, @OriginalArg(1) Class207 arg1, @OriginalArg(2) Class119_Sub2 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(IBIZ)V")
	@Override
	protected void method7900(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = this.method7897() * super.aClass119_5.anInt10371 / 10000;
		Static213.aClass133_5.aa(arg0, arg1 + 2, local13, super.aClass119_5.anInt10373 - 2, ((Class119_Sub2) super.aClass119_5).anInt4453, 0);
		Static213.aClass133_5.aa(local13 + arg0, arg1 + 2, super.aClass119_5.anInt10371 - local13, super.aClass119_5.anInt10373 + -2, 0, 0);
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(ZIZI)V")
	@Override
	protected void method7899(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		Static213.aClass133_5.method7279(arg0 - 2, arg1, super.aClass119_5.anInt10371 + 4, super.aClass119_5.anInt10373 + 2, ((Class119_Sub2) super.aClass119_5).anInt4452, 0);
		Static213.aClass133_5.method7279(arg0 - 1, arg1 + 1, super.aClass119_5.anInt10371 + 2, super.aClass119_5.anInt10373, 0, 0);
	}
}
