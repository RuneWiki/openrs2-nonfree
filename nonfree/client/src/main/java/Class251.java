import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!os")
public final class Class251 {

	@OriginalMember(owner = "client!os", name = "e", descriptor = "Lclient!vl;")
	private Class2_Sub6 aClass2_Sub6_52;

	@OriginalMember(owner = "client!os", name = "h", descriptor = "Lclient!mn;")
	private Class211 aClass211_5;

	@OriginalMember(owner = "client!os", name = "<init>", descriptor = "()V")
	private Class251() {
	}

	@OriginalMember(owner = "client!os", name = "<init>", descriptor = "(Lclient!mn;)V")
	public Class251(@OriginalArg(0) Class211 arg0) {
		this.aClass211_5 = arg0;
	}

	@OriginalMember(owner = "client!os", name = "b", descriptor = "(I)Lclient!vl;")
	public Class2_Sub6 method6623() {
		@Pc(15) Class2_Sub6 local15 = this.aClass211_5.aClass2_Sub6_48.aClass2_Sub6_66;
		if (local15 == this.aClass211_5.aClass2_Sub6_48) {
			this.aClass2_Sub6_52 = null;
			return null;
		} else {
			this.aClass2_Sub6_52 = local15.aClass2_Sub6_66;
			return local15;
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(B)Lclient!vl;")
	public Class2_Sub6 method6626() {
		@Pc(11) Class2_Sub6 local11 = this.aClass2_Sub6_52;
		if (local11 == this.aClass211_5.aClass2_Sub6_48) {
			this.aClass2_Sub6_52 = null;
			return null;
		} else {
			this.aClass2_Sub6_52 = local11.aClass2_Sub6_66;
			return local11;
		}
	}
}
