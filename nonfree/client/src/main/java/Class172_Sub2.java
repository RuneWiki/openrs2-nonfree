import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qda")
public final class Class172_Sub2 extends Class172 implements Interface14 {

	@OriginalMember(owner = "client!qda", name = "x", descriptor = "Lclient!al;")
	private final Class19 aClass19_18;

	@OriginalMember(owner = "client!qda", name = "<init>", descriptor = "(Lclient!om;Lclient!al;Z)V")
	public Class172_Sub2(@OriginalArg(0) Class133_Sub1_Sub2 arg0, @OriginalArg(1) Class19 arg1, @OriginalArg(2) boolean arg2) {
		super(arg0, 34963, arg2);
		this.aClass19_18 = arg1;
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(BI)V")
	@Override
	public void method6764(@OriginalArg(1) int arg0) {
		super.method6764(this.aClass19_18.anInt281 * arg0);
	}

	@OriginalMember(owner = "client!qda", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method6769() {
		return super.method6762(super.aClass133_Sub1_Sub2_12.aMapBuffer1);
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method6770() {
		return super.method6761(super.aClass133_Sub1_Sub2_12.aMapBuffer1);
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(B)I")
	@Override
	public int method6758() {
		return super.method6758();
	}

	@OriginalMember(owner = "client!qda", name = "b", descriptor = "(I)V")
	@Override
	public void method6765() {
		super.method6765();
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(I)Lclient!al;")
	@Override
	public Class19 method6768() {
		return this.aClass19_18;
	}
}
