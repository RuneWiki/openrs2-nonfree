import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public final class Class1_Sub19 extends Class1 {

	@OriginalMember(owner = "client!im", name = "t", descriptor = "I")
	public final int anInt3052;

	@OriginalMember(owner = "client!im", name = "v", descriptor = "I")
	public final int anInt3054;

	@OriginalMember(owner = "client!im", name = "q", descriptor = "I")
	public final int anInt3050;

	@OriginalMember(owner = "client!im", name = "r", descriptor = "Z")
	public final boolean aBoolean240;

	@OriginalMember(owner = "client!im", name = "u", descriptor = "I")
	public final int anInt3053;

	@OriginalMember(owner = "client!im", name = "p", descriptor = "I")
	public final int anInt3049;

	@OriginalMember(owner = "client!im", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class1_Sub19(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt3052 = arg1;
		this.anInt3054 = arg4;
		this.anInt3050 = arg2;
		this.aBoolean240 = arg5;
		this.anInt3053 = arg3;
		this.anInt3049 = arg0;
	}
}
