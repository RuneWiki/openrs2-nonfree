import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!as")
public final class Class4_Sub6_Sub1 extends Class4_Sub6 {

	@OriginalMember(owner = "client!as", name = "o", descriptor = "F")
	private float aFloat11;

	@OriginalMember(owner = "client!as", name = "q", descriptor = "F")
	private float aFloat12;

	@OriginalMember(owner = "client!as", name = "t", descriptor = "I")
	private int anInt509;

	@OriginalMember(owner = "client!as", name = "u", descriptor = "I")
	private int anInt510;

	@OriginalMember(owner = "client!as", name = "z", descriptor = "Ljava/lang/String;")
	private String aString3;

	@OriginalMember(owner = "client!as", name = "D", descriptor = "Ljava/lang/String;")
	private String aString4;

	@OriginalMember(owner = "client!as", name = "E", descriptor = "Ljava/lang/String;")
	private String aString5;

	@OriginalMember(owner = "client!as", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class4_Sub6_Sub1(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!as", name = "b", descriptor = "(B)F")
	public float method556() {
		return this.aFloat12;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(I)V")
	@Override
	public void method6631() {
	}

	@OriginalMember(owner = "client!as", name = "d", descriptor = "(B)Ljava/lang/String;")
	public String method559() {
		return this.aString3;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(ILclient!jagtheora/ogg/OggPacket;)V")
	@Override
	protected void method6634(@OriginalArg(1) OggPacket arg0) {
		if (super.anInt7625 > 0 && !"SUB".equals(this.aString5)) {
			return;
		}
		@Pc(21) Class4_Sub11 local21 = new Class4_Sub11(arg0.getData());
		@Pc(25) int local25 = local21.method8865();
		if (super.anInt7625 > 8) {
			if (local25 == 0) {
				@Pc(38) long local38 = local21.method8841();
				@Pc(42) long local42 = local21.method8841();
				@Pc(46) long local46 = local21.method8841();
				if (local38 < 0L || local42 < 0L || local46 < 0L || local46 > local38) {
					throw new IllegalStateException();
				}
				this.aFloat11 = (float) ((local42 + local38) * (long) this.anInt510) / (float) this.anInt509;
				this.aFloat12 = (float) (local38 * (long) this.anInt510) / (float) this.anInt509;
				@Pc(98) int local98 = local21.method8874();
				if (local98 < 0 || local98 > local21.aByteArray107.length - local21.anInt10466) {
					throw new IllegalStateException();
				}
				this.aString4 = Static89.method1799(local21.aByteArray107, local21.anInt10466, local98);
			}
			if ((local25 | 0x80) != 0) {
				return;
			}
			return;
		}
		if ((local25 | 0x80) == 0) {
			throw new IllegalStateException();
		}
		if (super.anInt7625 != 0) {
			return;
		}
		local21.anInt10466 += 23;
		this.anInt509 = local21.method8874();
		this.anInt510 = local21.method8874();
		if (this.anInt509 == 0 || this.anInt510 == 0) {
			throw new IllegalStateException();
		}
		@Pc(183) Class4_Sub11 local183 = new Class4_Sub11(16);
		local21.method8870(local183.aByteArray107, 0, 16);
		this.aString3 = local183.method8853();
		local183.anInt10466 = 0;
		local21.method8870(local183.aByteArray107, 0, 16);
		this.aString5 = local183.method8853();
	}

	@OriginalMember(owner = "client!as", name = "b", descriptor = "(Z)F")
	public float method560() {
		return this.aFloat11;
	}

	@OriginalMember(owner = "client!as", name = "b", descriptor = "(I)Ljava/lang/String;")
	public String method561() {
		return this.aString4;
	}
}
