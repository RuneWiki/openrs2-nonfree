import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public final class Class2_Sub17 extends Class2 {

	@OriginalMember(owner = "client!pa", name = "w", descriptor = "I")
	public final int anInt3173;

	@OriginalMember(owner = "client!pa", name = "z", descriptor = "I")
	public final int anInt3174;

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(II)V")
	public Class2_Sub17(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3173 = arg0;
		this.anInt3174 = arg1;
	}
}
