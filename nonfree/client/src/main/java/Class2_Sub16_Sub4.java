import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public final class Class2_Sub16_Sub4 extends Class2_Sub16 {

	@OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class2_Sub16_Sub4(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(I)V")
	@Override
	public void method6550() {
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(ZLclient!jagtheora/ogg/OggPacket;)V")
	@Override
	protected void method6552(@OriginalArg(1) OggPacket arg0) {
	}
}
