import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ida")
public abstract class Class55 {

	@OriginalMember(owner = "client!ida", name = "h", descriptor = "I")
	public final int anInt7982;

	@OriginalMember(owner = "client!ida", name = "d", descriptor = "I")
	protected final int anInt7978;

	@OriginalMember(owner = "client!ida", name = "c", descriptor = "I")
	public final int anInt7977;

	@OriginalMember(owner = "client!ida", name = "<init>", descriptor = "(III)V")
	protected Class55(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt7982 = arg0;
		this.anInt7978 = arg2;
		this.anInt7977 = arg1;
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(III)V")
	public abstract void method6989(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(BII)V")
	public abstract void method6991(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ida", name = "b", descriptor = "(BII)V")
	public abstract void method6994(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
