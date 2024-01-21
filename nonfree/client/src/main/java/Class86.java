import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ri")
public final class Class86 {

	@OriginalMember(owner = "client!ri", name = "j", descriptor = "Lclient!t;")
	private final Class1_Sub2 aClass1_Sub2_52 = new Class1_Sub2();

	@OriginalMember(owner = "client!ri", name = "o", descriptor = "Lclient!lc;")
	private final Class58 aClass58_2 = new Class58();

	@OriginalMember(owner = "client!ri", name = "k", descriptor = "I")
	private final int anInt3675;

	@OriginalMember(owner = "client!ri", name = "r", descriptor = "I")
	private int anInt3679;

	@OriginalMember(owner = "client!ri", name = "m", descriptor = "Lclient!l;")
	private final Class57 aClass57_37;

	@OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(I)V")
	public Class86(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = 1;
		this.anInt3675 = arg0;
		while (local13 + local13 < arg0) {
			local13 += local13;
		}
		this.anInt3679 = arg0;
		this.aClass57_37 = new Class57(local13);
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(JI)Lclient!t;")
	public Class1_Sub2 method2816(@OriginalArg(0) long arg0) {
		@Pc(10) Class1_Sub2 local10 = (Class1_Sub2) this.aClass57_37.method1872(arg0);
		if (local10 != null) {
			this.aClass58_2.method1913(local10);
		}
		return local10;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)V")
	public void method2817() {
		while (true) {
			@Pc(4) Class1_Sub2 local4 = this.aClass58_2.method1918();
			if (local4 == null) {
				this.anInt3679 = this.anInt3675;
				return;
			}
			local4.method3563();
			local4.method3549();
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IJ)V")
	public void method2818(@OriginalArg(1) long arg0) {
		@Pc(10) Class1_Sub2 local10 = (Class1_Sub2) this.aClass57_37.method1872(arg0);
		if (local10 != null) {
			local10.method3563();
			local10.method3549();
			this.anInt3679++;
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Z)Lclient!rb;")
	public Class1 method2820() {
		return this.aClass57_37.method1876();
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(BLclient!t;J)V")
	public void method2821(@OriginalArg(1) Class1_Sub2 arg0, @OriginalArg(2) long arg1) {
		if (this.anInt3679 == 0) {
			@Pc(11) Class1_Sub2 local11 = this.aClass58_2.method1918();
			local11.method3563();
			local11.method3549();
			if (local11 == this.aClass1_Sub2_52) {
				local11 = this.aClass58_2.method1918();
				local11.method3563();
				local11.method3549();
			}
		} else {
			this.anInt3679--;
		}
		this.aClass57_37.method1874(arg0, arg1);
		this.aClass58_2.method1913(arg0);
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(B)Lclient!rb;")
	public Class1 method2822() {
		return this.aClass57_37.method1873();
	}
}
