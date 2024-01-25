import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kfa")
public final class Class3_Sub31 extends Class3 {

	@OriginalMember(owner = "client!kfa", name = "t", descriptor = "I")
	public int anInt5291;

	@OriginalMember(owner = "client!kfa", name = "u", descriptor = "I")
	public final int anInt5292;

	@OriginalMember(owner = "client!kfa", name = "<init>", descriptor = "(II)V")
	public Class3_Sub31(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5291 = arg1;
		this.anInt5292 = arg0;
	}
}
