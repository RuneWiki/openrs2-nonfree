import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vga")
public abstract class Class33 {

	@OriginalMember(owner = "client!vga", name = "e", descriptor = "Lclient!tb;")
	public Class328 aClass328_11 = Static541.aClass328_10;

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "Z")
	public final boolean aBoolean692;

	@OriginalMember(owner = "client!vga", name = "d", descriptor = "Lclient!kea;")
	protected final Class188 aClass188_14;

	@OriginalMember(owner = "client!vga", name = "b", descriptor = "Lclient!kf;")
	protected final Class189 aClass189_20;

	@OriginalMember(owner = "client!vga", name = "c", descriptor = "Lclient!rd;")
	protected final Class95_Sub3_Sub1 aClass95_Sub3_Sub1_8;

	@OriginalMember(owner = "client!vga", name = "<init>", descriptor = "(Lclient!rd;Lclient!kea;Lclient!kf;ZI)V")
	protected Class33(@OriginalArg(0) Class95_Sub3_Sub1 arg0, @OriginalArg(1) Class188 arg1, @OriginalArg(2) Class189 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.aBoolean692 = arg3;
		this.aClass188_14 = arg1;
		this.aClass189_20 = arg2;
		this.aClass95_Sub3_Sub1_8 = arg0;
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(BLclient!tb;)V")
	public void method7837(@OriginalArg(1) Class328 arg0) {
		this.aClass328_11 = arg0;
	}

	@OriginalMember(owner = "client!vga", name = "b", descriptor = "(Z)Lclient!jagdx/IDirect3DBaseTexture;")
	public abstract IDirect3DBaseTexture method7838();
}
