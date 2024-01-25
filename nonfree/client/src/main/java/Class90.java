import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dl")
public final class Class90 {

	@OriginalMember(owner = "client!dl", name = "i", descriptor = "Lclient!cja;")
	private Class5_Sub5 aClass5_Sub5_11 = new Class5_Sub5();

	@OriginalMember(owner = "client!dl", name = "e", descriptor = "Lclient!gq;")
	private final Class149 aClass149_6 = new Class149();

	@OriginalMember(owner = "client!dl", name = "d", descriptor = "I")
	private int anInt1828;

	@OriginalMember(owner = "client!dl", name = "h", descriptor = "I")
	private final int anInt1829;

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "Lclient!qha;")
	private final Class291 aClass291_8;

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(I)V")
	public Class90(@OriginalArg(0) int arg0) {
		this.anInt1828 = arg0;
		this.anInt1829 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass291_8 = new Class291(local19);
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(JI)V")
	public void method1630(@OriginalArg(0) long arg0) {
		@Pc(10) Class5_Sub5 local10 = (Class5_Sub5) this.aClass291_8.method6993(arg0, 1);
		if (local10 != null) {
			local10.method9327(1);
			local10.method9186();
			this.anInt1828++;
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lclient!cja;IJ)V")
	public void method1631(@OriginalArg(0) Class5_Sub5 arg0, @OriginalArg(2) long arg1) {
		if (this.anInt1828 == 0) {
			@Pc(14) Class5_Sub5 local14 = this.aClass149_6.method2886();
			local14.method9327(1);
			local14.method9186();
			if (this.aClass5_Sub5_11 == local14) {
				local14 = this.aClass149_6.method2886();
				local14.method9327(1);
				local14.method9186();
			}
		} else {
			this.anInt1828--;
		}
		this.aClass291_8.method6984(arg1, arg0);
		this.aClass149_6.method2889(arg0);
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(BJ)Lclient!cja;")
	public Class5_Sub5 method1632(@OriginalArg(1) long arg0) {
		@Pc(16) Class5_Sub5 local16 = (Class5_Sub5) this.aClass291_8.method6993(arg0, 1);
		if (local16 != null) {
			this.aClass149_6.method2889(local16);
		}
		return local16;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)V")
	public void method1633() {
		this.aClass149_6.method2891();
		this.aClass291_8.method6986(-112);
		this.aClass5_Sub5_11 = new Class5_Sub5();
		this.anInt1828 = this.anInt1829;
	}
}
