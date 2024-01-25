import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bi")
public final class Class3_Sub10_Sub1 extends Class3_Sub10 {

	@OriginalMember(owner = "client!bi", name = "t", descriptor = "Ljava/lang/String;")
	private String aString7;

	@OriginalMember(owner = "client!bi", name = "x", descriptor = "Ljava/lang/String;")
	private String aString8;

	@OriginalMember(owner = "client!bi", name = "y", descriptor = "I")
	private int anInt751;

	@OriginalMember(owner = "client!bi", name = "z", descriptor = "Ljava/lang/String;")
	private String aString9;

	@OriginalMember(owner = "client!bi", name = "E", descriptor = "F")
	private float aFloat14;

	@OriginalMember(owner = "client!bi", name = "F", descriptor = "F")
	private float aFloat15;

	@OriginalMember(owner = "client!bi", name = "H", descriptor = "I")
	private int anInt755;

	@OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class3_Sub10_Sub1(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Z)V")
	@Override
	public void method6830() {
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)Ljava/lang/String;")
	public String method774() {
		return this.aString9;
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(Z)Ljava/lang/String;")
	public String method775() {
		return this.aString8;
	}

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "(I)F")
	public float method776() {
		return this.aFloat15;
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(B)F")
	public float method777() {
		return this.aFloat14;
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(ILclient!jagtheora/ogg/OggPacket;)V")
	@Override
	protected void method6831(@OriginalArg(1) OggPacket arg0) {
		if (super.anInt8214 > 0 && !"SUB".equals(this.aString7)) {
			return;
		}
		@Pc(18) Class3_Sub15 local18 = new Class3_Sub15(arg0.getData());
		@Pc(22) int local22 = local18.method8401();
		if (super.anInt8214 <= 8) {
			if ((local22 | 0x80) == 0) {
				throw new IllegalStateException();
			}
			if (super.anInt8214 == 0) {
				local18.anInt10282 += 23;
				this.anInt751 = local18.method8445();
				this.anInt755 = local18.method8445();
				if (this.anInt751 == 0 || this.anInt755 == 0) {
					throw new IllegalStateException();
				}
				@Pc(175) Class3_Sub15 local175 = new Class3_Sub15(16);
				local18.method8403(16, 0, local175.aByteArray106);
				this.aString8 = local175.method8413();
				local175.anInt10282 = 0;
				local18.method8403(16, 0, local175.aByteArray106);
				this.aString7 = local175.method8413();
			}
			return;
		}
		if (local22 == 0) {
			@Pc(37) long local37 = local18.method8425();
			@Pc(41) long local41 = local18.method8425();
			@Pc(45) long local45 = local18.method8425();
			if (local37 < 0L || local41 < 0L || local45 < 0L || local37 < local45) {
				throw new IllegalStateException();
			}
			this.aFloat14 = (float) ((long) this.anInt755 * (local37 + local41)) / (float) this.anInt751;
			this.aFloat15 = (float) ((long) this.anInt755 * local37) / (float) this.anInt751;
			@Pc(95) int local95 = local18.method8445();
			if (local95 < 0 || local95 > local18.aByteArray106.length - local18.anInt10282) {
				throw new IllegalStateException();
			}
			this.aString9 = Static127.method2909(local18.anInt10282, local95, local18.aByteArray106);
		}
		if ((local22 | 0x80) != 0) {
			return;
		}
	}
}
