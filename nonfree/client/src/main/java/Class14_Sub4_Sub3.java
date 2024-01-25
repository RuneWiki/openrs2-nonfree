import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hp")
public final class Class14_Sub4_Sub3 extends Class14_Sub4 {

	@OriginalMember(owner = "client!hp", name = "I", descriptor = "F")
	private float aFloat69;

	@OriginalMember(owner = "client!hp", name = "B", descriptor = "Ljava/lang/String;")
	private String aString46;

	@OriginalMember(owner = "client!hp", name = "w", descriptor = "Ljava/lang/String;")
	private String aString47;

	@OriginalMember(owner = "client!hp", name = "F", descriptor = "Ljava/lang/String;")
	private String aString48;

	@OriginalMember(owner = "client!hp", name = "H", descriptor = "F")
	private float aFloat70;

	@OriginalMember(owner = "client!hp", name = "y", descriptor = "I")
	private int anInt4460;

	@OriginalMember(owner = "client!hp", name = "C", descriptor = "I")
	private int anInt4461;

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class14_Sub4_Sub3(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;B)V")
	@Override
	protected void method9266(@OriginalArg(0) OggPacket arg0) {
		if (super.anInt10922 > 0 && !"SUB".equals(this.aString48)) {
			return;
		}
		@Pc(23) Class14_Sub21 local23 = new Class14_Sub21(arg0.getData());
		@Pc(36) int local36 = local23.method7695(102);
		if (super.anInt10922 > 8) {
			if (local36 == 0) {
				@Pc(50) long local50 = local23.method7700();
				@Pc(54) long local54 = local23.method7700();
				@Pc(58) long local58 = local23.method7700();
				if (local50 < 0L || local54 < 0L || local58 < 0L || local58 > local50) {
					throw new IllegalStateException();
				}
				this.aFloat70 = (float) ((long) this.anInt4460 * local50) / (float) this.anInt4461;
				this.aFloat69 = (float) ((local50 + local54) * (long) this.anInt4460) / (float) this.anInt4461;
				@Pc(120) int local120 = local23.method7713();
				if (local120 < 0 || local23.aByteArray99.length - local23.anInt8936 < local120) {
					throw new IllegalStateException();
				}
				this.aString47 = Static62.method9404(local120, local23.aByteArray99, local23.anInt8936);
			}
			if ((local36 | 0x80) != 0) {
				return;
			}
			return;
		}
		if ((local36 | 0x80) == 0) {
			throw new IllegalStateException();
		}
		if (super.anInt10922 != 0) {
			return;
		}
		local23.anInt8936 += 23;
		this.anInt4461 = local23.method7713();
		this.anInt4460 = local23.method7713();
		if (this.anInt4461 == 0 || this.anInt4460 == 0) {
			throw new IllegalStateException();
		}
		@Pc(203) Class14_Sub21 local203 = new Class14_Sub21(16);
		local23.method7750(16, 0, local203.aByteArray99);
		this.aString46 = local203.method7703(0);
		local203.anInt8936 = 0;
		local23.method7750(16, 0, local203.aByteArray99);
		this.aString48 = local203.method7703(0);
	}

	@OriginalMember(owner = "client!hp", name = "f", descriptor = "(I)Ljava/lang/String;")
	public String method3901() {
		return this.aString47;
	}

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "(B)F")
	public float method3902() {
		return this.aFloat70;
	}

	@OriginalMember(owner = "client!hp", name = "d", descriptor = "(I)V")
	@Override
	public void method9267() {
	}

	@OriginalMember(owner = "client!hp", name = "g", descriptor = "(I)Ljava/lang/String;")
	public String method3905() {
		return this.aString46;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(B)F")
	public float method3906() {
		return this.aFloat69;
	}
}
