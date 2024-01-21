import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class5 {

	@OriginalMember(owner = "client!af", name = "k", descriptor = "Lclient!ci;")
	private final Class3_Sub1 aClass3_Sub1_5 = new Class3_Sub1();

	@OriginalMember(owner = "client!af", name = "s", descriptor = "Lclient!m;")
	private final Class58 aClass58_1 = new Class58();

	@OriginalMember(owner = "client!af", name = "p", descriptor = "I")
	private final int anInt209;

	@OriginalMember(owner = "client!af", name = "q", descriptor = "I")
	private int anInt210;

	@OriginalMember(owner = "client!af", name = "r", descriptor = "Lclient!lc;")
	private final Class54 aClass54_1;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(I)V")
	public Class5(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = 1;
		this.anInt209 = arg0;
		while (arg0 > local13 + local13) {
			local13 += local13;
		}
		this.anInt210 = arg0;
		this.aClass54_1 = new Class54(local13);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(JI)Lclient!ci;")
	public Class3_Sub1 method139(@OriginalArg(0) long arg0) {
		@Pc(14) Class3_Sub1 local14 = (Class3_Sub1) this.aClass54_1.method1496(arg0);
		if (local14 != null) {
			this.aClass58_1.method1571(local14);
		}
		return local14;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(B)Lclient!n;")
	public Class3 method140() {
		return this.aClass54_1.method1497();
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(JI)V")
	public void method143(@OriginalArg(0) long arg0) {
		@Pc(16) Class3_Sub1 local16 = (Class3_Sub1) this.aClass54_1.method1496(arg0);
		if (local16 != null) {
			local16.method3159();
			local16.method3150();
			this.anInt210++;
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Z)Lclient!n;")
	public Class3 method144() {
		return this.aClass54_1.method1503();
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ILclient!ci;J)V")
	public void method145(@OriginalArg(1) Class3_Sub1 arg0, @OriginalArg(2) long arg1) {
		if (this.anInt210 == 0) {
			@Pc(14) Class3_Sub1 local14 = this.aClass58_1.method1570();
			local14.method3159();
			local14.method3150();
			if (local14 == this.aClass3_Sub1_5) {
				local14 = this.aClass58_1.method1570();
				local14.method3159();
				local14.method3150();
			}
		} else {
			this.anInt210--;
		}
		this.aClass54_1.method1494(arg1, arg0);
		this.aClass58_1.method1571(arg0);
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(I)V")
	public void method146() {
		while (true) {
			@Pc(12) Class3_Sub1 local12 = this.aClass58_1.method1570();
			if (local12 == null) {
				this.anInt210 = this.anInt209;
				return;
			}
			local12.method3159();
			local12.method3150();
		}
	}
}
