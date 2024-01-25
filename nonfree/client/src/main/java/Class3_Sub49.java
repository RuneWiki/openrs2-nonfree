import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public final class Class3_Sub49 extends Class3 {

	@OriginalMember(owner = "client!vo", name = "p", descriptor = "I")
	public final int anInt9023;

	@OriginalMember(owner = "client!vo", name = "j", descriptor = "I")
	public final int anInt9020;

	@OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(II)V")
	public Class3_Sub49(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt9023 = arg1;
		this.anInt9020 = arg0;
	}
}
