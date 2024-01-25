import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public abstract class Class24_Sub4 extends Class24 {

	@OriginalMember(owner = "client!lv", name = "n", descriptor = "Z")
	public boolean aBoolean370 = false;

	@OriginalMember(owner = "client!lv", name = "m", descriptor = "Z")
	public boolean aBoolean369 = false;

	@OriginalMember(owner = "client!lv", name = "o", descriptor = "I")
	protected int anInt5734;

	@OriginalMember(owner = "client!lv", name = "s", descriptor = "I")
	protected int anInt5738;

	@OriginalMember(owner = "client!lv", name = "l", descriptor = "I")
	protected final int anInt5733;

	@OriginalMember(owner = "client!lv", name = "i", descriptor = "S")
	public final short aShort78;

	@OriginalMember(owner = "client!lv", name = "<init>", descriptor = "(IIIIZZ)V")
	protected Class24_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		this.anInt5734 = arg2;
		this.anInt5738 = arg0;
		this.aBoolean369 = arg5;
		this.anInt5733 = arg1;
		this.aShort78 = (short) arg3;
		this.aBoolean370 = arg4;
	}
}
