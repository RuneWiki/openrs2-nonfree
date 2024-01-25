import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oj")
public final class Class15_Sub12 extends Class15 {

	@OriginalMember(owner = "client!oj", name = "p", descriptor = "I")
	private final int anInt7451;

	@OriginalMember(owner = "client!oj", name = "m", descriptor = "I")
	private final int anInt7456;

	@OriginalMember(owner = "client!oj", name = "i", descriptor = "I")
	private final int anInt7450;

	@OriginalMember(owner = "client!oj", name = "k", descriptor = "I")
	private final int anInt7452;

	@OriginalMember(owner = "client!oj", name = "l", descriptor = "I")
	private final int anInt7455;

	@OriginalMember(owner = "client!oj", name = "r", descriptor = "I")
	private final int anInt7459;

	@OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Lclient!et;)V")
	public Class15_Sub12(@OriginalArg(0) Class2_Sub20 arg0) {
		super(arg0);
		this.anInt7451 = arg0.method8575();
		@Pc(13) int local13 = arg0.method8581(-17416);
		if ((local13 & 0x1) == 0) {
			this.anInt7456 = -1;
			this.anInt7450 = -1;
		} else {
			this.anInt7456 = arg0.method8575();
			this.anInt7450 = arg0.method8575();
		}
		if ((local13 & 0x2) == 0) {
			this.anInt7452 = -1;
			this.anInt7455 = -1;
		} else {
			this.anInt7455 = arg0.method8575();
			this.anInt7452 = arg0.method8575();
		}
		if ((local13 & 0x4) == 0) {
			this.anInt7459 = -1;
		} else {
			@Pc(81) int local81 = arg0.method8575();
			@Pc(85) int local85 = arg0.method8575();
			@Pc(91) int local91 = local81 * 255 / local85;
			if (local81 > 0 && local91 < 1) {
				local91 = 1;
			}
			this.anInt7459 = local91;
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(B)V")
	@Override
	public void method9378() {
		Static199.aClass61Array1[this.anInt7451].method1238().method2061(this.anInt7455, Static528.anInt8386, this.anInt7450, this.anInt7459, this.anInt7456, this.anInt7452, 0);
	}
}
