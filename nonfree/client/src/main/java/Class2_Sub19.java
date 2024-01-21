import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public final class Class2_Sub19 extends Class2 {

	@OriginalMember(owner = "client!ph", name = "r", descriptor = "I")
	public final int anInt3328;

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(I)V")
	public Class2_Sub19(@OriginalArg(0) int arg0) {
		this.anInt3328 = arg0;
	}
}
