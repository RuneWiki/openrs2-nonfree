import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.vq;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tj")
public final class Class321 implements Interface19 {

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "Lclient!jagdx/IDirect3DIndexBuffer;")
	public IDirect3DIndexBuffer anIDirect3DIndexBuffer1;

	@OriginalMember(owner = "client!tj", name = "d", descriptor = "I")
	private int anInt9263;

	@OriginalMember(owner = "client!tj", name = "f", descriptor = "I")
	private int anInt9264;

	@OriginalMember(owner = "client!tj", name = "g", descriptor = "Z")
	private boolean aBoolean666 = false;

	@OriginalMember(owner = "client!tj", name = "e", descriptor = "Lclient!wq;")
	private final Class376 aClass376_12;

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "Z")
	private final boolean aBoolean665;

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "Lclient!ad;")
	private final Class5_Sub1_Sub1 aClass5_Sub1_Sub1_9;

	@OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Lclient!ad;Lclient!wq;Z)V")
	public Class321(@OriginalArg(0) Class5_Sub1_Sub1 arg0, @OriginalArg(1) Class376 arg1, @OriginalArg(2) boolean arg2) {
		this.aClass376_12 = arg1;
		this.aBoolean665 = arg2;
		this.aClass5_Sub1_Sub1_9 = arg0;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(Z)I")
	@Override
	public int method7980() {
		return this.anInt9263;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7985() {
		if (this.aBoolean666 && vq.b(-2005530516, this.anIDirect3DIndexBuffer1.Unlock())) {
			this.aBoolean666 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "(I)Lclient!wq;")
	@Override
	public Class376 method7983() {
		return this.aClass376_12;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V")
	@Override
	public void method7982() {
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.a((byte) -105);
			this.anIDirect3DIndexBuffer1 = null;
		}
		this.anInt9263 = 0;
		this.anInt9264 = 0;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IB)V")
	@Override
	public void method7981(@OriginalArg(0) int arg0) {
		this.anInt9263 = this.aClass376_12.anInt10167 * arg0;
		if (this.anInt9263 <= this.anInt9264) {
			return;
		}
		@Pc(19) short local19 = 8;
		@Pc(24) byte local24;
		if (this.aBoolean665) {
			local24 = 0;
			local19 = 520;
		} else {
			local24 = 1;
		}
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.a((byte) -91);
		}
		this.anIDirect3DIndexBuffer1 = this.aClass5_Sub1_Sub1_9.anIDirect3DDevice1.a(this.anInt9263, local19, this.aClass376_12 == Static637.aClass376_17 ? 101 : 102, local24, (IDirect3DIndexBuffer) this.anIDirect3DIndexBuffer1);
		this.anInt9264 = this.anInt9263;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(ZB)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method7984() {
		if (this.anIDirect3DIndexBuffer1 == null) {
			return null;
		}
		@Pc(11) boolean local11 = this.aBoolean665 & true;
		if (!this.aBoolean666 && vq.b(-2005530516, this.anIDirect3DIndexBuffer1.Lock(0, this.anInt9264, local11 ? 8192 : 0, this.aClass5_Sub1_Sub1_9.aGeometryBuffer1))) {
			this.aBoolean666 = true;
			return this.aClass5_Sub1_Sub1_9.aGeometryBuffer1;
		} else {
			return null;
		}
	}
}
