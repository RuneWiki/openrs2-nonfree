import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.raa;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!naa")
public final class Class237 implements Interface21 {

	@OriginalMember(owner = "client!naa", name = "c", descriptor = "I")
	private int anInt6471;

	@OriginalMember(owner = "client!naa", name = "d", descriptor = "Lclient!jagdx/IDirect3DIndexBuffer;")
	public IDirect3DIndexBuffer anIDirect3DIndexBuffer1;

	@OriginalMember(owner = "client!naa", name = "f", descriptor = "I")
	private int anInt6472;

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "Z")
	private boolean aBoolean536 = false;

	@OriginalMember(owner = "client!naa", name = "g", descriptor = "Lclient!mh;")
	private final Class126_Sub2_Sub2 aClass126_Sub2_Sub2_6;

	@OriginalMember(owner = "client!naa", name = "e", descriptor = "Lclient!ns;")
	private final Class247 aClass247_10;

	@OriginalMember(owner = "client!naa", name = "b", descriptor = "Z")
	private final boolean aBoolean537;

	@OriginalMember(owner = "client!naa", name = "<init>", descriptor = "(Lclient!mh;Lclient!ns;Z)V")
	public Class237(@OriginalArg(0) Class126_Sub2_Sub2 arg0, @OriginalArg(1) Class247 arg1, @OriginalArg(2) boolean arg2) {
		this.aClass126_Sub2_Sub2_6 = arg0;
		this.aClass247_10 = arg1;
		this.aBoolean537 = arg2;
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(IB)V")
	@Override
	public void method5732(@OriginalArg(0) int arg0) {
		this.anInt6471 = this.aClass247_10.anInt6763 * arg0;
		if (this.anInt6472 >= this.anInt6471) {
			return;
		}
		@Pc(24) short local24 = 8;
		@Pc(29) byte local29;
		if (this.aBoolean537) {
			local24 = 520;
			local29 = 0;
		} else {
			local29 = 1;
		}
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.a((byte) -111);
		}
		this.anIDirect3DIndexBuffer1 = this.aClass126_Sub2_Sub2_6.anIDirect3DDevice1.a(this.anInt6471, local24, this.aClass247_10 == Static385.aClass247_15 ? 101 : 102, local29, (IDirect3DIndexBuffer) this.anIDirect3DIndexBuffer1);
		this.anInt6472 = this.anInt6471;
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5734() {
		if (this.aBoolean536 && raa.a(this.anIDirect3DIndexBuffer1.Unlock(), (byte) 98)) {
			this.aBoolean536 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(IZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method5730() {
		if (this.anIDirect3DIndexBuffer1 == null) {
			return null;
		}
		@Pc(10) boolean local10 = this.aBoolean537 & true;
		if (!this.aBoolean536 && raa.a(this.anIDirect3DIndexBuffer1.Lock(0, this.anInt6472, local10 ? 8192 : 0, this.aClass126_Sub2_Sub2_6.aGeometryBuffer1), (byte) 122)) {
			this.aBoolean536 = true;
			return this.aClass126_Sub2_Sub2_6.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(Z)V")
	@Override
	public void method7716() {
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.a((byte) 109);
			this.anIDirect3DIndexBuffer1 = null;
		}
		this.anInt6471 = 0;
		this.anInt6472 = 0;
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(B)Lclient!ns;")
	@Override
	public Class247 method5733() {
		return this.aClass247_10;
	}

	@OriginalMember(owner = "client!naa", name = "b", descriptor = "(I)I")
	@Override
	public int method7713() {
		return this.anInt6471;
	}
}
