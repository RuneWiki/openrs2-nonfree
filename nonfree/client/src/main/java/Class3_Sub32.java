import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public abstract class Class3_Sub32 extends Class3 {

	@OriginalMember(owner = "client!qb", name = "k", descriptor = "I")
	public int anInt10068;

	@OriginalMember(owner = "client!qb", name = "n", descriptor = "Lclient!jagtheora/ogg/OggStreamState;")
	public final OggStreamState anOggStreamState5;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class3_Sub32(@OriginalArg(0) OggStreamState arg0) {
		this.anOggStreamState5 = arg0;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;I)V")
	protected abstract void method8587(@OriginalArg(0) OggPacket arg0);

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ILclient!jagtheora/ogg/OggPacket;)V")
	public final void method8589(@OriginalArg(1) OggPacket arg0) {
		this.method8587(arg0);
		this.anInt10068++;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Z)V")
	public abstract void method8590();
}
