import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vv")
public final class Class261 {

	@OriginalMember(owner = "client!vv", name = "i", descriptor = "Lclient!fs;")
	private Class2_Sub5 aClass2_Sub5_56;

	@OriginalMember(owner = "client!vv", name = "g", descriptor = "Lclient!fs;")
	private final Class2_Sub5 aClass2_Sub5_55 = new Class2_Sub5();

	@OriginalMember(owner = "client!vv", name = "<init>", descriptor = "()V")
	public Class261() {
		this.aClass2_Sub5_55.aClass2_Sub5_57 = this.aClass2_Sub5_55;
		this.aClass2_Sub5_55.aClass2_Sub5_58 = this.aClass2_Sub5_55;
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(Z)I")
	public int method5484() {
		@Pc(13) int local13 = 0;
		@Pc(17) Class2_Sub5 local17 = this.aClass2_Sub5_55.aClass2_Sub5_57;
		while (this.aClass2_Sub5_55 != local17) {
			local17 = local17.aClass2_Sub5_57;
			local13++;
		}
		return local13;
	}

	@OriginalMember(owner = "client!vv", name = "b", descriptor = "(Z)Lclient!fs;")
	public Class2_Sub5 method5485() {
		@Pc(7) Class2_Sub5 local7 = this.aClass2_Sub5_55.aClass2_Sub5_57;
		if (this.aClass2_Sub5_55 == local7) {
			return null;
		} else {
			local7.method5621();
			return local7;
		}
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(I)V")
	public void method5486() {
		while (true) {
			@Pc(5) Class2_Sub5 local5 = this.aClass2_Sub5_55.aClass2_Sub5_57;
			if (local5 == this.aClass2_Sub5_55) {
				this.aClass2_Sub5_56 = null;
				return;
			}
			local5.method5621();
		}
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(ILclient!fs;)V")
	public void method5487(@OriginalArg(1) Class2_Sub5 arg0) {
		if (arg0.aClass2_Sub5_58 != null) {
			arg0.method5621();
		}
		arg0.aClass2_Sub5_57 = this.aClass2_Sub5_55;
		arg0.aClass2_Sub5_58 = this.aClass2_Sub5_55.aClass2_Sub5_58;
		arg0.aClass2_Sub5_58.aClass2_Sub5_57 = arg0;
		arg0.aClass2_Sub5_57.aClass2_Sub5_58 = arg0;
	}

	@OriginalMember(owner = "client!vv", name = "c", descriptor = "(Z)Lclient!fs;")
	public Class2_Sub5 method5489() {
		@Pc(16) Class2_Sub5 local16 = this.aClass2_Sub5_55.aClass2_Sub5_57;
		if (this.aClass2_Sub5_55 == local16) {
			this.aClass2_Sub5_56 = null;
			return null;
		} else {
			this.aClass2_Sub5_56 = local16.aClass2_Sub5_57;
			return local16;
		}
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(B)Lclient!fs;")
	public Class2_Sub5 method5490() {
		@Pc(6) Class2_Sub5 local6 = this.aClass2_Sub5_56;
		if (local6 == this.aClass2_Sub5_55) {
			this.aClass2_Sub5_56 = null;
			return null;
		} else {
			this.aClass2_Sub5_56 = local6.aClass2_Sub5_57;
			return local6;
		}
	}
}
