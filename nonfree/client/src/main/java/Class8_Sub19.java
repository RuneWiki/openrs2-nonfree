import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public abstract class Class8_Sub19 extends Class8 {

	@OriginalMember(owner = "client!ma", name = "m", descriptor = "I")
	public int anInt9770;

	@OriginalMember(owner = "client!ma", name = "k", descriptor = "Lclient!jagtheora/ogg/OggStreamState;")
	public final OggStreamState anOggStreamState5;

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class8_Sub19(@OriginalArg(0) OggStreamState arg0) {
		this.anOggStreamState5 = arg0;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(BLclient!jagtheora/ogg/OggPacket;)V")
	public final void method7893(@OriginalArg(1) OggPacket arg0) {
		this.method7895(arg0);
		this.anInt9770++;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;I)V")
	protected abstract void method7895(@OriginalArg(0) OggPacket arg0);

	@OriginalMember(owner = "client!ma", name = "f", descriptor = "(I)V")
	public abstract void method7896();
}
