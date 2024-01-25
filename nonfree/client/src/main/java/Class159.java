import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jl")
public final class Class159 {

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "Lclient!lha;")
	private Class8_Sub5 aClass8_Sub5_29 = new Class8_Sub5();

	@OriginalMember(owner = "client!jl", name = "i", descriptor = "Lclient!sc;")
	private final Class302 aClass302_8 = new Class302();

	@OriginalMember(owner = "client!jl", name = "k", descriptor = "I")
	private int anInt5544;

	@OriginalMember(owner = "client!jl", name = "j", descriptor = "I")
	private final int anInt5543;

	@OriginalMember(owner = "client!jl", name = "h", descriptor = "Lclient!pfa;")
	private final Class253 aClass253_19;

	@OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(I)V")
	public Class159(@OriginalArg(0) int arg0) {
		this.anInt5544 = arg0;
		this.anInt5543 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass253_19 = new Class253(local19);
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)V")
	public void method4548() {
		this.aClass302_8.method7322();
		this.aClass253_19.method6598();
		this.aClass8_Sub5_29 = new Class8_Sub5();
		this.anInt5544 = this.anInt5543;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(JBLclient!lha;)V")
	public void method4549(@OriginalArg(0) long arg0, @OriginalArg(2) Class8_Sub5 arg1) {
		if (this.anInt5544 == 0) {
			@Pc(27) Class8_Sub5 local27 = this.aClass302_8.method7330();
			local27.method8640();
			local27.method8381();
			if (local27 == this.aClass8_Sub5_29) {
				local27 = this.aClass302_8.method7330();
				local27.method8640();
				local27.method8381();
			}
		} else {
			this.anInt5544--;
		}
		this.aClass253_19.method6591(arg1, arg0);
		this.aClass302_8.method7328(arg1);
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(ZJ)V")
	public void method4550(@OriginalArg(1) long arg0) {
		@Pc(10) Class8_Sub5 local10 = (Class8_Sub5) this.aClass253_19.method6594(arg0);
		if (local10 != null) {
			local10.method8640();
			local10.method8381();
			this.anInt5544++;
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(JI)Lclient!lha;")
	public Class8_Sub5 method4551(@OriginalArg(0) long arg0) {
		@Pc(18) Class8_Sub5 local18 = (Class8_Sub5) this.aClass253_19.method6594(arg0);
		if (local18 != null) {
			this.aClass302_8.method7328(local18);
		}
		return local18;
	}
}
