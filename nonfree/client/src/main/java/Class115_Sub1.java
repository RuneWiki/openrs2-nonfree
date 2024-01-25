import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public final class Class115_Sub1 extends Class115 implements Interface13 {

	@OriginalMember(owner = "client!gg", name = "B", descriptor = "Lclient!jg;")
	private final Class172 aClass172_3;

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Lclient!tba;Lclient!jg;Z)V")
	public Class115_Sub1(@OriginalArg(0) Class78_Sub1_Sub2 arg0, @OriginalArg(1) Class172 arg1, @OriginalArg(2) boolean arg2) {
		super(arg0, 34963, arg2);
		this.aClass172_3 = arg1;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)V")
	@Override
	public void method5600(@OriginalArg(0) int arg0) {
		super.method5600(this.aClass172_3.anInt4482 * arg0);
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method5603() {
		return super.method5563(super.aClass78_Sub1_Sub2_8.aMapBuffer1);
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Z)I")
	@Override
	public int method5598() {
		return super.method5598();
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method5602() {
		return super.method5558(super.aClass78_Sub1_Sub2_8.aMapBuffer1);
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)V")
	@Override
	public void method5601() {
		super.method5601();
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)Lclient!jg;")
	@Override
	public Class172 method5599() {
		return this.aClass172_3;
	}
}
