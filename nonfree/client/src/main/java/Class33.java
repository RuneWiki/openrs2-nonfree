import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public abstract class Class33 {

	@OriginalMember(owner = "client!pn", name = "f", descriptor = "I")
	protected final int anInt7492;

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "I")
	public final int anInt7489;

	@OriginalMember(owner = "client!pn", name = "c", descriptor = "I")
	public final int anInt7490;

	@OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(III)V")
	protected Class33(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt7492 = arg2;
		this.anInt7489 = arg1;
		this.anInt7490 = arg0;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(III)V")
	public abstract void method6282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(III)V")
	public abstract void method6286(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!pn", name = "c", descriptor = "(III)V")
	public abstract void method6288(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
