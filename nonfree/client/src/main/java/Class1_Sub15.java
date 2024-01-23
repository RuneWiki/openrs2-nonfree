import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public final class Class1_Sub15 extends Class1 {

	@OriginalMember(owner = "client!hi", name = "x", descriptor = "I")
	public int anInt1927;

	@OriginalMember(owner = "client!hi", name = "q", descriptor = "I")
	public int anInt1922;

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(II)V")
	public Class1_Sub15(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1927 = arg0;
		this.anInt1922 = arg1;
	}
}
