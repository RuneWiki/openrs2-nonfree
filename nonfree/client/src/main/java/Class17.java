import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!an")
public final class Class17 {

	@OriginalMember(owner = "client!an", name = "f", descriptor = "Lclient!pca;")
	private final Class245 aClass245_9 = new Class245(256);

	@OriginalMember(owner = "client!an", name = "g", descriptor = "Lclient!jo;")
	private final Class168 aClass168_10;

	@OriginalMember(owner = "client!an", name = "<init>", descriptor = "(Lclient!jda;ILclient!jo;)V")
	public Class17(@OriginalArg(0) Class162 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class168 arg2) {
		this.aClass168_10 = arg2;
		this.aClass168_10.method4443(26);
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IZ)V")
	public void method652() {
		@Pc(13) Class245 local13 = this.aClass245_9;
		synchronized (this.aClass245_9) {
			this.aClass245_9.method6083(5);
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(I)V")
	public void method653() {
		@Pc(2) Class245 local2 = this.aClass245_9;
		synchronized (this.aClass245_9) {
			this.aClass245_9.method6079();
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(II)Lclient!el;")
	public Class6_Sub4_Sub4 method655(@OriginalArg(0) int arg0) {
		@Pc(6) Class245 local6 = this.aClass245_9;
		@Pc(16) Class6_Sub4_Sub4 local16;
		synchronized (this.aClass245_9) {
			local16 = (Class6_Sub4_Sub4) this.aClass245_9.method6082((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class168 local29 = this.aClass168_10;
		@Pc(38) byte[] local38;
		synchronized (this.aClass168_10) {
			local38 = this.aClass168_10.method4435(arg0, 26);
		}
		local16 = new Class6_Sub4_Sub4();
		if (local38 != null) {
			local16.method2422(new Class6_Sub26(local38));
		}
		@Pc(60) Class245 local60 = this.aClass245_9;
		synchronized (this.aClass245_9) {
			this.aClass245_9.method6075(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(B)V")
	public void method656() {
		@Pc(2) Class245 local2 = this.aClass245_9;
		synchronized (this.aClass245_9) {
			this.aClass245_9.method6076();
		}
	}
}
