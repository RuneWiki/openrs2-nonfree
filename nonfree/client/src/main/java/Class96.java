import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gm")
public final class Class96 {

	@OriginalMember(owner = "client!gm", name = "k", descriptor = "Lclient!en;")
	private Class28_Sub2 aClass28_Sub2_4;

	@OriginalMember(owner = "client!gm", name = "e", descriptor = "Lclient!en;")
	public final Class28_Sub2 aClass28_Sub2_3 = new Class28_Sub2();

	@OriginalMember(owner = "client!gm", name = "<init>", descriptor = "()V")
	public Class96() {
		this.aClass28_Sub2_3.aClass28_Sub2_10 = this.aClass28_Sub2_3;
		this.aClass28_Sub2_3.aClass28_Sub2_9 = this.aClass28_Sub2_3;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)Lclient!en;")
	public Class28_Sub2 method2137() {
		@Pc(11) Class28_Sub2 local11 = this.aClass28_Sub2_3.aClass28_Sub2_9;
		if (this.aClass28_Sub2_3 == local11) {
			this.aClass28_Sub2_4 = null;
			return null;
		} else {
			this.aClass28_Sub2_4 = local11.aClass28_Sub2_9;
			return local11;
		}
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(ILclient!en;)V")
	public void method2138(@OriginalArg(1) Class28_Sub2 arg0) {
		if (arg0.aClass28_Sub2_10 != null) {
			arg0.method4121();
		}
		arg0.aClass28_Sub2_9 = this.aClass28_Sub2_3;
		arg0.aClass28_Sub2_10 = this.aClass28_Sub2_3.aClass28_Sub2_10;
		arg0.aClass28_Sub2_10.aClass28_Sub2_9 = arg0;
		arg0.aClass28_Sub2_9.aClass28_Sub2_10 = arg0;
	}

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "(I)V")
	public void method2139() {
		while (true) {
			@Pc(14) Class28_Sub2 local14 = this.aClass28_Sub2_3.aClass28_Sub2_9;
			if (this.aClass28_Sub2_3 == local14) {
				this.aClass28_Sub2_4 = null;
				return;
			}
			local14.method4121();
		}
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(B)I")
	public int method2140() {
		@Pc(12) int local12 = 0;
		@Pc(16) Class28_Sub2 local16 = this.aClass28_Sub2_3.aClass28_Sub2_9;
		while (this.aClass28_Sub2_3 != local16) {
			local16 = local16.aClass28_Sub2_9;
			local12++;
		}
		return local12;
	}

	@OriginalMember(owner = "client!gm", name = "d", descriptor = "(I)Lclient!en;")
	public Class28_Sub2 method2144() {
		@Pc(11) Class28_Sub2 local11 = this.aClass28_Sub2_4;
		if (this.aClass28_Sub2_3 == local11) {
			this.aClass28_Sub2_4 = null;
			return null;
		} else {
			this.aClass28_Sub2_4 = local11.aClass28_Sub2_9;
			return local11;
		}
	}
}
