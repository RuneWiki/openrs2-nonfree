import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public final class Class3_Sub8_Sub2 extends Class3_Sub8 {

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class3_Sub8_Sub2(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(BLclient!jagtheora/ogg/OggPacket;)V")
	@Override
	protected void method9112(@OriginalArg(1) OggPacket arg0) {
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V")
	@Override
	public void method9114() {
	}
}
