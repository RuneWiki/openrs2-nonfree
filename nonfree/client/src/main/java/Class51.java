import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public abstract class Class51 {

	@OriginalMember(owner = "client!di", name = "a", descriptor = "I")
	public final int anInt7223;

	@OriginalMember(owner = "client!di", name = "i", descriptor = "I")
	protected final int anInt7228;

	@OriginalMember(owner = "client!di", name = "e", descriptor = "I")
	public final int anInt7226;

	@OriginalMember(owner = "client!di", name = "<init>", descriptor = "(III)V")
	protected Class51(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt7223 = arg1;
		this.anInt7228 = arg2;
		this.anInt7226 = arg0;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(III)V")
	public abstract void method5807(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!di", name = "b", descriptor = "(III)V")
	public abstract void method5809(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IZI)V")
	public abstract void method5810(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);
}
