import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Class7 {

	@OriginalMember(owner = "client!b", name = "e", descriptor = "Lclient!bh;")
	private final Class3_Sub1 aClass3_Sub1_7 = new Class3_Sub1();

	@OriginalMember(owner = "client!b", name = "q", descriptor = "Lclient!le;")
	private final Class50 aClass50_1 = new Class50();

	@OriginalMember(owner = "client!b", name = "v", descriptor = "I")
	private int anInt287;

	@OriginalMember(owner = "client!b", name = "t", descriptor = "I")
	private final int anInt285;

	@OriginalMember(owner = "client!b", name = "r", descriptor = "Lclient!d;")
	private final Class16 aClass16_2;

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "(I)V")
	public Class7(@OriginalArg(0) int arg0) {
		this.anInt287 = arg0;
		this.anInt285 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; arg0 > local19 + local19; local19 += local19) {
		}
		this.aClass16_2 = new Class16(local19);
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(B)Lclient!od;")
	public Class3 method182() {
		return this.aClass16_2.method552();
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(BJ)Lclient!bh;")
	public Class3_Sub1 method183(@OriginalArg(1) long arg0) {
		@Pc(10) Class3_Sub1 local10 = (Class3_Sub1) this.aClass16_2.method554(arg0);
		if (local10 != null) {
			this.aClass50_1.method1599(local10);
		}
		return local10;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!bh;IJ)V")
	public void method186(@OriginalArg(0) Class3_Sub1 arg0, @OriginalArg(2) long arg1) {
		if (this.anInt287 == 0) {
			@Pc(26) Class3_Sub1 local26 = this.aClass50_1.method1598();
			local26.method2783();
			local26.method2681();
			if (local26 == this.aClass3_Sub1_7) {
				local26 = this.aClass50_1.method1598();
				local26.method2783();
				local26.method2681();
			}
		} else {
			this.anInt287--;
		}
		this.aClass16_2.method546(arg0, arg1);
		this.aClass50_1.method1599(arg0);
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(I)Lclient!od;")
	public Class3 method187() {
		return this.aClass16_2.method551();
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IJ)V")
	public void method189(@OriginalArg(1) long arg0) {
		@Pc(8) Class3_Sub1 local8 = (Class3_Sub1) this.aClass16_2.method554(arg0);
		if (local8 != null) {
			local8.method2783();
			local8.method2681();
			this.anInt287++;
		}
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(I)V")
	public void method190() {
		while (true) {
			@Pc(12) Class3_Sub1 local12 = this.aClass50_1.method1598();
			if (local12 == null) {
				this.anInt287 = this.anInt285;
				return;
			}
			local12.method2783();
			local12.method2681();
		}
	}
}
