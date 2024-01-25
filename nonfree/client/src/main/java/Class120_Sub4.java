import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mj")
public final class Class120_Sub4 extends Class120 {

	@OriginalMember(owner = "client!mj", name = "m", descriptor = "Z")
	private boolean aBoolean387 = false;

	static {
		new Class67("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
	}

	@OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(Lclient!tu;)V")
	public Class120_Sub4(@OriginalArg(0) Class5_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7331(@OriginalArg(1) boolean arg0) {
		super.aClass5_Sub3_20.method6320(Static526.aClass289_5, Static130.aClass289_1);
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7322() {
		return true;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7326(@OriginalArg(0) boolean arg0) {
		@Pc(8) Interface20 local8 = super.aClass5_Sub3_20.method6334();
		if (local8 == null || !arg0) {
			super.aClass5_Sub3_20.method6314(Static501.aClass166_4, 0);
			return;
		}
		super.aClass5_Sub3_20.method6388(1);
		super.aClass5_Sub3_20.method6416(local8);
		super.aClass5_Sub3_20.method6394(Static254.aClass177_1);
		super.aClass5_Sub3_20.method6388(1);
		super.aClass5_Sub3_20.method6320(Static526.aClass289_5, Static306.aClass289_2);
		super.aClass5_Sub3_20.method6358(true, 2, Static28.aClass166_1, false);
		super.aClass5_Sub3_20.method6314(Static501.aClass166_4, 0);
		@Pc(74) Class205_Sub1 local74 = super.aClass5_Sub3_20.method6348();
		local74.method5238(super.aClass5_Sub3_20.method6356());
		super.aClass5_Sub3_20.method6355(Static124.aClass243_14);
		super.aClass5_Sub3_20.method6388(0);
		this.aBoolean387 = true;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IBLclient!iu;)V")
	@Override
	public void method7328(@OriginalArg(0) int arg0, @OriginalArg(2) Interface12 arg1) {
		super.aClass5_Sub3_20.method6416(arg1);
		super.aClass5_Sub3_20.method6309(arg0);
	}

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "(B)V")
	@Override
	public void method7324() {
		if (this.aBoolean387) {
			super.aClass5_Sub3_20.method6388(1);
			super.aClass5_Sub3_20.method6394(Static331.aClass177_3);
			super.aClass5_Sub3_20.method6320(Static130.aClass289_1, Static130.aClass289_1);
			super.aClass5_Sub3_20.method6415(Static144.aClass166_2, 2);
			super.aClass5_Sub3_20.method6314(Static213.aClass166_3, 0);
			super.aClass5_Sub3_20.method6376();
			super.aClass5_Sub3_20.method6416(null);
			super.aClass5_Sub3_20.method6388(0);
			this.aBoolean387 = false;
		} else {
			super.aClass5_Sub3_20.method6314(Static213.aClass166_3, 0);
		}
		super.aClass5_Sub3_20.method6320(Static130.aClass289_1, Static130.aClass289_1);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(III)V")
	@Override
	public void method7329(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
