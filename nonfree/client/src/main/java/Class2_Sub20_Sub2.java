import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kh")
public final class Class2_Sub20_Sub2 extends Class2_Sub20 {

	@OriginalMember(owner = "client!kh", name = "r", descriptor = "F")
	private float aFloat110;

	@OriginalMember(owner = "client!kh", name = "z", descriptor = "I")
	private int anInt5310;

	@OriginalMember(owner = "client!kh", name = "A", descriptor = "Ljava/lang/String;")
	private String aString45;

	@OriginalMember(owner = "client!kh", name = "B", descriptor = "Ljava/lang/String;")
	private String aString46;

	@OriginalMember(owner = "client!kh", name = "E", descriptor = "I")
	private int anInt5312;

	@OriginalMember(owner = "client!kh", name = "G", descriptor = "Ljava/lang/String;")
	private String aString47;

	@OriginalMember(owner = "client!kh", name = "I", descriptor = "F")
	private float aFloat111;

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class2_Sub20_Sub2(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)F")
	public float method4649() {
		return this.aFloat110;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(BLclient!jagtheora/ogg/OggPacket;)V")
	@Override
	protected void method7363(@OriginalArg(1) OggPacket arg0) {
		if (super.anInt8543 > 0 && !"SUB".equals(this.aString46)) {
			return;
		}
		@Pc(23) Class2_Sub17 local23 = new Class2_Sub17(arg0.getData());
		@Pc(27) int local27 = local23.method2859();
		if (super.anInt8543 > 8) {
			if (local27 == 0) {
				@Pc(42) long local42 = local23.method2869();
				@Pc(46) long local46 = local23.method2869();
				@Pc(52) long local52 = local23.method2869();
				if (local42 < 0L || local46 < 0L || local52 < 0L || local52 > local42) {
					throw new IllegalStateException();
				}
				this.aFloat111 = (float) ((long) this.anInt5310 * (local42 + local46)) / (float) this.anInt5312;
				this.aFloat110 = (float) (local42 * (long) this.anInt5310) / (float) this.anInt5312;
				@Pc(110) int local110 = local23.method2834();
				if (local110 < 0 || local23.aByteArray26.length - local23.anInt3378 < local110) {
					throw new IllegalStateException();
				}
				this.aString47 = Static25.method7463(local110, local23.aByteArray26, local23.anInt3378);
			}
			if ((local27 | 0x80) != 0) {
				return;
			}
			return;
		}
		if ((local27 | 0x80) == 0) {
			throw new IllegalStateException();
		}
		if (super.anInt8543 != 0) {
			return;
		}
		local23.anInt3378 += 23;
		this.anInt5312 = local23.method2834();
		this.anInt5310 = local23.method2834();
		if (this.anInt5312 == 0 || this.anInt5310 == 0) {
			throw new IllegalStateException();
		}
		@Pc(186) Class2_Sub17 local186 = new Class2_Sub17(16);
		local23.method2832(local186.aByteArray26, 16, 0);
		this.aString45 = local186.method2833();
		local186.anInt3378 = 0;
		local23.method2832(local186.aByteArray26, 16, 0);
		this.aString46 = local186.method2833();
	}

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "(I)F")
	public float method4651() {
		return this.aFloat111;
	}

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "(Z)Ljava/lang/String;")
	public String method4652() {
		return this.aString45;
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(B)Ljava/lang/String;")
	public String method4653() {
		return this.aString47;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Z)V")
	@Override
	public void method7360() {
	}
}
