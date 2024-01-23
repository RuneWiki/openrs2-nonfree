import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public abstract class Class31 {

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "I")
	public int anInt5792;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
	protected int anInt5791;

	@OriginalMember(owner = "client!kd", name = "h", descriptor = "I")
	public int anInt5797;

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(III)V")
	protected Class31(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5792 = arg0;
		this.anInt5791 = arg2;
		this.anInt5797 = arg1;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZII)V")
	public abstract void method4426(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IZI)V")
	public abstract void method4428(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(BII)V")
	public abstract void method4431(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
