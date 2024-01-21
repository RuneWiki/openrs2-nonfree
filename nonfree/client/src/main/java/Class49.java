import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class49 {

	@OriginalMember(owner = "client!mb", name = "l", descriptor = "Lclient!se;")
	private final Class6_Sub3 aClass6_Sub3_41 = new Class6_Sub3();

	@OriginalMember(owner = "client!mb", name = "o", descriptor = "Lclient!qb;")
	private final Class61 aClass61_3 = new Class61();

	@OriginalMember(owner = "client!mb", name = "G", descriptor = "I")
	private final int anInt2063;

	@OriginalMember(owner = "client!mb", name = "p", descriptor = "I")
	private int anInt2058;

	@OriginalMember(owner = "client!mb", name = "t", descriptor = "Lclient!aa;")
	private final Class2 aClass2_9;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(I)V")
	public Class49(@OriginalArg(0) int arg0) {
		this.anInt2063 = arg0;
		@Pc(16) int local16 = 1;
		this.anInt2058 = arg0;
		while (arg0 > local16 + local16) {
			local16 += local16;
		}
		this.aClass2_9 = new Class2(local16);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
	public void method1389() {
		while (true) {
			@Pc(10) Class6_Sub3 local10 = this.aClass61_3.method1680();
			if (local10 == null) {
				this.anInt2058 = this.anInt2063;
				return;
			}
			local10.method2123();
			local10.method2131();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IJ)V")
	public void method1393(@OriginalArg(1) long arg0) {
		@Pc(14) Class6_Sub3 local14 = (Class6_Sub3) this.aClass2_9.method20(arg0);
		if (local14 != null) {
			local14.method2123();
			local14.method2131();
			this.anInt2058++;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(JBLclient!se;)V")
	public void method1396(@OriginalArg(0) long arg0, @OriginalArg(2) Class6_Sub3 arg1) {
		if (this.anInt2058 == 0) {
			@Pc(15) Class6_Sub3 local15 = this.aClass61_3.method1680();
			local15.method2123();
			local15.method2131();
			if (this.aClass6_Sub3_41 == local15) {
				local15 = this.aClass61_3.method1680();
				local15.method2123();
				local15.method2131();
			}
		} else {
			this.anInt2058--;
		}
		this.aClass2_9.method18(arg1, arg0);
		this.aClass61_3.method1681(arg1);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(JI)Lclient!se;")
	public Class6_Sub3 method1397(@OriginalArg(0) long arg0) {
		@Pc(10) Class6_Sub3 local10 = (Class6_Sub3) this.aClass2_9.method20(arg0);
		if (local10 != null) {
			this.aClass61_3.method1681(local10);
		}
		return local10;
	}
}
