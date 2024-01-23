import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public abstract class Class25 {

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
	public int anInt4034;

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
	protected int anInt4035;

	@OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
	public int anInt4038;

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(III)V")
	protected Class25(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4034 = arg0;
		this.anInt4035 = arg2;
		this.anInt4038 = arg1;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(III)V")
	public abstract void method3008(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(III)V")
	public abstract void method3012(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IZI)V")
	public abstract void method3013(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);
}
