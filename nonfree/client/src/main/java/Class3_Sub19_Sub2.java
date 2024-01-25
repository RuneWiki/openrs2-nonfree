import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gja")
public final class Class3_Sub19_Sub2 extends Class3_Sub19 {

	@OriginalMember(owner = "client!gja", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class3_Sub19_Sub2(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!gja", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;B)V")
	@Override
	protected void method8040(@OriginalArg(0) OggPacket arg0) {
	}

	@OriginalMember(owner = "client!gja", name = "a", descriptor = "(I)V")
	@Override
	public void method8042() {
	}
}
