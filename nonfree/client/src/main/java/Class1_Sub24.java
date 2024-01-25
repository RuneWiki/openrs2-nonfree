import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public final class Class1_Sub24 extends Class1 {

	@OriginalMember(owner = "client!is", name = "p", descriptor = "I")
	public final int anInt3038;

	@OriginalMember(owner = "client!is", name = "s", descriptor = "I")
	public final int anInt3041;

	@OriginalMember(owner = "client!is", name = "<init>", descriptor = "(II)V")
	public Class1_Sub24(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3038 = arg0;
		this.anInt3041 = arg1;
	}
}
