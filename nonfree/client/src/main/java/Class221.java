import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public abstract class Class221 {

	@OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
	protected final int anInt8717;

	@OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
	public final int anInt8716;

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
	public final int anInt8713;

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(III)V")
	protected Class221(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt8717 = arg2;
		this.anInt8716 = arg0;
		this.anInt8713 = arg1;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IBI)V")
	public abstract void method7271(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(III)V")
	public abstract void method7274(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(III)V")
	public abstract void method7276(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
