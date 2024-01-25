import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gh")
public final class Class115 {

	@OriginalMember(owner = "client!gh", name = "i", descriptor = "Lclient!pca;")
	private final Class245 aClass245_31 = new Class245(16);

	@OriginalMember(owner = "client!gh", name = "f", descriptor = "Lclient!jo;")
	private final Class168 aClass168_42;

	static {
		new Class26("", 73);
	}

	@OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(Lclient!jda;ILclient!jo;)V")
	public Class115(@OriginalArg(0) Class162 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class168 arg2) {
		this.aClass168_42 = arg2;
		this.aClass168_42.method4443(30);
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(B)V")
	public void method3453() {
		@Pc(10) Class245 local10 = this.aClass245_31;
		synchronized (this.aClass245_31) {
			this.aClass245_31.method6079();
		}
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(II)V")
	public void method3456() {
		@Pc(2) Class245 local2 = this.aClass245_31;
		synchronized (this.aClass245_31) {
			this.aClass245_31.method6083(5);
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V")
	public void method3457() {
		@Pc(2) Class245 local2 = this.aClass245_31;
		synchronized (this.aClass245_31) {
			this.aClass245_31.method6076();
		}
	}

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "(II)Lclient!iv;")
	public Class160 method3458(@OriginalArg(1) int arg0) {
		@Pc(11) Class245 local11 = this.aClass245_31;
		@Pc(21) Class160 local21;
		synchronized (this.aClass245_31) {
			local21 = (Class160) this.aClass245_31.method6082((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class168 local34 = this.aClass168_42;
		@Pc(45) byte[] local45;
		synchronized (this.aClass168_42) {
			local45 = this.aClass168_42.method4435(arg0, 30);
		}
		local21 = new Class160();
		if (local45 != null) {
			local21.method4125(new Class6_Sub26(local45));
		}
		@Pc(67) Class245 local67 = this.aClass245_31;
		synchronized (this.aClass245_31) {
			this.aClass245_31.method6075(local21, (long) arg0);
			return local21;
		}
	}
}
