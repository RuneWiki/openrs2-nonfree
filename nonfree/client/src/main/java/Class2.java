import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public abstract class Class2 {

	@OriginalMember(owner = "client!vh", name = "i", descriptor = "I")
	public int anInt4979;

	@OriginalMember(owner = "client!vh", name = "g", descriptor = "I")
	public int anInt4977;

	@OriginalMember(owner = "client!vh", name = "h", descriptor = "I")
	protected int anInt4978;

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(III)V")
	protected Class2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4979 = arg1;
		this.anInt4977 = arg0;
		this.anInt4978 = arg2;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IBI)V")
	public abstract void method4154(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(III)V")
	public abstract void method4157(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(IBI)V")
	public abstract void method4158(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);
}
