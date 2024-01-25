import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aw")
public final class Class3_Sub8_Sub1 extends Class3_Sub8 {

	@OriginalMember(owner = "client!aw", name = "G", descriptor = "I")
	private int anInt624;

	@OriginalMember(owner = "client!aw", name = "C", descriptor = "Ljava/lang/String;")
	private String aString12;

	@OriginalMember(owner = "client!aw", name = "E", descriptor = "F")
	private float aFloat5;

	@OriginalMember(owner = "client!aw", name = "z", descriptor = "I")
	private int anInt628;

	@OriginalMember(owner = "client!aw", name = "A", descriptor = "Ljava/lang/String;")
	private String aString13;

	@OriginalMember(owner = "client!aw", name = "y", descriptor = "F")
	private float aFloat6;

	@OriginalMember(owner = "client!aw", name = "F", descriptor = "Ljava/lang/String;")
	private String aString14;

	@OriginalMember(owner = "client!aw", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class3_Sub8_Sub1(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(Z)F")
	public float method502() {
		return this.aFloat5;
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(I)V")
	@Override
	public void method9114() {
	}

	@OriginalMember(owner = "client!aw", name = "c", descriptor = "(Z)F")
	public float method503() {
		return this.aFloat6;
	}

	@OriginalMember(owner = "client!aw", name = "b", descriptor = "(I)Ljava/lang/String;")
	public String method504() {
		return this.aString12;
	}

	@OriginalMember(owner = "client!aw", name = "d", descriptor = "(Z)Ljava/lang/String;")
	public String method505() {
		return this.aString14;
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(BLclient!jagtheora/ogg/OggPacket;)V")
	@Override
	protected void method9112(@OriginalArg(1) OggPacket arg0) {
		if (super.anInt10908 > 0 && !"SUB".equals(this.aString13)) {
			return;
		}
		@Pc(31) Class3_Sub28 local31 = new Class3_Sub28(arg0.getData());
		@Pc(35) int local35 = local31.method5322(-31);
		if (super.anInt10908 > 8) {
			if (local35 == 0) {
				@Pc(49) long local49 = local31.method5298();
				@Pc(53) long local53 = local31.method5298();
				@Pc(57) long local57 = local31.method5298();
				if (local49 < 0L || local53 < 0L || local57 < 0L || local57 > local49) {
					throw new IllegalStateException();
				}
				this.aFloat5 = (float) ((local49 + local53) * (long) this.anInt628) / (float) this.anInt624;
				this.aFloat6 = (float) ((long) this.anInt628 * local49) / (float) this.anInt624;
				@Pc(119) int local119 = local31.method5316();
				if (local119 < 0 || local31.aByteArray50.length - local31.anInt6241 < local119) {
					throw new IllegalStateException();
				}
				this.aString12 = Static130.method2162(local119, local31.anInt6241, local31.aByteArray50);
			}
			if ((local35 | 0x80) != 0) {
				return;
			}
			return;
		}
		if ((local35 | 0x80) == 0) {
			throw new IllegalStateException();
		}
		if (super.anInt10908 != 0) {
			return;
		}
		local31.anInt6241 += 23;
		this.anInt624 = local31.method5316();
		this.anInt628 = local31.method5316();
		if (this.anInt624 == 0 || this.anInt628 == 0) {
			throw new IllegalStateException();
		}
		@Pc(210) Class3_Sub28 local210 = new Class3_Sub28(16);
		local31.method5271(local210.aByteArray50, 16, 0);
		this.aString14 = local210.method5295();
		local210.anInt6241 = 0;
		local31.method5271(local210.aByteArray50, 16, 0);
		this.aString13 = local210.method5295();
	}
}
