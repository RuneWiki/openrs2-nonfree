import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public abstract class Class105 {

	@OriginalMember(owner = "client!so", name = "c", descriptor = "I")
	public final int anInt7370;

	@OriginalMember(owner = "client!so", name = "a", descriptor = "I")
	public final int anInt7368;

	@OriginalMember(owner = "client!so", name = "f", descriptor = "I")
	protected final int anInt7373;

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "(III)V")
	protected Class105(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt7370 = arg1;
		this.anInt7368 = arg0;
		this.anInt7373 = arg2;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IIB)V")
	public abstract void method5922(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!so", name = "b", descriptor = "(IIB)V")
	public abstract void method5927(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IZI)V")
	public abstract void method5928(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);
}
