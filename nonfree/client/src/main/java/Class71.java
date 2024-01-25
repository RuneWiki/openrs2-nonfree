import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public abstract class Class71 {

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
	public final int anInt8462;

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "I")
	protected final int anInt8461;

	@OriginalMember(owner = "client!jk", name = "g", descriptor = "I")
	public final int anInt8466;

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(III)V")
	protected Class71(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt8462 = arg0;
		this.anInt8461 = arg2;
		this.anInt8466 = arg1;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIB)V")
	public abstract void method6986(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(III)V")
	public abstract void method6988(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(BII)V")
	public abstract void method6990(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
