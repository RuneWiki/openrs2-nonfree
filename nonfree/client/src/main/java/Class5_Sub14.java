import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public abstract class Class5_Sub14 extends Class5 {

	@OriginalMember(owner = "client!df", name = "o", descriptor = "I")
	public int anInt9655;

	@OriginalMember(owner = "client!df", name = "n", descriptor = "Lclient!jagtheora/ogg/OggStreamState;")
	public final OggStreamState anOggStreamState5;

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class5_Sub14(@OriginalArg(0) OggStreamState arg0) {
		this.anOggStreamState5 = arg0;
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(BLclient!jagtheora/ogg/OggPacket;)V")
	public final void method8228(@OriginalArg(1) OggPacket arg0) {
		this.method8230(arg0);
		this.anInt9655++;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(BLclient!jagtheora/ogg/OggPacket;)V")
	protected abstract void method8230(@OriginalArg(1) OggPacket arg0);

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(B)V")
	public abstract void method8231();
}
