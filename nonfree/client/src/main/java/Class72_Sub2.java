import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public final class Class72_Sub2 extends Class72 implements Interface21 {

	@OriginalMember(owner = "client!nq", name = "E", descriptor = "Lclient!oea;")
	private final Class250 aClass250_10;

	@OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Lclient!oaa;Lclient!oea;Z)V")
	public Class72_Sub2(@OriginalArg(0) Class132_Sub1_Sub1 arg0, @OriginalArg(1) Class250 arg1, @OriginalArg(2) boolean arg2) {
		super(arg0, 34963, arg2);
		this.aClass250_10 = arg1;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(II)V")
	@Override
	public void method5800(@OriginalArg(0) int arg0) {
		super.method5800(this.aClass250_10.anInt7253 * arg0);
	}

	@OriginalMember(owner = "client!nq", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5808() {
		return super.method5797(super.aClass132_Sub1_Sub1_9.aMapBuffer1);
	}

	@OriginalMember(owner = "client!nq", name = "c", descriptor = "(I)Lclient!oea;")
	@Override
	public Class250 method5807() {
		return this.aClass250_10;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(I)I")
	@Override
	public int method8886() {
		return super.method8886();
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(I)V")
	@Override
	public void method8887() {
		super.method8887();
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(ZB)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method5806() {
		return super.method5799(super.aClass132_Sub1_Sub1_9.aMapBuffer1);
	}
}
