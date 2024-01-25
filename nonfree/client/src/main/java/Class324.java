import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rv")
public final class Class324 {

	@OriginalMember(owner = "client!rv", name = "k", descriptor = "Lclient!dga;")
	private Class4_Sub4 aClass4_Sub4_8;

	@OriginalMember(owner = "client!rv", name = "j", descriptor = "Lclient!dga;")
	public final Class4_Sub4 aClass4_Sub4_7 = new Class4_Sub4();

	@OriginalMember(owner = "client!rv", name = "<init>", descriptor = "()V")
	public Class324() {
		this.aClass4_Sub4_7.aClass4_Sub4_10 = this.aClass4_Sub4_7;
		this.aClass4_Sub4_7.aClass4_Sub4_9 = this.aClass4_Sub4_7;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(B)V")
	public void method7946() {
		while (true) {
			@Pc(5) Class4_Sub4 local5 = this.aClass4_Sub4_7.aClass4_Sub4_9;
			if (this.aClass4_Sub4_7 == local5) {
				this.aClass4_Sub4_8 = null;
				return;
			}
			local5.method8320();
		}
	}

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(I)Lclient!dga;")
	public Class4_Sub4 method7947() {
		@Pc(7) Class4_Sub4 local7 = this.aClass4_Sub4_7.aClass4_Sub4_9;
		if (this.aClass4_Sub4_7 == local7) {
			this.aClass4_Sub4_8 = null;
			return null;
		} else {
			this.aClass4_Sub4_8 = local7.aClass4_Sub4_9;
			return local7;
		}
	}

	@OriginalMember(owner = "client!rv", name = "d", descriptor = "(I)I")
	public int method7948() {
		@Pc(16) int local16 = 0;
		for (@Pc(20) Class4_Sub4 local20 = this.aClass4_Sub4_7.aClass4_Sub4_9; local20 != this.aClass4_Sub4_7; local20 = local20.aClass4_Sub4_9) {
			local16++;
		}
		return local16;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(I)Lclient!dga;")
	public Class4_Sub4 method7949() {
		@Pc(15) Class4_Sub4 local15 = this.aClass4_Sub4_8;
		if (local15 == this.aClass4_Sub4_7) {
			this.aClass4_Sub4_8 = null;
			return null;
		} else {
			this.aClass4_Sub4_8 = local15.aClass4_Sub4_9;
			return local15;
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lclient!dga;I)V")
	public void method7953(@OriginalArg(0) Class4_Sub4 arg0) {
		if (arg0.aClass4_Sub4_10 != null) {
			arg0.method8320();
		}
		arg0.aClass4_Sub4_10 = this.aClass4_Sub4_7.aClass4_Sub4_10;
		arg0.aClass4_Sub4_9 = this.aClass4_Sub4_7;
		arg0.aClass4_Sub4_10.aClass4_Sub4_9 = arg0;
		arg0.aClass4_Sub4_9.aClass4_Sub4_10 = arg0;
	}
}
