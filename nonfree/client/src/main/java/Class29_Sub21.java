import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uw")
public final class Class29_Sub21 extends Class29 {

	@OriginalMember(owner = "client!uw", name = "s", descriptor = "I")
	private final int anInt10256;

	@OriginalMember(owner = "client!uw", name = "n", descriptor = "[I")
	private final int[] anIntArray752;

	@OriginalMember(owner = "client!uw", name = "p", descriptor = "I")
	private final int anInt10253;

	@OriginalMember(owner = "client!uw", name = "q", descriptor = "I")
	private final int anInt10255;

	@OriginalMember(owner = "client!uw", name = "<init>", descriptor = "(Lclient!ika;)V")
	public Class29_Sub21(@OriginalArg(0) Class3_Sub2 arg0) {
		super(arg0);
		this.anInt10256 = arg0.method2028(-14795);
		this.anIntArray752 = new int[4];
		this.anInt10253 = arg0.method2030();
		Static732.method6314(this.anIntArray752, 0, this.anIntArray752.length, this.anInt10253);
		this.anInt10255 = arg0.method2036();
	}

	@OriginalMember(owner = "client!uw", name = "b", descriptor = "(B)V")
	@Override
	public void method9495() {
		@Pc(17) Class9_Sub1_Sub1_Sub2 local17 = Static470.aClass7Array1[this.anInt10256].method249();
		if (this.anInt10255 == 0) {
			Static98.method1975(this.anIntArray752, false, local17, 0);
		} else {
			Static518.method6974(new int[] { this.anInt10255 }, new int[] { this.anInt10253 }, local17, new int[1]);
		}
	}
}
