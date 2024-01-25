import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public final class Class6_Sub14_Sub3 extends Class6_Sub14 {

	@OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class6_Sub14_Sub3(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Z)V")
	@Override
	public void method9058() {
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;I)V")
	@Override
	protected void method9061(@OriginalArg(0) OggPacket arg0) {
	}
}
