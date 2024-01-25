import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.hl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dp")
public final class Class69 implements Interface3 {

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "I")
	private int anInt2268;

	@OriginalMember(owner = "client!dp", name = "d", descriptor = "I")
	private int anInt2269;

	@OriginalMember(owner = "client!dp", name = "f", descriptor = "Lclient!jagdx/IDirect3DIndexBuffer;")
	public IDirect3DIndexBuffer anIDirect3DIndexBuffer1;

	@OriginalMember(owner = "client!dp", name = "e", descriptor = "Z")
	private boolean aBoolean159 = false;

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "Lclient!kaa;")
	private final Class44_Sub2_Sub2 aClass44_Sub2_Sub2_3;

	@OriginalMember(owner = "client!dp", name = "g", descriptor = "Z")
	private final boolean aBoolean160;

	@OriginalMember(owner = "client!dp", name = "c", descriptor = "Lclient!bv;")
	private final Class42 aClass42_11;

	@OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(Lclient!kaa;Lclient!bv;Z)V")
	public Class69(@OriginalArg(0) Class44_Sub2_Sub2 arg0, @OriginalArg(1) Class42 arg1, @OriginalArg(2) boolean arg2) {
		this.aClass44_Sub2_Sub2_3 = arg0;
		this.aBoolean160 = arg2;
		this.aClass42_11 = arg1;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(B)V")
	@Override
	public void method5230() {
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.b(100);
			this.anIDirect3DIndexBuffer1 = null;
		}
		this.anInt2269 = 0;
		this.anInt2268 = 0;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(Z)Lclient!bv;")
	@Override
	public Class42 method5236() {
		return this.aClass42_11;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(II)V")
	@Override
	public void method5228(@OriginalArg(0) int arg0) {
		this.anInt2268 = arg0 * this.aClass42_11.anInt771;
		if (this.anInt2269 >= this.anInt2268) {
			return;
		}
		@Pc(22) short local22 = 8;
		@Pc(27) byte local27;
		if (this.aBoolean160) {
			local22 = 520;
			local27 = 0;
		} else {
			local27 = 1;
		}
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.b(100);
		}
		this.anIDirect3DIndexBuffer1 = this.aClass44_Sub2_Sub2_3.anIDirect3DDevice1.a(this.anInt2268, local22, Static53.aClass42_5 == this.aClass42_11 ? 101 : 102, local27, (IDirect3DIndexBuffer) this.anIDirect3DIndexBuffer1);
		this.anInt2269 = this.anInt2268;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(ZB)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method5235() {
		if (this.anIDirect3DIndexBuffer1 == null) {
			return null;
		}
		@Pc(10) boolean local10 = this.aBoolean160 & true;
		if (!this.aBoolean159 && hl.a((byte) -51, this.anIDirect3DIndexBuffer1.Lock(0, this.anInt2269, local10 ? 8192 : 0, this.aClass44_Sub2_Sub2_3.aGeometryBuffer1))) {
			this.aBoolean159 = true;
			return this.aClass44_Sub2_Sub2_3.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5237() {
		if (this.aBoolean159 && hl.a((byte) 127, this.anIDirect3DIndexBuffer1.Unlock())) {
			this.aBoolean159 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "(I)I")
	@Override
	public int method5223() {
		return this.anInt2268;
	}
}
