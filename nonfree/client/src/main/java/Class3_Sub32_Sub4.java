import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uja")
public final class Class3_Sub32_Sub4 extends Class3_Sub32 {

	@OriginalMember(owner = "client!uja", name = "D", descriptor = "Ljava/lang/String;")
	private String aString122;

	@OriginalMember(owner = "client!uja", name = "p", descriptor = "F")
	private float aFloat173;

	@OriginalMember(owner = "client!uja", name = "B", descriptor = "F")
	private float aFloat174;

	@OriginalMember(owner = "client!uja", name = "t", descriptor = "Ljava/lang/String;")
	private String aString123;

	@OriginalMember(owner = "client!uja", name = "o", descriptor = "Ljava/lang/String;")
	private String aString124;

	@OriginalMember(owner = "client!uja", name = "C", descriptor = "I")
	private int anInt10079;

	@OriginalMember(owner = "client!uja", name = "v", descriptor = "I")
	private int anInt10080;

	@OriginalMember(owner = "client!uja", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class3_Sub32_Sub4(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;I)V")
	@Override
	protected void method8587(@OriginalArg(0) OggPacket arg0) {
		if (super.anInt10068 > 0 && !"SUB".equals(this.aString123)) {
			return;
		}
		@Pc(28) Class3_Sub2 local28 = new Class3_Sub2(arg0.getData());
		@Pc(32) int local32 = local28.method2048(255);
		if (super.anInt10068 > 8) {
			if (local32 == 0) {
				@Pc(47) long local47 = local28.method2031();
				@Pc(51) long local51 = local28.method2031();
				@Pc(57) long local57 = local28.method2031();
				if (local47 < 0L || local51 < 0L || local57 < 0L || local47 < local57) {
					throw new IllegalStateException();
				}
				this.aFloat173 = (float) (local47 * (long) this.anInt10079) / (float) this.anInt10080;
				this.aFloat174 = (float) ((local47 + local51) * (long) this.anInt10079) / (float) this.anInt10080;
				@Pc(123) int local123 = local28.method2077();
				if (local123 < 0 || local123 > local28.aByteArray20.length - local28.anInt2178) {
					throw new IllegalStateException();
				}
				this.aString122 = Static232.method3384(local28.anInt2178, local28.aByteArray20, local123);
			}
			if ((local32 | 0x80) != 0) {
				return;
			}
			return;
		}
		if ((local32 | 0x80) == 0) {
			throw new IllegalStateException();
		}
		if (super.anInt10068 != 0) {
			return;
		}
		local28.anInt2178 += 23;
		this.anInt10080 = local28.method2077();
		this.anInt10079 = local28.method2077();
		if (this.anInt10080 == 0 || this.anInt10079 == 0) {
			throw new IllegalStateException();
		}
		@Pc(210) Class3_Sub2 local210 = new Class3_Sub2(16);
		local28.method2064(16, 0, local210.aByteArray20);
		this.aString124 = local210.method2014();
		local210.anInt2178 = 0;
		local28.method2064(16, 0, local210.aByteArray20);
		this.aString123 = local210.method2014();
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(Z)V")
	@Override
	public void method8590() {
	}

	@OriginalMember(owner = "client!uja", name = "b", descriptor = "(B)Ljava/lang/String;")
	public String method8592() {
		return this.aString122;
	}

	@OriginalMember(owner = "client!uja", name = "c", descriptor = "(I)F")
	public float method8593() {
		return this.aFloat173;
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(B)F")
	public float method8596() {
		return this.aFloat174;
	}

	@OriginalMember(owner = "client!uja", name = "b", descriptor = "(Z)Ljava/lang/String;")
	public String method8597() {
		return this.aString124;
	}
}
