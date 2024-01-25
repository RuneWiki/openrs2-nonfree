import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public abstract class Class2_Sub16 extends Class2 {

	@OriginalMember(owner = "client!mg", name = "l", descriptor = "I")
	public int anInt7815;

	@OriginalMember(owner = "client!mg", name = "j", descriptor = "Lclient!jagtheora/ogg/OggStreamState;")
	public final OggStreamState anOggStreamState5;

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class2_Sub16(@OriginalArg(0) OggStreamState arg0) {
		this.anOggStreamState5 = arg0;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V")
	public abstract void method6550();

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;I)V")
	public final void method6551(@OriginalArg(0) OggPacket arg0) {
		this.method6552(arg0);
		this.anInt7815++;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ZLclient!jagtheora/ogg/OggPacket;)V")
	protected abstract void method6552(@OriginalArg(1) OggPacket arg0);
}
