import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!au")
public final class Class19 {

	@OriginalMember(owner = "client!au", name = "a", descriptor = "Lclient!mf;")
	private final Class222 aClass222_1 = new Class222(64);

	@OriginalMember(owner = "client!au", name = "b", descriptor = "Lclient!pu;")
	private final Class270 aClass270_5;

	@OriginalMember(owner = "client!au", name = "e", descriptor = "Lclient!pu;")
	private final Class270 aClass270_6;

	@OriginalMember(owner = "client!au", name = "<init>", descriptor = "(ILclient!pu;Lclient!pu;)V")
	public Class19(@OriginalArg(0) int arg0, @OriginalArg(1) Class270 arg1, @OriginalArg(2) Class270 arg2) {
		this.aClass270_5 = arg1;
		this.aClass270_6 = arg2;
		if (this.aClass270_5 != null) {
			this.aClass270_5.method5685(0);
		}
		if (this.aClass270_6 != null) {
			this.aClass270_6.method5685(0);
		}
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(II)Lclient!mga;")
	public Class1_Sub6_Sub9 method272(@OriginalArg(0) int arg0) {
		@Pc(11) Class1_Sub6_Sub9 local11 = (Class1_Sub6_Sub9) this.aClass222_1.method4430((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(27) byte[] local27;
		if (arg0 >= 32768) {
			local27 = this.aClass270_6.method5704(0, arg0 & 0x7FFF);
		} else {
			local27 = this.aClass270_5.method5704(0, arg0);
		}
		local11 = new Class1_Sub6_Sub9();
		if (local27 != null) {
			local11.method4466(new Class1_Sub35(local27));
		}
		if (arg0 >= 32768) {
			local11.method4468();
		}
		this.aClass222_1.method4434(local11, (long) arg0);
		return local11;
	}
}
