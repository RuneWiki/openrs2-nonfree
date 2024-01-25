import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ria")
public final class Class6_Sub13_Sub2 extends Class6_Sub13 {

	@OriginalMember(owner = "client!ria", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class6_Sub13_Sub2(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ria", name = "e", descriptor = "(I)V")
	@Override
	public void method8553() {
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;Z)V")
	@Override
	protected void method8548(@OriginalArg(0) OggPacket arg0) {
	}
}
