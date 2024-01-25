import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bs")
public abstract class Class3_Sub6 extends Class3 {

	@OriginalMember(owner = "client!bs", name = "i", descriptor = "[J")
	public static final long[] aLongArray21 = new long[256];

	@OriginalMember(owner = "client!bs", name = "j", descriptor = "I")
	public int anInt10134;

	@OriginalMember(owner = "client!bs", name = "n", descriptor = "Lclient!jagtheora/ogg/OggStreamState;")
	public final OggStreamState anOggStreamState5;

	static {
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(14) long local14 = (long) local10;
			for (@Pc(16) int local16 = 0; local16 < 8; local16++) {
				if ((local14 & 0x1L) == 1L) {
					local14 = local14 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local14 >>>= 0x1;
				}
			}
			aLongArray21[local10] = local14;
		}
	}

	@OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class3_Sub6(@OriginalArg(0) OggStreamState arg0) {
		this.anOggStreamState5 = arg0;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(BLclient!jagtheora/ogg/OggPacket;)V")
	public final void method8688(@OriginalArg(1) OggPacket arg0) {
		this.method8692(arg0);
		this.anInt10134++;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(I)V")
	public abstract void method8689();

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;Z)V")
	protected abstract void method8692(@OriginalArg(0) OggPacket arg0);
}
