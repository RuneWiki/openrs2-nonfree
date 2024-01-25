import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sha")
public final class Class3_Sub5_Sub4 extends Class3_Sub5 {

	@OriginalMember(owner = "client!sha", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class3_Sub5_Sub4(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(I)V")
	@Override
	public void method7531() {
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(BLclient!jagtheora/ogg/OggPacket;)V")
	@Override
	protected void method7526(@OriginalArg(1) OggPacket arg0) {
	}
}
