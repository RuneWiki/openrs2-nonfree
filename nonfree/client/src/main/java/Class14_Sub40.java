import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public final class Class14_Sub40 extends Class14 {

	@OriginalMember(owner = "client!ol", name = "m", descriptor = "I")
	public final int anInt7711;

	@OriginalMember(owner = "client!ol", name = "o", descriptor = "I")
	public final int anInt7712;

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(II)V")
	public Class14_Sub40(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7711 = arg0;
		this.anInt7712 = arg1;
	}
}
