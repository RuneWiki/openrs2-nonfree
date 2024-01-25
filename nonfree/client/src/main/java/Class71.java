import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public abstract class Class71 {

	@OriginalMember(owner = "client!m", name = "d", descriptor = "I")
	public final int anInt6721;

	@OriginalMember(owner = "client!m", name = "c", descriptor = "I")
	public final int anInt6720;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "I")
	protected final int anInt6719;

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "(III)V")
	protected Class71(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6721 = arg1;
		this.anInt6720 = arg0;
		this.anInt6719 = arg2;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(III)V")
	public abstract void method5892(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(III)V")
	public abstract void method5893(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IIB)V")
	public abstract void method5894(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
