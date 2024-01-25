import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lm")
public final class Class218 implements Interface13 {

	@OriginalMember(owner = "client!lm", name = "g", descriptor = "Lclient!da;")
	private Class56 aClass56_11;

	@OriginalMember(owner = "client!lm", name = "d", descriptor = "Lclient!bt;")
	private final Class34 aClass34_77;

	@OriginalMember(owner = "client!lm", name = "f", descriptor = "Lclient!ii;")
	private final Class166 aClass166_1;

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "Lclient!bt;")
	private final Class34 aClass34_76;

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lclient!bt;Lclient!bt;Lclient!ii;)V")
	public Class218(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(2) Class166 arg2) {
		this.aClass34_77 = arg1;
		this.aClass166_1 = arg2;
		this.aClass34_76 = arg0;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8637() {
		@Pc(15) int local15 = this.aClass166_1.aClass291_5.method6524(Static606.anInt9314, this.aClass166_1.anInt4118) + this.aClass166_1.anInt4121;
		@Pc(30) int local30 = this.aClass166_1.aClass125_8.method2842(this.aClass166_1.anInt4123, Static353.anInt5368) + this.aClass166_1.anInt4119;
		this.aClass56_11.method8065(0, this.aClass166_1.anInt4116, this.aClass166_1.anInt4124, 0, local30, this.aClass166_1.anInt4114, this.aClass166_1.aString39, this.aClass166_1.anInt4125, this.aClass166_1.anInt4123, (Class17[]) null, (Class1) null, this.aClass166_1.anInt4118, (int[]) null, local15, this.aClass166_1.anInt4126);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8636() {
		@Pc(11) boolean local11 = true;
		if (!this.aClass34_76.method1235(this.aClass166_1.anInt4112)) {
			local11 = false;
		}
		if (!this.aClass34_77.method1235(this.aClass166_1.anInt4112)) {
			local11 = false;
		}
		return local11;
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(I)V")
	@Override
	public void method8638() {
		@Pc(11) Class31 local11 = Static662.method8784(this.aClass34_77, this.aClass166_1.anInt4112);
		this.aClass56_11 = Static582.aClass33_13.method8081(local11, Static682.method1652(this.aClass34_76, this.aClass166_1.anInt4112));
	}
}
