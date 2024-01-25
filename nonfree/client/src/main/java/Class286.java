import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.jc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rk")
public final class Class286 implements Interface24 {

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "I")
	private int anInt7846;

	@OriginalMember(owner = "client!rk", name = "d", descriptor = "B")
	private byte aByte99;

	@OriginalMember(owner = "client!rk", name = "e", descriptor = "I")
	private int anInt7847;

	@OriginalMember(owner = "client!rk", name = "f", descriptor = "Lclient!jagdx/IDirect3DVertexBuffer;")
	public IDirect3DVertexBuffer anIDirect3DVertexBuffer1;

	@OriginalMember(owner = "client!rk", name = "g", descriptor = "Z")
	private boolean aBoolean569 = false;

	@OriginalMember(owner = "client!rk", name = "c", descriptor = "Z")
	private final boolean aBoolean568;

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "Lclient!hb;")
	private final Class12_Sub2_Sub1 aClass12_Sub2_Sub1_7;

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Lclient!hb;Z)V")
	public Class286(@OriginalArg(0) Class12_Sub2_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean568 = arg1;
		this.aClass12_Sub2_Sub1_7 = arg0;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)I")
	@Override
	public int method7647() {
		return this.anInt7846;
	}

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method6520() {
		if (this.aBoolean569 && jc.a(-1, this.anIDirect3DVertexBuffer1.Unlock())) {
			this.aBoolean569 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rk", name = "c", descriptor = "(I)I")
	public int method6522() {
		return this.aByte99;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(ZB)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method6519() {
		if (this.anIDirect3DVertexBuffer1 == null) {
			return null;
		}
		@Pc(16) boolean local16 = this.aBoolean568 & true;
		if (!this.aBoolean569 && jc.a(-1, this.anIDirect3DVertexBuffer1.Lock(0, this.anInt7847, local16 ? 8192 : 0, this.aClass12_Sub2_Sub1_7.aGeometryBuffer1))) {
			this.aBoolean569 = true;
			return this.aClass12_Sub2_Sub1_7.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "(B)V")
	@Override
	public void method7651() {
		if (this.anIDirect3DVertexBuffer1 != null) {
			this.anIDirect3DVertexBuffer1.a((byte) 127);
			this.anIDirect3DVertexBuffer1 = null;
		}
		this.anInt7847 = 0;
		this.anInt7846 = 0;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IBI)Z")
	@Override
	public boolean method6518(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aByte99 = (byte) arg0;
		this.anInt7846 = arg1;
		if (this.anInt7847 < this.anInt7846) {
			@Pc(18) short local18 = 8;
			@Pc(23) byte local23;
			if (this.aBoolean568) {
				local23 = 0;
				local18 = 520;
			} else {
				local23 = 1;
			}
			if (this.anIDirect3DVertexBuffer1 != null) {
				this.anIDirect3DVertexBuffer1.a((byte) 125);
			}
			this.anIDirect3DVertexBuffer1 = this.aClass12_Sub2_Sub1_7.anIDirect3DDevice1.a(this.anInt7846, local18, 0, local23, (IDirect3DVertexBuffer) this.anIDirect3DVertexBuffer1);
			this.anInt7847 = this.anInt7846;
		}
		return this.anIDirect3DVertexBuffer1 != null;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lclient!jaclib/memory/Source;III)Z")
	@Override
	public boolean method6517(@OriginalArg(0) Source arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return this.method6518(arg1, arg2) ? this.anIDirect3DVertexBuffer1.a(arg0, 0, 0, this.anInt7846, this.aBoolean568 ? 8192 : 0) : false;
	}
}
