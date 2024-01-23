import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class26 {

	@OriginalMember(owner = "client!cc", name = "j", descriptor = "Lclient!uk;")
	private Class178 aClass178_2 = new Class178();

	@OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
	private int anInt533;

	@OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
	private int anInt532;

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "Lclient!ic;")
	private Class85 aClass85_1;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(I)V")
	public Class26(@OriginalArg(0) int arg0) {
		this.anInt533 = arg0;
		this.anInt532 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; local14 + local14 < arg0; local14 += local14) {
		}
		this.aClass85_1 = new Class85(local14);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z)I")
	public int method509() {
		@Pc(7) int local7 = 0;
		for (@Pc(18) Class4_Sub3_Sub4 local18 = (Class4_Sub3_Sub4) this.aClass178_2.method4369(); local18 != null; local18 = (Class4_Sub3_Sub4) this.aClass178_2.method4377()) {
			if (!local18.method2327()) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILjava/lang/Object;J)V")
	public void method510(@OriginalArg(1) Object arg0, @OriginalArg(2) long arg1) {
		this.method512(arg1);
		if (this.anInt532 == 0) {
			@Pc(31) Class4_Sub3_Sub4 local31 = (Class4_Sub3_Sub4) this.aClass178_2.method4373();
			local31.method4854();
			local31.method4856();
		} else {
			this.anInt532--;
		}
		@Pc(42) Class4_Sub3_Sub4_Sub1 local42 = new Class4_Sub3_Sub4_Sub1(arg0);
		this.aClass85_1.method1841(local42, arg1);
		this.aClass178_2.method4370(local42);
		local42.aLong218 = 0L;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V")
	public void method511() {
		this.aClass178_2.method4374();
		this.aClass85_1.method1848();
		this.anInt532 = this.anInt533;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(JI)V")
	public void method512(@OriginalArg(0) long arg0) {
		@Pc(10) Class4_Sub3_Sub4 local10 = (Class4_Sub3_Sub4) this.aClass85_1.method1845(arg0);
		if (local10 != null) {
			local10.method4854();
			local10.method4856();
			this.anInt532++;
		}
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(Z)V")
	public void method515() {
		for (@Pc(16) Class4_Sub3_Sub4 local16 = (Class4_Sub3_Sub4) this.aClass178_2.method4369(); local16 != null; local16 = (Class4_Sub3_Sub4) this.aClass178_2.method4377()) {
			if (local16.method2327()) {
				local16.method4854();
				local16.method4856();
				this.anInt532++;
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(BI)V")
	public void method517(@OriginalArg(1) int arg0) {
		if (Static200.aClass67_1 == null) {
			return;
		}
		for (@Pc(22) Class4_Sub3_Sub4 local22 = (Class4_Sub3_Sub4) this.aClass178_2.method4369(); local22 != null; local22 = (Class4_Sub3_Sub4) this.aClass178_2.method4377()) {
			if (local22.method2327()) {
				if (local22.method2326() == null) {
					local22.method4854();
					local22.method4856();
					this.anInt532++;
				}
			} else if (++local22.aLong218 > (long) arg0) {
				@Pc(45) Class4_Sub3_Sub4 local45 = Static200.aClass67_1.method2016(local22);
				this.aClass85_1.method1841(local45, local22.aLong217);
				Static153.method2459(local22, local45);
				local22.method4854();
				local22.method4856();
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(JB)Ljava/lang/Object;")
	public Object method518(@OriginalArg(0) long arg0) {
		@Pc(10) Class4_Sub3_Sub4 local10 = (Class4_Sub3_Sub4) this.aClass85_1.method1845(arg0);
		if (local10 == null) {
			return null;
		}
		@Pc(26) Object local26 = local10.method2326();
		if (local26 == null) {
			local10.method4854();
			local10.method4856();
			this.anInt532++;
			return null;
		}
		if (local10.method2327()) {
			@Pc(61) Class4_Sub3_Sub4_Sub1 local61 = new Class4_Sub3_Sub4_Sub1(local26);
			this.aClass85_1.method1841(local61, local10.aLong217);
			this.aClass178_2.method4370(local61);
			local61.aLong218 = 0L;
			local10.method4854();
			local10.method4856();
		} else {
			this.aClass178_2.method4370(local10);
			local10.aLong218 = 0L;
		}
		return local26;
	}
}
