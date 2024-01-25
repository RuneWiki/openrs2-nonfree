import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public final class Class2_Sub6 extends Class2 {

	@OriginalMember(owner = "client!bb", name = "i", descriptor = "I")
	public int anInt841;

	@OriginalMember(owner = "client!bb", name = "k", descriptor = "I")
	public final int anInt842;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(II)V")
	public Class2_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt841 = arg1;
		this.anInt842 = arg0;
	}
}
