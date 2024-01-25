import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public final class Class3_Sub29 extends Class3 {

	@OriginalMember(owner = "client!ls", name = "l", descriptor = "I")
	public final int anInt3940;

	@OriginalMember(owner = "client!ls", name = "s", descriptor = "I")
	public final int anInt3946;

	@OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(II)V")
	public Class3_Sub29(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3940 = arg1;
		this.anInt3946 = arg0;
	}
}
