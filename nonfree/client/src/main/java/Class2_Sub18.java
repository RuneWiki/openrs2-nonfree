import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gba")
public final class Class2_Sub18 extends Class2 {

	@OriginalMember(owner = "client!gba", name = "u", descriptor = "I")
	public final int anInt4168;

	@OriginalMember(owner = "client!gba", name = "o", descriptor = "I")
	public final int anInt4164;

	@OriginalMember(owner = "client!gba", name = "<init>", descriptor = "(II)V")
	public Class2_Sub18(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4168 = arg1;
		this.anInt4164 = arg0;
	}
}
