import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public final class Class5_Sub34_Sub4 extends Class5_Sub34 {

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class5_Sub34_Sub4(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)V")
	@Override
	public void method8632() {
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;B)V")
	@Override
	protected void method8629(@OriginalArg(0) OggPacket arg0) {
	}
}
