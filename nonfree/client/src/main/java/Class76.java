import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dp")
public final class Class76 implements Interface16 {

	@OriginalMember(owner = "client!dp", name = "e", descriptor = "Lclient!gm;")
	private final Class120 aClass120_1;

	@OriginalMember(owner = "client!dp", name = "g", descriptor = "Lclient!vr;")
	private final Class361 aClass361_1;

	@OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(Lclient!gm;Lclient!vr;)V")
	public Class76(@OriginalArg(0) Class120 arg0, @OriginalArg(1) Class361 arg1) {
		this.aClass120_1 = arg0;
		this.aClass361_1 = arg1;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8623() {
		return this.aClass120_1.method3458();
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(Ljava/lang/String;IILclient!da;IB)I")
	private int method2369(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class27 arg2, @OriginalArg(4) int arg3) {
		return arg2.method7011(this.aClass361_1.anInt10278, 0, null, null, this.aClass361_1.anInt10281 - 10, null, 0, 0, this.aClass361_1.anInt10273, arg3 + 5, 0, 0, arg0, this.aClass361_1.anInt10279 - 10, arg1 - -5);
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)V")
	@Override
	public void method8624() {
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8622() {
		@Pc(19) Class335 local19 = this.aClass120_1.method3454(this.aClass361_1.anInt10280);
		if (local19 == null) {
			return;
		}
		@Pc(36) int local36 = this.aClass361_1.aClass173_13.method4706(Static328.anInt9768, this.aClass361_1.anInt10281) + this.aClass361_1.anInt10272;
		@Pc(50) int local50 = this.aClass361_1.aClass60_12.method2078(Static594.anInt10159, this.aClass361_1.anInt10279) + this.aClass361_1.anInt10277;
		if (this.aClass361_1.aBoolean738) {
			Static171.aClass16_5.method6106(local36, local50, this.aClass361_1.anInt10281, this.aClass361_1.anInt10279, this.aClass361_1.anInt10274, 0);
		}
		local50 += this.method2369(local19.aString102, local50, Static206.aClass27_20, local36) * 12;
		local50 += 8;
		if (this.aClass361_1.aBoolean738) {
			Static171.aClass16_5.method6093(local36, local50, this.aClass361_1.anInt10281 + local36 - 1, local50, this.aClass361_1.anInt10274, 0);
		}
		local50++;
		local50 += this.method2369(local19.aString104, local50, Static206.aClass27_20, local36) * 12;
		local50 += 5;
		@Pc(132) int local132 = local50 + this.method2369(local19.aString103, local50, Static206.aClass27_20, local36) * 12;
	}
}
