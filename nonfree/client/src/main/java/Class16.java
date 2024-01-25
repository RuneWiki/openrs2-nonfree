import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!as")
public final class Class16 {

	@OriginalMember(owner = "client!as", name = "l", descriptor = "I")
	public int anInt408;

	@OriginalMember(owner = "client!as", name = "a", descriptor = "Lclient!jp;")
	private final Class129 aClass129_1 = new Class129(64);

	@OriginalMember(owner = "client!as", name = "k", descriptor = "Lclient!jp;")
	public final Class129 aClass129_2 = new Class129(30);

	@OriginalMember(owner = "client!as", name = "j", descriptor = "Lclient!pc;")
	public final Class188 aClass188_8;

	@OriginalMember(owner = "client!as", name = "b", descriptor = "Lclient!pc;")
	private final Class188 aClass188_7;

	static {
		new Class256("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
	}

	@OriginalMember(owner = "client!as", name = "<init>", descriptor = "(Lclient!rb;ILclient!pc;Lclient!pc;)V")
	public Class16(@OriginalArg(0) Class209 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class188 arg2, @OriginalArg(3) Class188 arg3) {
		this.aClass188_8 = arg3;
		this.aClass188_7 = arg2;
		@Pc(26) int local26 = this.aClass188_7.method4299() - 1;
		this.aClass188_7.method4285(local26);
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(I)V")
	public void method249() {
		@Pc(2) Class129 local2 = this.aClass129_1;
		synchronized (this.aClass129_1) {
			this.aClass129_1.method3025();
		}
		local2 = this.aClass129_2;
		synchronized (this.aClass129_2) {
			this.aClass129_2.method3025();
		}
	}

	@OriginalMember(owner = "client!as", name = "b", descriptor = "(I)V")
	public void method250() {
		@Pc(2) Class129 local2 = this.aClass129_1;
		synchronized (this.aClass129_1) {
			this.aClass129_1.method3026();
		}
		local2 = this.aClass129_2;
		synchronized (this.aClass129_2) {
			this.aClass129_2.method3026();
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(II)Lclient!fa;")
	public Class77 method251(@OriginalArg(1) int arg0) {
		@Pc(6) Class129 local6 = this.aClass129_1;
		@Pc(18) Class77 local18;
		synchronized (this.aClass129_1) {
			local18 = (Class77) this.aClass129_1.method3023((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(39) byte[] local39 = this.aClass188_7.method4283(Static355.method4988(arg0), Static122.method1777(arg0));
		local18 = new Class77();
		local18.anInt2227 = arg0;
		local18.aClass16_1 = this;
		if (local39 != null) {
			local18.method1664(new Class2_Sub20(local39));
		}
		@Pc(61) Class129 local61 = this.aClass129_1;
		synchronized (this.aClass129_1) {
			this.aClass129_1.method3029(local18, (long) arg0);
			return local18;
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IB)V")
	public void method253() {
		@Pc(2) Class129 local2 = this.aClass129_1;
		synchronized (this.aClass129_1) {
			this.aClass129_1.method3028(5);
		}
		local2 = this.aClass129_2;
		synchronized (this.aClass129_2) {
			this.aClass129_2.method3028(5);
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(BI)V")
	public void method254(@OriginalArg(1) int arg0) {
		this.anInt408 = arg0;
		@Pc(9) Class129 local9 = this.aClass129_2;
		synchronized (this.aClass129_2) {
			this.aClass129_2.method3025();
		}
	}
}
