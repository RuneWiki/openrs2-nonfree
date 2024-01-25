import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jha")
public final class Class3_Sub32_Sub1 extends Class3_Sub32 {

	@OriginalMember(owner = "client!jha", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class3_Sub32_Sub1(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;I)V")
	@Override
	protected void method8587(@OriginalArg(0) OggPacket arg0) {
	}

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(Z)V")
	@Override
	public void method8590() {
	}
}
