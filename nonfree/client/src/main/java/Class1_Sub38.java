import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public final class Class1_Sub38 extends Class1 {

	@OriginalMember(owner = "client!ro", name = "s", descriptor = "I")
	public final int anInt5853;

	@OriginalMember(owner = "client!ro", name = "o", descriptor = "I")
	public final int anInt5850;

	@OriginalMember(owner = "client!ro", name = "<init>", descriptor = "(II)V")
	public Class1_Sub38(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5853 = arg0;
		this.anInt5850 = arg1;
	}
}
