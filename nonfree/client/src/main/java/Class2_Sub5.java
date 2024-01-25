import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!au")
public abstract class Class2_Sub5 extends Class2 {

	@OriginalMember(owner = "client!au", name = "q", descriptor = "[F")
	public static final float[] aFloatArray83 = new float[16384];

	@OriginalMember(owner = "client!au", name = "s", descriptor = "[F")
	public static final float[] aFloatArray84 = new float[16384];

	@OriginalMember(owner = "client!au", name = "t", descriptor = "I")
	public int anInt9926;

	@OriginalMember(owner = "client!au", name = "u", descriptor = "Lclient!jagtheora/ogg/OggStreamState;")
	public final OggStreamState anOggStreamState5;

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			aFloatArray83[local9] = (float) Math.sin(local7 * (double) local9);
			aFloatArray84[local9] = (float) Math.cos((double) local9 * local7);
		}
	}

	@OriginalMember(owner = "client!au", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class2_Sub5(@OriginalArg(0) OggStreamState arg0) {
		this.anOggStreamState5 = arg0;
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(B)V")
	public abstract void method8257();

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;I)V")
	public final void method8259(@OriginalArg(0) OggPacket arg0) {
		this.method8260(arg0);
		this.anInt9926++;
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(BLclient!jagtheora/ogg/OggPacket;)V")
	protected abstract void method8260(@OriginalArg(1) OggPacket arg0);
}
