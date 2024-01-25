import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vg")
public final class Class255_Sub2 extends Class255 {

	@OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(Lclient!oq;)V")
	public Class255_Sub2(@OriginalArg(0) Class101_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IZZI)V")
	@Override
	protected void method8050(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		Static323.aClass9_8.method5436(arg1 - 2, arg0, super.aClass101_4.anInt9016 + 4, super.aClass101_4.anInt9009 - -2, ((Class101_Sub2) super.aClass101_4).anInt7067, 0);
		Static323.aClass9_8.method5436(arg1 - 1, arg0 - -1, super.aClass101_4.anInt9016 + 2, super.aClass101_4.anInt9009, 0, 0);
	}

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8049() {
		return true;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(BZII)V")
	@Override
	protected void method8055(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		@Pc(15) int local15 = super.aClass101_4.anInt9016 * Static258.anInt5219 / 100;
		Static323.aClass9_8.C(arg0, arg1 + 2, local15, super.aClass101_4.anInt9009 - 2, ((Class101_Sub2) super.aClass101_4).anInt7070, 0);
		Static323.aClass9_8.C(local15 + arg0, arg1 + 2, super.aClass101_4.anInt9016 - local15, super.aClass101_4.anInt9009 + -2, 0, 0);
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V")
	@Override
	public void method8048() {
	}
}
