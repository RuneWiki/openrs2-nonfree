import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.ica;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ab")
public final class Class2 implements Interface13 {

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "B")
	private byte aByte1;

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "Lclient!jagdx/IDirect3DVertexBuffer;")
	public IDirect3DVertexBuffer anIDirect3DVertexBuffer1;

	@OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
	private int anInt17;

	@OriginalMember(owner = "client!ab", name = "g", descriptor = "I")
	private int anInt18;

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "Z")
	private boolean aBoolean4 = false;

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "Lclient!tga;")
	private final Class14_Sub2_Sub2 aClass14_Sub2_Sub2_1;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "Z")
	private final boolean aBoolean3;

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Lclient!tga;Z)V")
	public Class2(@OriginalArg(0) Class14_Sub2_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		this.aClass14_Sub2_Sub2_1 = arg0;
		this.aBoolean3 = arg1;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
	@Override
	public void method4091() {
		if (this.anIDirect3DVertexBuffer1 != null) {
			this.anIDirect3DVertexBuffer1.a(86);
			this.anIDirect3DVertexBuffer1 = null;
		}
		this.anInt17 = 0;
		this.anInt18 = 0;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IBI)Z")
	@Override
	public boolean method1884(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aByte1 = (byte) arg0;
		this.anInt17 = arg1;
		if (this.anInt17 > this.anInt18) {
			@Pc(23) short local23 = 8;
			@Pc(28) byte local28;
			if (this.aBoolean3) {
				local23 = 520;
				local28 = 0;
			} else {
				local28 = 1;
			}
			if (this.anIDirect3DVertexBuffer1 != null) {
				this.anIDirect3DVertexBuffer1.a(71);
			}
			this.anIDirect3DVertexBuffer1 = this.aClass14_Sub2_Sub2_1.anIDirect3DDevice1.a(this.anInt17, local23, 0, local28, (IDirect3DVertexBuffer) this.anIDirect3DVertexBuffer1);
			this.anInt18 = this.anInt17;
		}
		return this.anIDirect3DVertexBuffer1 != null;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILclient!jaclib/memory/Source;II)Z")
	@Override
	public boolean method1883(@OriginalArg(1) Source arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return this.method1884(arg1, arg2) ? this.anIDirect3DVertexBuffer1.a(arg0, 0, 0, this.anInt17, this.aBoolean3 ? 8192 : 0) : false;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method4094() {
		if (this.aBoolean4 && ica.b(14528, this.anIDirect3DVertexBuffer1.Unlock())) {
			this.aBoolean4 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)I")
	@Override
	public int method4087() {
		return this.anInt17;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(ZZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method4095() {
		if (this.anIDirect3DVertexBuffer1 == null) {
			return null;
		}
		@Pc(15) boolean local15 = this.aBoolean3 & true;
		if (!this.aBoolean4 && ica.b(14528, this.anIDirect3DVertexBuffer1.Lock(0, this.anInt18, local15 ? 8192 : 0, this.aClass14_Sub2_Sub2_1.aGeometryBuffer1))) {
			this.aBoolean4 = true;
			return this.aClass14_Sub2_Sub2_1.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)I")
	public int method56() {
		return this.aByte1;
	}
}
