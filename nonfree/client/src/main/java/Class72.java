import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public final class Class72 {

	@OriginalMember(owner = "client!sa", name = "l", descriptor = "Lclient!mf;")
	private final Class2_Sub1 aClass2_Sub1_64 = new Class2_Sub1();

	@OriginalMember(owner = "client!sa", name = "r", descriptor = "Lclient!g;")
	private final Class28 aClass28_2 = new Class28();

	@OriginalMember(owner = "client!sa", name = "s", descriptor = "I")
	private int anInt3183;

	@OriginalMember(owner = "client!sa", name = "t", descriptor = "I")
	private final int anInt3184;

	@OriginalMember(owner = "client!sa", name = "u", descriptor = "Lclient!dh;")
	private final Class18 aClass18_9;

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(I)V")
	public Class72(@OriginalArg(0) int arg0) {
		@Pc(13) int local13;
		for (local13 = 1; local13 + local13 < arg0; local13 += local13) {
		}
		this.anInt3183 = arg0;
		this.anInt3184 = arg0;
		this.aClass18_9 = new Class18(local13);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!mf;JI)V")
	public void method2254(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) long arg1) {
		if (this.anInt3183 == 0) {
			@Pc(23) Class2_Sub1 local23 = this.aClass28_2.method948();
			local23.method2705();
			local23.method2540();
			if (local23 == this.aClass2_Sub1_64) {
				local23 = this.aClass28_2.method948();
				local23.method2705();
				local23.method2540();
			}
		} else {
			this.anInt3183--;
		}
		this.aClass18_9.method685(arg1, arg0);
		this.aClass28_2.method951(arg0);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)Lclient!se;")
	public Class2 method2258() {
		return this.aClass18_9.method687();
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IJ)Lclient!mf;")
	public Class2_Sub1 method2259(@OriginalArg(1) long arg0) {
		@Pc(14) Class2_Sub1 local14 = (Class2_Sub1) this.aClass18_9.method683(arg0);
		if (local14 != null) {
			this.aClass28_2.method951(local14);
		}
		return local14;
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(IJ)V")
	public void method2260(@OriginalArg(1) long arg0) {
		@Pc(10) Class2_Sub1 local10 = (Class2_Sub1) this.aClass18_9.method683(arg0);
		if (local10 != null) {
			local10.method2705();
			local10.method2540();
			this.anInt3183++;
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Z)V")
	public void method2261() {
		while (true) {
			@Pc(10) Class2_Sub1 local10 = this.aClass28_2.method948();
			if (local10 == null) {
				this.anInt3183 = this.anInt3184;
				return;
			}
			local10.method2705();
			local10.method2540();
		}
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(B)Lclient!se;")
	public Class2 method2262() {
		return this.aClass18_9.method682();
	}
}
