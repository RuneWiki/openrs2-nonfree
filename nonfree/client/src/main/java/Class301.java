import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sda")
public final class Class301 {

	@OriginalMember(owner = "client!sda", name = "d", descriptor = "Lclient!jn;")
	private final Class167 aClass167_54 = new Class167(64);

	@OriginalMember(owner = "client!sda", name = "c", descriptor = "Lclient!vo;")
	private final Class348 aClass348_111;

	@OriginalMember(owner = "client!sda", name = "<init>", descriptor = "(Lclient!gn;ILclient!vo;)V")
	public Class301(@OriginalArg(0) Class128 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class348 arg2) {
		this.aClass348_111 = arg2;
		if (this.aClass348_111 != null) {
			this.aClass348_111.method7981(35);
		}
	}

	@OriginalMember(owner = "client!sda", name = "b", descriptor = "(I)V")
	public void method6913() {
		@Pc(6) Class167 local6 = this.aClass167_54;
		synchronized (this.aClass167_54) {
			this.aClass167_54.method3961();
		}
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(IB)V")
	public void method6914() {
		@Pc(12) Class167 local12 = this.aClass167_54;
		synchronized (this.aClass167_54) {
			this.aClass167_54.method3964(5);
		}
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(II)Lclient!ks;")
	public Class186 method6915(@OriginalArg(0) int arg0) {
		@Pc(6) Class167 local6 = this.aClass167_54;
		@Pc(16) Class186 local16;
		synchronized (this.aClass167_54) {
			local16 = (Class186) this.aClass167_54.method3966((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class348 local29 = this.aClass348_111;
		@Pc(38) byte[] local38;
		synchronized (this.aClass348_111) {
			local38 = this.aClass348_111.method7964(arg0, 35);
		}
		local16 = new Class186();
		if (local38 != null) {
			local16.method4480(new Class4_Sub13(local38));
		}
		local16.method4479();
		@Pc(65) Class167 local65 = this.aClass167_54;
		synchronized (this.aClass167_54) {
			this.aClass167_54.method3974((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!sda", name = "c", descriptor = "(I)V")
	public void method6916() {
		@Pc(2) Class167 local2 = this.aClass167_54;
		synchronized (this.aClass167_54) {
			this.aClass167_54.method3975();
		}
	}
}
