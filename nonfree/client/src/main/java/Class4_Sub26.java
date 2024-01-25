import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public final class Class4_Sub26 extends Class4 {

	@OriginalMember(owner = "client!kg", name = "k", descriptor = "I")
	public final int anInt5159;

	@OriginalMember(owner = "client!kg", name = "l", descriptor = "I")
	public final int anInt5160;

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(II)V")
	public Class4_Sub26(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5159 = arg0;
		this.anInt5160 = arg1;
	}
}
