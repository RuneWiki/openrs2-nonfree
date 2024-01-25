import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.op;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mda")
public final class Class216 implements Interface3 {

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "B")
	private byte aByte90;

	@OriginalMember(owner = "client!mda", name = "c", descriptor = "I")
	private int anInt6262;

	@OriginalMember(owner = "client!mda", name = "d", descriptor = "I")
	private int anInt6263;

	@OriginalMember(owner = "client!mda", name = "g", descriptor = "Lclient!jagdx/IDirect3DVertexBuffer;")
	public IDirect3DVertexBuffer anIDirect3DVertexBuffer1;

	@OriginalMember(owner = "client!mda", name = "b", descriptor = "Z")
	private boolean aBoolean475 = false;

	@OriginalMember(owner = "client!mda", name = "f", descriptor = "Z")
	private final boolean aBoolean476;

	@OriginalMember(owner = "client!mda", name = "e", descriptor = "Lclient!lt;")
	private final Class87_Sub1_Sub2 aClass87_Sub1_Sub2_4;

	@OriginalMember(owner = "client!mda", name = "<init>", descriptor = "(Lclient!lt;Z)V")
	public Class216(@OriginalArg(0) Class87_Sub1_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean476 = arg1;
		this.aClass87_Sub1_Sub2_4 = arg0;
	}

	@OriginalMember(owner = "client!mda", name = "b", descriptor = "(I)I")
	public int method5250() {
		return this.aByte90;
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(BZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method7189() {
		if (this.anIDirect3DVertexBuffer1 == null) {
			return null;
		}
		@Pc(11) boolean local11 = this.aBoolean476 & true;
		if (!this.aBoolean475 && op.a(this.anIDirect3DVertexBuffer1.Lock(0, this.anInt6262, local11 ? 8192 : 0, this.aClass87_Sub1_Sub2_4.aGeometryBuffer1), (byte) -103)) {
			this.aBoolean475 = true;
			return this.aClass87_Sub1_Sub2_4.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!mda", name = "c", descriptor = "(I)I")
	@Override
	public int method7668() {
		return this.anInt6263;
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(III)Z")
	@Override
	public boolean method7186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6263 = arg1;
		this.aByte90 = (byte) arg0;
		if (this.anInt6262 < this.anInt6263) {
			@Pc(17) short local17 = 8;
			@Pc(26) byte local26;
			if (this.aBoolean476) {
				local17 = 520;
				local26 = 0;
			} else {
				local26 = 1;
			}
			if (this.anIDirect3DVertexBuffer1 != null) {
				this.anIDirect3DVertexBuffer1.b(30216);
			}
			this.anIDirect3DVertexBuffer1 = this.aClass87_Sub1_Sub2_4.anIDirect3DDevice1.a(this.anInt6263, local17, 0, local26, (IDirect3DVertexBuffer) this.anIDirect3DVertexBuffer1);
			this.anInt6262 = this.anInt6263;
		}
		return this.anIDirect3DVertexBuffer1 != null;
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7187() {
		if (this.aBoolean475 && op.a(this.anIDirect3DVertexBuffer1.Unlock(), (byte) -104)) {
			this.aBoolean475 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(Z)V")
	@Override
	public void method7671() {
		if (this.anIDirect3DVertexBuffer1 != null) {
			this.anIDirect3DVertexBuffer1.b(30216);
			this.anIDirect3DVertexBuffer1 = null;
		}
		this.anInt6262 = 0;
		this.anInt6263 = 0;
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(Lclient!jaclib/memory/Source;IIB)Z")
	@Override
	public boolean method7188(@OriginalArg(0) Source arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return this.method7186(arg1, arg2) ? this.anIDirect3DVertexBuffer1.a(arg0, 0, 0, this.anInt6263, this.aBoolean476 ? 8192 : 0) : false;
	}
}
