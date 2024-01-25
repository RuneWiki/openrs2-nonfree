import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!li")
public final class Class184_Sub1 extends Class184 {

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lclient!bk;)V")
	public Class184_Sub1(@OriginalArg(0) Class10_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIZ)V")
	@Override
	protected void method6570(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static176.aClass121_5.method7127(arg0 - 2, arg1, super.aClass10_4.anInt7621 + 4, super.aClass10_4.anInt7623 + 2, ((Class10_Sub1) super.aClass10_4).anInt635, 0);
		Static176.aClass121_5.method7127(arg0 - 1, arg1 - -1, super.aClass10_4.anInt7621 + 2, super.aClass10_4.anInt7623, 0, 0);
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(B)V")
	@Override
	public void method6567() {
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IZII)V")
	@Override
	protected void method6569(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		@Pc(16) int local16 = Static309.anInt5563 * super.aClass10_4.anInt7621 / 100;
		Static176.aClass121_5.C(arg0, arg1 + 2, local16, super.aClass10_4.anInt7623 - 2, ((Class10_Sub1) super.aClass10_4).anInt634, 0);
		Static176.aClass121_5.C(arg0 + local16, arg1 - -2, super.aClass10_4.anInt7621 - local16, super.aClass10_4.anInt7623 + -2, 0, 0);
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method6566() {
		return true;
	}
}
