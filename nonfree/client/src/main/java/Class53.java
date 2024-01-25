import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.bea;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ch")
public final class Class53 implements Interface20 {

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "I")
	private int anInt1103;

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "Lclient!jagdx/IDirect3DIndexBuffer;")
	public IDirect3DIndexBuffer anIDirect3DIndexBuffer1;

	@OriginalMember(owner = "client!ch", name = "f", descriptor = "I")
	private int anInt1104;

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "Z")
	private boolean aBoolean86 = false;

	@OriginalMember(owner = "client!ch", name = "d", descriptor = "Z")
	private final boolean aBoolean87;

	@OriginalMember(owner = "client!ch", name = "g", descriptor = "Lclient!tb;")
	private final Class134_Sub1_Sub2 aClass134_Sub1_Sub2_2;

	@OriginalMember(owner = "client!ch", name = "e", descriptor = "Lclient!ig;")
	private final Class155 aClass155_3;

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(Lclient!tb;Lclient!ig;Z)V")
	public Class53(@OriginalArg(0) Class134_Sub1_Sub2 arg0, @OriginalArg(1) Class155 arg1, @OriginalArg(2) boolean arg2) {
		this.aBoolean87 = arg2;
		this.aClass134_Sub1_Sub2_2 = arg0;
		this.aClass155_3 = arg1;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method7387() {
		if (this.anIDirect3DIndexBuffer1 == null) {
			return null;
		}
		@Pc(18) boolean local18 = this.aBoolean87 & true;
		if (!this.aBoolean86 && bea.a(1, this.anIDirect3DIndexBuffer1.Lock(0, this.anInt1104, local18 ? 8192 : 0, this.aClass134_Sub1_Sub2_2.aGeometryBuffer1))) {
			this.aBoolean86 = true;
			return this.aClass134_Sub1_Sub2_2.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(B)I")
	@Override
	public int method7374() {
		return this.anInt1103;
	}

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7389() {
		if (this.aBoolean86 && bea.a(-72, this.anIDirect3DIndexBuffer1.Unlock())) {
			this.aBoolean86 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)V")
	@Override
	public void method7376(@OriginalArg(1) int arg0) {
		this.anInt1103 = arg0 * this.aClass155_3.anInt4123;
		if (this.anInt1104 >= this.anInt1103) {
			return;
		}
		@Pc(26) short local26 = 8;
		@Pc(31) byte local31;
		if (this.aBoolean87) {
			local31 = 0;
			local26 = 520;
		} else {
			local31 = 1;
		}
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.a((byte) -80);
		}
		this.anIDirect3DIndexBuffer1 = this.aClass134_Sub1_Sub2_2.anIDirect3DDevice1.a(this.anInt1103, local26, Static215.aClass155_11 == this.aClass155_3 ? 101 : 102, local31, (IDirect3DIndexBuffer) this.anIDirect3DIndexBuffer1);
		this.anInt1104 = this.anInt1103;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V")
	@Override
	public void method7384() {
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.a((byte) -80);
			this.anIDirect3DIndexBuffer1 = null;
		}
		this.anInt1103 = 0;
		this.anInt1104 = 0;
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(I)Lclient!ig;")
	@Override
	public Class155 method7388() {
		return this.aClass155_3;
	}
}
