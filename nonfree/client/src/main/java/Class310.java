import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sv")
public final class Class310 implements Interface7 {

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "Lclient!eea;")
	private final Class82 aClass82_2;

	@OriginalMember(owner = "client!sv", name = "g", descriptor = "Lclient!eg;")
	private final Class85 aClass85_1;

	@OriginalMember(owner = "client!sv", name = "<init>", descriptor = "(Lclient!eea;Lclient!eg;)V")
	public Class310(@OriginalArg(0) Class82 arg0, @OriginalArg(1) Class85 arg1) {
		this.aClass82_2 = arg0;
		this.aClass85_1 = arg1;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lclient!la;IIIILjava/lang/String;)I")
	private int method7298(@OriginalArg(0) Class58 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) String arg3) {
		return arg0.method8159(0, this.aClass85_1.anInt2662, 0, null, arg3, this.aClass85_1.anInt2666 - 10, this.aClass85_1.anInt2663, 0, null, arg1 + 5, null, this.aClass85_1.anInt2665 - 10, arg2 - -5, 0, 0);
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7418() {
		@Pc(23) Class91 local23 = this.aClass82_2.method2423(this.aClass85_1.anInt2661);
		if (local23 == null) {
			return;
		}
		@Pc(40) int local40 = this.aClass85_1.aClass258_1.method6279(Static501.anInt6750, this.aClass85_1.anInt2666) + this.aClass85_1.anInt2664;
		@Pc(54) int local54 = this.aClass85_1.aClass250_3.method6077(this.aClass85_1.anInt2665, Static212.anInt3952) + this.aClass85_1.anInt2658;
		if (this.aClass85_1.aBoolean195) {
			Static440.aClass44_12.method4996(local40, local54, this.aClass85_1.anInt2666, this.aClass85_1.anInt2665, this.aClass85_1.anInt2659, 0);
		}
		local54 += this.method7298(Static552.aClass58_14, local54, local40, local23.aString16) * 12;
		local54 += 8;
		if (this.aClass85_1.aBoolean195) {
			Static440.aClass44_12.method5001(local40, local54, this.aClass85_1.anInt2666 + local40 - 1, local54, this.aClass85_1.anInt2659, 0);
		}
		local54++;
		local54 += this.method7298(Static552.aClass58_14, local54, local40, local23.aString17) * 12;
		local54 += 5;
		@Pc(138) int local138 = local54 + this.method7298(Static552.aClass58_14, local54, local40, local23.aString15) * 12;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(I)V")
	@Override
	public void method7416() {
	}

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7417() {
		return this.aClass82_2.method2421();
	}
}
