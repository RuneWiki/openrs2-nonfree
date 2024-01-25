import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.lg;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!su")
public final class Class321 implements Interface11 {

	@OriginalMember(owner = "client!su", name = "a", descriptor = "Lclient!jagdx/IDirect3DIndexBuffer;")
	public IDirect3DIndexBuffer anIDirect3DIndexBuffer1;

	@OriginalMember(owner = "client!su", name = "b", descriptor = "I")
	private int anInt8596;

	@OriginalMember(owner = "client!su", name = "c", descriptor = "I")
	private int anInt8597;

	@OriginalMember(owner = "client!su", name = "f", descriptor = "Z")
	private boolean aBoolean618 = false;

	@OriginalMember(owner = "client!su", name = "d", descriptor = "Lclient!ul;")
	private final Class13_Sub3_Sub2 aClass13_Sub3_Sub2_7;

	@OriginalMember(owner = "client!su", name = "e", descriptor = "Z")
	private final boolean aBoolean617;

	@OriginalMember(owner = "client!su", name = "g", descriptor = "Lclient!wha;")
	private final Class381 aClass381_9;

	@OriginalMember(owner = "client!su", name = "<init>", descriptor = "(Lclient!ul;Lclient!wha;Z)V")
	public Class321(@OriginalArg(0) Class13_Sub3_Sub2 arg0, @OriginalArg(1) Class381 arg1, @OriginalArg(2) boolean arg2) {
		this.aClass13_Sub3_Sub2_7 = arg0;
		this.aBoolean617 = arg2;
		this.aClass381_9 = arg1;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(B)V")
	@Override
	public void method8446() {
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.b((byte) -36);
			this.anIDirect3DIndexBuffer1 = null;
		}
		this.anInt8597 = 0;
		this.anInt8596 = 0;
	}

	@OriginalMember(owner = "client!su", name = "b", descriptor = "(I)I")
	@Override
	public int method8445() {
		return this.anInt8596;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method7409() {
		if (this.aBoolean618 && lg.b(this.anIDirect3DIndexBuffer1.Unlock(), 25499)) {
			this.aBoolean618 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(IZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method7405() {
		if (this.anIDirect3DIndexBuffer1 == null) {
			return null;
		}
		@Pc(10) boolean local10 = this.aBoolean617 & true;
		if (!this.aBoolean618 && lg.b(this.anIDirect3DIndexBuffer1.Lock(0, this.anInt8597, local10 ? 8192 : 0, this.aClass13_Sub3_Sub2_7.aGeometryBuffer1), 25499)) {
			this.aBoolean618 = true;
			return this.aClass13_Sub3_Sub2_7.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!su", name = "b", descriptor = "(B)Lclient!wha;")
	@Override
	public Class381 method7408() {
		return this.aClass381_9;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(II)V")
	@Override
	public void method7407(@OriginalArg(0) int arg0) {
		this.anInt8596 = this.aClass381_9.anInt10306 * arg0;
		if (this.anInt8597 >= this.anInt8596) {
			return;
		}
		@Pc(17) short local17 = 8;
		@Pc(22) byte local22;
		if (this.aBoolean617) {
			local22 = 0;
			local17 = 520;
		} else {
			local22 = 1;
		}
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.b((byte) -36);
		}
		this.anIDirect3DIndexBuffer1 = this.aClass13_Sub3_Sub2_7.anIDirect3DDevice1.a(this.anInt8596, local17, Static638.aClass381_16 == this.aClass381_9 ? 101 : 102, local22, (IDirect3DIndexBuffer) this.anIDirect3DIndexBuffer1);
		this.anInt8597 = this.anInt8596;
	}
}
