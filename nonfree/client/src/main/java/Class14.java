import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public abstract class Class14 {

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
	protected final int anInt6449;

	@OriginalMember(owner = "client!wb", name = "h", descriptor = "I")
	public final int anInt6452;

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "I")
	public final int anInt6450;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(III)V")
	protected Class14(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6449 = arg2;
		this.anInt6452 = arg0;
		this.anInt6450 = arg1;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(III)V")
	public abstract void method5440(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(BII)V")
	public abstract void method5442(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IBI)V")
	public abstract void method5443(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);
}
