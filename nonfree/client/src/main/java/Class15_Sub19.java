import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qha")
public final class Class15_Sub19 extends Class15 {

	@OriginalMember(owner = "client!qha", name = "p", descriptor = "I")
	private final int anInt8243;

	@OriginalMember(owner = "client!qha", name = "m", descriptor = "[I")
	private final int[] anIntArray588;

	@OriginalMember(owner = "client!qha", name = "j", descriptor = "I")
	private final int anInt8242;

	@OriginalMember(owner = "client!qha", name = "s", descriptor = "I")
	private final int anInt8247;

	@OriginalMember(owner = "client!qha", name = "<init>", descriptor = "(Lclient!et;)V")
	public Class15_Sub19(@OriginalArg(0) Class2_Sub20 arg0) {
		super(arg0);
		this.anInt8243 = arg0.method8575();
		this.anIntArray588 = new int[4];
		this.anInt8242 = arg0.method8552();
		Static728.method275(this.anIntArray588, 0, this.anIntArray588.length, this.anInt8242);
		this.anInt8247 = arg0.method8555(-9372);
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(B)V")
	@Override
	public void method9378() {
		@Pc(18) Class4_Sub2_Sub1_Sub2 local18 = Static199.aClass61Array1[this.anInt8243].method1238();
		if (this.anInt8247 == 0) {
			Static274.method3838(false, this.anIntArray588, 0, local18, 29498);
		} else {
			Static285.method3987(0, new int[] { this.anInt8242 }, new int[] { this.anInt8247 }, new int[1], local18);
		}
	}
}
