import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jm")
public final class Class116 {

	@OriginalMember(owner = "client!jm", name = "c", descriptor = "Lclient!h;")
	public static final Class89 aClass89_131 = new Class89(44, 8);

	@OriginalMember(owner = "client!jm", name = "k", descriptor = "I")
	public static int anInt3144 = 0;

	@OriginalMember(owner = "client!jm", name = "l", descriptor = "I")
	public static int anInt3145 = 0;

	@OriginalMember(owner = "client!jm", name = "f", descriptor = "Lclient!tl;")
	private Class2_Sub2 aClass2_Sub2_32 = new Class2_Sub2();

	@OriginalMember(owner = "client!jm", name = "q", descriptor = "Lclient!wc;")
	private final Class246 aClass246_3 = new Class246();

	@OriginalMember(owner = "client!jm", name = "m", descriptor = "I")
	private final int anInt3146;

	@OriginalMember(owner = "client!jm", name = "o", descriptor = "I")
	private int anInt3147;

	@OriginalMember(owner = "client!jm", name = "n", descriptor = "Lclient!ad;")
	private final Class4 aClass4_69;

	@OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(I)V", line = 374)
	public Class116(@OriginalArg(0) int arg0) {
		this.anInt3146 = arg0;
		this.anInt3147 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass4_69 = new Class4(local19);
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(JB)Lclient!tl;", line = 89)
	public Class2_Sub2 method3153(@OriginalArg(0) long arg0) {
		@Pc(15) Class2_Sub2 local15 = (Class2_Sub2) this.aClass4_69.method90(arg0);
		if (local15 != null) {
			this.aClass246_3.method6342(local15);
		}
		return local15;
	}

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "(B)V", line = 112)
	public void method3154() {
		this.aClass246_3.method6343();
		this.aClass4_69.method81();
		this.aClass2_Sub2_32 = new Class2_Sub2();
		this.anInt3147 = this.anInt3146;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(BLclient!tl;J)V", line = 210)
	public void method3156(@OriginalArg(1) Class2_Sub2 arg0, @OriginalArg(2) long arg1) {
		if (this.anInt3147 == 0) {
			@Pc(7) Class2_Sub2 local7 = this.aClass246_3.method6340();
			local7.method6469();
			local7.method6144();
			if (this.aClass2_Sub2_32 == local7) {
				local7 = this.aClass246_3.method6340();
				local7.method6469();
				local7.method6144();
			}
		} else {
			this.anInt3147--;
		}
		this.aClass4_69.method87(arg0, arg1);
		this.aClass246_3.method6342(arg0);
	}
}
