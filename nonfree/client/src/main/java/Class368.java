import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vv")
public final class Class368 {

	@OriginalMember(owner = "client!vv", name = "f", descriptor = "Lclient!dg;")
	private Class5_Sub4 aClass5_Sub4_65 = new Class5_Sub4();

	@OriginalMember(owner = "client!vv", name = "i", descriptor = "Lclient!dr;")
	private final Class80 aClass80_13 = new Class80();

	@OriginalMember(owner = "client!vv", name = "h", descriptor = "I")
	private int anInt10043;

	@OriginalMember(owner = "client!vv", name = "j", descriptor = "I")
	private final int anInt10044;

	@OriginalMember(owner = "client!vv", name = "g", descriptor = "Lclient!du;")
	private final Class81 aClass81_74;

	@OriginalMember(owner = "client!vv", name = "<init>", descriptor = "(I)V")
	public Class368(@OriginalArg(0) int arg0) {
		this.anInt10043 = arg0;
		this.anInt10044 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; arg0 > local19 + local19; local19 += local19) {
		}
		this.aClass81_74 = new Class81(local19);
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(JBLclient!dg;)V")
	public void method8527(@OriginalArg(0) long arg0, @OriginalArg(2) Class5_Sub4 arg1) {
		if (this.anInt10043 == 0) {
			@Pc(10) Class5_Sub4 local10 = this.aClass80_13.method1543();
			local10.method8911();
			local10.method8741();
			if (local10 == this.aClass5_Sub4_65) {
				local10 = this.aClass80_13.method1543();
				local10.method8911();
				local10.method8741();
			}
		} else {
			this.anInt10043--;
		}
		this.aClass81_74.method1607(arg1, arg0);
		this.aClass80_13.method1537(arg1);
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(JI)Lclient!dg;")
	public Class5_Sub4 method8528(@OriginalArg(0) long arg0) {
		@Pc(10) Class5_Sub4 local10 = (Class5_Sub4) this.aClass81_74.method1599(arg0);
		if (local10 != null) {
			this.aClass80_13.method1537(local10);
		}
		return local10;
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(Z)V")
	public void method8529() {
		this.aClass80_13.method1542();
		this.aClass81_74.method1602();
		this.aClass5_Sub4_65 = new Class5_Sub4();
		this.anInt10043 = this.anInt10044;
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(JZ)V")
	public void method8530(@OriginalArg(0) long arg0) {
		@Pc(17) Class5_Sub4 local17 = (Class5_Sub4) this.aClass81_74.method1599(arg0);
		if (local17 != null) {
			local17.method8911();
			local17.method8741();
			this.anInt10043++;
		}
	}
}
