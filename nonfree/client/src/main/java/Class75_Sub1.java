import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public final class Class75_Sub1 extends Class75 implements Interface23 {

	@OriginalMember(owner = "client!jd", name = "E", descriptor = "Lclient!ew;")
	private final Class89 aClass89_15;

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(Lclient!ck;Lclient!ew;Z)V")
	public Class75_Sub1(@OriginalArg(0) Class33_Sub1_Sub1 arg0, @OriginalArg(1) Class89 arg1, @OriginalArg(2) boolean arg2) {
		super(arg0, 34963, arg2);
		this.aClass89_15 = arg1;
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(B)Lclient!ew;")
	@Override
	public Class89 method4805() {
		return this.aClass89_15;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IB)V")
	@Override
	public void method7624(@OriginalArg(0) int arg0) {
		super.method7624(this.aClass89_15.anInt3518 * arg0);
	}

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method4806() {
		return super.method7625(super.aClass33_Sub1_Sub1_11.aMapBuffer1);
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(BZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method4807() {
		return super.method7628(super.aClass33_Sub1_Sub1_11.aMapBuffer1);
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)I")
	@Override
	public int method7621() {
		return super.method7621();
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
	@Override
	public void method7627() {
		super.method7627();
	}
}
