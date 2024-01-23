import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class53 {

	@OriginalMember(owner = "client!ie", name = "g", descriptor = "Lclient!uh;")
	private Class116 aClass116_4 = new Class116();

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "I")
	private int anInt2005;

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
	private int anInt2004;

	@OriginalMember(owner = "client!ie", name = "q", descriptor = "Lclient!sc;")
	private Class102 aClass102_10;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(I)V")
	public Class53(@OriginalArg(0) int arg0) {
		@Pc(8) int local8;
		for (local8 = 1; local8 + local8 < arg0; local8 += local8) {
		}
		this.anInt2005 = arg0;
		this.anInt2004 = arg0;
		this.aClass102_10 = new Class102(local8);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)V")
	public void method1496(@OriginalArg(0) int arg0) {
		if (Static190.aClass76_1 == null) {
			return;
		}
		for (@Pc(17) Class1_Sub2_Sub7 local17 = (Class1_Sub2_Sub7) this.aClass116_4.method3453(); local17 != null; local17 = (Class1_Sub2_Sub7) this.aClass116_4.method3460()) {
			if (local17.method2777()) {
				if (local17.method2774() == null) {
					local17.method3758();
					local17.method3318();
					this.anInt2005++;
				}
			} else if ((long) arg0 < ++local17.aLong156) {
				@Pc(43) Class1_Sub2_Sub7 local43 = Static190.aClass76_1.method2422(local17);
				this.aClass102_10.method3083(local43, local17.aLong170);
				this.aClass116_4.method3462(local43, local17);
				local17.method3758();
				local17.method3318();
			}
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Ljava/lang/Object;JI)V")
	public void method1497(@OriginalArg(0) Object arg0, @OriginalArg(1) long arg1) {
		if (this.anInt2005 == 0) {
			@Pc(12) Class1_Sub2_Sub7 local12 = (Class1_Sub2_Sub7) this.aClass116_4.method3464();
			local12.method3758();
			local12.method3318();
		} else {
			this.anInt2005--;
		}
		@Pc(33) Class1_Sub2_Sub7_Sub1 local33 = new Class1_Sub2_Sub7_Sub1(arg0);
		this.aClass102_10.method3083(local33, arg1);
		this.aClass116_4.method3454(local33);
		local33.aLong156 = 0;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V")
	public void method1498() {
		this.aClass116_4.method3458();
		this.aClass102_10.method3090();
		this.anInt2005 = this.anInt2004;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IJ)V")
	public void method1500(@OriginalArg(1) long arg0) {
		@Pc(10) Class1_Sub2_Sub7 local10 = (Class1_Sub2_Sub7) this.aClass102_10.method3093(arg0);
		if (local10 != null) {
			local10.method3758();
			local10.method3318();
			this.anInt2005++;
		}
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(IJ)Ljava/lang/Object;")
	public Object method1501(@OriginalArg(1) long arg0) {
		@Pc(18) Class1_Sub2_Sub7 local18 = (Class1_Sub2_Sub7) this.aClass102_10.method3093(arg0);
		if (local18 == null) {
			return null;
		}
		@Pc(26) Object local26 = local18.method2774();
		if (local26 == null) {
			local18.method3758();
			local18.method3318();
			this.anInt2005++;
			return null;
		}
		if (local18.method2777()) {
			@Pc(61) Class1_Sub2_Sub7_Sub1 local61 = new Class1_Sub2_Sub7_Sub1(local26);
			this.aClass102_10.method3083(local61, local18.aLong170);
			this.aClass116_4.method3454(local61);
			local61.aLong156 = 0L;
			local18.method3758();
			local18.method3318();
		} else {
			this.aClass116_4.method3454(local18);
			local18.aLong156 = 0L;
		}
		return local26;
	}
}
