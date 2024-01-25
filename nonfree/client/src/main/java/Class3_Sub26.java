import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gla")
public final class Class3_Sub26 extends Class3 {

	@OriginalMember(owner = "client!gla", name = "j", descriptor = "I")
	public final int anInt3562;

	@OriginalMember(owner = "client!gla", name = "o", descriptor = "I")
	public final int anInt3563;

	@OriginalMember(owner = "client!gla", name = "<init>", descriptor = "(II)V")
	public Class3_Sub26(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3562 = arg0;
		this.anInt3563 = arg1;
	}
}
