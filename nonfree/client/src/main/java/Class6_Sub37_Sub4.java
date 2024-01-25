import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public final class Class6_Sub37_Sub4 extends Class6_Sub37 {

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class6_Sub37_Sub4(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V")
	@Override
	public void method8837() {
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILclient!jagtheora/ogg/OggPacket;)V")
	@Override
	protected void method8838(@OriginalArg(1) OggPacket arg0) {
	}
}
