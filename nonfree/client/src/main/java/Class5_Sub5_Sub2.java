import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hga")
public final class Class5_Sub5_Sub2 extends Class5_Sub5 {

	@OriginalMember(owner = "client!hga", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class5_Sub5_Sub2(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;Z)V")
	@Override
	protected void method7383(@OriginalArg(0) OggPacket arg0) {
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(B)V")
	@Override
	public void method7384() {
	}
}
