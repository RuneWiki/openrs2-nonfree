import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cfa")
public final class Class59 {

	@OriginalMember(owner = "client!cfa", name = "h", descriptor = "Lclient!vl;")
	private Class388 aClass388_1;

	@OriginalMember(owner = "client!cfa", name = "e", descriptor = "Lclient!no;")
	private Class2_Sub6 aClass2_Sub6_13;

	@OriginalMember(owner = "client!cfa", name = "<init>", descriptor = "()V")
	private Class59() {
	}

	@OriginalMember(owner = "client!cfa", name = "<init>", descriptor = "(Lclient!vl;)V")
	public Class59(@OriginalArg(0) Class388 arg0) {
		this.aClass388_1 = arg0;
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(B)Lclient!no;")
	public Class2_Sub6 method1201() {
		@Pc(14) Class2_Sub6 local14 = this.aClass2_Sub6_13;
		if (local14 == this.aClass388_1.aClass2_Sub6_66) {
			this.aClass2_Sub6_13 = null;
			return null;
		} else {
			this.aClass2_Sub6_13 = local14.aClass2_Sub6_64;
			return local14;
		}
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(I)Lclient!no;")
	public Class2_Sub6 method1202() {
		@Pc(8) Class2_Sub6 local8 = this.aClass388_1.aClass2_Sub6_66.aClass2_Sub6_64;
		if (local8 == this.aClass388_1.aClass2_Sub6_66) {
			this.aClass2_Sub6_13 = null;
			return null;
		} else {
			this.aClass2_Sub6_13 = local8.aClass2_Sub6_64;
			return local8;
		}
	}
}
