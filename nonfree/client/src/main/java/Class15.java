import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.ue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aja")
public final class Class15 implements Interface22 {

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "I")
	private int anInt273;

	@OriginalMember(owner = "client!aja", name = "d", descriptor = "Lclient!jagdx/IDirect3DVertexBuffer;")
	public IDirect3DVertexBuffer anIDirect3DVertexBuffer1;

	@OriginalMember(owner = "client!aja", name = "f", descriptor = "B")
	private byte aByte5;

	@OriginalMember(owner = "client!aja", name = "g", descriptor = "I")
	private int anInt274;

	@OriginalMember(owner = "client!aja", name = "c", descriptor = "Z")
	private boolean aBoolean15 = false;

	@OriginalMember(owner = "client!aja", name = "e", descriptor = "Lclient!bfa;")
	private final Class20_Sub2_Sub1 aClass20_Sub2_Sub1_1;

	@OriginalMember(owner = "client!aja", name = "b", descriptor = "Z")
	private final boolean aBoolean14;

	@OriginalMember(owner = "client!aja", name = "<init>", descriptor = "(Lclient!bfa;Z)V")
	public Class15(@OriginalArg(0) Class20_Sub2_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		this.aClass20_Sub2_Sub1_1 = arg0;
		this.aBoolean14 = arg1;
	}

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(Z)I")
	@Override
	public int method6473() {
		return this.anInt273;
	}

	@OriginalMember(owner = "client!aja", name = "b", descriptor = "(I)V")
	@Override
	public void method6475() {
		if (this.anIDirect3DVertexBuffer1 != null) {
			this.anIDirect3DVertexBuffer1.a(9275);
			this.anIDirect3DVertexBuffer1 = null;
		}
		this.anInt274 = 0;
		this.anInt273 = 0;
	}

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(IBI)Z")
	@Override
	public boolean method764(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aByte5 = (byte) arg1;
		this.anInt273 = arg0;
		if (this.anInt273 > this.anInt274) {
			@Pc(23) short local23 = 8;
			@Pc(32) byte local32;
			if (this.aBoolean14) {
				local23 = 520;
				local32 = 0;
			} else {
				local32 = 1;
			}
			if (this.anIDirect3DVertexBuffer1 != null) {
				this.anIDirect3DVertexBuffer1.a(9275);
			}
			this.anIDirect3DVertexBuffer1 = this.aClass20_Sub2_Sub1_1.anIDirect3DDevice1.a(this.anInt273, local23, 0, local32, (IDirect3DVertexBuffer) this.anIDirect3DVertexBuffer1);
			this.anInt274 = this.anInt273;
		}
		return this.anIDirect3DVertexBuffer1 != null;
	}

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method763() {
		if (this.anIDirect3DVertexBuffer1 == null) {
			return null;
		}
		@Pc(9) boolean local9 = this.aBoolean14 & true;
		if (!this.aBoolean15 && ue.a(this.anIDirect3DVertexBuffer1.Lock(0, this.anInt274, local9 ? 8192 : 0, this.aClass20_Sub2_Sub1_1.aGeometryBuffer1), false)) {
			this.aBoolean15 = true;
			return this.aClass20_Sub2_Sub1_1.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(Lclient!jaclib/memory/Source;IIB)Z")
	@Override
	public boolean method761(@OriginalArg(0) Source arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return this.method764(arg2, arg1) ? this.anIDirect3DVertexBuffer1.a(arg0, 0, 0, this.anInt273, this.aBoolean14 ? 8192 : 0) : false;
	}

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method762() {
		if (this.aBoolean15 && ue.a(this.anIDirect3DVertexBuffer1.Unlock(), false)) {
			this.aBoolean15 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aja", name = "c", descriptor = "(I)I")
	public int method333() {
		return this.aByte5;
	}
}
