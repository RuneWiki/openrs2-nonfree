import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.qi;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rl")
public final class Class294 implements Interface13 {

	@OriginalMember(owner = "client!rl", name = "d", descriptor = "I")
	private int anInt7737;

	@OriginalMember(owner = "client!rl", name = "f", descriptor = "Lclient!jagdx/IDirect3DIndexBuffer;")
	public IDirect3DIndexBuffer anIDirect3DIndexBuffer1;

	@OriginalMember(owner = "client!rl", name = "g", descriptor = "I")
	private int anInt7738;

	@OriginalMember(owner = "client!rl", name = "e", descriptor = "Z")
	private boolean aBoolean605 = false;

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "Z")
	private final boolean aBoolean604;

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "Lclient!eda;")
	private final Class45_Sub2_Sub1 aClass45_Sub2_Sub1_7;

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "Lclient!rt;")
	private final Class298 aClass298_11;

	@OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(Lclient!eda;Lclient!rt;Z)V")
	public Class294(@OriginalArg(0) Class45_Sub2_Sub1 arg0, @OriginalArg(1) Class298 arg1, @OriginalArg(2) boolean arg2) {
		this.aBoolean604 = arg2;
		this.aClass45_Sub2_Sub1_7 = arg0;
		this.aClass298_11 = arg1;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)I")
	@Override
	public int method6432() {
		return this.anInt7738;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(B)Lclient!rt;")
	@Override
	public Class298 method6434() {
		return this.aClass298_11;
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method6433() {
		if (this.aBoolean605 && qi.a((byte) 35, this.anIDirect3DIndexBuffer1.Unlock())) {
			this.aBoolean605 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IB)V")
	@Override
	public void method6435(@OriginalArg(0) int arg0) {
		this.anInt7738 = this.aClass298_11.anInt7812 * arg0;
		if (this.anInt7738 <= this.anInt7737) {
			return;
		}
		@Pc(19) short local19 = 8;
		@Pc(24) byte local24;
		if (this.aBoolean604) {
			local24 = 0;
			local19 = 520;
		} else {
			local24 = 1;
		}
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.b(-127);
		}
		this.anIDirect3DIndexBuffer1 = this.aClass45_Sub2_Sub1_7.anIDirect3DDevice1.a(this.anInt7738, local19, Static471.aClass298_16 == this.aClass298_11 ? 101 : 102, local24, (IDirect3DIndexBuffer) this.anIDirect3DIndexBuffer1);
		this.anInt7737 = this.anInt7738;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method6437() {
		if (this.anIDirect3DIndexBuffer1 == null) {
			return null;
		}
		@Pc(17) boolean local17 = this.aBoolean604 & true;
		if (!this.aBoolean605 && qi.a((byte) 35, this.anIDirect3DIndexBuffer1.Lock(0, this.anInt7737, local17 ? 8192 : 0, this.aClass45_Sub2_Sub1_7.aGeometryBuffer1))) {
			this.aBoolean605 = true;
			return this.aClass45_Sub2_Sub1_7.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(B)V")
	@Override
	public void method6436() {
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.b(-127);
			this.anIDirect3DIndexBuffer1 = null;
		}
		this.anInt7737 = 0;
		this.anInt7738 = 0;
	}
}
