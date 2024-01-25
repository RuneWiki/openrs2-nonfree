import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public abstract class Class87 {

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "Lclient!cba;")
	public Class46 aClass46_10 = Static472.aClass46_9;

	@OriginalMember(owner = "client!nn", name = "e", descriptor = "Z")
	public final boolean aBoolean559;

	@OriginalMember(owner = "client!nn", name = "c", descriptor = "Lclient!hi;")
	protected final Class141 aClass141_14;

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "Lclient!ne;")
	protected final Class239 aClass239_18;

	@OriginalMember(owner = "client!nn", name = "d", descriptor = "Lclient!ss;")
	protected final Class66_Sub1_Sub2 aClass66_Sub1_Sub2_6;

	@OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(Lclient!ss;Lclient!hi;Lclient!ne;ZI)V")
	protected Class87(@OriginalArg(0) Class66_Sub1_Sub2 arg0, @OriginalArg(1) Class141 arg1, @OriginalArg(2) Class239 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.aBoolean559 = arg3;
		this.aClass141_14 = arg1;
		this.aClass239_18 = arg2;
		this.aClass66_Sub1_Sub2_6 = arg0;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lclient!cba;I)V")
	public void method6762(@OriginalArg(0) Class46 arg0) {
		this.aClass46_10 = arg0;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	public abstract IDirect3DBaseTexture method6716();
}
