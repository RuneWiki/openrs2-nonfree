import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jw")
public abstract class Class3_Sub8 extends Class3 {

	@OriginalMember(owner = "client!jw", name = "j", descriptor = "I")
	public int anInt10908;

	@OriginalMember(owner = "client!jw", name = "l", descriptor = "Lclient!jagtheora/ogg/OggStreamState;")
	public final OggStreamState anOggStreamState5;

	@OriginalMember(owner = "client!jw", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class3_Sub8(@OriginalArg(0) OggStreamState arg0) {
		this.anOggStreamState5 = arg0;
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(ILclient!jagtheora/ogg/OggPacket;)V")
	public final void method9109(@OriginalArg(1) OggPacket arg0) {
		this.method9112(arg0);
		this.anInt10908++;
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(BLclient!jagtheora/ogg/OggPacket;)V")
	protected abstract void method9112(@OriginalArg(1) OggPacket arg0);

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(I)V")
	public abstract void method9114();
}
