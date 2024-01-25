import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!an")
public final class Class15 {

	@OriginalMember(owner = "client!an", name = "i", descriptor = "Lclient!hs;")
	private Class111_Sub1 aClass111_Sub1_2;

	@OriginalMember(owner = "client!an", name = "a", descriptor = "Lclient!hs;")
	public final Class111_Sub1 aClass111_Sub1_1 = new Class111_Sub1();

	@OriginalMember(owner = "client!an", name = "<init>", descriptor = "()V")
	public Class15() {
		this.aClass111_Sub1_1.aClass111_Sub1_10 = this.aClass111_Sub1_1;
		this.aClass111_Sub1_1.aClass111_Sub1_9 = this.aClass111_Sub1_1;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Lclient!hs;I)V")
	public void method217(@OriginalArg(0) Class111_Sub1 arg0) {
		if (arg0.aClass111_Sub1_9 != null) {
			arg0.method5261();
		}
		arg0.aClass111_Sub1_10 = this.aClass111_Sub1_1;
		arg0.aClass111_Sub1_9 = this.aClass111_Sub1_1.aClass111_Sub1_9;
		arg0.aClass111_Sub1_9.aClass111_Sub1_10 = arg0;
		arg0.aClass111_Sub1_10.aClass111_Sub1_9 = arg0;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(B)I")
	public int method218() {
		@Pc(7) int local7 = 0;
		@Pc(11) Class111_Sub1 local11 = this.aClass111_Sub1_1.aClass111_Sub1_10;
		while (local11 != this.aClass111_Sub1_1) {
			local11 = local11.aClass111_Sub1_10;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!an", name = "b", descriptor = "(B)V")
	public void method219() {
		while (true) {
			@Pc(14) Class111_Sub1 local14 = this.aClass111_Sub1_1.aClass111_Sub1_10;
			if (local14 == this.aClass111_Sub1_1) {
				this.aClass111_Sub1_2 = null;
				return;
			}
			local14.method5261();
		}
	}

	@OriginalMember(owner = "client!an", name = "c", descriptor = "(B)Lclient!hs;")
	public Class111_Sub1 method220() {
		@Pc(6) Class111_Sub1 local6 = this.aClass111_Sub1_2;
		if (this.aClass111_Sub1_1 == local6) {
			this.aClass111_Sub1_2 = null;
			return null;
		} else {
			this.aClass111_Sub1_2 = local6.aClass111_Sub1_10;
			return local6;
		}
	}

	@OriginalMember(owner = "client!an", name = "b", descriptor = "(I)Lclient!hs;")
	public Class111_Sub1 method222() {
		@Pc(14) Class111_Sub1 local14 = this.aClass111_Sub1_1.aClass111_Sub1_10;
		if (local14 == this.aClass111_Sub1_1) {
			this.aClass111_Sub1_2 = null;
			return null;
		} else {
			this.aClass111_Sub1_2 = local14.aClass111_Sub1_10;
			return local14;
		}
	}
}
