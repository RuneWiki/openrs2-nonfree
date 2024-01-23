import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public final class Class1_Sub22 extends Class1 {

	@OriginalMember(owner = "client!pe", name = "u", descriptor = "I")
	public int anInt3373;

	@OriginalMember(owner = "client!pe", name = "H", descriptor = "I")
	public int anInt3381;

	@OriginalMember(owner = "client!pe", name = "D", descriptor = "I")
	public int anInt3379;

	@OriginalMember(owner = "client!pe", name = "p", descriptor = "I")
	public int anInt3372;

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(IIII)V")
	public Class1_Sub22(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3373 = arg0;
		this.anInt3381 = arg3;
		this.anInt3379 = arg1;
		this.anInt3372 = arg2;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIZ)Z")
	public boolean method2720(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anInt3373 <= arg1 && this.anInt3372 >= arg1 && arg0 >= this.anInt3379 && arg0 <= this.anInt3381;
	}
}
