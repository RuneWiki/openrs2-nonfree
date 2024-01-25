import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tg")
public final class Class92_Sub6 extends Class92 {

	@OriginalMember(owner = "client!tg", name = "t", descriptor = "Z")
	private boolean aBoolean557 = false;

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(Lclient!sv;)V")
	public Class92_Sub6(@OriginalArg(0) Class121_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(III)V")
	@Override
	public void method7751(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IILclient!aw;)V")
	@Override
	public void method7754(@OriginalArg(0) int arg0, @OriginalArg(2) Interface3 arg1) {
		super.aClass121_Sub2_20.method7167(arg1);
		super.aClass121_Sub2_20.method7266(arg0);
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(ZI)V")
	@Override
	public void method7749(@OriginalArg(0) boolean arg0) {
		@Pc(8) Interface22 local8 = super.aClass121_Sub2_20.method7238();
		if (local8 == null || !arg0) {
			super.aClass121_Sub2_20.method7195(Static121.aClass305_2, 0);
			return;
		}
		super.aClass121_Sub2_20.method7245(1);
		super.aClass121_Sub2_20.method7167(local8);
		super.aClass121_Sub2_20.method7241(Static490.aClass186_4);
		super.aClass121_Sub2_20.method7245(1);
		super.aClass121_Sub2_20.method7198(Static526.aClass59_4, Static351.aClass59_3);
		super.aClass121_Sub2_20.method7282(true, 2, false, Static197.aClass305_3);
		super.aClass121_Sub2_20.method7195(Static121.aClass305_2, 0);
		@Pc(70) Class34_Sub3 local70 = super.aClass121_Sub2_20.method7261();
		local70.method3756(super.aClass121_Sub2_20.method7295());
		super.aClass121_Sub2_20.method7181(Static268.aClass168_3);
		super.aClass121_Sub2_20.method7245(0);
		this.aBoolean557 = true;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V")
	@Override
	public void method7748() {
		if (this.aBoolean557) {
			super.aClass121_Sub2_20.method7245(1);
			super.aClass121_Sub2_20.method7241(Static374.aClass186_2);
			super.aClass121_Sub2_20.method7198(Static241.aClass59_1, Static241.aClass59_1);
			super.aClass121_Sub2_20.method7270(Static257.aClass305_4, 2);
			super.aClass121_Sub2_20.method7195(Static67.aClass305_1, 0);
			super.aClass121_Sub2_20.method7209();
			super.aClass121_Sub2_20.method7167(null);
			super.aClass121_Sub2_20.method7245(0);
			this.aBoolean557 = false;
		} else {
			super.aClass121_Sub2_20.method7195(Static67.aClass305_1, 0);
		}
		super.aClass121_Sub2_20.method7198(Static241.aClass59_1, Static241.aClass59_1);
	}

	@OriginalMember(owner = "client!tg", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method7758() {
		return true;
	}

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "(ZI)V")
	@Override
	public void method7756(@OriginalArg(0) boolean arg0) {
		super.aClass121_Sub2_20.method7198(Static526.aClass59_4, Static241.aClass59_1);
	}
}
