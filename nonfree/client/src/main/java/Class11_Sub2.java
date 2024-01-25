import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public final class Class11_Sub2 extends Class11 implements Interface2 {

	@OriginalMember(owner = "client!uc", name = "w", descriptor = "Lclient!mg;")
	private final Class204 aClass204_19;

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Lclient!bea;Lclient!mg;Z)V")
	public Class11_Sub2(@OriginalArg(0) Class31_Sub1_Sub1 arg0, @OriginalArg(1) Class204 arg1, @OriginalArg(2) boolean arg2) {
		super(arg0, 34963, arg2);
		this.aClass204_19 = arg1;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(BI)V")
	@Override
	public void method7282(@OriginalArg(1) int arg0) {
		super.method7282(arg0 * this.aClass204_19.anInt6009);
	}

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7291() {
		return super.method7281(super.aClass31_Sub1_Sub1_12.aMapBuffer1);
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)Lclient!mg;")
	@Override
	public Class204 method7290() {
		return this.aClass204_19;
	}

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "(I)I")
	@Override
	public int method7278() {
		return super.method7278();
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZB)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method7292() {
		return super.method7283(super.aClass31_Sub1_Sub1_12.aMapBuffer1);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
	@Override
	public void method7285() {
		super.method7285();
	}
}
