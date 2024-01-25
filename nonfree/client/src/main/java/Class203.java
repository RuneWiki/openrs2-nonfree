import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public final class Class203 {

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "Lclient!jagdx/IDirect3DSwapChain;")
	private IDirect3DSwapChain anIDirect3DSwapChain1;

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "Lclient!jagdx/IDirect3DSurface;")
	private IDirect3DSurface anIDirect3DSurface1;

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "Lclient!jagdx/IDirect3DSurface;")
	private IDirect3DSurface anIDirect3DSurface2;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Lclient!jagdx/IDirect3DSwapChain;Lclient!jagdx/IDirect3DSurface;)V")
	public Class203(@OriginalArg(0) IDirect3DSwapChain arg0, @OriginalArg(1) IDirect3DSurface arg1) {
		this.method4799(arg0, arg1);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Z)V")
	public void method4798() {
		if (this.anIDirect3DSurface1 != null) {
			this.anIDirect3DSurface1.a(119);
			this.anIDirect3DSurface1 = null;
		}
		if (this.anIDirect3DSurface2 != null) {
			this.anIDirect3DSurface2.a(91);
			this.anIDirect3DSurface2 = null;
		}
		if (this.anIDirect3DSwapChain1 != null) {
			this.anIDirect3DSwapChain1.a(96);
			this.anIDirect3DSwapChain1 = null;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!jagdx/IDirect3DSwapChain;BLclient!jagdx/IDirect3DSurface;)V")
	public void method4799(@OriginalArg(0) IDirect3DSwapChain arg0, @OriginalArg(2) IDirect3DSurface arg1) {
		this.anIDirect3DSurface2 = arg1;
		this.anIDirect3DSwapChain1 = arg0;
		this.anIDirect3DSurface1 = this.anIDirect3DSwapChain1.a(0, 0);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IZ)I")
	public int method4800() {
		return this.anIDirect3DSwapChain1.Present(0);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)Z")
	public boolean method4801() {
		return this.anIDirect3DSwapChain1 != null;
	}
}
