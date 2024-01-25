import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public final class Class2_Sub20_Sub4 extends Class2_Sub20 {

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class2_Sub20_Sub4(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Z)V")
	@Override
	public void method7360() {
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(BLclient!jagtheora/ogg/OggPacket;)V")
	@Override
	protected void method7363(@OriginalArg(1) OggPacket arg0) {
	}
}
