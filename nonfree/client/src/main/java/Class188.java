import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class188 {

	@OriginalMember(owner = "client!te", name = "f", descriptor = "Lclient!lo;")
	private Class3_Sub7 aClass3_Sub7_56 = new Class3_Sub7();

	@OriginalMember(owner = "client!te", name = "p", descriptor = "Lclient!tr;")
	private final Class195 aClass195_9 = new Class195();

	@OriginalMember(owner = "client!te", name = "n", descriptor = "I")
	private final int anInt5941;

	@OriginalMember(owner = "client!te", name = "o", descriptor = "I")
	private int anInt5942;

	@OriginalMember(owner = "client!te", name = "l", descriptor = "Lclient!bo;")
	private final Class24 aClass24_28;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "(I)V")
	public Class188(@OriginalArg(0) int arg0) {
		this.anInt5941 = arg0;
		this.anInt5942 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass24_28 = new Class24(local19);
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(Z)V")
	public void method5058() {
		this.aClass195_9.method5215();
		this.aClass24_28.method608();
		this.aClass3_Sub7_56 = new Class3_Sub7();
		this.anInt5942 = this.anInt5941;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IJ)Lclient!lo;")
	public Class3_Sub7 method5061(@OriginalArg(1) long arg0) {
		@Pc(15) Class3_Sub7 local15 = (Class3_Sub7) this.aClass24_28.method609(arg0);
		if (local15 != null) {
			this.aClass195_9.method5213(local15);
		}
		return local15;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!lo;JI)V")
	public void method5063(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(1) long arg1) {
		if (this.anInt5942 == 0) {
			@Pc(11) Class3_Sub7 local11 = this.aClass195_9.method5208();
			local11.method5717();
			local11.method5385();
			if (local11 == this.aClass3_Sub7_56) {
				local11 = this.aClass195_9.method5208();
				local11.method5717();
				local11.method5385();
			}
		} else {
			this.anInt5942--;
		}
		this.aClass24_28.method598(arg1, arg0);
		this.aClass195_9.method5213(arg0);
	}
}
