import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public final class Class123 {

	@OriginalMember(owner = "client!gn", name = "d", descriptor = "I")
	public final int anInt4150;

	@OriginalMember(owner = "client!gn", name = "e", descriptor = "I")
	public final int anInt4151;

	@OriginalMember(owner = "client!gn", name = "g", descriptor = "I")
	public final int anInt4153;

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "I")
	public final int anInt4149;

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(IIII)V")
	public Class123(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4150 = arg1;
		this.anInt4151 = arg3;
		this.anInt4153 = arg2;
		this.anInt4149 = arg0;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(II)Lclient!gn;")
	public Class123 method3520(@OriginalArg(0) int arg0) {
		return new Class123(this.anInt4149, arg0, this.anInt4153, this.anInt4151);
	}
}
