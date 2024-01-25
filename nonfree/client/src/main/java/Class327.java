import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.rl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tw")
public final class Class327 implements Interface17 {

	@OriginalMember(owner = "client!tw", name = "b", descriptor = "I")
	private int anInt8259;

	@OriginalMember(owner = "client!tw", name = "c", descriptor = "Lclient!jagdx/IDirect3DIndexBuffer;")
	public IDirect3DIndexBuffer anIDirect3DIndexBuffer1;

	@OriginalMember(owner = "client!tw", name = "g", descriptor = "I")
	private int anInt8260;

	@OriginalMember(owner = "client!tw", name = "e", descriptor = "Z")
	private boolean aBoolean638 = false;

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "Lclient!hg;")
	private final Class43_Sub1_Sub1 aClass43_Sub1_Sub1_9;

	@OriginalMember(owner = "client!tw", name = "f", descriptor = "Z")
	private final boolean aBoolean639;

	@OriginalMember(owner = "client!tw", name = "d", descriptor = "Lclient!ro;")
	private final Class292 aClass292_19;

	@OriginalMember(owner = "client!tw", name = "<init>", descriptor = "(Lclient!hg;Lclient!ro;Z)V")
	public Class327(@OriginalArg(0) Class43_Sub1_Sub1 arg0, @OriginalArg(1) Class292 arg1, @OriginalArg(2) boolean arg2) {
		this.aClass43_Sub1_Sub1_9 = arg0;
		this.aBoolean639 = arg2;
		this.aClass292_19 = arg1;
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(IB)V")
	@Override
	public void method6942(@OriginalArg(0) int arg0) {
		this.anInt8259 = arg0 * this.aClass292_19.anInt7532;
		if (this.anInt8260 >= this.anInt8259) {
			return;
		}
		@Pc(25) short local25 = 8;
		@Pc(30) byte local30;
		if (this.aBoolean639) {
			local30 = 0;
			local25 = 520;
		} else {
			local30 = 1;
		}
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.a((byte) -67);
		}
		this.anIDirect3DIndexBuffer1 = this.aClass43_Sub1_Sub1_9.anIDirect3DDevice1.a(this.anInt8259, local25, Static461.aClass292_15 == this.aClass292_19 ? 101 : 102, local30, (IDirect3DIndexBuffer) this.anIDirect3DIndexBuffer1);
		this.anInt8260 = this.anInt8259;
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(B)V")
	@Override
	public void method6939() {
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.a((byte) -67);
			this.anIDirect3DIndexBuffer1 = null;
		}
		this.anInt8260 = 0;
		this.anInt8259 = 0;
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(I)I")
	@Override
	public int method6937() {
		return this.anInt8259;
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6941() {
		if (this.aBoolean638 && rl.a(this.anIDirect3DIndexBuffer1.Unlock(), (int) 3102)) {
			this.aBoolean638 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!tw", name = "b", descriptor = "(B)Lclient!ro;")
	@Override
	public Class292 method6940() {
		return this.aClass292_19;
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(ZZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method6938() {
		if (this.anIDirect3DIndexBuffer1 == null) {
			return null;
		}
		@Pc(10) boolean local10 = this.aBoolean639 & true;
		if (!this.aBoolean638 && rl.a(this.anIDirect3DIndexBuffer1.Lock(0, this.anInt8260, local10 ? 8192 : 0, this.aClass43_Sub1_Sub1_9.aGeometryBuffer1), (int) 3102)) {
			this.aBoolean638 = true;
			return this.aClass43_Sub1_Sub1_9.aGeometryBuffer1;
		} else {
			return null;
		}
	}
}
