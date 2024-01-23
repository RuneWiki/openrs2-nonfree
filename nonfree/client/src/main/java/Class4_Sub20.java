import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public final class Class4_Sub20 extends Class4 {

	@OriginalMember(owner = "client!le", name = "m", descriptor = "I")
	public int anInt3041;

	@OriginalMember(owner = "client!le", name = "p", descriptor = "I")
	public int anInt3044;

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "(II)V")
	public Class4_Sub20(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3041 = arg0;
		this.anInt3044 = arg1;
	}
}
