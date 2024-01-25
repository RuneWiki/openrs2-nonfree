import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fca")
public abstract class Class21 {

	@OriginalMember(owner = "client!fca", name = "c", descriptor = "Lclient!pw;")
	public Class234 aClass234_8 = Static66.aClass234_3;

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "Lclient!aq;")
	protected final Class16 aClass16_18;

	@OriginalMember(owner = "client!fca", name = "e", descriptor = "Lclient!ui;")
	protected final Class289 aClass289_8;

	@OriginalMember(owner = "client!fca", name = "d", descriptor = "Lclient!wda;")
	protected final Class9_Sub1_Sub2 aClass9_Sub1_Sub2_6;

	@OriginalMember(owner = "client!fca", name = "b", descriptor = "Z")
	public final boolean aBoolean475;

	@OriginalMember(owner = "client!fca", name = "<init>", descriptor = "(Lclient!wda;Lclient!aq;Lclient!ui;ZI)V")
	protected Class21(@OriginalArg(0) Class9_Sub1_Sub2 arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(2) Class289 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.aClass16_18 = arg1;
		this.aClass289_8 = arg2;
		this.aClass9_Sub1_Sub2_6 = arg0;
		this.aBoolean475 = arg3;
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(Lclient!pw;I)V")
	public void method7955(@OriginalArg(0) Class234 arg0) {
		this.aClass234_8 = arg0;
	}

	@OriginalMember(owner = "client!fca", name = "b", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	public abstract IDirect3DBaseTexture method6151();
}
