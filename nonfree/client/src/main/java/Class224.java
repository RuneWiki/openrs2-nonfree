import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mr")
public final class Class224 {

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "Lclient!jn;")
	private final Class167 aClass167_31 = new Class167(64);

	@OriginalMember(owner = "client!mr", name = "j", descriptor = "Lclient!vo;")
	private final Class348 aClass348_71;

	@OriginalMember(owner = "client!mr", name = "g", descriptor = "Lclient!vo;")
	private final Class348 aClass348_70;

	@OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(ILclient!vo;Lclient!vo;)V")
	public Class224(@OriginalArg(0) int arg0, @OriginalArg(1) Class348 arg1, @OriginalArg(2) Class348 arg2) {
		this.aClass348_71 = arg2;
		this.aClass348_70 = arg1;
		if (this.aClass348_70 != null) {
			this.aClass348_70.method7981(0);
		}
		if (this.aClass348_71 != null) {
			this.aClass348_71.method7981(0);
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(II)Lclient!ck;")
	public Class4_Sub6_Sub2 method5097(@OriginalArg(1) int arg0) {
		@Pc(11) Class4_Sub6_Sub2 local11 = (Class4_Sub6_Sub2) this.aClass167_31.method3966((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(27) byte[] local27;
		if (arg0 < 32768) {
			local27 = this.aClass348_70.method7964(arg0, 0);
		} else {
			local27 = this.aClass348_71.method7964(arg0 & 0x7FFF, 0);
		}
		local11 = new Class4_Sub6_Sub2();
		if (local27 != null) {
			local11.method1506(new Class4_Sub13(local27));
		}
		if (arg0 >= 32768) {
			local11.method1509();
		}
		this.aClass167_31.method3974((long) arg0, local11);
		return local11;
	}
}
