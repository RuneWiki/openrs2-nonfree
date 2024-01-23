import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public final class Class1_Sub28 extends Class1 {

	@OriginalMember(owner = "client!sk", name = "l", descriptor = "I")
	public int anInt5025;

	@OriginalMember(owner = "client!sk", name = "p", descriptor = "I")
	public int anInt5028;

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(II)V")
	public Class1_Sub28(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5025 = arg0;
		this.anInt5028 = arg1;
	}
}
