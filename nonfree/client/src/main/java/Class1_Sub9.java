import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public final class Class1_Sub9 extends Class1 {

	@OriginalMember(owner = "client!cs", name = "l", descriptor = "I")
	public final int anInt1194;

	@OriginalMember(owner = "client!cs", name = "n", descriptor = "I")
	public final int anInt1196;

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(II)V")
	public Class1_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1194 = arg1;
		this.anInt1196 = arg0;
	}
}
