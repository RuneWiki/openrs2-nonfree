import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gg")
public final class Class2_Sub16_Sub3 extends Class2_Sub16 {

	@OriginalMember(owner = "client!gg", name = "o", descriptor = "Ljava/lang/String;")
	private String aString43;

	@OriginalMember(owner = "client!gg", name = "p", descriptor = "F")
	private float aFloat106;

	@OriginalMember(owner = "client!gg", name = "q", descriptor = "F")
	private float aFloat107;

	@OriginalMember(owner = "client!gg", name = "s", descriptor = "I")
	private int anInt3976;

	@OriginalMember(owner = "client!gg", name = "u", descriptor = "Ljava/lang/String;")
	private String aString44;

	@OriginalMember(owner = "client!gg", name = "z", descriptor = "I")
	private int anInt3980;

	@OriginalMember(owner = "client!gg", name = "C", descriptor = "Ljava/lang/String;")
	private String aString45;

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class2_Sub16_Sub3(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)Ljava/lang/String;")
	public String method3276() {
		return this.aString44;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)V")
	@Override
	public void method6550() {
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZLclient!jagtheora/ogg/OggPacket;)V")
	@Override
	protected void method6552(@OriginalArg(1) OggPacket arg0) {
		if (super.anInt7815 > 0 && !"SUB".equals(this.aString43)) {
			return;
		}
		@Pc(18) Class2_Sub34 local18 = new Class2_Sub34(arg0.getData());
		@Pc(26) int local26 = local18.method6904();
		if (super.anInt7815 > 8) {
			if (local26 == 0) {
				@Pc(36) long local36 = local18.method6890();
				@Pc(40) long local40 = local18.method6890();
				@Pc(44) long local44 = local18.method6890();
				if (local36 < 0L || local40 < 0L || local44 < 0L || local44 > local36) {
					throw new IllegalStateException();
				}
				this.aFloat107 = (float) ((local40 + local36) * (long) this.anInt3976) / (float) this.anInt3980;
				this.aFloat106 = (float) (local36 * (long) this.anInt3976) / (float) this.anInt3980;
				@Pc(102) int local102 = local18.method6878();
				if (local102 < 0 || local102 > local18.aByteArray77.length - local18.anInt8188) {
					throw new IllegalStateException();
				}
				this.aString45 = Static143.method2726(local18.anInt8188, local102, local18.aByteArray77);
			}
			if ((local26 | 0x80) != 0) {
				return;
			}
			return;
		}
		if ((local26 | 0x80) == 0) {
			throw new IllegalStateException();
		}
		if (super.anInt7815 != 0) {
			return;
		}
		local18.anInt8188 += 23;
		this.anInt3980 = local18.method6878();
		this.anInt3976 = local18.method6878();
		if (this.anInt3980 == 0 || this.anInt3976 == 0) {
			throw new IllegalStateException();
		}
		@Pc(182) Class2_Sub34 local182 = new Class2_Sub34(16);
		local18.method6891(local182.aByteArray77, 16, 0);
		this.aString44 = local182.method6903();
		local182.anInt8188 = 0;
		local18.method6891(local182.aByteArray77, 16, 0);
		this.aString43 = local182.method6903();
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Z)F")
	public float method3277() {
		return this.aFloat107;
	}

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "(I)Ljava/lang/String;")
	public String method3278() {
		return this.aString45;
	}

	@OriginalMember(owner = "client!gg", name = "g", descriptor = "(I)F")
	public float method3279() {
		return this.aFloat106;
	}
}
