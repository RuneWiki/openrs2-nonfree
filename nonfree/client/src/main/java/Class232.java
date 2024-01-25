import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mha")
public final class Class232 {

	@OriginalMember(owner = "client!mha", name = "i", descriptor = "Lclient!lh;")
	private Class5_Sub5 aClass5_Sub5_38 = new Class5_Sub5();

	@OriginalMember(owner = "client!mha", name = "j", descriptor = "Lclient!vu;")
	private final Class368 aClass368_5 = new Class368();

	@OriginalMember(owner = "client!mha", name = "m", descriptor = "I")
	private final int anInt5781;

	@OriginalMember(owner = "client!mha", name = "l", descriptor = "I")
	private int anInt5780;

	@OriginalMember(owner = "client!mha", name = "n", descriptor = "Lclient!pl;")
	private final Class273 aClass273_19;

	@OriginalMember(owner = "client!mha", name = "<init>", descriptor = "(I)V")
	public Class232(@OriginalArg(0) int arg0) {
		this.anInt5781 = arg0;
		this.anInt5780 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; arg0 > local19 + local19; local19 += local19) {
		}
		this.aClass273_19 = new Class273(local19);
	}

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(JZ)V")
	public void method5127(@OriginalArg(0) long arg0) {
		@Pc(19) Class5_Sub5 local19 = (Class5_Sub5) this.aClass273_19.method6581(arg0);
		if (local19 != null) {
			local19.method9047();
			local19.method8952();
			this.anInt5780++;
		}
	}

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(IJ)Lclient!lh;")
	public Class5_Sub5 method5128(@OriginalArg(1) long arg0) {
		@Pc(16) Class5_Sub5 local16 = (Class5_Sub5) this.aClass273_19.method6581(arg0);
		if (local16 != null) {
			this.aClass368_5.method8709(local16);
		}
		return local16;
	}

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(Lclient!lh;JI)V")
	public void method5129(@OriginalArg(0) Class5_Sub5 arg0, @OriginalArg(1) long arg1) {
		if (this.anInt5780 == 0) {
			@Pc(10) Class5_Sub5 local10 = this.aClass368_5.method8705();
			local10.method9047();
			local10.method8952();
			if (local10 == this.aClass5_Sub5_38) {
				local10 = this.aClass368_5.method8705();
				local10.method9047();
				local10.method8952();
			}
		} else {
			this.anInt5780--;
		}
		this.aClass273_19.method6585(arg1, arg0);
		this.aClass368_5.method8709(arg0);
	}

	@OriginalMember(owner = "client!mha", name = "b", descriptor = "(I)V")
	public void method5130() {
		this.aClass368_5.method8703();
		this.aClass273_19.method6586();
		this.aClass5_Sub5_38 = new Class5_Sub5();
		this.anInt5780 = this.anInt5781;
	}
}
