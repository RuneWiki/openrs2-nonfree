import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public abstract class Class57 {

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "Lclient!qaa;")
	public Class257 aClass257_8 = Static467.aClass257_9;

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "Lclient!ps;")
	protected final Class254 aClass254_10;

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "Z")
	public final boolean aBoolean461;

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "Lclient!kf;")
	protected final Class171 aClass171_13;

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "Lclient!vg;")
	protected final Class90_Sub3_Sub2 aClass90_Sub3_Sub2_6;

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Lclient!vg;Lclient!kf;Lclient!ps;ZI)V")
	protected Class57(@OriginalArg(0) Class90_Sub3_Sub2 arg0, @OriginalArg(1) Class171 arg1, @OriginalArg(2) Class254 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.aClass254_10 = arg2;
		this.aBoolean461 = arg3;
		this.aClass171_13 = arg1;
		this.aClass90_Sub3_Sub2_6 = arg0;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(BLclient!qaa;)V")
	public void method7034(@OriginalArg(1) Class257 arg0) {
		this.aClass257_8 = arg0;
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	public abstract IDirect3DBaseTexture method5363();
}
