import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public abstract class Class96 {

	@OriginalMember(owner = "client!es", name = "e", descriptor = "Lclient!up;")
	public Class321 aClass321_10 = Static333.aClass321_7;

	@OriginalMember(owner = "client!es", name = "c", descriptor = "Lclient!nb;")
	protected final Class220 aClass220_19;

	@OriginalMember(owner = "client!es", name = "a", descriptor = "Lclient!gb;")
	protected final Class9_Sub3_Sub1 aClass9_Sub3_Sub1_6;

	@OriginalMember(owner = "client!es", name = "d", descriptor = "Lclient!vj;")
	protected final Class333 aClass333_13;

	@OriginalMember(owner = "client!es", name = "b", descriptor = "Z")
	public final boolean aBoolean552;

	@OriginalMember(owner = "client!es", name = "<init>", descriptor = "(Lclient!gb;Lclient!vj;Lclient!nb;ZI)V")
	protected Class96(@OriginalArg(0) Class9_Sub3_Sub1 arg0, @OriginalArg(1) Class333 arg1, @OriginalArg(2) Class220 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.aClass220_19 = arg2;
		this.aClass9_Sub3_Sub1_6 = arg0;
		this.aClass333_13 = arg1;
		this.aBoolean552 = arg3;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(ILclient!up;)V")
	public void method7737(@OriginalArg(1) Class321 arg0) {
		this.aClass321_10 = arg0;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(B)Lclient!jagdx/IDirect3DBaseTexture;")
	public abstract IDirect3DBaseTexture method6280();
}
