import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gja")
public final class Class126 {

	@OriginalMember(owner = "client!gja", name = "a", descriptor = "Lclient!daa;")
	private Class2_Sub1 aClass2_Sub1_26;

	@OriginalMember(owner = "client!gja", name = "b", descriptor = "Lclient!pf;")
	private Class279 aClass279_7;

	@OriginalMember(owner = "client!gja", name = "<init>", descriptor = "()V")
	private Class126() {
	}

	@OriginalMember(owner = "client!gja", name = "<init>", descriptor = "(Lclient!pf;)V")
	public Class126(@OriginalArg(0) Class279 arg0) {
		this.aClass279_7 = arg0;
	}

	@OriginalMember(owner = "client!gja", name = "a", descriptor = "(I)Lclient!daa;")
	public Class2_Sub1 method3766() {
		@Pc(14) Class2_Sub1 local14 = this.aClass279_7.aClass2_Sub1_54.aClass2_Sub1_67;
		if (this.aClass279_7.aClass2_Sub1_54 == local14) {
			this.aClass2_Sub1_26 = null;
			return null;
		} else {
			this.aClass2_Sub1_26 = local14.aClass2_Sub1_67;
			return local14;
		}
	}

	@OriginalMember(owner = "client!gja", name = "b", descriptor = "(I)Lclient!daa;")
	public Class2_Sub1 method3767() {
		@Pc(6) Class2_Sub1 local6 = this.aClass2_Sub1_26;
		if (this.aClass279_7.aClass2_Sub1_54 == local6) {
			this.aClass2_Sub1_26 = null;
			return null;
		} else {
			this.aClass2_Sub1_26 = local6.aClass2_Sub1_67;
			return local6;
		}
	}
}
