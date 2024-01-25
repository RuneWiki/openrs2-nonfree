import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jda")
public final class Class146 {

	@OriginalMember(owner = "client!jda", name = "r", descriptor = "Lclient!tf;")
	private final Class279 aClass279_2 = new Class279();

	@OriginalMember(owner = "client!jda", name = "b", descriptor = "I")
	private int anInt4766;

	@OriginalMember(owner = "client!jda", name = "f", descriptor = "I")
	private final int anInt4770;

	@OriginalMember(owner = "client!jda", name = "q", descriptor = "Lclient!sd;")
	private final Class267 aClass267_19;

	@OriginalMember(owner = "client!jda", name = "<init>", descriptor = "(I)V")
	public Class146(@OriginalArg(0) int arg0) {
		this.anInt4766 = arg0;
		this.anInt4770 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; local16 + local16 < arg0; local16 += local16) {
		}
		this.aClass267_19 = new Class267(local16);
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(B)V")
	public void method3999() {
		for (@Pc(11) Class3_Sub10_Sub4 local11 = (Class3_Sub10_Sub4) this.aClass279_2.method6908(); local11 != null; local11 = (Class3_Sub10_Sub4) this.aClass279_2.method6906()) {
			if (local11.method6666()) {
				local11.method7820();
				local11.method7643();
				this.anInt4766 += local11.anInt8061;
			}
		}
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(Ljava/lang/Object;Lclient!uk;II)V")
	private void method4001(@OriginalArg(0) Object arg0, @OriginalArg(1) Interface18 arg1) {
		if (this.anInt4770 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method4009(arg1);
		this.anInt4766--;
		while (this.anInt4766 < 0) {
			@Pc(40) Class3_Sub10_Sub4 local40 = (Class3_Sub10_Sub4) this.aClass279_2.method6909();
			this.method4006(local40);
		}
		@Pc(54) Class3_Sub10_Sub4_Sub1 local54 = new Class3_Sub10_Sub4_Sub1(arg1, arg0, 1);
		this.aClass267_19.method6640(local54, arg1.method5549());
		this.aClass279_2.method6910(local54);
		local54.aLong277 = 0L;
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(BLclient!uk;)Ljava/lang/Object;")
	public Object method4002(@OriginalArg(1) Interface18 arg0) {
		@Pc(9) long local9 = arg0.method5549();
		for (@Pc(16) Class3_Sub10_Sub4 local16 = (Class3_Sub10_Sub4) this.aClass267_19.method6644(local9); local16 != null; local16 = (Class3_Sub10_Sub4) this.aClass267_19.method6646()) {
			if (local16.anInterface18_3.method5548(arg0)) {
				@Pc(28) Object local28 = local16.method6668();
				if (local28 != null) {
					if (local16.method6666()) {
						@Pc(57) Class3_Sub10_Sub4_Sub1 local57 = new Class3_Sub10_Sub4_Sub1(arg0, local28, local16.anInt8061);
						this.aClass267_19.method6640(local57, local16.aLong285);
						this.aClass279_2.method6910(local57);
						local57.aLong277 = 0L;
						local16.method7820();
						local16.method7643();
					} else {
						this.aClass279_2.method6910(local16);
						local16.aLong277 = 0L;
					}
					return local28;
				}
				local16.method7820();
				local16.method7643();
				this.anInt4766 += local16.anInt8061;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(II)V")
	public void method4003() {
		if (Static430.aClass107_3 == null) {
			return;
		}
		for (@Pc(17) Class3_Sub10_Sub4 local17 = (Class3_Sub10_Sub4) this.aClass279_2.method6908(); local17 != null; local17 = (Class3_Sub10_Sub4) this.aClass279_2.method6906()) {
			if (local17.method6666()) {
				if (local17.method6668() == null) {
					local17.method7820();
					local17.method7643();
					this.anInt4766 += local17.anInt8061;
				}
			} else if (++local17.aLong277 > (long) 5) {
				@Pc(43) Class3_Sub10_Sub4 local43 = Static430.aClass107_3.method3118(local17);
				this.aClass267_19.method6640(local43, local17.aLong285);
				Static492.method7172(local17, local43);
				local17.method7820();
				local17.method7643();
			}
		}
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(Lclient!uk;ILjava/lang/Object;)V")
	public void method4004(@OriginalArg(0) Interface18 arg0, @OriginalArg(2) Object arg1) {
		this.method4001(arg1, arg0);
	}

	@OriginalMember(owner = "client!jda", name = "b", descriptor = "(I)I")
	public int method4005() {
		return this.anInt4770;
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(ILclient!en;)V")
	private void method4006(@OriginalArg(1) Class3_Sub10_Sub4 arg0) {
		if (arg0 != null) {
			arg0.method7820();
			arg0.method7643();
			this.anInt4766 += arg0.anInt8061;
		}
	}

	@OriginalMember(owner = "client!jda", name = "c", descriptor = "(I)I")
	public int method4007() {
		return this.anInt4766;
	}

	@OriginalMember(owner = "client!jda", name = "d", descriptor = "(I)V")
	public void method4008() {
		this.aClass279_2.method6905();
		this.aClass267_19.method6648();
		this.anInt4766 = this.anInt4770;
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(Lclient!uk;I)V")
	private void method4009(@OriginalArg(0) Interface18 arg0) {
		@Pc(9) long local9 = arg0.method5549();
		for (@Pc(24) Class3_Sub10_Sub4 local24 = (Class3_Sub10_Sub4) this.aClass267_19.method6644(local9); local24 != null; local24 = (Class3_Sub10_Sub4) this.aClass267_19.method6646()) {
			if (local24.anInterface18_3.method5548(arg0)) {
				this.method4006(local24);
				return;
			}
		}
	}
}
