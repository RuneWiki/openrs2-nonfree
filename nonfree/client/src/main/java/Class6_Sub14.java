import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public abstract class Class6_Sub14 extends Class6 {

	@OriginalMember(owner = "client!fr", name = "q", descriptor = "I")
	public int anInt10676;

	@OriginalMember(owner = "client!fr", name = "n", descriptor = "Lclient!jagtheora/ogg/OggStreamState;")
	public final OggStreamState anOggStreamState5;

	@OriginalMember(owner = "client!fr", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class6_Sub14(@OriginalArg(0) OggStreamState arg0) {
		this.anOggStreamState5 = arg0;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(Z)V")
	public abstract void method9058();

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;I)V")
	protected abstract void method9061(@OriginalArg(0) OggPacket arg0);

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(BLclient!jagtheora/ogg/OggPacket;)V")
	public final void method9062(@OriginalArg(1) OggPacket arg0) {
		this.method9061(arg0);
		this.anInt10676++;
	}
}
