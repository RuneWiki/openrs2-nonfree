import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lba")
public abstract class Class182 {

	@OriginalMember(owner = "client!lba", name = "e", descriptor = "I")
	public final int anInt7941;

	@OriginalMember(owner = "client!lba", name = "f", descriptor = "I")
	protected final int anInt7942;

	@OriginalMember(owner = "client!lba", name = "c", descriptor = "I")
	public final int anInt7939;

	@OriginalMember(owner = "client!lba", name = "<init>", descriptor = "(III)V")
	protected Class182(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt7941 = arg1;
		this.anInt7942 = arg2;
		this.anInt7939 = arg0;
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(IBI)V")
	public abstract void method6581(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(IIB)V")
	public abstract void method6584(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(III)V")
	public abstract void method6586(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
