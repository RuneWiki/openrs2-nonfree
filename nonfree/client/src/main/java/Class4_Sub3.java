import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dja")
public final class Class4_Sub3 extends Class4 {

	@OriginalMember(owner = "client!dja", name = "m", descriptor = "Z")
	private boolean aBoolean184 = false;

	@OriginalMember(owner = "client!dja", name = "<init>", descriptor = "(Lclient!ai;)V")
	public Class4_Sub3(@OriginalArg(0) Class13_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method7849(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7852(@OriginalArg(1) boolean arg0) {
		super.aClass13_Sub1_23.method7521(Static265.aClass203_3, Static580.aClass203_4);
	}

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7856(@OriginalArg(0) boolean arg0) {
		@Pc(8) Interface10 local8 = super.aClass13_Sub1_23.method7529();
		if (local8 == null || !arg0) {
			super.aClass13_Sub1_23.method7517(0, Static206.aClass326_3);
			return;
		}
		super.aClass13_Sub1_23.method7461(1);
		super.aClass13_Sub1_23.method7530(local8);
		super.aClass13_Sub1_23.method7408(Static660.aClass10_4);
		super.aClass13_Sub1_23.method7461(1);
		super.aClass13_Sub1_23.method7521(Static265.aClass203_3, Static582.aClass203_5);
		super.aClass13_Sub1_23.method7498(true, false, 2, Static348.aClass326_4);
		super.aClass13_Sub1_23.method7517(0, Static206.aClass326_3);
		@Pc(67) Class239_Sub3 local67 = super.aClass13_Sub1_23.method7512();
		local67.method9255(super.aClass13_Sub1_23.method7437());
		super.aClass13_Sub1_23.method7464(Static293.aClass94_6);
		super.aClass13_Sub1_23.method7461(0);
		this.aBoolean184 = true;
	}

	@OriginalMember(owner = "client!dja", name = "f", descriptor = "(B)V")
	@Override
	public void method7858() {
		if (this.aBoolean184) {
			super.aClass13_Sub1_23.method7461(1);
			super.aClass13_Sub1_23.method7408(Static635.aClass10_3);
			super.aClass13_Sub1_23.method7521(Static580.aClass203_4, Static580.aClass203_4);
			super.aClass13_Sub1_23.method7522(Static125.aClass326_1, 2);
			super.aClass13_Sub1_23.method7517(0, Static523.aClass326_5);
			super.aClass13_Sub1_23.method7510();
			super.aClass13_Sub1_23.method7530((Interface3) null);
			super.aClass13_Sub1_23.method7461(0);
			this.aBoolean184 = false;
		} else {
			super.aClass13_Sub1_23.method7517(0, Static523.aClass326_5);
		}
		super.aClass13_Sub1_23.method7521(Static580.aClass203_4, Static580.aClass203_4);
	}

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7848() {
		return true;
	}

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "(IBLclient!bm;)V")
	@Override
	public void method7859(@OriginalArg(0) int arg0, @OriginalArg(2) Interface3 arg1) {
		super.aClass13_Sub1_23.method7530(arg1);
		super.aClass13_Sub1_23.method7509(arg0);
	}
}
