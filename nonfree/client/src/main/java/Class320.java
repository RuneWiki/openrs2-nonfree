import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.gh;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rw")
public final class Class320 implements Interface20 {

	@OriginalMember(owner = "client!rw", name = "c", descriptor = "I")
	private int anInt8525;

	@OriginalMember(owner = "client!rw", name = "e", descriptor = "Lclient!jagdx/IDirect3DIndexBuffer;")
	public IDirect3DIndexBuffer anIDirect3DIndexBuffer1;

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "I")
	private int anInt8526;

	@OriginalMember(owner = "client!rw", name = "g", descriptor = "Z")
	private boolean aBoolean560 = false;

	@OriginalMember(owner = "client!rw", name = "b", descriptor = "Lclient!dn;")
	private final Class86 aClass86_19;

	@OriginalMember(owner = "client!rw", name = "f", descriptor = "Z")
	private final boolean aBoolean559;

	@OriginalMember(owner = "client!rw", name = "d", descriptor = "Lclient!er;")
	private final Class100_Sub1_Sub1 aClass100_Sub1_Sub1_9;

	@OriginalMember(owner = "client!rw", name = "<init>", descriptor = "(Lclient!er;Lclient!dn;Z)V")
	public Class320(@OriginalArg(0) Class100_Sub1_Sub1 arg0, @OriginalArg(1) Class86 arg1, @OriginalArg(2) boolean arg2) {
		this.aClass86_19 = arg1;
		this.aBoolean559 = arg2;
		this.aClass100_Sub1_Sub1_9 = arg0;
	}

	@OriginalMember(owner = "client!rw", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7349() {
		if (this.aBoolean560 && gh.a(-2005530585, this.anIDirect3DIndexBuffer1.Unlock())) {
			this.aBoolean560 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(B)Lclient!dn;")
	@Override
	public Class86 method7348() {
		return this.aClass86_19;
	}

	@OriginalMember(owner = "client!rw", name = "b", descriptor = "(IZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method7347() {
		if (this.anIDirect3DIndexBuffer1 == null) {
			return null;
		}
		@Pc(18) boolean local18 = this.aBoolean559 & true;
		if (!this.aBoolean560 && gh.a(-2005530585, this.anIDirect3DIndexBuffer1.Lock(0, this.anInt8525, local18 ? 8192 : 0, this.aClass100_Sub1_Sub1_9.aGeometryBuffer1))) {
			this.aBoolean560 = true;
			return this.aClass100_Sub1_Sub1_9.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(I)V")
	@Override
	public void method7351() {
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.a(111);
			this.anIDirect3DIndexBuffer1 = null;
		}
		this.anInt8525 = 0;
		this.anInt8526 = 0;
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(Z)I")
	@Override
	public int method7346() {
		return this.anInt8526;
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7350(@OriginalArg(0) int arg0) {
		this.anInt8526 = this.aClass86_19.anInt1714 * arg0;
		if (this.anInt8525 >= this.anInt8526) {
			return;
		}
		@Pc(24) short local24 = 8;
		@Pc(29) byte local29;
		if (this.aBoolean559) {
			local29 = 0;
			local24 = 520;
		} else {
			local29 = 1;
		}
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.a(-105);
		}
		this.anIDirect3DIndexBuffer1 = this.aClass100_Sub1_Sub1_9.anIDirect3DDevice1.a(this.anInt8526, local24, this.aClass86_19 == Static104.aClass86_9 ? 101 : 102, local29, (IDirect3DIndexBuffer) this.anIDirect3DIndexBuffer1);
		this.anInt8525 = this.anInt8526;
	}
}
