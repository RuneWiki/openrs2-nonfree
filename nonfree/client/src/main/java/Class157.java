import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iha")
public final class Class157 {

	@OriginalMember(owner = "client!iha", name = "b", descriptor = "Lclient!ul;")
	private Class342 aClass342_1;

	@OriginalMember(owner = "client!iha", name = "j", descriptor = "Lclient!la;")
	private final Class196 aClass196_47;

	@OriginalMember(owner = "client!iha", name = "c", descriptor = "Lclient!la;")
	private final Class196 aClass196_46;

	@OriginalMember(owner = "client!iha", name = "<init>", descriptor = "(Lclient!la;Lclient!la;)V")
	public Class157(@OriginalArg(0) Class196 arg0, @OriginalArg(1) Class196 arg1) {
		this.aClass196_47 = arg1;
		this.aClass196_46 = arg0;
	}

	@OriginalMember(owner = "client!iha", name = "b", descriptor = "(I)Lclient!ul;")
	private Class342 method3943() {
		if (this.aClass342_1 == null) {
			this.aClass342_1 = new Class342();
		}
		return this.aClass342_1;
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(BLclient!bia;)Lclient!ko;")
	public Interface13 method3944(@OriginalArg(1) Interface4 arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(17) Class146 local17 = arg0.method8713();
		if (local17 == Static305.aClass146_5) {
			return new Class160((Class377) arg0);
		} else if (Static447.aClass146_6 == local17) {
			return new Class319(this.method3943(), (Class269) arg0);
		} else if (local17 == Static461.aClass146_7) {
			return new Class32(this.aClass196_46, (Class25) arg0);
		} else if (Static635.aClass146_11 == local17) {
			return new Class32_Sub1(this.aClass196_46, (Class25_Sub1) arg0);
		} else if (Static428.aClass146_4 == local17) {
			return new Class10_Sub3(this.aClass196_46, this.aClass196_47, (Class6_Sub3) arg0);
		} else if (local17 == Static506.aClass146_8) {
			return new Class10_Sub2(this.aClass196_46, this.aClass196_47, (Class6_Sub1) arg0);
		} else if (local17 == Static47.aClass146_1) {
			return new Class10_Sub1(this.aClass196_46, this.aClass196_47, (Class6_Sub2) arg0);
		} else if (local17 == Static506.aClass146_9) {
			return new Class355(this.aClass196_46, this.aClass196_47, (Class274) arg0);
		} else if (local17 == Static612.aClass146_10) {
			return new Class288(this.aClass196_46, (Class112) arg0);
		} else if (Static165.aClass146_2 == local17) {
			return new Class10_Sub1_Sub1(this.aClass196_46, this.aClass196_47, (Class6_Sub2_Sub1) arg0);
		} else {
			return null;
		}
	}
}
