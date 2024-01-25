import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class2_Sub12_Sub3 extends Class2_Sub12 {

	@OriginalMember(owner = "client!kb", name = "w", descriptor = "F")
	private float aFloat65;

	@OriginalMember(owner = "client!kb", name = "G", descriptor = "F")
	private float aFloat66;

	@OriginalMember(owner = "client!kb", name = "B", descriptor = "Ljava/lang/String;")
	private String aString53;

	@OriginalMember(owner = "client!kb", name = "C", descriptor = "I")
	private int anInt4916;

	@OriginalMember(owner = "client!kb", name = "x", descriptor = "I")
	private int anInt4918;

	@OriginalMember(owner = "client!kb", name = "A", descriptor = "Ljava/lang/String;")
	private String aString54;

	@OriginalMember(owner = "client!kb", name = "y", descriptor = "Ljava/lang/String;")
	private String aString55;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class2_Sub12_Sub3(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;B)V")
	@Override
	protected void method7838(@OriginalArg(0) OggPacket arg0) {
		if (super.anInt8868 > 0 && !"SUB".equals(this.aString53)) {
			return;
		}
		@Pc(26) Class2_Sub20 local26 = new Class2_Sub20(arg0.getData());
		@Pc(30) int local30 = local26.method8581(-17416);
		if (super.anInt8868 <= 8) {
			if ((local30 | 0x80) == 0) {
				throw new IllegalStateException();
			}
			if (super.anInt8868 == 0) {
				local26.anInt9723 += 23;
				this.anInt4918 = local26.method8543();
				this.anInt4916 = local26.method8543();
				if (this.anInt4918 == 0 || this.anInt4916 == 0) {
					throw new IllegalStateException();
				}
				@Pc(97) Class2_Sub20 local97 = new Class2_Sub20(16);
				local26.method8573(16, 0, local97.aByteArray111);
				this.aString54 = local97.method8553();
				local97.anInt9723 = 0;
				local26.method8573(16, 0, local97.aByteArray111);
				this.aString53 = local97.method8553();
			}
			return;
		}
		if (local30 == 0) {
			@Pc(136) long local136 = local26.method8591();
			@Pc(140) long local140 = local26.method8591();
			@Pc(144) long local144 = local26.method8591();
			if (local136 < 0L || local140 < 0L || local144 < 0L || local144 > local136) {
				throw new IllegalStateException();
			}
			this.aFloat65 = (float) (local136 * (long) this.anInt4916) / (float) this.anInt4918;
			this.aFloat66 = (float) ((long) this.anInt4916 * (local136 + local140)) / (float) this.anInt4918;
			@Pc(209) int local209 = local26.method8543();
			if (local209 < 0 || local209 > local26.aByteArray111.length - local26.anInt9723) {
				throw new IllegalStateException();
			}
			this.aString55 = Static218.method3056(local209, local26.aByteArray111, local26.anInt9723);
		}
		if ((local30 | 0x80) != 0) {
			return;
		}
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(Z)Ljava/lang/String;")
	public String method4446() {
		return this.aString55;
	}

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "(I)F")
	public float method4447() {
		return this.aFloat66;
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V")
	@Override
	public void method7843() {
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(I)F")
	public float method4448() {
		return this.aFloat65;
	}

	@OriginalMember(owner = "client!kb", name = "g", descriptor = "(I)Ljava/lang/String;")
	public String method4450() {
		return this.aString54;
	}
}
