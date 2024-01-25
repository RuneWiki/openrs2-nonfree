import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ow")
public final class Class283 implements Interface2 {

	@OriginalMember(owner = "client!ow", name = "d", descriptor = "Lclient!iba;")
	private final Class171 aClass171_1;

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "Lclient!pha;")
	private final Class289 aClass289_2;

	@OriginalMember(owner = "client!ow", name = "<init>", descriptor = "(Lclient!pha;Lclient!iba;)V")
	public Class283(@OriginalArg(0) Class289 arg0, @OriginalArg(1) Class171 arg1) {
		this.aClass171_1 = arg1;
		this.aClass289_2 = arg0;
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method9317() {
		@Pc(16) Class230 local16 = this.aClass289_2.method6806(this.aClass171_1.anInt4133);
		if (local16 == null) {
			return;
		}
		@Pc(37) int local37 = this.aClass171_1.aClass223_4.method5074(this.aClass171_1.anInt4131, Static221.anInt3616) + this.aClass171_1.anInt4128;
		@Pc(51) int local51 = this.aClass171_1.aClass352_4.method7803(Static700.anInt10927, this.aClass171_1.anInt4130) + this.aClass171_1.anInt4136;
		if (this.aClass171_1.aBoolean277) {
			Static153.aClass22_4.method9403(local37, local51, this.aClass171_1.anInt4131, this.aClass171_1.anInt4130, this.aClass171_1.anInt4129, 0);
		}
		local51 += this.method6516(local51, Static561.aClass57_10, local37, local16.aString72) * 12;
		local51 += 8;
		if (this.aClass171_1.aBoolean277) {
			Static153.aClass22_4.method9404(local37, local51, this.aClass171_1.anInt4131 + local37 - 1, local51, this.aClass171_1.anInt4129, 0);
		}
		local51++;
		local51 += this.method6516(local51, Static561.aClass57_10, local37, local16.aString71) * 12;
		local51 += 5;
		@Pc(137) int local137 = local51 + this.method6516(local51, Static561.aClass57_10, local37, local16.aString70) * 12;
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(IILclient!da;IILjava/lang/String;)I")
	private int method6516(@OriginalArg(0) int arg0, @OriginalArg(2) Class57 arg1, @OriginalArg(3) int arg2, @OriginalArg(5) String arg3) {
		return arg1.method9135(0, arg0 + 5, (int[]) null, 0, this.aClass171_1.anInt4132, (Class178[]) null, 0, arg2 + 5, this.aClass171_1.anInt4130 + -10, this.aClass171_1.anInt4135, arg3, 0, (Class1) null, 0, this.aClass171_1.anInt4131 - 10);
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method9318() {
		return this.aClass289_2.method6805();
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(I)V")
	@Override
	public void method9316() {
	}
}
