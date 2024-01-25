import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!en")
public final class Class5_Sub14_Sub1 extends Class5_Sub14 {

	@OriginalMember(owner = "client!en", name = "C", descriptor = "F")
	private float aFloat62;

	@OriginalMember(owner = "client!en", name = "D", descriptor = "Ljava/lang/String;")
	private String aString16;

	@OriginalMember(owner = "client!en", name = "N", descriptor = "I")
	private int anInt2185;

	@OriginalMember(owner = "client!en", name = "H", descriptor = "F")
	private float aFloat63;

	@OriginalMember(owner = "client!en", name = "I", descriptor = "I")
	private int anInt2189;

	@OriginalMember(owner = "client!en", name = "F", descriptor = "Ljava/lang/String;")
	private String aString17;

	@OriginalMember(owner = "client!en", name = "L", descriptor = "Ljava/lang/String;")
	private String aString18;

	@OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class5_Sub14_Sub1(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!en", name = "j", descriptor = "(I)F")
	public float method1951() {
		return this.aFloat62;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(B)V")
	@Override
	public void method8231() {
	}

	@OriginalMember(owner = "client!en", name = "e", descriptor = "(I)Ljava/lang/String;")
	public String method1954() {
		return this.aString17;
	}

	@OriginalMember(owner = "client!en", name = "d", descriptor = "(I)Ljava/lang/String;")
	public String method1955() {
		return this.aString18;
	}

	@OriginalMember(owner = "client!en", name = "c", descriptor = "(I)F")
	public float method1956() {
		return this.aFloat63;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(BLclient!jagtheora/ogg/OggPacket;)V")
	@Override
	protected void method8230(@OriginalArg(1) OggPacket arg0) {
		if (super.anInt9655 > 0 && !"SUB".equals(this.aString16)) {
			return;
		}
		@Pc(33) Class5_Sub36 local33 = new Class5_Sub36(arg0.getData());
		@Pc(37) int local37 = local33.method7291();
		if (super.anInt9655 > 8) {
			if (local37 == 0) {
				@Pc(51) long local51 = local33.method7321();
				@Pc(55) long local55 = local33.method7321();
				@Pc(59) long local59 = local33.method7321();
				if (local51 < 0L || local55 < 0L || local59 < 0L || local51 < local59) {
					throw new IllegalStateException();
				}
				this.aFloat62 = (float) ((long) this.anInt2185 * local51) / (float) this.anInt2189;
				this.aFloat63 = (float) ((local51 + local55) * (long) this.anInt2185) / (float) this.anInt2189;
				@Pc(120) int local120 = local33.method7298();
				if (local120 < 0 || local33.aByteArray89.length - local33.anInt8456 < local120) {
					throw new IllegalStateException();
				}
				this.aString17 = Static598.method9153(local33.anInt8456, local33.aByteArray89, local120);
			}
			if ((local37 | 0x80) != 0) {
				return;
			}
			return;
		}
		if ((local37 | 0x80) == 0) {
			throw new IllegalStateException();
		}
		if (super.anInt9655 != 0) {
			return;
		}
		local33.anInt8456 += 23;
		this.anInt2189 = local33.method7298();
		this.anInt2185 = local33.method7298();
		if (this.anInt2189 == 0 || this.anInt2185 == 0) {
			throw new IllegalStateException();
		}
		@Pc(207) Class5_Sub36 local207 = new Class5_Sub36(16);
		local33.method7297(local207.aByteArray89, 0, 16);
		this.aString18 = local207.method7281();
		local207.anInt8456 = 0;
		local33.method7297(local207.aByteArray89, 0, 16);
		this.aString16 = local207.method7281();
	}
}
