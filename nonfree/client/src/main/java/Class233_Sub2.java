import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public final class Class233_Sub2 extends Class233 implements Interface22 {

	@OriginalMember(owner = "client!pq", name = "J", descriptor = "Lclient!wj;")
	private final Class389 aClass389_7;

	@OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(Lclient!sha;Lclient!wj;Z)V")
	public Class233_Sub2(@OriginalArg(0) Class95_Sub1_Sub1 arg0, @OriginalArg(1) Class389 arg1, @OriginalArg(2) boolean arg2) {
		super(arg0, 34963, arg2);
		this.aClass389_7 = arg1;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(I)I")
	@Override
	public int method7404() {
		return super.method7404();
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(B)Lclient!wj;")
	@Override
	public Class389 method7406() {
		return this.aClass389_7;
	}

	@OriginalMember(owner = "client!pq", name = "c", descriptor = "(I)V")
	@Override
	public void method7409() {
		super.method7409();
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(II)V")
	@Override
	public void method7408(@OriginalArg(1) int arg0) {
		super.method7408(this.aClass389_7.anInt10800 * arg0);
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7407() {
		return super.method6260(super.aClass95_Sub1_Sub1_10.aMapBuffer1);
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method7405() {
		return super.method6255(super.aClass95_Sub1_Sub1_10.aMapBuffer1);
	}
}
