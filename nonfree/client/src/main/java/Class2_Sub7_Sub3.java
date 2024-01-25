import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!op")
public final class Class2_Sub7_Sub3 extends Class2_Sub7 {

	@OriginalMember(owner = "client!op", name = "r", descriptor = "I")
	private int anInt6403;

	@OriginalMember(owner = "client!op", name = "v", descriptor = "Ljava/lang/String;")
	private String aString87;

	@OriginalMember(owner = "client!op", name = "w", descriptor = "Ljava/lang/String;")
	private String aString88;

	@OriginalMember(owner = "client!op", name = "x", descriptor = "F")
	private float aFloat118;

	@OriginalMember(owner = "client!op", name = "y", descriptor = "I")
	private int anInt6406;

	@OriginalMember(owner = "client!op", name = "A", descriptor = "F")
	private float aFloat119;

	@OriginalMember(owner = "client!op", name = "G", descriptor = "Ljava/lang/String;")
	private String aString89;

	@OriginalMember(owner = "client!op", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class2_Sub7_Sub3(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(B)F")
	public float method5526() {
		return this.aFloat119;
	}

	@OriginalMember(owner = "client!op", name = "b", descriptor = "(I)Ljava/lang/String;")
	public String method5527() {
		return this.aString87;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;B)V")
	@Override
	protected void method8314(@OriginalArg(0) OggPacket arg0) {
		if (super.anInt9987 > 0 && !"SUB".equals(this.aString88)) {
			return;
		}
		@Pc(25) Class2_Sub22 local25 = new Class2_Sub22(arg0.getData());
		@Pc(29) int local29 = local25.method8547();
		if (super.anInt9987 > 8) {
			if (local29 == 0) {
				@Pc(119) long local119 = local25.method8516();
				@Pc(123) long local123 = local25.method8516();
				@Pc(127) long local127 = local25.method8516();
				if (local119 < 0L || local123 < 0L || local127 < 0L || local119 < local127) {
					throw new IllegalStateException();
				}
				this.aFloat118 = (float) ((long) this.anInt6403 * local119) / (float) this.anInt6406;
				this.aFloat119 = (float) ((long) this.anInt6403 * (local119 + local123)) / (float) this.anInt6406;
				@Pc(182) int local182 = local25.method8551();
				if (local182 < 0 || local25.aByteArray115.length - local25.anInt10247 < local182) {
					throw new IllegalStateException();
				}
				this.aString89 = Static30.method552(local182, local25.anInt10247, local25.aByteArray115);
			}
			if ((local29 | 0x80) != 0) {
				return;
			}
			return;
		}
		if ((local29 | 0x80) == 0) {
			throw new IllegalStateException();
		}
		if (super.anInt9987 != 0) {
			return;
		}
		local25.anInt10247 += 23;
		this.anInt6406 = local25.method8551();
		this.anInt6403 = local25.method8551();
		if (this.anInt6406 != 0 && this.anInt6403 != 0) {
			@Pc(82) Class2_Sub22 local82 = new Class2_Sub22(16);
			local25.method8502(local82.aByteArray115, 0, 16);
			this.aString87 = local82.method8549();
			local82.anInt10247 = 0;
			local25.method8502(local82.aByteArray115, 0, 16);
			this.aString88 = local82.method8549();
			return;
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!op", name = "b", descriptor = "(B)Ljava/lang/String;")
	public String method5528() {
		return this.aString89;
	}

	@OriginalMember(owner = "client!op", name = "f", descriptor = "(I)F")
	public float method5529() {
		return this.aFloat118;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(I)V")
	@Override
	public void method8318() {
	}
}
