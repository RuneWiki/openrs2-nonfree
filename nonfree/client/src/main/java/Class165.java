import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ho")
public final class Class165 implements Interface10 {

	@OriginalMember(owner = "client!ho", name = "k", descriptor = "Lclient!bfa;")
	private final Class36 aClass36_1;

	@OriginalMember(owner = "client!ho", name = "l", descriptor = "Lclient!vka;")
	private final Class387 aClass387_1;

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(Lclient!vka;Lclient!bfa;)V")
	public Class165(@OriginalArg(0) Class387 arg0, @OriginalArg(1) Class36 arg1) {
		this.aClass36_1 = arg1;
		this.aClass387_1 = arg0;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(ZB)V")
	@Override
	public void method9560() {
		@Pc(11) Class125 local11 = this.aClass387_1.method9208(this.aClass36_1.anInt605);
		if (local11 == null) {
			return;
		}
		@Pc(28) int local28 = this.aClass36_1.aClass18_4.method282(Static33.anInt443, this.aClass36_1.anInt603) + this.aClass36_1.anInt594;
		@Pc(43) int local43 = this.aClass36_1.aClass239_3.method5836(Static277.anInt4340, this.aClass36_1.anInt593) + this.aClass36_1.anInt596;
		if (this.aClass36_1.aBoolean77) {
			Static396.aClass145_6.method9713(local28, local43, this.aClass36_1.anInt603, this.aClass36_1.anInt593, this.aClass36_1.anInt600, 0);
		}
		local43 += this.method3470(local28, local43, Static387.aClass68_12, local11.aString29) * 12;
		local43 += 8;
		if (this.aClass36_1.aBoolean77) {
			Static396.aClass145_6.method9714(local28, local43, this.aClass36_1.anInt603 + local28 - 1, local43, this.aClass36_1.anInt600, 0);
		}
		local43++;
		local43 += this.method3470(local28, local43, Static387.aClass68_12, local11.aString30) * 12;
		local43 += 5;
		@Pc(129) int local129 = local43 + this.method3470(local28, local43, Static387.aClass68_12, local11.aString31) * 12;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(B)V")
	@Override
	public void method9561() {
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IILclient!da;Ljava/lang/String;II)I")
	private int method3470(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class68 arg2, @OriginalArg(3) String arg3) {
		return arg2.method7900(this.aClass36_1.anInt593 - 10, (int[]) null, this.aClass36_1.anInt604, 0, arg1 + 5, this.aClass36_1.anInt603 + -10, (Class1) null, 0, arg3, this.aClass36_1.anInt597, 0, arg0 + 5, (Class43[]) null, 0, 0);
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method9562() {
		return this.aClass387_1.method9205();
	}
}
