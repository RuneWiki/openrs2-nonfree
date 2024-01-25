import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public final class Class129_Sub2 extends Class129 implements Interface13 {

	@OriginalMember(owner = "client!ir", name = "B", descriptor = "Lclient!vt;")
	private final Class306 aClass306_4;

	@OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(Lclient!lh;Lclient!vt;Z)V")
	public Class129_Sub2(@OriginalArg(0) Class62_Sub1_Sub2 arg0, @OriginalArg(1) Class306 arg1, @OriginalArg(2) boolean arg2) {
		super(arg0, 34963, arg2);
		this.aClass306_4 = arg1;
	}

	@OriginalMember(owner = "client!ir", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method3492() {
		return super.method3492();
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(B)Lclient!vt;")
	@Override
	public Class306 method3497() {
		return this.aClass306_4;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(I)I")
	@Override
	public int method3485() {
		return super.method3485();
	}

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "(I)V")
	@Override
	public void method3493() {
		super.method3493();
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(ZB)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method3487() {
		return super.method3487();
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(II)V")
	@Override
	public void method3488(@OriginalArg(1) int arg0) {
		super.method3488(arg0 * this.aClass306_4.anInt8854);
	}
}
