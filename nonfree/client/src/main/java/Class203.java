import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.pia;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ks")
public final class Class203 implements Interface25 {

	@OriginalMember(owner = "client!ks", name = "c", descriptor = "Lclient!jagdx/IDirect3DVertexBuffer;")
	public IDirect3DVertexBuffer anIDirect3DVertexBuffer1;

	@OriginalMember(owner = "client!ks", name = "d", descriptor = "I")
	private int anInt5928;

	@OriginalMember(owner = "client!ks", name = "e", descriptor = "B")
	private byte aByte88;

	@OriginalMember(owner = "client!ks", name = "f", descriptor = "I")
	private int anInt5929;

	@OriginalMember(owner = "client!ks", name = "g", descriptor = "Z")
	private boolean aBoolean436 = false;

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "Lclient!lj;")
	private final Class101_Sub1_Sub2 aClass101_Sub1_Sub2_7;

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "Z")
	private final boolean aBoolean435;

	@OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(Lclient!lj;Z)V")
	public Class203(@OriginalArg(0) Class101_Sub1_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		this.aClass101_Sub1_Sub2_7 = arg0;
		this.aBoolean435 = arg1;
	}

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(I)V")
	@Override
	public void method9037() {
		if (this.anIDirect3DVertexBuffer1 != null) {
			this.anIDirect3DVertexBuffer1.a(-4840);
			this.anIDirect3DVertexBuffer1 = null;
		}
		this.anInt5929 = 0;
		this.anInt5928 = 0;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method9041() {
		if (this.aBoolean436 && pia.a(-2005530600, this.anIDirect3DVertexBuffer1.Unlock())) {
			this.aBoolean436 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(B)I")
	public int method5363() {
		return this.aByte88;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(B)I")
	@Override
	public int method9028() {
		return this.anInt5929;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(BILclient!jaclib/memory/Source;I)Z")
	@Override
	public boolean method9042(@OriginalArg(1) int arg0, @OriginalArg(2) Source arg1, @OriginalArg(3) int arg2) {
		return this.method9040(arg2, arg0) ? this.anIDirect3DVertexBuffer1.a(arg1, 0, 0, this.anInt5929, this.aBoolean435 ? 8192 : 0) : false;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IBI)Z")
	@Override
	public boolean method9040(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aByte88 = (byte) arg1;
		this.anInt5929 = arg0;
		if (this.anInt5928 < this.anInt5929) {
			@Pc(22) short local22 = 8;
			@Pc(27) byte local27;
			if (this.aBoolean435) {
				local22 = 520;
				local27 = 0;
			} else {
				local27 = 1;
			}
			if (this.anIDirect3DVertexBuffer1 != null) {
				this.anIDirect3DVertexBuffer1.a(-4840);
			}
			this.anIDirect3DVertexBuffer1 = this.aClass101_Sub1_Sub2_7.anIDirect3DDevice1.a(this.anInt5929, local22, 0, local27, (IDirect3DVertexBuffer) this.anIDirect3DVertexBuffer1);
			this.anInt5928 = this.anInt5929;
		}
		return this.anIDirect3DVertexBuffer1 != null;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method9043() {
		if (this.anIDirect3DVertexBuffer1 == null) {
			return null;
		}
		@Pc(9) boolean local9 = this.aBoolean435 & true;
		if (!this.aBoolean436 && pia.a(-2005530600, this.anIDirect3DVertexBuffer1.Lock(0, this.anInt5928, local9 ? 8192 : 0, this.aClass101_Sub1_Sub2_7.aGeometryBuffer1))) {
			this.aBoolean436 = true;
			return this.aClass101_Sub1_Sub2_7.aGeometryBuffer1;
		} else {
			return null;
		}
	}
}
