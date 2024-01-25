import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pfa")
public final class Class267 {

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "Lclient!um;")
	private Class338 aClass338_2;

	@OriginalMember(owner = "client!pfa", name = "d", descriptor = "Lclient!bi;")
	private final Class31 aClass31_89;

	@OriginalMember(owner = "client!pfa", name = "b", descriptor = "Lclient!bi;")
	private final Class31 aClass31_88;

	@OriginalMember(owner = "client!pfa", name = "<init>", descriptor = "(Lclient!bi;Lclient!bi;)V")
	public Class267(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class31 arg1) {
		this.aClass31_89 = arg1;
		this.aClass31_88 = arg0;
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(B)Lclient!um;")
	private Class338 method5859() {
		if (this.aClass338_2 == null) {
			this.aClass338_2 = new Class338();
		}
		return this.aClass338_2;
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(ILclient!qo;)Lclient!ut;")
	public Interface23 method5860(@OriginalArg(1) Interface19 arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) Class258 local11 = arg0.method7256();
		if (Static332.aClass258_14 == local11) {
			return new Class95((Class282) arg0);
		} else if (Static240.aClass258_12 == local11) {
			return new Class264(this.method5859(), (Class251) arg0);
		} else if (local11 == Static406.aClass258_19) {
			return new Class157(this.aClass31_88, (Class156) arg0);
		} else if (local11 == Static157.aClass258_15) {
			return new Class157_Sub1(this.aClass31_88, (Class156_Sub1) arg0);
		} else if (Static327.aClass258_21 == local11) {
			return new Class29_Sub1(this.aClass31_88, this.aClass31_89, (Class52_Sub3) arg0);
		} else if (Static367.aClass258_20 == local11) {
			return new Class29_Sub2(this.aClass31_88, this.aClass31_89, (Class52_Sub2) arg0);
		} else if (Static583.aClass258_22 == local11) {
			return new Class29_Sub3(this.aClass31_88, this.aClass31_89, (Class52_Sub1) arg0);
		} else if (Static547.aClass258_18 == local11) {
			return new Class336(this.aClass31_88, this.aClass31_89, (Class256) arg0);
		} else if (Static158.aClass258_11 == local11) {
			return new Class185(this.aClass31_88, (Class214) arg0);
		} else if (local11 == Static289.aClass258_13) {
			return new Class29_Sub3_Sub1(this.aClass31_88, this.aClass31_89, (Class52_Sub1_Sub1) arg0);
		} else {
			return null;
		}
	}
}
