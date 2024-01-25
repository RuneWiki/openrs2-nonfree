import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public final class Class3_Sub32 extends Class3 {

	@OriginalMember(owner = "client!kn", name = "o", descriptor = "I")
	public int anInt5957;

	@OriginalMember(owner = "client!kn", name = "j", descriptor = "I")
	public final int anInt5954;

	@OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(II)V")
	public Class3_Sub32(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5957 = arg1;
		this.anInt5954 = arg0;
	}
}
