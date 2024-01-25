import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lw")
public final class Class124_Sub3 extends Class124 {

	@OriginalMember(owner = "client!lw", name = "u", descriptor = "Lclient!fd;")
	private Class103 aClass103_34;

	@OriginalMember(owner = "client!lw", name = "<init>", descriptor = "(Lclient!uu;Lclient!uu;Lclient!fq;)V")
	public Class124_Sub3(@OriginalArg(0) Class343 arg0, @OriginalArg(1) Class343 arg1, @OriginalArg(2) Class35_Sub2 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(IIZB)V")
	@Override
	protected void method6755(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(20) int local20 = this.method6756() * super.aClass35_5.anInt9053 / 10000;
		@Pc(23) int[] local23 = new int[4];
		Static266.aClass82_8.K(local23);
		Static266.aClass82_8.KA(arg1, arg0 + 2, arg1 - -local20, arg0 + super.aClass35_5.anInt9046);
		this.aClass103_34.method7455(arg1, arg0 + 2, super.aClass35_5.anInt9053, super.aClass35_5.anInt9046);
		Static266.aClass82_8.KA(local23[0], local23[1], local23[2], local23[3]);
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(IZII)V")
	@Override
	protected void method6753(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static266.aClass82_8.method6179(arg1 - 2, arg0, super.aClass35_5.anInt9053 + 4, super.aClass35_5.anInt9046 + 2, ((Class35_Sub2) super.aClass35_5).anInt3253, 0);
		Static266.aClass82_8.method6179(arg1 - 1, arg0 + 1, super.aClass35_5.anInt9053 + 2, super.aClass35_5.anInt9046, 0, 0);
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8109() {
		return super.method8109() ? super.aClass343_213.method8138(((Class35_Sub2) super.aClass35_5).anInt3249) : false;
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(I)V")
	@Override
	public void method8107() {
		super.method8107();
		this.aClass103_34 = Static209.method3272(super.aClass343_213, ((Class35_Sub2) super.aClass35_5).anInt3249);
	}
}
