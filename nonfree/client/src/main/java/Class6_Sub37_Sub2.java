import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sga")
public final class Class6_Sub37_Sub2 extends Class6_Sub37 {

	@OriginalMember(owner = "client!sga", name = "y", descriptor = "F")
	private float aFloat179;

	@OriginalMember(owner = "client!sga", name = "t", descriptor = "I")
	private int anInt9001;

	@OriginalMember(owner = "client!sga", name = "B", descriptor = "F")
	private float aFloat180;

	@OriginalMember(owner = "client!sga", name = "A", descriptor = "Ljava/lang/String;")
	private String aString108;

	@OriginalMember(owner = "client!sga", name = "p", descriptor = "Ljava/lang/String;")
	private String aString109;

	@OriginalMember(owner = "client!sga", name = "z", descriptor = "I")
	private int anInt9005;

	@OriginalMember(owner = "client!sga", name = "u", descriptor = "Ljava/lang/String;")
	private String aString110;

	@OriginalMember(owner = "client!sga", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class6_Sub37_Sub2(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!sga", name = "d", descriptor = "(B)Ljava/lang/String;")
	public String method7878() {
		return this.aString110;
	}

	@OriginalMember(owner = "client!sga", name = "c", descriptor = "(B)Ljava/lang/String;")
	public String method7879() {
		return this.aString109;
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(ILclient!jagtheora/ogg/OggPacket;)V")
	@Override
	protected void method8838(@OriginalArg(1) OggPacket arg0) {
		if (super.anInt10248 > 0 && !"SUB".equals(this.aString108)) {
			return;
		}
		@Pc(23) Class6_Sub15 local23 = new Class6_Sub15(arg0.getData());
		@Pc(29) int local29 = local23.method3030();
		if (super.anInt10248 <= 8) {
			if ((local29 | 0x80) == 0) {
				throw new IllegalStateException();
			}
			if (super.anInt10248 == 0) {
				local23.anInt3174 += 23;
				this.anInt9001 = local23.method3050();
				this.anInt9005 = local23.method3050();
				if (this.anInt9001 == 0 || this.anInt9005 == 0) {
					throw new IllegalStateException();
				}
				@Pc(206) Class6_Sub15 local206 = new Class6_Sub15(16);
				local23.method3019(16, 0, local206.aByteArray20);
				this.aString109 = local206.method3046();
				local206.anInt3174 = 0;
				local23.method3019(16, 0, local206.aByteArray20);
				this.aString108 = local206.method3046();
			}
			return;
		}
		if (local29 == 0) {
			@Pc(43) long local43 = local23.method3039();
			@Pc(47) long local47 = local23.method3039();
			@Pc(53) long local53 = local23.method3039();
			if (local43 < 0L || local47 < 0L || local53 < 0L || local43 < local53) {
				throw new IllegalStateException();
			}
			this.aFloat179 = (float) ((long) this.anInt9005 * (local47 + local43)) / (float) this.anInt9001;
			this.aFloat180 = (float) ((long) this.anInt9005 * local43) / (float) this.anInt9001;
			@Pc(120) int local120 = local23.method3050();
			if (local120 < 0 || local23.aByteArray20.length - local23.anInt3174 < local120) {
				throw new IllegalStateException();
			}
			this.aString110 = Static87.method8292(local23.aByteArray20, local120, local23.anInt3174);
		}
		if ((local29 | 0x80) != 0) {
			return;
		}
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(Z)F")
	public float method7881() {
		return this.aFloat180;
	}

	@OriginalMember(owner = "client!sga", name = "b", descriptor = "(Z)F")
	public float method7882() {
		return this.aFloat179;
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(B)V")
	@Override
	public void method8837() {
	}
}
