import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class175 implements Interface1 {

	@OriginalMember(owner = "client!kd", name = "h", descriptor = "Lclient!da;")
	private Class68 aClass68_7;

	@OriginalMember(owner = "client!kd", name = "j", descriptor = "Lclient!in;")
	private final Class157 aClass157_142;

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "Lclient!ot;")
	private final Class252 aClass252_1;

	@OriginalMember(owner = "client!kd", name = "i", descriptor = "Lclient!in;")
	private final Class157 aClass157_141;

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Lclient!in;Lclient!in;Lclient!ot;)V")
	public Class175(@OriginalArg(0) Class157 arg0, @OriginalArg(1) Class157 arg1, @OriginalArg(2) Class252 arg2) {
		this.aClass157_142 = arg1;
		this.aClass252_1 = arg2;
		this.aClass157_141 = arg0;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(BZ)V")
	@Override
	public void method9233() {
		@Pc(15) int local15 = this.aClass252_1.aClass309_10.method7817(Static326.anInt6591, this.aClass252_1.anInt7720) + this.aClass252_1.anInt7732;
		@Pc(31) int local31 = this.aClass252_1.aClass86_9.method2903(Static467.anInt8715, this.aClass252_1.anInt7724) + this.aClass252_1.anInt7721;
		this.aClass68_7.method8115(null, this.aClass252_1.anInt7725, this.aClass252_1.anInt7727, null, this.aClass252_1.anInt7723, this.aClass252_1.anInt7731, this.aClass252_1.anInt7724, null, local31, 0, 0, this.aClass252_1.anInt7720, local15, this.aClass252_1.anInt7729, this.aClass252_1.aString87);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method9232() {
		@Pc(5) boolean local5 = true;
		if (!this.aClass157_141.method4575(this.aClass252_1.anInt7730)) {
			local5 = false;
		}
		if (!this.aClass157_142.method4575(this.aClass252_1.anInt7730)) {
			local5 = false;
		}
		return local5;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
	@Override
	public void method9231() {
		@Pc(11) Class239 local11 = Static392.method6465(this.aClass252_1.anInt7730, this.aClass157_142);
		this.aClass68_7 = Static186.aClass20_4.method7289(local11, Static652.method7585(this.aClass157_141, this.aClass252_1.anInt7730));
	}
}
