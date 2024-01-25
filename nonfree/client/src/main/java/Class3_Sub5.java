import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public abstract class Class3_Sub5 extends Class3 {

	@OriginalMember(owner = "client!qb", name = "l", descriptor = "I")
	public int anInt8862;

	@OriginalMember(owner = "client!qb", name = "k", descriptor = "Lclient!jagtheora/ogg/OggStreamState;")
	public final OggStreamState anOggStreamState5;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class3_Sub5(@OriginalArg(0) OggStreamState arg0) {
		this.anOggStreamState5 = arg0;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(BLclient!jagtheora/ogg/OggPacket;)V")
	protected abstract void method7526(@OriginalArg(1) OggPacket arg0);

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(BLclient!jagtheora/ogg/OggPacket;)V")
	public final void method7530(@OriginalArg(1) OggPacket arg0) {
		this.method7526(arg0);
		this.anInt8862++;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
	public abstract void method7531();
}
