import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ch")
public final class Class14 {

	@OriginalMember(owner = "client!ch", name = "p", descriptor = "Lclient!od;")
	private final Class2_Sub4 aClass2_Sub4_20 = new Class2_Sub4();

	@OriginalMember(owner = "client!ch", name = "v", descriptor = "Lclient!ai;")
	private final Class4 aClass4_1 = new Class4();

	@OriginalMember(owner = "client!ch", name = "x", descriptor = "I")
	private int anInt883;

	@OriginalMember(owner = "client!ch", name = "t", descriptor = "I")
	private final int anInt882;

	@OriginalMember(owner = "client!ch", name = "u", descriptor = "Lclient!id;")
	private final Class35 aClass35_12;

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(I)V")
	public Class14(@OriginalArg(0) int arg0) {
		this.anInt883 = arg0;
		this.anInt882 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass35_12 = new Class35(local19);
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(B)V")
	public void method596() {
		while (true) {
			@Pc(10) Class2_Sub4 local10 = this.aClass4_1.method325();
			if (local10 == null) {
				this.anInt883 = this.anInt882;
				return;
			}
			local10.method2888();
			local10.method2853();
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)Lclient!te;")
	public Class2 method598() {
		return this.aClass35_12.method1361();
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(JI)V")
	public void method600(@OriginalArg(0) long arg0) {
		@Pc(18) Class2_Sub4 local18 = (Class2_Sub4) this.aClass35_12.method1354(arg0);
		if (local18 != null) {
			local18.method2888();
			local18.method2853();
			this.anInt883++;
		}
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(B)Lclient!te;")
	public Class2 method601() {
		return this.aClass35_12.method1359();
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(JI)Lclient!od;")
	public Class2_Sub4 method603(@OriginalArg(0) long arg0) {
		@Pc(10) Class2_Sub4 local10 = (Class2_Sub4) this.aClass35_12.method1354(arg0);
		if (local10 != null) {
			this.aClass4_1.method320(local10);
		}
		return local10;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZJLclient!od;)V")
	public void method607(@OriginalArg(1) long arg0, @OriginalArg(2) Class2_Sub4 arg1) {
		if (this.anInt883 == 0) {
			@Pc(19) Class2_Sub4 local19 = this.aClass4_1.method325();
			local19.method2888();
			local19.method2853();
			if (local19 == this.aClass2_Sub4_20) {
				local19 = this.aClass4_1.method325();
				local19.method2888();
				local19.method2853();
			}
		} else {
			this.anInt883--;
		}
		this.aClass35_12.method1362(arg1, arg0);
		this.aClass4_1.method320(arg1);
	}
}
