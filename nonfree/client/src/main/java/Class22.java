import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public abstract class Class22 {

	@OriginalMember(owner = "client!cp", name = "h", descriptor = "I")
	public final int anInt7880;

	@OriginalMember(owner = "client!cp", name = "j", descriptor = "I")
	public final int anInt7882;

	@OriginalMember(owner = "client!cp", name = "f", descriptor = "I")
	protected final int anInt7878;

	@OriginalMember(owner = "client!cp", name = "<init>", descriptor = "(III)V")
	protected Class22(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt7880 = arg0;
		this.anInt7882 = arg1;
		this.anInt7878 = arg2;
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIZ)V")
	public abstract void method6561(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(III)V")
	public abstract void method6562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIB)V")
	public abstract void method6565(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
