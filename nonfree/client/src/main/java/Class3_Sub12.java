import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public final class Class3_Sub12 extends Class3 {

	@OriginalMember(owner = "client!bt", name = "m", descriptor = "I")
	public final int anInt1506;

	@OriginalMember(owner = "client!bt", name = "l", descriptor = "I")
	public final int anInt1505;

	@OriginalMember(owner = "client!bt", name = "<init>", descriptor = "(II)V")
	public Class3_Sub12(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1506 = arg0;
		this.anInt1505 = arg1;
	}
}
