import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tba")
public final class Class6_Sub45 extends Class6 {

	@OriginalMember(owner = "client!tba", name = "j", descriptor = "I")
	public final int anInt8089;

	@OriginalMember(owner = "client!tba", name = "m", descriptor = "I")
	public final int anInt8092;

	@OriginalMember(owner = "client!tba", name = "<init>", descriptor = "(II)V")
	public Class6_Sub45(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt8089 = arg1;
		this.anInt8092 = arg0;
	}
}
