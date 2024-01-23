import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class Class5 {

	@OriginalMember(owner = "client!ad", name = "t", descriptor = "Lclient!v;")
	private Class1_Sub1 aClass1_Sub1_6;

	@OriginalMember(owner = "client!ad", name = "s", descriptor = "Lclient!v;")
	public Class1_Sub1 aClass1_Sub1_5 = new Class1_Sub1();

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "()V")
	public Class5() {
		this.aClass1_Sub1_5.aClass1_Sub1_75 = this.aClass1_Sub1_5;
		this.aClass1_Sub1_5.aClass1_Sub1_74 = this.aClass1_Sub1_5;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!v;I)V")
	public void method48(@OriginalArg(0) Class1_Sub1 arg0) {
		if (arg0.aClass1_Sub1_74 != null) {
			arg0.method4617();
		}
		arg0.aClass1_Sub1_75 = this.aClass1_Sub1_5;
		arg0.aClass1_Sub1_74 = this.aClass1_Sub1_5.aClass1_Sub1_74;
		arg0.aClass1_Sub1_74.aClass1_Sub1_75 = arg0;
		arg0.aClass1_Sub1_75.aClass1_Sub1_74 = arg0;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)Lclient!v;")
	public Class1_Sub1 method49() {
		@Pc(7) Class1_Sub1 local7 = this.aClass1_Sub1_5.aClass1_Sub1_75;
		if (this.aClass1_Sub1_5 == local7) {
			this.aClass1_Sub1_6 = null;
			return null;
		} else {
			this.aClass1_Sub1_6 = local7.aClass1_Sub1_75;
			return local7;
		}
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(B)Lclient!v;")
	public Class1_Sub1 method51() {
		@Pc(2) Class1_Sub1 local2 = this.aClass1_Sub1_6;
		if (local2 == this.aClass1_Sub1_5) {
			this.aClass1_Sub1_6 = null;
			return null;
		} else {
			this.aClass1_Sub1_6 = local2.aClass1_Sub1_75;
			return local2;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)I")
	public int method52() {
		@Pc(17) int local17 = 0;
		for (@Pc(21) Class1_Sub1 local21 = this.aClass1_Sub1_5.aClass1_Sub1_75; local21 != this.aClass1_Sub1_5; local21 = local21.aClass1_Sub1_75) {
			local17++;
		}
		return local17;
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(B)Lclient!v;")
	public Class1_Sub1 method53() {
		@Pc(3) Class1_Sub1 local3 = this.aClass1_Sub1_5.aClass1_Sub1_75;
		if (local3 == this.aClass1_Sub1_5) {
			return null;
		} else {
			local3.method4617();
			return local3;
		}
	}

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "(B)V")
	public void method55() {
		while (true) {
			@Pc(5) Class1_Sub1 local5 = this.aClass1_Sub1_5.aClass1_Sub1_75;
			if (local5 == this.aClass1_Sub1_5) {
				this.aClass1_Sub1_6 = null;
				return;
			}
			local5.method4617();
		}
	}
}
