import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public final class Class105 {

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "Lclient!jagdx/IDirect3DSurface;")
	private IDirect3DSurface anIDirect3DSurface1;

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "Lclient!jagdx/IDirect3DSwapChain;")
	private IDirect3DSwapChain anIDirect3DSwapChain1;

	@OriginalMember(owner = "client!fn", name = "c", descriptor = "Lclient!jagdx/IDirect3DSurface;")
	private IDirect3DSurface anIDirect3DSurface2;

	@OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(Lclient!jagdx/IDirect3DSwapChain;Lclient!jagdx/IDirect3DSurface;)V")
	public Class105(@OriginalArg(0) IDirect3DSwapChain arg0, @OriginalArg(1) IDirect3DSurface arg1) {
		this.method2880(arg0, arg1);
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Z)V")
	public void method2879() {
		if (this.anIDirect3DSurface1 != null) {
			this.anIDirect3DSurface1.a((byte) -46);
			this.anIDirect3DSurface1 = null;
		}
		if (this.anIDirect3DSurface2 != null) {
			this.anIDirect3DSurface2.a((byte) -46);
			this.anIDirect3DSurface2 = null;
		}
		if (this.anIDirect3DSwapChain1 != null) {
			this.anIDirect3DSwapChain1.a((byte) -46);
			this.anIDirect3DSwapChain1 = null;
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lclient!jagdx/IDirect3DSwapChain;ILclient!jagdx/IDirect3DSurface;)V")
	public void method2880(@OriginalArg(0) IDirect3DSwapChain arg0, @OriginalArg(2) IDirect3DSurface arg1) {
		this.anIDirect3DSwapChain1 = arg0;
		this.anIDirect3DSurface2 = arg1;
		this.anIDirect3DSurface1 = this.anIDirect3DSwapChain1.a(0, 0);
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IZ)I")
	public int method2881() {
		return this.anIDirect3DSwapChain1.Present(0);
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(B)Z")
	public boolean method2882() {
		return this.anIDirect3DSwapChain1 != null;
	}
}
