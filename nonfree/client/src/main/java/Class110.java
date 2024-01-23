import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class110 {

	@OriginalMember(owner = "client!wc", name = "i", descriptor = "Lclient!md;")
	private Class2_Sub3 aClass2_Sub3_68 = new Class2_Sub3();

	@OriginalMember(owner = "client!wc", name = "q", descriptor = "Lclient!ug;")
	private Class102 aClass102_36 = new Class102();

	@OriginalMember(owner = "client!wc", name = "p", descriptor = "I")
	private int anInt4806;

	@OriginalMember(owner = "client!wc", name = "n", descriptor = "I")
	private int anInt4805;

	@OriginalMember(owner = "client!wc", name = "o", descriptor = "Lclient!ui;")
	private Class103 aClass103_22;

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(I)V")
	public Class110(@OriginalArg(0) int arg0) {
		this.anInt4806 = arg0;
		this.anInt4805 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; arg0 > local19 + local19; local19 += local19) {
		}
		this.aClass103_22 = new Class103(local19);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(JI)V")
	public void method3886(@OriginalArg(0) long arg0) {
		@Pc(6) Class2_Sub3 local6 = (Class2_Sub3) this.aClass103_22.method3659(arg0);
		if (local6 != null) {
			local6.method3986();
			local6.method3918();
			this.anInt4806++;
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)Lclient!lf;")
	public Class2 method3887() {
		return this.aClass103_22.method3668();
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z)Lclient!lf;")
	public Class2 method3888() {
		return this.aClass103_22.method3666();
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(B)V")
	public void method3889() {
		this.aClass102_36.method3622();
		this.aClass103_22.method3662();
		this.aClass2_Sub3_68 = new Class2_Sub3();
		this.anInt4806 = this.anInt4805;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IJ)Lclient!md;")
	public Class2_Sub3 method3891(@OriginalArg(1) long arg0) {
		@Pc(15) Class2_Sub3 local15 = (Class2_Sub3) this.aClass103_22.method3659(arg0);
		if (local15 != null) {
			this.aClass102_36.method3629(local15);
		}
		return local15;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(BLclient!md;J)V")
	public void method3894(@OriginalArg(1) Class2_Sub3 arg0, @OriginalArg(2) long arg1) {
		if (this.anInt4806 == 0) {
			@Pc(21) Class2_Sub3 local21 = this.aClass102_36.method3625();
			local21.method3986();
			local21.method3918();
			if (local21 == this.aClass2_Sub3_68) {
				local21 = this.aClass102_36.method3625();
				local21.method3986();
				local21.method3918();
			}
		} else {
			this.anInt4806--;
		}
		this.aClass103_22.method3665(arg1, arg0);
		this.aClass102_36.method3629(arg0);
	}
}
