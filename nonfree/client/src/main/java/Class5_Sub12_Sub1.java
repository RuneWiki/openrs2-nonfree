import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class5_Sub12_Sub1 extends Class5_Sub12 {

	@OriginalMember(owner = "client!ed", name = "I", descriptor = "Ljava/lang/String;")
	private String aString37;

	@OriginalMember(owner = "client!ed", name = "G", descriptor = "I")
	private int anInt2127;

	@OriginalMember(owner = "client!ed", name = "y", descriptor = "Ljava/lang/String;")
	private String aString38;

	@OriginalMember(owner = "client!ed", name = "z", descriptor = "I")
	private int anInt2132;

	@OriginalMember(owner = "client!ed", name = "K", descriptor = "F")
	private float aFloat15;

	@OriginalMember(owner = "client!ed", name = "x", descriptor = "Ljava/lang/String;")
	private String aString39;

	@OriginalMember(owner = "client!ed", name = "E", descriptor = "F")
	private float aFloat16;

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class5_Sub12_Sub1(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "(B)F")
	public float method1866() {
		return this.aFloat15;
	}

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "(B)Ljava/lang/String;")
	public String method1867() {
		return this.aString37;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z)F")
	public float method1868() {
		return this.aFloat16;
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(B)V")
	@Override
	public void method8413() {
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;B)V")
	@Override
	protected void method8408(@OriginalArg(0) OggPacket arg0) {
		if (super.anInt9782 > 0 && !"SUB".equals(this.aString38)) {
			return;
		}
		@Pc(23) Class5_Sub23 local23 = new Class5_Sub23(arg0.getData());
		@Pc(35) int local35 = local23.method8529();
		if (super.anInt9782 > 8) {
			if (local35 == 0) {
				@Pc(52) long local52 = local23.method8495();
				@Pc(56) long local56 = local23.method8495();
				@Pc(60) long local60 = local23.method8495();
				if (local52 < 0L || local56 < 0L || local60 < 0L || local60 > local52) {
					throw new IllegalStateException();
				}
				this.aFloat16 = (float) (local52 * (long) this.anInt2127) / (float) this.anInt2132;
				this.aFloat15 = (float) ((long) this.anInt2127 * (local56 + local52)) / (float) this.anInt2132;
				@Pc(121) int local121 = local23.method8482();
				if (local121 < 0 || local121 > local23.aByteArray102.length - local23.anInt9869) {
					throw new IllegalStateException();
				}
				this.aString39 = Static407.method6006(local23.aByteArray102, local121, local23.anInt9869);
			}
			if ((local35 | 0x80) != 0) {
				return;
			}
			return;
		}
		if ((local35 | 0x80) == 0) {
			throw new IllegalStateException();
		}
		if (super.anInt9782 != 0) {
			return;
		}
		local23.anInt9869 += 23;
		this.anInt2132 = local23.method8482();
		this.anInt2127 = local23.method8482();
		if (this.anInt2132 == 0 || this.anInt2127 == 0) {
			throw new IllegalStateException();
		}
		@Pc(208) Class5_Sub23 local208 = new Class5_Sub23(16);
		local23.method8487(local208.aByteArray102, 16, 0);
		this.aString37 = local208.method8497();
		local208.anInt9869 = 0;
		local23.method8487(local208.aByteArray102, 16, 0);
		this.aString38 = local208.method8497();
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)Ljava/lang/String;")
	public String method1871() {
		return this.aString39;
	}
}
