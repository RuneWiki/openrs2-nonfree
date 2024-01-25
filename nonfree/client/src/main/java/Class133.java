import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.dt;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hu")
public final class Class133 implements Interface9 {

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "Lclient!jagdx/IDirect3DIndexBuffer;")
	public IDirect3DIndexBuffer anIDirect3DIndexBuffer1;

	@OriginalMember(owner = "client!hu", name = "c", descriptor = "I")
	private int anInt3897;

	@OriginalMember(owner = "client!hu", name = "e", descriptor = "I")
	private int anInt3898;

	@OriginalMember(owner = "client!hu", name = "d", descriptor = "Z")
	private boolean aBoolean316 = false;

	@OriginalMember(owner = "client!hu", name = "f", descriptor = "Z")
	private final boolean aBoolean317;

	@OriginalMember(owner = "client!hu", name = "b", descriptor = "Lclient!vp;")
	private final Class308 aClass308_8;

	@OriginalMember(owner = "client!hu", name = "g", descriptor = "Lclient!hg;")
	private final Class4_Sub2_Sub1 aClass4_Sub2_Sub1_6;

	@OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(Lclient!hg;Lclient!vp;Z)V")
	public Class133(@OriginalArg(0) Class4_Sub2_Sub1 arg0, @OriginalArg(1) Class308 arg1, @OriginalArg(2) boolean arg2) {
		this.aBoolean317 = arg2;
		this.aClass308_8 = arg1;
		this.aClass4_Sub2_Sub1_6 = arg0;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(I)I")
	@Override
	public int method7605() {
		return this.anInt3897;
	}

	@OriginalMember(owner = "client!hu", name = "b", descriptor = "(I)V")
	@Override
	public void method7609() {
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.b(-11385);
			this.anIDirect3DIndexBuffer1 = null;
		}
		this.anInt3897 = 0;
		this.anInt3898 = 0;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(II)V")
	@Override
	public void method7607(@OriginalArg(1) int arg0) {
		this.anInt3897 = arg0 * this.aClass308_8.anInt9154;
		if (this.anInt3897 <= this.anInt3898) {
			return;
		}
		@Pc(22) short local22 = 8;
		@Pc(27) byte local27;
		if (this.aBoolean317) {
			local27 = 0;
			local22 = 520;
		} else {
			local27 = 1;
		}
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.b(-11385);
		}
		this.anIDirect3DIndexBuffer1 = this.aClass4_Sub2_Sub1_6.anIDirect3DDevice1.a(this.anInt3897, local22, this.aClass308_8 == Static517.aClass308_16 ? 101 : 102, local27, (IDirect3DIndexBuffer) this.anIDirect3DIndexBuffer1);
		this.anInt3898 = this.anInt3897;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(IZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method7613() {
		@Pc(4) boolean local4 = this.aBoolean317 & true;
		if (!this.aBoolean316 && dt.a(this.anIDirect3DIndexBuffer1.Lock(0, this.anInt3898, local4 ? 8192 : 0, this.aClass4_Sub2_Sub1_6.aGeometryBuffer1), -2005530590)) {
			this.aBoolean316 = true;
			return this.aClass4_Sub2_Sub1_6.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hu", name = "c", descriptor = "(I)Lclient!vp;")
	@Override
	public Class308 method3626() {
		return this.aClass308_8;
	}

	@OriginalMember(owner = "client!hu", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method7614() {
		if (this.aBoolean316 && dt.a(this.anIDirect3DIndexBuffer1.Unlock(), -2005530590)) {
			this.aBoolean316 = false;
			return true;
		} else {
			return false;
		}
	}
}
