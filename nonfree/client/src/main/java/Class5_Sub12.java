import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sm")
public abstract class Class5_Sub12 extends Class5 {

	@OriginalMember(owner = "client!sm", name = "s", descriptor = "[I")
	public static final int[] anIntArray544 = new int[16384];

	@OriginalMember(owner = "client!sm", name = "p", descriptor = "[I")
	public static final int[] anIntArray543 = new int[16384];

	@OriginalMember(owner = "client!sm", name = "q", descriptor = "I")
	public int anInt9782;

	@OriginalMember(owner = "client!sm", name = "l", descriptor = "Lclient!jagtheora/ogg/OggStreamState;")
	public final OggStreamState anOggStreamState5;

	static {
		@Pc(62) double local62 = 3.834951969714103E-4D;
		for (@Pc(64) int local64 = 0; local64 < 16384; local64++) {
			anIntArray544[local64] = (int) (Math.sin((double) local64 * local62) * 16384.0D);
			anIntArray543[local64] = (int) (Math.cos(local62 * (double) local64) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class5_Sub12(@OriginalArg(0) OggStreamState arg0) {
		this.anOggStreamState5 = arg0;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;B)V")
	protected abstract void method8408(@OriginalArg(0) OggPacket arg0);

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "(Lclient!jagtheora/ogg/OggPacket;B)V")
	public final void method8411(@OriginalArg(0) OggPacket arg0) {
		this.method8408(arg0);
		this.anInt9782++;
	}

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "(B)V")
	public abstract void method8413();
}
