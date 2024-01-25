import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lda")
public final class Class166_Sub2 extends Class166 implements Interface11 {

	@OriginalMember(owner = "client!lda", name = "i", descriptor = "I")
	private int anInt5656;

	@OriginalMember(owner = "client!lda", name = "<init>", descriptor = "(Lclient!er;I[BI)V")
	public Class166_Sub2(@OriginalArg(0) Class31_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt5656 = arg1;
	}

	@OriginalMember(owner = "client!lda", name = "b", descriptor = "(I)I")
	@Override
	public int method5868() {
		return 0;
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(I)J")
	@Override
	public long method5867() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(II[BI)V")
	@Override
	public void method5869(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		this.method4584(arg1, arg0);
		this.anInt5656 = 5123;
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(B)I")
	@Override
	public int method5870() {
		return this.anInt5656;
	}
}
