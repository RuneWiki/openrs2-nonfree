import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tl")
public final class Class232 {

	@OriginalMember(owner = "client!tl", name = "j", descriptor = "Lclient!nk;")
	private Class4_Sub2 aClass4_Sub2_8;

	@OriginalMember(owner = "client!tl", name = "i", descriptor = "Lclient!nk;")
	public final Class4_Sub2 aClass4_Sub2_7 = new Class4_Sub2();

	@OriginalMember(owner = "client!tl", name = "<init>", descriptor = "()V")
	public Class232() {
		this.aClass4_Sub2_7.aClass4_Sub2_9 = this.aClass4_Sub2_7;
		this.aClass4_Sub2_7.aClass4_Sub2_10 = this.aClass4_Sub2_7;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Z)Lclient!nk;")
	public Class4_Sub2 method5222() {
		@Pc(6) Class4_Sub2 local6 = this.aClass4_Sub2_8;
		if (this.aClass4_Sub2_7 == local6) {
			this.aClass4_Sub2_8 = null;
			return null;
		} else {
			this.aClass4_Sub2_8 = local6.aClass4_Sub2_9;
			return local6;
		}
	}

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "(Z)Lclient!nk;")
	public Class4_Sub2 method5223() {
		@Pc(13) Class4_Sub2 local13 = this.aClass4_Sub2_7.aClass4_Sub2_9;
		if (local13 == this.aClass4_Sub2_7) {
			this.aClass4_Sub2_8 = null;
			return null;
		} else {
			this.aClass4_Sub2_8 = local13.aClass4_Sub2_9;
			return local13;
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V")
	public void method5224() {
		while (true) {
			@Pc(3) Class4_Sub2 local3 = this.aClass4_Sub2_7.aClass4_Sub2_9;
			if (this.aClass4_Sub2_7 == local3) {
				this.aClass4_Sub2_8 = null;
				return;
			}
			local3.method5702();
		}
	}

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "(I)I")
	public int method5226() {
		@Pc(5) int local5 = 0;
		for (@Pc(9) Class4_Sub2 local9 = this.aClass4_Sub2_7.aClass4_Sub2_9; local9 != this.aClass4_Sub2_7; local9 = local9.aClass4_Sub2_9) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(ZLclient!nk;)V")
	public void method5227(@OriginalArg(1) Class4_Sub2 arg0) {
		if (arg0.aClass4_Sub2_10 != null) {
			arg0.method5702();
		}
		arg0.aClass4_Sub2_10 = this.aClass4_Sub2_7.aClass4_Sub2_10;
		arg0.aClass4_Sub2_9 = this.aClass4_Sub2_7;
		arg0.aClass4_Sub2_10.aClass4_Sub2_9 = arg0;
		arg0.aClass4_Sub2_9.aClass4_Sub2_10 = arg0;
	}
}
