import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public abstract class Class5_Sub9 extends Class5 {

	@OriginalMember(owner = "client!bk", name = "l", descriptor = "I")
	public int anInt9828;

	@OriginalMember(owner = "client!bk", name = "q", descriptor = "Lclient!jagtheora/ogg/OggStreamState;")
	public final OggStreamState anOggStreamState5;

	@OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class5_Sub9(@OriginalArg(0) OggStreamState arg0) {
		this.anOggStreamState5 = arg0;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V")
	public abstract void method8195();

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;Z)V")
	protected abstract void method8197(@OriginalArg(0) OggPacket arg0);

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(ZLclient!jagtheora/ogg/OggPacket;)V")
	public final void method8198(@OriginalArg(1) OggPacket arg0) {
		this.method8197(arg0);
		this.anInt9828++;
	}
}
