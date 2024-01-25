import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hba")
public abstract class Class65 {

	@OriginalMember(owner = "client!hba", name = "d", descriptor = "Lclient!gaa;")
	public Class115 aClass115_10 = Static440.aClass115_11;

	@OriginalMember(owner = "client!hba", name = "e", descriptor = "Lclient!tb;")
	protected final Class134_Sub1_Sub2 aClass134_Sub1_Sub2_7;

	@OriginalMember(owner = "client!hba", name = "b", descriptor = "Lclient!ig;")
	protected final Class155 aClass155_19;

	@OriginalMember(owner = "client!hba", name = "c", descriptor = "Z")
	public final boolean aBoolean556;

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "Lclient!lca;")
	protected final Class203 aClass203_13;

	@OriginalMember(owner = "client!hba", name = "<init>", descriptor = "(Lclient!tb;Lclient!lca;Lclient!ig;ZI)V")
	protected Class65(@OriginalArg(0) Class134_Sub1_Sub2 arg0, @OriginalArg(1) Class203 arg1, @OriginalArg(2) Class155 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.aClass134_Sub1_Sub2_7 = arg0;
		this.aClass155_19 = arg2;
		this.aBoolean556 = arg3;
		this.aClass203_13 = arg1;
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(Lclient!gaa;I)V")
	public void method5452(@OriginalArg(0) Class115 arg0) {
		this.aClass115_10 = arg0;
	}

	@OriginalMember(owner = "client!hba", name = "c", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	public abstract IDirect3DBaseTexture method5453();
}
