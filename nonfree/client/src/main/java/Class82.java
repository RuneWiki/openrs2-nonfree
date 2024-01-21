import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class82 {

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "Lclient!qe;")
	private final Class2_Sub2 aClass2_Sub2_59 = new Class2_Sub2();

	@OriginalMember(owner = "client!ua", name = "r", descriptor = "Lclient!uh;")
	private final Class85 aClass85_1 = new Class85();

	@OriginalMember(owner = "client!ua", name = "p", descriptor = "I")
	private final int anInt3927;

	@OriginalMember(owner = "client!ua", name = "q", descriptor = "I")
	private int anInt3928;

	@OriginalMember(owner = "client!ua", name = "s", descriptor = "Lclient!sa;")
	private final Class74 aClass74_10;

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(I)V")
	public Class82(@OriginalArg(0) int arg0) {
		this.anInt3927 = arg0;
		this.anInt3928 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; arg0 > local19 + local19; local19 += local19) {
		}
		this.aClass74_10 = new Class74(local19);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(JI)V")
	public void method2697(@OriginalArg(0) long arg0) {
		@Pc(14) Class2_Sub2 local14 = (Class2_Sub2) this.aClass74_10.method2433(arg0);
		if (local14 != null) {
			local14.method3004();
			local14.method2900();
			this.anInt3928++;
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)V")
	public void method2698() {
		while (true) {
			@Pc(10) Class2_Sub2 local10 = this.aClass85_1.method2757();
			if (local10 == null) {
				this.anInt3928 = this.anInt3927;
				return;
			}
			local10.method3004();
			local10.method2900();
		}
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(JI)Lclient!qe;")
	public Class2_Sub2 method2699(@OriginalArg(0) long arg0) {
		@Pc(11) Class2_Sub2 local11 = (Class2_Sub2) this.aClass74_10.method2433(arg0);
		if (local11 != null) {
			this.aClass85_1.method2758(local11);
		}
		return local11;
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)Lclient!ub;")
	public Class2 method2700() {
		return this.aClass74_10.method2430();
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(JILclient!qe;)V")
	public void method2701(@OriginalArg(0) long arg0, @OriginalArg(2) Class2_Sub2 arg1) {
		if (this.anInt3928 == 0) {
			@Pc(26) Class2_Sub2 local26 = this.aClass85_1.method2757();
			local26.method3004();
			local26.method2900();
			if (local26 == this.aClass2_Sub2_59) {
				local26 = this.aClass85_1.method2757();
				local26.method3004();
				local26.method2900();
			}
		} else {
			this.anInt3928--;
		}
		this.aClass74_10.method2432(arg0, arg1);
		this.aClass85_1.method2758(arg1);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)Lclient!ub;")
	public Class2 method2702() {
		return this.aClass74_10.method2435();
	}
}
