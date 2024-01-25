import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public final class Class3_Sub10_Sub3 extends Class3_Sub10 {

	@OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class3_Sub10_Sub3(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "(ILclient!jagtheora/ogg/OggPacket;)V")
	@Override
	protected void method6831(@OriginalArg(1) OggPacket arg0) {
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(Z)V")
	@Override
	public void method6830() {
	}
}
