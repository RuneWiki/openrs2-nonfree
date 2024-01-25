import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public abstract class Class52 {

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "Lclient!vea;")
	public Class384 aClass384_9 = Static108.aClass384_7;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "Lclient!ns;")
	protected final Class261 aClass261_8;

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "Lclient!hd;")
	protected final Class145 aClass145_8;

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "Lclient!de;")
	protected final Class67_Sub1_Sub1 aClass67_Sub1_Sub1_4;

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "Z")
	public final boolean aBoolean450;

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(Lclient!de;Lclient!hd;Lclient!ns;ZI)V")
	protected Class52(@OriginalArg(0) Class67_Sub1_Sub1 arg0, @OriginalArg(1) Class145 arg1, @OriginalArg(2) Class261 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.aClass261_8 = arg2;
		this.aClass145_8 = arg1;
		this.aClass67_Sub1_Sub1_4 = arg0;
		this.aBoolean450 = arg3;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!vea;I)V")
	public void method9258(@OriginalArg(0) Class384 arg0) {
		this.aClass384_9 = arg0;
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	public abstract IDirect3DBaseTexture method4344();
}
