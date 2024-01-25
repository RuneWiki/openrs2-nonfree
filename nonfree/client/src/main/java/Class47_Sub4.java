import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public abstract class Class47_Sub4 extends Class47 {

	@OriginalMember(owner = "client!hu", name = "m", descriptor = "I")
	protected int anInt8077;

	@OriginalMember(owner = "client!hu", name = "k", descriptor = "I")
	protected final int anInt8075;

	@OriginalMember(owner = "client!hu", name = "i", descriptor = "I")
	protected int anInt8073;

	@OriginalMember(owner = "client!hu", name = "j", descriptor = "I")
	public final int anInt8074;

	@OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(IIII)V")
	protected Class47_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8077 = arg2;
		this.anInt8075 = arg1;
		this.anInt8073 = arg0;
		this.anInt8074 = arg3;
	}
}
