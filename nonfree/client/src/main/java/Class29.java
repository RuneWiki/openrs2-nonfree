import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public final class Class29 {

	@OriginalMember(owner = "client!ge", name = "h", descriptor = "Lclient!rf;")
	private final Class5_Sub2 aClass5_Sub2_25 = new Class5_Sub2();

	@OriginalMember(owner = "client!ge", name = "x", descriptor = "Lclient!wf;")
	private final Class83 aClass83_1 = new Class83();

	@OriginalMember(owner = "client!ge", name = "y", descriptor = "I")
	private final int anInt1122;

	@OriginalMember(owner = "client!ge", name = "v", descriptor = "I")
	private int anInt1120;

	@OriginalMember(owner = "client!ge", name = "u", descriptor = "Lclient!ef;")
	private final Class20 aClass20_5;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(I)V")
	public Class29(@OriginalArg(0) int arg0) {
		this.anInt1122 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; local16 + local16 < arg0; local16 += local16) {
		}
		this.anInt1120 = arg0;
		this.aClass20_5 = new Class20(local16);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(BJ)V")
	public void method761(@OriginalArg(1) long arg0) {
		@Pc(14) Class5_Sub2 local14 = (Class5_Sub2) this.aClass20_5.method656(arg0);
		if (local14 != null) {
			local14.method2189();
			local14.method2172();
			this.anInt1120++;
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!rf;JZ)V")
	public void method762(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) long arg1) {
		if (this.anInt1120 == 0) {
			@Pc(7) Class5_Sub2 local7 = this.aClass83_1.method2199();
			local7.method2189();
			local7.method2172();
			if (local7 == this.aClass5_Sub2_25) {
				local7 = this.aClass83_1.method2199();
				local7.method2189();
				local7.method2172();
			}
		} else {
			this.anInt1120--;
		}
		this.aClass20_5.method647(arg0, arg1);
		this.aClass83_1.method2202(arg0);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V")
	public void method765() {
		while (true) {
			@Pc(8) Class5_Sub2 local8 = this.aClass83_1.method2199();
			if (local8 == null) {
				this.anInt1120 = this.anInt1122;
				return;
			}
			local8.method2189();
			local8.method2172();
		}
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(BJ)Lclient!rf;")
	public Class5_Sub2 method766(@OriginalArg(1) long arg0) {
		@Pc(18) Class5_Sub2 local18 = (Class5_Sub2) this.aClass20_5.method656(arg0);
		if (local18 != null) {
			this.aClass83_1.method2202(local18);
		}
		return local18;
	}
}
