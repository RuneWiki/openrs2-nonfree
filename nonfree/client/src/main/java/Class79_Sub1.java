import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public final class Class79_Sub1 extends Class79 implements Interface14 {

	@OriginalMember(owner = "client!es", name = "J", descriptor = "Lclient!vt;")
	private final Class310 aClass310_3;

	@OriginalMember(owner = "client!es", name = "<init>", descriptor = "(Lclient!gf;Lclient!vt;Z)V")
	public Class79_Sub1(@OriginalArg(0) Class5_Sub3_Sub1 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) boolean arg2) {
		super(arg0, 34963, arg2);
		this.aClass310_3 = arg1;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method3135() {
		return super.method3135();
	}

	@OriginalMember(owner = "client!es", name = "b", descriptor = "(I)I")
	@Override
	public int method3133() {
		return super.method3133();
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method3136() {
		return super.method3136();
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(II)V")
	@Override
	public void method3137(@OriginalArg(0) int arg0) {
		super.method3137(this.aClass310_3.anInt9119 * arg0);
	}

	@OriginalMember(owner = "client!es", name = "c", descriptor = "(I)Lclient!vt;")
	@Override
	public Class310 method3134() {
		return this.aClass310_3;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(Z)V")
	@Override
	public void method3138() {
		super.method3138();
	}
}
