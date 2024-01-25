import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fia")
public abstract class Class120 {

	@OriginalMember(owner = "client!fia", name = "g", descriptor = "I")
	public final int anInt10799;

	@OriginalMember(owner = "client!fia", name = "c", descriptor = "I")
	public final int anInt10802;

	@OriginalMember(owner = "client!fia", name = "h", descriptor = "I")
	protected final int anInt10803;

	@OriginalMember(owner = "client!fia", name = "<init>", descriptor = "(III)V")
	protected Class120(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt10799 = arg1;
		this.anInt10802 = arg0;
		this.anInt10803 = arg2;
	}

	@OriginalMember(owner = "client!fia", name = "b", descriptor = "(IBI)V")
	public abstract void method9430(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "(III)V")
	public abstract void method9432(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "(IBI)V")
	public abstract void method9433(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);
}
