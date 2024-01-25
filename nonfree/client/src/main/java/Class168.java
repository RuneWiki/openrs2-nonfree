import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lda")
public abstract class Class168 {

	@OriginalMember(owner = "client!lda", name = "d", descriptor = "Lclient!kk;")
	public Class195 aClass195_10 = Class12_Sub2_Sub5_Sub2.lb;

	@OriginalMember(owner = "client!lda", name = "e", descriptor = "Z")
	public final boolean aBoolean798;

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "Lclient!ik;")
	protected final Class162_Sub1_Sub1 aClass162_Sub1_Sub1_9;

	@OriginalMember(owner = "client!lda", name = "b", descriptor = "Lclient!wu;")
	protected final Class366 aClass366_15;

	@OriginalMember(owner = "client!lda", name = "c", descriptor = "Lclient!bk;")
	protected final Class35 aClass35_20;

	@OriginalMember(owner = "client!lda", name = "<init>", descriptor = "(Lclient!ik;Lclient!wu;Lclient!bk;ZI)V")
	protected Class168(@OriginalArg(0) Class162_Sub1_Sub1 arg0, @OriginalArg(1) Class366 arg1, @OriginalArg(2) Class35 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.aBoolean798 = arg3;
		this.aClass162_Sub1_Sub1_9 = arg0;
		this.aClass366_15 = arg1;
		this.aClass35_20 = arg2;
	}

	@OriginalMember(owner = "client!lda", name = "c", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	public abstract IDirect3DBaseTexture method7633();

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(Lclient!kk;I)V")
	public void method7634(@OriginalArg(0) Class195 arg0) {
		this.aClass195_10 = arg0;
	}
}
