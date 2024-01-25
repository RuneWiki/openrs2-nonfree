import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public final class Class239_Sub1 extends Class239 implements Interface17 {

	@OriginalMember(owner = "client!nj", name = "p", descriptor = "I")
	private int anInt6851;

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(Lclient!dw;I[BIZ)V")
	public Class239_Sub1(@OriginalArg(0) Class82_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt6851 = arg1;
	}

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "(I)J")
	@Override
	public long method5962() {
		return 0L;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)I")
	@Override
	public int method5959() {
		return super.anInt10053;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(II[BI)V")
	@Override
	public void method5960(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		this.method8526(arg1, arg0);
		this.anInt6851 = 5123;
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)I")
	@Override
	public int method5961() {
		return this.anInt6851;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Z)V")
	@Override
	protected void method8525() {
		super.aClass82_Sub1_43.method2053(this);
	}
}
