import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public final class Class1_Sub3 extends Class1 {

	@OriginalMember(owner = "client!ah", name = "G", descriptor = "I")
	public final int anInt348;

	@OriginalMember(owner = "client!ah", name = "A", descriptor = "I")
	public final int anInt346;

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(II)V")
	public Class1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt348 = arg1;
		this.anInt346 = arg0;
	}
}
