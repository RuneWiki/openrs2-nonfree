import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.co;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class Class45 implements Interface11 {

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
	private int anInt1343;

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
	private int anInt1344;

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "Lclient!jagdx/IDirect3DIndexBuffer;")
	public IDirect3DIndexBuffer anIDirect3DIndexBuffer1;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "Z")
	private boolean aBoolean83 = false;

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "Z")
	private final boolean aBoolean84;

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "Lclient!ok;")
	private final Class242 aClass242_1;

	@OriginalMember(owner = "client!cb", name = "f", descriptor = "Lclient!fi;")
	private final Class100_Sub1_Sub1 aClass100_Sub1_Sub1_1;

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Lclient!fi;Lclient!ok;Z)V")
	public Class45(@OriginalArg(0) Class100_Sub1_Sub1 arg0, @OriginalArg(1) Class242 arg1, @OriginalArg(2) boolean arg2) {
		this.aBoolean84 = arg2;
		this.aClass242_1 = arg1;
		this.aClass100_Sub1_Sub1_1 = arg0;
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method3078() {
		if (this.aBoolean83 && co.a((byte) 45, this.anIDirect3DIndexBuffer1.Unlock())) {
			this.aBoolean83 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)V")
	@Override
	public void method8431() {
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.a((byte) 77);
			this.anIDirect3DIndexBuffer1 = null;
		}
		this.anInt1343 = 0;
		this.anInt1344 = 0;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method3077() {
		if (this.anIDirect3DIndexBuffer1 == null) {
			return null;
		}
		@Pc(16) boolean local16 = this.aBoolean84 & true;
		if (!this.aBoolean83 && co.a((byte) 120, this.anIDirect3DIndexBuffer1.Lock(0, this.anInt1343, local16 ? 8192 : 0, this.aClass100_Sub1_Sub1_1.aGeometryBuffer1))) {
			this.aBoolean83 = true;
			return this.aClass100_Sub1_Sub1_1.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)I")
	@Override
	public int method8428() {
		return this.anInt1344;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(BI)V")
	@Override
	public void method8437(@OriginalArg(1) int arg0) {
		this.anInt1344 = this.aClass242_1.anInt7529 * arg0;
		if (this.anInt1343 >= this.anInt1344) {
			return;
		}
		@Pc(18) short local18 = 8;
		@Pc(27) byte local27;
		if (this.aBoolean84) {
			local18 = 520;
			local27 = 0;
		} else {
			local27 = 1;
		}
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.a((byte) 75);
		}
		this.anIDirect3DIndexBuffer1 = this.aClass100_Sub1_Sub1_1.anIDirect3DDevice1.a(this.anInt1344, local18, Static409.aClass242_14 == this.aClass242_1 ? 101 : 102, local27, (IDirect3DIndexBuffer) this.anIDirect3DIndexBuffer1);
		this.anInt1343 = this.anInt1344;
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "(I)Lclient!ok;")
	@Override
	public Class242 method3079() {
		return this.aClass242_1;
	}
}
