import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public final class Class5_Sub9_Sub3 extends Class5_Sub9 {

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class5_Sub9_Sub3(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
	@Override
	public void method8195() {
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;Z)V")
	@Override
	protected void method8197(@OriginalArg(0) OggPacket arg0) {
	}
}
