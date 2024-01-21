import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public final class Class21 {

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "Lclient!ad;")
	private final Class3_Sub3 aClass3_Sub3_16 = new Class3_Sub3();

	@OriginalMember(owner = "client!fc", name = "k", descriptor = "Lclient!ce;")
	private final Class11 aClass11_1 = new Class11();

	@OriginalMember(owner = "client!fc", name = "w", descriptor = "I")
	private int anInt804;

	@OriginalMember(owner = "client!fc", name = "l", descriptor = "I")
	private final int anInt798;

	@OriginalMember(owner = "client!fc", name = "n", descriptor = "Lclient!db;")
	private final Class14 aClass14_2;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(I)V")
	public Class21(@OriginalArg(0) int arg0) {
		this.anInt804 = arg0;
		this.anInt798 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass14_2 = new Class14(local19);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(JI)Lclient!ad;")
	public Class3_Sub3 method658(@OriginalArg(0) long arg0) {
		@Pc(10) Class3_Sub3 local10 = (Class3_Sub3) this.aClass14_2.method317(arg0);
		if (local10 != null) {
			this.aClass11_1.method253(local10);
		}
		return local10;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!ad;IJ)V")
	public void method660(@OriginalArg(0) Class3_Sub3 arg0, @OriginalArg(2) long arg1) {
		if (this.anInt804 == 0) {
			@Pc(20) Class3_Sub3 local20 = this.aClass11_1.method254();
			local20.method1883();
			local20.method1892();
			if (local20 == this.aClass3_Sub3_16) {
				local20 = this.aClass11_1.method254();
				local20.method1883();
				local20.method1892();
			}
		} else {
			this.anInt804--;
		}
		this.aClass14_2.method321(arg1, arg0);
		this.aClass11_1.method253(arg0);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IJ)V")
	public void method661(@OriginalArg(1) long arg0) {
		@Pc(15) Class3_Sub3 local15 = (Class3_Sub3) this.aClass14_2.method317(arg0);
		if (local15 != null) {
			local15.method1883();
			local15.method1892();
			this.anInt804++;
		}
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(B)V")
	public void method663() {
		while (true) {
			@Pc(10) Class3_Sub3 local10 = this.aClass11_1.method254();
			if (local10 == null) {
				this.anInt804 = this.anInt798;
				return;
			}
			local10.method1883();
			local10.method1892();
		}
	}
}
