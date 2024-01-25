import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public final class Class2_Sub34 extends Class2 {

	@OriginalMember(owner = "client!rh", name = "t", descriptor = "I")
	public int anInt5603;

	@OriginalMember(owner = "client!rh", name = "p", descriptor = "I")
	public final int anInt5599;

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(II)V")
	public Class2_Sub34(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5603 = arg1;
		this.anInt5599 = arg0;
	}
}
