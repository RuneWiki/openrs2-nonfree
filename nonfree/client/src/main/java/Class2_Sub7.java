import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public abstract class Class2_Sub7 extends Class2 {

	@OriginalMember(owner = "client!ni", name = "n", descriptor = "I")
	public int anInt8453;

	@OriginalMember(owner = "client!ni", name = "p", descriptor = "Lclient!jagtheora/ogg/OggStreamState;")
	public final OggStreamState anOggStreamState5;

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class2_Sub7(@OriginalArg(0) OggStreamState arg0) {
		this.anOggStreamState5 = arg0;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V")
	public abstract void method7539();

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILclient!jagtheora/ogg/OggPacket;)V")
	public final void method7540(@OriginalArg(1) OggPacket arg0) {
		this.method7541(arg0);
		this.anInt8453++;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;I)V")
	protected abstract void method7541(@OriginalArg(0) OggPacket arg0);
}
