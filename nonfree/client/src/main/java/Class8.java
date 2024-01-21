import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class8 {

	@OriginalMember(owner = "client!bb", name = "i", descriptor = "Lclient!h;")
	private final Class3_Sub1 aClass3_Sub1_9 = new Class3_Sub1();

	@OriginalMember(owner = "client!bb", name = "s", descriptor = "Lclient!oc;")
	private final Class56 aClass56_1 = new Class56();

	@OriginalMember(owner = "client!bb", name = "v", descriptor = "I")
	private int anInt319;

	@OriginalMember(owner = "client!bb", name = "t", descriptor = "I")
	private final int anInt318;

	@OriginalMember(owner = "client!bb", name = "x", descriptor = "Lclient!hd;")
	private final Class34 aClass34_1;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(I)V")
	public Class8(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = 1;
		this.anInt319 = arg0;
		while (local13 + local13 < arg0) {
			local13 += local13;
		}
		this.anInt318 = arg0;
		this.aClass34_1 = new Class34(local13);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IJ)Lclient!h;")
	public Class3_Sub1 method195(@OriginalArg(1) long arg0) {
		@Pc(15) Class3_Sub1 local15 = (Class3_Sub1) this.aClass34_1.method797(arg0);
		if (local15 != null) {
			this.aClass56_1.method1193(local15);
		}
		return local15;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(BJ)V")
	public void method197(@OriginalArg(1) long arg0) {
		@Pc(18) Class3_Sub1 local18 = (Class3_Sub1) this.aClass34_1.method797(arg0);
		if (local18 != null) {
			local18.method1930();
			local18.method1909();
			this.anInt319++;
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)V")
	public void method198() {
		while (true) {
			@Pc(14) Class3_Sub1 local14 = this.aClass56_1.method1191();
			if (local14 == null) {
				this.anInt319 = this.anInt318;
				return;
			}
			local14.method1930();
			local14.method1909();
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(JLclient!h;I)V")
	public void method199(@OriginalArg(0) long arg0, @OriginalArg(1) Class3_Sub1 arg1) {
		if (this.anInt319 == 0) {
			@Pc(15) Class3_Sub1 local15 = this.aClass56_1.method1191();
			local15.method1930();
			local15.method1909();
			if (this.aClass3_Sub1_9 == local15) {
				local15 = this.aClass56_1.method1191();
				local15.method1930();
				local15.method1909();
			}
		} else {
			this.anInt319--;
		}
		this.aClass34_1.method792(arg0, arg1);
		this.aClass56_1.method1193(arg1);
	}
}
