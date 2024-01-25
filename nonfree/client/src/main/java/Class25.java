import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public abstract class Class25 {

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "Lclient!td;")
	public Class301 aClass301_10 = Static563.aClass301_11;

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "Lclient!nl;")
	protected final Class214 aClass214_15;

	@OriginalMember(owner = "client!rg", name = "e", descriptor = "Lclient!eea;")
	protected final Class82 aClass82_20;

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "Lclient!ui;")
	protected final Class121_Sub2_Sub2 aClass121_Sub2_Sub2_8;

	@OriginalMember(owner = "client!rg", name = "d", descriptor = "Z")
	public final boolean aBoolean643;

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Lclient!ui;Lclient!nl;Lclient!eea;ZI)V")
	protected Class25(@OriginalArg(0) Class121_Sub2_Sub2 arg0, @OriginalArg(1) Class214 arg1, @OriginalArg(2) Class82 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.aClass214_15 = arg1;
		this.aClass82_20 = arg2;
		this.aClass121_Sub2_Sub2_8 = arg0;
		this.aBoolean643 = arg3;
	}

	@OriginalMember(owner = "client!rg", name = "e", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	public abstract IDirect3DBaseTexture method7526();

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!td;B)V")
	public void method7527(@OriginalArg(0) Class301 arg0) {
		this.aClass301_10 = arg0;
	}
}
