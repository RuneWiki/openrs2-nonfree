import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public abstract class Class4_Sub6 extends Class4 {

	@OriginalMember(owner = "client!hi", name = "h", descriptor = "I")
	public int anInt7625;

	@OriginalMember(owner = "client!hi", name = "k", descriptor = "Lclient!jagtheora/ogg/OggStreamState;")
	public final OggStreamState anOggStreamState5;

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class4_Sub6(@OriginalArg(0) OggStreamState arg0) {
		this.anOggStreamState5 = arg0;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V")
	public abstract void method6631();

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(BLclient!jagtheora/ogg/OggPacket;)V")
	public final void method6632(@OriginalArg(1) OggPacket arg0) {
		this.method6634(arg0);
		this.anInt7625++;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILclient!jagtheora/ogg/OggPacket;)V")
	protected abstract void method6634(@OriginalArg(1) OggPacket arg0);
}
