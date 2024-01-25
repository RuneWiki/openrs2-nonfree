import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nba")
public final class Class14_Sub27_Sub3 extends Class14_Sub27 {

	@OriginalMember(owner = "client!nba", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class14_Sub27_Sub3(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(I)V")
	@Override
	public void method9051() {
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;I)V")
	@Override
	protected void method9050(@OriginalArg(0) OggPacket arg0) {
	}
}
