import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ij")
public final class Class145 {

	@OriginalMember(owner = "client!ij", name = "n", descriptor = "Lclient!gca;")
	private Class60_Sub1 aClass60_Sub1_8;

	@OriginalMember(owner = "client!ij", name = "j", descriptor = "Lclient!gca;")
	public final Class60_Sub1 aClass60_Sub1_7 = new Class60_Sub1();

	@OriginalMember(owner = "client!ij", name = "<init>", descriptor = "()V")
	public Class145() {
		this.aClass60_Sub1_7.aClass60_Sub1_9 = this.aClass60_Sub1_7;
		this.aClass60_Sub1_7.aClass60_Sub1_10 = this.aClass60_Sub1_7;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)Lclient!gca;")
	public Class60_Sub1 method3522() {
		@Pc(7) Class60_Sub1 local7 = this.aClass60_Sub1_7.aClass60_Sub1_10;
		if (this.aClass60_Sub1_7 == local7) {
			this.aClass60_Sub1_8 = null;
			return null;
		} else {
			this.aClass60_Sub1_8 = local7.aClass60_Sub1_10;
			return local7;
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)I")
	public int method3526() {
		@Pc(15) int local15 = 0;
		@Pc(19) Class60_Sub1 local19 = this.aClass60_Sub1_7.aClass60_Sub1_10;
		while (this.aClass60_Sub1_7 != local19) {
			local19 = local19.aClass60_Sub1_10;
			local15++;
		}
		return local15;
	}

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(I)Lclient!gca;")
	public Class60_Sub1 method3528() {
		@Pc(11) Class60_Sub1 local11 = this.aClass60_Sub1_8;
		if (this.aClass60_Sub1_7 == local11) {
			this.aClass60_Sub1_8 = null;
			return null;
		} else {
			this.aClass60_Sub1_8 = local11.aClass60_Sub1_10;
			return local11;
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZLclient!gca;)V")
	public void method3530(@OriginalArg(1) Class60_Sub1 arg0) {
		if (arg0.aClass60_Sub1_9 != null) {
			arg0.method3818();
		}
		arg0.aClass60_Sub1_10 = this.aClass60_Sub1_7;
		arg0.aClass60_Sub1_9 = this.aClass60_Sub1_7.aClass60_Sub1_9;
		arg0.aClass60_Sub1_9.aClass60_Sub1_10 = arg0;
		arg0.aClass60_Sub1_10.aClass60_Sub1_9 = arg0;
	}

	@OriginalMember(owner = "client!ij", name = "c", descriptor = "(I)V")
	public void method3531() {
		while (true) {
			@Pc(16) Class60_Sub1 local16 = this.aClass60_Sub1_7.aClass60_Sub1_10;
			if (this.aClass60_Sub1_7 == local16) {
				this.aClass60_Sub1_8 = null;
				return;
			}
			local16.method3818();
		}
	}
}
