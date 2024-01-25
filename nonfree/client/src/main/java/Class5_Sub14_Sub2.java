import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public final class Class5_Sub14_Sub2 extends Class5_Sub14 {

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class5_Sub14_Sub2(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)V")
	@Override
	public void method8231() {
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(BLclient!jagtheora/ogg/OggPacket;)V")
	@Override
	protected void method8230(@OriginalArg(1) OggPacket arg0) {
	}
}
