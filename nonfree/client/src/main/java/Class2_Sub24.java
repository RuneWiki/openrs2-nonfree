import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public final class Class2_Sub24 extends Class2 {

	@OriginalMember(owner = "client!we", name = "z", descriptor = "I")
	public final int anInt2944;

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "(I)V")
	public Class2_Sub24(@OriginalArg(0) int arg0) {
		this.anInt2944 = arg0;
	}
}
