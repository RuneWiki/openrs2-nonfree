import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class3_Sub6_Sub2 extends Class3_Sub6 {

	@OriginalMember(owner = "client!qb", name = "r", descriptor = "I")
	private int anInt7989;

	@OriginalMember(owner = "client!qb", name = "s", descriptor = "I")
	private int anInt7990;

	@OriginalMember(owner = "client!qb", name = "t", descriptor = "Ljava/lang/String;")
	private String aString86;

	@OriginalMember(owner = "client!qb", name = "u", descriptor = "Ljava/lang/String;")
	private String aString87;

	@OriginalMember(owner = "client!qb", name = "v", descriptor = "F")
	private float aFloat184;

	@OriginalMember(owner = "client!qb", name = "y", descriptor = "F")
	private float aFloat185;

	@OriginalMember(owner = "client!qb", name = "A", descriptor = "Ljava/lang/String;")
	private String aString88;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class3_Sub6_Sub2(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)Ljava/lang/String;")
	public String method6944() {
		return this.aString87;
	}

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "(I)Ljava/lang/String;")
	public String method6945() {
		return this.aString88;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;Z)V")
	@Override
	protected void method8692(@OriginalArg(0) OggPacket arg0) {
		if (super.anInt10134 > 0 && !"SUB".equals(this.aString86)) {
			return;
		}
		@Pc(18) Class3_Sub3 local18 = new Class3_Sub3(arg0.getData());
		@Pc(22) int local22 = local18.method4225();
		if (super.anInt10134 > 8) {
			if (local22 == 0) {
				@Pc(35) long local35 = local18.method4212();
				@Pc(39) long local39 = local18.method4212();
				@Pc(43) long local43 = local18.method4212();
				if (local35 < 0L || local39 < 0L || local43 < 0L || local43 > local35) {
					throw new IllegalStateException();
				}
				this.aFloat184 = (float) ((long) this.anInt7990 * (local39 + local35)) / (float) this.anInt7989;
				this.aFloat185 = (float) (local35 * (long) this.anInt7990) / (float) this.anInt7989;
				@Pc(101) int local101 = local18.method4262();
				if (local101 < 0 || local18.aByteArray54.length - local18.anInt4736 < local101) {
					throw new IllegalStateException();
				}
				this.aString87 = Static583.method8237(local18.anInt4736, local18.aByteArray54, local101);
			}
			if ((local22 | 0x80) != 0) {
				return;
			}
			return;
		}
		if ((local22 | 0x80) == 0) {
			throw new IllegalStateException();
		}
		if (super.anInt10134 != 0) {
			return;
		}
		local18.anInt4736 += 23;
		this.anInt7989 = local18.method4262();
		this.anInt7990 = local18.method4262();
		if (this.anInt7989 == 0 || this.anInt7990 == 0) {
			throw new IllegalStateException();
		}
		@Pc(188) Class3_Sub3 local188 = new Class3_Sub3(16);
		local18.method4206(local188.aByteArray54, 16, 0);
		this.aString88 = local188.method4233();
		local188.anInt4736 = 0;
		local18.method4206(local188.aByteArray54, 16, 0);
		this.aString86 = local188.method4233();
	}

	@OriginalMember(owner = "client!qb", name = "f", descriptor = "(I)F")
	public float method6947() {
		return this.aFloat184;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
	@Override
	public void method8689() {
	}

	@OriginalMember(owner = "client!qb", name = "g", descriptor = "(I)F")
	public float method6948() {
		return this.aFloat185;
	}
}
