import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public final class Class1_Sub39 extends Class1 {

	@OriginalMember(owner = "client!nd", name = "o", descriptor = "I")
	public final int anInt6022;

	@OriginalMember(owner = "client!nd", name = "p", descriptor = "I")
	public final int anInt6023;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(II)V")
	public Class1_Sub39(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6022 = arg0;
		this.anInt6023 = arg1;
	}
}
