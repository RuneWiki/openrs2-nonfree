import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.gfa;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ufa")
public final class Class335 implements Interface13 {

	@OriginalMember(owner = "client!ufa", name = "c", descriptor = "I")
	private int anInt8827;

	@OriginalMember(owner = "client!ufa", name = "e", descriptor = "I")
	private int anInt8828;

	@OriginalMember(owner = "client!ufa", name = "g", descriptor = "Lclient!jagdx/IDirect3DIndexBuffer;")
	public IDirect3DIndexBuffer anIDirect3DIndexBuffer1;

	@OriginalMember(owner = "client!ufa", name = "d", descriptor = "Z")
	private boolean aBoolean750 = false;

	@OriginalMember(owner = "client!ufa", name = "b", descriptor = "Lclient!bk;")
	private final Class35 aClass35_16;

	@OriginalMember(owner = "client!ufa", name = "f", descriptor = "Lclient!ik;")
	private final Class162_Sub1_Sub1 aClass162_Sub1_Sub1_8;

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "Z")
	private final boolean aBoolean749;

	@OriginalMember(owner = "client!ufa", name = "<init>", descriptor = "(Lclient!ik;Lclient!bk;Z)V")
	public Class335(@OriginalArg(0) Class162_Sub1_Sub1 arg0, @OriginalArg(1) Class35 arg1, @OriginalArg(2) boolean arg2) {
		this.aClass35_16 = arg1;
		this.aClass162_Sub1_Sub1_8 = arg0;
		this.aBoolean749 = arg2;
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(II)V")
	@Override
	public void method7035(@OriginalArg(0) int arg0) {
		this.anInt8827 = arg0 * this.aClass35_16.anInt776;
		if (this.anInt8828 >= this.anInt8827) {
			return;
		}
		@Pc(14) short local14 = 8;
		@Pc(19) byte local19;
		if (this.aBoolean749) {
			local19 = 0;
			local14 = 520;
		} else {
			local19 = 1;
		}
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.b((byte) 62);
		}
		this.anIDirect3DIndexBuffer1 = this.aClass162_Sub1_Sub1_8.anIDirect3DDevice1.a(this.anInt8827, local14, this.aClass35_16 == Static42.aClass35_5 ? 101 : 102, local19, (IDirect3DIndexBuffer) this.anIDirect3DIndexBuffer1);
		this.anInt8828 = this.anInt8827;
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(Z)I")
	@Override
	public int method7030() {
		return this.anInt8827;
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(BZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method7034() {
		if (this.anIDirect3DIndexBuffer1 == null) {
			return null;
		}
		@Pc(9) boolean local9 = this.aBoolean749 & true;
		if (!this.aBoolean750 && gfa.a(this.anIDirect3DIndexBuffer1.Lock(0, this.anInt8828, local9 ? 8192 : 0, this.aClass162_Sub1_Sub1_8.aGeometryBuffer1), (int) 10067)) {
			this.aBoolean750 = true;
			return this.aClass162_Sub1_Sub1_8.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ufa", name = "c", descriptor = "(Z)Z")
	@Override
	public boolean method7033() {
		if (this.aBoolean750 && gfa.a(this.anIDirect3DIndexBuffer1.Unlock(), (int) 10067)) {
			this.aBoolean750 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(I)V")
	@Override
	public void method7032() {
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.b((byte) -111);
			this.anIDirect3DIndexBuffer1 = null;
		}
		this.anInt8827 = 0;
		this.anInt8828 = 0;
	}

	@OriginalMember(owner = "client!ufa", name = "b", descriptor = "(Z)Lclient!bk;")
	@Override
	public Class35 method7031() {
		return this.aClass35_16;
	}
}
