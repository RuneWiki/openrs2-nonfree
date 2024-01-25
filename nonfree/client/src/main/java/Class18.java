import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public abstract class Class18 {

	@OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
	public final int anInt3162;

	@OriginalMember(owner = "client!ba", name = "e", descriptor = "I")
	protected final int anInt3161;

	@OriginalMember(owner = "client!ba", name = "h", descriptor = "I")
	public final int anInt3164;

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(III)V")
	protected Class18(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3162 = arg1;
		this.anInt3161 = arg2;
		this.anInt3164 = arg0;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IZI)V")
	public abstract void method2847(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(III)V")
	public abstract void method2849(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(BII)V")
	public abstract void method2850(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
