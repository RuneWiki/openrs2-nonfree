import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jga")
public abstract class Class1 {

	@OriginalMember(owner = "client!jga", name = "b", descriptor = "Lclient!gv;")
	public Class130 aClass130_9 = Static247.aClass130_8;

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "Lclient!lj;")
	protected final Class200 aClass200_18;

	@OriginalMember(owner = "client!jga", name = "c", descriptor = "Lclient!mba;")
	protected final Class15_Sub2_Sub2 aClass15_Sub2_Sub2_8;

	@OriginalMember(owner = "client!jga", name = "d", descriptor = "Lclient!pw;")
	protected final Class261 aClass261_12;

	@OriginalMember(owner = "client!jga", name = "e", descriptor = "Z")
	public final boolean aBoolean695;

	@OriginalMember(owner = "client!jga", name = "<init>", descriptor = "(Lclient!mba;Lclient!pw;Lclient!lj;ZI)V")
	protected Class1(@OriginalArg(0) Class15_Sub2_Sub2 arg0, @OriginalArg(1) Class261 arg1, @OriginalArg(2) Class200 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.aClass200_18 = arg2;
		this.aClass15_Sub2_Sub2_8 = arg0;
		this.aClass261_12 = arg1;
		this.aBoolean695 = arg3;
	}

	@OriginalMember(owner = "client!jga", name = "c", descriptor = "(B)Lclient!jagdx/IDirect3DBaseTexture;")
	public abstract IDirect3DBaseTexture method6928();

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(Lclient!gv;I)V")
	public void method8222(@OriginalArg(0) Class130 arg0) {
		this.aClass130_9 = arg0;
	}
}
