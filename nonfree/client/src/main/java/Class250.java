import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ol")
public final class Class250 {

	@OriginalMember(owner = "client!ol", name = "i", descriptor = "Lclient!gm;")
	private final Class125 aClass125_11 = new Class125();

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "I")
	private int anInt6600;

	@OriginalMember(owner = "client!ol", name = "m", descriptor = "I")
	private final int anInt6608;

	@OriginalMember(owner = "client!ol", name = "n", descriptor = "Lclient!kea;")
	private final Class187 aClass187_30;

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(I)V")
	public Class250(@OriginalArg(0) int arg0) {
		this.anInt6600 = arg0;
		this.anInt6608 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; local16 + local16 < arg0; local16 += local16) {
		}
		this.aClass187_30 = new Class187(local16);
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V")
	public void method5277() {
		for (@Pc(11) Class1_Sub6_Sub4 local11 = (Class1_Sub6_Sub4) this.aClass125_11.method2423(); local11 != null; local11 = (Class1_Sub6_Sub4) this.aClass125_11.method2428()) {
			if (local11.method5583()) {
				local11.method7859();
				local11.method7811();
				this.anInt6600 += local11.anInt7023;
			}
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lclient!jq;Z)V")
	private void method5278(@OriginalArg(0) Class1_Sub6_Sub4 arg0) {
		if (arg0 != null) {
			arg0.method7859();
			arg0.method7811();
			this.anInt6600 += arg0.anInt7023;
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IB)V")
	public void method5279() {
		if (Static167.aClass78_1 == null) {
			return;
		}
		for (@Pc(9) Class1_Sub6_Sub4 local9 = (Class1_Sub6_Sub4) this.aClass125_11.method2423(); local9 != null; local9 = (Class1_Sub6_Sub4) this.aClass125_11.method2428()) {
			if (local9.method5583()) {
				if (local9.method5584() == null) {
					local9.method7859();
					local9.method7811();
					this.anInt6600 += local9.anInt7023;
				}
			} else if (++local9.aLong293 > (long) 5) {
				@Pc(50) Class1_Sub6_Sub4 local50 = Static167.aClass78_1.method5016(local9);
				this.aClass187_30.method3795(local50, local9.aLong301);
				Static414.method5702(local50, local9);
				local9.method7859();
				local9.method7811();
			}
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Z)I")
	public int method5280() {
		return this.anInt6600;
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(I)V")
	public void method5281() {
		this.aClass125_11.method2420();
		this.aClass187_30.method3801();
		this.anInt6600 = this.anInt6608;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lclient!qt;Z)Ljava/lang/Object;")
	public Object method5282(@OriginalArg(0) Interface17 arg0) {
		@Pc(14) long local14 = arg0.method5937();
		for (@Pc(21) Class1_Sub6_Sub4 local21 = (Class1_Sub6_Sub4) this.aClass187_30.method3797(local14); local21 != null; local21 = (Class1_Sub6_Sub4) this.aClass187_30.method3803()) {
			if (local21.anInterface17_3.method5938(arg0)) {
				@Pc(33) Object local33 = local21.method5584();
				if (local33 != null) {
					if (local21.method5583()) {
						@Pc(62) Class1_Sub6_Sub4_Sub2 local62 = new Class1_Sub6_Sub4_Sub2(arg0, local33, local21.anInt7023);
						this.aClass187_30.method3795(local62, local21.aLong301);
						this.aClass125_11.method2426(local62);
						local62.aLong293 = 0L;
						local21.method7859();
						local21.method7811();
					} else {
						this.aClass125_11.method2426(local21);
						local21.aLong293 = 0L;
					}
					return local33;
				}
				local21.method7859();
				local21.method7811();
				this.anInt6600 += local21.anInt7023;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)I")
	public int method5285() {
		return this.anInt6608;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lclient!qt;ILjava/lang/Object;I)V")
	private void method5286(@OriginalArg(0) Interface17 arg0, @OriginalArg(2) Object arg1) {
		if (this.anInt6608 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method5288(arg0);
		this.anInt6600--;
		while (this.anInt6600 < 0) {
			@Pc(42) Class1_Sub6_Sub4 local42 = (Class1_Sub6_Sub4) this.aClass125_11.method2421();
			this.method5278(local42);
		}
		@Pc(59) Class1_Sub6_Sub4_Sub2 local59 = new Class1_Sub6_Sub4_Sub2(arg0, arg1, 1);
		this.aClass187_30.method3795(local59, arg0.method5937());
		this.aClass125_11.method2426(local59);
		local59.aLong293 = 0L;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Ljava/lang/Object;ILclient!qt;)V")
	public void method5287(@OriginalArg(0) Object arg0, @OriginalArg(2) Interface17 arg1) {
		this.method5286(arg1, arg0);
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lclient!qt;B)V")
	private void method5288(@OriginalArg(0) Interface17 arg0) {
		@Pc(9) long local9 = arg0.method5937();
		for (@Pc(24) Class1_Sub6_Sub4 local24 = (Class1_Sub6_Sub4) this.aClass187_30.method3797(local9); local24 != null; local24 = (Class1_Sub6_Sub4) this.aClass187_30.method3803()) {
			if (local24.anInterface17_3.method5938(arg0)) {
				this.method5278(local24);
				return;
			}
		}
	}
}
