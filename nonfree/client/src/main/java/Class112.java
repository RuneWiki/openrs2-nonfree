import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.rj;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ft")
public final class Class112 implements Interface6 {

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "B")
	private byte aByte55;

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "Lclient!jagdx/IDirect3DVertexBuffer;")
	public IDirect3DVertexBuffer anIDirect3DVertexBuffer1;

	@OriginalMember(owner = "client!ft", name = "c", descriptor = "I")
	private int anInt2737;

	@OriginalMember(owner = "client!ft", name = "g", descriptor = "I")
	private int anInt2738;

	@OriginalMember(owner = "client!ft", name = "f", descriptor = "Z")
	private boolean aBoolean212 = false;

	@OriginalMember(owner = "client!ft", name = "d", descriptor = "Z")
	private final boolean aBoolean211;

	@OriginalMember(owner = "client!ft", name = "e", descriptor = "Lclient!hb;")
	private final Class133_Sub1_Sub1 aClass133_Sub1_Sub1_3;

	@OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(Lclient!hb;Z)V")
	public Class112(@OriginalArg(0) Class133_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean211 = arg1;
		this.aClass133_Sub1_Sub1_3 = arg0;
	}

	@OriginalMember(owner = "client!ft", name = "c", descriptor = "(I)I")
	public int method2355() {
		return this.aByte55;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(ILclient!jaclib/memory/Source;II)Z")
	@Override
	public boolean method4125(@OriginalArg(1) Source arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return this.method4124(arg2, arg1) ? this.anIDirect3DVertexBuffer1.a(arg0, 0, 0, this.anInt2737, this.aBoolean211 ? 8192 : 0) : false;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method4126() {
		if (this.anIDirect3DVertexBuffer1 == null) {
			return null;
		}
		@Pc(11) boolean local11 = this.aBoolean211 & true;
		if (!this.aBoolean212 && rj.a(-17, this.anIDirect3DVertexBuffer1.Lock(0, this.anInt2738, local11 ? 8192 : 0, this.aClass133_Sub1_Sub1_3.aGeometryBuffer1))) {
			this.aBoolean212 = true;
			return this.aClass133_Sub1_Sub1_3.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method4123() {
		if (this.aBoolean212 && rj.a(126, this.anIDirect3DVertexBuffer1.Unlock())) {
			this.aBoolean212 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(ZII)Z")
	@Override
	public boolean method4124(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt2737 = arg0;
		this.aByte55 = (byte) arg1;
		if (this.anInt2737 > this.anInt2738) {
			@Pc(21) short local21 = 8;
			@Pc(26) byte local26;
			if (this.aBoolean211) {
				local26 = 0;
				local21 = 520;
			} else {
				local26 = 1;
			}
			if (this.anIDirect3DVertexBuffer1 != null) {
				this.anIDirect3DVertexBuffer1.b(false);
			}
			this.anIDirect3DVertexBuffer1 = this.aClass133_Sub1_Sub1_3.anIDirect3DDevice1.a(this.anInt2737, local21, 0, local26, (IDirect3DVertexBuffer) this.anIDirect3DVertexBuffer1);
			this.anInt2738 = this.anInt2737;
		}
		return this.anIDirect3DVertexBuffer1 != null;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(B)I")
	@Override
	public int method6758() {
		return this.anInt2737;
	}

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "(I)V")
	@Override
	public void method6765() {
		if (this.anIDirect3DVertexBuffer1 != null) {
			this.anIDirect3DVertexBuffer1.b(false);
			this.anIDirect3DVertexBuffer1 = null;
		}
		this.anInt2737 = 0;
		this.anInt2738 = 0;
	}
}
