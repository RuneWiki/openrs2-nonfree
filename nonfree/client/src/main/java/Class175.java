import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ui")
public final class Class175 {

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "Lclient!wg;")
	private Class189 aClass189_11 = new Class189();

	@OriginalMember(owner = "client!ui", name = "k", descriptor = "I")
	private int anInt5157;

	@OriginalMember(owner = "client!ui", name = "f", descriptor = "I")
	private int anInt5152;

	@OriginalMember(owner = "client!ui", name = "o", descriptor = "Lclient!il;")
	private Class86 aClass86_36;

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(I)V")
	public Class175(@OriginalArg(0) int arg0) {
		this.anInt5157 = arg0;
		this.anInt5152 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; local14 + local14 < arg0; local14 += local14) {
		}
		this.aClass86_36 = new Class86(local14);
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Ljava/lang/Object;JI)V")
	public void method4285(@OriginalArg(0) Object arg0, @OriginalArg(1) long arg1) {
		this.method4293(arg1);
		if (this.anInt5157 == 0) {
			@Pc(15) Class1_Sub5_Sub7 local15 = (Class1_Sub5_Sub7) this.aClass189_11.method4602();
			local15.method4573();
			local15.method4577();
		} else {
			this.anInt5157--;
		}
		@Pc(38) Class1_Sub5_Sub7_Sub2 local38 = new Class1_Sub5_Sub7_Sub2(arg0);
		this.aClass86_36.method2144(local38, arg1);
		this.aClass189_11.method4603(local38);
		local38.aLong211 = 0L;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)V")
	public void method4287() {
		this.aClass189_11.method4604();
		this.aClass86_36.method2138();
		this.anInt5157 = this.anInt5152;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IB)V")
	public void method4288(@OriginalArg(0) int arg0) {
		if (Static149.aClass21_2 == null) {
			return;
		}
		for (@Pc(17) Class1_Sub5_Sub7 local17 = (Class1_Sub5_Sub7) this.aClass189_11.method4600(); local17 != null; local17 = (Class1_Sub5_Sub7) this.aClass189_11.method4601()) {
			if (local17.method3318()) {
				if (local17.method3312() == null) {
					local17.method4573();
					local17.method4577();
					this.anInt5157++;
				}
			} else if (++local17.aLong211 > (long) arg0) {
				@Pc(58) Class1_Sub5_Sub7 local58 = Static149.aClass21_2.method568(local17);
				this.aClass86_36.method2144(local58, local17.aLong210);
				Static212.method3488(local58, local17);
				local17.method4573();
				local17.method4577();
			}
		}
	}

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "(I)I")
	public int method4290() {
		@Pc(15) int local15 = 0;
		for (@Pc(21) Class1_Sub5_Sub7 local21 = (Class1_Sub5_Sub7) this.aClass189_11.method4600(); local21 != null; local21 = (Class1_Sub5_Sub7) this.aClass189_11.method4601()) {
			if (!local21.method3318()) {
				local15++;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IJ)V")
	public void method4293(@OriginalArg(1) long arg0) {
		@Pc(13) Class1_Sub5_Sub7 local13 = (Class1_Sub5_Sub7) this.aClass86_36.method2136(arg0);
		if (local13 != null) {
			local13.method4573();
			local13.method4577();
			this.anInt5157++;
		}
	}

	@OriginalMember(owner = "client!ui", name = "e", descriptor = "(I)V")
	public void method4294() {
		for (@Pc(13) Class1_Sub5_Sub7 local13 = (Class1_Sub5_Sub7) this.aClass189_11.method4600(); local13 != null; local13 = (Class1_Sub5_Sub7) this.aClass189_11.method4601()) {
			if (local13.method3318()) {
				local13.method4573();
				local13.method4577();
				this.anInt5157++;
			}
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(JZ)Ljava/lang/Object;")
	public Object method4295(@OriginalArg(0) long arg0) {
		@Pc(10) Class1_Sub5_Sub7 local10 = (Class1_Sub5_Sub7) this.aClass86_36.method2136(arg0);
		if (local10 == null) {
			return null;
		}
		@Pc(19) Object local19 = local10.method3312();
		if (local19 == null) {
			local10.method4573();
			local10.method4577();
			this.anInt5157++;
			return null;
		}
		if (local10.method3318()) {
			@Pc(60) Class1_Sub5_Sub7_Sub2 local60 = new Class1_Sub5_Sub7_Sub2(local19);
			this.aClass86_36.method2144(local60, local10.aLong210);
			this.aClass189_11.method4603(local60);
			local60.aLong211 = 0L;
			local10.method4573();
			local10.method4577();
		} else {
			this.aClass189_11.method4603(local10);
			local10.aLong211 = 0L;
		}
		return local19;
	}
}
