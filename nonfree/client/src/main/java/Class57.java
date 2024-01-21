import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public final class Class57 {

	@OriginalMember(owner = "client!nb", name = "h", descriptor = "Lclient!ba;")
	private final Class3_Sub2 aClass3_Sub2_38 = new Class3_Sub2();

	@OriginalMember(owner = "client!nb", name = "u", descriptor = "Lclient!bc;")
	private final Class7 aClass7_2 = new Class7();

	@OriginalMember(owner = "client!nb", name = "t", descriptor = "I")
	private int anInt2508;

	@OriginalMember(owner = "client!nb", name = "r", descriptor = "I")
	private final int anInt2507;

	@OriginalMember(owner = "client!nb", name = "q", descriptor = "Lclient!md;")
	private final Class54 aClass54_6;

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(I)V")
	public Class57(@OriginalArg(0) int arg0) {
		this.anInt2508 = arg0;
		this.anInt2507 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass54_6 = new Class54(local19);
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)V")
	public void method1715() {
		while (true) {
			@Pc(8) Class3_Sub2 local8 = this.aClass7_2.method301();
			if (local8 == null) {
				this.anInt2508 = this.anInt2507;
				return;
			}
			local8.method2900();
			local8.method2886();
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZLclient!ba;J)V")
	public void method1717(@OriginalArg(1) Class3_Sub2 arg0, @OriginalArg(2) long arg1) {
		if (this.anInt2508 == 0) {
			@Pc(16) Class3_Sub2 local16 = this.aClass7_2.method301();
			local16.method2900();
			local16.method2886();
			if (local16 == this.aClass3_Sub2_38) {
				local16 = this.aClass7_2.method301();
				local16.method2900();
				local16.method2886();
			}
		} else {
			this.anInt2508--;
		}
		this.aClass54_6.method1603(arg1, arg0);
		this.aClass7_2.method300(arg0);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(JB)Lclient!ba;")
	public Class3_Sub2 method1719(@OriginalArg(0) long arg0) {
		@Pc(10) Class3_Sub2 local10 = (Class3_Sub2) this.aClass54_6.method1602(arg0);
		if (local10 != null) {
			this.aClass7_2.method300(local10);
		}
		return local10;
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(B)Lclient!ee;")
	public Class3 method1720() {
		return this.aClass54_6.method1598();
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(BJ)V")
	public void method1721(@OriginalArg(1) long arg0) {
		@Pc(11) Class3_Sub2 local11 = (Class3_Sub2) this.aClass54_6.method1602(arg0);
		if (local11 != null) {
			local11.method2900();
			local11.method2886();
			this.anInt2508++;
		}
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "(B)Lclient!ee;")
	public Class3 method1722() {
		return this.aClass54_6.method1609();
	}
}
