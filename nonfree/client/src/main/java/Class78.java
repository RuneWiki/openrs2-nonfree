import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!faa")
public abstract class Class78 {

	@OriginalMember(owner = "client!faa", name = "b", descriptor = "I")
	public final int anInt7670;

	@OriginalMember(owner = "client!faa", name = "c", descriptor = "I")
	public final int anInt7671;

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "I")
	protected final int anInt7669;

	@OriginalMember(owner = "client!faa", name = "<init>", descriptor = "(III)V")
	protected Class78(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt7670 = arg1;
		this.anInt7671 = arg0;
		this.anInt7669 = arg2;
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(BII)V")
	public abstract void method6316(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(IBI)V")
	public abstract void method6317(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(III)V")
	public abstract void method6318(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
