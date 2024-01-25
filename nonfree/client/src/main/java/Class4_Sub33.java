import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public final class Class4_Sub33 extends Class4 {

	@OriginalMember(owner = "client!mh", name = "m", descriptor = "I")
	public int anInt5597;

	@OriginalMember(owner = "client!mh", name = "k", descriptor = "I")
	public final int anInt5595;

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(II)V")
	public Class4_Sub33(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5597 = arg1;
		this.anInt5595 = arg0;
	}
}
