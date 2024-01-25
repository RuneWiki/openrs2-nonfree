import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sk")
public final class Class223 {

	@OriginalMember(owner = "client!sk", name = "f", descriptor = "Lclient!d;")
	private final Class44 aClass44_63 = new Class44(64);

	@OriginalMember(owner = "client!sk", name = "d", descriptor = "Lclient!um;")
	private final Class243 aClass243_219;

	@OriginalMember(owner = "client!sk", name = "h", descriptor = "Lclient!um;")
	private final Class243 aClass243_220;

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(ILclient!um;Lclient!um;)V")
	public Class223(@OriginalArg(0) int arg0, @OriginalArg(1) Class243 arg1, @OriginalArg(2) Class243 arg2) {
		this.aClass243_219 = arg2;
		this.aClass243_220 = arg1;
		if (this.aClass243_220 != null) {
			this.aClass243_220.method5472(0);
		}
		if (this.aClass243_219 != null) {
			this.aClass243_219.method5472(0);
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IB)Lclient!hu;")
	public Class5_Sub2_Sub8 method4932(@OriginalArg(0) int arg0) {
		@Pc(13) Class5_Sub2_Sub8 local13 = (Class5_Sub2_Sub8) this.aClass44_63.method1028((long) arg0);
		if (local13 != null) {
			return local13;
		}
		@Pc(31) byte[] local31;
		if (arg0 >= 32768) {
			local31 = this.aClass243_219.method5455(arg0 & 0x7FFF, 0);
		} else {
			local31 = this.aClass243_220.method5455(arg0, 0);
		}
		local13 = new Class5_Sub2_Sub8();
		if (local31 != null) {
			local13.method2319(new Class5_Sub15(local31));
		}
		if (arg0 >= 32768) {
			local13.method2313();
		}
		this.aClass44_63.method1017((long) arg0, local13);
		return local13;
	}
}
