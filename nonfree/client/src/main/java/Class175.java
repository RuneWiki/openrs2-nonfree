import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class175 {

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "Lclient!jn;")
	private final Class167 aClass167_19 = new Class167(16);

	@OriginalMember(owner = "client!kc", name = "k", descriptor = "Lclient!vo;")
	private final Class348 aClass348_57;

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Lclient!gn;ILclient!vo;)V")
	public Class175(@OriginalArg(0) Class128 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class348 arg2) {
		this.aClass348_57 = arg2;
		this.aClass348_57.method7981(30);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)V")
	public void method4136() {
		@Pc(6) Class167 local6 = this.aClass167_19;
		synchronized (this.aClass167_19) {
			this.aClass167_19.method3975();
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)Lclient!wi;")
	public Class360 method4139(@OriginalArg(0) int arg0) {
		@Pc(6) Class167 local6 = this.aClass167_19;
		@Pc(16) Class360 local16;
		synchronized (this.aClass167_19) {
			local16 = (Class360) this.aClass167_19.method3966((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class348 local29 = this.aClass348_57;
		@Pc(38) byte[] local38;
		synchronized (this.aClass348_57) {
			local38 = this.aClass348_57.method7964(arg0, 30);
		}
		local16 = new Class360();
		if (local38 != null) {
			local16.method8130(new Class4_Sub13(local38));
		}
		@Pc(60) Class167 local60 = this.aClass167_19;
		synchronized (this.aClass167_19) {
			this.aClass167_19.method3974((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(BI)V")
	public void method4141() {
		@Pc(2) Class167 local2 = this.aClass167_19;
		synchronized (this.aClass167_19) {
			this.aClass167_19.method3964(5);
		}
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(B)V")
	public void method4143() {
		@Pc(2) Class167 local2 = this.aClass167_19;
		synchronized (this.aClass167_19) {
			this.aClass167_19.method3961();
		}
	}
}
