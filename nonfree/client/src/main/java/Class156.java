import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public final class Class156 {

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
	public final int anInt4305;

	@OriginalMember(owner = "client!ic", name = "g", descriptor = "I")
	public final int anInt4307;

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
	public final int anInt4306;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
	public final int anInt4303;

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(IIII)V")
	public Class156(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4305 = arg0;
		this.anInt4307 = arg2;
		this.anInt4306 = arg3;
		this.anInt4303 = arg1;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IB)Lclient!ic;")
	public Class156 method3564(@OriginalArg(0) int arg0) {
		return new Class156(this.anInt4305, arg0, this.anInt4307, this.anInt4306);
	}
}
