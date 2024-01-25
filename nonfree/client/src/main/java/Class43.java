import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.vba;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class Class43 implements Interface9 {

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "Lclient!jagdx/IDirect3DIndexBuffer;")
	public IDirect3DIndexBuffer anIDirect3DIndexBuffer1;

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
	private int anInt1003;

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "I")
	private int anInt1004;

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "Z")
	private boolean aBoolean73 = false;

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "Z")
	private final boolean aBoolean72;

	@OriginalMember(owner = "client!cb", name = "f", descriptor = "Lclient!vg;")
	private final Class90_Sub3_Sub2 aClass90_Sub3_Sub2_1;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "Lclient!ps;")
	private final Class254 aClass254_3;

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Lclient!vg;Lclient!ps;Z)V")
	public Class43(@OriginalArg(0) Class90_Sub3_Sub2 arg0, @OriginalArg(1) Class254 arg1, @OriginalArg(2) boolean arg2) {
		this.aBoolean72 = arg2;
		this.aClass90_Sub3_Sub2_1 = arg0;
		this.aClass254_3 = arg1;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)I")
	@Override
	public int method6458() {
		return this.anInt1004;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IB)V")
	@Override
	public void method5935(@OriginalArg(0) int arg0) {
		this.anInt1004 = arg0 * this.aClass254_3.anInt7322;
		if (this.anInt1003 >= this.anInt1004) {
			return;
		}
		@Pc(25) short local25 = 8;
		@Pc(30) byte local30;
		if (this.aBoolean72) {
			local30 = 0;
			local25 = 520;
		} else {
			local30 = 1;
		}
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.b(21066);
		}
		this.anIDirect3DIndexBuffer1 = this.aClass90_Sub3_Sub2_1.anIDirect3DDevice1.a(this.anInt1004, local25, this.aClass254_3 == Static407.aClass254_15 ? 101 : 102, local30, (IDirect3DIndexBuffer) this.anIDirect3DIndexBuffer1);
		this.anInt1003 = this.anInt1004;
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(Z)V")
	@Override
	public void method6461() {
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.b(21066);
			this.anIDirect3DIndexBuffer1 = null;
		}
		this.anInt1003 = 0;
		this.anInt1004 = 0;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(BZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method6462() {
		if (this.anIDirect3DIndexBuffer1 == null) {
			return null;
		}
		@Pc(9) boolean local9 = this.aBoolean72 & true;
		if (!this.aBoolean73 && vba.a(-1, (int) this.anIDirect3DIndexBuffer1.Lock(0, this.anInt1003, local9 ? 8192 : 0, this.aClass90_Sub3_Sub2_1.aGeometryBuffer1))) {
			this.aBoolean73 = true;
			return this.aClass90_Sub3_Sub2_1.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method6460() {
		if (this.aBoolean73 && vba.a(-1, (int) this.anIDirect3DIndexBuffer1.Unlock())) {
			this.aBoolean73 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)Lclient!ps;")
	@Override
	public Class254 method5937() {
		return this.aClass254_3;
	}
}
