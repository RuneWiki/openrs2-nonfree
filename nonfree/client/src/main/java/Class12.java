import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public final class Class12 {

	@OriginalMember(owner = "client!c", name = "c", descriptor = "Lclient!df;")
	private final Class4_Sub2 aClass4_Sub2_10 = new Class4_Sub2();

	@OriginalMember(owner = "client!c", name = "u", descriptor = "Lclient!ba;")
	private final Class7 aClass7_1 = new Class7();

	@OriginalMember(owner = "client!c", name = "v", descriptor = "I")
	private int anInt358;

	@OriginalMember(owner = "client!c", name = "t", descriptor = "I")
	private final int anInt357;

	@OriginalMember(owner = "client!c", name = "s", descriptor = "Lclient!jf;")
	private final Class42 aClass42_2;

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "(I)V")
	public Class12(@OriginalArg(0) int arg0) {
		this.anInt358 = arg0;
		this.anInt357 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; arg0 > local19 + local19; local19 += local19) {
		}
		this.aClass42_2 = new Class42(local19);
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(JI)V")
	public void method229(@OriginalArg(0) long arg0) {
		@Pc(10) Class4_Sub2 local10 = (Class4_Sub2) this.aClass42_2.method1055(arg0);
		if (local10 != null) {
			local10.method2189();
			local10.method2201();
			this.anInt358++;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(B)V")
	public void method233() {
		while (true) {
			@Pc(11) Class4_Sub2 local11 = this.aClass7_1.method180();
			if (local11 == null) {
				this.anInt358 = this.anInt357;
				return;
			}
			local11.method2189();
			local11.method2201();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(BLclient!df;J)V")
	public void method234(@OriginalArg(1) Class4_Sub2 arg0, @OriginalArg(2) long arg1) {
		if (this.anInt358 == 0) {
			@Pc(7) Class4_Sub2 local7 = this.aClass7_1.method180();
			local7.method2189();
			local7.method2201();
			if (this.aClass4_Sub2_10 == local7) {
				local7 = this.aClass7_1.method180();
				local7.method2189();
				local7.method2201();
			}
		} else {
			this.anInt358--;
		}
		this.aClass42_2.method1056(arg0, arg1);
		this.aClass7_1.method181(arg0);
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(JI)Lclient!df;")
	public Class4_Sub2 method235(@OriginalArg(0) long arg0) {
		@Pc(10) Class4_Sub2 local10 = (Class4_Sub2) this.aClass42_2.method1055(arg0);
		if (local10 != null) {
			this.aClass7_1.method181(local10);
		}
		return local10;
	}
}
