import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public final class Class8_Sub3 extends Class8 {

	@OriginalMember(owner = "client!as", name = "j", descriptor = "I")
	public final int anInt1034;

	@OriginalMember(owner = "client!as", name = "m", descriptor = "I")
	public final int anInt1037;

	@OriginalMember(owner = "client!as", name = "<init>", descriptor = "(II)V")
	public Class8_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1034 = arg1;
		this.anInt1037 = arg0;
	}
}
