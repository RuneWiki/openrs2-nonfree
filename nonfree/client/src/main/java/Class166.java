import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iw")
public final class Class166 {

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "I")
	public int anInt4307;

	@OriginalMember(owner = "client!iw", name = "d", descriptor = "I")
	public int anInt4310;

	@OriginalMember(owner = "client!iw", name = "i", descriptor = "I")
	public int anInt4315;

	@OriginalMember(owner = "client!iw", name = "b", descriptor = "I")
	public int anInt4308 = 128;

	@OriginalMember(owner = "client!iw", name = "f", descriptor = "I")
	public int anInt4312 = 128;

	@OriginalMember(owner = "client!iw", name = "j", descriptor = "I")
	public int anInt4316;

	@OriginalMember(owner = "client!iw", name = "<init>", descriptor = "(I)V")
	public Class166(@OriginalArg(0) int arg0) {
		this.anInt4316 = arg0;
	}

	@OriginalMember(owner = "client!iw", name = "<init>", descriptor = "(IIIIII)V")
	private Class166(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt4312 = arg1;
		this.anInt4316 = arg0;
		this.anInt4315 = arg3;
		this.anInt4308 = arg2;
		this.anInt4310 = arg5;
		this.anInt4307 = arg4;
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(I)Lclient!iw;")
	public Class166 method3480() {
		return new Class166(this.anInt4316, this.anInt4312, this.anInt4308, this.anInt4315, this.anInt4307, this.anInt4310);
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(Lclient!iw;I)V")
	public void method3481(@OriginalArg(0) Class166 arg0) {
		this.anInt4310 = arg0.anInt4310;
		this.anInt4312 = arg0.anInt4312;
		this.anInt4307 = arg0.anInt4307;
		this.anInt4308 = arg0.anInt4308;
		this.anInt4315 = arg0.anInt4315;
		this.anInt4316 = arg0.anInt4316;
	}
}
