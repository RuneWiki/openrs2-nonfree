import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.fe;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class143 implements Interface13 {

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
	private int anInt3880;

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
	private int anInt3881;

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "Lclient!jagdx/IDirect3DIndexBuffer;")
	public IDirect3DIndexBuffer anIDirect3DIndexBuffer1;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "Z")
	private boolean aBoolean231 = false;

	@OriginalMember(owner = "client!ie", name = "f", descriptor = "Lclient!vt;")
	private final Class306 aClass306_3;

	@OriginalMember(owner = "client!ie", name = "g", descriptor = "Lclient!de;")
	private final Class62_Sub1_Sub1 aClass62_Sub1_Sub1_2;

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "Z")
	private final boolean aBoolean232;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Lclient!de;Lclient!vt;Z)V")
	public Class143(@OriginalArg(0) Class62_Sub1_Sub1 arg0, @OriginalArg(1) Class306 arg1, @OriginalArg(2) boolean arg2) {
		this.aClass306_3 = arg1;
		this.aClass62_Sub1_Sub1_2 = arg0;
		this.aBoolean232 = arg2;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)Lclient!vt;")
	@Override
	public Class306 method3497() {
		return this.aClass306_3;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)V")
	@Override
	public void method3488(@OriginalArg(1) int arg0) {
		this.anInt3880 = this.aClass306_3.anInt8854 * arg0;
		if (this.anInt3881 >= this.anInt3880) {
			return;
		}
		@Pc(21) short local21 = 8;
		@Pc(26) byte local26;
		if (this.aBoolean232) {
			local26 = 0;
			local21 = 520;
		} else {
			local26 = 1;
		}
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.a(36);
		}
		this.anIDirect3DIndexBuffer1 = this.aClass62_Sub1_Sub1_2.anIDirect3DDevice1.a(this.anInt3880, local21, Static523.aClass306_16 == this.aClass306_3 ? 101 : 102, local26, (IDirect3DIndexBuffer) this.anIDirect3DIndexBuffer1);
		this.anInt3881 = this.anInt3880;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZB)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method3487() {
		@Pc(4) boolean local4 = this.aBoolean232 & true;
		if (!this.aBoolean231 && fe.a((byte) -100, this.anIDirect3DIndexBuffer1.Lock(0, this.anInt3881, local4 ? 8192 : 0, this.aClass62_Sub1_Sub1_2.aGeometryBuffer1))) {
			this.aBoolean231 = true;
			return this.aClass62_Sub1_Sub1_2.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method3492() {
		if (this.aBoolean231 && fe.a((byte) -64, this.anIDirect3DIndexBuffer1.Unlock())) {
			this.aBoolean231 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)I")
	@Override
	public int method3485() {
		return this.anInt3880;
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)V")
	@Override
	public void method3493() {
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.a(123);
			this.anIDirect3DIndexBuffer1 = null;
		}
		this.anInt3880 = 0;
		this.anInt3881 = 0;
	}
}
