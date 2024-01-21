import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class66 {

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "Lclient!bd;")
	private final Class1_Sub1 aClass1_Sub1_61 = new Class1_Sub1();

	@OriginalMember(owner = "client!rc", name = "s", descriptor = "Lclient!u;")
	private final Class77 aClass77_2 = new Class77();

	@OriginalMember(owner = "client!rc", name = "t", descriptor = "I")
	private int anInt3828;

	@OriginalMember(owner = "client!rc", name = "v", descriptor = "I")
	private final int anInt3830;

	@OriginalMember(owner = "client!rc", name = "r", descriptor = "Lclient!da;")
	private final Class14 aClass14_11;

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(I)V")
	public Class66(@OriginalArg(0) int arg0) {
		this.anInt3828 = arg0;
		this.anInt3830 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass14_11 = new Class14(local19);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)Lclient!kh;")
	public Class1 method2595() {
		return this.aClass14_11.method571();
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(JILclient!bd;)V")
	public void method2597(@OriginalArg(0) long arg0, @OriginalArg(2) Class1_Sub1 arg1) {
		if (this.anInt3828 == 0) {
			@Pc(18) Class1_Sub1 local18 = this.aClass77_2.method2927();
			local18.method3198();
			local18.method3147();
			if (local18 == this.aClass1_Sub1_61) {
				local18 = this.aClass77_2.method2927();
				local18.method3198();
				local18.method3147();
			}
		} else {
			this.anInt3828--;
		}
		this.aClass14_11.method570(arg1, arg0);
		this.aClass77_2.method2931(arg1);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Z)Lclient!kh;")
	public Class1 method2598() {
		return this.aClass14_11.method563();
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(BJ)Lclient!bd;")
	public Class1_Sub1 method2599(@OriginalArg(1) long arg0) {
		@Pc(10) Class1_Sub1 local10 = (Class1_Sub1) this.aClass14_11.method569(arg0);
		if (local10 != null) {
			this.aClass77_2.method2931(local10);
		}
		return local10;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(JB)V")
	public void method2602(@OriginalArg(0) long arg0) {
		@Pc(15) Class1_Sub1 local15 = (Class1_Sub1) this.aClass14_11.method569(arg0);
		if (local15 != null) {
			local15.method3198();
			local15.method3147();
			this.anInt3828++;
		}
	}

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(I)V")
	public void method2604() {
		while (true) {
			@Pc(10) Class1_Sub1 local10 = this.aClass77_2.method2927();
			if (local10 == null) {
				this.anInt3828 = this.anInt3830;
				return;
			}
			local10.method3198();
			local10.method3147();
		}
	}
}
