import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public abstract class Class71 {

	@OriginalMember(owner = "client!ev", name = "h", descriptor = "I")
	protected final int anInt6817;

	@OriginalMember(owner = "client!ev", name = "g", descriptor = "I")
	public final int anInt6816;

	@OriginalMember(owner = "client!ev", name = "e", descriptor = "I")
	public final int anInt6815;

	@OriginalMember(owner = "client!ev", name = "<init>", descriptor = "(III)V")
	protected Class71(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6817 = arg2;
		this.anInt6816 = arg1;
		this.anInt6815 = arg0;
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(IIZ)V")
	public abstract void method5331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(IBI)V")
	public abstract void method5333(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(III)V")
	public abstract void method5334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
