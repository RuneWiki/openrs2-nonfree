import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pm")
public final class Class254 {

	@OriginalMember(owner = "client!pm", name = "l", descriptor = "Lclient!wca;")
	private Class98_Sub1 aClass98_Sub1_8;

	@OriginalMember(owner = "client!pm", name = "d", descriptor = "Lclient!wca;")
	public final Class98_Sub1 aClass98_Sub1_7 = new Class98_Sub1();

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "()V")
	public Class254() {
		this.aClass98_Sub1_7.aClass98_Sub1_10 = this.aClass98_Sub1_7;
		this.aClass98_Sub1_7.aClass98_Sub1_9 = this.aClass98_Sub1_7;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)Lclient!wca;")
	public Class98_Sub1 method5858() {
		@Pc(7) Class98_Sub1 local7 = this.aClass98_Sub1_7.aClass98_Sub1_10;
		if (local7 == this.aClass98_Sub1_7) {
			this.aClass98_Sub1_8 = null;
			return null;
		} else {
			this.aClass98_Sub1_8 = local7.aClass98_Sub1_10;
			return local7;
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(ILclient!wca;)V")
	public void method5860(@OriginalArg(1) Class98_Sub1 arg0) {
		if (arg0.aClass98_Sub1_9 != null) {
			arg0.method7764();
		}
		arg0.aClass98_Sub1_9 = this.aClass98_Sub1_7.aClass98_Sub1_9;
		arg0.aClass98_Sub1_10 = this.aClass98_Sub1_7;
		arg0.aClass98_Sub1_9.aClass98_Sub1_10 = arg0;
		arg0.aClass98_Sub1_10.aClass98_Sub1_9 = arg0;
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(I)Lclient!wca;")
	public Class98_Sub1 method5862() {
		@Pc(11) Class98_Sub1 local11 = this.aClass98_Sub1_8;
		if (local11 == this.aClass98_Sub1_7) {
			this.aClass98_Sub1_8 = null;
			return null;
		} else {
			this.aClass98_Sub1_8 = local11.aClass98_Sub1_10;
			return local11;
		}
	}

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "(I)V")
	public void method5863() {
		while (true) {
			@Pc(17) Class98_Sub1 local17 = this.aClass98_Sub1_7.aClass98_Sub1_10;
			if (local17 == this.aClass98_Sub1_7) {
				this.aClass98_Sub1_8 = null;
				return;
			}
			local17.method7764();
		}
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(B)I")
	public int method5864() {
		@Pc(7) int local7 = 0;
		for (@Pc(16) Class98_Sub1 local16 = this.aClass98_Sub1_7.aClass98_Sub1_10; local16 != this.aClass98_Sub1_7; local16 = local16.aClass98_Sub1_10) {
			local7++;
		}
		return local7;
	}
}
