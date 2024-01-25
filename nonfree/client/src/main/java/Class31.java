import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public abstract class Class31 {

	@OriginalMember(owner = "client!sr", name = "c", descriptor = "I")
	public final int anInt3955;

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "I")
	protected final int anInt3954;

	@OriginalMember(owner = "client!sr", name = "g", descriptor = "I")
	public final int anInt3958;

	@OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(III)V")
	protected Class31(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3955 = arg0;
		this.anInt3954 = arg2;
		this.anInt3958 = arg1;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIB)V")
	public abstract void method3541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(III)V")
	public abstract void method3543(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "(IIB)V")
	public abstract void method3544(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
