import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public final class Class1_Sub4 extends Class1 {

	@OriginalMember(owner = "client!bf", name = "J", descriptor = "I")
	public final int anInt468;

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(I)V")
	public Class1_Sub4(@OriginalArg(0) int arg0) {
		this.anInt468 = arg0;
	}
}
