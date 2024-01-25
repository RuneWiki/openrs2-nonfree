import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.sw;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nt")
public final class Class232 implements Interface20 {

	@OriginalMember(owner = "client!nt", name = "c", descriptor = "I")
	private int anInt7149;

	@OriginalMember(owner = "client!nt", name = "f", descriptor = "Lclient!jagdx/IDirect3DIndexBuffer;")
	public IDirect3DIndexBuffer anIDirect3DIndexBuffer1;

	@OriginalMember(owner = "client!nt", name = "g", descriptor = "I")
	private int anInt7150;

	@OriginalMember(owner = "client!nt", name = "b", descriptor = "Z")
	private boolean aBoolean604 = false;

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "Lclient!mba;")
	private final Class15_Sub2_Sub2 aClass15_Sub2_Sub2_6;

	@OriginalMember(owner = "client!nt", name = "d", descriptor = "Z")
	private final boolean aBoolean605;

	@OriginalMember(owner = "client!nt", name = "e", descriptor = "Lclient!lj;")
	private final Class200 aClass200_16;

	@OriginalMember(owner = "client!nt", name = "<init>", descriptor = "(Lclient!mba;Lclient!lj;Z)V")
	public Class232(@OriginalArg(0) Class15_Sub2_Sub2 arg0, @OriginalArg(1) Class200 arg1, @OriginalArg(2) boolean arg2) {
		this.aClass15_Sub2_Sub2_6 = arg0;
		this.aBoolean605 = arg2;
		this.aClass200_16 = arg1;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IB)V")
	@Override
	public void method6240(@OriginalArg(0) int arg0) {
		this.anInt7149 = this.aClass200_16.anInt6064 * arg0;
		if (this.anInt7149 <= this.anInt7150) {
			return;
		}
		@Pc(20) short local20 = 8;
		@Pc(29) byte local29;
		if (this.aBoolean605) {
			local20 = 520;
			local29 = 0;
		} else {
			local29 = 1;
		}
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.a((byte) -46);
		}
		this.anIDirect3DIndexBuffer1 = this.aClass15_Sub2_Sub2_6.anIDirect3DDevice1.a(this.anInt7149, local20, Static302.aClass200_12 == this.aClass200_16 ? 101 : 102, local29, (IDirect3DIndexBuffer) this.anIDirect3DIndexBuffer1);
		this.anInt7150 = this.anInt7149;
	}

	@OriginalMember(owner = "client!nt", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method6241() {
		if (this.aBoolean604 && sw.a((byte) -58, this.anIDirect3DIndexBuffer1.Unlock())) {
			this.aBoolean604 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(ZZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method6243() {
		if (this.anIDirect3DIndexBuffer1 == null) {
			return null;
		}
		@Pc(16) boolean local16 = this.aBoolean605 & true;
		if (!this.aBoolean604 && sw.a((byte) -58, this.anIDirect3DIndexBuffer1.Lock(0, this.anInt7150, local16 ? 8192 : 0, this.aClass15_Sub2_Sub2_6.aGeometryBuffer1))) {
			this.aBoolean604 = true;
			return this.aClass15_Sub2_Sub2_6.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!nt", name = "c", descriptor = "(I)Lclient!lj;")
	@Override
	public Class200 method6246() {
		return this.aClass200_16;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(I)V")
	@Override
	public void method6239() {
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.a((byte) -46);
			this.anIDirect3DIndexBuffer1 = null;
		}
		this.anInt7149 = 0;
		this.anInt7150 = 0;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(Z)I")
	@Override
	public int method6235() {
		return this.anInt7149;
	}
}
