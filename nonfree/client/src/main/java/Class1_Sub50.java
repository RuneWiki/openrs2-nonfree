import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public final class Class1_Sub50 extends Class1 {

	@OriginalMember(owner = "client!ve", name = "q", descriptor = "I")
	public final int anInt9064;

	@OriginalMember(owner = "client!ve", name = "i", descriptor = "I")
	public final int anInt9059;

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(II)V")
	public Class1_Sub50(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt9064 = arg1;
		this.anInt9059 = arg0;
	}
}
