import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qea")
public abstract class Class62 {

	@OriginalMember(owner = "client!qea", name = "c", descriptor = "Lclient!fw;")
	public Class110 aClass110_10 = Static63.aClass110_1;

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "Lclient!kaa;")
	protected final Class44_Sub2_Sub2 aClass44_Sub2_Sub2_9;

	@OriginalMember(owner = "client!qea", name = "e", descriptor = "Lclient!fca;")
	protected final Class97 aClass97_53;

	@OriginalMember(owner = "client!qea", name = "b", descriptor = "Z")
	public final boolean aBoolean694;

	@OriginalMember(owner = "client!qea", name = "d", descriptor = "Lclient!bv;")
	protected final Class42 aClass42_19;

	@OriginalMember(owner = "client!qea", name = "<init>", descriptor = "(Lclient!kaa;Lclient!fca;Lclient!bv;ZI)V")
	protected Class62(@OriginalArg(0) Class44_Sub2_Sub2 arg0, @OriginalArg(1) Class97 arg1, @OriginalArg(2) Class42 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.aClass44_Sub2_Sub2_9 = arg0;
		this.aClass97_53 = arg1;
		this.aBoolean694 = arg3;
		this.aClass42_19 = arg2;
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(ILclient!fw;)V")
	public void method8268(@OriginalArg(1) Class110 arg0) {
		this.aClass110_10 = arg0;
	}

	@OriginalMember(owner = "client!qea", name = "c", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	public abstract IDirect3DBaseTexture method8082();
}
