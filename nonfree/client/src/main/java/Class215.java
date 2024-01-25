import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wf")
public final class Class215 {

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "Lclient!qp;")
	private Class5_Sub9 aClass5_Sub9_62 = new Class5_Sub9();

	@OriginalMember(owner = "client!wf", name = "k", descriptor = "Lclient!ro;")
	private final Class176 aClass176_11 = new Class176();

	@OriginalMember(owner = "client!wf", name = "m", descriptor = "I")
	private final int anInt6420;

	@OriginalMember(owner = "client!wf", name = "i", descriptor = "I")
	private int anInt6417;

	@OriginalMember(owner = "client!wf", name = "n", descriptor = "Lclient!cs;")
	private final Class42 aClass42_58;

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(I)V")
	public Class215(@OriginalArg(0) int arg0) {
		this.anInt6420 = arg0;
		this.anInt6417 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass42_58 = new Class42(local19);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(BJ)Lclient!qp;")
	public Class5_Sub9 method5683(@OriginalArg(1) long arg0) {
		@Pc(10) Class5_Sub9 local10 = (Class5_Sub9) this.aClass42_58.method1052(arg0);
		if (local10 != null) {
			this.aClass176_11.method4772(local10);
		}
		return local10;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lclient!qp;BJ)V")
	public void method5687(@OriginalArg(0) Class5_Sub9 arg0, @OriginalArg(2) long arg1) {
		if (this.anInt6417 == 0) {
			@Pc(26) Class5_Sub9 local26 = this.aClass176_11.method4775();
			local26.method5803();
			local26.method5494();
			if (local26 == this.aClass5_Sub9_62) {
				local26 = this.aClass176_11.method4775();
				local26.method5803();
				local26.method5494();
			}
		} else {
			this.anInt6417--;
		}
		this.aClass42_58.method1050(arg1, arg0);
		this.aClass176_11.method4772(arg0);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V")
	public void method5688() {
		this.aClass176_11.method4767();
		this.aClass42_58.method1054();
		this.aClass5_Sub9_62 = new Class5_Sub9();
		this.anInt6417 = this.anInt6420;
	}
}
