import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class22 {

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "Lclient!aj;")
	private final Class10 aClass10_4 = new Class10(64);

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "Lclient!om;")
	private final Class246 aClass246_26;

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "Lclient!om;")
	private final Class246 aClass246_25;

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(ILclient!om;Lclient!om;)V")
	public Class22(@OriginalArg(0) int arg0, @OriginalArg(1) Class246 arg1, @OriginalArg(2) Class246 arg2) {
		this.aClass246_26 = arg1;
		this.aClass246_25 = arg2;
		if (this.aClass246_26 != null) {
			this.aClass246_26.method5673(0);
		}
		if (this.aClass246_25 != null) {
			this.aClass246_25.method5673(0);
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IZ)Lclient!bi;")
	public Class3_Sub3_Sub6 method565(@OriginalArg(0) int arg0) {
		@Pc(11) Class3_Sub3_Sub6 local11 = (Class3_Sub3_Sub6) this.aClass10_4.method250((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(35) byte[] local35;
		if (arg0 < 32768) {
			local35 = this.aClass246_26.method5653(0, arg0);
		} else {
			local35 = this.aClass246_25.method5653(0, arg0 & 0x7FFF);
		}
		local11 = new Class3_Sub3_Sub6();
		if (local35 != null) {
			local11.method740(new Class3_Sub11(local35));
		}
		if (arg0 >= 32768) {
			local11.method744();
		}
		this.aClass10_4.method254(local11, (long) arg0);
		return local11;
	}
}
