import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.oo;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!caa")
public final class Class51 implements Interface12 {

	@OriginalMember(owner = "client!caa", name = "b", descriptor = "Lclient!jagdx/IDirect3DIndexBuffer;")
	public IDirect3DIndexBuffer anIDirect3DIndexBuffer1;

	@OriginalMember(owner = "client!caa", name = "d", descriptor = "I")
	private int anInt982;

	@OriginalMember(owner = "client!caa", name = "f", descriptor = "I")
	private int anInt983;

	@OriginalMember(owner = "client!caa", name = "e", descriptor = "Z")
	private boolean aBoolean72 = false;

	@OriginalMember(owner = "client!caa", name = "c", descriptor = "Lclient!cka;")
	private final Class65_Sub2_Sub1 aClass65_Sub2_Sub1_2;

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "Lclient!ds;")
	private final Class89 aClass89_3;

	@OriginalMember(owner = "client!caa", name = "g", descriptor = "Z")
	private final boolean aBoolean73;

	@OriginalMember(owner = "client!caa", name = "<init>", descriptor = "(Lclient!cka;Lclient!ds;Z)V")
	public Class51(@OriginalArg(0) Class65_Sub2_Sub1 arg0, @OriginalArg(1) Class89 arg1, @OriginalArg(2) boolean arg2) {
		this.aClass65_Sub2_Sub1_2 = arg0;
		this.aClass89_3 = arg1;
		this.aBoolean73 = arg2;
	}

	@OriginalMember(owner = "client!caa", name = "b", descriptor = "(I)I")
	@Override
	public int method8232() {
		return this.anInt982;
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(I)Lclient!ds;")
	@Override
	public Class89 method902() {
		return this.aClass89_3;
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(II)V")
	@Override
	public void method8239(@OriginalArg(0) int arg0) {
		this.anInt982 = arg0 * this.aClass89_3.anInt2489;
		if (this.anInt983 >= this.anInt982) {
			return;
		}
		@Pc(26) short local26 = 8;
		@Pc(31) byte local31;
		if (this.aBoolean73) {
			local26 = 520;
			local31 = 0;
		} else {
			local31 = 1;
		}
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.a(true);
		}
		this.anIDirect3DIndexBuffer1 = this.aClass65_Sub2_Sub1_2.anIDirect3DDevice1.a(this.anInt982, local26, Static120.aClass89_8 == this.aClass89_3 ? 101 : 102, local31, (IDirect3DIndexBuffer) this.anIDirect3DIndexBuffer1);
		this.anInt983 = this.anInt982;
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(B)V")
	@Override
	public void method8235() {
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.a(true);
			this.anIDirect3DIndexBuffer1 = null;
		}
		this.anInt983 = 0;
		this.anInt982 = 0;
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(ZZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method900() {
		if (this.anIDirect3DIndexBuffer1 == null) {
			return null;
		}
		@Pc(16) boolean local16 = this.aBoolean73 & true;
		if (!this.aBoolean72 && oo.a(false, this.anIDirect3DIndexBuffer1.Lock(0, this.anInt983, local16 ? 8192 : 0, this.aClass65_Sub2_Sub1_2.aGeometryBuffer1))) {
			this.aBoolean72 = true;
			return this.aClass65_Sub2_Sub1_2.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!caa", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method903() {
		if (this.aBoolean72 && oo.a(false, this.anIDirect3DIndexBuffer1.Unlock())) {
			this.aBoolean72 = false;
			return true;
		} else {
			return false;
		}
	}
}
