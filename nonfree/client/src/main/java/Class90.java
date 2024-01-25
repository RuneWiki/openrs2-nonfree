import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dt")
public final class Class90 {

	@OriginalMember(owner = "client!dt", name = "c", descriptor = "Lclient!ut;")
	private Class358 aClass358_2;

	@OriginalMember(owner = "client!dt", name = "j", descriptor = "Lclient!kh;")
	private Class5_Sub3 aClass5_Sub3_11;

	@OriginalMember(owner = "client!dt", name = "<init>", descriptor = "()V")
	private Class90() {
	}

	@OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(Lclient!ut;)V")
	public Class90(@OriginalArg(0) Class358 arg0) {
		this.aClass358_2 = arg0;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(I)Lclient!kh;")
	public Class5_Sub3 method2234() {
		@Pc(13) Class5_Sub3 local13 = this.aClass358_2.aClass5_Sub3_60.aClass5_Sub3_66;
		if (local13 == this.aClass358_2.aClass5_Sub3_60) {
			this.aClass5_Sub3_11 = null;
			return null;
		} else {
			this.aClass5_Sub3_11 = local13.aClass5_Sub3_66;
			return local13;
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(B)Lclient!kh;")
	public Class5_Sub3 method2235() {
		@Pc(6) Class5_Sub3 local6 = this.aClass5_Sub3_11;
		if (this.aClass358_2.aClass5_Sub3_60 == local6) {
			this.aClass5_Sub3_11 = null;
			return null;
		} else {
			this.aClass5_Sub3_11 = local6.aClass5_Sub3_66;
			return local6;
		}
	}
}
