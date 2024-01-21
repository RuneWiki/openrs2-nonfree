import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class Class54 {

	@OriginalMember(owner = "client!qa", name = "A", descriptor = "Lclient!ta;")
	private final Class5_Sub1 aClass5_Sub1_44 = new Class5_Sub1();

	@OriginalMember(owner = "client!qa", name = "C", descriptor = "Lclient!b;")
	private final Class6 aClass6_3 = new Class6();

	@OriginalMember(owner = "client!qa", name = "D", descriptor = "I")
	private final int anInt2069;

	@OriginalMember(owner = "client!qa", name = "E", descriptor = "I")
	private int anInt2070;

	@OriginalMember(owner = "client!qa", name = "B", descriptor = "Lclient!rb;")
	private final Class57 aClass57_13;

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(I)V")
	public Class54(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = 1;
		this.anInt2069 = arg0;
		this.anInt2070 = arg0;
		while (arg0 > local13 + local13) {
			local13 += local13;
		}
		this.aClass57_13 = new Class57(local13);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(JB)Lclient!ta;")
	public Class5_Sub1 method1397(@OriginalArg(0) long arg0) {
		@Pc(6) Class5_Sub1 local6 = (Class5_Sub1) this.aClass57_13.method1575(arg0);
		if (local6 != null) {
			this.aClass6_3.method155(local6);
		}
		return local6;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!ta;IJ)V")
	public void method1399(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(2) long arg1) {
		if (this.anInt2070 == 0) {
			@Pc(8) Class5_Sub1 local8 = this.aClass6_3.method153();
			local8.method2002();
			local8.method2009();
			if (local8 == this.aClass5_Sub1_44) {
				local8 = this.aClass6_3.method153();
				local8.method2002();
				local8.method2009();
			}
		} else {
			this.anInt2070--;
		}
		this.aClass57_13.method1581(arg1, arg0);
		this.aClass6_3.method155(arg0);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)V")
	public void method1402() {
		while (true) {
			@Pc(18) Class5_Sub1 local18 = this.aClass6_3.method153();
			if (local18 == null) {
				this.anInt2070 = this.anInt2069;
				return;
			}
			local18.method2002();
			local18.method2009();
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(JI)V")
	public void method1403(@OriginalArg(0) long arg0) {
		@Pc(13) Class5_Sub1 local13 = (Class5_Sub1) this.aClass57_13.method1575(arg0);
		if (local13 != null) {
			local13.method2002();
			local13.method2009();
			this.anInt2070++;
		}
	}
}
