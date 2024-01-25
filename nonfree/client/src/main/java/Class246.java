import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public final class Class246 {

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "Lclient!jagdx/IDirect3DSurface;")
	private IDirect3DSurface anIDirect3DSurface1;

	@OriginalMember(owner = "client!nt", name = "b", descriptor = "Lclient!jagdx/IDirect3DSurface;")
	private IDirect3DSurface anIDirect3DSurface2;

	@OriginalMember(owner = "client!nt", name = "c", descriptor = "Lclient!jagdx/IDirect3DSwapChain;")
	private IDirect3DSwapChain anIDirect3DSwapChain1;

	@OriginalMember(owner = "client!nt", name = "<init>", descriptor = "(Lclient!jagdx/IDirect3DSwapChain;Lclient!jagdx/IDirect3DSurface;)V")
	public Class246(@OriginalArg(0) IDirect3DSwapChain arg0, @OriginalArg(1) IDirect3DSurface arg1) {
		this.method5180(arg0, arg1);
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(I)V")
	public void method5179() {
		if (this.anIDirect3DSurface1 != null) {
			this.anIDirect3DSurface1.b((byte) 47);
			this.anIDirect3DSurface1 = null;
		}
		if (this.anIDirect3DSurface2 != null) {
			this.anIDirect3DSurface2.b((byte) -87);
			this.anIDirect3DSurface2 = null;
		}
		if (this.anIDirect3DSwapChain1 != null) {
			this.anIDirect3DSwapChain1.b((byte) 115);
			this.anIDirect3DSwapChain1 = null;
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(Lclient!jagdx/IDirect3DSwapChain;Lclient!jagdx/IDirect3DSurface;B)V")
	public void method5180(@OriginalArg(0) IDirect3DSwapChain arg0, @OriginalArg(1) IDirect3DSurface arg1) {
		this.anIDirect3DSwapChain1 = arg0;
		this.anIDirect3DSurface2 = arg1;
		this.anIDirect3DSurface1 = this.anIDirect3DSwapChain1.a(0, 0);
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(II)I")
	public int method5181() {
		return this.anIDirect3DSwapChain1.Present(0);
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(Z)Z")
	public boolean method5182() {
		return this.anIDirect3DSwapChain1 != null;
	}
}
