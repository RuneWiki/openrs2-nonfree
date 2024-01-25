import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class163 {

	@OriginalMember(owner = "client!jb", name = "h", descriptor = "Lclient!qr;")
	private final Class293 aClass293_31 = new Class293(64);

	@OriginalMember(owner = "client!jb", name = "m", descriptor = "I")
	public int anInt4229 = 0;

	@OriginalMember(owner = "client!jb", name = "j", descriptor = "Lclient!wu;")
	private final Class384 aClass384_61;

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
	public final int anInt4225;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lclient!ms;ILclient!wu;)V")
	public Class163(@OriginalArg(0) Class235 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class384 arg2) {
		this.aClass384_61 = arg2;
		this.anInt4225 = this.aClass384_61.method8862(4);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)Lclient!jba;")
	public Class164 method3884(@OriginalArg(0) int arg0) {
		@Pc(6) Class293 local6 = this.aClass293_31;
		@Pc(16) Class164 local16;
		synchronized (this.aClass293_31) {
			local16 = (Class164) this.aClass293_31.method6921((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class384 local29 = this.aClass384_61;
		@Pc(38) byte[] local38;
		synchronized (this.aClass384_61) {
			local38 = this.aClass384_61.method8885(4, arg0);
		}
		local16 = new Class164();
		local16.anInt4232 = arg0;
		local16.aClass163_5 = this;
		if (local38 != null) {
			local16.method3890(new Class5_Sub12(local38));
		}
		local16.method3892();
		@Pc(74) Class293 local74 = this.aClass293_31;
		synchronized (this.aClass293_31) {
			this.aClass293_31.method6925((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(BI)V")
	public void method3886() {
		@Pc(2) Class293 local2 = this.aClass293_31;
		synchronized (this.aClass293_31) {
			this.aClass293_31.method6922(5);
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Z)V")
	public void method3887() {
		@Pc(6) Class293 local6 = this.aClass293_31;
		synchronized (this.aClass293_31) {
			this.aClass293_31.method6927();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
	public void method3888() {
		@Pc(6) Class293 local6 = this.aClass293_31;
		synchronized (this.aClass293_31) {
			this.aClass293_31.method6930();
		}
	}
}
