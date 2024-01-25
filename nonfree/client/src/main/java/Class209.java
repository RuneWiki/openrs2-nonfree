import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.hia;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kp")
public final class Class209 implements Interface8 {

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "I")
	private int anInt5619;

	@OriginalMember(owner = "client!kp", name = "e", descriptor = "Lclient!jagdx/IDirect3DIndexBuffer;")
	public IDirect3DIndexBuffer anIDirect3DIndexBuffer1;

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "I")
	private int anInt5620;

	@OriginalMember(owner = "client!kp", name = "f", descriptor = "Z")
	private boolean aBoolean406 = false;

	@OriginalMember(owner = "client!kp", name = "d", descriptor = "Lclient!al;")
	private final Class19 aClass19_17;

	@OriginalMember(owner = "client!kp", name = "g", descriptor = "Lclient!hda;")
	private final Class144_Sub1_Sub1 aClass144_Sub1_Sub1_4;

	@OriginalMember(owner = "client!kp", name = "c", descriptor = "Z")
	private final boolean aBoolean405;

	@OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(Lclient!hda;Lclient!al;Z)V")
	public Class209(@OriginalArg(0) Class144_Sub1_Sub1 arg0, @OriginalArg(1) Class19 arg1, @OriginalArg(2) boolean arg2) {
		this.aClass19_17 = arg1;
		this.aClass144_Sub1_Sub1_4 = arg0;
		this.aBoolean405 = arg2;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5081() {
		if (this.aBoolean406 && hia.a(this.anIDirect3DIndexBuffer1.Unlock(), (byte) -123)) {
			this.aBoolean406 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "(I)I")
	@Override
	public int method5839() {
		return this.anInt5619;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(B)V")
	@Override
	public void method5842() {
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.b(124);
			this.anIDirect3DIndexBuffer1 = null;
		}
		this.anInt5619 = 0;
		this.anInt5620 = 0;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(II)V")
	@Override
	public void method5084(@OriginalArg(1) int arg0) {
		this.anInt5619 = this.aClass19_17.anInt242 * arg0;
		if (this.anInt5619 <= this.anInt5620) {
			return;
		}
		@Pc(21) short local21 = 8;
		@Pc(26) byte local26;
		if (this.aBoolean405) {
			local21 = 520;
			local26 = 0;
		} else {
			local26 = 1;
		}
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.b(104);
		}
		this.anIDirect3DIndexBuffer1 = this.aClass144_Sub1_Sub1_4.anIDirect3DDevice1.a(this.anInt5619, local21, this.aClass19_17 == Static18.aClass19_5 ? 101 : 102, local26, (IDirect3DIndexBuffer) this.anIDirect3DIndexBuffer1);
		this.anInt5620 = this.anInt5619;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method5085() {
		if (this.anIDirect3DIndexBuffer1 == null) {
			return null;
		}
		@Pc(9) boolean local9 = this.aBoolean405 & true;
		if (!this.aBoolean406 && hia.a(this.anIDirect3DIndexBuffer1.Lock(0, this.anInt5620, local9 ? 8192 : 0, this.aClass144_Sub1_Sub1_4.aGeometryBuffer1), (byte) -123)) {
			this.aBoolean406 = true;
			return this.aClass144_Sub1_Sub1_4.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "(B)Lclient!al;")
	@Override
	public Class19 method5082() {
		return this.aClass19_17;
	}
}
