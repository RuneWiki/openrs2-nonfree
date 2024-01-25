import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lt")
public final class Class72_Sub6 extends Class72 {

	@OriginalMember(owner = "client!lt", name = "x", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray1 = new Rectangle[100];

	@OriginalMember(owner = "client!lt", name = "o", descriptor = "Z")
	private boolean aBoolean393 = false;

	static {
		for (@Pc(12) int local12 = 0; local12 < 100; local12++) {
			aRectangleArray1[local12] = new Rectangle();
		}
	}

	@OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(Lclient!mj;)V")
	public Class72_Sub6(@OriginalArg(0) Class45_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(BILclient!lc;)V")
	@Override
	public void method7194(@OriginalArg(1) int arg0, @OriginalArg(2) Interface11 arg1) {
		super.aClass45_Sub2_22.method4926(arg1);
		super.aClass45_Sub2_22.method4939(arg0);
	}

	@OriginalMember(owner = "client!lt", name = "b", descriptor = "(B)V")
	@Override
	public void method7184() {
		if (this.aBoolean393) {
			super.aClass45_Sub2_22.method4961(1);
			super.aClass45_Sub2_22.method4919(Static109.aClass17_2);
			super.aClass45_Sub2_22.method4921(Static19.aClass307_1, Static19.aClass307_1);
			super.aClass45_Sub2_22.method4953(2, Static62.aClass108_1);
			super.aClass45_Sub2_22.method4900(0, Static164.aClass108_3);
			super.aClass45_Sub2_22.method4950();
			super.aClass45_Sub2_22.method4926(null);
			super.aClass45_Sub2_22.method4961(0);
			this.aBoolean393 = false;
		} else {
			super.aClass45_Sub2_22.method4900(0, Static164.aClass108_3);
		}
		super.aClass45_Sub2_22.method4921(Static19.aClass307_1, Static19.aClass307_1);
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7182(@OriginalArg(1) boolean arg0) {
		super.aClass45_Sub2_22.method4921(Static534.aClass307_7, Static19.aClass307_1);
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(III)V")
	@Override
	public void method7188(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7193(@OriginalArg(0) boolean arg0) {
		@Pc(15) Interface6 local15 = super.aClass45_Sub2_22.method4985();
		if (local15 == null || !arg0) {
			super.aClass45_Sub2_22.method4900(0, Static425.aClass108_4);
			return;
		}
		super.aClass45_Sub2_22.method4961(1);
		super.aClass45_Sub2_22.method4926(local15);
		super.aClass45_Sub2_22.method4919(Static380.aClass17_4);
		super.aClass45_Sub2_22.method4961(1);
		super.aClass45_Sub2_22.method4921(Static534.aClass307_7, Static479.aClass307_6);
		super.aClass45_Sub2_22.method5010(2, false, true, Static160.aClass108_2);
		super.aClass45_Sub2_22.method4900(0, Static425.aClass108_4);
		@Pc(64) Class11_Sub1 local64 = super.aClass45_Sub2_22.method5007();
		local64.method164(super.aClass45_Sub2_22.method5014());
		super.aClass45_Sub2_22.method4932(Static334.aClass222_9);
		super.aClass45_Sub2_22.method4961(0);
		this.aBoolean393 = true;
	}

	@OriginalMember(owner = "client!lt", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7187() {
		return true;
	}
}
