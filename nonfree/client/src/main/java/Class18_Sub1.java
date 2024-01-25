import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!am")
public final class Class18_Sub1 extends Class18 {

	@OriginalMember(owner = "client!am", name = "p", descriptor = "F")
	private float aFloat2 = 0.0F;

	@OriginalMember(owner = "client!am", name = "m", descriptor = "Lclient!tn;")
	private final Class334 aClass334_1;

	@OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Lclient!ij;Lclient!tn;)V")
	public Class18_Sub1(@OriginalArg(0) Class13_Sub3 arg0, @OriginalArg(1) Class334 arg1) {
		super(arg0);
		this.aClass334_1 = arg1;
	}

	@OriginalMember(owner = "client!am", name = "d", descriptor = "(I)V")
	@Override
	public void method8639() {
		if (super.aClass13_Sub3_23.method8219() != 0) {
			return;
		}
		@Pc(9) Class51_Sub2 local9 = super.aClass13_Sub3_23.method8256();
		super.aClass13_Sub3_23.method8230(1);
		@Pc(19) Class51_Sub2 local19 = super.aClass13_Sub3_23.method8181();
		local19.method6704(local9);
		local19.method3238(0.125F, 1.0F, 0.125F);
		local19.method3232(this.aFloat2, 0.0F, 0.0F);
		super.aClass13_Sub3_23.method8217(Static377.aClass100_3);
		super.aClass13_Sub3_23.method8230(0);
	}

	@OriginalMember(owner = "client!am", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method8643() {
		return this.aClass334_1.method7835();
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method8641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aClass13_Sub3_23.method8230(1);
		if ((arg0 & 0x80) != 0) {
			super.aClass13_Sub3_23.method8234((Interface6) null);
		} else if ((arg1 & 0x1) == 1) {
			if (this.aClass334_1.aBoolean659) {
				this.aFloat2 = (float) (super.aClass13_Sub3_23.anInt9736 % 4000) / 4000.0F;
				super.aClass13_Sub3_23.method8234(this.aClass334_1.anInterface1_1);
			} else {
				@Pc(45) int local45 = super.aClass13_Sub3_23.anInt9736 % 4000 * 16 / 4000;
				super.aClass13_Sub3_23.method8234(this.aClass334_1.anInterface27Array2[local45]);
			}
		} else if (this.aClass334_1.aBoolean659) {
			super.aClass13_Sub3_23.method8234(this.aClass334_1.anInterface1_1);
		} else {
			super.aClass13_Sub3_23.method8234(this.aClass334_1.anInterface27Array2[0]);
		}
		super.aClass13_Sub3_23.method8230(0);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8637(@OriginalArg(0) boolean arg0) {
		super.aClass13_Sub3_23.method8235(Static259.aClass269_4, Static408.aClass269_3);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IILclient!fe;)V")
	@Override
	public void method8645(@OriginalArg(0) int arg0, @OriginalArg(2) Interface6 arg1) {
		super.aClass13_Sub3_23.method8234(arg1);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Z)V")
	@Override
	public void method8642() {
		super.aClass13_Sub3_23.method8230(1);
		super.aClass13_Sub3_23.method8235(Static259.aClass269_4, Static259.aClass269_4);
		super.aClass13_Sub3_23.method8231(Static338.aClass43_3, 0);
		super.aClass13_Sub3_23.method8279(Static338.aClass43_3, 0);
		super.aClass13_Sub3_23.method8298(1);
		super.aClass13_Sub3_23.method8234((Interface6) null);
		super.aClass13_Sub3_23.method8230(0);
		super.aClass13_Sub3_23.method8279(Static338.aClass43_3, 0);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8632(@OriginalArg(1) boolean arg0) {
		super.aClass13_Sub3_23.method8230(1);
		super.aClass13_Sub3_23.method8235(Static26.aClass269_1, Static408.aClass269_3);
		super.aClass13_Sub3_23.method8277(false, true, Static338.aClass43_3, 0);
		super.aClass13_Sub3_23.method8279(Static287.aClass43_8, 0);
		super.aClass13_Sub3_23.method8298(0);
		super.aClass13_Sub3_23.method8230(0);
		super.aClass13_Sub3_23.method8212(-16777216);
		super.aClass13_Sub3_23.method8279(Static470.aClass43_5, 0);
		this.method8639();
	}
}
