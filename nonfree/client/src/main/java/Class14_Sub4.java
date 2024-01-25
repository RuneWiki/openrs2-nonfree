import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gga")
public abstract class Class14_Sub4 extends Class14 {

	@OriginalMember(owner = "client!gga", name = "o", descriptor = "I")
	public int anInt10922;

	@OriginalMember(owner = "client!gga", name = "q", descriptor = "Lclient!jagtheora/ogg/OggStreamState;")
	public final OggStreamState anOggStreamState5;

	@OriginalMember(owner = "client!gga", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class14_Sub4(@OriginalArg(0) OggStreamState arg0) {
		this.anOggStreamState5 = arg0;
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;I)V")
	public final void method9264(@OriginalArg(0) OggPacket arg0) {
		this.method9266(arg0);
		this.anInt10922++;
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;B)V")
	protected abstract void method9266(@OriginalArg(0) OggPacket arg0);

	@OriginalMember(owner = "client!gga", name = "d", descriptor = "(I)V")
	public abstract void method9267();
}
