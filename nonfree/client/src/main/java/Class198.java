import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.js;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class198 implements Interface15 {

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "I")
	private int anInt5923;

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
	private int anInt5924;

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "B")
	private byte aByte70;

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "Lclient!jagdx/IDirect3DVertexBuffer;")
	public IDirect3DVertexBuffer anIDirect3DVertexBuffer1;

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "Z")
	private boolean aBoolean413 = false;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "Lclient!to;")
	private final Class31_Sub1_Sub2 aClass31_Sub1_Sub2_5;

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "Z")
	private final boolean aBoolean414;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Lclient!to;Z)V")
	public Class198(@OriginalArg(0) Class31_Sub1_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		this.aClass31_Sub1_Sub2_5 = arg0;
		this.aBoolean414 = arg1;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5276() {
		if (this.aBoolean413 && js.b(this.anIDirect3DVertexBuffer1.Unlock(), 141953135)) {
			this.aBoolean413 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method5275() {
		if (this.anIDirect3DVertexBuffer1 == null) {
			return null;
		}
		@Pc(9) boolean local9 = this.aBoolean414 & true;
		if (!this.aBoolean413 && js.b(this.anIDirect3DVertexBuffer1.Lock(0, this.anInt5924, local9 ? 8192 : 0, this.aClass31_Sub1_Sub2_5.aGeometryBuffer1), 141953135)) {
			this.aBoolean413 = true;
			return this.aClass31_Sub1_Sub2_5.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)I")
	@Override
	public int method7278() {
		return this.anInt5923;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BII)Z")
	@Override
	public boolean method5277(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt5923 = arg0;
		this.aByte70 = (byte) arg1;
		if (this.anInt5923 > this.anInt5924) {
			@Pc(13) short local13 = 8;
			@Pc(22) byte local22;
			if (this.aBoolean414) {
				local13 = 520;
				local22 = 0;
			} else {
				local22 = 1;
			}
			if (this.anIDirect3DVertexBuffer1 != null) {
				this.anIDirect3DVertexBuffer1.a(false);
			}
			this.anIDirect3DVertexBuffer1 = this.aClass31_Sub1_Sub2_5.anIDirect3DDevice1.a(this.anInt5923, local13, 0, local22, (IDirect3DVertexBuffer) this.anIDirect3DVertexBuffer1);
			this.anInt5924 = this.anInt5923;
		}
		return this.anIDirect3DVertexBuffer1 != null;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
	@Override
	public void method7285() {
		if (this.anIDirect3DVertexBuffer1 != null) {
			this.anIDirect3DVertexBuffer1.a(false);
			this.anIDirect3DVertexBuffer1 = null;
		}
		this.anInt5924 = 0;
		this.anInt5923 = 0;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!jaclib/memory/Source;III)Z")
	@Override
	public boolean method5278(@OriginalArg(0) Source arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return this.method5277(arg2, arg1) ? this.anIDirect3DVertexBuffer1.a(arg0, 0, 0, this.anInt5923, this.aBoolean414 ? 8192 : 0) : false;
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)I")
	public int method4794() {
		return this.aByte70;
	}
}
