import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bw")
public final class Class40_Sub1 extends Class40 {

	@OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(Lclient!ki;)V")
	public Class40_Sub1(@OriginalArg(0) Class65_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(IIZB)V")
	@Override
	protected void method6296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) int local16 = super.aClass65_4.anInt4919 * Static473.anInt8332 / 100;
		Static554.aClass90_12.C(arg0, arg1 + 2, local16, super.aClass65_4.anInt4916 - 2, ((Class65_Sub2) super.aClass65_4).anInt4757, 0);
		Static554.aClass90_12.C(arg0 + local16, arg1 + 2, super.aClass65_4.anInt4919 - local16, super.aClass65_4.anInt4916 - 2, 0, 0);
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(IIZI)V")
	@Override
	protected void method6298(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static554.aClass90_12.method7494(arg1 - 2, arg0, super.aClass65_4.anInt4919 + 4, super.aClass65_4.anInt4916 + 2, ((Class65_Sub2) super.aClass65_4).anInt4755, 0);
		Static554.aClass90_12.method7494(arg1 - 1, arg0 + 1, super.aClass65_4.anInt4919 + 2, super.aClass65_4.anInt4916, 0, 0);
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method6772() {
		return true;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(I)V")
	@Override
	public void method6770() {
	}
}
