import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public final class Class168_Sub1 extends Class168 implements Interface11 {

	@OriginalMember(owner = "client!hv", name = "C", descriptor = "Lclient!hu;")
	private final Class167 aClass167_12;

	@OriginalMember(owner = "client!hv", name = "<init>", descriptor = "(Lclient!vaa;Lclient!hu;Z)V")
	public Class168_Sub1(@OriginalArg(0) Class22_Sub2_Sub2 arg0, @OriginalArg(1) Class167 arg1, @OriginalArg(2) boolean arg2) {
		super(arg0, 34963, arg2);
		this.aClass167_12 = arg1;
	}

	@OriginalMember(owner = "client!hv", name = "c", descriptor = "(I)I")
	@Override
	public int method6752() {
		return super.method6752();
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(B)Lclient!hu;")
	@Override
	public Class167 method5368() {
		return this.aClass167_12;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(II)V")
	@Override
	public void method6757(@OriginalArg(0) int arg0) {
		super.method6757(arg0 * this.aClass167_12.anInt3992);
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(I)V")
	@Override
	public void method6754() {
		super.method6754();
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(ZB)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method5367() {
		return super.method6756(super.aClass22_Sub2_Sub2_10.aMapBuffer1);
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5366() {
		return super.method6753(super.aClass22_Sub2_Sub2_10.aMapBuffer1);
	}
}
