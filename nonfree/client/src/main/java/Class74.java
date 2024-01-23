import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public abstract class Class74 {

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
	protected int anInt6022;

	@OriginalMember(owner = "client!ia", name = "m", descriptor = "I")
	public int anInt6030;

	@OriginalMember(owner = "client!ia", name = "j", descriptor = "I")
	public int anInt6029;

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(III)V")
	protected Class74(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6022 = arg2;
		this.anInt6030 = arg1;
		this.anInt6029 = arg0;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(III)V")
	public abstract void method4816(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(III)V")
	public abstract void method4818(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "(III)V")
	public abstract void method4820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
