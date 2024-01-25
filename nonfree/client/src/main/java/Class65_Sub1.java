import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public final class Class65_Sub1 extends Class65 implements Interface1 {

	@OriginalMember(owner = "client!di", name = "z", descriptor = "Lclient!sb;")
	private final Class264 aClass264_3;

	@OriginalMember(owner = "client!di", name = "<init>", descriptor = "(Lclient!ph;Lclient!sb;Z)V")
	public Class65_Sub1(@OriginalArg(0) Class122_Sub2_Sub2 arg0, @OriginalArg(1) Class264 arg1, @OriginalArg(2) boolean arg2) {
		super(arg0, 34963, arg2);
		this.aClass264_3 = arg1;
	}

	@OriginalMember(owner = "client!di", name = "b", descriptor = "(I)Lclient!sb;")
	@Override
	public Class264 method5231() {
		return this.aClass264_3;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(BZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method5729() {
		return super.method5729();
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(B)V")
	@Override
	public void method5728() {
		super.method5728();
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5227(@OriginalArg(1) int arg0) {
		super.method5227(arg0 * this.aClass264_3.anInt7501);
	}

	@OriginalMember(owner = "client!di", name = "c", descriptor = "(I)I")
	@Override
	public int method5726() {
		return super.method5726();
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5730() {
		return super.method5730();
	}
}
