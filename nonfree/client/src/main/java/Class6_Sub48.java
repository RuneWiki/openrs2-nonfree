import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public final class Class6_Sub48 extends Class6 {

	@OriginalMember(owner = "client!sk", name = "i", descriptor = "I")
	public final int anInt9090;

	@OriginalMember(owner = "client!sk", name = "j", descriptor = "I")
	public final int anInt9085;

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(II)V")
	public Class6_Sub48(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt9090 = arg0;
		this.anInt9085 = arg1;
	}
}
