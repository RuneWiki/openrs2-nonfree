import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public final class Class31_Sub1 extends Class31 implements Interface12 {

	@OriginalMember(owner = "client!bc", name = "C", descriptor = "Lclient!ds;")
	private final Class89 aClass89_2;

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Lclient!jc;Lclient!ds;Z)V")
	public Class31_Sub1(@OriginalArg(0) Class65_Sub2_Sub2 arg0, @OriginalArg(1) Class89 arg1, @OriginalArg(2) boolean arg2) {
		super(arg0, 34963, arg2);
		this.aClass89_2 = arg1;
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)I")
	@Override
	public int method8232() {
		return super.method8232();
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method900() {
		return super.method8241(super.aClass65_Sub2_Sub2_11.aMapBuffer1);
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)Lclient!ds;")
	@Override
	public Class89 method902() {
		return this.aClass89_2;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)V")
	@Override
	public void method8239(@OriginalArg(0) int arg0) {
		super.method8239(this.aClass89_2.anInt2489 * arg0);
	}

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method903() {
		return super.method8233(super.aClass65_Sub2_Sub2_11.aMapBuffer1);
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V")
	@Override
	public void method8235() {
		super.method8235();
	}
}
