import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class252 {

	@OriginalMember(owner = "client!o", name = "a", descriptor = "Lclient!su;")
	private Class5_Sub2 aClass5_Sub2_44 = new Class5_Sub2();

	@OriginalMember(owner = "client!o", name = "l", descriptor = "Lclient!hf;")
	private final Class150 aClass150_7 = new Class150();

	@OriginalMember(owner = "client!o", name = "m", descriptor = "I")
	private final int anInt7024;

	@OriginalMember(owner = "client!o", name = "j", descriptor = "I")
	private int anInt7023;

	@OriginalMember(owner = "client!o", name = "o", descriptor = "Lclient!tga;")
	private final Class335 aClass335_36;

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "(I)V")
	public Class252(@OriginalArg(0) int arg0) {
		this.anInt7024 = arg0;
		this.anInt7023 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass335_36 = new Class335(local19);
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Z)V")
	public void method5970() {
		this.aClass150_7.method3097();
		this.aClass335_36.method7773();
		this.aClass5_Sub2_44 = new Class5_Sub2();
		this.anInt7023 = this.anInt7024;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(BJ)V")
	public void method5971(@OriginalArg(1) long arg0) {
		@Pc(18) Class5_Sub2 local18 = (Class5_Sub2) this.aClass335_36.method7766(arg0);
		if (local18 != null) {
			local18.method8829();
			local18.method8569();
			this.anInt7023++;
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(JI)Lclient!su;")
	public Class5_Sub2 method5973(@OriginalArg(0) long arg0) {
		@Pc(10) Class5_Sub2 local10 = (Class5_Sub2) this.aClass335_36.method7766(arg0);
		if (local10 != null) {
			this.aClass150_7.method3095(local10);
		}
		return local10;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Lclient!su;ZJ)V")
	public void method5974(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(2) long arg1) {
		if (this.anInt7023 == 0) {
			@Pc(14) Class5_Sub2 local14 = this.aClass150_7.method3101();
			local14.method8829();
			local14.method8569();
			if (this.aClass5_Sub2_44 == local14) {
				local14 = this.aClass150_7.method3101();
				local14.method8829();
				local14.method8569();
			}
		} else {
			this.anInt7023--;
		}
		this.aClass335_36.method7770(arg1, arg0);
		this.aClass150_7.method3095(arg0);
	}
}
