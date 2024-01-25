import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public final class Class3_Sub46 extends Class3 {

	@OriginalMember(owner = "client!vi", name = "k", descriptor = "I")
	public final int anInt7258;

	@OriginalMember(owner = "client!vi", name = "j", descriptor = "I")
	public final int anInt7257;

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(II)V")
	public Class3_Sub46(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7258 = arg1;
		this.anInt7257 = arg0;
	}
}
