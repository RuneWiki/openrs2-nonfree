import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public final class Class2_Sub51 extends Class2 {

	@OriginalMember(owner = "client!wb", name = "k", descriptor = "I")
	public final int anInt9369;

	@OriginalMember(owner = "client!wb", name = "j", descriptor = "I")
	public final int anInt9368;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(II)V")
	public Class2_Sub51(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt9369 = arg0;
		this.anInt9368 = arg1;
	}
}
