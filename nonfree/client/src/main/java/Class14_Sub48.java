import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public final class Class14_Sub48 extends Class14 {

	@OriginalMember(owner = "client!ro", name = "l", descriptor = "I")
	public final int anInt9069;

	@OriginalMember(owner = "client!ro", name = "o", descriptor = "I")
	public final int anInt9072;

	@OriginalMember(owner = "client!ro", name = "<init>", descriptor = "(II)V")
	public Class14_Sub48(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt9069 = arg0;
		this.anInt9072 = arg1;
	}
}
