import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public abstract class Class8 {

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "Lclient!qt;")
	public Class294 aClass294_9 = Static516.aClass294_10;

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "Z")
	public final boolean aBoolean648;

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "Lclient!tn;")
	protected final Class339 aClass339_13;

	@OriginalMember(owner = "client!ae", name = "e", descriptor = "Lclient!ds;")
	protected final Class89 aClass89_18;

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "Lclient!cka;")
	protected final Class65_Sub2_Sub1 aClass65_Sub2_Sub1_6;

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(Lclient!cka;Lclient!tn;Lclient!ds;ZI)V")
	protected Class8(@OriginalArg(0) Class65_Sub2_Sub1 arg0, @OriginalArg(1) Class339 arg1, @OriginalArg(2) Class89 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.aBoolean648 = arg3;
		this.aClass339_13 = arg1;
		this.aClass89_18 = arg2;
		this.aClass65_Sub2_Sub1_6 = arg0;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(BLclient!qt;)V")
	public void method7704(@OriginalArg(1) Class294 arg0) {
		this.aClass294_9 = arg0;
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(B)Lclient!jagdx/IDirect3DBaseTexture;")
	public abstract IDirect3DBaseTexture method6358();
}
