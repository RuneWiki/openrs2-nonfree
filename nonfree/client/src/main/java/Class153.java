import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hh")
public final class Class153 {

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "Lclient!rba;")
	private Class5_Sub1 aClass5_Sub1_21;

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "Lclient!wca;")
	private Class388 aClass388_3;

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "()V")
	private Class153() {
	}

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Lclient!wca;)V")
	public Class153(@OriginalArg(0) Class388 arg0) {
		this.aClass388_3 = arg0;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)Lclient!rba;")
	public Class5_Sub1 method3423() {
		@Pc(8) Class5_Sub1 local8 = this.aClass388_3.aClass5_Sub1_66.aClass5_Sub1_65;
		if (this.aClass388_3.aClass5_Sub1_66 == local8) {
			this.aClass5_Sub1_21 = null;
			return null;
		} else {
			this.aClass5_Sub1_21 = local8.aClass5_Sub1_65;
			return local8;
		}
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)Lclient!rba;")
	public Class5_Sub1 method3425() {
		@Pc(12) Class5_Sub1 local12 = this.aClass5_Sub1_21;
		if (this.aClass388_3.aClass5_Sub1_66 == local12) {
			this.aClass5_Sub1_21 = null;
			return null;
		} else {
			this.aClass5_Sub1_21 = local12.aClass5_Sub1_65;
			return local12;
		}
	}
}
