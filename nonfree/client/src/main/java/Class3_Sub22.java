import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public final class Class3_Sub22 extends Class3 {

	@OriginalMember(owner = "client!jg", name = "o", descriptor = "I")
	public int anInt3745;

	@OriginalMember(owner = "client!jg", name = "n", descriptor = "I")
	public final int anInt3744;

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(II)V")
	public Class3_Sub22(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3745 = arg1;
		this.anInt3744 = arg0;
	}
}
