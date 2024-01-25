import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gm")
public final class Class20_Sub5 extends Class20 {

	@OriginalMember(owner = "client!gm", name = "t", descriptor = "Z")
	private boolean aBoolean247 = false;

	@OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Lclient!wg;)V")
	public Class20_Sub5(@OriginalArg(0) Class33_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7961(@OriginalArg(0) boolean arg0) {
		super.aClass33_Sub2_21.method8280(Static489.aClass91_4, Static435.aClass91_3);
	}

	@OriginalMember(owner = "client!gm", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method7970() {
		return true;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(ZILclient!gaa;)V")
	@Override
	public void method7965(@OriginalArg(1) int arg0, @OriginalArg(2) Interface14 arg1) {
		super.aClass33_Sub2_21.method8159(arg1);
		super.aClass33_Sub2_21.method8167(arg0);
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IBI)V")
	@Override
	public void method7969(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(Z)V")
	@Override
	public void method7960() {
		if (this.aBoolean247) {
			super.aClass33_Sub2_21.method8235(1);
			super.aClass33_Sub2_21.method8249(Static315.aClass134_3);
			super.aClass33_Sub2_21.method8280(Static435.aClass91_3, Static435.aClass91_3);
			super.aClass33_Sub2_21.method8239(2, Static228.aClass230_2);
			super.aClass33_Sub2_21.method8258(Static41.aClass230_1, 0);
			super.aClass33_Sub2_21.method8201();
			super.aClass33_Sub2_21.method8159((Interface14) null);
			super.aClass33_Sub2_21.method8235(0);
			this.aBoolean247 = false;
		} else {
			super.aClass33_Sub2_21.method8258(Static41.aClass230_1, 0);
		}
		super.aClass33_Sub2_21.method8280(Static435.aClass91_3, Static435.aClass91_3);
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7967(@OriginalArg(0) boolean arg0) {
		@Pc(15) Interface17 local15 = super.aClass33_Sub2_21.method8215();
		if (local15 == null || !arg0) {
			super.aClass33_Sub2_21.method8258(Static621.aClass230_4, 0);
			return;
		}
		super.aClass33_Sub2_21.method8235(1);
		super.aClass33_Sub2_21.method8159(local15);
		super.aClass33_Sub2_21.method8249(Static274.aClass134_2);
		super.aClass33_Sub2_21.method8235(1);
		super.aClass33_Sub2_21.method8280(Static489.aClass91_4, Static586.aClass91_5);
		super.aClass33_Sub2_21.method8182(Static238.aClass230_3, true, false, 2);
		super.aClass33_Sub2_21.method8258(Static621.aClass230_4, 0);
		@Pc(71) Class92_Sub1 local71 = super.aClass33_Sub2_21.method8271();
		local71.method2304(super.aClass33_Sub2_21.method8187());
		super.aClass33_Sub2_21.method8286(Static255.aClass331_2);
		super.aClass33_Sub2_21.method8235(0);
		this.aBoolean247 = true;
	}
}
