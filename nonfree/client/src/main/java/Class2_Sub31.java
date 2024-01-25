import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public final class Class2_Sub31 extends Class2 {

	@OriginalMember(owner = "client!oo", name = "o", descriptor = "I")
	public final int anInt5175;

	@OriginalMember(owner = "client!oo", name = "m", descriptor = "I")
	public int anInt5174;

	@OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(II)V")
	public Class2_Sub31(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5175 = arg0;
		this.anInt5174 = arg1;
	}
}
