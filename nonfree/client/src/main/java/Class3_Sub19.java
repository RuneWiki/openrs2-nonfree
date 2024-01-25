import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public abstract class Class3_Sub19 extends Class3 {

	@OriginalMember(owner = "client!ld", name = "p", descriptor = "I")
	public int anInt9195;

	@OriginalMember(owner = "client!ld", name = "r", descriptor = "Lclient!jagtheora/ogg/OggStreamState;")
	public final OggStreamState anOggStreamState5;

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class3_Sub19(@OriginalArg(0) OggStreamState arg0) {
		this.anOggStreamState5 = arg0;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;B)V")
	protected abstract void method8040(@OriginalArg(0) OggPacket arg0);

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
	public abstract void method8042();

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZLclient!jagtheora/ogg/OggPacket;)V")
	public final void method8044(@OriginalArg(1) OggPacket arg0) {
		this.method8040(arg0);
		this.anInt9195++;
	}
}
