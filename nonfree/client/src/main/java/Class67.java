import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public final class Class67 {

	@OriginalMember(owner = "client!sa", name = "u", descriptor = "Lclient!qd;")
	private final Class5_Sub2 aClass5_Sub2_52 = new Class5_Sub2();

	@OriginalMember(owner = "client!sa", name = "x", descriptor = "Lclient!nd;")
	private final Class49 aClass49_3 = new Class49();

	@OriginalMember(owner = "client!sa", name = "w", descriptor = "I")
	private int anInt2666;

	@OriginalMember(owner = "client!sa", name = "C", descriptor = "I")
	private final int anInt2667;

	@OriginalMember(owner = "client!sa", name = "B", descriptor = "Lclient!s;")
	private final Class66 aClass66_10;

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(I)V")
	public Class67(@OriginalArg(0) int arg0) {
		@Pc(13) int local13;
		for (local13 = 1; arg0 > local13 + local13; local13 += local13) {
		}
		this.anInt2666 = arg0;
		this.anInt2667 = arg0;
		this.aClass66_10 = new Class66(local13);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!qd;IJ)V")
	public void method1818(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(2) long arg1) {
		if (this.anInt2666 == 0) {
			@Pc(11) Class5_Sub2 local11 = this.aClass49_3.method1470();
			local11.method2144();
			local11.method2116();
			if (this.aClass5_Sub2_52 == local11) {
				local11 = this.aClass49_3.method1470();
				local11.method2144();
				local11.method2116();
			}
		} else {
			this.anInt2666--;
		}
		this.aClass66_10.method1811(arg1, arg0);
		this.aClass49_3.method1472(arg0);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Z)V")
	public void method1819() {
		while (true) {
			@Pc(10) Class5_Sub2 local10 = this.aClass49_3.method1470();
			if (local10 == null) {
				this.anInt2666 = this.anInt2667;
				return;
			}
			local10.method2144();
			local10.method2116();
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZJ)V")
	public void method1822(@OriginalArg(1) long arg0) {
		@Pc(14) Class5_Sub2 local14 = (Class5_Sub2) this.aClass66_10.method1812(arg0);
		if (local14 != null) {
			local14.method2144();
			local14.method2116();
			this.anInt2666++;
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IJ)Lclient!qd;")
	public Class5_Sub2 method1823(@OriginalArg(1) long arg0) {
		@Pc(11) Class5_Sub2 local11 = (Class5_Sub2) this.aClass66_10.method1812(arg0);
		if (local11 != null) {
			this.aClass49_3.method1472(local11);
		}
		return local11;
	}
}
