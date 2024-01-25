import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public abstract class Class85 {

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "I")
	protected final int anInt7168;

	@OriginalMember(owner = "client!ge", name = "g", descriptor = "I")
	public final int anInt7170;

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
	public final int anInt7166;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(III)V")
	protected Class85(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt7168 = arg2;
		this.anInt7170 = arg1;
		this.anInt7166 = arg0;
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(III)V")
	public abstract void method5867(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IBI)V")
	public abstract void method5869(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIB)V")
	public abstract void method5870(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
