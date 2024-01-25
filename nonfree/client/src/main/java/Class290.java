import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uba")
public final class Class290 {

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "Lclient!jagdx/IDirect3DSurface;")
	private IDirect3DSurface anIDirect3DSurface1;

	@OriginalMember(owner = "client!uba", name = "b", descriptor = "Lclient!jagdx/IDirect3DSwapChain;")
	private IDirect3DSwapChain anIDirect3DSwapChain1;

	@OriginalMember(owner = "client!uba", name = "c", descriptor = "Lclient!jagdx/IDirect3DSurface;")
	private IDirect3DSurface anIDirect3DSurface2;

	@OriginalMember(owner = "client!uba", name = "<init>", descriptor = "(Lclient!jagdx/IDirect3DSwapChain;Lclient!jagdx/IDirect3DSurface;)V")
	public Class290(@OriginalArg(0) IDirect3DSwapChain arg0, @OriginalArg(1) IDirect3DSurface arg1) {
		this.method7480(arg1, arg0);
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(BI)I")
	public int method7479() {
		return this.anIDirect3DSwapChain1.Present(0);
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(Lclient!jagdx/IDirect3DSurface;Lclient!jagdx/IDirect3DSwapChain;I)V")
	public void method7480(@OriginalArg(0) IDirect3DSurface arg0, @OriginalArg(1) IDirect3DSwapChain arg1) {
		this.anIDirect3DSurface2 = arg0;
		this.anIDirect3DSwapChain1 = arg1;
		this.anIDirect3DSurface1 = this.anIDirect3DSwapChain1.a(0, 0);
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(I)V")
	public void method7481() {
		if (this.anIDirect3DSurface1 != null) {
			this.anIDirect3DSurface1.b(-11385);
			this.anIDirect3DSurface1 = null;
		}
		if (this.anIDirect3DSurface2 != null) {
			this.anIDirect3DSurface2.b(-11385);
			this.anIDirect3DSurface2 = null;
		}
		if (this.anIDirect3DSwapChain1 != null) {
			this.anIDirect3DSwapChain1.b(-11385);
			this.anIDirect3DSwapChain1 = null;
		}
	}
}
