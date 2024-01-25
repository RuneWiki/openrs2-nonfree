import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ts")
public final class Class232 {

	@OriginalMember(owner = "client!ts", name = "l", descriptor = "Lclient!ab;")
	private Class3_Sub1 aClass3_Sub1_8;

	@OriginalMember(owner = "client!ts", name = "k", descriptor = "Lclient!ab;")
	public final Class3_Sub1 aClass3_Sub1_7 = new Class3_Sub1();

	static {
		new Class83("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
	}

	@OriginalMember(owner = "client!ts", name = "<init>", descriptor = "()V")
	public Class232() {
		this.aClass3_Sub1_7.aClass3_Sub1_5 = this.aClass3_Sub1_7;
		this.aClass3_Sub1_7.aClass3_Sub1_6 = this.aClass3_Sub1_7;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(I)V")
	public void method5122() {
		while (true) {
			@Pc(5) Class3_Sub1 local5 = this.aClass3_Sub1_7.aClass3_Sub1_6;
			if (local5 == this.aClass3_Sub1_7) {
				this.aClass3_Sub1_8 = null;
				return;
			}
			local5.method3298();
		}
	}

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "(Z)Lclient!ab;")
	public Class3_Sub1 method5124() {
		@Pc(11) Class3_Sub1 local11 = this.aClass3_Sub1_8;
		if (local11 == this.aClass3_Sub1_7) {
			this.aClass3_Sub1_8 = null;
			return null;
		} else {
			this.aClass3_Sub1_8 = local11.aClass3_Sub1_6;
			return local11;
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(ZLclient!ab;)V")
	public void method5126(@OriginalArg(1) Class3_Sub1 arg0) {
		if (arg0.aClass3_Sub1_5 != null) {
			arg0.method3298();
		}
		arg0.aClass3_Sub1_6 = this.aClass3_Sub1_7;
		arg0.aClass3_Sub1_5 = this.aClass3_Sub1_7.aClass3_Sub1_5;
		arg0.aClass3_Sub1_5.aClass3_Sub1_6 = arg0;
		arg0.aClass3_Sub1_6.aClass3_Sub1_5 = arg0;
	}

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "(I)Lclient!ab;")
	public Class3_Sub1 method5127() {
		@Pc(14) Class3_Sub1 local14 = this.aClass3_Sub1_7.aClass3_Sub1_6;
		if (this.aClass3_Sub1_7 == local14) {
			this.aClass3_Sub1_8 = null;
			return null;
		} else {
			this.aClass3_Sub1_8 = local14.aClass3_Sub1_6;
			return local14;
		}
	}

	@OriginalMember(owner = "client!ts", name = "c", descriptor = "(I)I")
	public int method5128() {
		@Pc(7) int local7 = 0;
		@Pc(11) Class3_Sub1 local11 = this.aClass3_Sub1_7.aClass3_Sub1_6;
		while (local11 != this.aClass3_Sub1_7) {
			local11 = local11.aClass3_Sub1_6;
			local7++;
		}
		return local7;
	}
}
