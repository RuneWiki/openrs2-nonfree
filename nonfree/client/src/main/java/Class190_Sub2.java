import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kv")
public final class Class190_Sub2 extends Class190 {

	@OriginalMember(owner = "client!kv", name = "o", descriptor = "Lclient!nf;")
	private Class102 aClass102_22;

	@OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(Lclient!gj;Lclient!gj;Lclient!wv;)V")
	public Class190_Sub2(@OriginalArg(0) Class143 arg0, @OriginalArg(1) Class143 arg1, @OriginalArg(2) Class84_Sub3 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(I)V")
	@Override
	public void method7986() {
		super.method7986();
		this.aClass102_22 = Static188.method3032(((Class84_Sub3) super.aClass84_5).anInt10356, super.aClass143_101);
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(ZZII)V")
	@Override
	protected void method5818(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		Static582.aClass16_12.method8146(arg1 - 2, arg0, super.aClass84_5.anInt10343 + 4, super.aClass84_5.anInt10342 + 2, ((Class84_Sub3) super.aClass84_5).anInt10355, 0);
		Static582.aClass16_12.method8146(arg1 - 1, arg0 + 1, super.aClass84_5.anInt10343 + 2, super.aClass84_5.anInt10342, 0, 0);
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7984() {
		return super.method7984() ? super.aClass143_101.method3130(((Class84_Sub3) super.aClass84_5).anInt10356) : false;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIIZ)V")
	@Override
	protected void method5816(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = this.method5819() * super.aClass84_5.anInt10343 / 10000;
		@Pc(16) int[] local16 = new int[4];
		Static582.aClass16_12.K(local16);
		Static582.aClass16_12.KA(arg1, arg0 + 2, arg1 + local13, super.aClass84_5.anInt10342 + arg0);
		this.aClass102_22.method6949(arg1, arg0 + 2, super.aClass84_5.anInt10343, super.aClass84_5.anInt10342);
		Static582.aClass16_12.KA(local16[0], local16[1], local16[2], local16[3]);
	}
}
