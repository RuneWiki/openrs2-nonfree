import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ul")
public final class Class346 {

	@OriginalMember(owner = "client!ul", name = "v", descriptor = "I")
	public int anInt9680;

	@OriginalMember(owner = "client!ul", name = "q", descriptor = "Lclient!jt;")
	private final Class166 aClass166_61 = new Class166(64);

	@OriginalMember(owner = "client!ul", name = "t", descriptor = "Lclient!jt;")
	public final Class166 aClass166_62 = new Class166(50);

	@OriginalMember(owner = "client!ul", name = "u", descriptor = "Lclient!jt;")
	public final Class166 aClass166_63 = new Class166(5);

	@OriginalMember(owner = "client!ul", name = "j", descriptor = "Lclient!vd;")
	public final Class353 aClass353_124;

	@OriginalMember(owner = "client!ul", name = "p", descriptor = "Z")
	public boolean aBoolean668;

	@OriginalMember(owner = "client!ul", name = "r", descriptor = "Lclient!vd;")
	private final Class353 aClass353_125;

	@OriginalMember(owner = "client!ul", name = "s", descriptor = "Lclient!qg;")
	public final Class271 aClass271_16;

	@OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Lclient!qg;IZLclient!vd;Lclient!vd;)V")
	public Class346(@OriginalArg(0) Class271 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class353 arg3, @OriginalArg(4) Class353 arg4) {
		this.aClass353_124 = arg4;
		this.aBoolean668 = arg2;
		this.aClass353_125 = arg3;
		this.aClass271_16 = arg0;
		if (this.aClass353_125 != null) {
			@Pc(41) int local41 = this.aClass353_125.method8415() - 1;
			this.aClass353_125.method8422(local41);
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(BI)V")
	public void method8193() {
		@Pc(12) Class166 local12 = this.aClass166_61;
		synchronized (this.aClass166_61) {
			this.aClass166_61.method4809(5);
		}
		local12 = this.aClass166_62;
		synchronized (this.aClass166_62) {
			this.aClass166_62.method4809(5);
		}
		local12 = this.aClass166_63;
		synchronized (this.aClass166_63) {
			this.aClass166_63.method4809(5);
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Z)V")
	public void method8195() {
		@Pc(2) Class166 local2 = this.aClass166_62;
		synchronized (this.aClass166_62) {
			this.aClass166_62.method4811();
		}
		local2 = this.aClass166_63;
		synchronized (this.aClass166_63) {
			this.aClass166_63.method4811();
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(B)V")
	public void method8197() {
		@Pc(6) Class166 local6 = this.aClass166_61;
		synchronized (this.aClass166_61) {
			this.aClass166_61.method4811();
		}
		local6 = this.aClass166_62;
		synchronized (this.aClass166_62) {
			this.aClass166_62.method4811();
		}
		local6 = this.aClass166_63;
		synchronized (this.aClass166_63) {
			this.aClass166_63.method4811();
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IZ)V")
	public void method8198(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean668) {
			this.aBoolean668 = arg0;
			this.method8197();
		}
	}

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(IZ)Lclient!ow;")
	public Class247 method8199(@OriginalArg(0) int arg0) {
		@Pc(6) Class166 local6 = this.aClass166_61;
		@Pc(16) Class247 local16;
		synchronized (this.aClass166_61) {
			local16 = (Class247) this.aClass166_61.method4805((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class353 local29 = this.aClass353_125;
		@Pc(42) byte[] local42;
		synchronized (this.aClass353_125) {
			local42 = this.aClass353_125.method8404(Static154.method2415(arg0), Static516.method7739(arg0));
		}
		local16 = new Class247();
		local16.aClass346_1 = this;
		local16.anInt7690 = arg0;
		if (local42 != null) {
			local16.method6610(new Class6_Sub40(local42));
		}
		local16.method6606();
		@Pc(78) Class166 local78 = this.aClass166_61;
		synchronized (this.aClass166_61) {
			this.aClass166_61.method4803(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(II)V")
	public void method8200(@OriginalArg(0) int arg0) {
		this.anInt9680 = arg0;
		@Pc(15) Class166 local15 = this.aClass166_62;
		synchronized (this.aClass166_62) {
			this.aClass166_62.method4811();
		}
		local15 = this.aClass166_63;
		synchronized (this.aClass166_63) {
			this.aClass166_63.method4811();
		}
	}

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(B)V")
	public void method8201() {
		@Pc(6) Class166 local6 = this.aClass166_61;
		synchronized (this.aClass166_61) {
			this.aClass166_61.method4802();
		}
		local6 = this.aClass166_62;
		synchronized (this.aClass166_62) {
			this.aClass166_62.method4802();
		}
		local6 = this.aClass166_63;
		synchronized (this.aClass166_63) {
			this.aClass166_63.method4802();
		}
	}
}
