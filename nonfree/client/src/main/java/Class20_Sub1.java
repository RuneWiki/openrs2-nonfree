import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public final class Class20_Sub1 extends Class20 implements Interface13 {

	@OriginalMember(owner = "client!ap", name = "C", descriptor = "Lclient!rt;")
	private final Class298 aClass298_1;

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Lclient!mr;Lclient!rt;Z)V")
	public Class20_Sub1(@OriginalArg(0) Class45_Sub2_Sub2 arg0, @OriginalArg(1) Class298 arg1, @OriginalArg(2) boolean arg2) {
		super(arg0, 34963, arg2);
		this.aClass298_1 = arg1;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method6437() {
		return super.method4582(super.aClass45_Sub2_Sub2_9.aMapBuffer1);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IB)V")
	@Override
	public void method6435(@OriginalArg(0) int arg0) {
		super.method6435(this.aClass298_1.anInt7812 * arg0);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(I)I")
	@Override
	public int method6432() {
		return super.method6432();
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method6433() {
		return super.method4577(super.aClass45_Sub2_Sub2_9.aMapBuffer1);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(B)Lclient!rt;")
	@Override
	public Class298 method6434() {
		return this.aClass298_1;
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(B)V")
	@Override
	public void method6436() {
		super.method6436();
	}
}
