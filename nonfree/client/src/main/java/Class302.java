import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public final class Class302 {

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "Lclient!jagdx/IDirect3DSurface;")
	private IDirect3DSurface anIDirect3DSurface1;

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "Lclient!jagdx/IDirect3DSurface;")
	private IDirect3DSurface anIDirect3DSurface2;

	@OriginalMember(owner = "client!qm", name = "c", descriptor = "Lclient!jagdx/IDirect3DSwapChain;")
	private IDirect3DSwapChain anIDirect3DSwapChain1;

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Lclient!jagdx/IDirect3DSwapChain;Lclient!jagdx/IDirect3DSurface;)V")
	public Class302(@OriginalArg(0) IDirect3DSwapChain arg0, @OriginalArg(1) IDirect3DSurface arg1) {
		this.method7788(arg1, arg0);
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Z)V")
	public void method7787() {
		if (this.anIDirect3DSurface2 != null) {
			this.anIDirect3DSurface2.a(-4840);
			this.anIDirect3DSurface2 = null;
		}
		if (this.anIDirect3DSurface1 != null) {
			this.anIDirect3DSurface1.a(-4840);
			this.anIDirect3DSurface1 = null;
		}
		if (this.anIDirect3DSwapChain1 != null) {
			this.anIDirect3DSwapChain1.a(-4840);
			this.anIDirect3DSwapChain1 = null;
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lclient!jagdx/IDirect3DSurface;Lclient!jagdx/IDirect3DSwapChain;B)V")
	public void method7788(@OriginalArg(0) IDirect3DSurface arg0, @OriginalArg(1) IDirect3DSwapChain arg1) {
		this.anIDirect3DSurface1 = arg0;
		this.anIDirect3DSwapChain1 = arg1;
		this.anIDirect3DSurface2 = this.anIDirect3DSwapChain1.a(0, 0);
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)Z")
	public boolean method7789() {
		return this.anIDirect3DSwapChain1 != null;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IB)I")
	public int method7790() {
		return this.anIDirect3DSwapChain1.Present(0);
	}
}
