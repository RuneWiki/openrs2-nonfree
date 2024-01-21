import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public final class Class2_Sub21 extends Class2 {

	@OriginalMember(owner = "client!q", name = "u", descriptor = "I")
	public final int anInt3094;

	@OriginalMember(owner = "client!q", name = "n", descriptor = "I")
	public final int anInt3091;

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "(II)V")
	public Class2_Sub21(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3094 = arg1;
		this.anInt3091 = arg0;
	}
}
