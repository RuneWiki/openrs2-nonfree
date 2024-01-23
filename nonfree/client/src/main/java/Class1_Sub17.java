import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public final class Class1_Sub17 extends Class1 {

	@OriginalMember(owner = "client!ki", name = "v", descriptor = "I")
	public int anInt3180;

	@OriginalMember(owner = "client!ki", name = "w", descriptor = "I")
	public int anInt3181;

	@OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(II)V")
	public Class1_Sub17(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3180 = arg0;
		this.anInt3181 = arg1;
	}
}
