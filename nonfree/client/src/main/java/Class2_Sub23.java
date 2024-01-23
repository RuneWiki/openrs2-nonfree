import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public final class Class2_Sub23 extends Class2 {

	@OriginalMember(owner = "client!rg", name = "D", descriptor = "I")
	public int anInt3983;

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(I)V")
	public Class2_Sub23(@OriginalArg(0) int arg0) {
		this.anInt3983 = arg0;
	}
}
