import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public abstract class Class33 {

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "Lclient!se;")
	public Class328 aClass328_9 = Static464.aClass328_10;

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "Lclient!dn;")
	protected final Class86 aClass86_18;

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "Lclient!er;")
	protected final Class100_Sub1_Sub1 aClass100_Sub1_Sub1_6;

	@OriginalMember(owner = "client!bg", name = "d", descriptor = "Lclient!ua;")
	protected final Class358 aClass358_15;

	@OriginalMember(owner = "client!bg", name = "e", descriptor = "Z")
	public final boolean aBoolean471;

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(Lclient!er;Lclient!ua;Lclient!dn;ZI)V")
	protected Class33(@OriginalArg(0) Class100_Sub1_Sub1 arg0, @OriginalArg(1) Class358 arg1, @OriginalArg(2) Class86 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.aClass86_18 = arg2;
		this.aClass100_Sub1_Sub1_6 = arg0;
		this.aClass358_15 = arg1;
		this.aBoolean471 = arg3;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILclient!se;)V")
	public void method8896(@OriginalArg(1) Class328 arg0) {
		this.aClass328_9 = arg0;
	}

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	public abstract IDirect3DBaseTexture method6164();
}
