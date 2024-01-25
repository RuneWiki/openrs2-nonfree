import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public abstract class Class145 {

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "Lclient!ko;")
	public Class198 aClass198_10 = Static156.aClass198_4;

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "Lclient!dw;")
	protected final Class79 aClass79_18;

	@OriginalMember(owner = "client!hm", name = "c", descriptor = "Z")
	public final boolean aBoolean606;

	@OriginalMember(owner = "client!hm", name = "d", descriptor = "Lclient!us;")
	protected final Class33_Sub2_Sub2 aClass33_Sub2_Sub2_7;

	@OriginalMember(owner = "client!hm", name = "e", descriptor = "Lclient!pe;")
	protected final Class276 aClass276_16;

	@OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(Lclient!us;Lclient!pe;Lclient!dw;ZI)V")
	protected Class145(@OriginalArg(0) Class33_Sub2_Sub2 arg0, @OriginalArg(1) Class276 arg1, @OriginalArg(2) Class79 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.aClass79_18 = arg2;
		this.aBoolean606 = arg3;
		this.aClass33_Sub2_Sub2_7 = arg0;
		this.aClass276_16 = arg1;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lclient!ko;I)V")
	public void method8612(@OriginalArg(0) Class198 arg0) {
		this.aClass198_10 = arg0;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(Z)Lclient!jagdx/IDirect3DBaseTexture;")
	public abstract IDirect3DBaseTexture method6705();
}
