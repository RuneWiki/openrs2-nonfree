import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mn")
public final class Class137 {

	@OriginalMember(owner = "client!mn", name = "d", descriptor = "Lclient!nk;")
	private final Class143 aClass143_13 = new Class143();

	@OriginalMember(owner = "client!mn", name = "q", descriptor = "I")
	private int anInt3702;

	@OriginalMember(owner = "client!mn", name = "g", descriptor = "I")
	private final int anInt3692;

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "Lclient!jj;")
	private final Class108 aClass108_22;

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(I)V")
	public Class137(@OriginalArg(0) int arg0) {
		this.anInt3702 = arg0;
		this.anInt3692 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; arg0 > local14 + local14; local14 += local14) {
		}
		this.aClass108_22 = new Class108(local14);
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Z)I")
	public int method3626() {
		return this.anInt3702;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)V")
	public void method3628() {
		for (@Pc(15) Class6_Sub2_Sub2 local15 = (Class6_Sub2_Sub2) this.aClass143_13.method3766(); local15 != null; local15 = (Class6_Sub2_Sub2) this.aClass143_13.method3763()) {
			if (local15.method577()) {
				local15.method5756();
				local15.method5761();
				this.anInt3702++;
			}
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lclient!mc;ZLjava/lang/Object;)V")
	public void method3629(@OriginalArg(0) Interface5 arg0, @OriginalArg(2) Object arg1) {
		this.method3632(arg0);
		if (this.anInt3702 == 0) {
			@Pc(16) Class6_Sub2_Sub2 local16 = (Class6_Sub2_Sub2) this.aClass143_13.method3759();
			local16.method5756();
			local16.method5761();
		} else {
			this.anInt3702--;
		}
		@Pc(36) Class6_Sub2_Sub2_Sub1 local36 = new Class6_Sub2_Sub2_Sub1(arg0, arg1);
		this.aClass108_22.method2898(arg0.method5366(), local36);
		this.aClass143_13.method3765(local36);
		local36.aLong219 = 0L;
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(I)V")
	public void method3630() {
		this.aClass143_13.method3758();
		this.aClass108_22.method2909();
		this.anInt3702 = this.anInt3692;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(ILclient!mc;)V")
	private void method3632(@OriginalArg(1) Interface5 arg0) {
		@Pc(9) long local9 = arg0.method5366();
		for (@Pc(24) Class6_Sub2_Sub2 local24 = (Class6_Sub2_Sub2) this.aClass108_22.method2900(local9); local24 != null; local24 = (Class6_Sub2_Sub2) this.aClass108_22.method2910()) {
			if (local24.anInterface5_3.method5365(arg0)) {
				local24.method5756();
				local24.method5761();
				this.anInt3702++;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!mn", name = "c", descriptor = "(B)I")
	public int method3633() {
		return this.anInt3692;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(II)V")
	public void method3636() {
		if (Static308.aClass123_1 == null) {
			return;
		}
		for (@Pc(17) Class6_Sub2_Sub2 local17 = (Class6_Sub2_Sub2) this.aClass143_13.method3766(); local17 != null; local17 = (Class6_Sub2_Sub2) this.aClass143_13.method3763()) {
			if (local17.method577()) {
				if (local17.method578() == null) {
					local17.method5756();
					local17.method5761();
					this.anInt3702++;
				}
			} else if ((long) 5 < ++local17.aLong219) {
				@Pc(39) Class6_Sub2_Sub2 local39 = Static308.aClass123_1.method3318(local17);
				this.aClass108_22.method2898(local17.aLong218, local39);
				Static211.method3757(local17, local39);
				local17.method5756();
				local17.method5761();
			}
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lclient!mc;I)Ljava/lang/Object;")
	public Object method3637(@OriginalArg(0) Interface5 arg0) {
		@Pc(9) long local9 = arg0.method5366();
		for (@Pc(16) Class6_Sub2_Sub2 local16 = (Class6_Sub2_Sub2) this.aClass108_22.method2900(local9); local16 != null; local16 = (Class6_Sub2_Sub2) this.aClass108_22.method2910()) {
			if (local16.anInterface5_3.method5365(arg0)) {
				@Pc(28) Object local28 = local16.method578();
				if (local28 != null) {
					if (local16.method577()) {
						@Pc(64) Class6_Sub2_Sub2_Sub1 local64 = new Class6_Sub2_Sub2_Sub1(arg0, local28);
						this.aClass108_22.method2898(local16.aLong218, local64);
						this.aClass143_13.method3765(local64);
						local64.aLong219 = 0L;
						local16.method5756();
						local16.method5761();
					} else {
						this.aClass143_13.method3765(local16);
						local16.aLong219 = 0L;
					}
					return local28;
				}
				local16.method5756();
				local16.method5761();
				this.anInt3702++;
			}
		}
		return null;
	}
}
