import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public final class Class2_Sub50 extends Class2 {

	@OriginalMember(owner = "client!va", name = "k", descriptor = "I")
	public final int anInt9585;

	@OriginalMember(owner = "client!va", name = "l", descriptor = "I")
	public final int anInt9586;

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "(II)V")
	public Class2_Sub50(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt9585 = arg1;
		this.anInt9586 = arg0;
	}
}
