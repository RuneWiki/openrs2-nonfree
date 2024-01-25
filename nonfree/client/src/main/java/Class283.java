import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.wu;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class283 implements Interface18 {

	@OriginalMember(owner = "client!te", name = "b", descriptor = "I")
	private int anInt8540;

	@OriginalMember(owner = "client!te", name = "c", descriptor = "I")
	private int anInt8541;

	@OriginalMember(owner = "client!te", name = "f", descriptor = "Lclient!jagdx/IDirect3DIndexBuffer;")
	public IDirect3DIndexBuffer anIDirect3DIndexBuffer1;

	@OriginalMember(owner = "client!te", name = "d", descriptor = "Z")
	private boolean aBoolean606 = false;

	@OriginalMember(owner = "client!te", name = "e", descriptor = "Lclient!bv;")
	private final Class42_Sub1_Sub1 aClass42_Sub1_Sub1_7;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "Z")
	private final boolean aBoolean605;

	@OriginalMember(owner = "client!te", name = "g", descriptor = "Lclient!ge;")
	private final Class114 aClass114_19;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lclient!bv;Lclient!ge;Z)V")
	public Class283(@OriginalArg(0) Class42_Sub1_Sub1 arg0, @OriginalArg(1) Class114 arg1, @OriginalArg(2) boolean arg2) {
		this.aClass42_Sub1_Sub1_7 = arg0;
		this.aBoolean605 = arg2;
		this.aClass114_19 = arg1;
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7899() {
		if (this.aBoolean606 && wu.a(this.anIDirect3DIndexBuffer1.Unlock(), (byte) -103)) {
			this.aBoolean606 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(II)V")
	@Override
	public void method7529(@OriginalArg(1) int arg0) {
		this.anInt8541 = arg0 * this.aClass114_19.anInt3379;
		if (this.anInt8541 <= this.anInt8540) {
			return;
		}
		@Pc(21) short local21 = 8;
		@Pc(26) byte local26;
		if (this.aBoolean605) {
			local26 = 0;
			local21 = 520;
		} else {
			local26 = 1;
		}
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.a((byte) 123);
		}
		this.anIDirect3DIndexBuffer1 = this.aClass42_Sub1_Sub1_7.anIDirect3DDevice1.a(this.anInt8541, local21, this.aClass114_19 == Static155.aClass114_7 ? 101 : 102, local26, (IDirect3DIndexBuffer) this.anIDirect3DIndexBuffer1);
		this.anInt8540 = this.anInt8541;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method7895() {
		@Pc(4) boolean local4 = this.aBoolean605 & true;
		if (!this.aBoolean606 && wu.a(this.anIDirect3DIndexBuffer1.Lock(0, this.anInt8540, local4 ? 8192 : 0, this.aClass42_Sub1_Sub1_7.aGeometryBuffer1), (byte) 21)) {
			this.aBoolean606 = true;
			return this.aClass42_Sub1_Sub1_7.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(I)Lclient!ge;")
	@Override
	public Class114 method7540() {
		return this.aClass114_19;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(I)I")
	@Override
	public int method7894() {
		return this.anInt8541;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(B)V")
	@Override
	public void method7898() {
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.a((byte) -44);
			this.anIDirect3DIndexBuffer1 = null;
		}
		this.anInt8540 = 0;
		this.anInt8541 = 0;
	}
}
