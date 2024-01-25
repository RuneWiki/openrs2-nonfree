import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public abstract class Class74 {

	@OriginalMember(owner = "client!qo", name = "g", descriptor = "I")
	public final int anInt8750;

	@OriginalMember(owner = "client!qo", name = "e", descriptor = "I")
	public final int anInt8751;

	@OriginalMember(owner = "client!qo", name = "f", descriptor = "I")
	protected final int anInt8749;

	@OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(III)V")
	protected Class74(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt8750 = arg0;
		this.anInt8751 = arg1;
		this.anInt8749 = arg2;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(III)V")
	public abstract void method7570(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IBI)V")
	public abstract void method7572(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "(III)V")
	public abstract void method7574(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
