import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public final class Class174 implements Interface16 {

	@OriginalMember(owner = "client!jd", name = "f", descriptor = "Lclient!kda;")
	private final Class190 aClass190_1;

	@OriginalMember(owner = "client!jd", name = "e", descriptor = "Lclient!sc;")
	private final Class305 aClass305_2;

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(Lclient!sc;Lclient!kda;)V")
	public Class174(@OriginalArg(0) Class305 arg0, @OriginalArg(1) Class190 arg1) {
		this.aClass190_1 = arg1;
		this.aClass305_2 = arg0;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
	@Override
	public void method7258() {
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ljava/lang/String;IIIILclient!la;)I")
	private int method3488(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) Class37 arg3) {
		return arg3.method7710(null, null, arg0, this.aClass190_1.anInt4714 - 10, arg1 + 5, this.aClass190_1.anInt4716 - 10, this.aClass190_1.anInt4713, arg2 + 5, 0, 0, this.aClass190_1.anInt4718, 0, null, 0, 0);
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7259() {
		@Pc(11) Class208 local11 = this.aClass305_2.method6205(this.aClass190_1.anInt4721);
		if (local11 == null) {
			return;
		}
		@Pc(33) int local33 = this.aClass190_1.aClass322_5.method6534(Static14.anInt330, this.aClass190_1.anInt4714) + this.aClass190_1.anInt4712;
		@Pc(48) int local48 = this.aClass190_1.aClass347_5.method7305(Static370.anInt6187, this.aClass190_1.anInt4716) + this.aClass190_1.anInt4719;
		if (this.aClass190_1.aBoolean364) {
			Static417.aClass162_17.method6827(local33, local48, this.aClass190_1.anInt4714, this.aClass190_1.anInt4716, this.aClass190_1.anInt4720, 0);
		}
		local48 += this.method3488(local11.aString62, local33, local48, Static81.aClass37_16) * 12;
		local48 += 8;
		if (this.aClass190_1.aBoolean364) {
			Static417.aClass162_17.method6810(local33, local48, local33 + this.aClass190_1.anInt4714 - 1, local48, this.aClass190_1.anInt4720, 0);
		}
		local48++;
		local48 += this.method3488(local11.aString63, local33, local48, Static81.aClass37_16) * 12;
		local48 += 5;
		@Pc(131) int local131 = local48 + this.method3488(local11.aString64, local33, local48, Static81.aClass37_16) * 12;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7257() {
		return this.aClass305_2.method6204();
	}
}
