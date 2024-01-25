import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.rj;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fda")
public final class Class102 implements Interface14 {

	@OriginalMember(owner = "client!fda", name = "c", descriptor = "Lclient!jagdx/IDirect3DIndexBuffer;")
	public IDirect3DIndexBuffer anIDirect3DIndexBuffer1;

	@OriginalMember(owner = "client!fda", name = "d", descriptor = "I")
	private int anInt2498;

	@OriginalMember(owner = "client!fda", name = "f", descriptor = "I")
	private int anInt2499;

	@OriginalMember(owner = "client!fda", name = "g", descriptor = "Z")
	private boolean aBoolean196 = false;

	@OriginalMember(owner = "client!fda", name = "e", descriptor = "Lclient!hb;")
	private final Class133_Sub1_Sub1 aClass133_Sub1_Sub1_1;

	@OriginalMember(owner = "client!fda", name = "b", descriptor = "Z")
	private final boolean aBoolean195;

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "Lclient!al;")
	private final Class19 aClass19_11;

	@OriginalMember(owner = "client!fda", name = "<init>", descriptor = "(Lclient!hb;Lclient!al;Z)V")
	public Class102(@OriginalArg(0) Class133_Sub1_Sub1 arg0, @OriginalArg(1) Class19 arg1, @OriginalArg(2) boolean arg2) {
		this.aClass133_Sub1_Sub1_1 = arg0;
		this.aBoolean195 = arg2;
		this.aClass19_11 = arg1;
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(B)I")
	@Override
	public int method6758() {
		return this.anInt2498;
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(BI)V")
	@Override
	public void method6764(@OriginalArg(1) int arg0) {
		this.anInt2498 = arg0 * this.aClass19_11.anInt281;
		if (this.anInt2499 >= this.anInt2498) {
			return;
		}
		@Pc(20) short local20 = 8;
		@Pc(25) byte local25;
		if (this.aBoolean195) {
			local25 = 0;
			local20 = 520;
		} else {
			local25 = 1;
		}
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.b(false);
		}
		this.anIDirect3DIndexBuffer1 = this.aClass133_Sub1_Sub1_1.anIDirect3DDevice1.a(this.anInt2498, local20, Static20.aClass19_5 == this.aClass19_11 ? 101 : 102, local25, (IDirect3DIndexBuffer) this.anIDirect3DIndexBuffer1);
		this.anInt2499 = this.anInt2498;
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method6770() {
		if (this.anIDirect3DIndexBuffer1 == null) {
			return null;
		}
		@Pc(10) boolean local10 = this.aBoolean195 & true;
		if (!this.aBoolean196 && rj.a(-94, this.anIDirect3DIndexBuffer1.Lock(0, this.anInt2499, local10 ? 8192 : 0, this.aClass133_Sub1_Sub1_1.aGeometryBuffer1))) {
			this.aBoolean196 = true;
			return this.aClass133_Sub1_Sub1_1.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!fda", name = "b", descriptor = "(I)V")
	@Override
	public void method6765() {
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.b(false);
			this.anIDirect3DIndexBuffer1 = null;
		}
		this.anInt2498 = 0;
		this.anInt2499 = 0;
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(I)Lclient!al;")
	@Override
	public Class19 method6768() {
		return this.aClass19_11;
	}

	@OriginalMember(owner = "client!fda", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method6769() {
		if (this.aBoolean196 && rj.a(-13, this.anIDirect3DIndexBuffer1.Unlock())) {
			this.aBoolean196 = false;
			return true;
		} else {
			return false;
		}
	}
}
