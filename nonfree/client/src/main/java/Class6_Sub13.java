import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public abstract class Class6_Sub13 extends Class6 {

	@OriginalMember(owner = "client!dn", name = "p", descriptor = "I")
	public int anInt8013;

	@OriginalMember(owner = "client!dn", name = "m", descriptor = "Lclient!jagtheora/ogg/OggStreamState;")
	public final OggStreamState anOggStreamState5;

	@OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class6_Sub13(@OriginalArg(0) OggStreamState arg0) {
		this.anOggStreamState5 = arg0;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;I)V")
	protected abstract void method6907(@OriginalArg(0) OggPacket arg0);

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(ILclient!jagtheora/ogg/OggPacket;)V")
	public final void method6908(@OriginalArg(1) OggPacket arg0) {
		this.method6907(arg0);
		this.anInt8013++;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)V")
	public abstract void method6910();
}
