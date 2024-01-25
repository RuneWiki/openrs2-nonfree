import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public final class Class163 {

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "I")
	public final int anInt4729;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "I")
	public final int anInt4724;

	@OriginalMember(owner = "client!jc", name = "i", descriptor = "I")
	public final int anInt4730;

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
	public final int anInt4727;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(IIII)V")
	public Class163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4729 = arg0;
		this.anInt4724 = arg3;
		this.anInt4730 = arg2;
		this.anInt4727 = arg1;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZ)Lclient!jc;")
	public Class163 method4376(@OriginalArg(0) int arg0) {
		return new Class163(this.anInt4729, arg0, this.anInt4730, this.anInt4724);
	}
}
