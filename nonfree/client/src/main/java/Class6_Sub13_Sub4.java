import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wda")
public final class Class6_Sub13_Sub4 extends Class6_Sub13 {

	@OriginalMember(owner = "client!wda", name = "u", descriptor = "I")
	private int anInt10521;

	@OriginalMember(owner = "client!wda", name = "v", descriptor = "Ljava/lang/String;")
	private String aString110;

	@OriginalMember(owner = "client!wda", name = "y", descriptor = "Ljava/lang/String;")
	private String aString111;

	@OriginalMember(owner = "client!wda", name = "B", descriptor = "F")
	private float aFloat186;

	@OriginalMember(owner = "client!wda", name = "D", descriptor = "I")
	private int anInt10525;

	@OriginalMember(owner = "client!wda", name = "E", descriptor = "Ljava/lang/String;")
	private String aString112;

	@OriginalMember(owner = "client!wda", name = "L", descriptor = "F")
	private float aFloat187;

	@OriginalMember(owner = "client!wda", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class6_Sub13_Sub4(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!wda", name = "f", descriptor = "(I)Ljava/lang/String;")
	public String method8554() {
		return this.aString112;
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;Z)V")
	@Override
	protected void method8548(@OriginalArg(0) OggPacket arg0) {
		if (super.anInt10513 > 0 && !"SUB".equals(this.aString110)) {
			return;
		}
		@Pc(18) Class6_Sub8 local18 = new Class6_Sub8(arg0.getData());
		@Pc(27) int local27 = local18.method8246();
		if (super.anInt10513 > 8) {
			if (local27 == 0) {
				@Pc(37) long local37 = local18.method8206();
				@Pc(41) long local41 = local18.method8206();
				@Pc(45) long local45 = local18.method8206();
				if (local37 < 0L || local41 < 0L || local45 < 0L || local45 > local37) {
					throw new IllegalStateException();
				}
				this.aFloat187 = (float) ((long) this.anInt10525 * local37) / (float) this.anInt10521;
				this.aFloat186 = (float) ((long) this.anInt10525 * (local37 + local41)) / (float) this.anInt10521;
				@Pc(102) int local102 = local18.method8219();
				if (local102 < 0 || local102 > local18.aByteArray102.length - local18.anInt10061) {
					throw new IllegalStateException();
				}
				this.aString112 = Static117.method2551(local18.anInt10061, local102, local18.aByteArray102);
			}
			if ((local27 | 0x80) != 0) {
				return;
			}
			return;
		}
		if ((local27 | 0x80) == 0) {
			throw new IllegalStateException();
		}
		if (super.anInt10513 != 0) {
			return;
		}
		local18.anInt10061 += 23;
		this.anInt10521 = local18.method8219();
		this.anInt10525 = local18.method8219();
		if (this.anInt10521 == 0 || this.anInt10525 == 0) {
			throw new IllegalStateException();
		}
		@Pc(181) Class6_Sub8 local181 = new Class6_Sub8(16);
		local18.method8207(local181.aByteArray102, 16, 0);
		this.aString111 = local181.method8221();
		local181.anInt10061 = 0;
		local18.method8207(local181.aByteArray102, 16, 0);
		this.aString110 = local181.method8221();
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(Z)Ljava/lang/String;")
	public String method8558() {
		return this.aString111;
	}

	@OriginalMember(owner = "client!wda", name = "e", descriptor = "(I)V")
	@Override
	public void method8553() {
	}

	@OriginalMember(owner = "client!wda", name = "h", descriptor = "(I)F")
	public float method8560() {
		return this.aFloat186;
	}

	@OriginalMember(owner = "client!wda", name = "j", descriptor = "(I)F")
	public float method8562() {
		return this.aFloat187;
	}
}
