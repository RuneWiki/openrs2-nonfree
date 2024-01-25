import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gba")
public final class Class104 {

	@OriginalMember(owner = "client!gba", name = "k", descriptor = "Lclient!ld;")
	private Class1_Sub1 aClass1_Sub1_21;

	@OriginalMember(owner = "client!gba", name = "c", descriptor = "Lclient!ld;")
	private final Class1_Sub1 aClass1_Sub1_20 = new Class1_Sub1();

	@OriginalMember(owner = "client!gba", name = "<init>", descriptor = "()V")
	public Class104() {
		this.aClass1_Sub1_20.aClass1_Sub1_59 = this.aClass1_Sub1_20;
		this.aClass1_Sub1_20.aClass1_Sub1_60 = this.aClass1_Sub1_20;
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(I)I")
	public int method2412() {
		@Pc(7) int local7 = 0;
		for (@Pc(11) Class1_Sub1 local11 = this.aClass1_Sub1_20.aClass1_Sub1_59; local11 != this.aClass1_Sub1_20; local11 = local11.aClass1_Sub1_59) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!gba", name = "b", descriptor = "(B)Lclient!ld;")
	public Class1_Sub1 method2414() {
		@Pc(7) Class1_Sub1 local7 = this.aClass1_Sub1_20.aClass1_Sub1_59;
		if (this.aClass1_Sub1_20 == local7) {
			this.aClass1_Sub1_21 = null;
			return null;
		} else {
			this.aClass1_Sub1_21 = local7.aClass1_Sub1_59;
			return local7;
		}
	}

	@OriginalMember(owner = "client!gba", name = "c", descriptor = "(I)Lclient!ld;")
	public Class1_Sub1 method2417() {
		@Pc(6) Class1_Sub1 local6 = this.aClass1_Sub1_21;
		if (local6 == this.aClass1_Sub1_20) {
			this.aClass1_Sub1_21 = null;
			return null;
		} else {
			this.aClass1_Sub1_21 = local6.aClass1_Sub1_59;
			return local6;
		}
	}

	@OriginalMember(owner = "client!gba", name = "d", descriptor = "(I)Lclient!ld;")
	public Class1_Sub1 method2418() {
		@Pc(7) Class1_Sub1 local7 = this.aClass1_Sub1_20.aClass1_Sub1_59;
		if (local7 == this.aClass1_Sub1_20) {
			return null;
		} else {
			local7.method7528();
			return local7;
		}
	}

	@OriginalMember(owner = "client!gba", name = "e", descriptor = "(I)V")
	public void method2419() {
		while (true) {
			@Pc(14) Class1_Sub1 local14 = this.aClass1_Sub1_20.aClass1_Sub1_59;
			if (local14 == this.aClass1_Sub1_20) {
				this.aClass1_Sub1_21 = null;
				return;
			}
			local14.method7528();
		}
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(BLclient!ld;)V")
	public void method2420(@OriginalArg(1) Class1_Sub1 arg0) {
		if (arg0.aClass1_Sub1_60 != null) {
			arg0.method7528();
		}
		arg0.aClass1_Sub1_60 = this.aClass1_Sub1_20.aClass1_Sub1_60;
		arg0.aClass1_Sub1_59 = this.aClass1_Sub1_20;
		arg0.aClass1_Sub1_60.aClass1_Sub1_59 = arg0;
		arg0.aClass1_Sub1_59.aClass1_Sub1_60 = arg0;
	}
}
