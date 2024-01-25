import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ro")
public final class Class176 {

	@OriginalMember(owner = "client!ro", name = "n", descriptor = "Lclient!qp;")
	private Class5_Sub9 aClass5_Sub9_59;

	@OriginalMember(owner = "client!ro", name = "l", descriptor = "Lclient!qp;")
	private final Class5_Sub9 aClass5_Sub9_58 = new Class5_Sub9();

	@OriginalMember(owner = "client!ro", name = "<init>", descriptor = "()V")
	public Class176() {
		this.aClass5_Sub9_58.aClass5_Sub9_61 = this.aClass5_Sub9_58;
		this.aClass5_Sub9_58.aClass5_Sub9_60 = this.aClass5_Sub9_58;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(B)V")
	public void method4767() {
		while (true) {
			@Pc(7) Class5_Sub9 local7 = this.aClass5_Sub9_58.aClass5_Sub9_60;
			if (this.aClass5_Sub9_58 == local7) {
				this.aClass5_Sub9_59 = null;
				return;
			}
			local7.method5494();
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)Lclient!qp;")
	public Class5_Sub9 method4768() {
		@Pc(7) Class5_Sub9 local7 = this.aClass5_Sub9_58.aClass5_Sub9_60;
		if (local7 == this.aClass5_Sub9_58) {
			this.aClass5_Sub9_59 = null;
			return null;
		} else {
			this.aClass5_Sub9_59 = local7.aClass5_Sub9_60;
			return local7;
		}
	}

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "(I)I")
	public int method4769() {
		@Pc(12) int local12 = 0;
		for (@Pc(16) Class5_Sub9 local16 = this.aClass5_Sub9_58.aClass5_Sub9_60; local16 != this.aClass5_Sub9_58; local16 = local16.aClass5_Sub9_60) {
			local12++;
		}
		return local12;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(ILclient!qp;)V")
	public void method4772(@OriginalArg(1) Class5_Sub9 arg0) {
		if (arg0.aClass5_Sub9_61 != null) {
			arg0.method5494();
		}
		arg0.aClass5_Sub9_60 = this.aClass5_Sub9_58;
		arg0.aClass5_Sub9_61 = this.aClass5_Sub9_58.aClass5_Sub9_61;
		arg0.aClass5_Sub9_61.aClass5_Sub9_60 = arg0;
		arg0.aClass5_Sub9_60.aClass5_Sub9_61 = arg0;
	}

	@OriginalMember(owner = "client!ro", name = "d", descriptor = "(I)Lclient!qp;")
	public Class5_Sub9 method4775() {
		@Pc(7) Class5_Sub9 local7 = this.aClass5_Sub9_58.aClass5_Sub9_60;
		if (local7 == this.aClass5_Sub9_58) {
			return null;
		} else {
			local7.method5494();
			return local7;
		}
	}

	@OriginalMember(owner = "client!ro", name = "e", descriptor = "(I)Lclient!qp;")
	public Class5_Sub9 method4776() {
		@Pc(6) Class5_Sub9 local6 = this.aClass5_Sub9_59;
		if (local6 == this.aClass5_Sub9_58) {
			this.aClass5_Sub9_59 = null;
			return null;
		} else {
			this.aClass5_Sub9_59 = local6.aClass5_Sub9_60;
			return local6;
		}
	}
}
