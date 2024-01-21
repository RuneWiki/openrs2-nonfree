import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class54 {

	@OriginalMember(owner = "client!qd", name = "g", descriptor = "Lclient!qb;")
	private final Class2_Sub1 aClass2_Sub1_46 = new Class2_Sub1();

	@OriginalMember(owner = "client!qd", name = "z", descriptor = "Lclient!hd;")
	private final Class28 aClass28_1 = new Class28();

	@OriginalMember(owner = "client!qd", name = "A", descriptor = "I")
	private int anInt2313;

	@OriginalMember(owner = "client!qd", name = "u", descriptor = "I")
	private final int anInt2311;

	@OriginalMember(owner = "client!qd", name = "r", descriptor = "Lclient!rc;")
	private final Class57 aClass57_4;

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(I)V")
	public Class54(@OriginalArg(0) int arg0) {
		this.anInt2313 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; arg0 > local16 + local16; local16 += local16) {
		}
		this.anInt2311 = arg0;
		this.aClass57_4 = new Class57(local16);
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(JI)V")
	public void method1633(@OriginalArg(0) long arg0) {
		@Pc(15) Class2_Sub1 local15 = (Class2_Sub1) this.aClass57_4.method1678(arg0);
		if (local15 != null) {
			local15.method2045();
			local15.method2053();
			this.anInt2313++;
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(BJ)Lclient!qb;")
	public Class2_Sub1 method1634(@OriginalArg(1) long arg0) {
		@Pc(15) Class2_Sub1 local15 = (Class2_Sub1) this.aClass57_4.method1678(arg0);
		if (local15 != null) {
			this.aClass28_1.method824(local15);
		}
		return local15;
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V")
	public void method1635() {
		while (true) {
			@Pc(8) Class2_Sub1 local8 = this.aClass28_1.method823();
			if (local8 == null) {
				this.anInt2313 = this.anInt2311;
				return;
			}
			local8.method2045();
			local8.method2053();
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(JLclient!qb;Z)V")
	public void method1637(@OriginalArg(0) long arg0, @OriginalArg(1) Class2_Sub1 arg1) {
		if (this.anInt2313 == 0) {
			@Pc(14) Class2_Sub1 local14 = this.aClass28_1.method823();
			local14.method2045();
			local14.method2053();
			if (this.aClass2_Sub1_46 == local14) {
				local14 = this.aClass28_1.method823();
				local14.method2045();
				local14.method2053();
			}
		} else {
			this.anInt2313--;
		}
		this.aClass57_4.method1671(arg0, arg1);
		this.aClass28_1.method824(arg1);
	}
}
