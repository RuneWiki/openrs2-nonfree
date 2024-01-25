import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public abstract class Class2_Sub12 extends Class2 {

	@OriginalMember(owner = "client!il", name = "q", descriptor = "I")
	public int anInt8868;

	@OriginalMember(owner = "client!il", name = "t", descriptor = "Lclient!jagtheora/ogg/OggStreamState;")
	public final OggStreamState anOggStreamState5;

	@OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class2_Sub12(@OriginalArg(0) OggStreamState arg0) {
		this.anOggStreamState5 = arg0;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;B)V")
	protected abstract void method7838(@OriginalArg(0) OggPacket arg0);

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(ILclient!jagtheora/ogg/OggPacket;)V")
	public final void method7842(@OriginalArg(1) OggPacket arg0) {
		this.method7838(arg0);
		this.anInt8868++;
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(I)V")
	public abstract void method7843();
}
