import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public abstract class Class88 {

	@OriginalMember(owner = "client!pi", name = "d", descriptor = "Lclient!dca;")
	public Class54 aClass54_9 = Static299.aClass54_6;

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "Lclient!jg;")
	protected final Class172 aClass172_18;

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "Lclient!ega;")
	protected final Class78_Sub1_Sub1 aClass78_Sub1_Sub1_7;

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "Lclient!pn;")
	protected final Class271 aClass271_10;

	@OriginalMember(owner = "client!pi", name = "e", descriptor = "Z")
	public final boolean aBoolean556;

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Lclient!ega;Lclient!pn;Lclient!jg;ZI)V")
	protected Class88(@OriginalArg(0) Class78_Sub1_Sub1 arg0, @OriginalArg(1) Class271 arg1, @OriginalArg(2) Class172 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.aClass172_18 = arg2;
		this.aClass78_Sub1_Sub1_7 = arg0;
		this.aClass271_10 = arg1;
		this.aBoolean556 = arg3;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!dca;B)V")
	public void method7298(@OriginalArg(0) Class54 arg0) {
		this.aClass54_9 = arg0;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)Lclient!jagdx/IDirect3DBaseTexture;")
	public abstract IDirect3DBaseTexture method5851();
}
