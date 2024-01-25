import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public final class Class3_Sub12 extends Class3 {

	@OriginalMember(owner = "client!bs", name = "q", descriptor = "I")
	public int anInt947;

	@OriginalMember(owner = "client!bs", name = "m", descriptor = "I")
	public int anInt948;

	@OriginalMember(owner = "client!bs", name = "n", descriptor = "I")
	public int anInt949;

	@OriginalMember(owner = "client!bs", name = "p", descriptor = "I")
	public int anInt951;

	@OriginalMember(owner = "client!bs", name = "k", descriptor = "I")
	public int anInt952;

	@OriginalMember(owner = "client!bs", name = "j", descriptor = "I")
	public int anInt950 = -1;

	@OriginalMember(owner = "client!bs", name = "o", descriptor = "Z")
	public boolean aBoolean76 = false;

	@OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(I)V")
	public Class3_Sub12(@OriginalArg(0) int arg0) {
		this.anInt950 = arg0;
	}
}
