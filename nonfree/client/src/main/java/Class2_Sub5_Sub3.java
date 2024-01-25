import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public final class Class2_Sub5_Sub3 extends Class2_Sub5 {

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class2_Sub5_Sub3(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(BLclient!jagtheora/ogg/OggPacket;)V")
	@Override
	protected void method8260(@OriginalArg(1) OggPacket arg0) {
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(B)V")
	@Override
	public void method8257() {
	}
}
