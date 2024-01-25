import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public abstract class Class5_Sub34 extends Class5 {

	@OriginalMember(owner = "client!wt", name = "n", descriptor = "I")
	public int anInt10097;

	@OriginalMember(owner = "client!wt", name = "o", descriptor = "Lclient!jagtheora/ogg/OggStreamState;")
	public final OggStreamState anOggStreamState5;

	@OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class5_Sub34(@OriginalArg(0) OggStreamState arg0) {
		this.anOggStreamState5 = arg0;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;B)V")
	protected abstract void method8629(@OriginalArg(0) OggPacket arg0);

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "(Lclient!jagtheora/ogg/OggPacket;B)V")
	public final void method8631(@OriginalArg(0) OggPacket arg0) {
		this.method8629(arg0);
		this.anInt10097++;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(I)V")
	public abstract void method8632();
}
