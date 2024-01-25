import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iv")
public final class Class3_Sub19_Sub3 extends Class3_Sub19 {

	@OriginalMember(owner = "client!iv", name = "w", descriptor = "I")
	private int anInt4691;

	@OriginalMember(owner = "client!iv", name = "x", descriptor = "I")
	private int anInt4692;

	@OriginalMember(owner = "client!iv", name = "y", descriptor = "Ljava/lang/String;")
	private String aString42;

	@OriginalMember(owner = "client!iv", name = "A", descriptor = "Ljava/lang/String;")
	private String aString43;

	@OriginalMember(owner = "client!iv", name = "F", descriptor = "F")
	private float aFloat101;

	@OriginalMember(owner = "client!iv", name = "G", descriptor = "Ljava/lang/String;")
	private String aString44;

	@OriginalMember(owner = "client!iv", name = "K", descriptor = "F")
	private float aFloat102;

	@OriginalMember(owner = "client!iv", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class3_Sub19_Sub3(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(I)V")
	@Override
	public void method8042() {
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(B)F")
	public float method4287() {
		return this.aFloat101;
	}

	@OriginalMember(owner = "client!iv", name = "b", descriptor = "(Z)Ljava/lang/String;")
	public String method4288() {
		return this.aString43;
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;B)V")
	@Override
	protected void method8040(@OriginalArg(0) OggPacket arg0) {
		if (super.anInt9195 > 0 && !"SUB".equals(this.aString44)) {
			return;
		}
		@Pc(18) Class3_Sub25 local18 = new Class3_Sub25(arg0.getData());
		@Pc(28) int local28 = local18.method8632();
		if (super.anInt9195 > 8) {
			if (local28 == 0) {
				@Pc(40) long local40 = local18.method8638();
				@Pc(44) long local44 = local18.method8638();
				@Pc(48) long local48 = local18.method8638();
				if (local40 < 0L || local44 < 0L || local48 < 0L || local40 < local48) {
					throw new IllegalStateException();
				}
				this.aFloat102 = (float) (local40 * (long) this.anInt4691) / (float) this.anInt4692;
				this.aFloat101 = (float) ((long) this.anInt4691 * (local40 + local44)) / (float) this.anInt4692;
				@Pc(106) int local106 = local18.method8633();
				if (local106 < 0 || local106 > local18.aByteArray106.length - local18.anInt9765) {
					throw new IllegalStateException();
				}
				this.aString43 = Static55.method1208(local18.aByteArray106, local106, local18.anInt9765);
			}
			if ((local28 | 0x80) != 0) {
				return;
			}
			return;
		}
		if ((local28 | 0x80) == 0) {
			throw new IllegalStateException();
		}
		if (super.anInt9195 != 0) {
			return;
		}
		local18.anInt9765 += 23;
		this.anInt4692 = local18.method8633();
		this.anInt4691 = local18.method8633();
		if (this.anInt4692 == 0 || this.anInt4691 == 0) {
			throw new IllegalStateException();
		}
		@Pc(189) Class3_Sub25 local189 = new Class3_Sub25(16);
		local18.method8623(0, 16, local189.aByteArray106);
		this.aString42 = local189.method8613();
		local189.anInt9765 = 0;
		local18.method8623(0, 16, local189.aByteArray106);
		this.aString44 = local189.method8613();
	}

	@OriginalMember(owner = "client!iv", name = "d", descriptor = "(I)Ljava/lang/String;")
	public String method4289() {
		return this.aString42;
	}

	@OriginalMember(owner = "client!iv", name = "d", descriptor = "(B)F")
	public float method4290() {
		return this.aFloat102;
	}
}
