import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class50 {

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "Lclient!co;")
	private final Class41 aClass41_16 = new Class41(64);

	@OriginalMember(owner = "client!dd", name = "l", descriptor = "Lclient!co;")
	private final Class41 aClass41_17 = new Class41(100);

	@OriginalMember(owner = "client!dd", name = "k", descriptor = "Lclient!g;")
	private final Class83 aClass83_32;

	static {
		new Class62("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
	}

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lclient!ci;ILclient!g;Lclient!g;Lclient!g;)V")
	public Class50(@OriginalArg(0) Class38 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class83 arg2, @OriginalArg(3) Class83 arg3, @OriginalArg(4) Class83 arg4) {
		this.aClass83_32 = arg2;
		if (this.aClass83_32 != null) {
			@Pc(26) int local26 = this.aClass83_32.method1956() - 1;
			this.aClass83_32.method1955(local26);
		}
		Static289.method4753(arg4, arg3);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IB)V")
	public void method1170() {
		@Pc(6) Class41 local6 = this.aClass41_16;
		synchronized (this.aClass41_16) {
			this.aClass41_16.method826(5);
		}
		local6 = this.aClass41_17;
		synchronized (this.aClass41_17) {
			this.aClass41_17.method826(5);
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)Lclient!jj;")
	public Class2_Sub7_Sub10 method1173(@OriginalArg(0) int arg0) {
		@Pc(6) Class41 local6 = this.aClass41_17;
		@Pc(16) Class2_Sub7_Sub10 local16;
		synchronized (this.aClass41_17) {
			local16 = (Class2_Sub7_Sub10) this.aClass41_17.method823((long) arg0);
			if (local16 == null) {
				local16 = new Class2_Sub7_Sub10(arg0);
				this.aClass41_17.method832((long) arg0, local16);
			}
		}
		synchronized (local16) {
			return local16.method2908() ? local16 : null;
		}
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)V")
	public void method1174() {
		@Pc(2) Class41 local2 = this.aClass41_16;
		synchronized (this.aClass41_16) {
			this.aClass41_16.method829();
		}
		local2 = this.aClass41_17;
		synchronized (this.aClass41_17) {
			this.aClass41_17.method829();
		}
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(II)Lclient!hu;")
	public Class102 method1175(@OriginalArg(1) int arg0) {
		@Pc(6) Class41 local6 = this.aClass41_16;
		@Pc(16) Class102 local16;
		synchronized (this.aClass41_16) {
			local16 = (Class102) this.aClass41_16.method823((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aClass83_32.method1968(Static42.method589(arg0), Static242.method4284(arg0));
		local16 = new Class102();
		local16.aClass50_1 = this;
		local16.anInt2982 = arg0;
		if (local37 != null) {
			local16.method2413(new Class2_Sub24(local37));
		}
		local16.method2412();
		@Pc(67) Class41 local67 = this.aClass41_16;
		synchronized (this.aClass41_16) {
			this.aClass41_16.method832((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(B)V")
	public void method1178() {
		@Pc(2) Class41 local2 = this.aClass41_16;
		synchronized (this.aClass41_16) {
			this.aClass41_16.method825();
		}
		local2 = this.aClass41_17;
		synchronized (this.aClass41_17) {
			this.aClass41_17.method825();
		}
	}
}
