import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public abstract class Class27 {

	@OriginalMember(owner = "client!bl", name = "j", descriptor = "I")
	public final int anInt6262;

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "I")
	public final int anInt6257;

	@OriginalMember(owner = "client!bl", name = "m", descriptor = "I")
	protected final int anInt6265;

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(III)V")
	protected Class27(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6262 = arg0;
		this.anInt6257 = arg1;
		this.anInt6265 = arg2;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(III)V")
	public abstract void method5360(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IZI)V")
	public abstract void method5361(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(III)V")
	public abstract void method5366(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
