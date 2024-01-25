import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class148 implements Interface12 {

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "Lclient!la;")
	private Class64 aClass64_7;

	@OriginalMember(owner = "client!ia", name = "h", descriptor = "Lclient!pu;")
	private final Class270 aClass270_45;

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "Lclient!pu;")
	private final Class270 aClass270_44;

	@OriginalMember(owner = "client!ia", name = "j", descriptor = "Lclient!pr;")
	private final Class267 aClass267_1;

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lclient!pu;Lclient!pu;Lclient!pr;)V")
	public Class148(@OriginalArg(0) Class270 arg0, @OriginalArg(1) Class270 arg1, @OriginalArg(2) Class267 arg2) {
		this.aClass270_45 = arg0;
		this.aClass270_44 = arg1;
		this.aClass267_1 = arg2;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
	@Override
	public void method4315() {
		@Pc(11) Class334 local11 = Static423.method5847(this.aClass270_44, this.aClass267_1.anInt7124);
		this.aClass64_7 = Static16.aClass134_1.method6899(local11, Static601.method2075(this.aClass270_45, this.aClass267_1.anInt7124));
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method4316() {
		@Pc(5) boolean local5 = true;
		if (!this.aClass270_45.method5694(this.aClass267_1.anInt7124)) {
			local5 = false;
		}
		if (!this.aClass270_44.method5694(this.aClass267_1.anInt7124)) {
			local5 = false;
		}
		return local5;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(BZ)V")
	@Override
	public void method4317() {
		@Pc(28) int local28 = this.aClass267_1.aClass335_16.method7396(Static573.anInt9475, this.aClass267_1.anInt7132) + this.aClass267_1.anInt7131;
		@Pc(42) int local42 = this.aClass267_1.aClass122_13.method2394(Static103.anInt2084, this.aClass267_1.anInt7122) + this.aClass267_1.anInt7135;
		this.aClass64_7.method6612(null, this.aClass267_1.anInt7123, local28, this.aClass267_1.anInt7122, this.aClass267_1.anInt7128, null, this.aClass267_1.aString71, this.aClass267_1.anInt7130, null, 0, 0, local42, this.aClass267_1.anInt7132, this.aClass267_1.anInt7134, this.aClass267_1.anInt7121);
	}
}
