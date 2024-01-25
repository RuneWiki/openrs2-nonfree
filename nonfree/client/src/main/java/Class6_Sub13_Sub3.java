import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ku")
public final class Class6_Sub13_Sub3 extends Class6_Sub13 {

	@OriginalMember(owner = "client!ku", name = "t", descriptor = "I")
	private int anInt5862;

	@OriginalMember(owner = "client!ku", name = "v", descriptor = "F")
	private float aFloat112;

	@OriginalMember(owner = "client!ku", name = "x", descriptor = "Ljava/lang/String;")
	private String aString70;

	@OriginalMember(owner = "client!ku", name = "B", descriptor = "I")
	private int anInt5868;

	@OriginalMember(owner = "client!ku", name = "D", descriptor = "Ljava/lang/String;")
	private String aString71;

	@OriginalMember(owner = "client!ku", name = "F", descriptor = "Ljava/lang/String;")
	private String aString72;

	@OriginalMember(owner = "client!ku", name = "G", descriptor = "F")
	private float aFloat113;

	@OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class6_Sub13_Sub3(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ku", name = "b", descriptor = "(I)F")
	public float method5137() {
		return this.aFloat112;
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;I)V")
	@Override
	protected void method6907(@OriginalArg(0) OggPacket arg0) {
		if (super.anInt8013 > 0 && !"SUB".equals(this.aString72)) {
			return;
		}
		@Pc(24) Class6_Sub40 local24 = new Class6_Sub40(arg0.getData());
		@Pc(30) int local30 = local24.method8604();
		if (super.anInt8013 > 8) {
			if (local30 == 0) {
				@Pc(122) long local122 = local24.method8582();
				@Pc(126) long local126 = local24.method8582();
				@Pc(130) long local130 = local24.method8582();
				if (local122 < 0L || local126 < 0L || local130 < 0L || local130 > local122) {
					throw new IllegalStateException();
				}
				this.aFloat113 = (float) ((local122 + local126) * (long) this.anInt5862) / (float) this.anInt5868;
				this.aFloat112 = (float) (local122 * (long) this.anInt5862) / (float) this.anInt5868;
				@Pc(184) int local184 = local24.method8599();
				if (local184 < 0 || local24.aByteArray113.length - local24.anInt10169 < local184) {
					throw new IllegalStateException();
				}
				this.aString70 = Static426.method6678(local184, local24.aByteArray113, local24.anInt10169);
			}
			if ((local30 | 0x80) != 0) {
				return;
			}
			return;
		}
		if ((local30 | 0x80) == 0) {
			throw new IllegalStateException();
		}
		if (super.anInt8013 != 0) {
			return;
		}
		local24.anInt10169 += 23;
		this.anInt5868 = local24.method8599();
		this.anInt5862 = local24.method8599();
		if (this.anInt5868 != 0 && this.anInt5862 != 0) {
			@Pc(81) Class6_Sub40 local81 = new Class6_Sub40(16);
			local24.method8595(local81.aByteArray113, 16, 0);
			this.aString71 = local81.method8611();
			local81.anInt10169 = 0;
			local24.method8595(local81.aByteArray113, 16, 0);
			this.aString72 = local81.method8611();
			return;
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(Z)F")
	public float method5138() {
		return this.aFloat113;
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(I)V")
	@Override
	public void method6910() {
	}

	@OriginalMember(owner = "client!ku", name = "c", descriptor = "(I)Ljava/lang/String;")
	public String method5140() {
		return this.aString71;
	}

	@OriginalMember(owner = "client!ku", name = "b", descriptor = "(B)Ljava/lang/String;")
	public String method5141() {
		return this.aString70;
	}
}
