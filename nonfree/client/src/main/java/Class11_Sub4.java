import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public abstract class Class11_Sub4 extends Class11 {

	@OriginalMember(owner = "client!kv", name = "j", descriptor = "I")
	protected int anInt5485;

	@OriginalMember(owner = "client!kv", name = "i", descriptor = "I")
	protected int anInt5484;

	@OriginalMember(owner = "client!kv", name = "h", descriptor = "I")
	protected final int anInt5483;

	@OriginalMember(owner = "client!kv", name = "g", descriptor = "I")
	public final int anInt5482;

	@OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(IIII)V")
	protected Class11_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5485 = arg2;
		this.anInt5484 = arg0;
		this.anInt5483 = arg1;
		this.anInt5482 = arg3;
	}
}
