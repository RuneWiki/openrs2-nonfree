import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rp")
public final class Class259 {

	@OriginalMember(owner = "client!rp", name = "o", descriptor = "Lclient!ff;")
	private Class1_Sub2 aClass1_Sub2_52;

	@OriginalMember(owner = "client!rp", name = "e", descriptor = "Lclient!ff;")
	private final Class1_Sub2 aClass1_Sub2_51 = new Class1_Sub2();

	@OriginalMember(owner = "client!rp", name = "<init>", descriptor = "()V")
	public Class259() {
		this.aClass1_Sub2_51.aClass1_Sub2_59 = this.aClass1_Sub2_51;
		this.aClass1_Sub2_51.aClass1_Sub2_60 = this.aClass1_Sub2_51;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(B)Lclient!ff;")
	public Class1_Sub2 method6652() {
		@Pc(7) Class1_Sub2 local7 = this.aClass1_Sub2_51.aClass1_Sub2_59;
		if (local7 == this.aClass1_Sub2_51) {
			this.aClass1_Sub2_52 = null;
			return null;
		} else {
			this.aClass1_Sub2_52 = local7.aClass1_Sub2_59;
			return local7;
		}
	}

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "(I)V")
	public void method6653() {
		while (true) {
			@Pc(5) Class1_Sub2 local5 = this.aClass1_Sub2_51.aClass1_Sub2_59;
			if (local5 == this.aClass1_Sub2_51) {
				this.aClass1_Sub2_52 = null;
				return;
			}
			local5.method7390();
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Z)Lclient!ff;")
	public Class1_Sub2 method6654() {
		@Pc(11) Class1_Sub2 local11 = this.aClass1_Sub2_52;
		if (this.aClass1_Sub2_51 == local11) {
			this.aClass1_Sub2_52 = null;
			return null;
		} else {
			this.aClass1_Sub2_52 = local11.aClass1_Sub2_59;
			return local11;
		}
	}

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "(Z)I")
	public int method6655() {
		@Pc(7) int local7 = 0;
		for (@Pc(16) Class1_Sub2 local16 = this.aClass1_Sub2_51.aClass1_Sub2_59; local16 != this.aClass1_Sub2_51; local16 = local16.aClass1_Sub2_59) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lclient!ff;I)V")
	public void method6656(@OriginalArg(0) Class1_Sub2 arg0) {
		if (arg0.aClass1_Sub2_60 != null) {
			arg0.method7390();
		}
		arg0.aClass1_Sub2_59 = this.aClass1_Sub2_51;
		arg0.aClass1_Sub2_60 = this.aClass1_Sub2_51.aClass1_Sub2_60;
		arg0.aClass1_Sub2_60.aClass1_Sub2_59 = arg0;
		arg0.aClass1_Sub2_59.aClass1_Sub2_60 = arg0;
	}

	@OriginalMember(owner = "client!rp", name = "c", descriptor = "(Z)Lclient!ff;")
	public Class1_Sub2 method6658() {
		@Pc(7) Class1_Sub2 local7 = this.aClass1_Sub2_51.aClass1_Sub2_59;
		if (this.aClass1_Sub2_51 == local7) {
			return null;
		} else {
			local7.method7390();
			return local7;
		}
	}
}
