import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public final class Class2_Sub5 extends Class2 {

	@OriginalMember(owner = "client!al", name = "q", descriptor = "I")
	public final int anInt247;

	@OriginalMember(owner = "client!al", name = "w", descriptor = "I")
	public final int anInt251;

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(II)V")
	public Class2_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt247 = arg0;
		this.anInt251 = arg1;
	}
}
