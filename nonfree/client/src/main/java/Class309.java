import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!so")
public final class Class309 {

	@OriginalMember(owner = "client!so", name = "b", descriptor = "Lclient!jh;")
	private Class175 aClass175_11;

	@OriginalMember(owner = "client!so", name = "c", descriptor = "Lclient!jda;")
	private Class2_Sub5 aClass2_Sub5_61;

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "()V")
	private Class309() {
	}

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "(Lclient!jh;)V")
	public Class309(@OriginalArg(0) Class175 arg0) {
		this.aClass175_11 = arg0;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(I)Lclient!jda;")
	public Class2_Sub5 method7334() {
		@Pc(8) Class2_Sub5 local8 = this.aClass175_11.aClass2_Sub5_34.aClass2_Sub5_66;
		if (local8 == this.aClass175_11.aClass2_Sub5_34) {
			this.aClass2_Sub5_61 = null;
			return null;
		} else {
			this.aClass2_Sub5_61 = local8.aClass2_Sub5_66;
			return local8;
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(B)Lclient!jda;")
	public Class2_Sub5 method7335() {
		@Pc(11) Class2_Sub5 local11 = this.aClass2_Sub5_61;
		if (local11 == this.aClass175_11.aClass2_Sub5_34) {
			this.aClass2_Sub5_61 = null;
			return null;
		} else {
			this.aClass2_Sub5_61 = local11.aClass2_Sub5_66;
			return local11;
		}
	}
}
