import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dfa")
public final class Class63 {

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "Lclient!jagdx/IDirect3DSwapChain;")
	private IDirect3DSwapChain anIDirect3DSwapChain1;

	@OriginalMember(owner = "client!dfa", name = "b", descriptor = "Lclient!jagdx/IDirect3DSurface;")
	private IDirect3DSurface anIDirect3DSurface1;

	@OriginalMember(owner = "client!dfa", name = "c", descriptor = "Lclient!jagdx/IDirect3DSurface;")
	private IDirect3DSurface anIDirect3DSurface2;

	@OriginalMember(owner = "client!dfa", name = "<init>", descriptor = "(Lclient!jagdx/IDirect3DSwapChain;Lclient!jagdx/IDirect3DSurface;)V")
	public Class63(@OriginalArg(0) IDirect3DSwapChain arg0, @OriginalArg(1) IDirect3DSurface arg1) {
		this.method1880(arg1, arg0);
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(B)Z")
	public boolean method1879() {
		return this.anIDirect3DSwapChain1 != null;
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(Lclient!jagdx/IDirect3DSurface;BLclient!jagdx/IDirect3DSwapChain;)V")
	public void method1880(@OriginalArg(0) IDirect3DSurface arg0, @OriginalArg(2) IDirect3DSwapChain arg1) {
		this.anIDirect3DSwapChain1 = arg1;
		this.anIDirect3DSurface2 = arg0;
		this.anIDirect3DSurface1 = this.anIDirect3DSwapChain1.a(0, 0);
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(Z)V")
	public void method1881() {
		if (this.anIDirect3DSurface1 != null) {
			this.anIDirect3DSurface1.a(true);
			this.anIDirect3DSurface1 = null;
		}
		if (this.anIDirect3DSurface2 != null) {
			this.anIDirect3DSurface2.a(true);
			this.anIDirect3DSurface2 = null;
		}
		if (this.anIDirect3DSwapChain1 != null) {
			this.anIDirect3DSwapChain1.a(true);
			this.anIDirect3DSwapChain1 = null;
		}
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IZ)I")
	public int method1882() {
		return this.anIDirect3DSwapChain1.Present(0);
	}
}
