import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public final class Class22_Sub4 extends Class22 {

	@OriginalMember(owner = "client!lf", name = "l", descriptor = "F")
	private float aFloat133 = 0.0F;

	@OriginalMember(owner = "client!lf", name = "w", descriptor = "Lclient!tca;")
	private final Class315 aClass315_3;

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(Lclient!kea;Lclient!tca;)V")
	public Class22_Sub4(@OriginalArg(0) Class14_Sub2 arg0, @OriginalArg(1) Class315 arg1) {
		super(arg0);
		this.aClass315_3 = arg1;
	}

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "(I)V")
	@Override
	public void method7652() {
		if (super.aClass14_Sub2_20.method6972() != 0) {
			return;
		}
		@Pc(12) Class54_Sub3 local12 = super.aClass14_Sub2_20.method7031();
		super.aClass14_Sub2_20.method6954(1);
		@Pc(22) Class54_Sub3 local22 = super.aClass14_Sub2_20.method7020();
		local22.la(local12);
		local22.method5453(1.0F, 0.125F, 0.125F);
		local22.method5458(0.0F, this.aFloat133, 0.0F);
		super.aClass14_Sub2_20.method7023(Static249.aClass280_6);
		super.aClass14_Sub2_20.method6954(0);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(BILclient!gl;)V")
	@Override
	public void method7645(@OriginalArg(1) int arg0, @OriginalArg(2) Interface10 arg1) {
		super.aClass14_Sub2_20.method7034(arg1);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7642(@OriginalArg(1) boolean arg0) {
		super.aClass14_Sub2_20.method6935(Static568.aClass228_14, Static41.aClass228_10);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(III)V")
	@Override
	public void method7654(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.aClass14_Sub2_20.method6954(1);
		if ((arg1 & 0x80) != 0) {
			super.aClass14_Sub2_20.method7034(null);
		} else if ((arg0 & 0x1) == 1) {
			if (this.aClass315_3.aBoolean597) {
				this.aFloat133 = (float) (super.aClass14_Sub2_20.anInt8587 % 4000) / 4000.0F;
				super.aClass14_Sub2_20.method7034(this.aClass315_3.anInterface11_1);
			} else {
				@Pc(61) int local61 = super.aClass14_Sub2_20.anInt8587 % 4000 * 16 / 4000;
				super.aClass14_Sub2_20.method7034(this.aClass315_3.anInterface6Array1[local61]);
			}
		} else if (this.aClass315_3.aBoolean597) {
			super.aClass14_Sub2_20.method7034(this.aClass315_3.anInterface11_1);
		} else {
			super.aClass14_Sub2_20.method7034(this.aClass315_3.anInterface6Array1[0]);
		}
		super.aClass14_Sub2_20.method6954(0);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V")
	@Override
	public void method7643() {
		super.aClass14_Sub2_20.method6954(1);
		super.aClass14_Sub2_20.method6935(Static41.aClass228_10, Static41.aClass228_10);
		super.aClass14_Sub2_20.method6912(Static185.aClass138_3, 0);
		super.aClass14_Sub2_20.method6968(Static185.aClass138_3, 0);
		super.aClass14_Sub2_20.method6909(1);
		super.aClass14_Sub2_20.method7034(null);
		super.aClass14_Sub2_20.method6954(0);
		super.aClass14_Sub2_20.method6968(Static185.aClass138_3, 0);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7646(@OriginalArg(0) boolean arg0) {
		super.aClass14_Sub2_20.method6954(1);
		super.aClass14_Sub2_20.method6935(Static568.aClass228_14, Static350.aClass228_12);
		super.aClass14_Sub2_20.method6996(true, Static185.aClass138_3, false, 0);
		super.aClass14_Sub2_20.method6968(Static457.aClass138_4, 0);
		super.aClass14_Sub2_20.method6909(0);
		super.aClass14_Sub2_20.method6954(0);
		super.aClass14_Sub2_20.method7025(-16777216);
		super.aClass14_Sub2_20.method6968(Static113.aClass138_2, 0);
		this.method7652();
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7647() {
		return this.aClass315_3.method6759();
	}
}
