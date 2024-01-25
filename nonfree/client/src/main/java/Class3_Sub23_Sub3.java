import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nga")
public final class Class3_Sub23_Sub3 extends Class3_Sub23 {

	@OriginalMember(owner = "client!nga", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class3_Sub23_Sub3(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!nga", name = "b", descriptor = "(Lclient!jagtheora/ogg/OggPacket;I)V")
	@Override
	protected void method7999(@OriginalArg(0) OggPacket arg0) {
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(B)V")
	@Override
	public void method7994() {
	}
}
