import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iaa")
public final class Class10_Sub4 extends Class10 {

	@OriginalMember(owner = "client!iaa", name = "o", descriptor = "Z")
	private boolean aBoolean267 = false;

	@OriginalMember(owner = "client!iaa", name = "<init>", descriptor = "(Lclient!jca;)V")
	public Class10_Sub4(@OriginalArg(0) Class22_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(ZB)V")
	@Override
	public void method9551(@OriginalArg(0) boolean arg0) {
		@Pc(20) Interface1 local20 = super.aClass22_Sub2_23.method8886();
		if (local20 == null || !arg0) {
			super.aClass22_Sub2_23.method8897(Static407.aClass392_2, 0);
			return;
		}
		super.aClass22_Sub2_23.method8896(1);
		super.aClass22_Sub2_23.method8976(local20);
		super.aClass22_Sub2_23.method8883(Static281.aClass37_2);
		super.aClass22_Sub2_23.method8896(1);
		super.aClass22_Sub2_23.method8914(Static468.aClass372_3, Static240.aClass372_6);
		super.aClass22_Sub2_23.method8954(2, false, true, Static671.aClass392_4);
		super.aClass22_Sub2_23.method8897(Static407.aClass392_2, 0);
		@Pc(71) Class58_Sub2 local71 = super.aClass22_Sub2_23.method8922();
		local71.method6105(super.aClass22_Sub2_23.method8907());
		super.aClass22_Sub2_23.method8924(Static508.aClass222_5);
		super.aClass22_Sub2_23.method8896(0);
		this.aBoolean267 = true;
	}

	@OriginalMember(owner = "client!iaa", name = "b", descriptor = "(B)V")
	@Override
	public void method9549() {
		if (this.aBoolean267) {
			super.aClass22_Sub2_23.method8896(1);
			super.aClass22_Sub2_23.method8883(Static586.aClass37_4);
			super.aClass22_Sub2_23.method8914(Static503.aClass372_4, Static503.aClass372_4);
			super.aClass22_Sub2_23.method8962(Static547.aClass392_3, 2);
			super.aClass22_Sub2_23.method8897(Static358.aClass392_1, 0);
			super.aClass22_Sub2_23.method8873();
			super.aClass22_Sub2_23.method8976((Interface21) null);
			super.aClass22_Sub2_23.method8896(0);
			this.aBoolean267 = false;
		} else {
			super.aClass22_Sub2_23.method8897(Static358.aClass392_1, 0);
		}
		super.aClass22_Sub2_23.method8914(Static503.aClass372_4, Static503.aClass372_4);
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IBI)V")
	@Override
	public void method9552(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(ZI)V")
	@Override
	public void method9558(@OriginalArg(0) boolean arg0) {
		super.aClass22_Sub2_23.method8914(Static468.aClass372_3, Static503.aClass372_4);
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(Lclient!sc;II)V")
	@Override
	public void method9546(@OriginalArg(0) Interface21 arg0, @OriginalArg(2) int arg1) {
		super.aClass22_Sub2_23.method8976(arg0);
		super.aClass22_Sub2_23.method8853(arg1);
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method9557() {
		return true;
	}
}
