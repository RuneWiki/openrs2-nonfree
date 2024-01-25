import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ok")
public final class Class249 {

	@OriginalMember(owner = "client!ok", name = "g", descriptor = "Lclient!jn;")
	private Class167 aClass167_37 = new Class167(64);

	@OriginalMember(owner = "client!ok", name = "l", descriptor = "Lclient!jn;")
	public Class167 aClass167_38 = new Class167(64);

	@OriginalMember(owner = "client!ok", name = "f", descriptor = "Lclient!vo;")
	private final Class348 aClass348_87;

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "Lclient!vo;")
	public final Class348 aClass348_86;

	@OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(Lclient!gn;ILclient!vo;Lclient!vo;)V")
	public Class249(@OriginalArg(0) Class128 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class348 arg2, @OriginalArg(3) Class348 arg3) {
		this.aClass348_87 = arg2;
		this.aClass348_86 = arg3;
		this.aClass348_87.method7981(34);
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IBI)V")
	public void method5887(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass167_37 = new Class167(arg0);
		this.aClass167_38 = new Class167(arg1);
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IB)Lclient!av;")
	public Class23 method5889(@OriginalArg(0) int arg0) {
		@Pc(6) Class167 local6 = this.aClass167_37;
		@Pc(16) Class23 local16;
		synchronized (this.aClass167_37) {
			local16 = (Class23) this.aClass167_37.method3966((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(34) Class348 local34 = this.aClass348_87;
		@Pc(43) byte[] local43;
		synchronized (this.aClass348_87) {
			local43 = this.aClass348_87.method7964(arg0, 34);
		}
		local16 = new Class23();
		local16.aClass249_1 = this;
		if (local43 != null) {
			local16.method901(new Class4_Sub13(local43));
		}
		@Pc(68) Class167 local68 = this.aClass167_37;
		synchronized (this.aClass167_37) {
			this.aClass167_37.method3974((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(II)V")
	public void method5891() {
		@Pc(6) Class167 local6 = this.aClass167_37;
		synchronized (this.aClass167_37) {
			this.aClass167_37.method3964(5);
		}
		local6 = this.aClass167_38;
		synchronized (this.aClass167_38) {
			this.aClass167_38.method3964(5);
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)V")
	public void method5892() {
		@Pc(2) Class167 local2 = this.aClass167_37;
		synchronized (this.aClass167_37) {
			this.aClass167_37.method3975();
		}
		local2 = this.aClass167_38;
		synchronized (this.aClass167_38) {
			this.aClass167_38.method3975();
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V")
	public void method5894() {
		@Pc(2) Class167 local2 = this.aClass167_37;
		synchronized (this.aClass167_37) {
			this.aClass167_37.method3961();
		}
		local2 = this.aClass167_38;
		synchronized (this.aClass167_38) {
			this.aClass167_38.method3961();
		}
	}
}
