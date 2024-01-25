import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.aq;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!to")
public final class Class342 implements Interface16 {

	@OriginalMember(owner = "client!to", name = "a", descriptor = "Lclient!jagdx/IDirect3DIndexBuffer;")
	public IDirect3DIndexBuffer anIDirect3DIndexBuffer1;

	@OriginalMember(owner = "client!to", name = "b", descriptor = "I")
	private int anInt9396;

	@OriginalMember(owner = "client!to", name = "d", descriptor = "I")
	private int anInt9397;

	@OriginalMember(owner = "client!to", name = "g", descriptor = "Z")
	private boolean aBoolean685 = false;

	@OriginalMember(owner = "client!to", name = "e", descriptor = "Lclient!ki;")
	private final Class143_Sub1_Sub1 aClass143_Sub1_Sub1_6;

	@OriginalMember(owner = "client!to", name = "f", descriptor = "Lclient!kn;")
	private final Class206 aClass206_20;

	@OriginalMember(owner = "client!to", name = "c", descriptor = "Z")
	private final boolean aBoolean684;

	@OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lclient!ki;Lclient!kn;Z)V")
	public Class342(@OriginalArg(0) Class143_Sub1_Sub1 arg0, @OriginalArg(1) Class206 arg1, @OriginalArg(2) boolean arg2) {
		this.aClass143_Sub1_Sub1_6 = arg0;
		this.aClass206_20 = arg1;
		this.aBoolean684 = arg2;
	}

	@OriginalMember(owner = "client!to", name = "b", descriptor = "(B)Lclient!kn;")
	@Override
	public Class206 method7865() {
		return this.aClass206_20;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(B)V")
	@Override
	public void method7866() {
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.a(false);
			this.anIDirect3DIndexBuffer1 = null;
		}
		this.anInt9396 = 0;
		this.anInt9397 = 0;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(BZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method7864() {
		if (this.anIDirect3DIndexBuffer1 == null) {
			return null;
		}
		@Pc(16) boolean local16 = this.aBoolean684 & true;
		if (!this.aBoolean685 && aq.b(this.anIDirect3DIndexBuffer1.Lock(0, this.anInt9396, local16 ? 8192 : 0, this.aClass143_Sub1_Sub1_6.aGeometryBuffer1), -128)) {
			this.aBoolean685 = true;
			return this.aClass143_Sub1_Sub1_6.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7862() {
		if (this.aBoolean685 && aq.b(this.anIDirect3DIndexBuffer1.Unlock(), -116)) {
			this.aBoolean685 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7863(@OriginalArg(1) int arg0) {
		this.anInt9397 = arg0 * this.aClass206_20.anInt5575;
		if (this.anInt9396 >= this.anInt9397) {
			return;
		}
		@Pc(19) short local19 = 8;
		@Pc(24) byte local24;
		if (this.aBoolean684) {
			local19 = 520;
			local24 = 0;
		} else {
			local24 = 1;
		}
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.a(false);
		}
		this.anIDirect3DIndexBuffer1 = this.aClass143_Sub1_Sub1_6.anIDirect3DDevice1.a(this.anInt9397, local19, this.aClass206_20 == Static314.aClass206_13 ? 101 : 102, local24, (IDirect3DIndexBuffer) this.anIDirect3DIndexBuffer1);
		this.anInt9396 = this.anInt9397;
	}

	@OriginalMember(owner = "client!to", name = "c", descriptor = "(B)I")
	@Override
	public int method7861() {
		return this.anInt9397;
	}
}
