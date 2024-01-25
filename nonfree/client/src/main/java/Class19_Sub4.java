import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mk")
public final class Class19_Sub4 extends Class19 {

	@OriginalMember(owner = "client!mk", name = "r", descriptor = "F")
	private float aFloat147 = 0.0F;

	@OriginalMember(owner = "client!mk", name = "o", descriptor = "Lclient!bl;")
	private final Class31 aClass31_6;

	@OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Lclient!fc;Lclient!bl;)V")
	public Class19_Sub4(@OriginalArg(0) Class15_Sub2 arg0, @OriginalArg(1) Class31 arg1) {
		super(arg0);
		this.aClass31_6 = arg1;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lclient!nm;ZI)V")
	@Override
	public void method7886(@OriginalArg(0) Interface13 arg0, @OriginalArg(2) int arg1) {
		super.aClass15_Sub2_18.method5414(arg0);
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method7883() {
		return this.aClass31_6.method1147();
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7892(@OriginalArg(0) boolean arg0) {
		super.aClass15_Sub2_18.method5410(1);
		super.aClass15_Sub2_18.method5430(Static490.aClass120_5, Static220.aClass120_4);
		super.aClass15_Sub2_18.method5404(false, Static159.aClass85_1, true, 0);
		super.aClass15_Sub2_18.method5488(Static457.aClass85_4, 0);
		super.aClass15_Sub2_18.method5461(0);
		super.aClass15_Sub2_18.method5410(0);
		super.aClass15_Sub2_18.method5487(-16777216);
		super.aClass15_Sub2_18.method5488(Static531.aClass85_5, 0);
		this.method7891();
	}

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "(I)V")
	@Override
	public void method7890() {
		super.aClass15_Sub2_18.method5410(1);
		super.aClass15_Sub2_18.method5430(Static65.aClass120_1, Static65.aClass120_1);
		super.aClass15_Sub2_18.method5444(0, Static159.aClass85_1);
		super.aClass15_Sub2_18.method5488(Static159.aClass85_1, 0);
		super.aClass15_Sub2_18.method5461(1);
		super.aClass15_Sub2_18.method5414(null);
		super.aClass15_Sub2_18.method5410(0);
		super.aClass15_Sub2_18.method5488(Static159.aClass85_1, 0);
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(III)V")
	@Override
	public void method7889(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aClass15_Sub2_18.method5410(1);
		if ((arg0 & 0x80) != 0) {
			super.aClass15_Sub2_18.method5414(null);
		} else if ((arg1 & 0x1) == 1) {
			if (this.aClass31_6.aBoolean84) {
				this.aFloat147 = (float) (super.aClass15_Sub2_18.anInt6528 % 4000) / 4000.0F;
				super.aClass15_Sub2_18.method5414(this.aClass31_6.anInterface1_1);
			} else {
				@Pc(57) int local57 = super.aClass15_Sub2_18.anInt6528 % 4000 * 16 / 4000;
				super.aClass15_Sub2_18.method5414(this.aClass31_6.anInterface14Array2[local57]);
			}
		} else if (this.aClass31_6.aBoolean84) {
			super.aClass15_Sub2_18.method5414(this.aClass31_6.anInterface1_1);
		} else {
			super.aClass15_Sub2_18.method5414(this.aClass31_6.anInterface14Array2[0]);
		}
		super.aClass15_Sub2_18.method5410(0);
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7894(@OriginalArg(1) boolean arg0) {
		super.aClass15_Sub2_18.method5430(Static490.aClass120_5, Static65.aClass120_1);
	}

	@OriginalMember(owner = "client!mk", name = "c", descriptor = "(I)V")
	@Override
	public void method7891() {
		if (super.aClass15_Sub2_18.method5363() != 0) {
			return;
		}
		@Pc(12) Class255_Sub3 local12 = super.aClass15_Sub2_18.method5469();
		super.aClass15_Sub2_18.method5410(1);
		@Pc(22) Class255_Sub3 local22 = super.aClass15_Sub2_18.method5465();
		local22.la(local12);
		local22.method8038(0.125F, 1.0F, 0.125F);
		local22.method8029(0.0F, this.aFloat147, 0.0F);
		super.aClass15_Sub2_18.method5485(Static158.aClass359_6);
		super.aClass15_Sub2_18.method5410(0);
	}
}
