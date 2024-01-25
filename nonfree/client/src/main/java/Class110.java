import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.qc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gm")
public final class Class110 implements Interface14 {

	@OriginalMember(owner = "client!gm", name = "c", descriptor = "I")
	private int anInt3783;

	@OriginalMember(owner = "client!gm", name = "d", descriptor = "I")
	private int anInt3784;

	@OriginalMember(owner = "client!gm", name = "e", descriptor = "Lclient!jagdx/IDirect3DIndexBuffer;")
	public IDirect3DIndexBuffer anIDirect3DIndexBuffer1;

	@OriginalMember(owner = "client!gm", name = "f", descriptor = "Z")
	private boolean aBoolean286 = false;

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "Lclient!rca;")
	private final Class5_Sub3_Sub2 aClass5_Sub3_Sub2_2;

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "Z")
	private final boolean aBoolean285;

	@OriginalMember(owner = "client!gm", name = "g", descriptor = "Lclient!vt;")
	private final Class310 aClass310_4;

	@OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Lclient!rca;Lclient!vt;Z)V")
	public Class110(@OriginalArg(0) Class5_Sub3_Sub2 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) boolean arg2) {
		this.aClass5_Sub3_Sub2_2 = arg0;
		this.aBoolean285 = arg2;
		this.aClass310_4 = arg1;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(Z)V")
	@Override
	public void method3138() {
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.a((byte) -75);
			this.anIDirect3DIndexBuffer1 = null;
		}
		this.anInt3784 = 0;
		this.anInt3783 = 0;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method3135() {
		if (this.aBoolean286 && qc.a((byte) 48, this.anIDirect3DIndexBuffer1.Unlock())) {
			this.aBoolean286 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method3136() {
		@Pc(11) boolean local11 = this.aBoolean285 & true;
		if (!this.aBoolean286 && qc.a((byte) 48, this.anIDirect3DIndexBuffer1.Lock(0, this.anInt3784, local11 ? 8192 : 0, this.aClass5_Sub3_Sub2_2.aGeometryBuffer1))) {
			this.aBoolean286 = true;
			return this.aClass5_Sub3_Sub2_2.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "(I)I")
	@Override
	public int method3133() {
		return this.anInt3783;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(II)V")
	@Override
	public void method3137(@OriginalArg(0) int arg0) {
		this.anInt3783 = arg0 * this.aClass310_4.anInt9119;
		if (this.anInt3784 >= this.anInt3783) {
			return;
		}
		@Pc(21) short local21 = 8;
		@Pc(26) byte local26;
		if (this.aBoolean285) {
			local26 = 0;
			local21 = 520;
		} else {
			local26 = 1;
		}
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.a((byte) -95);
		}
		this.anIDirect3DIndexBuffer1 = this.aClass5_Sub3_Sub2_2.anIDirect3DDevice1.a(this.anInt3783, local21, Static524.aClass310_17 == this.aClass310_4 ? 101 : 102, local26, (IDirect3DIndexBuffer) this.anIDirect3DIndexBuffer1);
		this.anInt3784 = this.anInt3783;
	}

	@OriginalMember(owner = "client!gm", name = "c", descriptor = "(I)Lclient!vt;")
	@Override
	public Class310 method3134() {
		return this.aClass310_4;
	}
}
