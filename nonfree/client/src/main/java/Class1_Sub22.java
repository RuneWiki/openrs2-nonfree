import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public final class Class1_Sub22 extends Class1 {

	@OriginalMember(owner = "client!ic", name = "k", descriptor = "I")
	public final int anInt3023;

	@OriginalMember(owner = "client!ic", name = "n", descriptor = "I")
	public int anInt3025;

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(II)V")
	public Class1_Sub22(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3023 = arg0;
		this.anInt3025 = arg1;
	}
}
