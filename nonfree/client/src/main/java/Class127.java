import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gm")
public final class Class127 {

	@OriginalMember(owner = "client!gm", name = "g", descriptor = "Lclient!jn;")
	private final Class167 aClass167_12 = new Class167(64);

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "Lclient!vo;")
	private final Class348 aClass348_42;

	@OriginalMember(owner = "client!gm", name = "f", descriptor = "Lclient!vo;")
	public final Class348 aClass348_43;

	@OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Lclient!gn;ILclient!vo;Lclient!vo;)V")
	public Class127(@OriginalArg(0) Class128 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class348 arg2, @OriginalArg(3) Class348 arg3) {
		this.aClass348_42 = arg2;
		this.aClass348_43 = arg3;
		this.aClass348_42.method7981(3);
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)V")
	public void method2859() {
		@Pc(6) Class167 local6 = this.aClass167_12;
		synchronized (this.aClass167_12) {
			this.aClass167_12.method3975();
		}
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(II)V")
	public void method2861() {
		@Pc(6) Class167 local6 = this.aClass167_12;
		synchronized (this.aClass167_12) {
			this.aClass167_12.method3964(5);
		}
	}

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "(II)Lclient!jv;")
	public Class171 method2862(@OriginalArg(0) int arg0) {
		@Pc(6) Class167 local6 = this.aClass167_12;
		@Pc(16) Class171 local16;
		synchronized (this.aClass167_12) {
			local16 = (Class171) this.aClass167_12.method3966((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class348 local29 = this.aClass348_42;
		@Pc(38) byte[] local38;
		synchronized (this.aClass348_42) {
			local38 = this.aClass348_42.method7964(arg0, 3);
		}
		local16 = new Class171();
		local16.aClass127_1 = this;
		if (local38 != null) {
			local16.method4049(new Class4_Sub13(local38));
		}
		@Pc(71) Class167 local71 = this.aClass167_12;
		synchronized (this.aClass167_12) {
			this.aClass167_12.method3974((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "(B)V")
	public void method2863() {
		@Pc(2) Class167 local2 = this.aClass167_12;
		synchronized (this.aClass167_12) {
			this.aClass167_12.method3961();
		}
	}
}
