import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ui")
public final class Class347 implements Interface17 {

	@OriginalMember(owner = "client!ui", name = "o", descriptor = "Lclient!da;")
	private Class37 aClass37_11;

	@OriginalMember(owner = "client!ui", name = "h", descriptor = "Lclient!nc;")
	private final Class237 aClass237_1;

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "Lclient!nd;")
	private final Class238 aClass238_270;

	@OriginalMember(owner = "client!ui", name = "d", descriptor = "Lclient!nd;")
	private final Class238 aClass238_271;

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Lclient!nd;Lclient!nd;Lclient!nc;)V")
	public Class347(@OriginalArg(0) Class238 arg0, @OriginalArg(1) Class238 arg1, @OriginalArg(2) Class237 arg2) {
		this.aClass237_1 = arg2;
		this.aClass238_270 = arg0;
		this.aClass238_271 = arg1;
	}

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8063() {
		@Pc(5) boolean local5 = true;
		if (!this.aClass238_270.method5568(this.aClass237_1.anInt6442)) {
			local5 = false;
		}
		if (!this.aClass238_271.method5568(this.aClass237_1.anInt6442)) {
			local5 = false;
		}
		return local5;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V")
	@Override
	public void method8062() {
		@Pc(11) Class183 local11 = Static427.method6221(this.aClass237_1.anInt6442, this.aClass238_271);
		this.aClass37_11 = Static141.aClass13_27.method8136(local11, Static654.method3454(this.aClass238_270, this.aClass237_1.anInt6442));
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8064() {
		@Pc(16) int local16 = this.aClass237_1.aClass97_11.method2304(this.aClass237_1.anInt6438, Static143.anInt2998) + this.aClass237_1.anInt6436;
		@Pc(31) int local31 = this.aClass237_1.aClass252_10.method6014(this.aClass237_1.anInt6443, Static478.anInt7732) + this.aClass237_1.anInt6437;
		this.aClass37_11.method6078(this.aClass237_1.anInt6444, local31, this.aClass237_1.anInt6445, local16, this.aClass237_1.anInt6438, 0, this.aClass237_1.anInt6439, (int[]) null, this.aClass237_1.anInt6443, this.aClass237_1.anInt6441, this.aClass237_1.anInt6446, 0, (Class1) null, this.aClass237_1.aString53, (Class31[]) null);
	}
}
