import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.ica;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dl")
public final class Class70 implements Interface23 {

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "I")
	private int anInt1782;

	@OriginalMember(owner = "client!dl", name = "d", descriptor = "Lclient!jagdx/IDirect3DIndexBuffer;")
	public IDirect3DIndexBuffer anIDirect3DIndexBuffer1;

	@OriginalMember(owner = "client!dl", name = "e", descriptor = "I")
	private int anInt1783;

	@OriginalMember(owner = "client!dl", name = "f", descriptor = "Z")
	private boolean aBoolean129 = false;

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "Lclient!jr;")
	private final Class161 aClass161_5;

	@OriginalMember(owner = "client!dl", name = "g", descriptor = "Lclient!tga;")
	private final Class14_Sub2_Sub2 aClass14_Sub2_Sub2_4;

	@OriginalMember(owner = "client!dl", name = "c", descriptor = "Z")
	private final boolean aBoolean128;

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Lclient!tga;Lclient!jr;Z)V")
	public Class70(@OriginalArg(0) Class14_Sub2_Sub2 arg0, @OriginalArg(1) Class161 arg1, @OriginalArg(2) boolean arg2) {
		this.aClass161_5 = arg1;
		this.aClass14_Sub2_Sub2_4 = arg0;
		this.aBoolean128 = arg2;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method4094() {
		if (this.aBoolean129 && ica.b(14528, this.anIDirect3DIndexBuffer1.Unlock())) {
			this.aBoolean129 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V")
	@Override
	public void method4091() {
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.a(76);
			this.anIDirect3DIndexBuffer1 = null;
		}
		this.anInt1783 = 0;
		this.anInt1782 = 0;
	}

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "(I)I")
	@Override
	public int method4087() {
		return this.anInt1783;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(ZZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method4095() {
		if (this.anIDirect3DIndexBuffer1 == null) {
			return null;
		}
		@Pc(11) boolean local11 = this.aBoolean128 & true;
		if (!this.aBoolean129 && ica.b(14528, this.anIDirect3DIndexBuffer1.Lock(0, this.anInt1782, local11 ? 8192 : 0, this.aClass14_Sub2_Sub2_4.aGeometryBuffer1))) {
			this.aBoolean129 = true;
			return this.aClass14_Sub2_Sub2_4.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "(B)Lclient!jr;")
	@Override
	public Class161 method4097() {
		return this.aClass161_5;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(II)V")
	@Override
	public void method4092(@OriginalArg(1) int arg0) {
		this.anInt1783 = this.aClass161_5.anInt4850 * arg0;
		if (this.anInt1782 >= this.anInt1783) {
			return;
		}
		@Pc(20) short local20 = 8;
		@Pc(29) byte local29;
		if (this.aBoolean128) {
			local20 = 520;
			local29 = 0;
		} else {
			local29 = 1;
		}
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.a(97);
		}
		this.anIDirect3DIndexBuffer1 = this.aClass14_Sub2_Sub2_4.anIDirect3DDevice1.a(this.anInt1783, local20, this.aClass161_5 == Static239.aClass161_13 ? 101 : 102, local29, (IDirect3DIndexBuffer) this.anIDirect3DIndexBuffer1);
		this.anInt1782 = this.anInt1783;
	}
}
