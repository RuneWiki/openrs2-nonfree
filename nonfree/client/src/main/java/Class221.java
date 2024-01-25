import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nr")
public final class Class221 {

	@OriginalMember(owner = "client!nr", name = "d", descriptor = "Lclient!vh;")
	private final Class330 aClass330_37 = new Class330(256);

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "Lclient!gj;")
	private final Class90_Sub3 aClass90_Sub3_12;

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "Lclient!e;")
	private final Interface2 anInterface2_11;

	@OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(Lclient!gj;Lclient!e;)V")
	public Class221(@OriginalArg(0) Class90_Sub3 arg0, @OriginalArg(1) Interface2 arg1) {
		this.aClass90_Sub3_12 = arg0;
		this.anInterface2_11 = arg1;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(BI)Lclient!hr;")
	public Interface7 method5325(@OriginalArg(1) int arg0) {
		@Pc(10) Object local10 = this.aClass330_37.method7677((long) arg0);
		if (local10 != null) {
			return (Interface7) local10;
		} else if (this.anInterface2_11.method3089(arg0)) {
			@Pc(34) Class115 local34 = this.anInterface2_11.method3085(arg0);
			@Pc(43) int local43 = local34.aBoolean233 ? 64 : this.aClass90_Sub3_12.anInt9565;
			@Pc(78) Interface7 local78;
			if (local34.aBoolean229 && this.aClass90_Sub3_12.method7496()) {
				@Pc(60) float[] local60 = this.anInterface2_11.method3086(local43, arg0, 0.7F, local43);
				local78 = this.aClass90_Sub3_12.method7532(local43, local60, Static493.aClass171_15, local34.aByte37 != 0, local43);
			} else {
				@Pc(103) int[] local103 = local34.aBoolean228 ? this.anInterface2_11.method3087(local43, local43, arg0, 0.7F) : this.anInterface2_11.method3088(arg0, local43, 0.7F, local43, true);
				local78 = this.aClass90_Sub3_12.method7597(local43, local43, local103, local34.aByte37 != 0);
			}
			local78.method7047(local34.aBoolean227, local34.aBoolean234);
			this.aClass330_37.method7676(local78, (long) arg0);
			return local78;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(Z)V")
	public void method5327() {
		this.aClass330_37.method7680(5);
	}

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "(I)V")
	public void method5329() {
		this.aClass330_37.method7688();
	}
}
