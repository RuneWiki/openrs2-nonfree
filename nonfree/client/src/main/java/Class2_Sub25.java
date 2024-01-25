import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public final class Class2_Sub25 extends Class2 {

	@OriginalMember(owner = "client!iu", name = "m", descriptor = "I")
	public final int anInt3092;

	@OriginalMember(owner = "client!iu", name = "k", descriptor = "I")
	public final int anInt3091;

	@OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(II)V")
	public Class2_Sub25(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3092 = arg1;
		this.anInt3091 = arg0;
	}
}
