import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aca")
public final class Class5 {

	@OriginalMember(owner = "client!aca", name = "b", descriptor = "Lclient!jagdx/IDirect3DSwapChain;")
	private IDirect3DSwapChain anIDirect3DSwapChain1;

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "Lclient!jagdx/IDirect3DSurface;")
	private IDirect3DSurface anIDirect3DSurface1;

	@OriginalMember(owner = "client!aca", name = "c", descriptor = "Lclient!jagdx/IDirect3DSurface;")
	private IDirect3DSurface anIDirect3DSurface2;

	@OriginalMember(owner = "client!aca", name = "<init>", descriptor = "(Lclient!jagdx/IDirect3DSwapChain;Lclient!jagdx/IDirect3DSurface;)V")
	public Class5(@OriginalArg(0) IDirect3DSwapChain arg0, @OriginalArg(1) IDirect3DSurface arg1) {
		this.method234(arg1, arg0);
	}

	@OriginalMember(owner = "client!aca", name = "b", descriptor = "(B)V")
	public void method231() {
		if (this.anIDirect3DSurface2 != null) {
			this.anIDirect3DSurface2.a((byte) 95);
			this.anIDirect3DSurface2 = null;
		}
		if (this.anIDirect3DSurface1 != null) {
			this.anIDirect3DSurface1.a((byte) -62);
			this.anIDirect3DSurface1 = null;
		}
		if (this.anIDirect3DSwapChain1 != null) {
			this.anIDirect3DSwapChain1.a((byte) 96);
			this.anIDirect3DSwapChain1 = null;
		}
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(B)Z")
	public boolean method232() {
		return this.anIDirect3DSwapChain1 != null;
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(II)I")
	public int method233() {
		return this.anIDirect3DSwapChain1.Present(0);
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(Lclient!jagdx/IDirect3DSurface;ILclient!jagdx/IDirect3DSwapChain;)V")
	public void method234(@OriginalArg(0) IDirect3DSurface arg0, @OriginalArg(2) IDirect3DSwapChain arg1) {
		this.anIDirect3DSurface1 = arg0;
		this.anIDirect3DSwapChain1 = arg1;
		this.anIDirect3DSurface2 = this.anIDirect3DSwapChain1.a(0, 0);
	}
}
