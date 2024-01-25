import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public abstract class Class6_Sub37 extends Class6 {

	@OriginalMember(owner = "client!nc", name = "o", descriptor = "I")
	public int anInt10248;

	@OriginalMember(owner = "client!nc", name = "m", descriptor = "Lclient!jagtheora/ogg/OggStreamState;")
	public final OggStreamState anOggStreamState5;

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class6_Sub37(@OriginalArg(0) OggStreamState arg0) {
		this.anOggStreamState5 = arg0;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V")
	public abstract void method8837();

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILclient!jagtheora/ogg/OggPacket;)V")
	protected abstract void method8838(@OriginalArg(1) OggPacket arg0);

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;I)V")
	public final void method8840(@OriginalArg(0) OggPacket arg0) {
		this.method8838(arg0);
		this.anInt10248++;
	}
}
