import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vq")
public final class Class260 {

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "Lclient!wf;")
	private Class4_Sub2 aClass4_Sub2_58 = new Class4_Sub2();

	@OriginalMember(owner = "client!vq", name = "i", descriptor = "Lclient!tk;")
	private final Class239 aClass239_10 = new Class239();

	@OriginalMember(owner = "client!vq", name = "k", descriptor = "I")
	private int anInt7156;

	@OriginalMember(owner = "client!vq", name = "f", descriptor = "I")
	private final int anInt7155;

	@OriginalMember(owner = "client!vq", name = "g", descriptor = "Lclient!ek;")
	private final Class67 aClass67_35;

	@OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(I)V")
	public Class260(@OriginalArg(0) int arg0) {
		this.anInt7156 = arg0;
		this.anInt7155 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass67_35 = new Class67(local19);
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(JZ)Lclient!wf;")
	public Class4_Sub2 method5744(@OriginalArg(0) long arg0) {
		@Pc(15) Class4_Sub2 local15 = (Class4_Sub2) this.aClass67_35.method1429(arg0);
		if (local15 != null) {
			this.aClass239_10.method5126(local15);
		}
		return local15;
	}

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "(I)V")
	public void method5745() {
		this.aClass239_10.method5122();
		this.aClass67_35.method1431();
		this.aClass4_Sub2_58 = new Class4_Sub2();
		this.anInt7156 = this.anInt7155;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lclient!wf;JI)V")
	public void method5746(@OriginalArg(0) Class4_Sub2 arg0, @OriginalArg(1) long arg1) {
		if (this.anInt7156 == 0) {
			@Pc(18) Class4_Sub2 local18 = this.aClass239_10.method5119();
			local18.method6059();
			local18.method5538();
			if (this.aClass4_Sub2_58 == local18) {
				local18 = this.aClass239_10.method5119();
				local18.method6059();
				local18.method5538();
			}
		} else {
			this.anInt7156--;
		}
		this.aClass67_35.method1426(arg0, arg1);
		this.aClass239_10.method5126(arg0);
	}
}
