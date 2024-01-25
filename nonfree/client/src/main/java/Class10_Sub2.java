import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public abstract class Class10_Sub2 extends Class10 {

	@OriginalMember(owner = "client!dk", name = "d", descriptor = "I")
	public final int anInt8054;

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "I")
	protected final int anInt8052;

	@OriginalMember(owner = "client!dk", name = "h", descriptor = "I")
	protected int anInt8057;

	@OriginalMember(owner = "client!dk", name = "f", descriptor = "I")
	protected int anInt8055;

	@OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(IIII)V")
	protected Class10_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8054 = arg3;
		this.anInt8052 = arg1;
		this.anInt8057 = arg2;
		this.anInt8055 = arg0;
	}
}
