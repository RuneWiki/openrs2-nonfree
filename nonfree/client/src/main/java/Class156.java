import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ir")
public final class Class156 {

	@OriginalMember(owner = "client!ir", name = "h", descriptor = "Lclient!pca;")
	private final Class245 aClass245_37 = new Class245(64);

	@OriginalMember(owner = "client!ir", name = "n", descriptor = "Lclient!pca;")
	private final Class245 aClass245_38 = new Class245(100);

	@OriginalMember(owner = "client!ir", name = "m", descriptor = "Lclient!jo;")
	private final Class168 aClass168_57;

	@OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(Lclient!jda;ILclient!jo;Lclient!jo;Lclient!jo;)V")
	public Class156(@OriginalArg(0) Class162 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class168 arg2, @OriginalArg(3) Class168 arg3, @OriginalArg(4) Class168 arg4) {
		this.aClass168_57 = arg2;
		if (this.aClass168_57 != null) {
			@Pc(26) int local26 = this.aClass168_57.method4456() - 1;
			this.aClass168_57.method4443(local26);
		}
		Static361.method5808(arg3, arg4);
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Z)V")
	public void method4100() {
		@Pc(2) Class245 local2 = this.aClass245_37;
		synchronized (this.aClass245_37) {
			this.aClass245_37.method6079();
		}
		local2 = this.aClass245_38;
		synchronized (this.aClass245_38) {
			this.aClass245_38.method6079();
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(II)Lclient!am;")
	public Class16 method4101(@OriginalArg(1) int arg0) {
		@Pc(6) Class245 local6 = this.aClass245_37;
		@Pc(16) Class16 local16;
		synchronized (this.aClass245_37) {
			local16 = (Class16) this.aClass245_37.method6082((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(34) Class168 local34 = this.aClass168_57;
		@Pc(47) byte[] local47;
		synchronized (this.aClass168_57) {
			local47 = this.aClass168_57.method4435(Static271.method4565(arg0), Static48.method6731(arg0));
		}
		local16 = new Class16();
		local16.anInt588 = arg0;
		local16.aClass156_1 = this;
		if (local47 != null) {
			local16.method651(new Class6_Sub26(local47));
		}
		local16.method649();
		@Pc(80) Class245 local80 = this.aClass245_37;
		synchronized (this.aClass245_37) {
			this.aClass245_37.method6075(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "(II)V")
	public void method4106() {
		@Pc(2) Class245 local2 = this.aClass245_37;
		synchronized (this.aClass245_37) {
			this.aClass245_37.method6083(5);
		}
		local2 = this.aClass245_38;
		synchronized (this.aClass245_38) {
			this.aClass245_38.method6083(5);
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IZ)Lclient!ro;")
	public Class6_Sub4_Sub15 method4108(@OriginalArg(0) int arg0) {
		@Pc(6) Class245 local6 = this.aClass245_38;
		@Pc(16) Class6_Sub4_Sub15 local16;
		synchronized (this.aClass245_38) {
			local16 = (Class6_Sub4_Sub15) this.aClass245_38.method6082((long) arg0);
			if (local16 == null) {
				local16 = new Class6_Sub4_Sub15(arg0);
				this.aClass245_38.method6075(local16, (long) arg0);
			}
		}
		synchronized (local16) {
			return local16.method6850() ? local16 : null;
		}
	}

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "(I)V")
	public void method4109() {
		@Pc(2) Class245 local2 = this.aClass245_37;
		synchronized (this.aClass245_37) {
			this.aClass245_37.method6076();
		}
		local2 = this.aClass245_38;
		synchronized (this.aClass245_38) {
			this.aClass245_38.method6076();
		}
	}
}
