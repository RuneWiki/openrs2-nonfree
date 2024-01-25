import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public final class Class1_Sub48 extends Class1 {

	@OriginalMember(owner = "client!uu", name = "l", descriptor = "I")
	public final int anInt8503;

	@OriginalMember(owner = "client!uu", name = "n", descriptor = "I")
	public final int anInt8505;

	@OriginalMember(owner = "client!uu", name = "<init>", descriptor = "(II)V")
	public Class1_Sub48(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt8503 = arg0;
		this.anInt8505 = arg1;
	}
}
