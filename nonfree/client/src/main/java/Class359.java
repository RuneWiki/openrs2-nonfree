import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vga")
public final class Class359 {

	@OriginalMember(owner = "client!vga", name = "v", descriptor = "[Lclient!nha;")
	private static final Class244[] aClass244Array1 = new Class244[32];

	@OriginalMember(owner = "client!vga", name = "g", descriptor = "Lclient!qr;")
	private final Class293 aClass293_67 = new Class293(64);

	@OriginalMember(owner = "client!vga", name = "i", descriptor = "Lclient!qr;")
	private final Class293 aClass293_68 = new Class293(100);

	@OriginalMember(owner = "client!vga", name = "f", descriptor = "Lclient!wu;")
	private final Class384 aClass384_132;

	static {
		@Pc(77) Class244[] local77 = Static504.method7359();
		for (@Pc(79) int local79 = 0; local79 < local77.length; local79++) {
			aClass244Array1[local77[local79].anInt6597] = local77[local79];
		}
	}

	@OriginalMember(owner = "client!vga", name = "<init>", descriptor = "(Lclient!ms;ILclient!wu;Lclient!wu;Lclient!wu;)V")
	public Class359(@OriginalArg(0) Class235 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class384 arg2, @OriginalArg(3) Class384 arg3, @OriginalArg(4) Class384 arg4) {
		this.aClass384_132 = arg2;
		if (this.aClass384_132 != null) {
			@Pc(26) int local26 = this.aClass384_132.method8865() - 1;
			this.aClass384_132.method8862(local26);
		}
		Static178.method2710(arg4, arg3);
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(II)V")
	public void method8409() {
		@Pc(2) Class293 local2 = this.aClass293_67;
		synchronized (this.aClass293_67) {
			this.aClass293_67.method6922(5);
		}
		local2 = this.aClass293_68;
		synchronized (this.aClass293_68) {
			this.aClass293_68.method6922(5);
		}
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(Z)V")
	public void method8412() {
		@Pc(11) Class293 local11 = this.aClass293_67;
		synchronized (this.aClass293_67) {
			this.aClass293_67.method6927();
		}
		local11 = this.aClass293_68;
		synchronized (this.aClass293_68) {
			this.aClass293_68.method6927();
		}
	}

	@OriginalMember(owner = "client!vga", name = "b", descriptor = "(II)Lclient!be;")
	public Class5_Sub4_Sub2 method8413(@OriginalArg(1) int arg0) {
		@Pc(6) Class293 local6 = this.aClass293_68;
		synchronized (this.aClass293_68) {
			@Pc(16) Class5_Sub4_Sub2 local16 = (Class5_Sub4_Sub2) this.aClass293_68.method6921((long) arg0);
			if (local16 == null) {
				local16 = new Class5_Sub4_Sub2(arg0);
				this.aClass293_68.method6925((long) arg0, local16);
			}
			return local16.method653() ? local16 : null;
		}
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(I)V")
	public void method8414() {
		@Pc(2) Class293 local2 = this.aClass293_67;
		synchronized (this.aClass293_67) {
			this.aClass293_67.method6930();
		}
		local2 = this.aClass293_68;
		synchronized (this.aClass293_68) {
			this.aClass293_68.method6930();
		}
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(BI)Lclient!la;")
	public Class200 method8415(@OriginalArg(1) int arg0) {
		@Pc(6) Class293 local6 = this.aClass293_67;
		@Pc(18) Class200 local18;
		synchronized (this.aClass293_67) {
			local18 = (Class200) this.aClass293_67.method6921((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(36) Class384 local36 = this.aClass384_132;
		@Pc(49) byte[] local49;
		synchronized (this.aClass384_132) {
			local49 = this.aClass384_132.method8885(Static640.method8803(arg0), Static149.method2193(arg0));
		}
		local18 = new Class200();
		local18.aClass359_1 = this;
		local18.anInt4881 = arg0;
		if (local49 != null) {
			local18.method4463(new Class5_Sub12(local49));
		}
		local18.method4464();
		@Pc(82) Class293 local82 = this.aClass293_67;
		synchronized (this.aClass293_67) {
			this.aClass293_67.method6925((long) arg0, local18);
			return local18;
		}
	}
}
