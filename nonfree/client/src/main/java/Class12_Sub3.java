import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public final class Class12_Sub3 extends Class12 {

	@OriginalMember(owner = "client!oc", name = "w", descriptor = "Lclient!f;")
	private Class5 aClass5_24;

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Lclient!sea;Lclient!sea;Lclient!ss;)V")
	public Class12_Sub3(@OriginalArg(0) Class308 arg0, @OriginalArg(1) Class308 arg1, @OriginalArg(2) Class23_Sub3 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZIIB)V")
	@Override
	protected void method5758(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(24) int local24 = this.method5760() * super.aClass23_5.anInt8314 / 10000;
		@Pc(27) int[] local27 = new int[4];
		Static31.aClass78_18.oa(local27);
		Static31.aClass78_18.da(arg0, arg1 + 2, arg0 + local24, arg1 + super.aClass23_5.anInt8309);
		this.aClass5_24.method7794(arg0, arg1 + 2, super.aClass23_5.anInt8314, super.aClass23_5.anInt8309);
		Static31.aClass78_18.da(local27[0], local27[1], local27[2], local27[3]);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7886() {
		return super.method7886() ? super.aClass308_144.method6538(((Class23_Sub3) super.aClass23_5).anInt8318) : false;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIZI)V")
	@Override
	protected void method5757(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		Static31.aClass78_18.method6778(arg0 - 2, arg1, super.aClass23_5.anInt8314 + 4, super.aClass23_5.anInt8309 + 2, ((Class23_Sub3) super.aClass23_5).anInt8322, 0);
		Static31.aClass78_18.method6778(arg0 - 1, arg1 + 1, super.aClass23_5.anInt8314 + 2, super.aClass23_5.anInt8309, 0, 0);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
	@Override
	public void method7888() {
		super.method7888();
		this.aClass5_24 = Static375.method5452(((Class23_Sub3) super.aClass23_5).anInt8318, super.aClass308_144);
	}
}
