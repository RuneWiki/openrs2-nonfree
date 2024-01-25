import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public abstract class Class155 {

	@OriginalMember(owner = "client!mp", name = "g", descriptor = "I")
	public final int anInt6668;

	@OriginalMember(owner = "client!mp", name = "b", descriptor = "I")
	protected final int anInt6664;

	@OriginalMember(owner = "client!mp", name = "f", descriptor = "I")
	public final int anInt6667;

	@OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(III)V")
	protected Class155(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6668 = arg1;
		this.anInt6664 = arg2;
		this.anInt6667 = arg0;
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(IIB)V")
	public abstract void method5518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(III)V")
	public abstract void method5520(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(BII)V")
	public abstract void method5523(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
