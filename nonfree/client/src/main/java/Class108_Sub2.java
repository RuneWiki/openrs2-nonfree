import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pca")
public final class Class108_Sub2 extends Class108 implements Interface2 {

	@OriginalMember(owner = "client!pca", name = "w", descriptor = "I")
	private int anInt6871;

	@OriginalMember(owner = "client!pca", name = "<init>", descriptor = "(Lclient!gi;I[BIZ)V")
	public Class108_Sub2(@OriginalArg(0) Class42_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt6871 = arg1;
	}

	@OriginalMember(owner = "client!pca", name = "d", descriptor = "(I)V")
	@Override
	protected void method5740() {
		super.aClass42_Sub3_27.method3210(this);
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(I)I")
	@Override
	public int method7244() {
		return super.anInt6864;
	}

	@OriginalMember(owner = "client!pca", name = "b", descriptor = "(I)I")
	@Override
	public int method7245() {
		return this.anInt6871;
	}

	@OriginalMember(owner = "client!pca", name = "c", descriptor = "(I)J")
	@Override
	public long method7246() {
		return 0L;
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(B[BII)V")
	@Override
	public void method7247(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method5743(arg0, arg1);
		this.anInt6871 = 5123;
	}
}
