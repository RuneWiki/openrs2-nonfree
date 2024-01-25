import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wk")
public final class Class6_Sub14_Sub4 extends Class6_Sub14 {

	@OriginalMember(owner = "client!wk", name = "v", descriptor = "F")
	private float aFloat202;

	@OriginalMember(owner = "client!wk", name = "A", descriptor = "Ljava/lang/String;")
	private String aString153;

	@OriginalMember(owner = "client!wk", name = "C", descriptor = "F")
	private float aFloat204;

	@OriginalMember(owner = "client!wk", name = "D", descriptor = "I")
	private int anInt10681;

	@OriginalMember(owner = "client!wk", name = "E", descriptor = "I")
	private int anInt10682;

	@OriginalMember(owner = "client!wk", name = "I", descriptor = "Ljava/lang/String;")
	private String aString154;

	@OriginalMember(owner = "client!wk", name = "L", descriptor = "Ljava/lang/String;")
	private String aString155;

	@OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class6_Sub14_Sub4(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Z)V")
	@Override
	public void method9058() {
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(Z)F")
	public float method9063() {
		return this.aFloat204;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;I)V")
	@Override
	protected void method9061(@OriginalArg(0) OggPacket arg0) {
		if (super.anInt10676 > 0 && !"SUB".equals(this.aString155)) {
			return;
		}
		@Pc(26) Class6_Sub23 local26 = new Class6_Sub23(arg0.getData());
		@Pc(30) int local30 = local26.method8374();
		if (super.anInt10676 > 8) {
			if (local30 == 0) {
				@Pc(43) long local43 = local26.method8368();
				@Pc(47) long local47 = local26.method8368();
				@Pc(51) long local51 = local26.method8368();
				if (local43 < 0L || local47 < 0L || local51 < 0L || local51 > local43) {
					throw new IllegalStateException();
				}
				this.aFloat202 = (float) ((long) this.anInt10681 * local43) / (float) this.anInt10682;
				this.aFloat204 = (float) ((long) this.anInt10681 * (local47 + local43)) / (float) this.anInt10682;
				@Pc(105) int local105 = local26.method8380();
				if (local105 < 0 || local105 > local26.aByteArray101.length - local26.anInt9901) {
					throw new IllegalStateException();
				}
				this.aString154 = Static281.method4110(local26.anInt9901, local105, local26.aByteArray101);
			}
			if ((local30 | 0x80) != 0) {
				return;
			}
			return;
		}
		if ((local30 | 0x80) == 0) {
			throw new IllegalStateException();
		}
		if (super.anInt10676 != 0) {
			return;
		}
		local26.anInt9901 += 23;
		this.anInt10682 = local26.method8380();
		this.anInt10681 = local26.method8380();
		if (this.anInt10682 == 0 || this.anInt10681 == 0) {
			throw new IllegalStateException();
		}
		@Pc(189) Class6_Sub23 local189 = new Class6_Sub23(16);
		local26.method8375(16, local189.aByteArray101, 0);
		this.aString153 = local189.method8354();
		local189.anInt9901 = 0;
		local26.method8375(16, local189.aByteArray101, 0);
		this.aString155 = local189.method8354();
	}

	@OriginalMember(owner = "client!wk", name = "c", descriptor = "(Z)Ljava/lang/String;")
	public String method9064() {
		return this.aString154;
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)Ljava/lang/String;")
	public String method9065() {
		return this.aString153;
	}

	@OriginalMember(owner = "client!wk", name = "d", descriptor = "(Z)F")
	public float method9067() {
		return this.aFloat202;
	}
}
