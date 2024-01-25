import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sia")
public final class Class60_Sub2 extends Class60 implements Interface12 {

	@OriginalMember(owner = "client!sia", name = "D", descriptor = "Lclient!jt;")
	private final Class182 aClass182_16;

	@OriginalMember(owner = "client!sia", name = "<init>", descriptor = "(Lclient!hj;Lclient!jt;Z)V")
	public Class60_Sub2(@OriginalArg(0) Class82_Sub3_Sub1 arg0, @OriginalArg(1) Class182 arg1, @OriginalArg(2) boolean arg2) {
		super(arg0, 34963, arg2);
		this.aClass182_16 = arg1;
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(ZB)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method7573() {
		return super.method7562(super.aClass82_Sub3_Sub1_9.aMapBuffer1);
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7563(@OriginalArg(1) int arg0) {
		super.method7563(this.aClass182_16.anInt5379 * arg0);
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(I)V")
	@Override
	public void method7572() {
		super.method7572();
	}

	@OriginalMember(owner = "client!sia", name = "d", descriptor = "(I)I")
	@Override
	public int method7561() {
		return super.method7561();
	}

	@OriginalMember(owner = "client!sia", name = "c", descriptor = "(I)Lclient!jt;")
	@Override
	public Class182 method7575() {
		return this.aClass182_16;
	}

	@OriginalMember(owner = "client!sia", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7574() {
		return super.method7567(super.aClass82_Sub3_Sub1_9.aMapBuffer1);
	}
}
