import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public abstract class Class2_Sub20 extends Class2 {

	@OriginalMember(owner = "client!rc", name = "j", descriptor = "I")
	public int anInt8543;

	@OriginalMember(owner = "client!rc", name = "k", descriptor = "Lclient!jagtheora/ogg/OggStreamState;")
	public final OggStreamState anOggStreamState5;

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class2_Sub20(@OriginalArg(0) OggStreamState arg0) {
		this.anOggStreamState5 = arg0;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Z)V")
	public abstract void method7360();

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILclient!jagtheora/ogg/OggPacket;)V")
	public final void method7362(@OriginalArg(1) OggPacket arg0) {
		this.method7363(arg0);
		this.anInt8543++;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(BLclient!jagtheora/ogg/OggPacket;)V")
	protected abstract void method7363(@OriginalArg(1) OggPacket arg0);
}
