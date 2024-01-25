import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.ck;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vg")
public final class Class377 implements Interface25 {

	@OriginalMember(owner = "client!vg", name = "c", descriptor = "I")
	private int anInt9982;

	@OriginalMember(owner = "client!vg", name = "f", descriptor = "I")
	private int anInt9983;

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "Lclient!jagdx/IDirect3DIndexBuffer;")
	public IDirect3DIndexBuffer anIDirect3DIndexBuffer1;

	@OriginalMember(owner = "client!vg", name = "e", descriptor = "Z")
	private boolean aBoolean736 = false;

	@OriginalMember(owner = "client!vg", name = "g", descriptor = "Lclient!os;")
	private final Class75_Sub1_Sub2 aClass75_Sub1_Sub2_9;

	@OriginalMember(owner = "client!vg", name = "d", descriptor = "Z")
	private final boolean aBoolean737;

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "Lclient!on;")
	private final Class274 aClass274_19;

	@OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(Lclient!os;Lclient!on;Z)V")
	public Class377(@OriginalArg(0) Class75_Sub1_Sub2 arg0, @OriginalArg(1) Class274 arg1, @OriginalArg(2) boolean arg2) {
		this.aClass75_Sub1_Sub2_9 = arg0;
		this.aBoolean737 = arg2;
		this.aClass274_19 = arg1;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(BZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method8677() {
		if (this.anIDirect3DIndexBuffer1 == null) {
			return null;
		}
		@Pc(18) boolean local18 = this.aBoolean737 & true;
		if (!this.aBoolean736 && ck.a(this.anIDirect3DIndexBuffer1.Lock(0, this.anInt9983, local18 ? 8192 : 0, this.aClass75_Sub1_Sub2_9.aGeometryBuffer1), -1)) {
			this.aBoolean736 = true;
			return this.aClass75_Sub1_Sub2_9.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)V")
	@Override
	public void method8679(@OriginalArg(0) int arg0) {
		this.anInt9982 = arg0 * this.aClass274_19.anInt7437;
		if (this.anInt9983 >= this.anInt9982) {
			return;
		}
		@Pc(28) short local28 = 8;
		@Pc(33) byte local33;
		if (this.aBoolean737) {
			local33 = 0;
			local28 = 520;
		} else {
			local33 = 1;
		}
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.a(true);
		}
		this.anIDirect3DIndexBuffer1 = this.aClass75_Sub1_Sub2_9.anIDirect3DDevice1.a(this.anInt9982, local28, this.aClass274_19 == Static435.aClass274_14 ? 101 : 102, local33, (IDirect3DIndexBuffer) this.anIDirect3DIndexBuffer1);
		this.anInt9983 = this.anInt9982;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Z)V")
	@Override
	public void method8675() {
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.a(true);
			this.anIDirect3DIndexBuffer1 = null;
		}
		this.anInt9983 = 0;
		this.anInt9982 = 0;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)Lclient!on;")
	@Override
	public Class274 method8678() {
		return this.aClass274_19;
	}

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method8676() {
		if (this.aBoolean736 && ck.a(this.anIDirect3DIndexBuffer1.Unlock(), -1)) {
			this.aBoolean736 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "(I)I")
	@Override
	public int method8674() {
		return this.anInt9982;
	}
}
