import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public final class Class1_Sub7 extends Class1 {

	@OriginalMember(owner = "client!cn", name = "p", descriptor = "I")
	public int anInt968;

	@OriginalMember(owner = "client!cn", name = "r", descriptor = "I")
	public int anInt970;

	@OriginalMember(owner = "client!cn", name = "t", descriptor = "I")
	public int anInt971;

	@OriginalMember(owner = "client!cn", name = "w", descriptor = "I")
	public int anInt973;

	@OriginalMember(owner = "client!cn", name = "x", descriptor = "I")
	public int anInt974;

	@OriginalMember(owner = "client!cn", name = "q", descriptor = "I")
	public int anInt969 = -1;

	@OriginalMember(owner = "client!cn", name = "u", descriptor = "Z")
	public boolean aBoolean77 = false;

	@OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(I)V")
	public Class1_Sub7(@OriginalArg(0) int arg0) {
		this.anInt969 = arg0;
	}
}
