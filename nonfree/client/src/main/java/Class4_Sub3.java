import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ada")
public final class Class4_Sub3 extends Class4 {

	@OriginalMember(owner = "client!ada", name = "j", descriptor = "I")
	public final int anInt180;

	@OriginalMember(owner = "client!ada", name = "l", descriptor = "I")
	public final int anInt181;

	@OriginalMember(owner = "client!ada", name = "<init>", descriptor = "(II)V")
	public Class4_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt180 = arg0;
		this.anInt181 = arg1;
	}
}
