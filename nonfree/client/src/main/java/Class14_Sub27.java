import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public abstract class Class14_Sub27 extends Class14 {

	@OriginalMember(owner = "client!ih", name = "n", descriptor = "I")
	public int anInt10860;

	@OriginalMember(owner = "client!ih", name = "o", descriptor = "Lclient!jagtheora/ogg/OggStreamState;")
	public final OggStreamState anOggStreamState5;

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class14_Sub27(@OriginalArg(0) OggStreamState arg0) {
		this.anOggStreamState5 = arg0;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;I)V")
	protected abstract void method9050(@OriginalArg(0) OggPacket arg0);

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V")
	public abstract void method9051();

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILclient!jagtheora/ogg/OggPacket;)V")
	public final void method9054(@OriginalArg(1) OggPacket arg0) {
		this.method9050(arg0);
		this.anInt10860++;
	}
}
