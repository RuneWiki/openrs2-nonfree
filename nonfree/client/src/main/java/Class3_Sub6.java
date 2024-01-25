import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public final class Class3_Sub6 extends Class3 {

	@OriginalMember(owner = "client!co", name = "m", descriptor = "S")
	public short aShort13;

	static {
		new Class57(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
		new Class57(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
	}

	@OriginalMember(owner = "client!co", name = "<init>", descriptor = "()V")
	private Class3_Sub6() {
	}

	@OriginalMember(owner = "client!co", name = "<init>", descriptor = "(S)V")
	public Class3_Sub6(@OriginalArg(0) short arg0) {
		this.aShort13 = arg0;
	}
}
