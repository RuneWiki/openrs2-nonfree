import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lda")
public final class Class201 {

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "I")
	public int anInt5266;

	@OriginalMember(owner = "client!lda", name = "b", descriptor = "I")
	public int anInt5267;

	@OriginalMember(owner = "client!lda", name = "c", descriptor = "I")
	public int anInt5268;

	@OriginalMember(owner = "client!lda", name = "g", descriptor = "I")
	public int anInt5272 = 128;

	@OriginalMember(owner = "client!lda", name = "i", descriptor = "I")
	public int anInt5274 = 128;

	@OriginalMember(owner = "client!lda", name = "e", descriptor = "I")
	public int anInt5270;

	@OriginalMember(owner = "client!lda", name = "<init>", descriptor = "(I)V")
	public Class201(@OriginalArg(0) int arg0) {
		this.anInt5270 = arg0;
	}

	@OriginalMember(owner = "client!lda", name = "<init>", descriptor = "(IIIIII)V")
	private Class201(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt5266 = arg4;
		this.anInt5267 = arg5;
		this.anInt5268 = arg3;
		this.anInt5274 = arg2;
		this.anInt5270 = arg0;
		this.anInt5272 = arg1;
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(Lclient!lda;I)V")
	public void method4341(@OriginalArg(0) Class201 arg0) {
		this.anInt5268 = arg0.anInt5268;
		this.anInt5270 = arg0.anInt5270;
		this.anInt5267 = arg0.anInt5267;
		this.anInt5272 = arg0.anInt5272;
		this.anInt5266 = arg0.anInt5266;
		this.anInt5274 = arg0.anInt5274;
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(B)Lclient!lda;")
	public Class201 method4343() {
		return new Class201(this.anInt5270, this.anInt5272, this.anInt5274, this.anInt5268, this.anInt5266, this.anInt5267);
	}
}
