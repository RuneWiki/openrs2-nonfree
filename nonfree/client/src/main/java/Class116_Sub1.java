import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public final class Class116_Sub1 extends Class116 implements Interface20 {

	@OriginalMember(owner = "client!fj", name = "x", descriptor = "Lclient!dn;")
	private final Class86 aClass86_14;

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Lclient!tia;Lclient!dn;Z)V")
	public Class116_Sub1(@OriginalArg(0) Class100_Sub1_Sub2 arg0, @OriginalArg(1) Class86 arg1, @OriginalArg(2) boolean arg2) {
		super(arg0, 34963, arg2);
		this.aClass86_14 = arg1;
	}

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "(IZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method7347() {
		return super.method5727(super.aClass100_Sub1_Sub2_7.aMapBuffer1);
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(B)Lclient!dn;")
	@Override
	public Class86 method7348() {
		return this.aClass86_14;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V")
	@Override
	public void method7351() {
		super.method7351();
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Z)I")
	@Override
	public int method7346() {
		return super.method7346();
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7350(@OriginalArg(0) int arg0) {
		super.method7350(this.aClass86_14.anInt1714 * arg0);
	}

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7349() {
		return super.method5726(super.aClass100_Sub1_Sub2_7.aMapBuffer1);
	}
}
