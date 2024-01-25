import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.bea;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!as")
public final class Class17 implements Interface4 {

	@OriginalMember(owner = "client!as", name = "b", descriptor = "B")
	private byte aByte11;

	@OriginalMember(owner = "client!as", name = "c", descriptor = "I")
	private int anInt300;

	@OriginalMember(owner = "client!as", name = "d", descriptor = "Lclient!jagdx/IDirect3DVertexBuffer;")
	public IDirect3DVertexBuffer anIDirect3DVertexBuffer1;

	@OriginalMember(owner = "client!as", name = "f", descriptor = "I")
	private int anInt301;

	@OriginalMember(owner = "client!as", name = "a", descriptor = "Z")
	private boolean aBoolean27 = false;

	@OriginalMember(owner = "client!as", name = "g", descriptor = "Lclient!tb;")
	private final Class134_Sub1_Sub2 aClass134_Sub1_Sub2_1;

	@OriginalMember(owner = "client!as", name = "e", descriptor = "Z")
	private final boolean aBoolean28;

	@OriginalMember(owner = "client!as", name = "<init>", descriptor = "(Lclient!tb;Z)V")
	public Class17(@OriginalArg(0) Class134_Sub1_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		this.aClass134_Sub1_Sub2_1 = arg0;
		this.aBoolean28 = arg1;
	}

	@OriginalMember(owner = "client!as", name = "c", descriptor = "(B)I")
	public int method257() {
		return this.aByte11;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(I)V")
	@Override
	public void method7384() {
		if (this.anIDirect3DVertexBuffer1 != null) {
			this.anIDirect3DVertexBuffer1.a((byte) -80);
			this.anIDirect3DVertexBuffer1 = null;
		}
		this.anInt301 = 0;
		this.anInt300 = 0;
	}

	@OriginalMember(owner = "client!as", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method2466() {
		if (this.aBoolean27 && bea.a(108, this.anIDirect3DVertexBuffer1.Unlock())) {
			this.aBoolean27 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(III)Z")
	@Override
	public boolean method2468(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aByte11 = (byte) arg1;
		this.anInt301 = arg0;
		if (this.anInt301 > this.anInt300) {
			@Pc(18) short local18 = 8;
			@Pc(23) byte local23;
			if (this.aBoolean28) {
				local18 = 520;
				local23 = 0;
			} else {
				local23 = 1;
			}
			if (this.anIDirect3DVertexBuffer1 != null) {
				this.anIDirect3DVertexBuffer1.a((byte) -80);
			}
			this.anIDirect3DVertexBuffer1 = this.aClass134_Sub1_Sub2_1.anIDirect3DDevice1.a(this.anInt301, local18, 0, local23, (IDirect3DVertexBuffer) this.anIDirect3DVertexBuffer1);
			this.anInt300 = this.anInt301;
		}
		return this.anIDirect3DVertexBuffer1 != null;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(B)I")
	@Override
	public int method7374() {
		return this.anInt301;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IIILclient!jaclib/memory/Source;)Z")
	@Override
	public boolean method2467(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Source arg2) {
		return this.method2468(arg0, arg1) ? this.anIDirect3DVertexBuffer1.a(arg2, 0, 0, this.anInt301, this.aBoolean28 ? 8192 : 0) : false;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method2465() {
		if (this.anIDirect3DVertexBuffer1 == null) {
			return null;
		}
		@Pc(16) boolean local16 = this.aBoolean28 & true;
		if (!this.aBoolean27 && bea.a(104, this.anIDirect3DVertexBuffer1.Lock(0, this.anInt300, local16 ? 8192 : 0, this.aClass134_Sub1_Sub2_1.aGeometryBuffer1))) {
			this.aBoolean27 = true;
			return this.aClass134_Sub1_Sub2_1.aGeometryBuffer1;
		} else {
			return null;
		}
	}
}
