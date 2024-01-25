import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ow")
public final class Class135_Sub2 extends Class135 implements Interface20 {

	@OriginalMember(owner = "client!ow", name = "B", descriptor = "Lclient!lj;")
	private final Class200 aClass200_17;

	@OriginalMember(owner = "client!ow", name = "<init>", descriptor = "(Lclient!ia;Lclient!lj;Z)V")
	public Class135_Sub2(@OriginalArg(0) Class15_Sub2_Sub1 arg0, @OriginalArg(1) Class200 arg1, @OriginalArg(2) boolean arg2) {
		super(arg0, 34963, arg2);
		this.aClass200_17 = arg1;
	}

	@OriginalMember(owner = "client!ow", name = "c", descriptor = "(I)Lclient!lj;")
	@Override
	public Class200 method6246() {
		return this.aClass200_17;
	}

	@OriginalMember(owner = "client!ow", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method6241() {
		return super.method6241();
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(ZZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method6243() {
		return super.method6243();
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(Z)I")
	@Override
	public int method6235() {
		return super.method6235();
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(IB)V")
	@Override
	public void method6240(@OriginalArg(0) int arg0) {
		super.method6240(arg0 * this.aClass200_17.anInt6064);
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(I)V")
	@Override
	public void method6239() {
		super.method6239();
	}
}
