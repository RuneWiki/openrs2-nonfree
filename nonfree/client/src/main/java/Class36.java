import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.aq;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bha")
public final class Class36 implements Interface6 {

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "B")
	private byte aByte5;

	@OriginalMember(owner = "client!bha", name = "b", descriptor = "Lclient!jagdx/IDirect3DVertexBuffer;")
	public IDirect3DVertexBuffer anIDirect3DVertexBuffer1;

	@OriginalMember(owner = "client!bha", name = "d", descriptor = "I")
	private int anInt614;

	@OriginalMember(owner = "client!bha", name = "e", descriptor = "I")
	private int anInt615;

	@OriginalMember(owner = "client!bha", name = "c", descriptor = "Z")
	private boolean aBoolean29 = false;

	@OriginalMember(owner = "client!bha", name = "f", descriptor = "Lclient!ki;")
	private final Class143_Sub1_Sub1 aClass143_Sub1_Sub1_1;

	@OriginalMember(owner = "client!bha", name = "g", descriptor = "Z")
	private final boolean aBoolean30;

	@OriginalMember(owner = "client!bha", name = "<init>", descriptor = "(Lclient!ki;Z)V")
	public Class36(@OriginalArg(0) Class143_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		this.aClass143_Sub1_Sub1_1 = arg0;
		this.aBoolean30 = arg1;
	}

	@OriginalMember(owner = "client!bha", name = "c", descriptor = "(B)I")
	@Override
	public int method7861() {
		return this.anInt614;
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(I)I")
	public int method590() {
		return this.aByte5;
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(IZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method3120() {
		if (this.anIDirect3DVertexBuffer1 == null) {
			return null;
		}
		@Pc(10) boolean local10 = this.aBoolean30 & true;
		if (!this.aBoolean29 && aq.b(this.anIDirect3DVertexBuffer1.Lock(0, this.anInt615, local10 ? 8192 : 0, this.aClass143_Sub1_Sub1_1.aGeometryBuffer1), -44)) {
			this.aBoolean29 = true;
			return this.aClass143_Sub1_Sub1_1.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(IIILclient!jaclib/memory/Source;)Z")
	@Override
	public boolean method3122(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Source arg2) {
		return this.method3123(arg1, arg0) ? this.anIDirect3DVertexBuffer1.a(arg2, 0, 0, this.anInt614, this.aBoolean30 ? 8192 : 0) : false;
	}

	@OriginalMember(owner = "client!bha", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method3121() {
		if (this.aBoolean29 && aq.b(this.anIDirect3DVertexBuffer1.Unlock(), -125)) {
			this.aBoolean29 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(III)Z")
	@Override
	public boolean method3123(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt614 = arg0;
		this.aByte5 = (byte) arg1;
		if (this.anInt615 < this.anInt614) {
			@Pc(23) short local23 = 8;
			@Pc(28) byte local28;
			if (this.aBoolean30) {
				local28 = 0;
				local23 = 520;
			} else {
				local28 = 1;
			}
			if (this.anIDirect3DVertexBuffer1 != null) {
				this.anIDirect3DVertexBuffer1.a(false);
			}
			this.anIDirect3DVertexBuffer1 = this.aClass143_Sub1_Sub1_1.anIDirect3DDevice1.a(this.anInt614, local23, 0, local28, (IDirect3DVertexBuffer) this.anIDirect3DVertexBuffer1);
			this.anInt615 = this.anInt614;
		}
		return this.anIDirect3DVertexBuffer1 != null;
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(B)V")
	@Override
	public void method7866() {
		if (this.anIDirect3DVertexBuffer1 != null) {
			this.anIDirect3DVertexBuffer1.a(false);
			this.anIDirect3DVertexBuffer1 = null;
		}
		this.anInt615 = 0;
		this.anInt614 = 0;
	}
}
