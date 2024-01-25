import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public final class Class7_Sub13 extends Class7 {

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(ILclient!qea;)V")
	public Class7_Sub13(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub41 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lclient!qea;)V")
	public Class7_Sub13(@OriginalArg(0) Class3_Sub41 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(II)V")
	@Override
	protected void method8576(@OriginalArg(1) int arg0) {
		super.anInt10115 = arg0;
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(I)I")
	public int method5385() {
		return super.anInt10115;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)V")
	@Override
	public void method8575() {
		super.anInt10115 = this.method8572();
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IB)I")
	@Override
	public int method8573(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)I")
	@Override
	protected int method8572() {
		return super.aClass3_Sub41_31.method6768() == Static483.aClass133_14 && super.aClass3_Sub41_31.method6776() ? 0 : 1;
	}
}
