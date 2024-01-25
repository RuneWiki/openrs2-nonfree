import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public abstract class Class5_Sub5 extends Class5 {

	@OriginalMember(owner = "client!bc", name = "n", descriptor = "I")
	public int anInt8564;

	@OriginalMember(owner = "client!bc", name = "i", descriptor = "Lclient!jagtheora/ogg/OggStreamState;")
	public final OggStreamState anOggStreamState5;

	static {
		new Class74("", 76);
	}

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class5_Sub5(@OriginalArg(0) OggStreamState arg0) {
		this.anOggStreamState5 = arg0;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;I)V")
	public final void method7380(@OriginalArg(0) OggPacket arg0) {
		this.method7383(arg0);
		this.anInt8564++;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;Z)V")
	protected abstract void method7383(@OriginalArg(0) OggPacket arg0);

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V")
	public abstract void method7384();
}
