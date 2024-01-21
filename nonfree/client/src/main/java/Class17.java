import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class17 {

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "Lclient!vf;")
	private final Class2_Sub3 aClass2_Sub3_11 = new Class2_Sub3();

	@OriginalMember(owner = "client!dd", name = "w", descriptor = "Lclient!ob;")
	private final Class60 aClass60_1 = new Class60();

	@OriginalMember(owner = "client!dd", name = "z", descriptor = "I")
	private int anInt735;

	@OriginalMember(owner = "client!dd", name = "y", descriptor = "I")
	private final int anInt734;

	@OriginalMember(owner = "client!dd", name = "x", descriptor = "Lclient!db;")
	private final Class16 aClass16_4;

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(I)V")
	public Class17(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = 1;
		this.anInt735 = arg0;
		while (arg0 > local13 + local13) {
			local13 += local13;
		}
		this.anInt734 = arg0;
		this.aClass16_4 = new Class16(local13);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IJ)Lclient!vf;")
	public Class2_Sub3 method505(@OriginalArg(1) long arg0) {
		@Pc(10) Class2_Sub3 local10 = (Class2_Sub3) this.aClass16_4.method479(arg0);
		if (local10 != null) {
			this.aClass60_1.method1869(local10);
		}
		return local10;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IJLclient!vf;)V")
	public void method508(@OriginalArg(1) long arg0, @OriginalArg(2) Class2_Sub3 arg1) {
		if (this.anInt735 == 0) {
			@Pc(28) Class2_Sub3 local28 = this.aClass60_1.method1863();
			local28.method2808();
			local28.method2725();
			if (local28 == this.aClass2_Sub3_11) {
				local28 = this.aClass60_1.method1863();
				local28.method2808();
				local28.method2725();
			}
		} else {
			this.anInt735--;
		}
		this.aClass16_4.method480(arg1, arg0);
		this.aClass60_1.method1869(arg1);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V")
	public void method509() {
		while (true) {
			@Pc(10) Class2_Sub3 local10 = this.aClass60_1.method1863();
			if (local10 == null) {
				this.anInt735 = this.anInt734;
				return;
			}
			local10.method2808();
			local10.method2725();
		}
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(B)Lclient!na;")
	public Class2 method511() {
		return this.aClass16_4.method478();
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(JI)V")
	public void method512(@OriginalArg(0) long arg0) {
		@Pc(13) Class2_Sub3 local13 = (Class2_Sub3) this.aClass16_4.method479(arg0);
		if (local13 != null) {
			local13.method2808();
			local13.method2725();
			this.anInt735++;
		}
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)Lclient!na;")
	public Class2 method515() {
		return this.aClass16_4.method481();
	}
}
