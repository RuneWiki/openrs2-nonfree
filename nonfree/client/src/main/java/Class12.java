import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public abstract class Class12 {

	@OriginalMember(owner = "client!td", name = "j", descriptor = "I")
	protected int anInt5933;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "I")
	public int anInt5927;

	@OriginalMember(owner = "client!td", name = "g", descriptor = "I")
	public int anInt5930;

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "(III)V")
	protected Class12(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5933 = arg2;
		this.anInt5927 = arg0;
		this.anInt5930 = arg1;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIB)V")
	public abstract void method4660(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(III)V")
	public abstract void method4663(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(III)V")
	public abstract void method4665(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
