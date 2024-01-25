import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pda")
public abstract class Class193 {

	@OriginalMember(owner = "client!pda", name = "d", descriptor = "Lclient!td;")
	public Class338 aClass338_11 = Static673.aClass338_15;

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "Lclient!hh;")
	protected final Class155 aClass155_54;

	@OriginalMember(owner = "client!pda", name = "e", descriptor = "Lclient!os;")
	protected final Class75_Sub1_Sub2 aClass75_Sub1_Sub2_8;

	@OriginalMember(owner = "client!pda", name = "b", descriptor = "Lclient!on;")
	protected final Class274 aClass274_18;

	@OriginalMember(owner = "client!pda", name = "c", descriptor = "Z")
	public final boolean aBoolean700;

	@OriginalMember(owner = "client!pda", name = "<init>", descriptor = "(Lclient!os;Lclient!hh;Lclient!on;ZI)V")
	protected Class193(@OriginalArg(0) Class75_Sub1_Sub2 arg0, @OriginalArg(1) Class155 arg1, @OriginalArg(2) Class274 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.aClass155_54 = arg1;
		this.aClass75_Sub1_Sub2_8 = arg0;
		this.aClass274_18 = arg2;
		this.aBoolean700 = arg3;
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(Lclient!td;I)V")
	public void method8704(@OriginalArg(0) Class338 arg0) {
		this.aClass338_11 = arg0;
	}

	@OriginalMember(owner = "client!pda", name = "d", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	public abstract IDirect3DBaseTexture method8209();
}
