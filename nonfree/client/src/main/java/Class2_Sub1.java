import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public final class Class2_Sub1 extends Class2 implements Interface20 {

	@OriginalMember(owner = "client!fd", name = "w", descriptor = "Lclient!ig;")
	private final Class152 aClass152_3;

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Lclient!pa;Lclient!ig;Z)V")
	public Class2_Sub1(@OriginalArg(0) Class13_Sub1_Sub1 arg0, @OriginalArg(1) Class152 arg1, @OriginalArg(2) boolean arg2) {
		super(arg0, 34963, arg2);
		this.aClass152_3 = arg1;
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7826() {
		return super.method8742(super.aClass13_Sub1_Sub1_12.aMapBuffer1);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)I")
	@Override
	public int method8734() {
		return super.method8734();
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(I)Lclient!ig;")
	@Override
	public Class152 method7827() {
		return this.aClass152_3;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method7828() {
		return super.method8741(super.aClass13_Sub1_Sub1_12.aMapBuffer1);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IB)V")
	@Override
	public void method8740(@OriginalArg(0) int arg0) {
		super.method8740(this.aClass152_3.anInt4478 * arg0);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V")
	@Override
	public void method8737() {
		super.method8737();
	}
}
