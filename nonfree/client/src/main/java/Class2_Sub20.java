import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public final class Class2_Sub20 extends Class2 {

	@OriginalMember(owner = "client!jc", name = "p", descriptor = "I")
	public final int anInt3352;

	@OriginalMember(owner = "client!jc", name = "u", descriptor = "I")
	public final int anInt3354;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(II)V")
	public Class2_Sub20(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3352 = arg0;
		this.anInt3354 = arg1;
	}
}
