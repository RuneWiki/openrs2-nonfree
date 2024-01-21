import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class19 {

	@OriginalMember(owner = "client!dd", name = "A", descriptor = "Lclient!jb;")
	private final Class1_Sub1 aClass1_Sub1_14 = new Class1_Sub1();

	@OriginalMember(owner = "client!dd", name = "D", descriptor = "Lclient!be;")
	private final Class10 aClass10_7 = new Class10();

	@OriginalMember(owner = "client!dd", name = "F", descriptor = "I")
	private int anInt657;

	@OriginalMember(owner = "client!dd", name = "E", descriptor = "I")
	private final int anInt656;

	@OriginalMember(owner = "client!dd", name = "C", descriptor = "Lclient!pc;")
	private final Class58 aClass58_2;

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(I)V")
	public Class19(@OriginalArg(0) int arg0) {
		this.anInt657 = arg0;
		this.anInt656 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass58_2 = new Class58(local19);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILclient!jb;J)V")
	public void method409(@OriginalArg(1) Class1_Sub1 arg0, @OriginalArg(2) long arg1) {
		if (this.anInt657 == 0) {
			@Pc(19) Class1_Sub1 local19 = this.aClass10_7.method264();
			local19.method2076();
			local19.method2079();
			if (this.aClass1_Sub1_14 == local19) {
				local19 = this.aClass10_7.method264();
				local19.method2076();
				local19.method2079();
			}
		} else {
			this.anInt657--;
		}
		this.aClass58_2.method1378(arg1, arg0);
		this.aClass10_7.method265(arg0);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(BJ)Lclient!jb;")
	public Class1_Sub1 method410(@OriginalArg(1) long arg0) {
		@Pc(15) Class1_Sub1 local15 = (Class1_Sub1) this.aClass58_2.method1380(arg0);
		if (local15 != null) {
			this.aClass10_7.method265(local15);
		}
		return local15;
	}

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "(I)V")
	public void method416() {
		while (true) {
			@Pc(16) Class1_Sub1 local16 = this.aClass10_7.method264();
			if (local16 == null) {
				this.anInt657 = this.anInt656;
				return;
			}
			local16.method2076();
			local16.method2079();
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(JI)V")
	public void method419(@OriginalArg(0) long arg0) {
		@Pc(17) Class1_Sub1 local17 = (Class1_Sub1) this.aClass58_2.method1380(arg0);
		if (local17 != null) {
			local17.method2076();
			local17.method2079();
			this.anInt657++;
		}
	}
}
