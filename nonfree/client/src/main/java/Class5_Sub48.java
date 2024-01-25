import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public final class Class5_Sub48 extends Class5 {

	@OriginalMember(owner = "client!re", name = "o", descriptor = "I")
	public final int anInt8138;

	@OriginalMember(owner = "client!re", name = "s", descriptor = "I")
	public final int anInt8137;

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "(II)V")
	public Class5_Sub48(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt8138 = arg1;
		this.anInt8137 = arg0;
	}
}
