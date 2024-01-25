import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public final class Class14_Sub4_Sub1 extends Class14_Sub4 {

	@OriginalMember(owner = "client!an", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class14_Sub4_Sub1(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!an", name = "d", descriptor = "(I)V")
	@Override
	public void method9267() {
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;B)V")
	@Override
	protected void method9266(@OriginalArg(0) OggPacket arg0) {
	}
}
