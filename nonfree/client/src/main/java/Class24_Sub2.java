import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public final class Class24_Sub2 extends Class24 implements Interface16 {

	@OriginalMember(owner = "client!va", name = "H", descriptor = "Lclient!dw;")
	private final Class79 aClass79_19;

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Lclient!nv;Lclient!dw;Z)V")
	public Class24_Sub2(@OriginalArg(0) Class33_Sub2_Sub1 arg0, @OriginalArg(1) Class79 arg1, @OriginalArg(2) boolean arg2) {
		super(arg0, 34963, arg2);
		this.aClass79_19 = arg1;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(B)I")
	@Override
	public int method8353() {
		return super.method8353();
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8363() {
		return super.method8362(super.aClass33_Sub2_Sub1_11.aMapBuffer1);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(BZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method8364() {
		return super.method8354(super.aClass33_Sub2_Sub1_11.aMapBuffer1);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Z)Lclient!dw;")
	@Override
	public Class79 method8365() {
		return this.aClass79_19;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(II)V")
	@Override
	public void method8360(@OriginalArg(1) int arg0) {
		super.method8360(arg0 * this.aClass79_19.anInt2185);
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(B)V")
	@Override
	public void method8358() {
		super.method8358();
	}
}
