import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public final class Class98_Sub1 extends Class98 implements Interface7 {

	@OriginalMember(owner = "client!gl", name = "q", descriptor = "I")
	private int anInt2431;

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(Lclient!ug;I[BIZ)V")
	public Class98_Sub1(@OriginalArg(0) Class135_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt2431 = arg1;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)I")
	@Override
	public int method3827() {
		return this.anInt2431;
	}

	@OriginalMember(owner = "client!gl", name = "c", descriptor = "(I)V")
	@Override
	protected void method2930() {
		super.aClass135_Sub2_18.method5411(this);
	}

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(B)I")
	@Override
	public int method3828() {
		return super.anInt3685;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)J")
	@Override
	public long method3826() {
		return 0L;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(III[B)V")
	@Override
	public void method3829(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		this.method2931(arg0, arg1);
		this.anInt2431 = 5123;
	}
}
