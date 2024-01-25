import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class3_Sub14_Sub3 extends Class3_Sub14 {

	@OriginalMember(owner = "client!hb", name = "q", descriptor = "F")
	private float aFloat70;

	@OriginalMember(owner = "client!hb", name = "r", descriptor = "I")
	private int anInt3729;

	@OriginalMember(owner = "client!hb", name = "s", descriptor = "I")
	private int anInt3730;

	@OriginalMember(owner = "client!hb", name = "z", descriptor = "F")
	private float aFloat71;

	@OriginalMember(owner = "client!hb", name = "C", descriptor = "Ljava/lang/String;")
	private String aString47;

	@OriginalMember(owner = "client!hb", name = "D", descriptor = "Ljava/lang/String;")
	private String aString48;

	@OriginalMember(owner = "client!hb", name = "F", descriptor = "Ljava/lang/String;")
	private String aString49;

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class3_Sub14_Sub3(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "(I)F")
	public float method3184() {
		return this.aFloat70;
	}

	@OriginalMember(owner = "client!hb", name = "f", descriptor = "(I)Ljava/lang/String;")
	public String method3185() {
		return this.aString49;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
	@Override
	public void method7818() {
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)Ljava/lang/String;")
	public String method3186() {
		return this.aString47;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;B)V")
	@Override
	protected void method7821(@OriginalArg(0) OggPacket arg0) {
		if (super.anInt9591 > 0 && !"SUB".equals(this.aString48)) {
			return;
		}
		@Pc(21) Class3_Sub4 local21 = new Class3_Sub4(arg0.getData());
		@Pc(29) int local29 = local21.method7954();
		if (super.anInt9591 > 8) {
			if (local29 == 0) {
				@Pc(127) long local127 = local21.method7916();
				@Pc(131) long local131 = local21.method7916();
				@Pc(135) long local135 = local21.method7916();
				if (local127 < 0L || local131 < 0L || local135 < 0L || local127 < local135) {
					throw new IllegalStateException();
				}
				this.aFloat70 = (float) ((long) this.anInt3729 * local127) / (float) this.anInt3730;
				this.aFloat71 = (float) ((long) this.anInt3729 * (local131 + local127)) / (float) this.anInt3730;
				@Pc(189) int local189 = local21.method7902();
				if (local189 < 0 || local21.aByteArray90.length - local21.anInt9739 < local189) {
					throw new IllegalStateException();
				}
				this.aString49 = Static678.method9031(local21.aByteArray90, local189, local21.anInt9739);
			}
			if ((local29 | 0x80) != 0) {
				return;
			}
			return;
		}
		if ((local29 | 0x80) == 0) {
			throw new IllegalStateException();
		}
		if (super.anInt9591 != 0) {
			return;
		}
		local21.anInt9739 += 23;
		this.anInt3730 = local21.method7902();
		this.anInt3729 = local21.method7902();
		if (this.anInt3730 != 0 && this.anInt3729 != 0) {
			@Pc(88) Class3_Sub4 local88 = new Class3_Sub4(16);
			local21.method7958(0, local88.aByteArray90, 16);
			this.aString47 = local88.method7922();
			local88.anInt9739 = 0;
			local21.method7958(0, local88.aByteArray90, 16);
			this.aString48 = local88.method7922();
			return;
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "(B)F")
	public float method3188() {
		return this.aFloat71;
	}
}
