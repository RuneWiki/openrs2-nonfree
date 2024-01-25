import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public final class Class378 {

	@OriginalMember(owner = "client!vd", name = "h", descriptor = "Lclient!no;")
	private Class2_Sub6 aClass2_Sub6_65 = new Class2_Sub6();

	@OriginalMember(owner = "client!vd", name = "m", descriptor = "Lclient!vl;")
	private final Class388 aClass388_13 = new Class388();

	@OriginalMember(owner = "client!vd", name = "g", descriptor = "I")
	private final int anInt10402;

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "I")
	private int anInt10401;

	@OriginalMember(owner = "client!vd", name = "n", descriptor = "Lclient!lba;")
	private final Class218 aClass218_42;

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(I)V")
	public Class378(@OriginalArg(0) int arg0) {
		this.anInt10402 = arg0;
		this.anInt10401 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass218_42 = new Class218(local19);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(JZ)V")
	public void method9114(@OriginalArg(0) long arg0) {
		@Pc(15) Class2_Sub6 local15 = (Class2_Sub6) this.aClass218_42.method5095(arg0, 0);
		if (local15 != null) {
			local15.method9872();
			local15.method8698();
			this.anInt10401++;
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V")
	public void method9115() {
		this.aClass388_13.method9211();
		this.aClass218_42.method5097();
		this.aClass2_Sub6_65 = new Class2_Sub6();
		this.anInt10401 = this.anInt10402;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(JLclient!no;Z)V")
	public void method9117(@OriginalArg(0) long arg0, @OriginalArg(1) Class2_Sub6 arg1) {
		if (this.anInt10401 == 0) {
			@Pc(20) Class2_Sub6 local20 = this.aClass388_13.method9216();
			local20.method9872();
			local20.method8698();
			if (local20 == this.aClass2_Sub6_65) {
				local20 = this.aClass388_13.method9216();
				local20.method9872();
				local20.method8698();
			}
		} else {
			this.anInt10401--;
		}
		this.aClass218_42.method5099(arg1, arg0);
		this.aClass388_13.method9215(arg1);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IJ)Lclient!no;")
	public Class2_Sub6 method9118(@OriginalArg(1) long arg0) {
		@Pc(20) Class2_Sub6 local20 = (Class2_Sub6) this.aClass218_42.method5095(arg0, 0);
		if (local20 != null) {
			this.aClass388_13.method9215(local20);
		}
		return local20;
	}
}
