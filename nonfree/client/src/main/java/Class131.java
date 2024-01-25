import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.pia;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gp")
public final class Class131 implements Interface24 {

	@OriginalMember(owner = "client!gp", name = "c", descriptor = "I")
	private int anInt4202;

	@OriginalMember(owner = "client!gp", name = "e", descriptor = "Lclient!jagdx/IDirect3DIndexBuffer;")
	public IDirect3DIndexBuffer anIDirect3DIndexBuffer1;

	@OriginalMember(owner = "client!gp", name = "g", descriptor = "I")
	private int anInt4203;

	@OriginalMember(owner = "client!gp", name = "f", descriptor = "Z")
	private boolean aBoolean322 = false;

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "Lclient!lj;")
	private final Class101_Sub1_Sub2 aClass101_Sub1_Sub2_4;

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "Z")
	private final boolean aBoolean321;

	@OriginalMember(owner = "client!gp", name = "d", descriptor = "Lclient!dr;")
	private final Class79 aClass79_14;

	@OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(Lclient!lj;Lclient!dr;Z)V")
	public Class131(@OriginalArg(0) Class101_Sub1_Sub2 arg0, @OriginalArg(1) Class79 arg1, @OriginalArg(2) boolean arg2) {
		this.aClass101_Sub1_Sub2_4 = arg0;
		this.aBoolean321 = arg2;
		this.aClass79_14 = arg1;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method6460() {
		if (this.anIDirect3DIndexBuffer1 == null) {
			return null;
		}
		@Pc(10) boolean local10 = this.aBoolean321 & true;
		if (!this.aBoolean322 && pia.a(-2005530600, this.anIDirect3DIndexBuffer1.Lock(0, this.anInt4202, local10 ? 8192 : 0, this.aClass101_Sub1_Sub2_4.aGeometryBuffer1))) {
			this.aBoolean322 = true;
			return this.aClass101_Sub1_Sub2_4.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method6459() {
		if (this.aBoolean322 && pia.a(-2005530600, this.anIDirect3DIndexBuffer1.Unlock())) {
			this.aBoolean322 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "(B)Lclient!dr;")
	@Override
	public Class79 method6461() {
		return this.aClass79_14;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(B)I")
	@Override
	public int method9028() {
		return this.anInt4203;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(II)V")
	@Override
	public void method9031(@OriginalArg(1) int arg0) {
		this.anInt4203 = arg0 * this.aClass79_14.anInt2048;
		if (this.anInt4203 <= this.anInt4202) {
			return;
		}
		@Pc(26) short local26 = 8;
		@Pc(31) byte local31;
		if (this.aBoolean321) {
			local31 = 0;
			local26 = 520;
		} else {
			local31 = 1;
		}
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.a(-4840);
		}
		this.anIDirect3DIndexBuffer1 = this.aClass101_Sub1_Sub2_4.anIDirect3DDevice1.a(this.anInt4203, local26, this.aClass79_14 == Static114.aClass79_8 ? 101 : 102, local31, (IDirect3DIndexBuffer) this.anIDirect3DIndexBuffer1);
		this.anInt4202 = this.anInt4203;
	}

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "(I)V")
	@Override
	public void method9037() {
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.a(-4840);
			this.anIDirect3DIndexBuffer1 = null;
		}
		this.anInt4203 = 0;
		this.anInt4202 = 0;
	}
}
