import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public final class Class1_Sub22 extends Class1 {

	@OriginalMember(owner = "client!mf", name = "v", descriptor = "I")
	public int anInt3472;

	@OriginalMember(owner = "client!mf", name = "u", descriptor = "I")
	public int anInt3471;

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(II)V")
	public Class1_Sub22(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3472 = arg0;
		this.anInt3471 = arg1;
	}
}
