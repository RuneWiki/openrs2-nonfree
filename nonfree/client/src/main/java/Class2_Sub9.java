import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public final class Class2_Sub9 extends Class2 {

	@OriginalMember(owner = "client!hb", name = "r", descriptor = "I")
	public final int anInt2084;

	@OriginalMember(owner = "client!hb", name = "u", descriptor = "I")
	public final int anInt2085;

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(II)V")
	public Class2_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2084 = arg1;
		this.anInt2085 = arg0;
	}
}
