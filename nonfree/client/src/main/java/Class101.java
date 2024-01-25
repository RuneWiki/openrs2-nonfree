import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public abstract class Class101 {

	@OriginalMember(owner = "client!en", name = "c", descriptor = "Lclient!cr;")
	public Class67 aClass67_9 = Static671.aClass67_11;

	@OriginalMember(owner = "client!en", name = "a", descriptor = "Lclient!ki;")
	protected final Class143_Sub1_Sub1 aClass143_Sub1_Sub1_5;

	@OriginalMember(owner = "client!en", name = "d", descriptor = "Z")
	public final boolean aBoolean587;

	@OriginalMember(owner = "client!en", name = "b", descriptor = "Lclient!kn;")
	protected final Class206 aClass206_17;

	@OriginalMember(owner = "client!en", name = "e", descriptor = "Lclient!ofa;")
	protected final Class255 aClass255_20;

	@OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Lclient!ki;Lclient!ofa;Lclient!kn;ZI)V")
	protected Class101(@OriginalArg(0) Class143_Sub1_Sub1 arg0, @OriginalArg(1) Class255 arg1, @OriginalArg(2) Class206 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.aClass143_Sub1_Sub1_5 = arg0;
		this.aBoolean587 = arg3;
		this.aClass206_17 = arg2;
		this.aClass255_20 = arg1;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Lclient!cr;Z)V")
	public void method7435(@OriginalArg(0) Class67 arg0) {
		this.aClass67_9 = arg0;
	}

	@OriginalMember(owner = "client!en", name = "d", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	public abstract IDirect3DBaseTexture method6875();
}
