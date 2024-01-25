import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cs")
public final class Class15_Sub3_Sub1 extends Class15_Sub3 {

	@OriginalMember(owner = "client!cs", name = "r", descriptor = "I")
	private final int anInt1759;

	@OriginalMember(owner = "client!cs", name = "y", descriptor = "I")
	private final int anInt1764;

	@OriginalMember(owner = "client!cs", name = "v", descriptor = "I")
	private final int anInt1760;

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Lclient!et;)V")
	public Class15_Sub3_Sub1(@OriginalArg(0) Class2_Sub20 arg0) {
		super(arg0);
		@Pc(6) int local6 = arg0.method8555(-9372);
		this.anInt1759 = local6 & 0xFFFF;
		this.anInt1764 = local6 >>> 16;
		this.anInt1760 = arg0.method8581(-17416);
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(B)V")
	@Override
	public void method9378() {
		@Pc(17) int local17 = this.anInt1764 * 512 + 256;
		@Pc(24) int local24 = this.anInt1759 * 512 + 256;
		@Pc(27) int local27 = this.anInt1760;
		if (local27 < 3 && Static83.method1237(this.anInt1764, this.anInt1759)) {
			local27++;
		}
		@Pc(76) Class4_Sub2_Sub1_Sub1 local76 = new Class4_Sub2_Sub1_Sub1(super.anInt6023, 0, this.anInt1760, local27, local17, Static324.method4554(this.anInt1760, local17, local24) - super.anInt6019, local24, this.anInt1764, this.anInt1764, this.anInt1759, this.anInt1759, super.anInt6020, false);
		Static211.aClass218_18.method5099(new Class2_Sub6_Sub2(local76), (long) (this.anInt1759 | this.anInt1764 << 16));
	}
}
