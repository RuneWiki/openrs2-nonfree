import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public final class Class1_Sub21 extends Class1 {

	@OriginalMember(owner = "client!qb", name = "x", descriptor = "I")
	public final int anInt3504;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(I)V")
	public Class1_Sub21(@OriginalArg(0) int arg0) {
		this.anInt3504 = arg0;
	}
}
