import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eba")
public final class Class60_Sub2 extends Class60 {

	@OriginalMember(owner = "client!eba", name = "n", descriptor = "Z")
	private boolean aBoolean202 = false;

	@OriginalMember(owner = "client!eba", name = "<init>", descriptor = "(Lclient!sf;)V")
	public Class60_Sub2(@OriginalArg(0) Class16_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!eba", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8296() {
		return true;
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(Lclient!br;II)V")
	@Override
	public void method8295(@OriginalArg(0) Interface3 arg0, @OriginalArg(2) int arg1) {
		super.aClass16_Sub1_23.method6197(arg0);
		super.aClass16_Sub1_23.method6233(arg1);
	}

	@OriginalMember(owner = "client!eba", name = "e", descriptor = "(I)V")
	@Override
	public void method8300() {
		if (this.aBoolean202) {
			super.aClass16_Sub1_23.method6234(1);
			super.aClass16_Sub1_23.method6282(Static129.aClass41_2);
			super.aClass16_Sub1_23.method6241(Static458.aClass11_4, Static458.aClass11_4);
			super.aClass16_Sub1_23.method6284(Static262.aClass188_2, 2);
			super.aClass16_Sub1_23.method6326(0, Static70.aClass188_1);
			super.aClass16_Sub1_23.method6226();
			super.aClass16_Sub1_23.method6197((Interface3) null);
			super.aClass16_Sub1_23.method6234(0);
			this.aBoolean202 = false;
		} else {
			super.aClass16_Sub1_23.method6326(0, Static70.aClass188_1);
		}
		super.aClass16_Sub1_23.method6241(Static458.aClass11_4, Static458.aClass11_4);
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8293(@OriginalArg(1) boolean arg0) {
		@Pc(8) Interface20 local8 = super.aClass16_Sub1_23.method6208();
		if (local8 == null || !arg0) {
			super.aClass16_Sub1_23.method6326(0, Static317.aClass188_3);
			return;
		}
		super.aClass16_Sub1_23.method6234(1);
		super.aClass16_Sub1_23.method6197(local8);
		super.aClass16_Sub1_23.method6282(Static383.aClass41_4);
		super.aClass16_Sub1_23.method6234(1);
		super.aClass16_Sub1_23.method6241(Static19.aClass11_1, Static49.aClass11_2);
		super.aClass16_Sub1_23.method6277(Static622.aClass188_4, true, 2, false);
		super.aClass16_Sub1_23.method6326(0, Static317.aClass188_3);
		@Pc(59) Class25_Sub3 local59 = super.aClass16_Sub1_23.method6255();
		local59.method4318(super.aClass16_Sub1_23.method6310());
		super.aClass16_Sub1_23.method6212(Static6.aClass20_1);
		super.aClass16_Sub1_23.method6234(0);
		this.aBoolean202 = true;
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(IIB)V")
	@Override
	public void method8291(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8302(@OriginalArg(1) boolean arg0) {
		super.aClass16_Sub1_23.method6241(Static19.aClass11_1, Static458.aClass11_4);
	}
}
