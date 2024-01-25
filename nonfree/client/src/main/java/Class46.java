import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bt")
public final class Class46 {

	@OriginalMember(owner = "client!bt", name = "i", descriptor = "Lclient!es;")
	private Class60_Sub2 aClass60_Sub2_2;

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "Lclient!es;")
	public final Class60_Sub2 aClass60_Sub2_1 = new Class60_Sub2();

	@OriginalMember(owner = "client!bt", name = "<init>", descriptor = "()V")
	public Class46() {
		this.aClass60_Sub2_1.aClass60_Sub2_10 = this.aClass60_Sub2_1;
		this.aClass60_Sub2_1.aClass60_Sub2_9 = this.aClass60_Sub2_1;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(I)I")
	public int method669() {
		@Pc(14) int local14 = 0;
		for (@Pc(18) Class60_Sub2 local18 = this.aClass60_Sub2_1.aClass60_Sub2_10; local18 != this.aClass60_Sub2_1; local18 = local18.aClass60_Sub2_10) {
			local14++;
		}
		return local14;
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(B)Lclient!es;")
	public Class60_Sub2 method670() {
		@Pc(6) Class60_Sub2 local6 = this.aClass60_Sub2_2;
		if (this.aClass60_Sub2_1 == local6) {
			this.aClass60_Sub2_2 = null;
			return null;
		} else {
			this.aClass60_Sub2_2 = local6.aClass60_Sub2_10;
			return local6;
		}
	}

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(B)V")
	public void method673() {
		while (true) {
			@Pc(5) Class60_Sub2 local5 = this.aClass60_Sub2_1.aClass60_Sub2_10;
			if (local5 == this.aClass60_Sub2_1) {
				this.aClass60_Sub2_2 = null;
				return;
			}
			local5.method7096();
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(ILclient!es;)V")
	public void method674(@OriginalArg(1) Class60_Sub2 arg0) {
		if (arg0.aClass60_Sub2_9 != null) {
			arg0.method7096();
		}
		arg0.aClass60_Sub2_10 = this.aClass60_Sub2_1;
		arg0.aClass60_Sub2_9 = this.aClass60_Sub2_1.aClass60_Sub2_9;
		arg0.aClass60_Sub2_9.aClass60_Sub2_10 = arg0;
		arg0.aClass60_Sub2_10.aClass60_Sub2_9 = arg0;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(B)Lclient!es;")
	public Class60_Sub2 method675() {
		@Pc(15) Class60_Sub2 local15 = this.aClass60_Sub2_1.aClass60_Sub2_10;
		if (this.aClass60_Sub2_1 == local15) {
			this.aClass60_Sub2_2 = null;
			return null;
		} else {
			this.aClass60_Sub2_2 = local15.aClass60_Sub2_10;
			return local15;
		}
	}
}
