import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public final class Class233 {

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "Lclient!jagdx/IDirect3DSwapChain;")
	private IDirect3DSwapChain anIDirect3DSwapChain1;

	@OriginalMember(owner = "client!mu", name = "b", descriptor = "Lclient!jagdx/IDirect3DSurface;")
	private IDirect3DSurface anIDirect3DSurface1;

	@OriginalMember(owner = "client!mu", name = "c", descriptor = "Lclient!jagdx/IDirect3DSurface;")
	private IDirect3DSurface anIDirect3DSurface2;

	@OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(Lclient!jagdx/IDirect3DSwapChain;Lclient!jagdx/IDirect3DSurface;)V")
	public Class233(@OriginalArg(0) IDirect3DSwapChain arg0, @OriginalArg(1) IDirect3DSurface arg1) {
		this.method5468(arg0, arg1);
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(II)I")
	public int method5467() {
		return this.anIDirect3DSwapChain1.Present(0);
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(BLclient!jagdx/IDirect3DSwapChain;Lclient!jagdx/IDirect3DSurface;)V")
	public void method5468(@OriginalArg(1) IDirect3DSwapChain arg0, @OriginalArg(2) IDirect3DSurface arg1) {
		this.anIDirect3DSwapChain1 = arg0;
		this.anIDirect3DSurface2 = arg1;
		this.anIDirect3DSurface1 = this.anIDirect3DSwapChain1.a(0, 0);
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(I)Z")
	public boolean method5469() {
		return this.anIDirect3DSwapChain1 != null;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(B)V")
	public void method5470() {
		if (this.anIDirect3DSurface1 != null) {
			this.anIDirect3DSurface1.b((byte) -36);
			this.anIDirect3DSurface1 = null;
		}
		if (this.anIDirect3DSurface2 != null) {
			this.anIDirect3DSurface2.b((byte) -36);
			this.anIDirect3DSurface2 = null;
		}
		if (this.anIDirect3DSwapChain1 != null) {
			this.anIDirect3DSwapChain1.b((byte) -36);
			this.anIDirect3DSwapChain1 = null;
		}
	}
}
