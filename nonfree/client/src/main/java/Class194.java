import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qm")
public final class Class194 {

	@OriginalMember(owner = "client!qm", name = "h", descriptor = "Lclient!co;")
	private final Class41 aClass41_62 = new Class41(64);

	@OriginalMember(owner = "client!qm", name = "i", descriptor = "Lclient!g;")
	private final Class83 aClass83_100;

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Lclient!ci;ILclient!g;)V")
	public Class194(@OriginalArg(0) Class38 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class83 arg2) {
		this.aClass83_100 = arg2;
		this.aClass83_100.method1955(32);
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(B)V")
	public void method4751() {
		@Pc(2) Class41 local2 = this.aClass41_62;
		synchronized (this.aClass41_62) {
			this.aClass41_62.method825();
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Z)V")
	public void method4752() {
		@Pc(12) Class41 local12 = this.aClass41_62;
		synchronized (this.aClass41_62) {
			this.aClass41_62.method829();
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(II)Lclient!ug;")
	public Class227 method4754(@OriginalArg(1) int arg0) {
		@Pc(6) Class41 local6 = this.aClass41_62;
		@Pc(16) Class227 local16;
		synchronized (this.aClass41_62) {
			local16 = (Class227) this.aClass41_62.method823((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass83_100.method1968(arg0, 32);
		local16 = new Class227();
		if (local33 != null) {
			local16.method5578(new Class2_Sub24(local33));
		}
		@Pc(49) Class41 local49 = this.aClass41_62;
		synchronized (this.aClass41_62) {
			this.aClass41_62.method832((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(II)V")
	public void method4755() {
		@Pc(2) Class41 local2 = this.aClass41_62;
		synchronized (this.aClass41_62) {
			this.aClass41_62.method826(5);
		}
	}
}
