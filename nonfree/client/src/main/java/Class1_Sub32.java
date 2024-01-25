import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public final class Class1_Sub32 extends Class1 {

	@OriginalMember(owner = "client!lt", name = "k", descriptor = "I")
	public int anInt5295;

	@OriginalMember(owner = "client!lt", name = "l", descriptor = "I")
	public int anInt5296;

	@OriginalMember(owner = "client!lt", name = "o", descriptor = "I")
	public int anInt5298;

	@OriginalMember(owner = "client!lt", name = "q", descriptor = "I")
	public int anInt5299;

	@OriginalMember(owner = "client!lt", name = "t", descriptor = "I")
	public int anInt5301;

	@OriginalMember(owner = "client!lt", name = "p", descriptor = "Z")
	public boolean aBoolean426 = false;

	@OriginalMember(owner = "client!lt", name = "s", descriptor = "I")
	public int anInt5300 = -1;

	@OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(I)V")
	public Class1_Sub32(@OriginalArg(0) int arg0) {
		this.anInt5300 = arg0;
	}
}
