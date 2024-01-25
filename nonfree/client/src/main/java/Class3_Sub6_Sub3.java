import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qia")
public final class Class3_Sub6_Sub3 extends Class3_Sub6 {

	@OriginalMember(owner = "client!qia", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class3_Sub6_Sub3(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;Z)V")
	@Override
	protected void method8692(@OriginalArg(0) OggPacket arg0) {
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(I)V")
	@Override
	public void method8689() {
	}
}
