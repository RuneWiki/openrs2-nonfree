import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public abstract class Class5_Sub1 extends Class5 {

	@OriginalMember(owner = "client!ui", name = "s", descriptor = "I")
	public int anInt9874;

	@OriginalMember(owner = "client!ui", name = "k", descriptor = "Lclient!jagtheora/ogg/OggStreamState;")
	public final OggStreamState anOggStreamState5;

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class5_Sub1(@OriginalArg(0) OggStreamState arg0) {
		this.anOggStreamState5 = arg0;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V")
	public abstract void method8219();

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILclient!jagtheora/ogg/OggPacket;)V")
	protected abstract void method8220(@OriginalArg(1) OggPacket arg0);

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;I)V")
	public final void method8221(@OriginalArg(0) OggPacket arg0) {
		this.method8220(arg0);
		this.anInt9874++;
	}
}
