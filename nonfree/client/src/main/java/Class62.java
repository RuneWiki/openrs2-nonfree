import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.uo;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ci")
public final class Class62 implements Interface15 {

	@OriginalMember(owner = "client!ci", name = "f", descriptor = "Lclient!jagdx/IDirect3DIndexBuffer;")
	public IDirect3DIndexBuffer anIDirect3DIndexBuffer1;

	@OriginalMember(owner = "client!ci", name = "e", descriptor = "I")
	private int anInt1427;

	@OriginalMember(owner = "client!ci", name = "g", descriptor = "I")
	private int anInt1428;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "Z")
	private boolean aBoolean153 = false;

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "Lclient!hk;")
	private final Class158 aClass158_3;

	@OriginalMember(owner = "client!ci", name = "d", descriptor = "Z")
	private final boolean aBoolean152;

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "Lclient!wu;")
	private final Class145_Sub1_Sub2 aClass145_Sub1_Sub2_4;

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Lclient!wu;Lclient!hk;Z)V")
	public Class62(@OriginalArg(0) Class145_Sub1_Sub2 arg0, @OriginalArg(1) Class158 arg1, @OriginalArg(2) boolean arg2) {
		this.aClass158_3 = arg1;
		this.aBoolean152 = arg2;
		this.aClass145_Sub1_Sub2_4 = arg0;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(II)V")
	@Override
	public void method9224(@OriginalArg(0) int arg0) {
		this.anInt1427 = this.aClass158_3.anInt3816 * arg0;
		if (this.anInt1428 >= this.anInt1427) {
			return;
		}
		@Pc(21) short local21 = 8;
		@Pc(30) byte local30;
		if (this.aBoolean152) {
			local21 = 520;
			local30 = 0;
		} else {
			local30 = 1;
		}
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.b((byte) -59);
		}
		this.anIDirect3DIndexBuffer1 = this.aClass145_Sub1_Sub2_4.anIDirect3DDevice1.a(this.anInt1427, local21, this.aClass158_3 == Static243.aClass158_11 ? 101 : 102, local30, (IDirect3DIndexBuffer) this.anIDirect3DIndexBuffer1);
		this.anInt1428 = this.anInt1427;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)V")
	@Override
	public void method9218() {
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.b((byte) 110);
			this.anIDirect3DIndexBuffer1 = null;
		}
		this.anInt1428 = 0;
		this.anInt1427 = 0;
	}

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method4691() {
		if (this.aBoolean153 && uo.a(this.anIDirect3DIndexBuffer1.Unlock(), true)) {
			this.aBoolean153 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method4689() {
		if (this.anIDirect3DIndexBuffer1 == null) {
			return null;
		}
		@Pc(21) boolean local21 = this.aBoolean152 & true;
		if (!this.aBoolean153 && uo.a(this.anIDirect3DIndexBuffer1.Lock(0, this.anInt1428, local21 ? 8192 : 0, this.aClass145_Sub1_Sub2_4.aGeometryBuffer1), true)) {
			this.aBoolean153 = true;
			return this.aClass145_Sub1_Sub2_4.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)I")
	@Override
	public int method9217() {
		return this.anInt1427;
	}

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "(I)Lclient!hk;")
	@Override
	public Class158 method4690() {
		return this.aClass158_3;
	}
}
