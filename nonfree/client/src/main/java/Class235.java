import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.fo;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class235 implements Interface1 {

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "Lclient!jagdx/IDirect3DIndexBuffer;")
	public IDirect3DIndexBuffer anIDirect3DIndexBuffer1;

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
	private int anInt6716;

	@OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
	private int anInt6717;

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "Z")
	private boolean aBoolean444 = false;

	@OriginalMember(owner = "client!qb", name = "f", descriptor = "Z")
	private final boolean aBoolean445;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "Lclient!wda;")
	private final Class9_Sub1_Sub2 aClass9_Sub1_Sub2_5;

	@OriginalMember(owner = "client!qb", name = "g", descriptor = "Lclient!ui;")
	private final Class289 aClass289_6;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lclient!wda;Lclient!ui;Z)V")
	public Class235(@OriginalArg(0) Class9_Sub1_Sub2 arg0, @OriginalArg(1) Class289 arg1, @OriginalArg(2) boolean arg2) {
		this.aBoolean445 = arg2;
		this.aClass9_Sub1_Sub2_5 = arg0;
		this.aClass289_6 = arg1;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)V")
	@Override
	public void method7526(@OriginalArg(1) int arg0) {
		this.anInt6716 = this.aClass289_6.anInt8371 * arg0;
		if (this.anInt6716 <= this.anInt6717) {
			return;
		}
		@Pc(17) short local17 = 8;
		@Pc(26) byte local26;
		if (this.aBoolean445) {
			local17 = 520;
			local26 = 0;
		} else {
			local26 = 1;
		}
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.a(2266);
		}
		this.anIDirect3DIndexBuffer1 = this.aClass9_Sub1_Sub2_5.anIDirect3DDevice1.a(this.anInt6716, local17, this.aClass289_6 == Static489.aClass289_14 ? 101 : 102, local26, (IDirect3DIndexBuffer) this.anIDirect3DIndexBuffer1);
		this.anInt6717 = this.anInt6716;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method7519() {
		@Pc(10) boolean local10 = this.aBoolean445 & true;
		if (!this.aBoolean444 && fo.a(this.anIDirect3DIndexBuffer1.Lock(0, this.anInt6717, local10 ? 8192 : 0, this.aClass9_Sub1_Sub2_5.aGeometryBuffer1), (byte) 66)) {
			this.aBoolean444 = true;
			return this.aClass9_Sub1_Sub2_5.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(B)V")
	@Override
	public void method7527() {
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.a(2266);
			this.anIDirect3DIndexBuffer1 = null;
		}
		this.anInt6717 = 0;
		this.anInt6716 = 0;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7521() {
		if (this.aBoolean444 && fo.a(this.anIDirect3DIndexBuffer1.Unlock(), (byte) 104)) {
			this.aBoolean444 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)Lclient!ui;")
	@Override
	public Class289 method7529() {
		return this.aClass289_6;
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)I")
	@Override
	public int method7517() {
		return this.anInt6716;
	}
}
