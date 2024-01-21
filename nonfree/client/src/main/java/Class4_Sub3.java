import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public final class Class4_Sub3 extends Class4 {

	@OriginalMember(owner = "client!ba", name = "x", descriptor = "I")
	public final int anInt162;

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(I)V")
	public Class4_Sub3(@OriginalArg(0) int arg0) {
		this.anInt162 = arg0;
	}
}
