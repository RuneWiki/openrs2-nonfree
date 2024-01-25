import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public abstract class Class61 {

	@OriginalMember(owner = "client!nr", name = "e", descriptor = "Lclient!rha;")
	public Class315 aClass315_12 = Static100.aClass315_2;

	@OriginalMember(owner = "client!nr", name = "c", descriptor = "Lclient!dr;")
	protected final Class79 aClass79_20;

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "Lclient!lj;")
	protected final Class101_Sub1_Sub2 aClass101_Sub1_Sub2_9;

	@OriginalMember(owner = "client!nr", name = "d", descriptor = "Lclient!nea;")
	protected final Class244 aClass244_16;

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "Z")
	public final boolean aBoolean785;

	@OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(Lclient!lj;Lclient!nea;Lclient!dr;ZI)V")
	protected Class61(@OriginalArg(0) Class101_Sub1_Sub2 arg0, @OriginalArg(1) Class244 arg1, @OriginalArg(2) Class79 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.aClass79_20 = arg2;
		this.aClass101_Sub1_Sub2_9 = arg0;
		this.aClass244_16 = arg1;
		this.aBoolean785 = arg3;
	}

	@OriginalMember(owner = "client!nr", name = "c", descriptor = "(B)Lclient!jagdx/IDirect3DBaseTexture;")
	public abstract IDirect3DBaseTexture method9324();

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(ILclient!rha;)V")
	public void method9325(@OriginalArg(1) Class315 arg0) {
		this.aClass315_12 = arg0;
	}
}
