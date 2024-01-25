import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!us")
public final class Class335 {

	@OriginalMember(owner = "client!us", name = "c", descriptor = "Lclient!jn;")
	private final Class167 aClass167_61 = new Class167(128);

	@OriginalMember(owner = "client!us", name = "e", descriptor = "Lclient!vo;")
	private final Class348 aClass348_120;

	@OriginalMember(owner = "client!us", name = "<init>", descriptor = "(Lclient!gn;ILclient!vo;)V")
	public Class335(@OriginalArg(0) Class128 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class348 arg2) {
		this.aClass348_120 = arg2;
		this.aClass348_120.method7981(1);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(B)V")
	public void method7599() {
		@Pc(2) Class167 local2 = this.aClass167_61;
		synchronized (this.aClass167_61) {
			this.aClass167_61.method3961();
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(II)V")
	public void method7600() {
		@Pc(2) Class167 local2 = this.aClass167_61;
		synchronized (this.aClass167_61) {
			this.aClass167_61.method3964(5);
		}
	}

	@OriginalMember(owner = "client!us", name = "b", descriptor = "(II)Lclient!b;")
	public Class25 method7602(@OriginalArg(0) int arg0) {
		@Pc(6) Class167 local6 = this.aClass167_61;
		@Pc(16) Class25 local16;
		synchronized (this.aClass167_61) {
			local16 = (Class25) this.aClass167_61.method3966((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class348 local29 = this.aClass348_120;
		@Pc(38) byte[] local38;
		synchronized (this.aClass348_120) {
			local38 = this.aClass348_120.method7964(arg0, 1);
		}
		local16 = new Class25();
		if (local38 != null) {
			local16.method905(new Class4_Sub13(local38));
		}
		@Pc(60) Class167 local60 = this.aClass167_61;
		synchronized (this.aClass167_61) {
			this.aClass167_61.method3974((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!us", name = "b", descriptor = "(B)V")
	public void method7603() {
		@Pc(2) Class167 local2 = this.aClass167_61;
		synchronized (this.aClass167_61) {
			this.aClass167_61.method3975();
		}
	}
}
