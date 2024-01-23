import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oj")
public final class Class128 {

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "Lclient!r;")
	private Class2_Sub8 aClass2_Sub8_50;

	@OriginalMember(owner = "client!oj", name = "d", descriptor = "Lclient!ea;")
	private Class37 aClass37_12;

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(B)Lclient!r;")
	public Class2_Sub8 method3480() {
		@Pc(13) Class2_Sub8 local13 = this.aClass2_Sub8_50;
		if (local13 == this.aClass37_12.aClass2_Sub8_17) {
			this.aClass2_Sub8_50 = null;
			return null;
		} else {
			this.aClass2_Sub8_50 = local13.aClass2_Sub8_74;
			return local13;
		}
	}

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "(I)Lclient!r;")
	public Class2_Sub8 method3481() {
		@Pc(16) Class2_Sub8 local16 = this.aClass37_12.aClass2_Sub8_17.aClass2_Sub8_74;
		if (local16 == this.aClass37_12.aClass2_Sub8_17) {
			this.aClass2_Sub8_50 = null;
			return null;
		} else {
			this.aClass2_Sub8_50 = local16.aClass2_Sub8_74;
			return local16;
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(ILclient!ea;)V")
	public void method3482(@OriginalArg(1) Class37 arg0) {
		this.aClass37_12 = arg0;
	}
}
