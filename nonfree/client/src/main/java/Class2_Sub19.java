import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public final class Class2_Sub19 extends Class2 {

	@OriginalMember(owner = "client!od", name = "v", descriptor = "I")
	public int anInt3248;

	@OriginalMember(owner = "client!od", name = "F", descriptor = "I")
	public int anInt3251;

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "(II)V")
	public Class2_Sub19(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3248 = arg1;
		this.anInt3251 = arg0;
	}
}
