import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ifa")
public final class Class144 {

	@OriginalMember(owner = "client!ifa", name = "i", descriptor = "Lclient!lj;")
	private Class6_Sub1 aClass6_Sub1_32;

	@OriginalMember(owner = "client!ifa", name = "b", descriptor = "Lclient!lj;")
	private final Class6_Sub1 aClass6_Sub1_31 = new Class6_Sub1();

	@OriginalMember(owner = "client!ifa", name = "<init>", descriptor = "()V")
	public Class144() {
		this.aClass6_Sub1_31.aClass6_Sub1_59 = this.aClass6_Sub1_31;
		this.aClass6_Sub1_31.aClass6_Sub1_60 = this.aClass6_Sub1_31;
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(I)I")
	public int method3110() {
		@Pc(15) int local15 = 0;
		for (@Pc(19) Class6_Sub1 local19 = this.aClass6_Sub1_31.aClass6_Sub1_60; local19 != this.aClass6_Sub1_31; local19 = local19.aClass6_Sub1_60) {
			local15++;
		}
		return local15;
	}

	@OriginalMember(owner = "client!ifa", name = "c", descriptor = "(I)V")
	public void method3112() {
		while (true) {
			@Pc(5) Class6_Sub1 local5 = this.aClass6_Sub1_31.aClass6_Sub1_60;
			if (local5 == this.aClass6_Sub1_31) {
				this.aClass6_Sub1_32 = null;
				return;
			}
			local5.method7852();
		}
	}

	@OriginalMember(owner = "client!ifa", name = "d", descriptor = "(I)Lclient!lj;")
	public Class6_Sub1 method3113() {
		@Pc(6) Class6_Sub1 local6 = this.aClass6_Sub1_32;
		if (local6 == this.aClass6_Sub1_31) {
			this.aClass6_Sub1_32 = null;
			return null;
		} else {
			this.aClass6_Sub1_32 = local6.aClass6_Sub1_60;
			return local6;
		}
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(ILclient!lj;)V")
	public void method3114(@OriginalArg(1) Class6_Sub1 arg0) {
		if (arg0.aClass6_Sub1_59 != null) {
			arg0.method7852();
		}
		arg0.aClass6_Sub1_59 = this.aClass6_Sub1_31.aClass6_Sub1_59;
		arg0.aClass6_Sub1_60 = this.aClass6_Sub1_31;
		arg0.aClass6_Sub1_59.aClass6_Sub1_60 = arg0;
		arg0.aClass6_Sub1_60.aClass6_Sub1_59 = arg0;
	}

	@OriginalMember(owner = "client!ifa", name = "e", descriptor = "(I)Lclient!lj;")
	public Class6_Sub1 method3115() {
		@Pc(11) Class6_Sub1 local11 = this.aClass6_Sub1_31.aClass6_Sub1_60;
		if (local11 == this.aClass6_Sub1_31) {
			return null;
		} else {
			local11.method7852();
			return local11;
		}
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(B)Lclient!lj;")
	public Class6_Sub1 method3116() {
		@Pc(12) Class6_Sub1 local12 = this.aClass6_Sub1_31.aClass6_Sub1_60;
		if (this.aClass6_Sub1_31 == local12) {
			this.aClass6_Sub1_32 = null;
			return null;
		} else {
			this.aClass6_Sub1_32 = local12.aClass6_Sub1_60;
			return local12;
		}
	}
}
