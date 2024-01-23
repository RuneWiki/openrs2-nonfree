import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public final class Class1_Sub4 extends Class1 {

	@OriginalMember(owner = "client!cm", name = "s", descriptor = "I")
	public int anInt993;

	@OriginalMember(owner = "client!cm", name = "z", descriptor = "I")
	public int anInt999;

	@OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(II)V")
	public Class1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt993 = arg1;
		this.anInt999 = arg0;
	}
}
