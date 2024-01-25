import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mga")
public final class Class223 {

	@OriginalMember(owner = "client!mga", name = "B", descriptor = "[Lclient!ff;")
	private static final Class105[] aClass105Array1 = new Class105[32];

	@OriginalMember(owner = "client!mga", name = "m", descriptor = "Lclient!wd;")
	private final Class384 aClass384_12 = new Class384();

	@OriginalMember(owner = "client!mga", name = "j", descriptor = "I")
	private int anInt6280;

	@OriginalMember(owner = "client!mga", name = "k", descriptor = "I")
	private final int anInt6281;

	@OriginalMember(owner = "client!mga", name = "c", descriptor = "Lclient!lk;")
	private final Class209 aClass209_37;

	static {
		@Pc(79) Class105[] local79 = Static653.method8881();
		for (@Pc(81) int local81 = 0; local81 < local79.length; local81++) {
			aClass105Array1[local79[local81].anInt2549] = local79[local81];
		}
	}

	@OriginalMember(owner = "client!mga", name = "<init>", descriptor = "(I)V")
	public Class223(@OriginalArg(0) int arg0) {
		this.anInt6280 = arg0;
		this.anInt6281 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; arg0 > local16 + local16; local16 += local16) {
		}
		this.aClass209_37 = new Class209(local16);
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(Z)I")
	public int method5299() {
		return this.anInt6280;
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(Ljava/lang/Object;ILclient!wt;)V")
	public void method5300(@OriginalArg(0) Object arg0, @OriginalArg(2) Interface27 arg1) {
		this.method5301(arg1, arg0);
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(ILclient!wt;BLjava/lang/Object;)V")
	private void method5301(@OriginalArg(1) Interface27 arg0, @OriginalArg(3) Object arg1) {
		if (this.anInt6281 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method5304(arg0);
		this.anInt6280--;
		while (this.anInt6280 < 0) {
			@Pc(43) Class6_Sub4_Sub1 local43 = (Class6_Sub4_Sub1) this.aClass384_12.method8907();
			this.method5306(local43);
		}
		@Pc(62) Class6_Sub4_Sub1_Sub1 local62 = new Class6_Sub4_Sub1_Sub1(arg0, arg1, 1);
		this.aClass209_37.method5035(arg0.method6491(), local62);
		this.aClass384_12.method8909(local62);
		local62.aLong310 = 0L;
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(B)V")
	public void method5302() {
		this.aClass384_12.method8913();
		this.aClass209_37.method5041();
		this.anInt6280 = this.anInt6281;
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(I)V")
	public void method5303() {
		for (@Pc(13) Class6_Sub4_Sub1 local13 = (Class6_Sub4_Sub1) this.aClass384_12.method8910(); local13 != null; local13 = (Class6_Sub4_Sub1) this.aClass384_12.method8908()) {
			if (local13.method5716()) {
				local13.method9174();
				local13.method9043();
				this.anInt6280 += local13.anInt6666;
			}
		}
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(Lclient!wt;I)V")
	private void method5304(@OriginalArg(0) Interface27 arg0) {
		@Pc(9) long local9 = arg0.method6491();
		for (@Pc(21) Class6_Sub4_Sub1 local21 = (Class6_Sub4_Sub1) this.aClass209_37.method5038(local9); local21 != null; local21 = (Class6_Sub4_Sub1) this.aClass209_37.method5042()) {
			if (local21.anInterface27_3.method6492(arg0)) {
				this.method5306(local21);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(IZ)V")
	public void method5305() {
		if (Static419.aClass202_1 == null) {
			return;
		}
		for (@Pc(9) Class6_Sub4_Sub1 local9 = (Class6_Sub4_Sub1) this.aClass384_12.method8910(); local9 != null; local9 = (Class6_Sub4_Sub1) this.aClass384_12.method8908()) {
			if (local9.method5716()) {
				if (local9.method5714() == null) {
					local9.method9174();
					local9.method9043();
					this.anInt6280 += local9.anInt6666;
				}
			} else if (++local9.aLong310 > (long) 5) {
				@Pc(54) Class6_Sub4_Sub1 local54 = Static419.aClass202_1.method5412(local9);
				this.aClass209_37.method5035(local9.aLong314, local54);
				Static579.method8049(local54, local9);
				local9.method9174();
				local9.method9043();
			}
		}
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(Lclient!aw;I)V")
	private void method5306(@OriginalArg(0) Class6_Sub4_Sub1 arg0) {
		if (arg0 != null) {
			arg0.method9174();
			arg0.method9043();
			this.anInt6280 += arg0.anInt6666;
		}
	}

	@OriginalMember(owner = "client!mga", name = "b", descriptor = "(B)I")
	public int method5307() {
		return this.anInt6281;
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(ILclient!wt;)Ljava/lang/Object;")
	public Object method5309(@OriginalArg(1) Interface27 arg0) {
		@Pc(16) long local16 = arg0.method6491();
		for (@Pc(23) Class6_Sub4_Sub1 local23 = (Class6_Sub4_Sub1) this.aClass209_37.method5038(local16); local23 != null; local23 = (Class6_Sub4_Sub1) this.aClass209_37.method5042()) {
			if (local23.anInterface27_3.method6492(arg0)) {
				@Pc(35) Object local35 = local23.method5714();
				if (local35 != null) {
					if (local23.method5716()) {
						@Pc(64) Class6_Sub4_Sub1_Sub1 local64 = new Class6_Sub4_Sub1_Sub1(arg0, local35, local23.anInt6666);
						this.aClass209_37.method5035(local23.aLong314, local64);
						this.aClass384_12.method8909(local64);
						local64.aLong310 = 0L;
						local23.method9174();
						local23.method9043();
					} else {
						this.aClass384_12.method8909(local23);
						local23.aLong310 = 0L;
					}
					return local35;
				}
				local23.method9174();
				local23.method9043();
				this.anInt6280 += local23.anInt6666;
			}
		}
		return null;
	}
}
