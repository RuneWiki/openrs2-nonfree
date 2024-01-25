import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public abstract class Class172 {

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "Lclient!em;")
	public Class86 aClass86_11 = Static354.aClass86_9;

	@OriginalMember(owner = "client!kp", name = "e", descriptor = "Lclient!kl;")
	protected final Class174 aClass174_13;

	@OriginalMember(owner = "client!kp", name = "c", descriptor = "Lclient!de;")
	protected final Class62_Sub1_Sub1 aClass62_Sub1_Sub1_8;

	@OriginalMember(owner = "client!kp", name = "d", descriptor = "Z")
	public final boolean aBoolean545;

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "Lclient!vt;")
	protected final Class306 aClass306_10;

	@OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(Lclient!de;Lclient!kl;Lclient!vt;ZI)V")
	protected Class172(@OriginalArg(0) Class62_Sub1_Sub1 arg0, @OriginalArg(1) Class174 arg1, @OriginalArg(2) Class306 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.aClass174_13 = arg1;
		this.aClass62_Sub1_Sub1_8 = arg0;
		this.aBoolean545 = arg3;
		this.aClass306_10 = arg2;
	}

	@OriginalMember(owner = "client!kp", name = "e", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	public abstract IDirect3DBaseTexture method6219();

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lclient!em;I)V")
	public void method7438(@OriginalArg(0) Class86 arg0) {
		this.aClass86_11 = arg0;
	}
}
