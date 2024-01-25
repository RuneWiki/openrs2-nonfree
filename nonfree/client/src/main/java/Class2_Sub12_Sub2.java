import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public final class Class2_Sub12_Sub2 extends Class2_Sub12 {

	@OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class2_Sub12_Sub2(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;B)V")
	@Override
	protected void method7838(@OriginalArg(0) OggPacket arg0) {
	}

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(I)V")
	@Override
	public void method7843() {
	}
}
