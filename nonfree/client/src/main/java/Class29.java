import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class Class29 {

	@OriginalMember(owner = "client!i", name = "A", descriptor = "Lclient!v;")
	private final Class10_Sub1 aClass10_Sub1_23 = new Class10_Sub1();

	@OriginalMember(owner = "client!i", name = "F", descriptor = "Lclient!mc;")
	private final Class40 aClass40_1 = new Class40();

	@OriginalMember(owner = "client!i", name = "G", descriptor = "I")
	private int anInt1097;

	@OriginalMember(owner = "client!i", name = "E", descriptor = "I")
	private final int anInt1096;

	@OriginalMember(owner = "client!i", name = "H", descriptor = "Lclient!qa;")
	private final Class50 aClass50_5;

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(I)V")
	public Class29(@OriginalArg(0) int arg0) {
		this.anInt1097 = arg0;
		this.anInt1096 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass50_5 = new Class50(local19);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IJ)V")
	public void method640(@OriginalArg(1) long arg0) {
		@Pc(10) Class10_Sub1 local10 = (Class10_Sub1) this.aClass50_5.method1250(arg0);
		if (local10 != null) {
			local10.method1654();
			local10.method1655();
			this.anInt1097++;
		}
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(IJ)Lclient!v;")
	public Class10_Sub1 method644(@OriginalArg(1) long arg0) {
		@Pc(6) Class10_Sub1 local6 = (Class10_Sub1) this.aClass50_5.method1250(arg0);
		if (local6 != null) {
			this.aClass40_1.method900(local6);
		}
		return local6;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Z)V")
	public void method646() {
		while (true) {
			@Pc(10) Class10_Sub1 local10 = this.aClass40_1.method901();
			if (local10 == null) {
				this.anInt1097 = this.anInt1096;
				return;
			}
			local10.method1654();
			local10.method1655();
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(BLclient!v;J)V")
	public void method649(@OriginalArg(1) Class10_Sub1 arg0, @OriginalArg(2) long arg1) {
		if (this.anInt1097 == 0) {
			@Pc(17) Class10_Sub1 local17 = this.aClass40_1.method901();
			local17.method1654();
			local17.method1655();
			if (local17 == this.aClass10_Sub1_23) {
				local17 = this.aClass40_1.method901();
				local17.method1654();
				local17.method1655();
			}
		} else {
			this.anInt1097--;
		}
		this.aClass50_5.method1252(arg0, arg1);
		this.aClass40_1.method900(arg0);
	}
}
