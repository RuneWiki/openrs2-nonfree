import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dm")
public final class Class50_Sub2 extends Class50 {

	@OriginalMember(owner = "client!dm", name = "n", descriptor = "Lclient!f;")
	private Class14 aClass14_7;

	@OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(Lclient!tf;Lclient!tf;Lclient!md;)V")
	public Class50_Sub2(@OriginalArg(0) Class322 arg0, @OriginalArg(1) Class322 arg1, @OriginalArg(2) Class65_Sub3 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIIZ)V")
	@Override
	protected void method6782(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = this.method6783() * super.aClass65_5.anInt5462 / 10000;
		@Pc(16) int[] local16 = new int[4];
		Static505.aClass45_11.oa(local16);
		Static505.aClass45_11.da(arg1, arg0 + 2, local13 + arg1, arg0 + super.aClass65_5.anInt5461);
		this.aClass14_7.method7682(arg1, arg0 + 2, super.aClass65_5.anInt5462, super.aClass65_5.anInt5461);
		Static505.aClass45_11.da(local16[0], local16[1], local16[2], local16[3]);
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6871() {
		return super.method6871() ? super.aClass322_136.method6797(((Class65_Sub3) super.aClass65_5).anInt5469) : false;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IZIZ)V")
	@Override
	protected void method6781(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static505.aClass45_11.method7402(arg1 - 2, arg0, super.aClass65_5.anInt5462 + 4, super.aClass65_5.anInt5461 + 2, ((Class65_Sub3) super.aClass65_5).anInt5465, 0);
		Static505.aClass45_11.method7402(arg1 - 1, arg0 + 1, super.aClass65_5.anInt5462 + 2, super.aClass65_5.anInt5461, 0, 0);
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V")
	@Override
	public void method6872() {
		super.method6872();
		this.aClass14_7 = Static249.method3865(((Class65_Sub3) super.aClass65_5).anInt5469, super.aClass322_136);
	}
}
