import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public final class Class2_Sub17 extends Class2 {

	@OriginalMember(owner = "client!na", name = "E", descriptor = "I")
	public final int anInt2516;

	@OriginalMember(owner = "client!na", name = "z", descriptor = "I")
	public final int anInt2512;

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "(II)V")
	public Class2_Sub17(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2516 = arg1;
		this.anInt2512 = arg0;
	}
}
