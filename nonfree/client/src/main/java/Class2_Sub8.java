import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bha")
public final class Class2_Sub8 extends Class2 {

	@OriginalMember(owner = "client!bha", name = "l", descriptor = "I")
	public final int anInt938;

	@OriginalMember(owner = "client!bha", name = "h", descriptor = "I")
	public final int anInt936;

	@OriginalMember(owner = "client!bha", name = "<init>", descriptor = "(II)V")
	public Class2_Sub8(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt938 = arg1;
		this.anInt936 = arg0;
	}
}
