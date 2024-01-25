import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.ec;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kaa")
public final class Class169 implements Interface13 {

	@OriginalMember(owner = "client!kaa", name = "c", descriptor = "I")
	private int anInt5711;

	@OriginalMember(owner = "client!kaa", name = "d", descriptor = "Lclient!jagdx/IDirect3DIndexBuffer;")
	public IDirect3DIndexBuffer anIDirect3DIndexBuffer1;

	@OriginalMember(owner = "client!kaa", name = "e", descriptor = "I")
	private int anInt5712;

	@OriginalMember(owner = "client!kaa", name = "g", descriptor = "Z")
	private boolean aBoolean409 = false;

	@OriginalMember(owner = "client!kaa", name = "b", descriptor = "Lclient!hl;")
	private final Class16_Sub1_Sub2 aClass16_Sub1_Sub2_5;

	@OriginalMember(owner = "client!kaa", name = "f", descriptor = "Lclient!jm;")
	private final Class160 aClass160_14;

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "Z")
	private final boolean aBoolean408;

	@OriginalMember(owner = "client!kaa", name = "<init>", descriptor = "(Lclient!hl;Lclient!jm;Z)V")
	public Class169(@OriginalArg(0) Class16_Sub1_Sub2 arg0, @OriginalArg(1) Class160 arg1, @OriginalArg(2) boolean arg2) {
		this.aClass16_Sub1_Sub2_5 = arg0;
		this.aClass160_14 = arg1;
		this.aBoolean408 = arg2;
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Z)V")
	@Override
	public void method6496() {
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.a(-31315);
			this.anIDirect3DIndexBuffer1 = null;
		}
		this.anInt5711 = 0;
		this.anInt5712 = 0;
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(IZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method4654() {
		if (this.anIDirect3DIndexBuffer1 == null) {
			return null;
		}
		@Pc(11) boolean local11 = this.aBoolean408 & true;
		if (!this.aBoolean409 && ec.a(this.anIDirect3DIndexBuffer1.Lock(0, this.anInt5711, local11 ? 8192 : 0, this.aClass16_Sub1_Sub2_5.aGeometryBuffer1), 2005530520)) {
			this.aBoolean409 = true;
			return this.aClass16_Sub1_Sub2_5.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!kaa", name = "c", descriptor = "(Z)Lclient!jm;")
	@Override
	public Class160 method4653() {
		return this.aClass160_14;
	}

	@OriginalMember(owner = "client!kaa", name = "b", descriptor = "(Z)I")
	@Override
	public int method6492() {
		return this.anInt5712;
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method4655() {
		if (this.aBoolean409 && ec.a(this.anIDirect3DIndexBuffer1.Unlock(), 2005530520)) {
			this.aBoolean409 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(II)V")
	@Override
	public void method6500(@OriginalArg(1) int arg0) {
		this.anInt5712 = arg0 * this.aClass160_14.anInt5547;
		if (this.anInt5711 >= this.anInt5712) {
			return;
		}
		@Pc(26) short local26 = 8;
		@Pc(31) byte local31;
		if (this.aBoolean408) {
			local26 = 520;
			local31 = 0;
		} else {
			local31 = 1;
		}
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.a(-31315);
		}
		this.anIDirect3DIndexBuffer1 = this.aClass16_Sub1_Sub2_5.anIDirect3DDevice1.a(this.anInt5712, local26, this.aClass160_14 == Static258.aClass160_10 ? 101 : 102, local31, (IDirect3DIndexBuffer) this.anIDirect3DIndexBuffer1);
		this.anInt5711 = this.anInt5712;
	}
}
