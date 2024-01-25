import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qha")
public abstract class Class3_Sub14 extends Class3 {

	@OriginalMember(owner = "client!qha", name = "m", descriptor = "I")
	public int anInt9591;

	@OriginalMember(owner = "client!qha", name = "l", descriptor = "Lclient!jagtheora/ogg/OggStreamState;")
	public final OggStreamState anOggStreamState5;

	@OriginalMember(owner = "client!qha", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class3_Sub14(@OriginalArg(0) OggStreamState arg0) {
		this.anOggStreamState5 = arg0;
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(I)V")
	public abstract void method7818();

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;I)V")
	public final void method7819(@OriginalArg(0) OggPacket arg0) {
		this.method7821(arg0);
		this.anInt9591++;
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;B)V")
	protected abstract void method7821(@OriginalArg(0) OggPacket arg0);
}
