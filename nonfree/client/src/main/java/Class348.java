import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.jc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vt")
public final class Class348 implements Interface13 {

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "I")
	private int anInt9263;

	@OriginalMember(owner = "client!vt", name = "c", descriptor = "Lclient!jagdx/IDirect3DIndexBuffer;")
	public IDirect3DIndexBuffer anIDirect3DIndexBuffer1;

	@OriginalMember(owner = "client!vt", name = "d", descriptor = "I")
	private int anInt9264;

	@OriginalMember(owner = "client!vt", name = "f", descriptor = "Z")
	private boolean aBoolean675 = false;

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "Z")
	private final boolean aBoolean674;

	@OriginalMember(owner = "client!vt", name = "g", descriptor = "Lclient!vea;")
	private final Class340 aClass340_19;

	@OriginalMember(owner = "client!vt", name = "e", descriptor = "Lclient!hb;")
	private final Class12_Sub2_Sub1 aClass12_Sub2_Sub1_8;

	@OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(Lclient!hb;Lclient!vea;Z)V")
	public Class348(@OriginalArg(0) Class12_Sub2_Sub1 arg0, @OriginalArg(1) Class340 arg1, @OriginalArg(2) boolean arg2) {
		this.aBoolean674 = arg2;
		this.aClass340_19 = arg1;
		this.aClass12_Sub2_Sub1_8 = arg0;
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(ZB)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method7648() {
		if (this.anIDirect3DIndexBuffer1 == null) {
			return null;
		}
		@Pc(11) boolean local11 = this.aBoolean674 & true;
		if (!this.aBoolean675 && jc.a(-1, this.anIDirect3DIndexBuffer1.Lock(0, this.anInt9263, local11 ? 8192 : 0, this.aClass12_Sub2_Sub1_8.aGeometryBuffer1))) {
			this.aBoolean675 = true;
			return this.aClass12_Sub2_Sub1_8.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(B)Lclient!vea;")
	@Override
	public Class340 method7649() {
		return this.aClass340_19;
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(II)V")
	@Override
	public void method7650(@OriginalArg(0) int arg0) {
		this.anInt9264 = this.aClass340_19.anInt9068 * arg0;
		if (this.anInt9264 <= this.anInt9263) {
			return;
		}
		@Pc(22) short local22 = 8;
		@Pc(27) byte local27;
		if (this.aBoolean674) {
			local22 = 520;
			local27 = 0;
		} else {
			local27 = 1;
		}
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.a((byte) 123);
		}
		this.anIDirect3DIndexBuffer1 = this.aClass12_Sub2_Sub1_8.anIDirect3DDevice1.a(this.anInt9264, local22, Static554.aClass340_15 == this.aClass340_19 ? 101 : 102, local27, (IDirect3DIndexBuffer) this.anIDirect3DIndexBuffer1);
		this.anInt9263 = this.anInt9264;
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(I)I")
	@Override
	public int method7647() {
		return this.anInt9264;
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method7652() {
		if (this.aBoolean675 && jc.a(-1, this.anIDirect3DIndexBuffer1.Unlock())) {
			this.aBoolean675 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "(B)V")
	@Override
	public void method7651() {
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.a((byte) 126);
			this.anIDirect3DIndexBuffer1 = null;
		}
		this.anInt9264 = 0;
		this.anInt9263 = 0;
	}
}
