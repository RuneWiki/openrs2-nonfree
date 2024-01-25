import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class48 implements Interface12 {

	@OriginalMember(owner = "client!ce", name = "i", descriptor = "Lclient!nd;")
	private final Class233 aClass233_1;

	@OriginalMember(owner = "client!ce", name = "h", descriptor = "Lclient!eo;")
	private final Class92 aClass92_1;

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(Lclient!eo;Lclient!nd;)V")
	public Class48(@OriginalArg(0) Class92 arg0, @OriginalArg(1) Class233 arg1) {
		this.aClass233_1 = arg1;
		this.aClass92_1 = arg0;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILjava/lang/String;IIBLclient!la;)I")
	private int method975(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(5) Class64 arg3) {
		return arg3.method6612(null, 0, arg2 + 5, this.aClass233_1.anInt5751 + -10, this.aClass233_1.anInt5757, null, arg1, 0, null, 0, 0, arg0 + 5, this.aClass233_1.anInt5754 + -10, this.aClass233_1.anInt5749, 0);
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method4316() {
		return this.aClass92_1.method1846();
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(BZ)V")
	@Override
	public void method4317() {
		@Pc(19) Class239 local19 = this.aClass92_1.method1849(this.aClass233_1.anInt5750);
		if (local19 == null) {
			return;
		}
		@Pc(36) int local36 = this.aClass233_1.aClass335_12.method7396(Static573.anInt9475, this.aClass233_1.anInt5754) + this.aClass233_1.anInt5755;
		@Pc(50) int local50 = this.aClass233_1.aClass122_10.method2394(Static103.anInt2084, this.aClass233_1.anInt5751) + this.aClass233_1.anInt5748;
		if (this.aClass233_1.aBoolean455) {
			Static16.aClass134_1.method6958(local36, local50, this.aClass233_1.anInt5754, this.aClass233_1.anInt5751, this.aClass233_1.anInt5752, 0);
		}
		local50 += this.method975(local50, local19.aString57, local36, Static418.aClass64_11) * 12;
		local50 += 8;
		if (this.aClass233_1.aBoolean455) {
			Static16.aClass134_1.method6959(local36, local50, this.aClass233_1.anInt5754 + local36 - 1, local50, this.aClass233_1.anInt5752, 0);
		}
		local50++;
		local50 += this.method975(local50, local19.aString58, local36, Static418.aClass64_11) * 12;
		local50 += 5;
		@Pc(132) int local132 = local50 + this.method975(local50, local19.aString56, local36, Static418.aClass64_11) * 12;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V")
	@Override
	public void method4315() {
	}
}
