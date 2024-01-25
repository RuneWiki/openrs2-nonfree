import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.mo;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ol")
public final class Class219 implements Interface1 {

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "I")
	private int anInt6183;

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "Lclient!jagdx/IDirect3DIndexBuffer;")
	public IDirect3DIndexBuffer anIDirect3DIndexBuffer1;

	@OriginalMember(owner = "client!ol", name = "g", descriptor = "I")
	private int anInt6184;

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "Z")
	private boolean aBoolean440 = false;

	@OriginalMember(owner = "client!ol", name = "d", descriptor = "Z")
	private final boolean aBoolean441;

	@OriginalMember(owner = "client!ol", name = "f", descriptor = "Lclient!hv;")
	private final Class122_Sub2_Sub1 aClass122_Sub2_Sub1_6;

	@OriginalMember(owner = "client!ol", name = "e", descriptor = "Lclient!sb;")
	private final Class264 aClass264_10;

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(Lclient!hv;Lclient!sb;Z)V")
	public Class219(@OriginalArg(0) Class122_Sub2_Sub1 arg0, @OriginalArg(1) Class264 arg1, @OriginalArg(2) boolean arg2) {
		this.aBoolean441 = arg2;
		this.aClass122_Sub2_Sub1_6 = arg0;
		this.aClass264_10 = arg1;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)V")
	@Override
	public void method5728() {
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.b((byte) 87);
			this.anIDirect3DIndexBuffer1 = null;
		}
		this.anInt6184 = 0;
		this.anInt6183 = 0;
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(I)Lclient!sb;")
	@Override
	public Class264 method5231() {
		return this.aClass264_10;
	}

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "(I)I")
	@Override
	public int method5726() {
		return this.anInt6183;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5730() {
		if (this.aBoolean440 && mo.b(this.anIDirect3DIndexBuffer1.Unlock(), 28658)) {
			this.aBoolean440 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(BZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method5729() {
		@Pc(4) boolean local4 = this.aBoolean441 & true;
		if (!this.aBoolean440 && mo.b(this.anIDirect3DIndexBuffer1.Lock(0, this.anInt6184, local4 ? 8192 : 0, this.aClass122_Sub2_Sub1_6.aGeometryBuffer1), 28658)) {
			this.aBoolean440 = true;
			return this.aClass122_Sub2_Sub1_6.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5227(@OriginalArg(1) int arg0) {
		this.anInt6183 = this.aClass264_10.anInt7501 * arg0;
		if (this.anInt6183 <= this.anInt6184) {
			return;
		}
		@Pc(18) short local18 = 8;
		@Pc(23) byte local23;
		if (this.aBoolean441) {
			local23 = 0;
			local18 = 520;
		} else {
			local23 = 1;
		}
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.b((byte) 87);
		}
		this.anIDirect3DIndexBuffer1 = this.aClass122_Sub2_Sub1_6.anIDirect3DDevice1.a(this.anInt6183, local18, Static431.aClass264_16 == this.aClass264_10 ? 101 : 102, local23, (IDirect3DIndexBuffer) this.anIDirect3DIndexBuffer1);
		this.anInt6184 = this.anInt6183;
	}
}
