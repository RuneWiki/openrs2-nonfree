import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.pp;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!es")
public final class Class87 implements Interface23 {

	@OriginalMember(owner = "client!es", name = "a", descriptor = "I")
	private int anInt3466;

	@OriginalMember(owner = "client!es", name = "b", descriptor = "Lclient!jagdx/IDirect3DIndexBuffer;")
	public IDirect3DIndexBuffer anIDirect3DIndexBuffer1;

	@OriginalMember(owner = "client!es", name = "f", descriptor = "I")
	private int anInt3467;

	@OriginalMember(owner = "client!es", name = "c", descriptor = "Z")
	private boolean aBoolean283 = false;

	@OriginalMember(owner = "client!es", name = "d", descriptor = "Lclient!ew;")
	private final Class89 aClass89_4;

	@OriginalMember(owner = "client!es", name = "e", descriptor = "Z")
	private final boolean aBoolean284;

	@OriginalMember(owner = "client!es", name = "g", descriptor = "Lclient!cu;")
	private final Class33_Sub1_Sub2 aClass33_Sub1_Sub2_4;

	@OriginalMember(owner = "client!es", name = "<init>", descriptor = "(Lclient!cu;Lclient!ew;Z)V")
	public Class87(@OriginalArg(0) Class33_Sub1_Sub2 arg0, @OriginalArg(1) Class89 arg1, @OriginalArg(2) boolean arg2) {
		this.aClass89_4 = arg1;
		this.aBoolean284 = arg2;
		this.aClass33_Sub1_Sub2_4 = arg0;
	}

	@OriginalMember(owner = "client!es", name = "b", descriptor = "(B)Lclient!ew;")
	@Override
	public Class89 method4805() {
		return this.aClass89_4;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(B)I")
	@Override
	public int method7621() {
		return this.anInt3466;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IB)V")
	@Override
	public void method7624(@OriginalArg(0) int arg0) {
		this.anInt3466 = arg0 * this.aClass89_4.anInt3518;
		if (this.anInt3467 >= this.anInt3466) {
			return;
		}
		@Pc(22) short local22 = 8;
		@Pc(27) byte local27;
		if (this.aBoolean284) {
			local27 = 0;
			local22 = 520;
		} else {
			local27 = 1;
		}
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.b(127);
		}
		this.anIDirect3DIndexBuffer1 = this.aClass33_Sub1_Sub2_4.anIDirect3DDevice1.a(this.anInt3466, local22, Static137.aClass89_9 == this.aClass89_4 ? 101 : 102, local27, (IDirect3DIndexBuffer) this.anIDirect3DIndexBuffer1);
		this.anInt3467 = this.anInt3466;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(BZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method4807() {
		if (this.anIDirect3DIndexBuffer1 == null) {
			return null;
		}
		@Pc(9) boolean local9 = this.aBoolean284 & true;
		if (!this.aBoolean283 && pp.a(false, this.anIDirect3DIndexBuffer1.Lock(0, this.anInt3467, local9 ? 8192 : 0, this.aClass33_Sub1_Sub2_4.aGeometryBuffer1))) {
			this.aBoolean283 = true;
			return this.aClass33_Sub1_Sub2_4.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!es", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method4806() {
		if (this.aBoolean283 && pp.a(false, this.anIDirect3DIndexBuffer1.Unlock())) {
			this.aBoolean283 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(I)V")
	@Override
	public void method7627() {
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.b(127);
			this.anIDirect3DIndexBuffer1 = null;
		}
		this.anInt3466 = 0;
		this.anInt3467 = 0;
	}
}
