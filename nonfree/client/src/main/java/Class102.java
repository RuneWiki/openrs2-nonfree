import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public abstract class Class102 {

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "Lclient!mv;")
	public Class227 aClass227_9 = Static85.aClass227_1;

	@OriginalMember(owner = "client!qo", name = "c", descriptor = "Lclient!gaa;")
	protected final Class100_Sub1_Sub1 aClass100_Sub1_Sub1_8;

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "Z")
	public final boolean aBoolean538;

	@OriginalMember(owner = "client!qo", name = "e", descriptor = "Lclient!ec;")
	protected final Class88 aClass88_12;

	@OriginalMember(owner = "client!qo", name = "d", descriptor = "Lclient!bt;")
	protected final Class42 aClass42_18;

	@OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(Lclient!gaa;Lclient!ec;Lclient!bt;ZI)V")
	protected Class102(@OriginalArg(0) Class100_Sub1_Sub1 arg0, @OriginalArg(1) Class88 arg1, @OriginalArg(2) Class42 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.aClass100_Sub1_Sub1_8 = arg0;
		this.aBoolean538 = arg3;
		this.aClass88_12 = arg1;
		this.aClass42_18 = arg2;
	}

	@OriginalMember(owner = "client!qo", name = "c", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	public abstract IDirect3DBaseTexture method5797();

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lclient!mv;I)V")
	public void method7050(@OriginalArg(0) Class227 arg0) {
		this.aClass227_9 = arg0;
	}
}
