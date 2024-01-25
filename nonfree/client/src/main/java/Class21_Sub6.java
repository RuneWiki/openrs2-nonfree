import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public final class Class21_Sub6 extends Class21 {

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lclient!eha;)V")
	public Class21_Sub6(@OriginalArg(0) Class3_Sub22 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(ILclient!eha;)V")
	public Class21_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub22 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!gk", name = "d", descriptor = "(II)V")
	@Override
	protected void method9240(@OriginalArg(1) int arg0) {
		super.anInt10876 = arg0;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)I")
	@Override
	protected int method9239() {
		return 0;
	}

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "(II)I")
	@Override
	public int method9238(@OriginalArg(1) int arg0) {
		return Static168.method2721(-19018, super.aClass3_Sub22_34.aClass21_Sub28_2.method8620()) ? 1 : 3;
	}

	@OriginalMember(owner = "client!gk", name = "d", descriptor = "(B)Z")
	public boolean method3187() {
		return Static168.method2721(-19018, super.aClass3_Sub22_34.aClass21_Sub28_2.method8620());
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V")
	@Override
	public void method9235() {
		if (super.aClass3_Sub22_34.aClass21_Sub28_2.method8618() && !Static168.method2721(-19018, super.aClass3_Sub22_34.aClass21_Sub28_2.method8620())) {
			super.anInt10876 = 0;
		}
		if (super.anInt10876 < 0 || super.anInt10876 > 2) {
			super.anInt10876 = this.method9239();
		}
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)I")
	public int method3188() {
		return super.anInt10876;
	}
}
