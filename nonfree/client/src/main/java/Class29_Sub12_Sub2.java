import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nja")
public final class Class29_Sub12_Sub2 extends Class29_Sub12 {

	@OriginalMember(owner = "client!nja", name = "u", descriptor = "I")
	private final int anInt6812;

	@OriginalMember(owner = "client!nja", name = "t", descriptor = "I")
	private final int anInt6811;

	@OriginalMember(owner = "client!nja", name = "q", descriptor = "I")
	private final int anInt6815;

	@OriginalMember(owner = "client!nja", name = "<init>", descriptor = "(Lclient!ika;)V")
	public Class29_Sub12_Sub2(@OriginalArg(0) Class3_Sub2 arg0) {
		super(arg0);
		@Pc(6) int local6 = arg0.method2036();
		this.anInt6812 = local6 >>> 16;
		this.anInt6811 = local6 & 0xFFFF;
		this.anInt6815 = arg0.method2048(255);
	}

	@OriginalMember(owner = "client!nja", name = "b", descriptor = "(B)V")
	@Override
	public void method9495() {
		@Pc(10) int local10 = this.anInt6812 * 512 + 256;
		@Pc(17) int local17 = this.anInt6811 * 512 + 256;
		@Pc(20) int local20 = this.anInt6815;
		if (local20 < 3 && Static574.method7435(this.anInt6812, this.anInt6811)) {
			local20++;
		}
		@Pc(70) Class9_Sub1_Sub1_Sub3 local70 = new Class9_Sub1_Sub1_Sub3(super.anInt6808, 0, this.anInt6815, local20, local10, Static77.method1633(local17, local10, this.anInt6815) - super.anInt6807, local17, this.anInt6812, this.anInt6812, this.anInt6811, this.anInt6811, super.anInt6809, false);
		Static53.aClass313_6.method7107((long) (this.anInt6811 | this.anInt6812 << 16), new Class3_Sub7_Sub9(local70));
	}
}
