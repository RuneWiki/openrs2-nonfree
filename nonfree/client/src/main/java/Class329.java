import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.pda;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sr")
public final class Class329 implements Interface22 {

	@OriginalMember(owner = "client!sr", name = "d", descriptor = "I")
	private int anInt9088;

	@OriginalMember(owner = "client!sr", name = "f", descriptor = "Lclient!jagdx/IDirect3DIndexBuffer;")
	public IDirect3DIndexBuffer anIDirect3DIndexBuffer1;

	@OriginalMember(owner = "client!sr", name = "g", descriptor = "I")
	private int anInt9089;

	@OriginalMember(owner = "client!sr", name = "c", descriptor = "Z")
	private boolean aBoolean637 = false;

	@OriginalMember(owner = "client!sr", name = "e", descriptor = "Lclient!wj;")
	private final Class389 aClass389_10;

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "Z")
	private final boolean aBoolean636;

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "Lclient!uda;")
	private final Class95_Sub1_Sub2 aClass95_Sub1_Sub2_9;

	@OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(Lclient!uda;Lclient!wj;Z)V")
	public Class329(@OriginalArg(0) Class95_Sub1_Sub2 arg0, @OriginalArg(1) Class389 arg1, @OriginalArg(2) boolean arg2) {
		this.aClass389_10 = arg1;
		this.aBoolean636 = arg2;
		this.aClass95_Sub1_Sub2_9 = arg0;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method7405() {
		if (this.anIDirect3DIndexBuffer1 == null) {
			return null;
		}
		@Pc(16) boolean local16 = this.aBoolean636 & true;
		if (!this.aBoolean637 && pda.a(this.anIDirect3DIndexBuffer1.Lock(0, this.anInt9089, local16 ? 8192 : 0, this.aClass95_Sub1_Sub2_9.aGeometryBuffer1), 17527)) {
			this.aBoolean637 = true;
			return this.aClass95_Sub1_Sub2_9.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(II)V")
	@Override
	public void method7408(@OriginalArg(1) int arg0) {
		this.anInt9088 = this.aClass389_10.anInt10800 * arg0;
		if (this.anInt9088 <= this.anInt9089) {
			return;
		}
		@Pc(25) short local25 = 8;
		@Pc(30) byte local30;
		if (this.aBoolean636) {
			local30 = 0;
			local25 = 520;
		} else {
			local30 = 1;
		}
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.a(true);
		}
		this.anIDirect3DIndexBuffer1 = this.aClass95_Sub1_Sub2_9.anIDirect3DDevice1.a(this.anInt9088, local25, Static666.aClass389_17 == this.aClass389_10 ? 101 : 102, local30, (IDirect3DIndexBuffer) this.anIDirect3DIndexBuffer1);
		this.anInt9089 = this.anInt9088;
	}

	@OriginalMember(owner = "client!sr", name = "c", descriptor = "(I)V")
	@Override
	public void method7409() {
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.a(true);
			this.anIDirect3DIndexBuffer1 = null;
		}
		this.anInt9088 = 0;
		this.anInt9089 = 0;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(B)Lclient!wj;")
	@Override
	public Class389 method7406() {
		return this.aClass389_10;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(I)I")
	@Override
	public int method7404() {
		return this.anInt9088;
	}

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7407() {
		if (this.aBoolean637 && pda.a(this.anIDirect3DIndexBuffer1.Unlock(), 17527)) {
			this.aBoolean637 = false;
			return true;
		} else {
			return false;
		}
	}
}
