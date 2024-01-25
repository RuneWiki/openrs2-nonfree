import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public final class Class2_Sub48 extends Class2 {

	@OriginalMember(owner = "client!qo", name = "q", descriptor = "I")
	public final int anInt8383;

	@OriginalMember(owner = "client!qo", name = "n", descriptor = "I")
	public int anInt8384;

	@OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(II)V")
	public Class2_Sub48(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt8383 = arg0;
		this.anInt8384 = arg1;
	}
}
