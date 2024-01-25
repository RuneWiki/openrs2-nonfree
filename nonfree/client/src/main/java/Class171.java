import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!js")
public final class Class171 {

	@OriginalMember(owner = "client!js", name = "j", descriptor = "Lclient!pca;")
	private Class245 aClass245_41 = new Class245(64);

	@OriginalMember(owner = "client!js", name = "f", descriptor = "Lclient!jo;")
	private final Class168 aClass168_65;

	@OriginalMember(owner = "client!js", name = "<init>", descriptor = "(Lclient!jda;ILclient!jo;)V")
	public Class171(@OriginalArg(0) Class162 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class168 arg2) {
		this.aClass168_65 = arg2;
		if (this.aClass168_65 != null) {
			@Pc(20) int local20 = this.aClass168_65.method4456() - 1;
			this.aClass168_65.method4443(local20);
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(II)V")
	public void method4467(@OriginalArg(0) int arg0) {
		@Pc(2) Class245 local2 = this.aClass245_41;
		synchronized (this.aClass245_41) {
			this.aClass245_41.method6079();
			this.aClass245_41 = new Class245(arg0);
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(I)V")
	public void method4470() {
		@Pc(6) Class245 local6 = this.aClass245_41;
		synchronized (this.aClass245_41) {
			this.aClass245_41.method6079();
		}
	}

	@OriginalMember(owner = "client!js", name = "b", descriptor = "(II)V")
	public void method4471() {
		@Pc(2) Class245 local2 = this.aClass245_41;
		synchronized (this.aClass245_41) {
			this.aClass245_41.method6083(5);
		}
	}

	@OriginalMember(owner = "client!js", name = "b", descriptor = "(B)V")
	public void method4472() {
		@Pc(10) Class245 local10 = this.aClass245_41;
		synchronized (this.aClass245_41) {
			this.aClass245_41.method6076();
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(BI)Lclient!h;")
	public Class126 method4473(@OriginalArg(1) int arg0) {
		@Pc(6) Class245 local6 = this.aClass245_41;
		@Pc(16) Class126 local16;
		synchronized (this.aClass245_41) {
			local16 = (Class126) this.aClass245_41.method6082((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class168 local29 = this.aClass168_65;
		@Pc(42) byte[] local42;
		synchronized (this.aClass168_65) {
			local42 = this.aClass168_65.method4435(Static459.method3942(arg0), Static110.method2279(arg0));
		}
		local16 = new Class126();
		if (local42 != null) {
			local16.method3597(new Class6_Sub26(local42));
		}
		@Pc(70) Class245 local70 = this.aClass245_41;
		synchronized (this.aClass245_41) {
			this.aClass245_41.method6075(local16, (long) arg0);
			return local16;
		}
	}
}
