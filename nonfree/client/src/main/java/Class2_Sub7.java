import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bda")
public abstract class Class2_Sub7 extends Class2 {

	@OriginalMember(owner = "client!bda", name = "p", descriptor = "I")
	public int anInt9987;

	@OriginalMember(owner = "client!bda", name = "n", descriptor = "Lclient!jagtheora/ogg/OggStreamState;")
	public final OggStreamState anOggStreamState5;

	@OriginalMember(owner = "client!bda", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class2_Sub7(@OriginalArg(0) OggStreamState arg0) {
		this.anOggStreamState5 = arg0;
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;B)V")
	protected abstract void method8314(@OriginalArg(0) OggPacket arg0);

	@OriginalMember(owner = "client!bda", name = "b", descriptor = "(Lclient!jagtheora/ogg/OggPacket;B)V")
	public final void method8316(@OriginalArg(0) OggPacket arg0) {
		this.method8314(arg0);
		this.anInt9987++;
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(I)V")
	public abstract void method8318();
}
