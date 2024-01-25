import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public abstract class Class6_Sub13 extends Class6 {

	@OriginalMember(owner = "client!rd", name = "k", descriptor = "I")
	public int anInt10513;

	@OriginalMember(owner = "client!rd", name = "m", descriptor = "Lclient!jagtheora/ogg/OggStreamState;")
	public final OggStreamState anOggStreamState5;

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class6_Sub13(@OriginalArg(0) OggStreamState arg0) {
		this.anOggStreamState5 = arg0;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;Z)V")
	protected abstract void method8548(@OriginalArg(0) OggPacket arg0);

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;I)V")
	public final void method8552(@OriginalArg(0) OggPacket arg0) {
		this.method8548(arg0);
		this.anInt10513++;
	}

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "(I)V")
	public abstract void method8553();
}
