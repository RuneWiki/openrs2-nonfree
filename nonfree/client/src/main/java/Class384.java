import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public final class Class384 {

	@OriginalMember(owner = "client!wd", name = "p", descriptor = "Lclient!lm;")
	private Class6_Sub4 aClass6_Sub4_63;

	@OriginalMember(owner = "client!wd", name = "i", descriptor = "Lclient!lm;")
	public final Class6_Sub4 aClass6_Sub4_62 = new Class6_Sub4();

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "()V")
	public Class384() {
		this.aClass6_Sub4_62.aClass6_Sub4_67 = this.aClass6_Sub4_62;
		this.aClass6_Sub4_62.aClass6_Sub4_66 = this.aClass6_Sub4_62;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)Lclient!lm;")
	public Class6_Sub4 method8907() {
		@Pc(12) Class6_Sub4 local12 = this.aClass6_Sub4_62.aClass6_Sub4_67;
		if (this.aClass6_Sub4_62 == local12) {
			return null;
		} else {
			local12.method9043();
			return local12;
		}
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)Lclient!lm;")
	public Class6_Sub4 method8908() {
		@Pc(6) Class6_Sub4 local6 = this.aClass6_Sub4_63;
		if (this.aClass6_Sub4_62 == local6) {
			this.aClass6_Sub4_63 = null;
			return null;
		} else {
			this.aClass6_Sub4_63 = local6.aClass6_Sub4_67;
			return local6;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BLclient!lm;)V")
	public void method8909(@OriginalArg(1) Class6_Sub4 arg0) {
		if (arg0.aClass6_Sub4_66 != null) {
			arg0.method9043();
		}
		arg0.aClass6_Sub4_66 = this.aClass6_Sub4_62.aClass6_Sub4_66;
		arg0.aClass6_Sub4_67 = this.aClass6_Sub4_62;
		arg0.aClass6_Sub4_66.aClass6_Sub4_67 = arg0;
		arg0.aClass6_Sub4_67.aClass6_Sub4_66 = arg0;
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(I)Lclient!lm;")
	public Class6_Sub4 method8910() {
		@Pc(20) Class6_Sub4 local20 = this.aClass6_Sub4_62.aClass6_Sub4_67;
		if (this.aClass6_Sub4_62 == local20) {
			this.aClass6_Sub4_63 = null;
			return null;
		} else {
			this.aClass6_Sub4_63 = local20.aClass6_Sub4_67;
			return local20;
		}
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(B)I")
	public int method8911() {
		@Pc(15) int local15 = 0;
		for (@Pc(19) Class6_Sub4 local19 = this.aClass6_Sub4_62.aClass6_Sub4_67; local19 != this.aClass6_Sub4_62; local19 = local19.aClass6_Sub4_67) {
			local15++;
		}
		return local15;
	}

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "(I)V")
	public void method8913() {
		while (true) {
			@Pc(5) Class6_Sub4 local5 = this.aClass6_Sub4_62.aClass6_Sub4_67;
			if (this.aClass6_Sub4_62 == local5) {
				this.aClass6_Sub4_63 = null;
				return;
			}
			local5.method9043();
		}
	}
}
