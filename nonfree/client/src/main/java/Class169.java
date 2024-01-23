import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class169 {

	@OriginalMember(owner = "client!th", name = "h", descriptor = "Lclient!ad;")
	private Class5 aClass5_12 = new Class5();

	@OriginalMember(owner = "client!th", name = "b", descriptor = "I")
	private int anInt5167;

	@OriginalMember(owner = "client!th", name = "m", descriptor = "I")
	private int anInt5175;

	@OriginalMember(owner = "client!th", name = "j", descriptor = "Lclient!s;")
	private Class156 aClass156_25;

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "(I)V")
	public Class169(@OriginalArg(0) int arg0) {
		this.anInt5167 = arg0;
		this.anInt5175 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; local14 + local14 < arg0; local14 += local14) {
		}
		this.aClass156_25 = new Class156(local14);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(I)I")
	public int method4012() {
		@Pc(3) int local3 = 0;
		for (@Pc(13) Class1_Sub1_Sub9 local13 = (Class1_Sub1_Sub9) this.aClass5_12.method49(); local13 != null; local13 = (Class1_Sub1_Sub9) this.aClass5_12.method51()) {
			if (!local13.method2983()) {
				local3++;
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(B)V")
	public void method4014() {
		for (@Pc(7) Class1_Sub1_Sub9 local7 = (Class1_Sub1_Sub9) this.aClass5_12.method49(); local7 != null; local7 = (Class1_Sub1_Sub9) this.aClass5_12.method51()) {
			if (local7.method2983()) {
				local7.method4616();
				local7.method4617();
				this.anInt5167++;
			}
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(JB)V")
	public void method4015(@OriginalArg(0) long arg0) {
		@Pc(18) Class1_Sub1_Sub9 local18 = (Class1_Sub1_Sub9) this.aClass156_25.method3821(arg0);
		if (local18 != null) {
			local18.method4616();
			local18.method4617();
			this.anInt5167++;
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Ljava/lang/Object;IJ)V")
	public void method4016(@OriginalArg(0) Object arg0, @OriginalArg(2) long arg1) {
		this.method4015(arg1);
		if (this.anInt5167 == 0) {
			@Pc(17) Class1_Sub1_Sub9 local17 = (Class1_Sub1_Sub9) this.aClass5_12.method53();
			local17.method4616();
			local17.method4617();
		} else {
			this.anInt5167--;
		}
		@Pc(38) Class1_Sub1_Sub9_Sub1 local38 = new Class1_Sub1_Sub9_Sub1(arg0);
		this.aClass156_25.method3816(arg1, local38);
		this.aClass5_12.method48(local38);
		local38.aLong224 = 0L;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(BJ)Ljava/lang/Object;")
	public Object method4017(@OriginalArg(1) long arg0) {
		@Pc(10) Class1_Sub1_Sub9 local10 = (Class1_Sub1_Sub9) this.aClass156_25.method3821(arg0);
		if (local10 == null) {
			return null;
		}
		@Pc(20) Object local20 = local10.method2981();
		if (local20 == null) {
			local10.method4616();
			local10.method4617();
			this.anInt5167++;
			return null;
		}
		if (local10.method2983()) {
			@Pc(57) Class1_Sub1_Sub9_Sub1 local57 = new Class1_Sub1_Sub9_Sub1(local20);
			this.aClass156_25.method3816(local10.aLong223, local57);
			this.aClass5_12.method48(local57);
			local57.aLong224 = 0L;
			local10.method4616();
			local10.method4617();
		} else {
			this.aClass5_12.method48(local10);
			local10.aLong224 = 0L;
		}
		return local20;
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(I)V")
	public void method4018() {
		this.aClass5_12.method55();
		this.aClass156_25.method3826();
		this.anInt5167 = this.anInt5175;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(II)V")
	public void method4020(@OriginalArg(1) int arg0) {
		if (Static255.aClass9_1 == null) {
			return;
		}
		for (@Pc(17) Class1_Sub1_Sub9 local17 = (Class1_Sub1_Sub9) this.aClass5_12.method49(); local17 != null; local17 = (Class1_Sub1_Sub9) this.aClass5_12.method51()) {
			if (local17.method2983()) {
				if (local17.method2981() == null) {
					local17.method4616();
					local17.method4617();
					this.anInt5167++;
				}
			} else if (++local17.aLong224 > (long) arg0) {
				@Pc(62) Class1_Sub1_Sub9 local62 = Static255.aClass9_1.method2420(local17);
				this.aClass156_25.method3816(local17.aLong223, local62);
				Static235.method3726(local62, local17);
				local17.method4616();
				local17.method4617();
			}
		}
	}
}
