import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public abstract class Class95 {

	@OriginalMember(owner = "client!og", name = "e", descriptor = "I")
	public int anInt4991;

	@OriginalMember(owner = "client!og", name = "j", descriptor = "I")
	protected int anInt4994;

	@OriginalMember(owner = "client!og", name = "k", descriptor = "I")
	public int anInt4995;

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "(III)V")
	protected Class95(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4991 = arg0;
		this.anInt4994 = arg2;
		this.anInt4995 = arg1;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(III)V")
	public abstract void method3990(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIZ)V")
	public abstract void method3991(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(BII)V")
	public abstract void method3993(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
