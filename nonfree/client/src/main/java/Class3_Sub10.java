import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oga")
public abstract class Class3_Sub10 extends Class3 {

	@OriginalMember(owner = "client!oga", name = "o", descriptor = "I")
	public int anInt8214;

	@OriginalMember(owner = "client!oga", name = "j", descriptor = "Lclient!jagtheora/ogg/OggStreamState;")
	public final OggStreamState anOggStreamState5;

	@OriginalMember(owner = "client!oga", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class3_Sub10(@OriginalArg(0) OggStreamState arg0) {
		this.anOggStreamState5 = arg0;
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(ILclient!jagtheora/ogg/OggPacket;)V")
	public final void method6829(@OriginalArg(1) OggPacket arg0) {
		this.method6831(arg0);
		this.anInt8214++;
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(Z)V")
	public abstract void method6830();

	@OriginalMember(owner = "client!oga", name = "b", descriptor = "(ILclient!jagtheora/ogg/OggPacket;)V")
	protected abstract void method6831(@OriginalArg(1) OggPacket arg0);
}
