import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ega")
public final class Class3_Sub14_Sub1 extends Class3_Sub14 {

	@OriginalMember(owner = "client!ega", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class3_Sub14_Sub1(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;B)V")
	@Override
	protected void method7821(@OriginalArg(0) OggPacket arg0) {
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(I)V")
	@Override
	public void method7818() {
	}
}
