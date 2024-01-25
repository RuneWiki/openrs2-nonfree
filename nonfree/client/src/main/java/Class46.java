import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public abstract class Class46 {

	@OriginalMember(owner = "client!cs", name = "g", descriptor = "I")
	public final int anInt7292;

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "I")
	public final int anInt7287;

	@OriginalMember(owner = "client!cs", name = "d", descriptor = "I")
	protected final int anInt7289;

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(III)V")
	protected Class46(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt7292 = arg0;
		this.anInt7287 = arg1;
		this.anInt7289 = arg2;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIB)V")
	public abstract void method5891(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(III)V")
	public abstract void method5892(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "(III)V")
	public abstract void method5893(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
