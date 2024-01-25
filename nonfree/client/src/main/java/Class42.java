import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!br")
public final class Class42 {

	@OriginalMember(owner = "client!br", name = "d", descriptor = "Lclient!pca;")
	private Class245 aClass245_13 = new Class245(128);

	@OriginalMember(owner = "client!br", name = "l", descriptor = "Lclient!pca;")
	public Class245 aClass245_14 = new Class245(64);

	@OriginalMember(owner = "client!br", name = "e", descriptor = "Lclient!jo;")
	private final Class168 aClass168_17;

	@OriginalMember(owner = "client!br", name = "f", descriptor = "Lclient!jo;")
	public final Class168 aClass168_18;

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Lclient!jda;ILclient!jo;Lclient!jo;)V")
	public Class42(@OriginalArg(0) Class162 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class168 arg2, @OriginalArg(3) Class168 arg3) {
		this.aClass168_17 = arg2;
		this.aClass168_18 = arg3;
		this.aClass168_17.method4443(36);
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(I)V")
	public void method1144() {
		@Pc(6) Class245 local6 = this.aClass245_13;
		synchronized (this.aClass245_13) {
			this.aClass245_13.method6079();
		}
		local6 = this.aClass245_14;
		synchronized (this.aClass245_14) {
			this.aClass245_14.method6079();
		}
	}

	@OriginalMember(owner = "client!br", name = "b", descriptor = "(I)V")
	public void method1145() {
		@Pc(6) Class245 local6 = this.aClass245_13;
		synchronized (this.aClass245_13) {
			this.aClass245_13.method6076();
		}
		local6 = this.aClass245_14;
		synchronized (this.aClass245_14) {
			this.aClass245_14.method6076();
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IB)Lclient!hk;")
	public Class137 method1147(@OriginalArg(0) int arg0) {
		@Pc(6) Class245 local6 = this.aClass245_13;
		@Pc(16) Class137 local16;
		synchronized (this.aClass245_13) {
			local16 = (Class137) this.aClass245_13.method6082((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class168 local29 = this.aClass168_17;
		@Pc(40) byte[] local40;
		synchronized (this.aClass168_17) {
			local40 = this.aClass168_17.method4435(arg0, 36);
		}
		local16 = new Class137();
		local16.anInt4333 = arg0;
		local16.aClass42_4 = this;
		if (local40 != null) {
			local16.method3769(new Class6_Sub26(local40));
		}
		local16.method3770();
		@Pc(71) Class245 local71 = this.aClass245_13;
		synchronized (this.aClass245_13) {
			this.aClass245_13.method6075(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(II)V")
	public void method1148() {
		@Pc(11) Class245 local11 = this.aClass245_13;
		synchronized (this.aClass245_13) {
			this.aClass245_13.method6083(5);
		}
		local11 = this.aClass245_14;
		synchronized (this.aClass245_14) {
			this.aClass245_14.method6083(5);
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IZI)V")
	public void method1149(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass245_13 = new Class245(arg1);
		this.aClass245_14 = new Class245(arg0);
	}
}
