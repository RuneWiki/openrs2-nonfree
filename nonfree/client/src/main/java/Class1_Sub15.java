import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public final class Class1_Sub15 extends Class1 {

	@OriginalMember(owner = "client!mg", name = "s", descriptor = "I")
	public final int anInt3020;

	@OriginalMember(owner = "client!mg", name = "v", descriptor = "I")
	public final int anInt3022;

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(II)V")
	public Class1_Sub15(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3020 = arg0;
		this.anInt3022 = arg1;
	}
}
