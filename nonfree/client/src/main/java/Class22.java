import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.mk;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!as")
public final class Class22 implements Interface4 {

	@OriginalMember(owner = "client!as", name = "b", descriptor = "I")
	private int anInt445;

	@OriginalMember(owner = "client!as", name = "e", descriptor = "I")
	private int anInt446;

	@OriginalMember(owner = "client!as", name = "f", descriptor = "Lclient!jagdx/IDirect3DIndexBuffer;")
	public IDirect3DIndexBuffer anIDirect3DIndexBuffer1;

	@OriginalMember(owner = "client!as", name = "g", descriptor = "Z")
	private boolean aBoolean34 = false;

	@OriginalMember(owner = "client!as", name = "c", descriptor = "Lclient!bja;")
	private final Class36 aClass36_1;

	@OriginalMember(owner = "client!as", name = "d", descriptor = "Lclient!ta;")
	private final Class137_Sub1_Sub2 aClass137_Sub1_Sub2_1;

	@OriginalMember(owner = "client!as", name = "a", descriptor = "Z")
	private final boolean aBoolean33;

	@OriginalMember(owner = "client!as", name = "<init>", descriptor = "(Lclient!ta;Lclient!bja;Z)V")
	public Class22(@OriginalArg(0) Class137_Sub1_Sub2 arg0, @OriginalArg(1) Class36 arg1, @OriginalArg(2) boolean arg2) {
		this.aClass36_1 = arg1;
		this.aClass137_Sub1_Sub2_1 = arg0;
		this.aBoolean33 = arg2;
	}

	@OriginalMember(owner = "client!as", name = "b", descriptor = "(B)V")
	@Override
	public void method5675() {
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.a(29036);
			this.anIDirect3DIndexBuffer1 = null;
		}
		this.anInt446 = 0;
		this.anInt445 = 0;
	}

	@OriginalMember(owner = "client!as", name = "b", descriptor = "(I)I")
	@Override
	public int method5669() {
		return this.anInt445;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5682() {
		if (this.aBoolean34 && mk.b(this.anIDirect3DIndexBuffer1.Unlock(), -1)) {
			this.aBoolean34 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(II)V")
	@Override
	public void method5678(@OriginalArg(0) int arg0) {
		this.anInt445 = this.aClass36_1.anInt1130 * arg0;
		if (this.anInt446 >= this.anInt445) {
			return;
		}
		@Pc(17) short local17 = 8;
		@Pc(26) byte local26;
		if (this.aBoolean33) {
			local17 = 520;
			local26 = 0;
		} else {
			local26 = 1;
		}
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.a(29036);
		}
		this.anIDirect3DIndexBuffer1 = this.aClass137_Sub1_Sub2_1.anIDirect3DDevice1.a(this.anInt445, local17, this.aClass36_1 == Static47.aClass36_6 ? 101 : 102, local26, (IDirect3DIndexBuffer) this.anIDirect3DIndexBuffer1);
		this.anInt446 = this.anInt445;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(B)Lclient!bja;")
	@Override
	public Class36 method5681() {
		return this.aClass36_1;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(BZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method5680() {
		if (this.anIDirect3DIndexBuffer1 == null) {
			return null;
		}
		@Pc(17) boolean local17 = this.aBoolean33 & true;
		if (!this.aBoolean34 && mk.b(this.anIDirect3DIndexBuffer1.Lock(0, this.anInt446, local17 ? 8192 : 0, this.aClass137_Sub1_Sub2_1.aGeometryBuffer1), -1)) {
			this.aBoolean34 = true;
			return this.aClass137_Sub1_Sub2_1.aGeometryBuffer1;
		} else {
			return null;
		}
	}
}
