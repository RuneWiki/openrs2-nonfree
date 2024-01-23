import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public final class Class2_Sub18 extends Class2 {

	@OriginalMember(owner = "client!ke", name = "p", descriptor = "I")
	public int anInt3262;

	@OriginalMember(owner = "client!ke", name = "l", descriptor = "I")
	public int anInt3259;

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(II)V")
	public Class2_Sub18(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3262 = arg1;
		this.anInt3259 = arg0;
	}
}
