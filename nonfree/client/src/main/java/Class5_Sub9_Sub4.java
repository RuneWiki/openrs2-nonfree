import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uh")
public final class Class5_Sub9_Sub4 extends Class5_Sub9 {

	@OriginalMember(owner = "client!uh", name = "s", descriptor = "Ljava/lang/String;")
	private String aString96;

	@OriginalMember(owner = "client!uh", name = "t", descriptor = "F")
	private float aFloat204;

	@OriginalMember(owner = "client!uh", name = "y", descriptor = "Ljava/lang/String;")
	private String aString97;

	@OriginalMember(owner = "client!uh", name = "B", descriptor = "I")
	private int anInt9837;

	@OriginalMember(owner = "client!uh", name = "C", descriptor = "I")
	private int anInt9838;

	@OriginalMember(owner = "client!uh", name = "E", descriptor = "F")
	private float aFloat205;

	@OriginalMember(owner = "client!uh", name = "H", descriptor = "Ljava/lang/String;")
	private String aString98;

	@OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class5_Sub9_Sub4(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V")
	@Override
	public void method8195() {
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;Z)V")
	@Override
	protected void method8197(@OriginalArg(0) OggPacket arg0) {
		if (super.anInt9828 > 0 && !"SUB".equals(this.aString98)) {
			return;
		}
		@Pc(18) Class5_Sub41 local18 = new Class5_Sub41(arg0.getData());
		@Pc(22) int local22 = local18.method7816();
		if (super.anInt9828 > 8) {
			if (local22 == 0) {
				@Pc(32) long local32 = local18.method7825();
				@Pc(36) long local36 = local18.method7825();
				@Pc(40) long local40 = local18.method7825();
				if (local32 < 0L || local36 < 0L || local40 < 0L || local40 > local32) {
					throw new IllegalStateException();
				}
				this.aFloat205 = (float) ((local32 + local36) * (long) this.anInt9837) / (float) this.anInt9838;
				this.aFloat204 = (float) (local32 * (long) this.anInt9837) / (float) this.anInt9838;
				@Pc(98) int local98 = local18.method7857();
				if (local98 < 0 || local18.aByteArray93.length - local18.anInt9230 < local98) {
					throw new IllegalStateException();
				}
				this.aString96 = Static629.method8495(local98, local18.anInt9230, local18.aByteArray93);
			}
			if ((local22 | 0x80) != 0) {
				return;
			}
			return;
		}
		if ((local22 | 0x80) == 0) {
			throw new IllegalStateException();
		}
		if (super.anInt9828 != 0) {
			return;
		}
		local18.anInt9230 += 23;
		this.anInt9838 = local18.method7857();
		this.anInt9837 = local18.method7857();
		if (this.anInt9838 == 0 || this.anInt9837 == 0) {
			throw new IllegalStateException();
		}
		@Pc(178) Class5_Sub41 local178 = new Class5_Sub41(16);
		local18.method7802(16, 0, local178.aByteArray93);
		this.aString97 = local178.method7847();
		local178.anInt9230 = 0;
		local18.method7802(16, 0, local178.aByteArray93);
		this.aString98 = local178.method7847();
	}

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(I)F")
	public float method8202() {
		return this.aFloat204;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)F")
	public float method8204() {
		return this.aFloat205;
	}

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(B)Ljava/lang/String;")
	public String method8206() {
		return this.aString97;
	}

	@OriginalMember(owner = "client!uh", name = "f", descriptor = "(I)Ljava/lang/String;")
	public String method8207() {
		return this.aString96;
	}
}
