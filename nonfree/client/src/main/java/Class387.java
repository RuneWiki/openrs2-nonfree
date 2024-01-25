import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public final class Class387 {

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "Lclient!jagdx/IDirect3DSurface;")
	private IDirect3DSurface anIDirect3DSurface1;

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "Lclient!jagdx/IDirect3DSurface;")
	private IDirect3DSurface anIDirect3DSurface2;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "Lclient!jagdx/IDirect3DSwapChain;")
	private IDirect3DSwapChain anIDirect3DSwapChain1;

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(Lclient!jagdx/IDirect3DSwapChain;Lclient!jagdx/IDirect3DSurface;)V")
	public Class387(@OriginalArg(0) IDirect3DSwapChain arg0, @OriginalArg(1) IDirect3DSurface arg1) {
		this.method9277(arg0, arg1);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V")
	public void method9276() {
		if (this.anIDirect3DSurface2 != null) {
			this.anIDirect3DSurface2.b(113);
			this.anIDirect3DSurface2 = null;
		}
		if (this.anIDirect3DSurface1 != null) {
			this.anIDirect3DSurface1.b(88);
			this.anIDirect3DSurface1 = null;
		}
		if (this.anIDirect3DSwapChain1 != null) {
			this.anIDirect3DSwapChain1.b(98);
			this.anIDirect3DSwapChain1 = null;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BLclient!jagdx/IDirect3DSwapChain;Lclient!jagdx/IDirect3DSurface;)V")
	public void method9277(@OriginalArg(1) IDirect3DSwapChain arg0, @OriginalArg(2) IDirect3DSurface arg1) {
		this.anIDirect3DSwapChain1 = arg0;
		this.anIDirect3DSurface1 = arg1;
		this.anIDirect3DSurface2 = this.anIDirect3DSwapChain1.a(0, 0);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)Z")
	public boolean method9278() {
		return this.anIDirect3DSwapChain1 != null;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)I")
	public int method9279() {
		return this.anIDirect3DSwapChain1.Present(0);
	}
}
