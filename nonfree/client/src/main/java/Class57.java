import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.eo;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!co")
public final class Class57 implements Interface24 {

	@OriginalMember(owner = "client!co", name = "a", descriptor = "I")
	private int anInt1883;

	@OriginalMember(owner = "client!co", name = "b", descriptor = "B")
	private byte aByte24;

	@OriginalMember(owner = "client!co", name = "d", descriptor = "Lclient!jagdx/IDirect3DVertexBuffer;")
	public IDirect3DVertexBuffer anIDirect3DVertexBuffer1;

	@OriginalMember(owner = "client!co", name = "e", descriptor = "I")
	private int anInt1884;

	@OriginalMember(owner = "client!co", name = "c", descriptor = "Z")
	private boolean aBoolean151 = false;

	@OriginalMember(owner = "client!co", name = "g", descriptor = "Lclient!oe;")
	private final Class7_Sub1_Sub2 aClass7_Sub1_Sub2_3;

	@OriginalMember(owner = "client!co", name = "f", descriptor = "Z")
	private final boolean aBoolean152;

	@OriginalMember(owner = "client!co", name = "<init>", descriptor = "(Lclient!oe;Z)V")
	public Class57(@OriginalArg(0) Class7_Sub1_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		this.aClass7_Sub1_Sub2_3 = arg0;
		this.aBoolean152 = arg1;
	}

	@OriginalMember(owner = "client!co", name = "c", descriptor = "(I)I")
	@Override
	public int method7923() {
		return this.anInt1883;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(ZB)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method6550() {
		if (this.anIDirect3DVertexBuffer1 == null) {
			return null;
		}
		@Pc(17) boolean local17 = this.aBoolean152 & true;
		if (!this.aBoolean151 && eo.a(61, this.anIDirect3DVertexBuffer1.Lock(0, this.anInt1884, local17 ? 8192 : 0, this.aClass7_Sub1_Sub2_3.aGeometryBuffer1))) {
			this.aBoolean151 = true;
			return this.aClass7_Sub1_Sub2_3.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(ILclient!jaclib/memory/Source;IB)Z")
	@Override
	public boolean method6548(@OriginalArg(0) int arg0, @OriginalArg(1) Source arg1, @OriginalArg(2) int arg2) {
		return this.method6549(arg2, arg0) ? this.anIDirect3DVertexBuffer1.a(arg1, 0, 0, this.anInt1883, this.aBoolean152 ? 8192 : 0) : false;
	}

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(I)I")
	public int method1572() {
		return this.aByte24;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(B)V")
	@Override
	public void method7925() {
		if (this.anIDirect3DVertexBuffer1 != null) {
			this.anIDirect3DVertexBuffer1.b((byte) -6);
			this.anIDirect3DVertexBuffer1 = null;
		}
		this.anInt1883 = 0;
		this.anInt1884 = 0;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(III)Z")
	@Override
	public boolean method6549(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aByte24 = (byte) arg1;
		this.anInt1883 = arg0;
		if (this.anInt1883 > this.anInt1884) {
			@Pc(17) short local17 = 8;
			@Pc(22) byte local22;
			if (this.aBoolean152) {
				local17 = 520;
				local22 = 0;
			} else {
				local22 = 1;
			}
			if (this.anIDirect3DVertexBuffer1 != null) {
				this.anIDirect3DVertexBuffer1.b((byte) -6);
			}
			this.anIDirect3DVertexBuffer1 = this.aClass7_Sub1_Sub2_3.anIDirect3DDevice1.a(this.anInt1883, local17, 0, local22, (IDirect3DVertexBuffer) this.anIDirect3DVertexBuffer1);
			this.anInt1884 = this.anInt1883;
		}
		return this.anIDirect3DVertexBuffer1 != null;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method6551() {
		if (this.aBoolean151 && eo.a(50, this.anIDirect3DVertexBuffer1.Unlock())) {
			this.aBoolean151 = false;
			return true;
		} else {
			return false;
		}
	}
}
