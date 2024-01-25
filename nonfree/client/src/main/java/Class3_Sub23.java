import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public abstract class Class3_Sub23 extends Class3 {

	@OriginalMember(owner = "client!pl", name = "m", descriptor = "I")
	public int anInt9343;

	@OriginalMember(owner = "client!pl", name = "l", descriptor = "Lclient!jagtheora/ogg/OggStreamState;")
	public final OggStreamState anOggStreamState5;

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class3_Sub23(@OriginalArg(0) OggStreamState arg0) {
		this.anOggStreamState5 = arg0;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(B)V")
	public abstract void method7994();

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;I)V")
	public final void method7998(@OriginalArg(0) OggPacket arg0) {
		this.method7999(arg0);
		this.anInt9343++;
	}

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "(Lclient!jagtheora/ogg/OggPacket;I)V")
	protected abstract void method7999(@OriginalArg(0) OggPacket arg0);
}
