import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.ud;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sfa")
public final class Class316 implements Interface20 {

	@OriginalMember(owner = "client!sfa", name = "b", descriptor = "I")
	private int anInt8965;

	@OriginalMember(owner = "client!sfa", name = "e", descriptor = "I")
	private int anInt8966;

	@OriginalMember(owner = "client!sfa", name = "f", descriptor = "Lclient!jagdx/IDirect3DIndexBuffer;")
	public IDirect3DIndexBuffer anIDirect3DIndexBuffer1;

	@OriginalMember(owner = "client!sfa", name = "g", descriptor = "Z")
	private boolean aBoolean702 = false;

	@OriginalMember(owner = "client!sfa", name = "c", descriptor = "Lclient!rja;")
	private final Class13_Sub1_Sub2 aClass13_Sub1_Sub2_9;

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "Lclient!ig;")
	private final Class152 aClass152_19;

	@OriginalMember(owner = "client!sfa", name = "d", descriptor = "Z")
	private final boolean aBoolean701;

	@OriginalMember(owner = "client!sfa", name = "<init>", descriptor = "(Lclient!rja;Lclient!ig;Z)V")
	public Class316(@OriginalArg(0) Class13_Sub1_Sub2 arg0, @OriginalArg(1) Class152 arg1, @OriginalArg(2) boolean arg2) {
		this.aClass13_Sub1_Sub2_9 = arg0;
		this.aClass152_19 = arg1;
		this.aBoolean701 = arg2;
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(I)V")
	@Override
	public void method8737() {
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.b((byte) -70);
			this.anIDirect3DIndexBuffer1 = null;
		}
		this.anInt8966 = 0;
		this.anInt8965 = 0;
	}

	@OriginalMember(owner = "client!sfa", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7826() {
		if (this.aBoolean702 && ud.a(0, (int) this.anIDirect3DIndexBuffer1.Unlock())) {
			this.aBoolean702 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sfa", name = "c", descriptor = "(I)Lclient!ig;")
	@Override
	public Class152 method7827() {
		return this.aClass152_19;
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(IB)V")
	@Override
	public void method8740(@OriginalArg(0) int arg0) {
		this.anInt8965 = arg0 * this.aClass152_19.anInt4478;
		if (this.anInt8966 >= this.anInt8965) {
			return;
		}
		@Pc(13) short local13 = 8;
		@Pc(18) byte local18;
		if (this.aBoolean701) {
			local18 = 0;
			local13 = 520;
		} else {
			local18 = 1;
		}
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.b((byte) -70);
		}
		this.anIDirect3DIndexBuffer1 = this.aClass13_Sub1_Sub2_9.anIDirect3DDevice1.a(this.anInt8965, local13, this.aClass152_19 == Static246.aClass152_11 ? 101 : 102, local18, (IDirect3DIndexBuffer) this.anIDirect3DIndexBuffer1);
		this.anInt8966 = this.anInt8965;
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method7828() {
		if (this.anIDirect3DIndexBuffer1 == null) {
			return null;
		}
		@Pc(17) boolean local17 = this.aBoolean701 & true;
		if (!this.aBoolean702 && ud.a(0, (int) this.anIDirect3DIndexBuffer1.Lock(0, this.anInt8966, local17 ? 8192 : 0, this.aClass13_Sub1_Sub2_9.aGeometryBuffer1))) {
			this.aBoolean702 = true;
			return this.aClass13_Sub1_Sub2_9.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(B)I")
	@Override
	public int method8734() {
		return this.anInt8965;
	}
}
