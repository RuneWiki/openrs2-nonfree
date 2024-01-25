import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ja")
public final class Class72_Sub3 extends Class72 {

	@OriginalMember(owner = "client!ja", name = "o", descriptor = "Lclient!f;")
	private Class22 aClass22_22;

	@OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(Lclient!pu;Lclient!pu;Lclient!ci;)V")
	public Class72_Sub3(@OriginalArg(0) Class270 arg0, @OriginalArg(1) Class270 arg1, @OriginalArg(2) Class54_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IZII)V")
	@Override
	protected void method4321(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = this.method4318() * super.aClass54_5.anInt4145 / 10000;
		@Pc(16) int[] local16 = new int[4];
		Static16.aClass134_1.oa(local16);
		Static16.aClass134_1.da(arg1, arg0 + 2, local13 + arg1, super.aClass54_5.anInt4141 + arg0);
		this.aClass22_22.method7657(arg1, arg0 + 2, super.aClass54_5.anInt4145, super.aClass54_5.anInt4141);
		Static16.aClass134_1.da(local16[0], local16[1], local16[2], local16[3]);
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIZ)V")
	@Override
	protected void method4322(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static16.aClass134_1.method6958(arg0 - 2, arg1, super.aClass54_5.anInt4145 + 4, super.aClass54_5.anInt4141 + 2, ((Class54_Sub1) super.aClass54_5).anInt1130, 0);
		Static16.aClass134_1.method6958(arg0 - 1, arg1 + 1, super.aClass54_5.anInt4145 + 2, super.aClass54_5.anInt4141, 0, 0);
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method4316() {
		return super.method4316() ? super.aClass270_62.method5694(((Class54_Sub1) super.aClass54_5).anInt1129) : false;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)V")
	@Override
	public void method4315() {
		super.method4315();
		this.aClass22_22 = Static155.method2241(((Class54_Sub1) super.aClass54_5).anInt1129, super.aClass270_62);
	}
}
