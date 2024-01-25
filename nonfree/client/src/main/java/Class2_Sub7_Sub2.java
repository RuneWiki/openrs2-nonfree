import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bka")
public final class Class2_Sub7_Sub2 extends Class2_Sub7 {

	@OriginalMember(owner = "client!bka", name = "t", descriptor = "F")
	private float aFloat8;

	@OriginalMember(owner = "client!bka", name = "v", descriptor = "I")
	private int anInt1066;

	@OriginalMember(owner = "client!bka", name = "x", descriptor = "F")
	private float aFloat9;

	@OriginalMember(owner = "client!bka", name = "y", descriptor = "Ljava/lang/String;")
	private String aString9;

	@OriginalMember(owner = "client!bka", name = "B", descriptor = "Ljava/lang/String;")
	private String aString10;

	@OriginalMember(owner = "client!bka", name = "E", descriptor = "I")
	private int anInt1071;

	@OriginalMember(owner = "client!bka", name = "H", descriptor = "Ljava/lang/String;")
	private String aString11;

	@OriginalMember(owner = "client!bka", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class2_Sub7_Sub2(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!bka", name = "b", descriptor = "(I)F")
	public float method1054() {
		return this.aFloat9;
	}

	@OriginalMember(owner = "client!bka", name = "b", descriptor = "(B)F")
	public float method1055() {
		return this.aFloat8;
	}

	@OriginalMember(owner = "client!bka", name = "g", descriptor = "(I)Ljava/lang/String;")
	public String method1057() {
		return this.aString11;
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;I)V")
	@Override
	protected void method7541(@OriginalArg(0) OggPacket arg0) {
		if (super.anInt8453 > 0 && !"SUB".equals(this.aString9)) {
			return;
		}
		@Pc(29) Class2_Sub8 local29 = new Class2_Sub8(arg0.getData());
		@Pc(33) int local33 = local29.method5203();
		if (super.anInt8453 > 8) {
			if (local33 == 0) {
				@Pc(46) long local46 = local29.method5169();
				@Pc(50) long local50 = local29.method5169();
				@Pc(54) long local54 = local29.method5169();
				if (local46 < 0L || local50 < 0L || local54 < 0L || local46 < local54) {
					throw new IllegalStateException();
				}
				this.aFloat8 = (float) ((long) this.anInt1066 * local46) / (float) this.anInt1071;
				this.aFloat9 = (float) ((local46 + local50) * (long) this.anInt1066) / (float) this.anInt1071;
				@Pc(113) int local113 = local29.method5216();
				if (local113 < 0 || local113 > local29.lb.length - local29.anInt5725) {
					throw new IllegalStateException();
				}
				this.aString10 = Static120.method2240(local113, local29.anInt5725, local29.lb);
			}
			if ((local33 | 0x80) != 0) {
				return;
			}
			return;
		}
		if ((local33 | 0x80) == 0) {
			throw new IllegalStateException();
		}
		if (super.anInt8453 != 0) {
			return;
		}
		local29.anInt5725 += 23;
		this.anInt1071 = local29.method5216();
		this.anInt1066 = local29.method5216();
		if (this.anInt1071 == 0 || this.anInt1066 == 0) {
			throw new IllegalStateException();
		}
		@Pc(187) Class2_Sub8 local187 = new Class2_Sub8(16);
		local29.method5176(local187.lb, 0, 16);
		this.aString11 = local187.method5178();
		local187.anInt5725 = 0;
		local29.method5176(local187.lb, 0, 16);
		this.aString9 = local187.method5178();
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(I)V")
	@Override
	public void method7539() {
	}

	@OriginalMember(owner = "client!bka", name = "c", descriptor = "(B)Ljava/lang/String;")
	public String method1060() {
		return this.aString10;
	}
}
