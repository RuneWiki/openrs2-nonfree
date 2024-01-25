import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public final class Class4_Sub6_Sub2 extends Class4_Sub6 {

	@OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class4_Sub6_Sub2(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(ILclient!jagtheora/ogg/OggPacket;)V")
	@Override
	protected void method6634(@OriginalArg(1) OggPacket arg0) {
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)V")
	@Override
	public void method6631() {
	}
}
