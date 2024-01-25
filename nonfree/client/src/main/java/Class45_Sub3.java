import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oda")
public final class Class45_Sub3 extends Class45 {

	@OriginalMember(owner = "client!oda", name = "r", descriptor = "Lclient!f;")
	private Class78 aClass78_28;

	@OriginalMember(owner = "client!oda", name = "<init>", descriptor = "(Lclient!jn;Lclient!jn;Lclient!pv;)V")
	public Class45_Sub3(@OriginalArg(0) Class176 arg0, @OriginalArg(1) Class176 arg1, @OriginalArg(2) Class108_Sub2 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(I)V")
	@Override
	public void method7416() {
		super.method7416();
		this.aClass78_28 = Static335.method5482(super.aClass176_100, ((Class108_Sub2) super.aClass108_5).anInt7798);
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(IIZZ)V")
	@Override
	protected void method5953(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static440.aClass44_12.method4996(arg0 - 2, arg1, super.aClass108_5.anInt10015 + 4, super.aClass108_5.anInt10007 + 2, ((Class108_Sub2) super.aClass108_5).anInt7799, 0);
		Static440.aClass44_12.method4996(arg0 - 1, arg1 - -1, super.aClass108_5.anInt10015 + 2, super.aClass108_5.anInt10007, 0, 0);
	}

	@OriginalMember(owner = "client!oda", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7417() {
		return super.method7417() ? super.aClass176_100.method3996(((Class108_Sub2) super.aClass108_5).anInt7798) : false;
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(IZII)V")
	@Override
	protected void method5952(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		@Pc(13) int local13 = this.method5954() * super.aClass108_5.anInt10015 / 10000;
		@Pc(16) int[] local16 = new int[4];
		Static440.aClass44_12.oa(local16);
		Static440.aClass44_12.da(arg0, arg1 + 2, arg0 - -local13, arg1 + super.aClass108_5.anInt10007);
		this.aClass78_28.method8184(arg0, arg1 + 2, super.aClass108_5.anInt10015, super.aClass108_5.anInt10007);
		Static440.aClass44_12.da(local16[0], local16[1], local16[2], local16[3]);
	}
}
