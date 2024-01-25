import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public final class Class9_Sub5 extends Class9 {

	@OriginalMember(owner = "client!gi", name = "k", descriptor = "I")
	public final int anInt3366;

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(I)V")
	public Class9_Sub5(@OriginalArg(0) int arg0) {
		this.anInt3366 = arg0;
	}
}
