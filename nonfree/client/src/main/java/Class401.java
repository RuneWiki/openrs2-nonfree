import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.ala;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public final class Class401 implements Interface5 {

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "I")
	private int anInt11079;

	@OriginalMember(owner = "client!wh", name = "g", descriptor = "Lclient!jagdx/IDirect3DIndexBuffer;")
	public IDirect3DIndexBuffer anIDirect3DIndexBuffer1;

	@OriginalMember(owner = "client!wh", name = "f", descriptor = "I")
	private int anInt11080;

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "Z")
	private boolean aBoolean799 = false;

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "Lclient!ns;")
	private final Class261 aClass261_19;

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "Lclient!de;")
	private final Class67_Sub1_Sub1 aClass67_Sub1_Sub1_9;

	@OriginalMember(owner = "client!wh", name = "e", descriptor = "Z")
	private final boolean aBoolean800;

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lclient!de;Lclient!ns;Z)V")
	public Class401(@OriginalArg(0) Class67_Sub1_Sub1 arg0, @OriginalArg(1) Class261 arg1, @OriginalArg(2) boolean arg2) {
		this.aClass261_19 = arg1;
		this.aClass67_Sub1_Sub1_9 = arg0;
		this.aBoolean800 = arg2;
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(Z)Lclient!ns;")
	@Override
	public Class261 method9251() {
		return this.aClass261_19;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method9250() {
		if (this.aBoolean799 && ala.a(this.anIDirect3DIndexBuffer1.Unlock(), -1)) {
			this.aBoolean799 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method9252() {
		if (this.anIDirect3DIndexBuffer1 == null) {
			return null;
		}
		@Pc(12) boolean local12 = this.aBoolean800 & true;
		if (!this.aBoolean799 && ala.a(this.anIDirect3DIndexBuffer1.Lock(0, this.anInt11080, local12 ? 8192 : 0, this.aClass67_Sub1_Sub1_9.aGeometryBuffer1), -1)) {
			this.aBoolean799 = true;
			return this.aClass67_Sub1_Sub1_9.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Z)V")
	@Override
	public void method9249() {
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.b((byte) 101);
			this.anIDirect3DIndexBuffer1 = null;
		}
		this.anInt11080 = 0;
		this.anInt11079 = 0;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)I")
	@Override
	public int method9247() {
		return this.anInt11079;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)V")
	@Override
	public void method9248(@OriginalArg(0) int arg0) {
		this.anInt11079 = arg0 * this.aClass261_19.anInt7631;
		if (this.anInt11079 <= this.anInt11080) {
			return;
		}
		@Pc(28) short local28 = 8;
		@Pc(33) byte local33;
		if (this.aBoolean800) {
			local33 = 0;
			local28 = 520;
		} else {
			local33 = 1;
		}
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.b((byte) 92);
		}
		this.anIDirect3DIndexBuffer1 = this.aClass67_Sub1_Sub1_9.anIDirect3DDevice1.a(this.anInt11079, local28, Static438.aClass261_15 == this.aClass261_19 ? 101 : 102, local33, (IDirect3DIndexBuffer) this.anIDirect3DIndexBuffer1);
		this.anInt11080 = this.anInt11079;
	}
}
