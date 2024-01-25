import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public final class Class5_Sub12_Sub4 extends Class5_Sub12 {

	@OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class5_Sub12_Sub4(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "(B)V")
	@Override
	public void method8413() {
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;B)V")
	@Override
	protected void method8408(@OriginalArg(0) OggPacket arg0) {
	}
}
