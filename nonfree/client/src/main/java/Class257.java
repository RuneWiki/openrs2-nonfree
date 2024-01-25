import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.fo;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rr")
public final class Class257 implements Interface15 {

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "Lclient!jagdx/IDirect3DVertexBuffer;")
	public IDirect3DVertexBuffer anIDirect3DVertexBuffer1;

	@OriginalMember(owner = "client!rr", name = "d", descriptor = "B")
	private byte aByte90;

	@OriginalMember(owner = "client!rr", name = "e", descriptor = "I")
	private int anInt7351;

	@OriginalMember(owner = "client!rr", name = "f", descriptor = "I")
	private int anInt7352;

	@OriginalMember(owner = "client!rr", name = "g", descriptor = "Z")
	private boolean aBoolean486 = false;

	@OriginalMember(owner = "client!rr", name = "c", descriptor = "Z")
	private final boolean aBoolean485;

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "Lclient!wda;")
	private final Class9_Sub1_Sub2 aClass9_Sub1_Sub2_7;

	@OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(Lclient!wda;Z)V")
	public Class257(@OriginalArg(0) Class9_Sub1_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean485 = arg1;
		this.aClass9_Sub1_Sub2_7 = arg0;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIB)Z")
	@Override
	public boolean method6277(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7352 = arg0;
		this.aByte90 = (byte) arg1;
		if (this.anInt7352 > this.anInt7351) {
			@Pc(23) short local23 = 8;
			@Pc(32) byte local32;
			if (this.aBoolean485) {
				local23 = 520;
				local32 = 0;
			} else {
				local32 = 1;
			}
			if (this.anIDirect3DVertexBuffer1 != null) {
				this.anIDirect3DVertexBuffer1.a(2266);
			}
			this.anIDirect3DVertexBuffer1 = this.aClass9_Sub1_Sub2_7.anIDirect3DDevice1.a(this.anInt7352, local23, 0, local32, (IDirect3DVertexBuffer) this.anIDirect3DVertexBuffer1);
			this.anInt7351 = this.anInt7352;
		}
		return this.anIDirect3DVertexBuffer1 != null;
	}

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "(I)I")
	@Override
	public int method7517() {
		return this.anInt7352;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IILclient!jaclib/memory/Source;I)Z")
	@Override
	public boolean method6274(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Source arg2) {
		return this.method6277(arg1, arg0) ? this.anIDirect3DVertexBuffer1.a(arg2, 0, 0, this.anInt7352, this.aBoolean485 ? 8192 : 0) : false;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7521() {
		if (this.aBoolean486 && fo.a(this.anIDirect3DVertexBuffer1.Unlock(), (byte) 103)) {
			this.aBoolean486 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(B)I")
	public int method6279() {
		return this.aByte90;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method7519() {
		@Pc(10) boolean local10 = this.aBoolean485 & true;
		if (!this.aBoolean486 && fo.a(this.anIDirect3DVertexBuffer1.Lock(0, this.anInt7351, local10 ? 8192 : 0, this.aClass9_Sub1_Sub2_7.aGeometryBuffer1), (byte) 117)) {
			this.aBoolean486 = true;
			return this.aClass9_Sub1_Sub2_7.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "(B)V")
	@Override
	public void method7527() {
		if (this.anIDirect3DVertexBuffer1 != null) {
			this.anIDirect3DVertexBuffer1.a(2266);
			this.anIDirect3DVertexBuffer1 = null;
		}
		this.anInt7351 = 0;
		this.anInt7352 = 0;
	}
}
