import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public final class Class17_Sub1 extends Class17 {

	@OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(ILclient!eka;)V")
	public Class17_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub15 arg1) {
		super(arg0, arg1);
		Static498.method7097(super.anInt10323);
	}

	@OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(Lclient!eka;)V")
	public Class17_Sub1(@OriginalArg(0) Class3_Sub15 arg0) {
		super(arg0);
		Static498.method7097(super.anInt10323);
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Z)V")
	@Override
	public void method8733() {
		if (super.aClass3_Sub15_31.method2426().method5831() < 96) {
			super.anInt10323 = 0;
		}
		if (super.anInt10323 < 0 || super.anInt10323 > 2) {
			super.anInt10323 = this.method8732();
		}
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(I)Z")
	public boolean method712() {
		return super.aClass3_Sub15_31.method2426().method5831() >= 96;
	}

	@OriginalMember(owner = "client!aj", name = "c", descriptor = "(II)V")
	@Override
	protected void method8737(@OriginalArg(0) int arg0) {
		super.anInt10323 = arg0;
		Static498.method7097(super.anInt10323);
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)I")
	@Override
	public int method8734(@OriginalArg(0) int arg0) {
		return super.aClass3_Sub15_31.method2426().method5831() < 96 ? 3 : 1;
	}

	@OriginalMember(owner = "client!aj", name = "d", descriptor = "(B)I")
	public int method715() {
		return super.anInt10323;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)I")
	@Override
	protected int method8732() {
		return super.aClass3_Sub15_31.method2426().method5831() < 96 ? 0 : 2;
	}
}
