import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public final class Class6_Sub13_Sub4 extends Class6_Sub13 {

	@OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class6_Sub13_Sub4(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;I)V")
	@Override
	protected void method6907(@OriginalArg(0) OggPacket arg0) {
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(I)V")
	@Override
	public void method6910() {
	}
}
