import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public final class Class167 {

	@OriginalMember(owner = "client!nl", name = "d", descriptor = "I")
	public final int anInt4863;

	@OriginalMember(owner = "client!nl", name = "e", descriptor = "I")
	public final int anInt4864;

	@OriginalMember(owner = "client!nl", name = "c", descriptor = "I")
	public final int anInt4862;

	@OriginalMember(owner = "client!nl", name = "h", descriptor = "I")
	public final int anInt4866;

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(IIII)V")
	public Class167(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4863 = arg3;
		this.anInt4864 = arg0;
		this.anInt4862 = arg1;
		this.anInt4866 = arg2;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(BI)Lclient!nl;")
	public Class167 method3802(@OriginalArg(1) int arg0) {
		return new Class167(this.anInt4864, arg0, this.anInt4866, this.anInt4863);
	}
}
