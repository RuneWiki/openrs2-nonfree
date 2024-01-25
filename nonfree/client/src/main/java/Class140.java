import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kq")
public final class Class140 {

	@OriginalMember(owner = "client!kq", name = "p", descriptor = "Lclient!go;")
	private final Class87 aClass87_9 = new Class87();

	@OriginalMember(owner = "client!kq", name = "l", descriptor = "I")
	private final int anInt3454;

	@OriginalMember(owner = "client!kq", name = "g", descriptor = "I")
	private int anInt3451;

	@OriginalMember(owner = "client!kq", name = "h", descriptor = "Lclient!wk;")
	private final Class246 aClass246_16;

	static {
		new Class32("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
	}

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(I)V")
	public Class140(@OriginalArg(0) int arg0) {
		this.anInt3454 = arg0;
		this.anInt3451 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; arg0 > local16 + local16; local16 += local16) {
		}
		this.aClass246_16 = new Class246(local16);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(Ljava/lang/Object;Lclient!ts;II)V")
	private void method3164(@OriginalArg(0) Object arg0, @OriginalArg(1) Interface10 arg1) {
		if (this.anInt3454 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method3174(arg1);
		this.anInt3451--;
		while (this.anInt3451 < 0) {
			@Pc(44) Class2_Sub10_Sub4 local44 = (Class2_Sub10_Sub4) this.aClass87_9.method2359();
			this.method3169(local44);
		}
		@Pc(58) Class2_Sub10_Sub4_Sub1 local58 = new Class2_Sub10_Sub4_Sub1(arg1, arg0, 1);
		this.aClass246_16.method5609(local58, arg1.method847());
		this.aClass87_9.method2360(local58);
		local58.aLong206 = 0L;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(BLclient!ts;)Ljava/lang/Object;")
	public Object method3167(@OriginalArg(1) Interface10 arg0) {
		@Pc(9) long local9 = arg0.method847();
		for (@Pc(24) Class2_Sub10_Sub4 local24 = (Class2_Sub10_Sub4) this.aClass246_16.method5613(local9); local24 != null; local24 = (Class2_Sub10_Sub4) this.aClass246_16.method5608()) {
			if (local24.anInterface10_3.method846(arg0)) {
				@Pc(36) Object local36 = local24.method3219();
				if (local36 != null) {
					if (local24.method3222()) {
						@Pc(75) Class2_Sub10_Sub4_Sub1 local75 = new Class2_Sub10_Sub4_Sub1(arg0, local36, local24.anInt3516);
						this.aClass246_16.method5609(local75, local24.aLong209);
						this.aClass87_9.method2360(local75);
						local75.aLong206 = 0L;
						local24.method5617();
						local24.method5572();
					} else {
						this.aClass87_9.method2360(local24);
						local24.aLong206 = 0L;
					}
					return local36;
				}
				local24.method5617();
				local24.method5572();
				this.anInt3451 += local24.anInt3516;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lclient!hu;B)V")
	private void method3169(@OriginalArg(0) Class2_Sub10_Sub4 arg0) {
		if (arg0 != null) {
			arg0.method5617();
			arg0.method5572();
			this.anInt3451 += arg0.anInt3516;
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(I)I")
	public int method3170() {
		return this.anInt3451;
	}

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "(I)I")
	public int method3171() {
		return this.anInt3454;
	}

	@OriginalMember(owner = "client!kq", name = "c", descriptor = "(I)V")
	public void method3172() {
		this.aClass87_9.method2358();
		this.aClass246_16.method5610();
		this.anInt3451 = this.anInt3454;
	}

	@OriginalMember(owner = "client!kq", name = "d", descriptor = "(I)V")
	public void method3173() {
		for (@Pc(11) Class2_Sub10_Sub4 local11 = (Class2_Sub10_Sub4) this.aClass87_9.method2353(); local11 != null; local11 = (Class2_Sub10_Sub4) this.aClass87_9.method2352()) {
			if (local11.method3222()) {
				local11.method5617();
				local11.method5572();
				this.anInt3451 += local11.anInt3516;
			}
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lclient!ts;B)V")
	private void method3174(@OriginalArg(0) Interface10 arg0) {
		@Pc(9) long local9 = arg0.method847();
		for (@Pc(18) Class2_Sub10_Sub4 local18 = (Class2_Sub10_Sub4) this.aClass246_16.method5613(local9); local18 != null; local18 = (Class2_Sub10_Sub4) this.aClass246_16.method5608()) {
			if (local18.anInterface10_3.method846(arg0)) {
				this.method3169(local18);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lclient!ts;Ljava/lang/Object;B)V")
	public void method3176(@OriginalArg(0) Interface10 arg0, @OriginalArg(1) Object arg1) {
		this.method3164(arg1, arg0);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(II)V")
	public void method3177() {
		if (Static380.aClass147_1 == null) {
			return;
		}
		for (@Pc(9) Class2_Sub10_Sub4 local9 = (Class2_Sub10_Sub4) this.aClass87_9.method2353(); local9 != null; local9 = (Class2_Sub10_Sub4) this.aClass87_9.method2352()) {
			if (local9.method3222()) {
				if (local9.method3219() == null) {
					local9.method5617();
					local9.method5572();
					this.anInt3451 += local9.anInt3516;
				}
			} else if (++local9.aLong206 > (long) 5) {
				@Pc(33) Class2_Sub10_Sub4 local33 = Static380.aClass147_1.method3726(local9);
				this.aClass246_16.method5609(local33, local9.aLong209);
				Static40.method702(local9, local33);
				local9.method5617();
				local9.method5572();
			}
		}
	}
}
