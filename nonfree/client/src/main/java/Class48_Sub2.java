import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!co")
public final class Class48_Sub2 extends Class48 {

	@OriginalMember(owner = "client!co", name = "x", descriptor = "Z")
	private boolean aBoolean114 = false;

	@OriginalMember(owner = "client!co", name = "<init>", descriptor = "(Lclient!gca;)V")
	public Class48_Sub2(@OriginalArg(0) Class100_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(III)V")
	@Override
	public void method8935(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8941(@OriginalArg(1) boolean arg0) {
		super.aClass100_Sub1_23.method7904(Static164.aClass94_1, Static653.aClass94_5);
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Lclient!ln;BI)V")
	@Override
	public void method8933(@OriginalArg(0) Interface19 arg0, @OriginalArg(2) int arg1) {
		super.aClass100_Sub1_23.method7923(arg0);
		super.aClass100_Sub1_23.method7962(arg1);
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Z)V")
	@Override
	public void method8934() {
		if (this.aBoolean114) {
			super.aClass100_Sub1_23.method7941(1);
			super.aClass100_Sub1_23.method7969(Static461.aClass112_4);
			super.aClass100_Sub1_23.method7904(Static653.aClass94_5, Static653.aClass94_5);
			super.aClass100_Sub1_23.method7970(Static520.aClass93_4, 2);
			super.aClass100_Sub1_23.method7947(Static94.aClass93_2, 0);
			super.aClass100_Sub1_23.method7930();
			super.aClass100_Sub1_23.method7923((Interface19) null);
			super.aClass100_Sub1_23.method7941(0);
			this.aBoolean114 = false;
		} else {
			super.aClass100_Sub1_23.method7947(Static94.aClass93_2, 0);
		}
		super.aClass100_Sub1_23.method7904(Static653.aClass94_5, Static653.aClass94_5);
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8938(@OriginalArg(0) boolean arg0) {
		@Pc(13) Interface22 local13 = super.aClass100_Sub1_23.method7985();
		if (local13 == null || !arg0) {
			super.aClass100_Sub1_23.method7947(Static89.aClass93_1, 0);
			return;
		}
		super.aClass100_Sub1_23.method7941(1);
		super.aClass100_Sub1_23.method7923(local13);
		super.aClass100_Sub1_23.method7969(Static403.aClass112_2);
		super.aClass100_Sub1_23.method7941(1);
		super.aClass100_Sub1_23.method7904(Static164.aClass94_1, Static280.aClass94_2);
		super.aClass100_Sub1_23.method7883(true, Static237.aClass93_3, false, 2);
		super.aClass100_Sub1_23.method7947(Static89.aClass93_1, 0);
		@Pc(74) Class10_Sub2 local74 = super.aClass100_Sub1_23.method7877();
		local74.method1709(super.aClass100_Sub1_23.method7945());
		super.aClass100_Sub1_23.method7954(Static141.aClass16_11);
		super.aClass100_Sub1_23.method7941(0);
		this.aBoolean114 = true;
	}

	@OriginalMember(owner = "client!co", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method8940() {
		return true;
	}
}
