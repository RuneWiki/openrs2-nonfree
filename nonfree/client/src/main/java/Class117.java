import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fs")
public final class Class117 {

	@OriginalMember(owner = "client!fs", name = "d", descriptor = "Lclient!jda;")
	private Class2_Sub5 aClass2_Sub5_19 = new Class2_Sub5();

	@OriginalMember(owner = "client!fs", name = "o", descriptor = "Lclient!jh;")
	private final Class175 aClass175_5 = new Class175();

	@OriginalMember(owner = "client!fs", name = "q", descriptor = "I")
	private int anInt3672;

	@OriginalMember(owner = "client!fs", name = "m", descriptor = "I")
	private final int anInt3670;

	@OriginalMember(owner = "client!fs", name = "n", descriptor = "Lclient!mp;")
	private final Class222 aClass222_12;

	@OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(I)V")
	public Class117(@OriginalArg(0) int arg0) {
		this.anInt3672 = arg0;
		this.anInt3670 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; arg0 > local19 + local19; local19 += local19) {
		}
		this.aClass222_12 = new Class222(local19);
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(I)V")
	public void method3039() {
		this.aClass175_5.method4283();
		this.aClass222_12.method5469();
		this.aClass2_Sub5_19 = new Class2_Sub5();
		this.anInt3672 = this.anInt3670;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(ZJ)V")
	public void method3040(@OriginalArg(1) long arg0) {
		@Pc(16) Class2_Sub5 local16 = (Class2_Sub5) this.aClass222_12.method5468(arg0);
		if (local16 != null) {
			local16.method8599();
			local16.method8464();
			this.anInt3672++;
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(JB)Lclient!jda;")
	public Class2_Sub5 method3041(@OriginalArg(0) long arg0) {
		@Pc(15) Class2_Sub5 local15 = (Class2_Sub5) this.aClass222_12.method5468(arg0);
		if (local15 != null) {
			this.aClass175_5.method4287(local15);
		}
		return local15;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(JLclient!jda;I)V")
	public void method3042(@OriginalArg(0) long arg0, @OriginalArg(1) Class2_Sub5 arg1) {
		if (this.anInt3672 == 0) {
			@Pc(10) Class2_Sub5 local10 = this.aClass175_5.method4284();
			local10.method8599();
			local10.method8464();
			if (local10 == this.aClass2_Sub5_19) {
				local10 = this.aClass175_5.method4284();
				local10.method8599();
				local10.method8464();
			}
		} else {
			this.anInt3672--;
		}
		this.aClass222_12.method5476(arg1, arg0);
		this.aClass175_5.method4287(arg1);
	}
}
