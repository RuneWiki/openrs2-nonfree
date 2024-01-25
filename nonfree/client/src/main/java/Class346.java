import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public final class Class346 {

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
	public final int anInt9613;

	@OriginalMember(owner = "client!wg", name = "k", descriptor = "I")
	public final int anInt9620;

	@OriginalMember(owner = "client!wg", name = "f", descriptor = "I")
	public final int anInt9616;

	@OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
	public final int anInt9615;

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(IIII)V")
	public Class346(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt9613 = arg1;
		this.anInt9620 = arg3;
		this.anInt9616 = arg0;
		this.anInt9615 = arg2;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)Lclient!wg;")
	public Class346 method8022(@OriginalArg(0) int arg0) {
		return new Class346(this.anInt9616, arg0, this.anInt9615, this.anInt9620);
	}
}
