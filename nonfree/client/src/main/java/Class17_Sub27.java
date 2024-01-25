import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vba")
public final class Class17_Sub27 extends Class17 {

	@OriginalMember(owner = "client!vba", name = "<init>", descriptor = "(Lclient!eka;)V")
	public Class17_Sub27(@OriginalArg(0) Class3_Sub15 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!vba", name = "<init>", descriptor = "(ILclient!eka;)V")
	public Class17_Sub27(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub15 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!vba", name = "b", descriptor = "(I)Z")
	public boolean method8265() {
		return true;
	}

	@OriginalMember(owner = "client!vba", name = "c", descriptor = "(B)I")
	public int method8266() {
		return super.anInt10323;
	}

	@OriginalMember(owner = "client!vba", name = "c", descriptor = "(II)V")
	@Override
	protected void method8737(@OriginalArg(0) int arg0) {
		super.anInt10323 = arg0;
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(I)I")
	@Override
	protected int method8732() {
		return 1;
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(Z)V")
	@Override
	public void method8733() {
		if (super.anInt10323 != 0 && super.aClass3_Sub15_31.aClass17_Sub22_1.method6659() != 1) {
			super.anInt10323 = 0;
		}
		if (super.anInt10323 < 0 || super.anInt10323 > 1) {
			super.anInt10323 = this.method8732();
		}
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(II)I")
	@Override
	public int method8734(@OriginalArg(0) int arg0) {
		return arg0 == 0 || super.aClass3_Sub15_31.aClass17_Sub22_1.method6659() == 1 ? 1 : 2;
	}
}
