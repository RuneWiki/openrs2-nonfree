import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public final class Class1_Sub5 extends Class1 {

	@OriginalMember(owner = "client!dc", name = "z", descriptor = "I")
	public int anInt782;

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(I)V")
	public Class1_Sub5(@OriginalArg(0) int arg0) {
		this.anInt782 = arg0;
	}
}
