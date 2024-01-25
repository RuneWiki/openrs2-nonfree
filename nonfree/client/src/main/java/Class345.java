import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ut")
public final class Class345 {

	@OriginalMember(owner = "client!ut", name = "k", descriptor = "Lclient!ab;")
	private Class3_Sub1 aClass3_Sub1_63 = new Class3_Sub1();

	@OriginalMember(owner = "client!ut", name = "o", descriptor = "Lclient!bj;")
	private final Class30 aClass30_12 = new Class30();

	@OriginalMember(owner = "client!ut", name = "l", descriptor = "I")
	private int anInt9769;

	@OriginalMember(owner = "client!ut", name = "n", descriptor = "I")
	private final int anInt9770;

	@OriginalMember(owner = "client!ut", name = "m", descriptor = "Lclient!sga;")
	private final Class307 aClass307_51;

	@OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(I)V")
	public Class345(@OriginalArg(0) int arg0) {
		this.anInt9769 = arg0;
		this.anInt9770 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass307_51 = new Class307(local19);
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Z)V")
	public void method8052() {
		this.aClass30_12.method778();
		this.aClass307_51.method7427();
		this.aClass3_Sub1_63 = new Class3_Sub1();
		this.anInt9769 = this.anInt9770;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(ZJ)V")
	public void method8054(@OriginalArg(1) long arg0) {
		@Pc(10) Class3_Sub1 local10 = (Class3_Sub1) this.aClass307_51.method7424(arg0);
		if (local10 != null) {
			local10.method8671();
			local10.method8621();
			this.anInt9769++;
		}
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(JI)Lclient!ab;")
	public Class3_Sub1 method8056(@OriginalArg(0) long arg0) {
		@Pc(10) Class3_Sub1 local10 = (Class3_Sub1) this.aClass307_51.method7424(arg0);
		if (local10 != null) {
			this.aClass30_12.method779(local10);
		}
		return local10;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lclient!ab;IJ)V")
	public void method8058(@OriginalArg(0) Class3_Sub1 arg0, @OriginalArg(2) long arg1) {
		if (this.anInt9769 == 0) {
			@Pc(23) Class3_Sub1 local23 = this.aClass30_12.method781();
			local23.method8671();
			local23.method8621();
			if (this.aClass3_Sub1_63 == local23) {
				local23 = this.aClass30_12.method781();
				local23.method8671();
				local23.method8621();
			}
		} else {
			this.anInt9769--;
		}
		this.aClass307_51.method7425(arg1, arg0);
		this.aClass30_12.method779(arg0);
	}
}
