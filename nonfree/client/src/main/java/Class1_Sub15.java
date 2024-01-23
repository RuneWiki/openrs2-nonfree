import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public final class Class1_Sub15 extends Class1 {

	@OriginalMember(owner = "client!id", name = "C", descriptor = "I")
	public int anInt2418;

	@OriginalMember(owner = "client!id", name = "w", descriptor = "I")
	public int anInt2413;

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "(II)V")
	public Class1_Sub15(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2418 = arg0;
		this.anInt2413 = arg1;
	}
}
