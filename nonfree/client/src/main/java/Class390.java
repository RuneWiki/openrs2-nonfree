import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wja")
public final class Class390 {

	@OriginalMember(owner = "client!wja", name = "j", descriptor = "Lclient!taa;")
	private Class15_Sub2 aClass15_Sub2_10;

	@OriginalMember(owner = "client!wja", name = "h", descriptor = "Lclient!taa;")
	public final Class15_Sub2 aClass15_Sub2_9 = new Class15_Sub2();

	@OriginalMember(owner = "client!wja", name = "<init>", descriptor = "()V")
	public Class390() {
		this.aClass15_Sub2_9.aClass15_Sub2_8 = this.aClass15_Sub2_9;
		this.aClass15_Sub2_9.aClass15_Sub2_7 = this.aClass15_Sub2_9;
	}

	@OriginalMember(owner = "client!wja", name = "a", descriptor = "(Lclient!taa;I)V")
	public void method9674(@OriginalArg(0) Class15_Sub2 arg0) {
		if (arg0.aClass15_Sub2_7 != null) {
			arg0.method9316();
		}
		arg0.aClass15_Sub2_7 = this.aClass15_Sub2_9.aClass15_Sub2_7;
		arg0.aClass15_Sub2_8 = this.aClass15_Sub2_9;
		arg0.aClass15_Sub2_7.aClass15_Sub2_8 = arg0;
		arg0.aClass15_Sub2_8.aClass15_Sub2_7 = arg0;
	}

	@OriginalMember(owner = "client!wja", name = "a", descriptor = "(B)Lclient!taa;")
	public Class15_Sub2 method9675() {
		@Pc(6) Class15_Sub2 local6 = this.aClass15_Sub2_10;
		if (this.aClass15_Sub2_9 == local6) {
			this.aClass15_Sub2_10 = null;
			return null;
		} else {
			this.aClass15_Sub2_10 = local6.aClass15_Sub2_8;
			return local6;
		}
	}

	@OriginalMember(owner = "client!wja", name = "a", descriptor = "(I)Lclient!taa;")
	public Class15_Sub2 method9676() {
		@Pc(12) Class15_Sub2 local12 = this.aClass15_Sub2_9.aClass15_Sub2_8;
		if (local12 == this.aClass15_Sub2_9) {
			this.aClass15_Sub2_10 = null;
			return null;
		} else {
			this.aClass15_Sub2_10 = local12.aClass15_Sub2_8;
			return local12;
		}
	}

	@OriginalMember(owner = "client!wja", name = "b", descriptor = "(I)V")
	public void method9677() {
		while (true) {
			@Pc(5) Class15_Sub2 local5 = this.aClass15_Sub2_9.aClass15_Sub2_8;
			if (this.aClass15_Sub2_9 == local5) {
				this.aClass15_Sub2_10 = null;
				return;
			}
			local5.method9316();
		}
	}

	@OriginalMember(owner = "client!wja", name = "b", descriptor = "(Z)I")
	public int method9680() {
		@Pc(13) int local13 = 0;
		for (@Pc(17) Class15_Sub2 local17 = this.aClass15_Sub2_9.aClass15_Sub2_8; local17 != this.aClass15_Sub2_9; local17 = local17.aClass15_Sub2_8) {
			local13++;
		}
		return local13;
	}
}
