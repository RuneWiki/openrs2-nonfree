import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lea")
public abstract class Class111 {

	@OriginalMember(owner = "client!lea", name = "c", descriptor = "I")
	protected final int anInt9310;

	@OriginalMember(owner = "client!lea", name = "b", descriptor = "I")
	public final int anInt9309;

	@OriginalMember(owner = "client!lea", name = "d", descriptor = "I")
	public final int anInt9311;

	@OriginalMember(owner = "client!lea", name = "<init>", descriptor = "(III)V")
	protected Class111(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt9310 = arg2;
		this.anInt9309 = arg0;
		this.anInt9311 = arg1;
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(III)V")
	public abstract void method7711(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIB)V")
	public abstract void method7713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(IZI)V")
	public abstract void method7714(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);
}
