import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public final class Class76_Sub2 extends Class76 implements Interface23 {

	@OriginalMember(owner = "client!jn", name = "y", descriptor = "Lclient!jr;")
	private final Class161 aClass161_8;

	@OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(Lclient!el;Lclient!jr;Z)V")
	public Class76_Sub2(@OriginalArg(0) Class14_Sub2_Sub1 arg0, @OriginalArg(1) Class161 arg1, @OriginalArg(2) boolean arg2) {
		super(arg0, 34963, arg2);
		this.aClass161_8 = arg1;
	}

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(B)Lclient!jr;")
	@Override
	public Class161 method4097() {
		return this.aClass161_8;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)V")
	@Override
	public void method4091() {
		super.method4091();
	}

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(I)I")
	@Override
	public int method4087() {
		return super.method4087();
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(II)V")
	@Override
	public void method4092(@OriginalArg(1) int arg0) {
		super.method4092(arg0 * this.aClass161_8.anInt4850);
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(ZZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method4095() {
		return super.method4095();
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method4094() {
		return super.method4094();
	}
}
