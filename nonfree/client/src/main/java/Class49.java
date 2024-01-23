import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fm")
public final class Class49 {

	@OriginalMember(owner = "client!fm", name = "h", descriptor = "Lclient!w;")
	private Class1_Sub2 aClass1_Sub2_25 = new Class1_Sub2();

	@OriginalMember(owner = "client!fm", name = "l", descriptor = "Lclient!qk;")
	private Class140 aClass140_2 = new Class140();

	@OriginalMember(owner = "client!fm", name = "i", descriptor = "I")
	private int anInt1775;

	@OriginalMember(owner = "client!fm", name = "k", descriptor = "I")
	private int anInt1777;

	@OriginalMember(owner = "client!fm", name = "m", descriptor = "Lclient!ik;")
	private Class70 aClass70_4;

	@OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(I)V")
	public Class49(@OriginalArg(0) int arg0) {
		this.anInt1775 = arg0;
		this.anInt1777 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass70_4 = new Class70(local19);
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)V")
	public void method1379() {
		this.aClass140_2.method3417();
		this.aClass70_4.method2082();
		this.aClass1_Sub2_25 = new Class1_Sub2();
		this.anInt1777 = this.anInt1775;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(JI)Lclient!w;")
	public Class1_Sub2 method1381(@OriginalArg(0) long arg0) {
		@Pc(19) Class1_Sub2 local19 = (Class1_Sub2) this.aClass70_4.method2075(arg0);
		if (local19 != null) {
			this.aClass140_2.method3414(local19);
		}
		return local19;
	}

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "(I)Lclient!im;")
	public Class1 method1382() {
		return this.aClass70_4.method2079();
	}

	@OriginalMember(owner = "client!fm", name = "c", descriptor = "(I)Lclient!im;")
	public Class1 method1384() {
		return this.aClass70_4.method2074();
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(ILclient!w;J)V")
	public void method1385(@OriginalArg(1) Class1_Sub2 arg0, @OriginalArg(2) long arg1) {
		if (this.anInt1777 == 0) {
			@Pc(16) Class1_Sub2 local16 = this.aClass140_2.method3416();
			local16.method4441();
			local16.method4347();
			if (this.aClass1_Sub2_25 == local16) {
				local16 = this.aClass140_2.method3416();
				local16.method4441();
				local16.method4347();
			}
		} else {
			this.anInt1777--;
		}
		this.aClass70_4.method2084(arg1, arg0);
		this.aClass140_2.method3414(arg0);
	}
}
