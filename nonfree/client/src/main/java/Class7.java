import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public abstract class Class7 {

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
	public int anInt2102;

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
	public int anInt2105;

	@OriginalMember(owner = "client!ag", name = "f", descriptor = "I")
	public int anInt2107;

	@OriginalMember(owner = "client!ag", name = "g", descriptor = "I")
	public int anInt2108;

	@OriginalMember(owner = "client!ag", name = "h", descriptor = "I")
	public int anInt2109;

	@OriginalMember(owner = "client!ag", name = "i", descriptor = "I")
	public int anInt2110;

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "()V")
	protected Class7() {
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(III)V")
	public abstract void method1520(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)V")
	public abstract void method1521(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
