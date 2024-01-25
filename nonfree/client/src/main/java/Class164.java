import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nj")
public final class Class164 {

	@OriginalMember(owner = "client!nj", name = "d", descriptor = "Lclient!jv;")
	private Class126 aClass126_31 = new Class126(64);

	@OriginalMember(owner = "client!nj", name = "o", descriptor = "Lclient!jv;")
	public Class126 aClass126_32 = new Class126(64);

	@OriginalMember(owner = "client!nj", name = "g", descriptor = "Lclient!bu;")
	public final Class32 aClass32_58;

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "Lclient!bu;")
	private final Class32 aClass32_57;

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(Lclient!oq;ILclient!bu;Lclient!bu;)V")
	public Class164(@OriginalArg(0) Class183 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class32 arg2, @OriginalArg(3) Class32 arg3) {
		this.aClass32_58 = arg3;
		this.aClass32_57 = arg2;
		this.aClass32_57.method790(34);
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)V")
	public void method3863() {
		@Pc(6) Class126 local6 = this.aClass126_31;
		synchronized (this.aClass126_31) {
			this.aClass126_31.method3131();
		}
		local6 = this.aClass126_32;
		synchronized (this.aClass126_32) {
			this.aClass126_32.method3131();
		}
	}

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "(I)V")
	public void method3865() {
		@Pc(6) Class126 local6 = this.aClass126_31;
		synchronized (this.aClass126_31) {
			this.aClass126_31.method3135();
		}
		local6 = this.aClass126_32;
		synchronized (this.aClass126_32) {
			this.aClass126_32.method3135();
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(II)V")
	public void method3866() {
		@Pc(2) Class126 local2 = this.aClass126_31;
		synchronized (this.aClass126_31) {
			this.aClass126_31.method3140(5);
		}
		local2 = this.aClass126_32;
		synchronized (this.aClass126_32) {
			this.aClass126_32.method3140(5);
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IBI)V")
	public void method3867(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass126_31 = new Class126(arg1);
		this.aClass126_32 = new Class126(arg0);
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(II)Lclient!th;")
	public Class236 method3868(@OriginalArg(1) int arg0) {
		@Pc(6) Class126 local6 = this.aClass126_31;
		@Pc(16) Class236 local16;
		synchronized (this.aClass126_31) {
			local16 = (Class236) this.aClass126_31.method3141((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass32_57.method785(arg0, 34);
		local16 = new Class236();
		local16.aClass164_4 = this;
		if (local33 != null) {
			local16.method5000(new Class3_Sub7(local33));
		}
		@Pc(52) Class126 local52 = this.aClass126_31;
		synchronized (this.aClass126_31) {
			this.aClass126_31.method3132((long) arg0, local16);
			return local16;
		}
	}
}
