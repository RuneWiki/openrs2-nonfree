import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public final class Class2_Sub15 extends Class2 {

	@OriginalMember(owner = "client!ma", name = "P", descriptor = "I")
	public final int anInt1862;

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(I)V")
	public Class2_Sub15(@OriginalArg(0) int arg0) {
		this.anInt1862 = arg0;
	}
}
