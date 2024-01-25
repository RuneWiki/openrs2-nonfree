import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public final class Class132_Sub2 extends Class132 implements Interface21 {

	@OriginalMember(owner = "client!ll", name = "w", descriptor = "Lclient!ns;")
	private final Class247 aClass247_9;

	@OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Lclient!laa;Lclient!ns;Z)V")
	public Class132_Sub2(@OriginalArg(0) Class126_Sub2_Sub1 arg0, @OriginalArg(1) Class247 arg1, @OriginalArg(2) boolean arg2) {
		super(arg0, 34963, arg2);
		this.aClass247_9 = arg1;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Z)V")
	@Override
	public void method7716() {
		super.method7716();
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IB)V")
	@Override
	public void method5732(@OriginalArg(0) int arg0) {
		super.method5732(this.aClass247_9.anInt6763 * arg0);
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5734() {
		return super.method5104(super.aClass126_Sub2_Sub1_9.aMapBuffer1);
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method5730() {
		return super.method5106(super.aClass126_Sub2_Sub1_9.aMapBuffer1);
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(B)Lclient!ns;")
	@Override
	public Class247 method5733() {
		return this.aClass247_9;
	}

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "(I)I")
	@Override
	public int method7713() {
		return super.method7713();
	}
}
