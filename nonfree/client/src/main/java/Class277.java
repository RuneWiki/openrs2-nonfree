import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public final class Class277 {

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "Lclient!jagdx/IDirect3DSurface;")
	private IDirect3DSurface anIDirect3DSurface1;

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "Lclient!jagdx/IDirect3DSwapChain;")
	private IDirect3DSwapChain anIDirect3DSwapChain1;

	@OriginalMember(owner = "client!qs", name = "c", descriptor = "Lclient!jagdx/IDirect3DSurface;")
	private IDirect3DSurface anIDirect3DSurface2;

	@OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(Lclient!jagdx/IDirect3DSwapChain;Lclient!jagdx/IDirect3DSurface;)V")
	public Class277(@OriginalArg(0) IDirect3DSwapChain arg0, @OriginalArg(1) IDirect3DSurface arg1) {
		this.method7132(arg0, arg1);
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IB)I")
	public int method7130() {
		return this.anIDirect3DSwapChain1.Present(0);
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)V")
	public void method7131() {
		if (this.anIDirect3DSurface2 != null) {
			this.anIDirect3DSurface2.a((byte) 108);
			this.anIDirect3DSurface2 = null;
		}
		if (this.anIDirect3DSurface1 != null) {
			this.anIDirect3DSurface1.a((byte) 85);
			this.anIDirect3DSurface1 = null;
		}
		if (this.anIDirect3DSwapChain1 != null) {
			this.anIDirect3DSwapChain1.a((byte) 109);
			this.anIDirect3DSwapChain1 = null;
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(ILclient!jagdx/IDirect3DSwapChain;Lclient!jagdx/IDirect3DSurface;)V")
	public void method7132(@OriginalArg(1) IDirect3DSwapChain arg0, @OriginalArg(2) IDirect3DSurface arg1) {
		this.anIDirect3DSurface1 = arg1;
		this.anIDirect3DSwapChain1 = arg0;
		this.anIDirect3DSurface2 = this.anIDirect3DSwapChain1.a(0, 0);
	}

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "(I)Z")
	public boolean method7133() {
		return this.anIDirect3DSwapChain1 != null;
	}
}
