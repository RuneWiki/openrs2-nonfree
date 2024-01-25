import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ij")
public final class Class3_Sub23_Sub1 extends Class3_Sub23 {

	@OriginalMember(owner = "client!ij", name = "r", descriptor = "F")
	private float aFloat119;

	@OriginalMember(owner = "client!ij", name = "s", descriptor = "Ljava/lang/String;")
	private String aString36;

	@OriginalMember(owner = "client!ij", name = "t", descriptor = "F")
	private float aFloat120;

	@OriginalMember(owner = "client!ij", name = "y", descriptor = "I")
	private int anInt4802;

	@OriginalMember(owner = "client!ij", name = "z", descriptor = "I")
	private int anInt4803;

	@OriginalMember(owner = "client!ij", name = "B", descriptor = "Ljava/lang/String;")
	private String aString37;

	@OriginalMember(owner = "client!ij", name = "E", descriptor = "Ljava/lang/String;")
	private String aString38;

	@OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class3_Sub23_Sub1(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(B)Ljava/lang/String;")
	public String method4092() {
		return this.aString36;
	}

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(Lclient!jagtheora/ogg/OggPacket;I)V")
	@Override
	protected void method7999(@OriginalArg(0) OggPacket arg0) {
		if (super.anInt9343 > 0 && !"SUB".equals(this.aString37)) {
			return;
		}
		@Pc(25) Class3_Sub9 local25 = new Class3_Sub9(arg0.getData());
		@Pc(29) int local29 = local25.method5633();
		if (super.anInt9343 > 8) {
			if (local29 == 0) {
				@Pc(44) long local44 = local25.method5609();
				@Pc(48) long local48 = local25.method5609();
				@Pc(52) long local52 = local25.method5609();
				if (local44 < 0L || local48 < 0L || local52 < 0L || local52 > local44) {
					throw new IllegalStateException();
				}
				this.aFloat119 = (float) ((local48 + local44) * (long) this.anInt4803) / (float) this.anInt4802;
				this.aFloat120 = (float) (local44 * (long) this.anInt4803) / (float) this.anInt4802;
				@Pc(110) int local110 = local25.method5600();
				if (local110 < 0 || local25.aByteArray51.length - local25.anInt6453 < local110) {
					throw new IllegalStateException();
				}
				this.aString38 = Static26.method365(local25.aByteArray51, local110, local25.anInt6453);
			}
			if ((local29 | 0x80) != 0) {
				return;
			}
			return;
		}
		if ((local29 | 0x80) == 0) {
			throw new IllegalStateException();
		}
		if (super.anInt9343 != 0) {
			return;
		}
		local25.anInt6453 += 23;
		this.anInt4802 = local25.method5600();
		this.anInt4803 = local25.method5600();
		if (this.anInt4802 == 0 || this.anInt4803 == 0) {
			throw new IllegalStateException();
		}
		@Pc(190) Class3_Sub9 local190 = new Class3_Sub9(16);
		local25.method5577(0, 16, local190.aByteArray51);
		this.aString36 = local190.method5607();
		local190.anInt6453 = 0;
		local25.method5577(0, 16, local190.aByteArray51);
		this.aString37 = local190.method5607();
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)V")
	@Override
	public void method7994() {
	}

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(I)F")
	public float method4093() {
		return this.aFloat120;
	}

	@OriginalMember(owner = "client!ij", name = "c", descriptor = "(I)F")
	public float method4095() {
		return this.aFloat119;
	}

	@OriginalMember(owner = "client!ij", name = "d", descriptor = "(I)Ljava/lang/String;")
	public String method4096() {
		return this.aString38;
	}
}
