import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uo")
public final class Class233 {

	@OriginalMember(owner = "client!uo", name = "c", descriptor = "Lclient!co;")
	private final Class41 aClass41_73 = new Class41(128);

	@OriginalMember(owner = "client!uo", name = "j", descriptor = "Lclient!g;")
	private final Class83 aClass83_123;

	@OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(Lclient!ci;ILclient!g;)V")
	public Class233(@OriginalArg(0) Class38 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class83 arg2) {
		this.aClass83_123 = arg2;
		this.aClass83_123.method1955(1);
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(II)V")
	public void method5624() {
		@Pc(2) Class41 local2 = this.aClass41_73;
		synchronized (this.aClass41_73) {
			this.aClass41_73.method826(5);
		}
	}

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "(I)V")
	public void method5626() {
		@Pc(2) Class41 local2 = this.aClass41_73;
		synchronized (this.aClass41_73) {
			this.aClass41_73.method825();
		}
	}

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "(II)Lclient!qi;")
	public Class192 method5627(@OriginalArg(0) int arg0) {
		@Pc(6) Class41 local6 = this.aClass41_73;
		@Pc(16) Class192 local16;
		synchronized (this.aClass41_73) {
			local16 = (Class192) this.aClass41_73.method823((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass83_123.method1968(arg0, 1);
		local16 = new Class192();
		if (local33 != null) {
			local16.method4705(new Class2_Sub24(local33));
		}
		@Pc(51) Class41 local51 = this.aClass41_73;
		synchronized (this.aClass41_73) {
			this.aClass41_73.method832((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!uo", name = "c", descriptor = "(I)V")
	public void method5628() {
		@Pc(6) Class41 local6 = this.aClass41_73;
		synchronized (this.aClass41_73) {
			this.aClass41_73.method829();
		}
	}
}
