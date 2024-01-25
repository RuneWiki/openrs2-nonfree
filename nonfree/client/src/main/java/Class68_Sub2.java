import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public final class Class68_Sub2 extends Class68 implements Interface3 {

	@OriginalMember(owner = "client!u", name = "u", descriptor = "I")
	private int anInt6492;

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lclient!ih;I[BIZ)V")
	public Class68_Sub2(@OriginalArg(0) Class117_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt6492 = arg1;
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(B)V")
	@Override
	protected void method5200() {
		super.aClass117_Sub1_39.method2473(this);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(B)J")
	@Override
	public long method5208() {
		return 0L;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IB[BI)V")
	@Override
	public void method5205(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		this.method5203(arg1, arg0);
		this.anInt6492 = 5123;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(I)I")
	@Override
	public int method5206() {
		return this.anInt6492;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Z)I")
	@Override
	public int method5207() {
		return super.anInt6475;
	}
}
