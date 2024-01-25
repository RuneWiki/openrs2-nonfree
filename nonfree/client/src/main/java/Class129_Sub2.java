import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public final class Class129_Sub2 extends Class129 implements Interface20 {

	@OriginalMember(owner = "client!us", name = "F", descriptor = "Lclient!ig;")
	private final Class155 aClass155_20;

	@OriginalMember(owner = "client!us", name = "<init>", descriptor = "(Lclient!hp;Lclient!ig;Z)V")
	public Class129_Sub2(@OriginalArg(0) Class134_Sub1_Sub1 arg0, @OriginalArg(1) Class155 arg1, @OriginalArg(2) boolean arg2) {
		super(arg0, 34963, arg2);
		this.aClass155_20 = arg1;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(II)V")
	@Override
	public void method7376(@OriginalArg(1) int arg0) {
		super.method7376(this.aClass155_20.anInt4123 * arg0);
	}

	@OriginalMember(owner = "client!us", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7389() {
		return super.method7379(super.aClass134_Sub1_Sub1_11.aMapBuffer1);
	}

	@OriginalMember(owner = "client!us", name = "b", descriptor = "(I)Lclient!ig;")
	@Override
	public Class155 method7388() {
		return this.aClass155_20;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(B)I")
	@Override
	public int method7374() {
		return super.method7374();
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method7387() {
		return super.method7377(super.aClass134_Sub1_Sub1_11.aMapBuffer1);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(I)V")
	@Override
	public void method7384() {
		super.method7384();
	}
}
