import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bba")
public final class Class2_Sub7_Sub1 extends Class2_Sub7 {

	@OriginalMember(owner = "client!bba", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class2_Sub7_Sub1(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;I)V")
	@Override
	protected void method7541(@OriginalArg(0) OggPacket arg0) {
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(I)V")
	@Override
	public void method7539() {
	}
}
