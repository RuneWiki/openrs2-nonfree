import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public final class Class316 {

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "Lclient!jagdx/IDirect3DSwapChain;")
	private IDirect3DSwapChain anIDirect3DSwapChain1;

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "Lclient!jagdx/IDirect3DSurface;")
	private IDirect3DSurface anIDirect3DSurface1;

	@OriginalMember(owner = "client!wp", name = "c", descriptor = "Lclient!jagdx/IDirect3DSurface;")
	private IDirect3DSurface anIDirect3DSurface2;

	@OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(Lclient!jagdx/IDirect3DSwapChain;Lclient!jagdx/IDirect3DSurface;)V")
	public Class316(@OriginalArg(0) IDirect3DSwapChain arg0, @OriginalArg(1) IDirect3DSurface arg1) {
		this.method7403(arg0, arg1);
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(B)V")
	public void method7400() {
		if (this.anIDirect3DSurface1 != null) {
			this.anIDirect3DSurface1.a(55);
			this.anIDirect3DSurface1 = null;
		}
		if (this.anIDirect3DSurface2 != null) {
			this.anIDirect3DSurface2.a(65);
			this.anIDirect3DSurface2 = null;
		}
		if (this.anIDirect3DSwapChain1 != null) {
			this.anIDirect3DSwapChain1.a(103);
			this.anIDirect3DSwapChain1 = null;
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(I)Z")
	public boolean method7401() {
		return this.anIDirect3DSwapChain1 != null;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(ZI)I")
	public int method7402() {
		return this.anIDirect3DSwapChain1.Present(0);
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lclient!jagdx/IDirect3DSwapChain;ILclient!jagdx/IDirect3DSurface;)V")
	public void method7403(@OriginalArg(0) IDirect3DSwapChain arg0, @OriginalArg(2) IDirect3DSurface arg1) {
		this.anIDirect3DSurface2 = arg1;
		this.anIDirect3DSwapChain1 = arg0;
		this.anIDirect3DSurface1 = this.anIDirect3DSwapChain1.a(0, 0);
	}
}
