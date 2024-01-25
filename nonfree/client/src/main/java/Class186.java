import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public abstract class Class186 {

	@OriginalMember(owner = "client!ke", name = "e", descriptor = "Lclient!ng;")
	public Class225 aClass225_11 = Static195.aClass225_3;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "Z")
	public final boolean aBoolean678;

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "Lclient!vea;")
	protected final Class340 aClass340_20;

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "Lclient!sk;")
	protected final Class297 aClass297_15;

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "Lclient!hb;")
	protected final Class12_Sub2_Sub1 aClass12_Sub2_Sub1_9;

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(Lclient!hb;Lclient!sk;Lclient!vea;ZI)V")
	protected Class186(@OriginalArg(0) Class12_Sub2_Sub1 arg0, @OriginalArg(1) Class297 arg1, @OriginalArg(2) Class340 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.aBoolean678 = arg3;
		this.aClass340_20 = arg2;
		this.aClass297_15 = arg1;
		this.aClass12_Sub2_Sub1_9 = arg0;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILclient!ng;)V")
	public void method7669(@OriginalArg(1) Class225 arg0) {
		this.aClass225_11 = arg0;
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	public abstract IDirect3DBaseTexture method7670();
}
