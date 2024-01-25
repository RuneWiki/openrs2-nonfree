import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tga")
public final class Class70_Sub2 extends Class70 implements Interface21 {

	@OriginalMember(owner = "client!tga", name = "z", descriptor = "I")
	private int anInt9558;

	@OriginalMember(owner = "client!tga", name = "<init>", descriptor = "(Lclient!ffa;I[BIZ)V")
	public Class70_Sub2(@OriginalArg(0) Class57_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt9558 = arg1;
	}

	@OriginalMember(owner = "client!tga", name = "b", descriptor = "(I)I")
	@Override
	public int method8200() {
		return super.anInt9554;
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(IB[BI)V")
	@Override
	public void method8198(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		this.method8196(arg0, arg1);
		this.anInt9558 = 5123;
	}

	@OriginalMember(owner = "client!tga", name = "b", descriptor = "(Z)V")
	@Override
	protected void method8193() {
		super.aClass57_Sub2_35.method2381(this);
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(I)J")
	@Override
	public long method8199() {
		return 0L;
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(Z)I")
	@Override
	public int method8201() {
		return this.anInt9558;
	}
}
