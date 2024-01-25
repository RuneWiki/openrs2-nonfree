import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.eo;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vk")
public final class Class345 implements Interface6 {

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "I")
	private int anInt10190;

	@OriginalMember(owner = "client!vk", name = "d", descriptor = "I")
	private int anInt10191;

	@OriginalMember(owner = "client!vk", name = "f", descriptor = "Lclient!jagdx/IDirect3DIndexBuffer;")
	public IDirect3DIndexBuffer anIDirect3DIndexBuffer1;

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "Z")
	private boolean aBoolean700 = false;

	@OriginalMember(owner = "client!vk", name = "c", descriptor = "Lclient!qda;")
	private final Class273 aClass273_19;

	@OriginalMember(owner = "client!vk", name = "g", descriptor = "Lclient!oe;")
	private final Class7_Sub1_Sub2 aClass7_Sub1_Sub2_9;

	@OriginalMember(owner = "client!vk", name = "e", descriptor = "Z")
	private final boolean aBoolean701;

	@OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Lclient!oe;Lclient!qda;Z)V")
	public Class345(@OriginalArg(0) Class7_Sub1_Sub2 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) boolean arg2) {
		this.aClass273_19 = arg1;
		this.aClass7_Sub1_Sub2_9 = arg0;
		this.aBoolean701 = arg2;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(BZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method7935() {
		if (this.anIDirect3DIndexBuffer1 == null) {
			return null;
		}
		@Pc(10) boolean local10 = this.aBoolean701 & true;
		if (!this.aBoolean700 && eo.a(-127, this.anIDirect3DIndexBuffer1.Lock(0, this.anInt10191, local10 ? 8192 : 0, this.aClass7_Sub1_Sub2_9.aGeometryBuffer1))) {
			this.aBoolean700 = true;
			return this.aClass7_Sub1_Sub2_9.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)Lclient!qda;")
	@Override
	public Class273 method7934() {
		return this.aClass273_19;
	}

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7936() {
		if (this.aBoolean700 && eo.a(64, this.anIDirect3DIndexBuffer1.Unlock())) {
			this.aBoolean700 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(B)V")
	@Override
	public void method7925() {
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.b((byte) -6);
			this.anIDirect3DIndexBuffer1 = null;
		}
		this.anInt10190 = 0;
		this.anInt10191 = 0;
	}

	@OriginalMember(owner = "client!vk", name = "c", descriptor = "(I)I")
	@Override
	public int method7923() {
		return this.anInt10190;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(II)V")
	@Override
	public void method7932(@OriginalArg(1) int arg0) {
		this.anInt10190 = this.aClass273_19.anInt8146 * arg0;
		if (this.anInt10191 >= this.anInt10190) {
			return;
		}
		@Pc(20) short local20 = 8;
		@Pc(25) byte local25;
		if (this.aBoolean701) {
			local25 = 0;
			local20 = 520;
		} else {
			local25 = 1;
		}
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.b((byte) -6);
		}
		this.anIDirect3DIndexBuffer1 = this.aClass7_Sub1_Sub2_9.anIDirect3DDevice1.a(this.anInt10190, local20, this.aClass273_19 == Static424.aClass273_13 ? 101 : 102, local25, (IDirect3DIndexBuffer) this.anIDirect3DIndexBuffer1);
		this.anInt10191 = this.anInt10190;
	}
}
